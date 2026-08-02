package xsna;

import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.tzp0;

/* compiled from: ClipsTimerController.kt */
/* loaded from: classes16.dex */
public final class o9f {
    public static final tzp0.c.a g = new tzp0.c.a(new a(), true);
    public final CameraUIView a;
    public final jpd b;
    public dw20 c;
    public int d;
    public int e = 3;
    public VkSegmentedControl f;

    /* compiled from: ClipsTimerController.kt */
    public static final class a implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA_TIMER;
        }
    }

    public o9f(CameraUIView cameraUIView, jpd jpdVar) {
        this.a = cameraUIView;
        this.b = jpdVar;
    }
}
