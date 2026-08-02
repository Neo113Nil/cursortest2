package com.yandex.messaging.internal.view.timeline;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.kjs0;
import defpackage.mp11;
import defpackage.oyh0;
import defpackage.qbz0;

/* loaded from: classes15.dex */
public class MissedHistoryAnimator implements ValueAnimator.AnimatorUpdateListener {
    private final qbz0 mInvalidator;
    private final String mMissedHistoryText;
    private final Paint mPaint;
    private ValueAnimator mValueAnimator;

    public MissedHistoryAnimator(Activity activity, mp11 mp11Var, qbz0 qbz0Var) {
        this.mInvalidator = qbz0Var;
        Resources resources = activity.getResources();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setTextSize(kjs0.e(14));
        paint.setColor(fxa1.c(jng0.messagingCommonTextSecondaryColor, activity).data);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(mp11Var.a());
        this.mMissedHistoryText = resources.getString(oyh0.messaging_history_loading_text);
    }

    public void clear() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mValueAnimator = null;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecyclerView recyclerView = this.mInvalidator.a;
        if (recyclerView != null) {
            recyclerView.invalidate();
        }
    }

    public void onMissedHistoryDraw(Canvas canvas, float f, float f2) {
        if (this.mValueAnimator == null) {
            ValueAnimator duration = ValueAnimator.ofInt(255, 76).setDuration(600L);
            this.mValueAnimator = duration;
            duration.setRepeatCount(-1);
            this.mValueAnimator.setRepeatMode(2);
            this.mValueAnimator.addUpdateListener(this);
            this.mValueAnimator.start();
        }
        this.mPaint.setAlpha(((Integer) this.mValueAnimator.getAnimatedValue()).intValue());
        canvas.drawText(this.mMissedHistoryText, f, f2, this.mPaint);
    }

    public void onNoMissedHistoryItems() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mValueAnimator = null;
        }
    }
}
