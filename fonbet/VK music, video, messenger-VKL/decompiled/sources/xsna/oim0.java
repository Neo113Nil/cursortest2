package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;

/* compiled from: StoryStickersAnimatedGuidesDrawer.kt */
/* loaded from: classes16.dex */
public final class oim0 extends pim0 {
    public final vg2 Q;
    public final vg2 R;
    public final vg2 S;
    public final vg2 T;
    public final gh2 U;

    public oim0(StickersDrawingViewGroup stickersDrawingViewGroup, cng0 cng0Var) {
        super(stickersDrawingViewGroup, cng0Var);
        igg iggVar = new igg(stickersDrawingViewGroup, 2);
        this.Q = new vg2(this.e, this.N, iggVar);
        this.R = new vg2(this.e, this.N, iggVar);
        this.S = new vg2(this.e, this.N, iggVar);
        this.T = new vg2(this.e, this.N, iggVar);
        this.U = new gh2(this.f, iggVar);
    }

    @Override // xsna.pim0
    public final void A(Canvas canvas) {
        this.p.draw(canvas);
    }

    @Override // xsna.pim0
    public final void B(Canvas canvas) {
        float f = this.P.c;
        this.M.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.i.a, f);
        G(canvas, this.Q, (Float) this.O.a);
    }

    public final void G(Canvas canvas, vg2 vg2Var, Float f) {
        uru uruVar = vg2Var.a;
        uru uruVar2 = vg2Var.b;
        int alpha = uruVar.a.getAlpha();
        r7z r7zVar = this.M;
        if (alpha != 0) {
            zh.j(canvas, r7zVar, vg2Var.a.a);
        }
        Paint paint = uruVar2.a;
        Paint paint2 = uruVar2.a;
        paint.setAlpha(an10.b(vg2Var.c * (f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        if (paint2.getAlpha() != 0) {
            zh.j(canvas, r7zVar, paint2);
        }
    }

    @Override // xsna.zh
    public final void i(Canvas canvas) {
        gh2 gh2Var = this.U;
        int alpha = gh2Var.a.a.getAlpha();
        ypa ypaVar = this.g;
        if (alpha != 0) {
            canvas.drawPath(ypaVar.a, gh2Var.a.a);
            canvas.drawPath(ypaVar.b, gh2Var.a.a);
        }
        if (gh2Var.b.a.getAlpha() != 0) {
            canvas.drawPath(ypaVar.c, gh2Var.b.a);
            canvas.drawPath(ypaVar.d, gh2Var.b.a);
        }
    }

    @Override // xsna.zh
    public final emv k() {
        return this.R;
    }

    @Override // xsna.zh
    public final hmv l() {
        return this.U;
    }

    @Override // xsna.zh
    public final emv m() {
        return this.S;
    }

    @Override // xsna.zh
    public final emv n() {
        return this.T;
    }

    @Override // xsna.zh
    public final emv o() {
        return this.Q;
    }

    @Override // xsna.pim0
    public final void x(Canvas canvas) {
        int i = this.i.b;
        float f = this.P.a;
        this.M.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i - f, r0.a, i - f);
        G(canvas, this.R, (Float) this.O.b);
    }

    @Override // xsna.pim0
    public final void y(Canvas canvas) {
        float f = this.P.b;
        this.M.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.i.b);
        G(canvas, this.S, (Float) this.O.c);
    }

    @Override // xsna.pim0
    public final void z(Canvas canvas) {
        int i = this.i.a;
        float f = this.P.d;
        this.M.a(i - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i - f, r0.b);
        G(canvas, this.T, (Float) this.O.d);
    }
}
