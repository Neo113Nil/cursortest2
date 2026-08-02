package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkHorizontalArrow;
import one.video.controls20.SimpleControlsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class wpj0 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ wpj0(ViewGroup viewGroup, int i) {
        this.b = i;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                SimpleControlsView simpleControlsView = (SimpleControlsView) this.c;
                g2b0 g2b0Var = simpleControlsView.v.e;
                if (g2b0Var != null && g2b0Var.h) {
                    return false;
                }
                simpleControlsView.u.y.getThumbSeekBarView().dispatchTouchEvent(motionEvent);
                return true;
            default:
                VkHorizontalArrow.a((VkHorizontalArrow) this.c, motionEvent);
                return false;
        }
    }
}
