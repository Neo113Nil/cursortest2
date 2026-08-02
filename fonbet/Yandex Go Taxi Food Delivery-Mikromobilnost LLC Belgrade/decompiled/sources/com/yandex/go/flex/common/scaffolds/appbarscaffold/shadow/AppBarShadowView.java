package com.yandex.go.flex.common.scaffolds.appbarscaffold.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/flex/common/scaffolds/appbarscaffold/shadow/AppBarShadowView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "rebuildCutout", "()V", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Landroid/graphics/Rect;", "padding", "setCutout", "(FLandroid/graphics/Rect;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", "cutoutPath", "Landroid/graphics/Path;", "cutoutPadding", "Landroid/graphics/Rect;", "cutoutCornerRadius", "F", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarShadowView extends View {
    private float cutoutCornerRadius;
    private final Rect cutoutPadding;
    private final Path cutoutPath;

    public AppBarShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cutoutPath = new Path();
        this.cutoutPadding = new Rect();
    }

    private final void rebuildCutout() {
        this.cutoutPath.reset();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float f = this.cutoutCornerRadius;
        this.cutoutPath.addRoundRect(this.cutoutPadding.left, 0.0f, getWidth() - this.cutoutPadding.right, getHeight() - this.cutoutPadding.bottom, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f}, Path.Direction.CW);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.cutoutPath.isEmpty()) {
            return;
        }
        int save = canvas.save();
        canvas.clipRect(this.cutoutPadding.left, 0.0f, getWidth() - this.cutoutPadding.right, getHeight());
        canvas.clipOutPath(this.cutoutPath);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        rebuildCutout();
    }

    public final void setCutout(float cornerRadius, Rect padding) {
        this.cutoutCornerRadius = cornerRadius;
        this.cutoutPadding.set(padding);
        rebuildCutout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppBarShadowView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AppBarShadowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
