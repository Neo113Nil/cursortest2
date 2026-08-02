package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes10.dex */
public final class hw2 implements vo1 {
    public final ov2 a;
    public final v9 b;
    public final zo1 c;
    public final wo1 d;
    public final yo1 e;
    public final xo1 f;

    public hw2(ov2 ov2Var, v9 v9Var, zo1 zo1Var, wo1 wo1Var, yo1 yo1Var, xo1 xo1Var) {
        this.a = ov2Var;
        this.b = v9Var;
        this.c = zo1Var;
        this.d = wo1Var;
        this.e = yo1Var;
        this.f = xo1Var;
    }

    public final to1 a(CustomizableMediaView customizableMediaView, ov2 ov2Var, nj2 nj2Var, bp1 bp1Var, qz2 qz2Var, po1 po1Var) {
        CustomizableMediaView customizableMediaView2;
        nj2 nj2Var2;
        bp1 bp1Var2;
        List list = po1Var.c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return this.d.a(customizableMediaView, nj2Var, bp1Var);
        }
        try {
            customizableMediaView2 = customizableMediaView;
            nj2Var2 = nj2Var;
            bp1Var2 = bp1Var;
        } catch (Throwable unused) {
            customizableMediaView2 = customizableMediaView;
            nj2Var2 = nj2Var;
            bp1Var2 = bp1Var;
        }
        try {
            return this.e.a(this.b, ov2Var, customizableMediaView2, nj2Var2, list, bp1Var2, qz2Var);
        } catch (Throwable unused2) {
            return this.d.a(customizableMediaView2, nj2Var2, bp1Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.view.View, android.view.ViewGroup, com.monetization.ads.nativeads.CustomizableMediaView] */
    /* JADX WARN: Type inference failed for: r2v13, types: [yads.c13] */
    /* JADX WARN: Type inference failed for: r5v9, types: [yads.c13] */
    /* JADX WARN: Type inference failed for: r7v5, types: [yads.lw2] */
    @Override // yads.vo1
    public final to1 a(CustomizableMediaView customizableMediaView, d4 d4Var, nj2 nj2Var, hm1 hm1Var, a61 a61Var, e52 e52Var, i42 i42Var, g02 g02Var, bp1 bp1Var, qz2 qz2Var, po1 po1Var) {
        hw2 hw2Var;
        if (po1Var == null) {
            return null;
        }
        f72 f72Var = e52Var.a;
        q82 q82Var = e52Var.b;
        pk1 pk1Var = po1Var.a;
        Context context = customizableMediaView.getContext();
        Context context2 = customizableMediaView.getContext();
        pr0 pr0Var = pr0.e;
        boolean a = qr0.a(context2, pr0Var);
        if (a) {
            customizableMediaView.removeAllViews();
        }
        if (f72Var != null) {
            we3 we3Var = po1Var.b;
            zo1 zo1Var = this.c;
            zo1Var.getClass();
            Context context3 = customizableMediaView.getContext();
            zo1Var.e.a.getClass();
            ok3 videoScaleType = customizableMediaView.getVideoScaleType();
            if (videoScaleType == null) {
                videoScaleType = ok3.b;
            }
            l72 l72Var = zo1Var.f;
            qk3 qk3Var = we3Var != null ? we3Var.b : null;
            l72Var.getClass();
            ej3 ej3Var = new ej3(videoScaleType, qk3Var != null ? qk3Var.a : true, qk3Var != null ? qk3Var.b : false, qk3Var != null ? qk3Var.d : null);
            zo1Var.d.getClass();
            g82 a2 = zo1Var.g.a(context3, ej3Var, hm1Var, we3Var, customizableMediaView.getVideoControlsLayoutId());
            zo1Var.c.getClass();
            if (!qr0.a(customizableMediaView.getContext(), pr0Var)) {
                customizableMediaView.removeAllViews();
            }
            customizableMediaView.addView(a2, new FrameLayout.LayoutParams(-1, -1));
            ?? lw2Var = new lw2(customizableMediaView, bp1Var, new ml3(new hl3(zo1Var.a, a2, ej3Var, d4Var, zo1Var.b, a61Var, f72Var, i42Var, g02Var, nj2Var, qz2Var, new fl3())));
            r16 = qz2Var != null ? qz2Var.e : null;
            if (r16 == null || !a) {
                hw2Var = this;
            } else {
                to1 a3 = a(customizableMediaView, this.a, nj2Var, bp1Var, qz2Var, po1Var);
                hw2Var = this;
                if (a3 != null) {
                    r16 = new pw2(customizableMediaView, lw2Var, a3, bp1Var, r16);
                }
            }
            r16 = lw2Var;
        } else {
            hw2Var = this;
            if (q82Var != null && pk1Var != null && tb.a(context)) {
                try {
                    r16 = hw2Var.f.a(customizableMediaView, pk1Var, a61Var, q82Var, bp1Var);
                } catch (bp3 unused) {
                }
            }
        }
        if (r16 == null) {
            return hw2Var.a(customizableMediaView, hw2Var.a, nj2Var, bp1Var, qz2Var, po1Var);
        }
        return r16;
    }
}
