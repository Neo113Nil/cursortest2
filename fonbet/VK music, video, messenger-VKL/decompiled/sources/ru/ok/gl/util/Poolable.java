package ru.ok.gl.util;

import androidx.annotation.NonNull;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class Poolable<T> {
    private T next;

    public static final class Pool<T extends Poolable<T>> {
        private final Allocator<T> allocator;
        private T head;
        private final Lock lock;
        private final int maxSize;
        private int size;

        public interface Allocator<T extends Poolable<T>> {
            T allocate();
        }

        public Pool(int i, boolean z, @NonNull Allocator<T> allocator) {
            this.allocator = allocator;
            this.maxSize = i;
            this.lock = z ? new ReentrantLock() : null;
        }

        private void lock() {
            Lock lock = this.lock;
            if (lock != null) {
                lock.lock();
            }
        }

        private T pop() {
            lock();
            try {
                T t = this.head;
                if (t == null) {
                    return null;
                }
                this.head = (T) ((Poolable) t).next;
                ((Poolable) t).next = null;
                this.size--;
                return t;
            } finally {
                unlock();
            }
        }

        private void push(T t) {
            lock();
            try {
                if (this.size < this.maxSize && this.head != t && ((Poolable) t).next == null) {
                    ((Poolable) t).next = this.head;
                    this.head = t;
                    this.size++;
                }
            } finally {
                unlock();
            }
        }

        private void unlock() {
            Lock lock = this.lock;
            if (lock != null) {
                lock.unlock();
            }
        }

        public T obtain() {
            T pop = pop();
            return pop != null ? pop : this.allocator.allocate();
        }

        public void recycle(T t) {
            if (t != null) {
                t.recycle();
                push(t);
            }
        }
    }

    public void recycle() {
    }
}
