package xsna;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: ClipsTouchDelegateFrameLayout.kt */
/* loaded from: classes17.dex */
public final class jaf extends FrameLayout {
    public a b;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(z);
        } else {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void setTouchDelegate$impl_release(a aVar) {
        this.b = aVar;
    }

    /* compiled from: ClipsTouchDelegateFrameLayout.kt */
    public interface a {
        default void a(boolean z) {
        }

        default void b(MotionEvent motionEvent) {
        }
    }
}
