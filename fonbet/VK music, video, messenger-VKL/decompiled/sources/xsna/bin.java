package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bin implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bin(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean attachTouchListeners$lambda$17;
        switch (this.b) {
            case 0:
                attachTouchListeners$lambda$17 = DivActionBinder.attachTouchListeners$lambda$17((List) this.c, view, motionEvent);
                return attachTouchListeners$lambda$17;
            default:
                ((GestureDetector) this.c).onTouchEvent(motionEvent);
                return false;
        }
    }
}
