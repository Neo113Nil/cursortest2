package xsna;

import android.view.KeyEvent;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class b1k0 implements izs<hdy, Boolean> {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ izs<Float, s3q0> c;
    public final /* synthetic */ bwf<Float> d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ gzs<s3q0> g;

    public b1k0(boolean z, izs izsVar, bwf bwfVar, boolean z2, float f, gzs gzsVar) {
        this.b = z;
        this.c = izsVar;
        this.d = bwfVar;
        this.e = z2;
        this.f = f;
        this.g = gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Boolean invoke(hdy hdyVar) {
        KeyEvent keyEvent = hdyVar.a;
        if (!this.b) {
            return Boolean.FALSE;
        }
        izs<Float, s3q0> izsVar = this.c;
        if (izsVar == 0) {
            return Boolean.FALSE;
        }
        int w = zq70.w(keyEvent);
        boolean z = false;
        if (w != 2) {
            if (w == 1) {
                long b = x1o0.b(keyEvent.getKeyCode());
                if (bdy.a(b, bdy.d) || bdy.a(b, bdy.e) || bdy.a(b, bdy.g) || bdy.a(b, bdy.f) || bdy.a(b, bdy.v) || bdy.a(b, bdy.w) || bdy.a(b, bdy.C) || bdy.a(b, bdy.D)) {
                    gzs<s3q0> gzsVar = this.g;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        bwf<Float> bwfVar = this.d;
        float abs = Math.abs(bwfVar.c().floatValue() - bwfVar.getStart().floatValue()) / 100;
        int i = this.e ? -1 : 1;
        long b2 = x1o0.b(keyEvent.getKeyCode());
        boolean a = bdy.a(b2, bdy.d);
        float f = this.f;
        if (a) {
            izsVar.invoke(swe0.k(Float.valueOf((i * abs) + f), bwfVar));
        } else if (bdy.a(b2, bdy.e)) {
            izsVar.invoke(swe0.k(Float.valueOf(f - (i * abs)), bwfVar));
        } else if (bdy.a(b2, bdy.g)) {
            izsVar.invoke(swe0.k(Float.valueOf((i * abs) + f), bwfVar));
        } else if (bdy.a(b2, bdy.f)) {
            izsVar.invoke(swe0.k(Float.valueOf(f - (i * abs)), bwfVar));
        } else if (bdy.a(b2, bdy.v)) {
            izsVar.invoke(bwfVar.getStart());
        } else if (bdy.a(b2, bdy.w)) {
            izsVar.invoke(bwfVar.c());
        } else {
            if (!bdy.a(b2, bdy.C)) {
                if (bdy.a(b2, bdy.D)) {
                    izsVar.invoke(swe0.k(Float.valueOf((swe0.g(10, 1, 10) * abs) + f), bwfVar));
                }
                return Boolean.valueOf(z);
            }
            izsVar.invoke(swe0.k(Float.valueOf(f - (swe0.g(10, 1, 10) * abs)), bwfVar));
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
