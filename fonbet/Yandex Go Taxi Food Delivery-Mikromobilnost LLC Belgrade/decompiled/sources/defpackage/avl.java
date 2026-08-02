package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public final /* synthetic */ class avl implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.onTouchEvent(motionEvent);
        return true;
    }
}
