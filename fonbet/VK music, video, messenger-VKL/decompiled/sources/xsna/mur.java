package xsna;

import xsna.je;

/* compiled from: FluentFuture.java */
/* loaded from: classes13.dex */
public abstract class mur<V> extends yru<V> {

    /* compiled from: FluentFuture.java */
    public static abstract class a<V> extends mur<V> implements je.h<V> {
        @Override // xsna.je, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.b instanceof je.b;
        }
    }
}
