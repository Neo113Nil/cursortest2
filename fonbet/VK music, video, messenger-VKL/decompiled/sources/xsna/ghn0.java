package xsna;

import android.app.Activity;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.storycamera.upload.VideoStoryUploadTask;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.internal.tracer.TracerLiteFacade;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ghn0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ghn0(VideoCatalogRootVh videoCatalogRootVh, Activity activity) {
        this.b = 6;
        this.c = videoCatalogRootVh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        TracerCrashReportLite crashReport_delegate$lambda$0;
        WebViewEvent onAllowedPiiChange$lambda$22;
        int i = this.b;
        int i2 = 8;
        boolean z = false;
        int i3 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                FragmentActivity activity = ((hhn0) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 1:
                crashReport_delegate$lambda$0 = TracerLiteFacade.crashReport_delegate$lambda$0((TracerLiteFacade) obj);
                return crashReport_delegate$lambda$0;
            case 2:
                gzs gzsVar = (gzs) ((zak0) ((xpp0) obj).k1).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 3:
                UxPollsComponentImpl uxPollsComponentImpl = (UxPollsComponentImpl) obj;
                qcy<Object>[] qcyVarArr = UxPollsComponentImpl.i;
                nwy nwyVar = uxPollsComponentImpl.e;
                qcy<Object> qcyVar = UxPollsComponentImpl.i[1];
                return new z4r0((m5r0) nwyVar.c(), new kyq0(uxPollsComponentImpl, i3), new ujm0(uxPollsComponentImpl, i2));
            case 4:
                return (TextView) ((VideoAutoPlaySeekBarLayout2) obj).findViewById(R.id.seek_episode_title);
            case 5:
                return ((VideoAutologinComponent) ((k7m) m7m.f((b9s0) obj)).a(fpf0.a(VideoAutologinComponent.class))).u7();
            case 6:
                int i4 = VideoCatalogRootVh.M0;
                return ((CastComponent) ((k7m) m7m.f((VideoCatalogRootVh) obj)).a(fpf0.a(CastComponent.class))).o3().create();
            case 7:
                dis0 dis0Var = (dis0) obj;
                awt0.u(dis0Var.c, true);
                VkSpinner vkSpinner = dis0Var.f;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(4);
                }
                return s3q0.a;
            case 8:
                int i5 = VideoFragment.c0;
                return ((VideoTechBugreportComponent) m7m.d((VideoFragment) obj).mo408a(fpf0.a(VideoTechBugreportComponent.class))).getReporter();
            case 9:
                FrameLayout frameLayout = ((VideoItemListLargeVh) obj).t;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                ViewParent parent = frameLayout.getParent();
                RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                if (recyclerView != null && recyclerView.getScrollState() == 0) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 10:
                new c3k0((com.vk.video.ui.discovery.minimizable.g) obj, 12);
                return new efs0();
            case 11:
                int i6 = VideoMinimizableDiscoveryFragment.p1;
                return ((VideoMinimizableDiscoveryFragment) obj).b3().P0();
            case 12:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj;
                if (!mVar.r && !mVar.x && !mVar.v) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                ((cys0) obj).b0.invoke(new a.k(false));
                return s3q0.a;
            case 14:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((n4t0) obj)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 15:
                com.vk.newsfeed.common.recycler.holders.i iVar = (com.vk.newsfeed.common.recycler.holders.i) obj;
                DurationView durationView = iVar.O;
                InteractiveDurationView interactiveDurationView = iVar.P;
                iVar.W = true;
                iVar.N.setVisibility(0);
                iVar.R.setVisibility(8);
                iVar.T.setVisibility(8);
                if (iVar.g0) {
                    interactiveDurationView.setVisibility(0);
                    durationView.setVisibility(8);
                } else {
                    durationView.setVisibility(0);
                    interactiveDurationView.setVisibility(8);
                }
                iVar.Z = false;
                return s3q0.a;
            case 16:
                return ((StoriesComponent) ((k7m) m7m.f((VideoStoryUploadTask) obj)).a(fpf0.a(StoriesComponent.class))).eb();
            case 17:
                return Boolean.valueOf(((VideoView) obj).u0);
            case 18:
                ((ggu0) obj).g();
                return s3q0.a;
            case 19:
                return (zia) ((xhu0) obj).b.getValue();
            case 20:
                bqu0 bqu0Var = (bqu0) ((Ref$ObjectRef) obj).element;
                if (bqu0Var != null) {
                    bqu0Var.dismiss();
                }
                return s3q0.a;
            case 21:
                return ((SessionManagementComponent) ((k7m) m7m.f(((ufw0) obj).a)).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 22:
                VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) obj;
                int i7 = VoipScheduledCallsFragment.c0;
                return new c6h0(voipScheduledCallsFragment.requireContext(), voipScheduledCallsFragment.T, voipScheduledCallsFragment.In());
            case 23:
                onAllowedPiiChange$lambda$22 = WebViewAdPlayer.onAllowedPiiChange$lambda$22((byte[]) obj);
                return onAllowedPiiChange$lambda$22;
            default:
                int i8 = WriteBar.h0;
                return (ImageView) ((WriteBar) obj).findViewById(R.id.writebar_bot_keyboard);
        }
    }

    public /* synthetic */ ghn0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
