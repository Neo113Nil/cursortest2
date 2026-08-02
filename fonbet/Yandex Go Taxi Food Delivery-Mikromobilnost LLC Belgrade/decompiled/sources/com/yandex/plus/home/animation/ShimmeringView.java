package com.yandex.plus.home.animation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.home.feature.panel.internalapi.a;
import defpackage.ard0;
import defpackage.bb1;
import defpackage.bvf0;
import defpackage.c1i0;
import defpackage.eob1;
import defpackage.gvb1;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.n3i0;
import defpackage.rng0;
import defpackage.rol0;
import defpackage.tse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/plus/home/animation/ShimmeringView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lard0;", "viewAwarenessDetector", "Ljse;", "mainDispatcher", "<init>", "(Landroid/content/Context;Lard0;Ljse;)V", "Lzy11;", "onAttachedToWindow", "()V", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lard0;", "", "radius", "F", "Lcom/yandex/plus/home/animation/ShimmeringPaint;", "shimmeringPaint", "Lcom/yandex/plus/home/animation/ShimmeringPaint;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "Ltse;", "mainCoroutineScope", "Ltse;", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShimmeringView extends View {
    private final tse mainCoroutineScope;
    private float radius;
    private final RectF rectF;
    private final ShimmeringPaint shimmeringPaint;
    private final ard0 viewAwarenessDetector;

    public ShimmeringView(Context context, ard0 ard0Var, jse jseVar) {
        super(context);
        this.viewAwarenessDetector = ard0Var;
        this.rectF = new RectF();
        final ike a = bvf0.a(jseVar.plus(jl40.a()));
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.common.utils.ViewExtKt$createViewSupervisorScope$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                a.b(tse.this);
            }
        });
        this.mainCoroutineScope = a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, n3i0.ShimmeringView, rng0.plus_sdk_shimmerViewStyle, c1i0.PlusSDK_Widget_ShimmerView);
        int i = n3i0.ShimmeringView_plus_sdk_cornerRadius;
        gvb1.a(obtainStyledAttributes, i);
        this.radius = obtainStyledAttributes.getDimension(i, 0.0f);
        int i2 = n3i0.ShimmeringView_plus_sdk_shimmerViewColor;
        gvb1.a(obtainStyledAttributes, i2);
        int color = obtainStyledAttributes.getColor(i2, 0);
        int i3 = n3i0.ShimmeringView_plus_sdk_edgeColor;
        gvb1.a(obtainStyledAttributes, i3);
        int color2 = obtainStyledAttributes.getColor(i3, 0);
        obtainStyledAttributes.recycle();
        this.shimmeringPaint = new ShimmeringPaint(color, color2, TypedValue.complexToDimensionPixelSize(eob1.b(context.getTheme(), rng0.plus_sdk_shimmerWidth).data, context.getTheme().getResources().getDisplayMetrics()), bb1.y(this));
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        rol0 f;
        super.onAttachedToWindow();
        f = ((a) this.viewAwarenessDetector).f(this, false);
        c.c(f, this.mainCoroutineScope, new ShimmeringView$onAttachedToWindow$1(this, null));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.shimmeringPaint.updateShimmering();
        postInvalidateOnAnimation();
        RectF rectF = this.rectF;
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, this.shimmeringPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.shimmeringPaint.updateOffset(this);
        this.rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }
}
