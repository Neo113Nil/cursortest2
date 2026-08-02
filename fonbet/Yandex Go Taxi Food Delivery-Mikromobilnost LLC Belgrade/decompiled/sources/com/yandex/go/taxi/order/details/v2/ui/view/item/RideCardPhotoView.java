package com.yandex.go.taxi.order.details.v2.ui.view.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.view.b;
import defpackage.ei;
import defpackage.evu0;
import defpackage.n4h0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringImageView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/RideCardPhotoView;", "Lru/yandex/taxi/widget/ShimmeringImageView;", "Lnwy0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "setAccessibilityDelegateCompat", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "contentDescription", "setContentDescription", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "showContent", "(Landroid/graphics/drawable/Drawable;)V", "showError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardPhotoView extends ShimmeringImageView implements nwy0 {
    public static final int $stable = 8;

    public RideCardPhotoView(Context context) {
        super(context, null, 0, 6, null);
        setAccessibilityDelegateCompat();
        setBackgroundColor(qje.t(xng0.bgMinor, getContext()));
    }

    private final void setAccessibilityDelegateCompat() {
        b.p(this, new ei(16));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackgroundColor(qje.t(xng0.bgMinor, getContext()));
        if (getForeground() != null) {
            setForeground(vng.t(n4h0.bg_photo_placeholder_image, getContext()));
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void setContentDescription(String contentDescription) {
        if (contentDescription == null || evu0.J(contentDescription)) {
            setImportantForAccessibility(4);
            setContentDescription((CharSequence) null);
        } else {
            setImportantForAccessibility(1);
            setContentDescription((CharSequence) contentDescription);
        }
    }

    public final void showContent(Drawable drawable) {
        setImageDrawable(drawable);
        setForeground(null);
    }

    public final void showError() {
        setImageDrawable(null);
        setForeground(vng.t(n4h0.bg_photo_placeholder_image, getContext()));
    }
}
