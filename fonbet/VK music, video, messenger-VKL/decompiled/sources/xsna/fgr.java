package xsna;

import android.content.Context;

/* compiled from: FiltersRenderer.kt */
/* loaded from: classes3.dex */
public final class fgr implements w8i {
    public final Context b;
    public final f100 c;
    public final bpn0 d = new bpn0(new zqf(this, 23));
    public lcr e;
    public ocr f;

    public fgr(Context context, f100 f100Var) {
        this.b = context;
        this.c = f100Var;
    }

    public final void a() {
        umv umvVar;
        if (this.f != null) {
            f100 f100Var = this.c;
            if (f100Var != null) {
                f100Var.v("FiltersRenderer", "releasing filters from customized video frames handler");
            }
            lcr lcrVar = this.e;
            if (lcrVar != null) {
                lcrVar.release();
            }
            this.e = null;
            ocr ocrVar = this.f;
            if (ocrVar != null && (umvVar = ocrVar.b) != null) {
                umvVar.release();
            }
            this.f = null;
            ((tfr) this.d.getValue()).f();
        }
    }
}
