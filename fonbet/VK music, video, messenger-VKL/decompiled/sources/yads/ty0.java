package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes10.dex */
public final class ty0 implements zf0 {
    public final x12 a;
    public final kz b;
    public final z00 c;
    public final jp2 d;
    public final mj e;
    public final kz1 f;

    public ty0(x12 x12Var, kz kzVar, z00 z00Var, jp2 jp2Var, mj mjVar, kz1 kz1Var) {
        this.a = x12Var;
        this.b = kzVar;
        this.c = z00Var;
        this.d = jp2Var;
        this.e = mjVar;
        this.f = kz1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.a.a(this.e.a((ExtendedNativeAdView) viewGroup, this.f));
            this.a.a(this.c);
        } catch (k12 e) {
            this.b.e();
            this.d.reportError("Failed to bind DivKit Fullscreen Native Ad", e);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.a.a((z00) null);
    }
}
