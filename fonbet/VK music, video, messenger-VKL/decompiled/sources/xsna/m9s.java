package xsna;

import java.util.concurrent.Executor;

/* compiled from: ForwardingListenableFuture.java */
/* loaded from: classes13.dex */
public abstract class m9s<V> extends k9s<V> implements ugz<V> {

    /* compiled from: ForwardingListenableFuture.java */
    public static abstract class a<V> extends m9s<V> {
        public final je c;

        public a(je jeVar) {
            this.c = jeVar;
        }

        @Override // xsna.x9s
        public final Object delegate() {
            return this.c;
        }
    }

    @Override // xsna.ugz
    public final void addListener(Runnable runnable, Executor executor) {
        ((a) this).c.addListener(runnable, executor);
    }
}
