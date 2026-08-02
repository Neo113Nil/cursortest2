package com.lightside.visum;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.tls;
import defpackage.uxw0;
import defpackage.y2t;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J1\u0010\u001d\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0016J1\u0010\"\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001eJ-\u0010'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J-\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/lightside/visum/SwipeListener;", "Landroid/view/View$OnTouchListener;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/lightside/visum/SwipeDirection;", "", "swipeListener", "<init>", "(Landroid/content/Context;Ltls;)V", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "e", "onDown", "(Landroid/view/MotionEvent;)Z", "Lzy11;", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "onLongPress", "velocityX", "velocityY", "onFling", "x1", "y1", "x2", "y2", "getDirection", "(FFFF)Lcom/lightside/visum/SwipeDirection;", "", "getAngle", "(FFFF)D", "Ltls;", "getSwipeListener", "()Ltls;", "Ly2t;", "gestureDetector", "Ly2t;", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SwipeListener implements View.OnTouchListener, GestureDetector.OnGestureListener {
    private final y2t gestureDetector;
    private final tls swipeListener;

    public SwipeListener(Context context, tls tlsVar) {
        this.swipeListener = tlsVar;
        this.gestureDetector = new y2t(context, this, null);
    }

    public final double getAngle(float x1, float y1, float x2, float y2) {
        return ((((Math.atan2(y1 - y2, x2 - x1) + 3.141592653589793d) * 180.0d) / 3.141592653589793d) + 180.0d) % 360.0d;
    }

    public final SwipeDirection getDirection(float x1, float y1, float x2, float y2) {
        double angle = getAngle(x1, y1, x2, y2);
        SwipeDirection.Companion.getClass();
        return uxw0.a(angle, 45.0f, 135.0f) ? SwipeDirection.UP : (uxw0.a(angle, 0.0f, 45.0f) || uxw0.a(angle, 315.0f, 360.0f)) ? SwipeDirection.RIGHT : uxw0.a(angle, 225.0f, 315.0f) ? SwipeDirection.DOWN : SwipeDirection.LEFT;
    }

    public final tls getSwipeListener() {
        return this.swipeListener;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (e1 == null) {
            return false;
        }
        return ((Boolean) this.swipeListener.invoke(getDirection(e1.getX(), e1.getY(), e2.getX(), e2.getY()))).booleanValue();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        return this.gestureDetector.a.onTouchEvent(event);
    }
}
