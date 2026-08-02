package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nb6 implements View.OnTouchListener {
    public final /* synthetic */ int b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                int action = motionEvent.getAction() & 255;
                if (action != 1 && action != 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                } else {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                if (view.getId() == R.id.internal_nps_input) {
                    int action2 = motionEvent.getAction() & 255;
                    if (action2 != 1 && action2 != 3) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                    } else {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
