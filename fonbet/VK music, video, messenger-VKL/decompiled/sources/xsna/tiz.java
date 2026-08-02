package xsna;

import xsna.wiz;

/* compiled from: LiveDataObservable.java */
/* loaded from: classes11.dex */
public final class tiz implements Runnable {
    public final /* synthetic */ wiz.a b;
    public final /* synthetic */ wiz.a c;
    public final /* synthetic */ wiz d;

    public tiz(wiz wizVar, wiz.a aVar, wiz.a aVar2) {
        this.d = wizVar;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wiz wizVar = this.d;
        wizVar.a.j(this.b);
        wizVar.a.f(this.c);
    }
}
