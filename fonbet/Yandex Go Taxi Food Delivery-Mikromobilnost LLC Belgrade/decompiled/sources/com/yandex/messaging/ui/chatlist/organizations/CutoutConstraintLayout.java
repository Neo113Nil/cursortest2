package com.yandex.messaging.ui.chatlist.organizations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.k3i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/ui/chatlist/organizations/CutoutConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "generateLayoutParams", "(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "clearPaint", "Landroid/graphics/Paint;", "CutoutLayoutParams", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CutoutConstraintLayout extends ConstraintLayout {
    public static final int $stable = 8;
    private final Paint clearPaint;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/ui/chatlist/organizations/CutoutConstraintLayout$CutoutLayoutParams;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cutoutWidth", "getCutoutWidth", "setCutoutWidth", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CutoutLayoutParams extends ConstraintLayout.LayoutParams {
        public static final int $stable = 8;
        private float cornerRadius;
        private float cutoutWidth;

        public CutoutLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.CutoutConstraintLayout_Child);
            this.cutoutWidth = obtainStyledAttributes.getDimension(k3i0.CutoutConstraintLayout_Child_cutoutWidth, 0.0f);
            this.cornerRadius = obtainStyledAttributes.getDimension(k3i0.CutoutConstraintLayout_Child_cornerRadius, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final float getCutoutWidth() {
            return this.cutoutWidth;
        }

        public final void setCornerRadius(float f) {
            this.cornerRadius = f;
        }

        public final void setCutoutWidth(float f) {
            this.cutoutWidth = f;
        }
    }

    public CutoutConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(null, null);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                CutoutLayoutParams cutoutLayoutParams = layoutParams instanceof CutoutLayoutParams ? (CutoutLayoutParams) layoutParams : null;
                float cornerRadius = cutoutLayoutParams != null ? cutoutLayoutParams.getCornerRadius() : 0.0f;
                float cutoutWidth = cutoutLayoutParams != null ? cutoutLayoutParams.getCutoutWidth() : 0.0f;
                RectF rectF = new RectF(childAt.getLeft() - cutoutWidth, childAt.getTop() - cutoutWidth, childAt.getRight() + cutoutWidth, childAt.getBottom() + cutoutWidth);
                float f = cutoutWidth + cornerRadius;
                canvas.drawRoundRect(rectF, f, f, this.clearPaint);
                int save = canvas.save();
                Path path = new Path();
                path.addRoundRect(new RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()), cornerRadius, cornerRadius, Path.Direction.CW);
                canvas.clipPath(path);
                drawChild(canvas, childAt, getDrawingTime());
                canvas.restoreToCount(save);
            }
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public ConstraintLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new CutoutLayoutParams(getContext(), attrs);
    }

    public CutoutConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CutoutConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CutoutConstraintLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
