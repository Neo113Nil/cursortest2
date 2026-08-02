package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qkt0 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ qkt0(ViewGroup viewGroup, int i) {
        this.b = i;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.b;
        ViewGroup viewGroup = this.c;
        switch (i) {
            case 0:
                VideoToolbarView videoToolbarView = (VideoToolbarView) viewGroup;
                int i2 = VideoToolbarView.M;
                if (motionEvent.getAction() == 0 && videoToolbarView.L) {
                    ebs0 ebs0Var = videoToolbarView.t;
                    if (ebs0Var != null) {
                        ebs0Var.bk(hsw.a);
                        break;
                    }
                }
                break;
            default:
                WriteBar.p((WriteBar) viewGroup, motionEvent);
                break;
        }
        return false;
    }
}
