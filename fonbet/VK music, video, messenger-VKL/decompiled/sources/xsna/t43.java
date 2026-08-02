package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.clips.design.view.component.user.ClipUserView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t43 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t43(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((w43) obj).e.onTouch(view, motionEvent);
            case 1:
                float f = ClipUserView.I;
                ((ClipUserView) obj).onTouchEvent(motionEvent);
                return false;
            case 2:
                return ((aai0) obj).d.onTouchEvent(motionEvent);
            default:
                fot fotVar = (fot) obj;
                if (motionEvent != null) {
                    return fotVar.a.onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
