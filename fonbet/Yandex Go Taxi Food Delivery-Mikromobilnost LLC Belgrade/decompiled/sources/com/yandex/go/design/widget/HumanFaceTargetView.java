package com.yandex.go.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.yandex.go.design.widget.mask.BaseTargetMaskView;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.t7p;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/design/widget/HumanFaceTargetView;", "Lcom/yandex/go/design/widget/mask/BaseTargetMaskView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lt7p;", "createMask", "(Landroid/content/Context;)Lt7p;", "w", "h", "Landroid/graphics/Rect;", "computeTargetRect", "(II)Landroid/graphics/Rect;", "", "value", "showFaceOval", "Z", "getShowFaceOval", "()Z", "setShowFaceOval", "(Z)V", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HumanFaceTargetView extends BaseTargetMaskView {
    public static final int $stable = 8;
    private boolean showFaceOval;

    public /* synthetic */ HumanFaceTargetView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // com.yandex.go.design.widget.mask.BaseTargetMaskView
    public Rect computeTargetRect(int w, int h) {
        int i = w / 2;
        int i2 = (int) (h * 0.42f);
        int min = (int) (Integer.min(w, h) * 0.64f);
        int i3 = (int) (min * 1.375f);
        int i4 = min / 2;
        int i5 = i3 / 2;
        return new Rect(i - i4, i2 - i5, i + i4, i2 + i5);
    }

    @Override // com.yandex.go.design.widget.mask.BaseTargetMaskView
    public t7p createMask(Context context) {
        return new t7p(getContext().getColor(mqg0.component_green_toxic), getContext().getColor(mqg0.component_white), qje.t(xng0.fog, getContext()), tje.u(2, getContext()));
    }

    public final boolean getShowFaceOval() {
        return this.showFaceOval;
    }

    public final void setShowFaceOval(boolean z) {
        this.showFaceOval = z;
        setShowDebugPoints(z);
        invalidate();
    }

    public HumanFaceTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public HumanFaceTargetView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public HumanFaceTargetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public HumanFaceTargetView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
