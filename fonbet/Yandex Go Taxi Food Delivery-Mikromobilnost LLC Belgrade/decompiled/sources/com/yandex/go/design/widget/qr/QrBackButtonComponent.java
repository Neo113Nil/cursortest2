package com.yandex.go.design.widget.qr;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.go.design.view.GoImageView;
import defpackage.f1h0;
import defpackage.kyh0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\b\u0003\u0010\u0006\u001a\u00020\u0007:\u0002\b\b\u001a\u0002\b\u000b¢\u0006\u0004\b\t\u0010\nÊ\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lcom/yandex/go/design/widget/qr/QrBackButtonComponent;", "Lcom/yandex/go/design/view/GoImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "Landroidx/annotation/AttrRes;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "taxi_design", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QrBackButtonComponent extends GoImageView {
    public static final int $stable = 8;

    public QrBackButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageResource(xw31.n(context) ? f1h0.ic_arrow_right_always_black : f1h0.ic_arrow_left_always_black);
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(getContext().getString(kyh0.common_back));
        setBackgroundResource(f1h0.qr_back_fab_component);
    }

    public QrBackButtonComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public QrBackButtonComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ QrBackButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
