package org.chromium.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.chromium.base.ThreadUtils;

/* loaded from: classes11.dex */
public class ObserverList<E> implements Iterable<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int mCount;
    private int mIterationDepth;
    private boolean mNeedsCompact;
    public final List<E> mObservers = new ArrayList();
    private boolean mEnableThreadAsserts = true;
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();

    public class ObserverListIterator implements RewindableIterator<E> {
        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;

        public /* synthetic */ ObserverListIterator(ObserverList observerList, int i) {
            this();
        }

        private void compactListIfNeeded() {
            if (this.mIsExhausted) {
                return;
            }
            this.mIsExhausted = true;
            ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            ObserverList.this.assertSameThreadUsed();
            int i = this.mIndex;
            while (i < this.mListEndMarker && ObserverList.this.getObserverAt(i) == null) {
                i++;
            }
            if (i < this.mListEndMarker) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            ObserverList.this.assertSameThreadUsed();
            while (true) {
                int i = this.mIndex;
                if (i >= this.mListEndMarker || ObserverList.this.getObserverAt(i) != null) {
                    break;
                }
                this.mIndex++;
            }
            int i2 = this.mIndex;
            if (i2 >= this.mListEndMarker) {
                compactListIfNeeded();
                throw new NoSuchElementException();
            }
            ObserverList observerList = ObserverList.this;
            this.mIndex = i2 + 1;
            return (E) observerList.getObserverAt(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // org.chromium.base.ObserverList.RewindableIterator
        public void rewind() {
            ObserverList.this.assertSameThreadUsed();
            compactListIfNeeded();
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
            this.mIsExhausted = false;
            this.mIndex = 0;
        }

        private ObserverListIterator() {
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
        }
    }

    public interface RewindableIterator<E> extends Iterator<E> {
        void rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void assertSameThreadUsed() {
        if (this.mEnableThreadAsserts) {
            try {
                this.mThreadChecker.assertOnValidThread();
            } catch (AssertionError e) {
                throw new AssertionError("ObserverList is not thread-safe; Observers MUST be added, removed and will be notified on the thread that created the ObserverList.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int capacity() {
        return this.mObservers.size();
    }

    private void compact() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            if (this.mObservers.get(size) == null) {
                this.mObservers.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementIterationDepthAndCompactIfNeeded() {
        int i = this.mIterationDepth - 1;
        this.mIterationDepth = i;
        if (i <= 0 && this.mNeedsCompact) {
            this.mNeedsCompact = false;
            compact();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E getObserverAt(int i) {
        return this.mObservers.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementIterationDepth() {
        this.mIterationDepth++;
    }

    public boolean addObserver(E e) {
        assertSameThreadUsed();
        if (e == null || this.mObservers.contains(e)) {
            return false;
        }
        this.mObservers.add(e);
        this.mCount++;
        return true;
    }

    public void clear() {
        assertSameThreadUsed();
        this.mCount = 0;
        if (this.mIterationDepth == 0) {
            this.mObservers.clear();
            return;
        }
        int size = this.mObservers.size();
        this.mNeedsCompact |= size != 0;
        for (int i = 0; i < size; i++) {
            this.mObservers.set(i, null);
        }
    }

    public void disableThreadAsserts() {
        this.mEnableThreadAsserts = false;
    }

    public boolean hasObserver(E e) {
        assertSameThreadUsed();
        return this.mObservers.contains(e);
    }

    public boolean isEmpty() {
        assertSameThreadUsed();
        return this.mCount == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        assertSameThreadUsed();
        return new ObserverListIterator(this, 0);
    }

    public boolean removeObserver(E e) {
        int indexOf;
        assertSameThreadUsed();
        if (e == null || (indexOf = this.mObservers.indexOf(e)) == -1) {
            return false;
        }
        if (this.mIterationDepth == 0) {
            this.mObservers.remove(indexOf);
        } else {
            this.mNeedsCompact = true;
            this.mObservers.set(indexOf, null);
        }
        this.mCount--;
        return true;
    }

    public RewindableIterator<E> rewindableIterator() {
        assertSameThreadUsed();
        return new ObserverListIterator(this, 0);
    }

    public int size() {
        assertSameThreadUsed();
        return this.mCount;
    }
}
