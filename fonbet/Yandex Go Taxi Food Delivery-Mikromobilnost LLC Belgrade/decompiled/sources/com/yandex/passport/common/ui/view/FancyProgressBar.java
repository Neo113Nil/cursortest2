package com.yandex.passport.common.ui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ftb1;
import defpackage.g8e;
import defpackage.m810;
import defpackage.scc;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\n*\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00108\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R&\u0010;\u001a\u00020\u00062\b\b\u0001\u00103\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00105\"\u0004\b:\u00107¨\u0006<"}, d2 = {"Lcom/yandex/passport/common/ui/view/FancyProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "startAnimation", "()V", "stopAnimation", "Lcom/yandex/passport/common/ui/view/a;", "circle", "width", "height", "adjustBounds", "(Lcom/yandex/passport/common/ui/view/a;II)V", "Landroid/graphics/Canvas;", "", "phase", "draw", "(Landroid/graphics/Canvas;Lcom/yandex/passport/common/ui/view/a;F)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "onDetachedFromWindow", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(F)V", "progress", "F", "Landroid/animation/Animator;", "animator", "Landroid/animation/Animator;", "lineWidth", "", "circles", "Ljava/util/List;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "value", "getColor", "()I", "setColor", "(I)V", "color", "getColorResource", "setColorResource", "colorResource", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FancyProgressBar extends View {
    public static final int $stable = 8;
    private Animator animator;
    private final List<a> circles;
    private float lineWidth;
    private final Paint paint;
    private float progress;

    public FancyProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineWidth = 1.0f;
        this.circles = scc.g(new a(0.33333334f, 6, c.a), new a(0.6666667f, 4, c.b), new a(1.0f, 6, c.c));
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        paint.setStrokeWidth(this.lineWidth);
        this.paint = paint;
    }

    private final void adjustBounds(a circle, int width, int height) {
        RectF rectF = circle.c;
        float f = width / 2.0f;
        float f2 = circle.a;
        float f3 = this.lineWidth;
        rectF.left = ((1.0f - f2) * f) + f3;
        rectF.right = ((1.0f + f2) * f) - f3;
        float f4 = height / 2.0f;
        rectF.top = g8e.b(1.0f, f2, f4, f3);
        rectF.bottom = ((1.0f + f2) * f4) - f3;
    }

    private final void draw(Canvas canvas, a aVar, float f) {
        for (Pair pair : aVar.d) {
            float floatValue = ((Number) pair.getFirst()).floatValue();
            canvas.drawArc(aVar.c, floatValue + f, ((Number) pair.getSecond()).floatValue(), false, this.paint);
        }
    }

    private final void startAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(1400L);
        ofFloat.addUpdateListener(new b(this, 0));
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        this.animator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$2$lambda$1(FancyProgressBar fancyProgressBar, ValueAnimator valueAnimator) {
        fancyProgressBar.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fancyProgressBar.invalidate();
    }

    private final void stopAnimation() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
        }
        this.animator = null;
    }

    public final int getColor() {
        return this.paint.getColor();
    }

    public final int getColorResource() {
        ftb1.b();
        throw null;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator<a> it = this.circles.iterator();
        while (it.hasNext()) {
            draw(canvas, it.next(), this.progress * 360.0f * r1.b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float min = Math.min(w, h) / 15.0f;
        this.lineWidth = min;
        this.paint.setStrokeWidth(min);
        Iterator<a> it = this.circles.iterator();
        while (it.hasNext()) {
            adjustBounds(it.next(), w, h);
        }
    }

    @Override // android.view.View
    public void setAlpha(float alpha) {
        super.setAlpha(alpha);
        this.paint.setAlpha(m810.b(255.0f * alpha));
    }

    public final void setColor(int i) {
        this.paint.setColor(i);
        invalidate();
    }

    public final void setColorResource(int i) {
        setColor(getContext().getResources().getColor(i));
    }

    public FancyProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FancyProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public FancyProgressBar(Context context) {
        this(context, null, 0, 6, null);
    }
}
