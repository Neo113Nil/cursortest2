package com.yandex.messaging.internal.view.timeline;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.internal.LocalMessageRef;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.llg0;
import defpackage.qbz0;
import defpackage.qdz0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public class ChatItemHighlighter implements ValueAnimator.AnimatorUpdateListener {
    private final Paint mHighlightPaint;
    private final qbz0 mInvalidator;
    private final HashMap<LocalMessageRef, ValueAnimator> mAnimatorValues = new HashMap<>();
    private final HashMap<LocalMessageRef, String> mPendingQuotedTexts = new HashMap<>();

    public ChatItemHighlighter(Activity activity, qbz0 qbz0Var) {
        this.mInvalidator = qbz0Var;
        Paint paint = new Paint();
        this.mHighlightPaint = paint;
        paint.setColor(fxa1.c(jng0.messagingCommonAccentColor, activity).data);
    }

    private void removeFinishedAnimators() {
        if (this.mAnimatorValues.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<LocalMessageRef, ValueAnimator>> it = this.mAnimatorValues.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<LocalMessageRef, ValueAnimator> next = it.next();
            if (!next.getValue().isRunning()) {
                this.mPendingQuotedTexts.remove(next.getKey());
                it.remove();
            }
        }
    }

    public void highlightItem(LocalMessageRef localMessageRef, long j, String str) {
        if (str != null) {
            this.mPendingQuotedTexts.put(localMessageRef, str);
        }
        if (this.mAnimatorValues.containsKey(localMessageRef)) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(25, 25, 0).setDuration(j);
        this.mAnimatorValues.put(localMessageRef, duration);
        duration.addUpdateListener(this);
        duration.start();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecyclerView recyclerView = this.mInvalidator.a;
        if (recyclerView != null) {
            recyclerView.invalidate();
        }
    }

    public void onDetach() {
        Iterator<ValueAnimator> it = this.mAnimatorValues.values().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.mAnimatorValues.clear();
        this.mPendingQuotedTexts.clear();
    }

    public void onDraw() {
        removeFinishedAnimators();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onItemDraw(Canvas canvas, int i, int i2, int i3, int i4, qdz0 qdz0Var) {
        LocalMessageRef localMessageRef;
        if ((qdz0Var instanceof e) && (localMessageRef = ((e) qdz0Var).g0) != null) {
            if (qdz0Var instanceof llg0) {
                llg0 llg0Var = (llg0) qdz0Var;
                String remove = this.mPendingQuotedTexts.remove(localMessageRef);
                if (remove != null) {
                    llg0Var.z(remove);
                }
            }
            ValueAnimator valueAnimator = this.mAnimatorValues.get(localMessageRef);
            if (valueAnimator == null) {
                return;
            }
            this.mHighlightPaint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            canvas.drawRect(i, i2, i3, i4, this.mHighlightPaint);
        }
    }

    public void highlightItem(LocalMessageRef localMessageRef, String str) {
        highlightItem(localMessageRef, 2000L, str);
    }

    public void highlightItem(LocalMessageRef localMessageRef) {
        highlightItem(localMessageRef, 2000L, null);
    }
}
