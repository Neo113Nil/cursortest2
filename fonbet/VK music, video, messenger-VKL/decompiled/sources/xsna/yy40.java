package xsna;

import android.content.Context;
import android.view.View;
import com.my.target.nativeads.views.NativeAdChoicesView;
import com.my.target.nativeads.views.NativeAdContainer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ydl0;

/* compiled from: MusicPlayerStickyBannerAd.kt */
/* loaded from: classes3.dex */
public final class yy40 implements ydl0 {
    public final Context a;
    public ydl0.a b;
    public final ov50 c;
    public ydl0.b.AbstractC4094b.a d;

    public yy40(Context context, int i, df0 df0Var) {
        this.a = context;
        ov50 ov50Var = new ov50(i, context);
        qnk qnkVar = ov50Var.a.a;
        if (df0Var.e) {
            qnkVar.g("test_mode", "1");
        }
        qnkVar.i(df0Var.a);
        qnkVar.h(df0Var.b ? 2 : 1);
        int i2 = df0Var.c;
        if (i2 > 0) {
            qnkVar.f(i2);
        }
        ov50Var.h = new xy40(this);
        this.c = ov50Var;
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
        NativeAdChoicesView nativeAdChoicesView = (NativeAdChoicesView) view.findViewById(R.id.nativeads_ad_choices);
        View findViewById = view.findViewById(R.id.nativeads_ad_choices_icon);
        List<View> I = rl3.I(new View[]{findViewById, view.findViewById(R.id.nativeads_call_to_action), view});
        NativeAdContainer nativeAdContainer = new NativeAdContainer(this.a);
        nativeAdContainer.setId(R.id.vk_nativeads_container);
        nativeAdContainer.addView(view);
        ov50 ov50Var = this.c;
        ov50Var.k = 4;
        ov50Var.e(view, I);
        if (nativeAdChoicesView != null) {
            nativeAdChoicesView.setVisibility(8);
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new ko3(nativeAdChoicesView, 8));
        }
        ov50Var.j = new wy40(new xsw(this, 13));
        return nativeAdContainer;
    }

    @Override // xsna.ydl0
    public final void load() {
        this.c.d();
    }
}
