package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: OptionalNativeAdHolder.kt */
/* loaded from: classes4.dex */
public final class qt80 extends rp6<vt80, OptionalNativeAdEntry> implements View.OnClickListener {
    public final m73 E;
    public final NativeAdUserLevelAnalyticsSender F;
    public final Object G;
    public final ViewGroup H;
    public final Object I;
    public final io.reactivex.rxjava3.disposables.b J;

    public qt80(ViewGroup viewGroup, bav0 bav0Var, m73 m73Var, NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender) {
        super(R.layout.ads_optional_container, viewGroup);
        this.E = m73Var;
        this.F = nativeAdUserLevelAnalyticsSender;
        wv0 wv0Var = new wv0(23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, wv0Var);
        this.H = (ViewGroup) this.itemView;
        this.I = msy.a(lazyThreadSafetyMode, new xv0(bav0Var, 16));
        this.J = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        this.J.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // xsna.rp6
    public final void R6(vt80 vt80Var) {
        vt80 vt80Var2 = vt80Var;
        CharSequence charSequence = vt80Var2.j;
        x9v0 x9v0Var = vt80Var2.h;
        ?? r2 = this.I;
        cav0 cav0Var = (cav0) r2.getValue();
        ViewGroup viewGroup = this.H;
        if (cav0Var == null) {
            L.l("nativeAd = " + x9v0Var + ", binder = " + ((cav0) r2.getValue()));
            viewGroup.removeAllViews();
            return;
        }
        if (((Boolean) this.G.getValue()).booleanValue()) {
            this.J.e();
            x9v0Var.getCreativeId();
            throw null;
        }
        cav0 cav0Var2 = (cav0) r2.getValue();
        if (cav0Var2 != null) {
            cav0Var2.a(x9v0Var);
            throw null;
        }
        getContext();
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.feed_optional_ad_icon);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(hav0.a);
        ((TextView) viewGroup.findViewById(R.id.feed_optional_ad_advertiser)).setText((CharSequence) vt80Var2.i);
        TextView textView = (TextView) viewGroup.findViewById(R.id.feed_optional_ad_cta_button);
        baf0 baf0Var = vt80Var2.k;
        if (baf0Var != null) {
            baf0Var.a(dhr0.t.c(vt80Var2.l));
        }
        textView.setText(charSequence);
        bwt0.p0(textView, !(charSequence == null || charSequence.length() == 0));
        View findViewById = viewGroup.findViewById(R.id.feed_optional_ad_options);
        bwt0.p0(findViewById, A6());
        findViewById.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!bwt0.b() && epx.f(view, this.H.findViewById(R.id.feed_optional_ad_options))) {
            G6(view);
        }
    }
}
