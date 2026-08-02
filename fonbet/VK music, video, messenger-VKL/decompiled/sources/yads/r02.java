package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes10.dex */
public final class r02 implements zf0 {
    public final x12 a;
    public final kz b;
    public final z00 c;
    public final pu d;
    public final jp2 e;
    public final jz1 f;
    public final mj g;

    public r02(x12 x12Var, kz kzVar, z00 z00Var, pu puVar, bu1 bu1Var, jz1 jz1Var, mj mjVar) {
        this.a = x12Var;
        this.b = kzVar;
        this.c = z00Var;
        this.d = puVar;
        this.e = bu1Var;
        this.f = jz1Var;
        this.g = mjVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.a.a(this.g.a((ExtendedNativeAdView) viewGroup, this.f), this.d);
            this.a.a(this.c);
        } catch (k12 e) {
            this.b.e();
            this.e.reportError("Failed to bind DivKit Native Ad", e);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.a.a((z00) null);
    }
}
