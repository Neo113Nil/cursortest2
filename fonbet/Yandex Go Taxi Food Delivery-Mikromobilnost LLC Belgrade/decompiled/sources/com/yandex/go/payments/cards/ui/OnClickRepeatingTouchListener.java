package com.yandex.go.payments.cards.ui;

import android.view.MotionEvent;
import android.view.View;
import defpackage.ii30;
import defpackage.tx60;
import defpackage.ux60;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/payments/cards/ui/OnClickRepeatingTouchListener;", "Landroid/view/View$OnTouchListener;", "<init>", "()V", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "view", "Landroid/view/View;", "pressed", "Z", "Ljava/lang/Runnable;", "repeatingRunnable", "Ljava/lang/Runnable;", "waitingRunnable", "Companion", "ux60", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnClickRepeatingTouchListener implements View.OnTouchListener {
    public static final int $stable = 8;
    public static final ux60 Companion = new ux60();
    private static final long DELAY = 100;
    private static final long WAIT = 1000;
    private boolean pressed;
    private View view;
    private final Runnable repeatingRunnable = new ii30(8, this);
    private final Runnable waitingRunnable = new tx60(this, 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitingRunnable$lambda$0(OnClickRepeatingTouchListener onClickRepeatingTouchListener) {
        View view;
        if (!onClickRepeatingTouchListener.pressed || (view = onClickRepeatingTouchListener.view) == null) {
            return;
        }
        view.postDelayed(new tx60(onClickRepeatingTouchListener, 1), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitingRunnable$lambda$0$0(OnClickRepeatingTouchListener onClickRepeatingTouchListener) {
        if (onClickRepeatingTouchListener.pressed) {
            onClickRepeatingTouchListener.repeatingRunnable.run();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        if (!v.isClickable()) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.view = v;
            this.pressed = true;
            v.setPressed(true);
            v.performClick();
            this.waitingRunnable.run();
        } else if (action == 1 || action == 3) {
            this.pressed = false;
            v.setPressed(false);
            v.removeCallbacks(this.waitingRunnable);
        }
        return true;
    }
}
