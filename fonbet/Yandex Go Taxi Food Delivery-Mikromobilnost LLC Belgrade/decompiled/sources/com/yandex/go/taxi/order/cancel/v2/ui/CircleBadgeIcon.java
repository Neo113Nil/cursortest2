package com.yandex.go.taxi.order.cancel.v2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import defpackage.c4i0;
import defpackage.ndh0;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.xw31;
import defpackage.zkh0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.CircleButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/v2/ui/CircleBadgeIcon;", "Lru/yandex/taxi/design/CircleButtonComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getLayoutResource", "()I", "size", "Lzy11;", "setImageSize", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImage", "(Landroid/graphics/drawable/Drawable;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/yandex/taxi/widget/RobotoTextView;", "textBadge", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/widget/FrameLayout;", "frame", "Landroid/widget/FrameLayout;", "imageSize", CA20Status.STATUS_USER_I, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CircleBadgeIcon extends CircleButtonComponent {
    public static final int $stable = 8;
    private final FrameLayout frame;
    private final AppCompatImageView icon;
    private int imageSize;
    private final RobotoTextView textBadge;

    public CircleBadgeIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        int i2 = p8h0.icon_image;
        WeakHashMap weakHashMap = b.a;
        this.icon = (AppCompatImageView) ((View) rp31.d(this, i2));
        RobotoTextView robotoTextView = (RobotoTextView) ((View) rp31.d(this, ndh0.circle_button_badge));
        this.textBadge = robotoTextView;
        FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, ndh0.frame_to_scale));
        this.frame = frameLayout;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.CircleButtonComponent, 0, 0);
        int dimension = (int) obtainStyledAttributes.getDimension(c4i0.CircleButtonComponent_component_frame_height, 0.0f);
        obtainStyledAttributes.recycle();
        this.imageSize = dimension;
        getTitleView().setVisibility(8);
        xw31.L(tje.u(4, getContext()), frameLayout);
        robotoTextView.setFocusable(false);
        setFocusable(true);
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public int getLayoutResource() {
        return zkh0.order_cancel_modal_view_icon_image;
    }

    public final void setImage(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.icon;
        int i = this.imageSize;
        c.D(i, i, appCompatImageView);
        this.icon.setImageDrawable(drawable);
    }

    public final void setImageSize(int size) {
        this.frame.getLayoutParams().height = size;
        this.frame.getLayoutParams().width = size;
        this.imageSize = size;
    }

    public CircleBadgeIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircleBadgeIcon(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircleBadgeIcon(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
