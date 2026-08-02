package com.yandex.alicekit.core.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.gyk0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/alicekit/core/views/RoundedCornersImageView;", "Landroid/widget/ImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "width", "height", "Lgyk0;", "getClip", "(II)Lgyk0;", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "", "value", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "clip", "Lgyk0;", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class RoundedCornersImageView extends ImageView {
    private gyk0 clip;
    private float cornerRadius;

    public /* synthetic */ RoundedCornersImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private gyk0 getClip(int width, int height) {
        gyk0 gyk0Var = this.clip;
        if (gyk0Var != null) {
            if (gyk0Var.a != width || gyk0Var.b != height) {
                gyk0Var = null;
            }
            if (gyk0Var != null) {
                return gyk0Var;
            }
        }
        return new gyk0(getCornerRadius(), width, height);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(getClip(canvas.getWidth(), canvas.getHeight()).c);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void setCornerRadius(float f) {
        this.cornerRadius = f;
        invalidate();
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RoundedCornersImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RoundedCornersImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
