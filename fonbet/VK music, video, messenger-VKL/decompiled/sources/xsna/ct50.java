package xsna;

import android.content.Context;
import android.view.View;
import com.my.target.nativeads.views.NativeAdChoicesView;
import com.my.target.nativeads.views.NativeAdContainer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ydl0;

/* compiled from: MyTargetStickyBannerNativeAd.kt */
/* loaded from: classes6.dex */
public final class ct50 implements ydl0 {
    public final Context a;
    public ydl0.a b;
    public final zu50 c;
    public ydl0.b.AbstractC4094b.a d;

    public ct50(Context context, int i, df0 df0Var) {
        this.a = context;
        zu50 zu50Var = new zu50(i, context);
        qnk qnkVar = zu50Var.a.a;
        qnkVar.g("content_id", df0Var.d);
        if (df0Var.e) {
            qnkVar.g("test_mode", "1");
        }
        qnkVar.i(df0Var.a);
        qnkVar.h(df0Var.b ? 2 : 1);
        int i2 = df0Var.c;
        if (i2 > 0) {
            qnkVar.f(i2);
        }
        if (df0Var.f) {
            qnkVar.g("is_whitelist_internet", "1");
        }
        zu50Var.i = new bt50(this);
        this.c = zu50Var;
    }

    @Override // xsna.ydl0
    public final void a() {
        this.c.a();
    }

    @Override // xsna.ydl0
    public final View b(jel0 jel0Var) {
        return g(jel0Var.f());
    }

    @Override // xsna.ydl0
    public final void c() {
        this.b = null;
    }

    @Override // xsna.ydl0
    public final boolean d() {
        return this.b != null;
    }

    @Override // xsna.ydl0
    public final void e(ydl0.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.ydl0
    public final ydl0.b.AbstractC4094b.a f() {
        return this.d;
    }

    @Override // xsna.ydl0
    public final NativeAdContainer g(View view) {
        zu50 zu50Var = this.c;
        cw50 d = zu50Var.d();
        if ((d != null ? d.v : null) != null) {
            View findViewById = view.findViewById(R.id.nativeads_icon);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            View findViewById2 = view.findViewById(R.id.nativeads_media_view);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        }
        NativeAdChoicesView nativeAdChoicesView = (NativeAdChoicesView) view.findViewById(R.id.nativeads_ad_choices);
        View findViewById3 = view.findViewById(R.id.nativeads_ad_choices_icon);
        List I = rl3.I(new View[]{findViewById3, view.findViewById(R.id.nativeads_call_to_action), view});
        NativeAdContainer nativeAdContainer = new NativeAdContainer(this.a);
        nativeAdContainer.setId(R.id.vk_nativeads_container);
        nativeAdContainer.addView(view);
        zu50Var.r = 4;
        afz0.a(view, zu50Var);
        ckz0 ckz0Var = zu50Var.h;
        if (ckz0Var != null) {
            ckz0Var.j(view, I, zu50Var.r);
        }
        if (nativeAdChoicesView != null) {
            nativeAdChoicesView.setVisibility(8);
        }
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new um3(nativeAdChoicesView, 6));
        }
        zu50Var.l = new at50(new cf00(this, 9));
        return nativeAdContainer;
    }

    @Override // xsna.ydl0
    public final void load() {
        this.c.g();
    }
}
