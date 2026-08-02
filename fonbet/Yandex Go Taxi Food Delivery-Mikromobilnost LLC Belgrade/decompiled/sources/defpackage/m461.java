package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.banners.CloseBannerButtonView;
import com.ybsdk.widgets.common.banners.PromoBannerLargeView;

/* loaded from: classes4.dex */
public final class m461 implements zo31 {
    public final PromoBannerLargeView a;
    public final YbButtonView b;
    public final CloseBannerButtonView c;
    public final AppCompatImageView d;
    public final TextView e;
    public final TextView f;

    public m461(PromoBannerLargeView promoBannerLargeView, YbButtonView ybButtonView, CloseBannerButtonView closeBannerButtonView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.a = promoBannerLargeView;
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
