package com.yandex.go.pickup_from_photo.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.lhc;
import defpackage.lt7;
import defpackage.y6i0;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001#B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\"\u0010!R\u0018\u0010$\u001a\u00060#R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/yandex/go/pickup_from_photo/ui/CameraTargetView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "", BackendConfig.Restrictions.ENABLED, "setScanAnimationEnabled", "(Z)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "durationMs", "", "maxAlpha", "startBlinkAnimation", "(JF)V", "cancelBlinkAnimation", "()V", "onDetachedFromWindow", "Llt7;", "scanRenderer", "Llt7;", "Landroid/graphics/Paint;", "blinkPaint", "Landroid/graphics/Paint;", "blinkAlpha", "F", "Landroid/animation/ValueAnimator;", "blinkAnimator", "Landroid/animation/ValueAnimator;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CameraTargetView extends View {
    public static final int $stable = 8;
    private float blinkAlpha;
    private ValueAnimator blinkAnimator;
    private final Paint blinkPaint;
    private final lt7 scanRenderer;

    public CameraTargetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.scanRenderer = new lt7(this);
        Paint paint = new Paint(1);
        paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        this.blinkPaint = paint;
    }

    public static /* synthetic */ void startBlinkAnimation$default(CameraTargetView cameraTargetView, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 150;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        cameraTargetView.startBlinkAnimation(j, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startBlinkAnimation$lambda$0$0(CameraTargetView cameraTargetView, ValueAnimator valueAnimator) {
        cameraTargetView.blinkAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cameraTargetView.invalidate();
    }

    public final void cancelBlinkAnimation() {
        ValueAnimator valueAnimator = this.blinkAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.blinkAnimator = null;
        if (this.blinkAlpha == 0.0f) {
            return;
        }
        this.blinkAlpha = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        cancelBlinkAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lt7 lt7Var = this.scanRenderer;
        RectF rectF = lt7Var.a;
        CameraTargetView cameraTargetView = lt7Var.k;
        if (cameraTargetView.blinkAlpha > 0.0f) {
            cameraTargetView.blinkPaint.setAlpha(y6i0.d((int) (cameraTargetView.blinkAlpha * 255.0f), 0, 255));
            canvas.drawRect(0.0f, 0.0f, rectF.width(), rectF.height(), cameraTargetView.blinkPaint);
        }
        if (lt7Var.b) {
            float width = rectF.width();
            float f = lt7Var.e / 2.0f;
            float f2 = lt7Var.d;
            float f3 = f2 - f;
            float f4 = f2 + f;
            float f5 = f3 - lt7Var.f;
            LinearGradient linearGradient = new LinearGradient(0.0f, f5, 0.0f, f3, lhc.f(lt7Var.g, 0), lt7Var.g, Shader.TileMode.CLAMP);
            Paint paint = lt7Var.i;
            paint.setShader(linearGradient);
            canvas.drawRect(0.0f, f5, width, f3, paint);
            paint.setShader(null);
            canvas.drawRect(0.0f, f3, width, f4, lt7Var.h);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        lt7 lt7Var = this.scanRenderer;
        lt7Var.a.set(0.0f, 0.0f, w, h);
        if (lt7Var.b) {
            ValueAnimator valueAnimator = lt7Var.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            lt7Var.c = null;
            lt7Var.a();
        }
    }

    public final void setScanAnimationEnabled(boolean enabled) {
        lt7 lt7Var = this.scanRenderer;
        if (lt7Var.b == enabled) {
            return;
        }
        lt7Var.b = enabled;
        if (enabled) {
            lt7Var.a();
        } else {
            ValueAnimator valueAnimator = lt7Var.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            lt7Var.c = null;
        }
        lt7Var.k.invalidate();
    }

    public final void startBlinkAnimation(long durationMs, float maxAlpha) {
        float c = y6i0.c(maxAlpha, 0.0f, 1.0f);
        ValueAnimator valueAnimator = this.blinkAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, c, 0.0f);
        ofFloat.setDuration(durationMs);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new yi(8, this));
        ofFloat.start();
        this.blinkAnimator = ofFloat;
    }

    public CameraTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CameraTargetView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CameraTargetView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ CameraTargetView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
