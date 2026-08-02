package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import xsna.zxd0;

/* compiled from: ChatProfileVc.kt */
/* loaded from: classes2.dex */
public final class myb implements GestureDetector.OnGestureListener {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ com.vk.im.ui.components.chat_profile.a c;

    public myb(TextView textView, com.vk.im.ui.components.chat_profile.a aVar) {
        this.b = textView;
        this.c = aVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.performHapticFeedback(0, 2);
        this.c.t(zxd0.s.a.a);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
