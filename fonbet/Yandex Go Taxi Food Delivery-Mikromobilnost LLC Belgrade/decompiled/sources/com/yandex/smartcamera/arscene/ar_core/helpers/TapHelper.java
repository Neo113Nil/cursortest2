package com.yandex.smartcamera.arscene.ar_core.helpers;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.g191;
import defpackage.s33;
import defpackage.v9x0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/smartcamera/arscene/ar_core/helpers/TapHelper;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lv9x0;", "callback", "Lzy11;", "setRotationCallback", "(Lv9x0;)V", "", "placed", "setObjectPlaced", "(Z)V", "Landroid/view/MotionEvent;", "poll", "()Landroid/view/MotionEvent;", "Landroid/view/View;", "view", "motionEvent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Ljava/util/concurrent/BlockingQueue;", "queuedSingleTaps", "Ljava/util/concurrent/BlockingQueue;", "isRotationActive", "Z", "objectPlaced", "rotationCallback", "Lv9x0;", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TapHelper implements View.OnTouchListener {
    public static final int $stable = 8;
    private final GestureDetector gestureDetector;
    private boolean isRotationActive;
    private boolean objectPlaced;
    private final BlockingQueue<MotionEvent> queuedSingleTaps = new ArrayBlockingQueue(16);
    private v9x0 rotationCallback;

    public TapHelper(Context context) {
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.smartcamera.arscene.ar_core.helpers.TapHelper$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                boolean z;
                v9x0 v9x0Var;
                z = TapHelper.this.objectPlaced;
                if (!z) {
                    return false;
                }
                TapHelper.this.isRotationActive = true;
                v9x0Var = TapHelper.this.rotationCallback;
                if (v9x0Var != null) {
                    b bVar = ((s33) ((g191) v9x0Var).a).c0;
                    float f = (-distanceX) * 0.5f;
                    bVar.a += f;
                    bVar.a(f);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                boolean z;
                BlockingQueue blockingQueue;
                z = TapHelper.this.isRotationActive;
                if (z) {
                    return false;
                }
                blockingQueue = TapHelper.this.queuedSingleTaps;
                blockingQueue.offer(e);
                return true;
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.isRotationActive = false;
        }
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    public final MotionEvent poll() {
        return this.queuedSingleTaps.poll();
    }

    public final void setObjectPlaced(boolean placed) {
        this.objectPlaced = placed;
    }

    public final void setRotationCallback(v9x0 callback) {
        this.rotationCallback = callback;
    }
}
