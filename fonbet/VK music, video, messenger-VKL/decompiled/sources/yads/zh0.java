package yads;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.j3;
import java.util.UUID;
import xsna.f5z;

/* loaded from: classes10.dex */
public final class zh0 implements zf0 {
    public final j3 a;
    public final ph0 b;
    public final DivConfiguration c;
    public final jp2 d;
    public final String e;
    public final f5z f;
    public final xi0 g;
    public final kh0 h;

    public /* synthetic */ zh0(j3 j3Var, ph0 ph0Var, DivConfiguration divConfiguration, bu1 bu1Var, String str, f5z f5zVar, int i) {
        this(j3Var, ph0Var, divConfiguration, bu1Var, (i & 16) != 0 ? "" : str, f5zVar, new xi0(), new kh0());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            Context context = extendedNativeAdView.getContext();
            xi0 xi0Var = this.g;
            DivConfiguration divConfiguration = this.c;
            f5z f5zVar = this.f;
            String str = this.e;
            xi0Var.getClass();
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), divConfiguration, 0, f5zVar, 4, null), null, 0, 6, null);
            div2View.setTag(str);
            extendedNativeAdView.addView(div2View);
            this.h.getClass();
            div2View.setData(this.a, new DivDataTag(UUID.randomUUID().toString()));
            xg0.a(div2View).a(this.b);
        } catch (Throwable th) {
            this.d.reportError("Failed to bind DivKit", th);
        }
    }

    public zh0(j3 j3Var, ph0 ph0Var, DivConfiguration divConfiguration, bu1 bu1Var, String str, f5z f5zVar, xi0 xi0Var, kh0 kh0Var) {
        this.a = j3Var;
        this.b = ph0Var;
        this.c = divConfiguration;
        this.d = bu1Var;
        this.e = str;
        this.f = f5zVar;
        this.g = xi0Var;
        this.h = kh0Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
