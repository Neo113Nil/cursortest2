package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase_Impl;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.voip.api.dto.VoipCallOnStartAction;
import com.vk.voip.ui.call_by_link.feature.events.VoipCallByLinkNavigationEvent;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.g7n0;
import xsna.khw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c9m0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c9m0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        VoipCallOnStartAction.SetupMediaOptions.MediaOptionState mediaOptionState;
        VoipCallOnStartAction.SetupMediaOptions.MediaOptionState mediaOptionState2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = d9m0.n1;
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((d9m0) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).k7();
            case 1:
                return new qhm0((StoryStatisticsDatabase_Impl) obj);
            case 2:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj;
                int i3 = SuperAppFragment.o0;
                if (!jjc.d().a()) {
                    g7n0.b d = superAppFragment.d0.d();
                    if (d != null) {
                        d.g();
                    }
                    q7n0.a().a().h(superAppFragment.requireContext());
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((ToolbarRedesignVh) obj).w);
            case 4:
                Boolean bool = (Boolean) ((mtk0) obj).getValue();
                bool.booleanValue();
                return bool;
            case 5:
                throw null;
            case 6:
                return ((InfoBridgeComponent) ((isq0) obj).f.l.a(fpf0.a(InfoBridgeComponent.class))).t().b();
            case 7:
                FragmentActivity activity = ((g8r0) obj).a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((mnr0) obj).requireArguments().getBoolean("args_is_premium"));
            case 9:
                return ((QueueSyncComponent) ((k7m) m7m.f((ppr0) obj)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 10:
                return VideoAboutFragment.go((VideoAboutFragment) obj);
            case 11:
                int i4 = VideoCatalogFragment.l0;
                return ((VkClientMultiAccountComponent) m7m.d((VideoCatalogFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 12:
                return VideoEpisodesFragment.ho((VideoEpisodesFragment) obj);
            case 13:
                return new ScreenModeVideoStatMapper(((com.vk.libvideo.tracker.b) obj).a.b3());
            case 14:
                com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) obj;
                return new h9t0(new wd8(cVar, 14), cVar.A, cVar.k, cVar.f, new xd8(cVar, 10), new a8t0(1, cVar, com.vk.video.profile.presentation.c.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0), (j7t0) cVar.t.getValue(), cVar.e, new b8t0(3, cVar, com.vk.video.profile.presentation.c.class, "notifyChangeState", "notifyChangeState(Lcom/vk/video/profile/presentation/models/StateSubscribeNotification;Lcom/vk/dto/common/id/UserId;Z)V", 0));
            case 15:
                z8u0 z8u0Var = (z8u0) obj;
                Context j = z8u0Var.d.j();
                return j == null ? z8u0Var.e : j;
            case 16:
                ggu0 ggu0Var = (ggu0) obj;
                return new mbj0(ggu0Var.d, new qzl0(ggu0Var, 16));
            case 17:
                int i5 = VoipCallByLinkFragment.T;
                VoipCallByLinkNavigationEvent.ToStartCall toStartCall = (VoipCallByLinkNavigationEvent.ToStartCall) ((VoipCallByLinkNavigationEvent) obj);
                UserId userId = toStartCall.a;
                VoipCallOnStartAction.f fVar = new VoipCallOnStartAction.f(toStartCall.b);
                VoipCallOnStartAction.b bVar = new VoipCallOnStartAction.b(toStartCall.c);
                VoipCallOnStartAction.c cVar2 = new VoipCallOnStartAction.c(toStartCall.d);
                int i6 = VoipCallByLinkFragment.b.$EnumSwitchMapping$0[toStartCall.e.ordinal()];
                if (i6 == 1) {
                    mediaOptionState = VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.UNMUTED;
                } else if (i6 == 2) {
                    mediaOptionState = VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.UNMUTED_BUT_MUTED_ONCE;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mediaOptionState = VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.MUTED_PERMANENT;
                }
                int i7 = VoipCallByLinkFragment.b.$EnumSwitchMapping$1[toStartCall.f.ordinal()];
                if (i7 == 1) {
                    mediaOptionState2 = VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.UNMUTED;
                } else if (i7 == 2) {
                    mediaOptionState2 = VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.UNMUTED_BUT_MUTED_ONCE;
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mediaOptionState2 = VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.MUTED_PERMANENT;
                }
                Set y0 = rl3.y0(new VoipCallOnStartAction[]{VoipCallOnStartAction.a.a, fVar, bVar, cVar2, new VoipCallOnStartAction.SetupMediaOptions(mediaOptionState, mediaOptionState2)});
                VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY_CREATE, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_CREATE_BY_LINK);
                khw0 a = a201.b().a();
                EmptySet emptySet = EmptySet.b;
                if (userId == null) {
                    userId = UserId.d;
                }
                a.d(new khw0.a(new zqk0(null, 0L, "", "", "", false, false, emptySet, true, userId, null, null, null, 0, toStartCall.g, null, null, null, false, false, false, 4160001), voipCallSource, null, null, y0, 12));
                return s3q0.a;
            default:
                int i8 = WriteBar.h0;
                return ((WriteBar) obj).findViewById(R.id.writebar_record_tip);
        }
    }

    public /* synthetic */ c9m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
