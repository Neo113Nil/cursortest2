package xsna;

import xsna.rye;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uye implements Runnable {
    public final /* synthetic */ rye.b b;
    public final /* synthetic */ float c;

    public /* synthetic */ uye(rye.b bVar, float f) {
        this.b = bVar;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rye ryeVar = this.b.c;
        if (ryeVar != null) {
            ryeVar.o(this.c);
        }
    }
}
