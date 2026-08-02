package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.w070;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/OnSwipeTouchListener;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "onSwipeRight", "()Z", "onSwipeLeft", "onSwipeTop", "onSwipeBottom", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Companion", "GestureListener", "w070", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OnSwipeTouchListener implements View.OnTouchListener {
    public static final w070 Companion = new w070();
    private static final int SWIPE_THRESHOLD = 50;
    private static final int SWIPE_VELOCITY_THRESHOLD = 50;
    private final GestureDetector gestureDetector;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/yandex/payment/sdk/ui/view/OnSwipeTouchListener$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/yandex/payment/sdk/ui/view/OnSwipeTouchListener;)V", "onDown", "", "e", "Landroid/view/MotionEvent;", "onFling", "mE1", "e2", "velocityX", "", "velocityY", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent mE1, MotionEvent e2, float velocityX, float velocityY) {
            if (mE1 == null) {
                return false;
            }
            try {
                float y = e2.getY() - mE1.getY();
                float x = e2.getX() - mE1.getX();
                if (Math.abs(x) > Math.abs(y)) {
                    if (Math.abs(x) > 50.0f && Math.abs(velocityX) > 50.0f) {
                        OnSwipeTouchListener onSwipeTouchListener = OnSwipeTouchListener.this;
                        return x > 0.0f ? onSwipeTouchListener.onSwipeRight() : onSwipeTouchListener.onSwipeLeft();
                    }
                } else if (Math.abs(y) > 50.0f && Math.abs(velocityY) > 50.0f) {
                    OnSwipeTouchListener onSwipeTouchListener2 = OnSwipeTouchListener.this;
                    return y > 0.0f ? onSwipeTouchListener2.onSwipeBottom() : onSwipeTouchListener2.onSwipeTop();
                }
            } catch (Exception e) {
                Log.e("Error", String.valueOf(e.getMessage()));
            }
            return false;
        }
    }

    public OnSwipeTouchListener(Context context) {
        this.gestureDetector = new GestureDetector(context, new GestureListener());
    }

    public boolean onSwipeBottom() {
        return false;
    }

    public boolean onSwipeLeft() {
        return false;
    }

    public boolean onSwipeRight() {
        return false;
    }

    public boolean onSwipeTop() {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        return this.gestureDetector.onTouchEvent(event);
    }
}
