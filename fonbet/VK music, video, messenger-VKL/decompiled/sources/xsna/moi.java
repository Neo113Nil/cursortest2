package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.bottomsheet.about.delegate.h0;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDescriptionClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class moi implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ moi(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        yg5 yg5Var;
        VideoFile A;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        int i = this.b;
        String str = null;
        wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                wh50Var.setValue(3);
                break;
            case 1:
                wh50Var.setValue(null);
                break;
            default:
                wh50Var.setValue(Boolean.TRUE);
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                xh5 xh5Var = b.C1208b.a().c;
                if (xh5Var != null && (yg5Var = xh5Var.a) != null && (A = yg5Var.A()) != null) {
                    UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                    if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
                    }
                    new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(A.o0()), Long.valueOf(A.I0().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoDescriptionClick(new MobileOfficialAppsVideoStat$TypeVideoDescriptionClick(str, 1, null == true ? 1 : 0).a()), 2)).q();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ moi(h0.a aVar, wh50 wh50Var) {
        this.b = 2;
        this.c = wh50Var;
    }
}
