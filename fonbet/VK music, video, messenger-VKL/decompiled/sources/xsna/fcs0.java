package xsna;

import android.widget.ViewFlipper;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.superapp.vkworkout.widget.api.di.VkWorkoutWidgetComponent;
import com.vk.video.design.view.VideoControlsBarView;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.voip.ui.group_selector.ui.a;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import xsna.bdr0;
import xsna.vhg;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fcs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fcs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new kng((ics0) obj);
            case 1:
                int i2 = VideoControlsBarView.n;
                return Boolean.valueOf(((DonutVideoComponent) ((k7m) m7m.c((VideoControlsBarView) obj)).a(fpf0.a(DonutVideoComponent.class))).J().a());
            case 2:
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                return ((VideoFileAdapter) obj).d().X0();
            case 3:
                return Boolean.valueOf(((VideoItemListSmallVh) obj).n.J().X1());
            case 4:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                return new igs0(((VideoMinimizableDiscoveryFragment) obj).ko().Ff());
            case 5:
                int i4 = VideoRelatedVideosFragment.n0;
                return ((VideoShareComponent) m7m.d((VideoRelatedVideosFragment) obj).a(fpf0.a(VideoShareComponent.class))).S();
            case 6:
                ((ggu0) obj).a();
                return s3q0.a;
            case 7:
                u0v0 u0v0Var = (u0v0) obj;
                return new bdr0(u0v0Var.a, new bdr0.a(new bdr0.b(u0v0Var.b, com.vk.toggle.d.l().i, com.vk.toggle.d.l().j), new bdr0.c(R.string.update_install, u0v0Var.c, R.string.update_installation_error)));
            case 8:
                return (VkWorkoutWidgetComponent) ((k7m) m7m.f((j3w0) obj)).a(fpf0.a(VkWorkoutWidgetComponent.class));
            case 9:
                ((sow0) obj).c.a(a.h.C2043a.a);
                return s3q0.a;
            case 10:
                ((vsw0) obj).invoke();
                return s3q0.a;
            case 11:
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj;
                int i5 = VoipPastCallsFragment.a0;
                vhg.d dVar = vhg.d.b;
                voipPastCallsFragment.getClass();
                xn50.a.c(voipPastCallsFragment, dVar);
                return s3q0.a;
            case 12:
                return (ViewFlipper) ((oxw0) obj).findViewById(R.id.voip_schedule_call_flipper);
            default:
                ((qgx0) obj).c.g();
                return s3q0.a;
        }
    }
}
