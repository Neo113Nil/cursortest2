package com.yandex.messaging.internal.view.timeline.overlay;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.y2t;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0012\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/messaging/internal/view/timeline/overlay/ThreadCounterHelper$ClickDelegate", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "delegateView", "<init>", "(Landroid/view/View;)V", "Landroid/view/MotionEvent;", "e", "", "hit", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "v", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouch", "Landroid/view/View;", "Landroid/graphics/Rect;", "hitRect", "Landroid/graphics/Rect;", "com/yandex/messaging/internal/view/timeline/overlay/ThreadCounterHelper$ClickDelegate$gestureListener$1", "gestureListener", "Lcom/yandex/messaging/internal/view/timeline/overlay/ThreadCounterHelper$ClickDelegate$gestureListener$1;", "Ly2t;", "gestureDetector", "Ly2t;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class ThreadCounterHelper$ClickDelegate implements View.OnTouchListener {
    private final View delegateView;
    private final y2t gestureDetector;
    private final ThreadCounterHelper$ClickDelegate$gestureListener$1 gestureListener;
    private final Rect hitRect = new Rect();

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.GestureDetector$OnGestureListener, com.yandex.messaging.internal.view.timeline.overlay.ThreadCounterHelper$ClickDelegate$gestureListener$1] */
    public ThreadCounterHelper$ClickDelegate(View view) {
        this.delegateView = view;
        ?? r0 = new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.messaging.internal.view.timeline.overlay.ThreadCounterHelper$ClickDelegate$gestureListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                View view2;
                boolean hit;
                ThreadCounterHelper$ClickDelegate threadCounterHelper$ClickDelegate = ThreadCounterHelper$ClickDelegate.this;
                view2 = threadCounterHelper$ClickDelegate.delegateView;
                hit = threadCounterHelper$ClickDelegate.hit(view2, e);
                return hit;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                View view2;
                boolean hit;
                View view3;
                ThreadCounterHelper$ClickDelegate threadCounterHelper$ClickDelegate = ThreadCounterHelper$ClickDelegate.this;
                view2 = threadCounterHelper$ClickDelegate.delegateView;
                hit = threadCounterHelper$ClickDelegate.hit(view2, e);
                if (!hit) {
                    return false;
                }
                view3 = ThreadCounterHelper$ClickDelegate.this.delegateView;
                view3.performClick();
                return true;
            }
        };
        this.gestureListener = r0;
        this.gestureDetector = new y2t(view.getContext(), r0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hit(View view, MotionEvent motionEvent) {
        view.getHitRect(this.hitRect);
        return this.hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        return this.gestureDetector.a.onTouchEvent(event);
    }
}
