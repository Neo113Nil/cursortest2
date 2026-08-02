package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class g201 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ sc01 c;

    public g201(com.google.android.gms.cast.framework.internal.featurehighlight.c cVar, View view, sc01 sc01Var) {
        this.b = view;
        this.c = sc01Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view = this.b;
        if (view.getParent() != null) {
            view.performClick();
        }
        this.c.zza();
        return true;
    }
}
