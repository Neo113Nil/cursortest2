package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.jpd;

/* compiled from: ClipsCameraSettingsController.kt */
/* loaded from: classes16.dex */
public final class bld extends ql9 {
    public final jpd.a d;

    /* compiled from: ClipsCameraSettingsController.kt */
    public interface a {
        void a();

        void b(boolean z);
    }

    public bld(jpd.a aVar) {
        this.d = aVar;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA_SETTINGS;
    }
}
