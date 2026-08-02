package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.yandex.div.core.view2.divs.DivSelectBinder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pn9 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pn9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean applyOptions$lambda$0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                ClipsControlsView clipsControls = cameraUIView.getClipsControls();
                if (clipsControls != null) {
                    clipsControls.P4();
                }
                ClipsControlsView clipsControls2 = cameraUIView.getClipsControls();
                if (clipsControls2 == null) {
                    return false;
                }
                lmv.J2(clipsControls2, null, 7);
                return false;
            case 1:
                applyOptions$lambda$0 = DivSelectBinder.applyOptions$lambda$0((wzs) obj, view, motionEvent);
                return applyOptions$lambda$0;
            default:
                return com.vungle.ads.internal.ui.view.k.a((com.vungle.ads.internal.ui.view.k) obj, view, motionEvent);
        }
    }
}
