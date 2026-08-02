package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.profile.di.VideoProfileNavigationComponentImpl;
import com.vkontakte.android.R;
import xsna.edt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wcs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        z0y0 z0y0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (zct0) ((xcs0) obj).findViewById(R.id.video_replay_complete);
            case 1:
                return ((VideoDialog) obj).w0;
            case 2:
                ((g5t0) ((wh50) obj).getValue()).f.invoke(a.c.a);
                return s3q0.a;
            case 3:
                return ((VideoRestrictedUserActionsComponent) ((VideoProfileNavigationComponentImpl) obj).d.getValue()).e2();
            case 4:
                fxc0.B().d(((mbt0) obj).b);
                return s3q0.a;
            case 5:
                return ((VideoRestrictedUserActionsComponent) ((k7m) m7m.f((edt0.a) ((edt0) obj).b.getValue())).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 6:
                ((kkt0) obj).a();
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return ((VideoView) obj).getViewBinding().G;
            case 8:
                ro1 ro1Var = ((VkAlbumsFragment) obj).X;
                if (ro1Var != null) {
                    ro1Var.b(true);
                }
                return s3q0.a;
            case 9:
                return new l3x0(((tnw0) obj).a);
            case 10:
                return Boolean.valueOf(((r4x0) obj).g());
            case 11:
                return new z4s0(((knx0) obj).a);
            default:
                y0y0 y0y0Var = (y0y0) obj;
                if (y0y0Var.c(null) && (z0y0Var = y0y0Var.d) != null) {
                    y0y0Var.c.getInputState();
                    z0y0Var.a(true, false);
                }
                return s3q0.a;
        }
    }
}
