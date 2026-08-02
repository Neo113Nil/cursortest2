package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class hf1 implements zf0 {
    public final x12 a;
    public final z00 b;
    public final pu c;
    public final String d;
    public final jp2 e;
    public ix1 f;
    public final dg1 g;

    public hf1(x12 x12Var, n32 n32Var, pu puVar, gf1 gf1Var, sf1 sf1Var, String str, bu1 bu1Var) {
        this.a = x12Var;
        this.b = n32Var;
        this.c = puVar;
        this.d = str;
        this.e = bu1Var;
        this.g = new dg1(gf1Var, sf1Var);
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            this.a.a(new mj(EmptyList.b).a(extendedNativeAdView, new lz1()), this.c);
            this.a.a(this.b);
        } catch (k12 e) {
            this.e.reportError("Failed to bind LightBundle Native Ad", e);
        }
        Context context = extendedNativeAdView.getContext();
        int i = ix1.p;
        ix1 ix1Var = new ix1(context, new xo3(zo3.e), null);
        this.f = ix1Var;
        this.g.a(ix1Var);
        extendedNativeAdView.addView(ix1Var, new ViewGroup.LayoutParams(-1, -1));
        ix1Var.loadDataWithBaseURL("https://yandex.ru", ix1Var.a(this.d), "text/html", C.UTF8_NAME, null);
    }

    @Override // yads.zf0
    public final void c() {
        this.a.a((z00) null);
        ix1 ix1Var = this.f;
        if (ix1Var != null) {
            ViewParent parent = ix1Var.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ix1Var);
            }
            ix1Var.c();
        }
        this.f = null;
    }
}
