package xsna;

import android.view.View;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridPaginatedView;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.feature.uxpolls.modalpoll.BaseModalFragment;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.photoviewer.PhotoViewer;
import com.vk.sharing.core.view.InterceptingBottomSheetBehavior;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinScrollView;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.proto.okmp.OkmpPublisher;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ id(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractClipsGridListFragment abstractClipsGridListFragment = (AbstractClipsGridListFragment) obj;
                ClipsGridPaginatedView clipsGridPaginatedView = abstractClipsGridListFragment.X;
                if (clipsGridPaginatedView == null) {
                    clipsGridPaginatedView = null;
                }
                clipsGridPaginatedView.setAlpha(1.0f);
                ClipsGridPaginatedView clipsGridPaginatedView2 = abstractClipsGridListFragment.X;
                (clipsGridPaginatedView2 != null ? clipsGridPaginatedView2 : null).Fe();
                break;
            case 1:
                AnonymCallJoinScrollView anonymCallJoinScrollView = ((st2) obj).g;
                if (anonymCallJoinScrollView != null) {
                    anonymCallJoinScrollView.fullScroll(130);
                    break;
                }
                break;
            case 2:
                BaseModalFragment baseModalFragment = (BaseModalFragment) obj;
                ModalBottomSheetBehavior<View> modalBottomSheetBehavior = baseModalFragment.S;
                if (modalBottomSheetBehavior != null) {
                    modalBottomSheetBehavior.O(4);
                }
                BaseModalFragment.c cVar = new BaseModalFragment.c(baseModalFragment);
                baseModalFragment.R = cVar;
                ModalBottomSheetBehavior<View> modalBottomSheetBehavior2 = baseModalFragment.S;
                if (modalBottomSheetBehavior2 != null) {
                    modalBottomSheetBehavior2.u = cVar;
                    break;
                }
                break;
            case 3:
                float f = CameraUIView.w1;
                ((un9) obj).invoke();
                break;
            case 4:
                jpd jpdVar = (jpd) obj;
                if (jpdVar.q.isEmpty()) {
                    jpdVar.p();
                }
                zd9 camera1View = jpdVar.c.getCamera1View();
                if (camera1View != null) {
                    camera1View.P(jpdVar.n, true);
                    break;
                }
                break;
            case 5:
                int i2 = FeedRecyclerPaginatedView.U;
                dhr0.a.getClass();
                dhr0.D().getClass();
                com.vk.core.ui.themes.a.b((r3r) obj);
                break;
            case 6:
                x750 x750Var = ((InterceptingBottomSheetBehavior) obj).l0;
                if (x750Var != null) {
                    x750Var.invoke();
                    break;
                }
                break;
            case 7:
                ikv0 ikv0Var = ((ro40) obj).h;
                if (ikv0Var != null) {
                    ikv0Var.a();
                    break;
                }
                break;
            case 8:
                i560 i560Var = (i560) obj;
                ikv0 ikv0Var2 = i560Var.c;
                if (ikv0Var2 != null) {
                    ikv0Var2.a();
                }
                i560Var.c = null;
                break;
            case 9:
                ((OkmpPublisher) obj).lambda$start$1();
                break;
            case 10:
                ((PhotoViewer) obj).c.onDismiss();
                break;
            case 11:
                StereoRoomManagerImpl.revokeRoles$lambda$1((izs) obj);
                break;
            case 12:
                rxo0 rxo0Var = (rxo0) obj;
                rxo0Var.a.play(rxo0Var.c[0], 1.0f, 1.0f, 0, 0, 1.0f);
                break;
            case 13:
                TracerCrashReportLite.reportException$lambda$1((TracerCrashReportLite) obj);
                break;
            case 14:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                tnf tnfVar = videoView.p0;
                if (tnfVar != null) {
                    i0q0.g(tnfVar);
                }
                tnf tnfVar2 = new tnf(videoView, 14);
                videoView.p0 = tnfVar2;
                i0q0.d(3000L, tnfVar2);
                break;
            default:
                ((w4u0) obj).b();
                break;
        }
    }
}
