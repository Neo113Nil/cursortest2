package com.yandex.payment.sdk.flex.impl.customview.views.loader;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.dg90;
import defpackage.eg90;
import defpackage.eja1;
import defpackage.hkf;
import defpackage.ivk;
import defpackage.jdo;
import defpackage.qnh;
import defpackage.rms;
import defpackage.rvo;
import defpackage.wm11;
import defpackage.yxk;
import defpackage.zvi;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u000eH\u0014¢\u0006\u0004\b \u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-¨\u00062"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/customview/views/loader/CustomLoaderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lhkf;", "params", "Lyxk;", "expressionResolver", "<init>", "(Landroid/content/Context;Lhkf;Lyxk;)V", "", "dp", "dpToPx", "(F)F", "Lzy11;", "setupSpinner", "()V", "updateFromParams", "startRotationAnimation", "stopRotationAnimation", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lhkf;", "Lyxk;", "Landroid/graphics/Paint;", "spinnerPaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "circleRect", "Landroid/graphics/RectF;", "Landroid/animation/ObjectAnimator;", "rotationAnimator", "Landroid/animation/ObjectAnimator;", "lineWidth", "F", "strokeEnd", "strokeColor", CA20Status.STATUS_USER_I, "animationDuration", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomLoaderView extends View {
    private float animationDuration;
    private final RectF circleRect;
    private final yxk expressionResolver;
    private float lineWidth;
    private hkf params;
    private ObjectAnimator rotationAnimator;
    private final Paint spinnerPaint;
    private int strokeColor;
    private float strokeEnd;

    public CustomLoaderView(Context context, hkf hkfVar, yxk yxkVar) {
        super(context);
        this.params = hkfVar;
        this.expressionResolver = yxkVar;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.spinnerPaint = paint;
        this.circleRect = new RectF();
        this.strokeEnd = 0.75f;
        this.strokeColor = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.animationDuration = 0.5f;
        setupSpinner();
        updateFromParams();
    }

    private final float dpToPx(float dp) {
        return TypedValue.applyDimension(1, dp, getContext().getResources().getDisplayMetrics());
    }

    private final void setupSpinner() {
        if (this.lineWidth == 0.0f) {
            this.lineWidth = dpToPx(4.0f);
        }
        Paint paint = this.spinnerPaint;
        paint.setColor(this.strokeColor);
        paint.setStrokeWidth(this.lineWidth);
    }

    private final void startRotationAnimation() {
        stopRotationAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 360.0f);
        ofFloat.setDuration((long) (this.animationDuration * 1000.0f));
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        this.rotationAnimator = ofFloat;
    }

    private final void stopRotationAnimation() {
        ObjectAnimator objectAnimator = this.rotationAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.rotationAnimator = null;
    }

    private final void updateFromParams() {
        Integer num;
        hkf hkfVar = this.params;
        if (hkfVar != null) {
            this.lineWidth = dpToPx(hkfVar.b);
            Float f = hkfVar.c;
            if (f != null) {
                this.strokeEnd = f.floatValue();
            }
            Float f2 = hkfVar.e;
            if (f2 != null) {
                this.animationDuration = f2.floatValue();
            }
            yxk yxkVar = this.expressionResolver;
            String str = hkfVar.d;
            qnh qnhVar = (qnh) yxkVar;
            qnhVar.getClass();
            try {
                rvo rvoVar = (rvo) qnhVar.a;
                ivk ivkVar = new ivk(4);
                rms rmsVar = wm11.f;
                dg90 dg90Var = eg90.b;
                Set set = jdo.c;
                num = (Integer) rvoVar.b(BduiExpressionResolverImpl.EXPRESSION_KEY, str, eja1.z(str), new zvi(13, qnhVar), ivkVar, rmsVar, dg90Var);
            } catch (Exception unused) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                this.strokeColor = intValue;
                this.spinnerPaint.setColor(intValue);
            }
            this.spinnerPaint.setStrokeWidth(this.lineWidth);
            this.spinnerPaint.setColor(this.strokeColor);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startRotationAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopRotationAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.circleRect, 0.0f, this.strokeEnd * 360.0f, false, this.spinnerPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float f = w / 2.0f;
        float f2 = h / 2.0f;
        float min = (Math.min(w, h) / 2.0f) - (this.lineWidth / 2.0f);
        this.circleRect.set(f - min, f2 - min, f + min, f2 + min);
    }
}
