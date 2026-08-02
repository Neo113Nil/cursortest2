package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.dzh0;
import defpackage.iog0;
import defpackage.lwg0;
import defpackage.nyg0;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/widgets/common/CloseButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setViewParams", "()V", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CloseButtonView extends AppCompatImageView {
    public /* synthetic */ CloseButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setViewParams() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(iog0.selectableItemBackgroundBorderless, typedValue, true);
        int dimension = (int) getResources().getDimension(lwg0.ybsdk_close_button_view_padding);
        setPadding(dimension, dimension, dimension, dimension);
        setBackground(getContext().getDrawable(typedValue.resourceId));
        setImageDrawable(vng.t(nyg0.ybsdk_ic_cross, getContext()));
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getResources().getString(dzh0.ybsdk_common_accessibility_close_title));
        setClickable(true);
        setFocusable(true);
    }

    public CloseButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CloseButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CloseButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setViewParams();
    }
}
