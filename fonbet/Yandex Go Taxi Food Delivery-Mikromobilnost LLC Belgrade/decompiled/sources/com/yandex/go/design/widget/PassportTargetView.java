package com.yandex.go.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.yandex.go.design.widget.mask.BaseTargetMaskView;
import defpackage.mqg0;
import defpackage.po90;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/design/widget/PassportTargetView;", "Lcom/yandex/go/design/widget/mask/BaseTargetMaskView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lpo90;", "createMask", "(Landroid/content/Context;)Lpo90;", "w", "h", "Landroid/graphics/Rect;", "computeTargetRect", "(II)Landroid/graphics/Rect;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassportTargetView extends BaseTargetMaskView {
    public static final int $stable = BaseTargetMaskView.$stable;

    public /* synthetic */ PassportTargetView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // com.yandex.go.design.widget.mask.BaseTargetMaskView
    public Rect computeTargetRect(int w, int h) {
        int i = w / 2;
        int i2 = (int) (h * 0.43f);
        int min = (int) (Math.min(w, h) * 0.94f);
        int i3 = (int) (min * 1.48f);
        int i4 = min / 2;
        int i5 = i3 / 2;
        return new Rect(i - i4, i2 - i5, i + i4, i2 + i5);
    }

    @Override // com.yandex.go.design.widget.mask.BaseTargetMaskView
    public po90 createMask(Context context) {
        return new po90(tje.u(8, getContext()), getContext().getColor(mqg0.component_green_toxic), getContext().getColor(mqg0.component_white), qje.t(xng0.fog, getContext()));
    }

    public PassportTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PassportTargetView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public PassportTargetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PassportTargetView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
