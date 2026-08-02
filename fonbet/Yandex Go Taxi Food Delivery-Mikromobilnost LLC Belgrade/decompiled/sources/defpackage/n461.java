package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.banners.CloseBannerButtonView;
import com.ybsdk.widgets.common.banners.PromoBannerMediumView;

/* loaded from: classes4.dex */
public final class n461 implements zo31 {
    public final PromoBannerMediumView a;
    public final YbButtonView b;
    public final CloseBannerButtonView c;
    public final AppCompatImageView d;
    public final TextView e;
    public final TextView f;

    public n461(PromoBannerMediumView promoBannerMediumView, YbButtonView ybButtonView, CloseBannerButtonView closeBannerButtonView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.a = promoBannerMediumView;
        this.b = ybButtonView;
        this.c = closeBannerButtonView;
        this.d = appCompatImageView;
        this.e = textView;
        this.f = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
