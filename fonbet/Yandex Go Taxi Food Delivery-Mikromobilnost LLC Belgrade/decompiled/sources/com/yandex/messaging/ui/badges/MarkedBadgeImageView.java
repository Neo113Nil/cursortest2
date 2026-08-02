package com.yandex.messaging.ui.badges;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.cn4;
import defpackage.fxa1;
import defpackage.k3i0;
import defpackage.kjs0;
import defpackage.nyh0;
import defpackage.pj91;
import defpackage.ww00;
import defpackage.x4h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/yandex/messaging/ui/badges/MarkedBadgeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateBadge", "()V", "Lcn4;", "badgeViewData", "(Lcn4;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "setBadge", "typeface", "setBadgeTypeface", "(I)V", "", "size", "setBadgeTextSize", "(F)V", "Lcom/yandex/messaging/ui/badges/MarkedBadgeDrawable;", "markedBadgeDrawable", "Lcom/yandex/messaging/ui/badges/MarkedBadgeDrawable;", "", "markedBadgeText", "Ljava/lang/String;", "markedBadgeTextSize", "F", "markedBadgeTextColor", CA20Status.STATUS_USER_I, "markedBadgeBackground", "markedTypefaceResId", "Companion", "ww00", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MarkedBadgeImageView extends AppCompatImageView {
    public static final int $stable = 8;
    public static final ww00 Companion = new ww00();
    private static final int DEFAULT_BG_COLOR = -16777216;
    private static final int DEFAULT_TEXT_COLOR = -1;
    private static final int DEFAULT_TEXT_SIZE = 13;
    private int markedBadgeBackground;
    private MarkedBadgeDrawable markedBadgeDrawable;
    private String markedBadgeText;
    private int markedBadgeTextColor;
    private float markedBadgeTextSize;
    private int markedTypefaceResId;

    public MarkedBadgeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.markedBadgeText = "";
        this.markedBadgeTextSize = kjs0.e(13);
        this.markedTypefaceResId = x4h0.ys_text_medium;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setPaddingRelative(kjs0.b(4), kjs0.b(3), kjs0.b(4), kjs0.b(3));
        setScaleType(ImageView.ScaleType.CENTER);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.MarkedBadgeImageView, 0, 0);
        this.markedBadgeText = obtainStyledAttributes.getResources().getString(obtainStyledAttributes.getResourceId(k3i0.MarkedBadgeImageView_imageBadgeText, nyh0.empty_string));
        this.markedBadgeTextSize = obtainStyledAttributes.getDimension(k3i0.MarkedBadgeImageView_imageBadgeTextSize, this.markedBadgeTextSize);
        this.markedBadgeTextColor = obtainStyledAttributes.getColor(k3i0.MarkedBadgeImageView_imageBadgeTextColor, -1);
        this.markedBadgeBackground = obtainStyledAttributes.getColor(k3i0.MarkedBadgeImageView_imageBadgeBackgroundColor, -16777216);
        this.markedTypefaceResId = obtainStyledAttributes.getResourceId(k3i0.MarkedBadgeImageView_imageBadgeTextFont, x4h0.ys_text_medium);
        obtainStyledAttributes.recycle();
        updateBadge();
    }

    private final void updateBadge() {
        MarkedBadgeDrawable markedBadgeDrawable = new MarkedBadgeDrawable(getContext(), this.markedBadgeBackground, this.markedBadgeTextColor, this.markedBadgeText);
        this.markedBadgeDrawable = markedBadgeDrawable;
        setImageDrawable(markedBadgeDrawable);
        setBadgeTypeface(this.markedTypefaceResId);
        setBadgeTextSize(this.markedBadgeTextSize);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MarkedBadgeDrawable markedBadgeDrawable = this.markedBadgeDrawable;
        if (markedBadgeDrawable == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) markedBadgeDrawable.calculateWidth(View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824), View.MeasureSpec.makeMeasureSpec((int) markedBadgeDrawable.calculateHeight(), 1073741824));
    }

    public final void setBadge(cn4 badgeViewData) {
        if (badgeViewData == null) {
            setVisibility(8);
            return;
        }
        this.markedBadgeText = badgeViewData.a(getResources());
        this.markedBadgeBackground = fxa1.c(badgeViewData.b(), getContext()).data;
        this.markedBadgeTextColor = badgeViewData.c();
        setTag(this.markedBadgeText);
        updateBadge(badgeViewData);
        setVisibility(0);
    }

    public final void setBadgeTextSize(float size) {
        this.markedBadgeTextSize = size;
        MarkedBadgeDrawable markedBadgeDrawable = this.markedBadgeDrawable;
        if (markedBadgeDrawable != null) {
            markedBadgeDrawable.setTextSize(size);
            requestLayout();
            invalidate();
        }
    }

    public final void setBadgeTypeface(int typeface) {
        this.markedTypefaceResId = typeface;
        MarkedBadgeDrawable markedBadgeDrawable = this.markedBadgeDrawable;
        if (markedBadgeDrawable != null) {
            markedBadgeDrawable.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    private final void updateBadge(cn4 badgeViewData) {
        MarkedBadgeDrawable markedBadgeDrawable = new MarkedBadgeDrawable(pj91.f(this), badgeViewData);
        this.markedBadgeDrawable = markedBadgeDrawable;
        setImageDrawable(markedBadgeDrawable);
        setBadgeTypeface(this.markedTypefaceResId);
        setBadgeTextSize(this.markedBadgeTextSize);
    }

    public MarkedBadgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MarkedBadgeImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public MarkedBadgeImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
