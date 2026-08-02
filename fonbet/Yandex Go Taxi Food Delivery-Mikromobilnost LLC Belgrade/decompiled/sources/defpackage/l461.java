package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.ybsdk.widgets.common.banners.CloseBannerButtonView;

/* loaded from: classes4.dex */
public final class l461 implements zo31 {
    public final CloseBannerButtonView a;
    public final ImageView b;
    public final ImageView c;

    public l461(CloseBannerButtonView closeBannerButtonView, ImageView imageView, ImageView imageView2) {
        this.a = closeBannerButtonView;
        this.b = imageView;
        this.c = imageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
