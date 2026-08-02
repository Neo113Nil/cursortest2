package org.chromium.base;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public class DiscardableReferencePool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Set<DiscardableReference<?>> mPool = Collections.newSetFromMap(new WeakHashMap());

    public static class DiscardableReference<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private T mPayload;

        public /* synthetic */ DiscardableReference(Object obj, int i) {
            this(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void discard() {
            this.mPayload = null;
        }

        public T get() {
            return this.mPayload;
        }

        private DiscardableReference(T t) {
            this.mPayload = t;
        }
    }

    public void drain() {
        Iterator<DiscardableReference<?>> it = this.mPool.iterator();
        while (it.hasNext()) {
            it.next().discard();
        }
        this.mPool.clear();
    }

    public <T> DiscardableReference<T> put(T t) {
        DiscardableReference<T> discardableReference = new DiscardableReference<>(t, 0);
        this.mPool.add(discardableReference);
        return discardableReference;
    }

    public void remove(DiscardableReference<?> discardableReference) {
        if (this.mPool.contains(discardableReference)) {
            discardableReference.discard();
            this.mPool.remove(discardableReference);
        }
    }
}
