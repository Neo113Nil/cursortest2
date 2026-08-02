package xsna;

import xsna.fx10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class j1u implements Runnable {
    public final /* synthetic */ k1u b;
    public final /* synthetic */ int c;

    public /* synthetic */ j1u(k1u k1uVar, int i) {
        this.b = k1uVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fx10.h hVar = h1u.this.d;
        if (hVar != null) {
            hVar.k(this.c);
        }
    }
}
