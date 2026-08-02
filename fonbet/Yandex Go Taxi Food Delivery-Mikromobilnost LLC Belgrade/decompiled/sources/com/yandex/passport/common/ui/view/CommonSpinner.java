package com.yandex.passport.common.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import defpackage.ftb1;
import defpackage.yd2;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/common/ui/view/CommonSpinner;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "startAnimation", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "progressAngle", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "strokeMaximum", "", "value", "getColor", "()I", "setColor", "(I)V", "color", "getColorResource", "setColorResource", "colorResource", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonSpinner extends View {
    public static final int $stable = 8;
    private final Paint paint;
    private float progressAngle;
    private float strokeMaximum;

    public CommonSpinner(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint = paint;
        this.strokeMaximum = 270.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$2$lambda$1(CommonSpinner commonSpinner, ValueAnimator valueAnimator) {
        commonSpinner.progressAngle = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        commonSpinner.invalidate();
    }

    public final int getColor() {
        return this.paint.getColor();
    }

    public final int getColorResource() {
        ftb1.b();
        throw null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float min = (Integer.min(getWidth(), getHeight()) - this.paint.getStrokeWidth()) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawArc(width - min, height - min, width + min, height + min, -90.0f, this.progressAngle, false, this.paint);
    }

    public final void setColor(int i) {
        this.paint.setColor(i);
        invalidate();
    }

    public final void setColorResource(int i) {
        setColor(getContext().getResources().getColor(i));
        invalidate();
    }

    public final void startAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.strokeMaximum);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new yd2(8, this));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 360.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        ofFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }
}
