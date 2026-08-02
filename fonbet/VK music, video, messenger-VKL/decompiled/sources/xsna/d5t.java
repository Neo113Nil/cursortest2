package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: GalleryPinchGestureHelper.kt */
/* loaded from: classes15.dex */
public final class d5t implements View.OnTouchListener {
    public final /* synthetic */ e5t b;

    public d5t(e5t e5tVar) {
        this.b = e5tVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        e5t e5tVar = this.b;
        if (!e5tVar.d || !e5tVar.c.a(motionEvent) || (parent = view.getParent()) == null) {
            return false;
        }
        parent.requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
