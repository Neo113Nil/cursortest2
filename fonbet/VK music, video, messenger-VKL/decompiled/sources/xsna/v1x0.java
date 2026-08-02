package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v1x0 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = VoipShareLinkPagerView.k;
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
