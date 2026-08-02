package xsna;

import android.view.MotionEvent;
import android.view.View;
import xsna.h0k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ev4 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ev4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                return ((pv4) this.c).d(motionEvent);
            default:
                ((df00) this.c).b(h0k0.e.a);
                return false;
        }
    }
}
