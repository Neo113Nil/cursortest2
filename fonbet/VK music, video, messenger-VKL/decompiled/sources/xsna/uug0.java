package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.subjects.g;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: RxLongPressListener.kt */
/* loaded from: classes2.dex */
public final class uug0 implements View.OnTouchListener {
    public final GestureDetector b;
    public io.reactivex.rxjava3.subjects.g<MotionEvent> c;
    public WeakReference<View> d;

    /* compiled from: RxLongPressListener.kt */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public final xcd b;

        public a(xcd xcdVar) {
            this.b = xcdVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            uug0 uug0Var = uug0.this;
            uug0Var.c.onComplete();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.schedulers.a.b();
            io.reactivex.rxjava3.internal.functions.b.a(Integer.MAX_VALUE, "maxSize");
            io.reactivex.rxjava3.internal.functions.b.b(3L, "maxAge");
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(b, "scheduler is null");
            io.reactivex.rxjava3.subjects.g<MotionEvent> gVar = new io.reactivex.rxjava3.subjects.g<>(new g.d(b));
            uug0Var.c = gVar;
            gVar.onNext(MotionEvent.obtain(motionEvent));
            this.b.invoke(uug0Var.c);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            uug0 uug0Var = uug0.this;
            View view = uug0Var.d.get();
            if (view != null) {
                view.performClick();
            }
            uug0Var.d.clear();
            return true;
        }
    }

    public uug0(Context context, xcd xcdVar) {
        GestureDetector gestureDetector = new GestureDetector(context, new a(xcdVar));
        gestureDetector.setIsLongpressEnabled(true);
        this.b = gestureDetector;
        io.reactivex.rxjava3.subjects.g<MotionEvent> N0 = io.reactivex.rxjava3.subjects.g.N0();
        N0.onComplete();
        this.c = N0;
        this.d = new WeakReference<>(null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v8, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (mnh0.m(motionEvent)) {
            this.d = new WeakReference<>(view);
        }
        if (mnh0.r(motionEvent)) {
            this.c.onNext(MotionEvent.obtain(motionEvent));
            if (this.c.b.size() != 0 && !NotificationLite.d(this.c.b.get()) && view != null) {
                view.performLongClick();
            }
            this.c.onComplete();
        }
        if (mnh0.o(motionEvent) && !NotificationLite.d(this.c.b.get())) {
            this.c.onNext(MotionEvent.obtain(motionEvent));
        }
        this.b.onTouchEvent(motionEvent);
        return true;
    }
}
