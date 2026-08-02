package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.video.polls.ui.questions.open.PollOpenView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qqb0 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = PollOpenView.e;
        view.getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
