package com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.splash;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.cst0;
import defpackage.e6h0;
import defpackage.i3y;
import defpackage.luh0;
import defpackage.lyc;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.ShimmeringImageView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/personalaccount/splash/CorpPersonalAccountSplashView;", "Landroid/widget/FrameLayout;", "Lcst0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "isAnimating", "Lzy11;", "setAnimating", "(Z)V", "Landroid/graphics/drawable/Drawable;", "image", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/view/View;", "logo$delegate", "Li3y;", "getLogo", "()Landroid/view/View;", "logo", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CorpPersonalAccountSplashView extends FrameLayout implements cst0 {
    public static final int $stable = 8;

    /* renamed from: logo$delegate, reason: from kotlin metadata */
    private final i3y logo;

    public CorpPersonalAccountSplashView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.logo = a.a(new lyc(21, this));
        View.inflate(getContext(), luh0.corp_personal_account_splash, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View logo_delegate$lambda$0(CorpPersonalAccountSplashView corpPersonalAccountSplashView) {
        return corpPersonalAccountSplashView.findViewById(e6h0.corp_personal_account_splash_logo);
    }

    public final View getLogo() {
        return (View) this.logo.getValue();
    }

    @Override // defpackage.cst0
    public void setAnimating(boolean isAnimating) {
        View logo = getLogo();
        ShimmeringImageView shimmeringImageView = logo instanceof ShimmeringImageView ? (ShimmeringImageView) logo : null;
        if (shimmeringImageView != null) {
            shimmeringImageView.setLoading(isAnimating);
        }
    }

    public final void setDrawable(Drawable image) {
        View logo = getLogo();
        ShimmeringImageView shimmeringImageView = logo instanceof ShimmeringImageView ? (ShimmeringImageView) logo : null;
        if (shimmeringImageView != null) {
            shimmeringImageView.setImageDrawable(image);
        }
    }

    public CorpPersonalAccountSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CorpPersonalAccountSplashView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CorpPersonalAccountSplashView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ CorpPersonalAccountSplashView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
