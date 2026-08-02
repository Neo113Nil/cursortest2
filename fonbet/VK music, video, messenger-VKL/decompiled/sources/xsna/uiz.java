package xsna;

import xsna.wiz;

/* compiled from: LiveDataObservable.java */
/* loaded from: classes11.dex */
public final class uiz implements Runnable {
    public final /* synthetic */ wiz.a b;
    public final /* synthetic */ wiz c;

    public uiz(wiz wizVar, wiz.a aVar) {
        this.c = wizVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.j(this.b);
    }
}
