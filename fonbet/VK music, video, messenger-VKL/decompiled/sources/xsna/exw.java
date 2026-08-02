package xsna;

import com.vk.clips.clipchecker.impl.di.ClipCheckerComponentImpl;
import com.vk.libvideo.videobottomsheet.impl.VideoBottomSheetComponentImpl;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.vkhealth.permissions.impl.di.VkHealthPermissionsComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class exw implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ exw(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return sev0.d;
            case 1:
                return Boolean.valueOf(r360.e());
            case 2:
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new gha0(PermissionHelper.a);
            case 3:
                return new a350();
            case 4:
                return ((SessionManagementComponent) m7m.e().a(fpf0.a(SessionManagementComponent.class))).B2();
            case 5:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 6:
                return new dav();
            case 7:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_BOTTOM_SHEET_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 8:
                return new VideoBottomSheetComponentImpl.a();
            case 9:
                return new ClipCheckerComponentImpl.a();
            case 10:
                return new VkHealthPermissionsComponentImpl.a();
            case 11:
                return asu0.a.z(5, "vk-single-thread");
            default:
                return new ysw0();
        }
    }

    public /* synthetic */ exw(Object obj, int i) {
        this.b = i;
    }
}
