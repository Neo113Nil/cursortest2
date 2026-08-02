package xsna;

import xsna.mwj0;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes12.dex */
public final class nwj0 implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mwj0.c.a c;

    public nwj0(mwj0.c.a aVar, boolean z) {
        this.c = aVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s2r0.a();
        mwj0.c cVar = mwj0.c.this;
        boolean z = cVar.a;
        boolean z2 = this.b;
        cVar.a = z2;
        if (z != z2) {
            cVar.b.a(z2);
        }
    }
}
