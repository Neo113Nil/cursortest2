package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.video.VideoProfileHorizontallScrollItemWithHighlightVh;
import com.vk.catalog2.common.ui.mvp.holder.group.delegate.SimpleGroupItemDelegate;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.mail.libverify.controls.VerificationController;
import xsna.ipp0;
import xsna.mgn0;
import xsna.o880;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3j0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d3j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        VerificationController.State lambda$getState$4;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((NewsFeedComponent) ((k7m) m7m.f((e3j0) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 1:
                return (RecyclerView) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_apps_list);
            case 2:
                com.vk.catalog2.common.ui.holders.group.a.c(((SimpleGroupItemDelegate) obj).o, true);
                return s3q0.a;
            case 3:
                SingleClipV2Holder singleClipV2Holder = (SingleClipV2Holder) obj;
                singleClipV2Holder.H = p880.a(singleClipV2Holder.H, true, 0, 2);
                singleClipV2Holder.b7(new o880.b(true));
                return s3q0.a;
            case 4:
                nvk0 nvk0Var = (nvk0) obj;
                return new b1r(nvk0Var.c.p(), nvk0Var.c.F());
            case 5:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj;
                int i2 = StoryMediaPickerFragment.d0;
                a.c cVar = a.c.b;
                storyMediaPickerFragment.getClass();
                xn50.a.c(storyMediaPickerFragment, cVar);
                return s3q0.a;
            case 6:
                return StoryStatisticsViewersFragment.go((StoryStatisticsViewersFragment) obj);
            case 7:
                int i3 = zfp0.x1;
                return ((MusicPrefsComponent) m7m.d((zfp0) obj).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 8:
                qcy<Object>[] qcyVarArr = ipp0.m1;
                return new ipp0.d((ipp0) obj);
            case 9:
                return z9r.a(((dbq0) obj).a, "delete(): file ");
            case 10:
                lambda$getState$4 = ((VerificationController) obj).lambda$getState$4();
                return lambda$getState$4;
            case 11:
                int i4 = VideoCatalogRootVh.M0;
                return (VideoGrowthComponent) ((k7m) m7m.f((VideoCatalogRootVh) obj)).a(fpf0.a(VideoGrowthComponent.class));
            case 12:
                ((ihs0) obj).dismiss();
                return s3q0.a;
            case 13:
                return ((AuthBridgeComponent) ((VideoGrowthComponentImpl) obj).c.getValue()).s();
            case 14:
                return Boolean.valueOf(((g7s0) obj).J().F0());
            case 15:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj;
                return new veg0(gVar.p0, gVar.z.b3());
            case 16:
                VideoMinimizableDiscoveryFragment.b bVar = ((VideoMinimizableDiscoveryFragment) obj).U;
                return (bVar != null ? bVar : null).b.h.a;
            case 17:
                return (BridgeComponent) ((f8m) obj).a(fpf0.a(BridgeComponent.class));
            case 18:
                ((VideoOfflineFragment) obj).R0.invoke();
                return s3q0.a;
            case 19:
                return ((BridgeComponent) ((k7m) m7m.f((VideoProfileHorizontallScrollItemWithHighlightVh) obj)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 20:
                xht0 xht0Var = (xht0) obj;
                xht0Var.f.Qc("video_quality");
                xht0Var.b = null;
                return s3q0.a;
            case 21:
                return mgn0.h.a.a((keu0) obj, "SAK_low_prority", 0, 6);
            case 22:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                agu0 agu0Var = (agu0) aVar.s.getValue();
                mfu0 un = aVar.un();
                fvv0 M = un.getState().g().a.M();
                long appId = M != null ? M.getAppId() : uhx.a().a;
                if (M != null) {
                    M.v();
                }
                HashMap hashMap = new HashMap();
                hashMap.put(VkUiCommand.PHONE, new jwv0(aVar));
                hashMap.put(VkUiCommand.EMAIL, new fwv0());
                hashMap.put(VkUiCommand.COPY_TEXT, new rvv0());
                hashMap.put(VkUiCommand.OPEN_QR, new qwv0(aVar, appId));
                hashMap.put(VkUiCommand.OPEN_CONTACTS, new pvv0(aVar));
                hashMap.put(VkUiCommand.COMMUNITY_WIDGET_PREVIEW_BOX, new lxv0());
                hashMap.put(VkUiCommand.LEAVE_GROUP, new pwv0());
                hashMap.put(VkUiCommand.KEEP_SCREEN_ON, new lwv0(aVar));
                LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
                Map<VkUiCommand, dvv0> z = agu0Var.z(appId);
                if (z != null) {
                    linkedHashMap.putAll(z);
                }
                r6y r6yVar = un.getState().g().a;
                ovv0 ovv0Var = new ovv0();
                fvv0 M2 = r6yVar.M();
                if (M2 != null) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        dvv0 dvv0Var = (dvv0) ((Map.Entry) it.next()).getValue();
                        ux90 T = M2.T();
                        dvv0Var.b = r6yVar;
                        dvv0Var.c = T;
                    }
                    ovv0Var.a = linkedHashMap;
                }
                return ovv0Var;
            case 23:
                return ((VkCheckEditText) obj).d.getText().toString();
            case 24:
                int i5 = cdw0.o1;
                return ((VoipCallComponent) m7m.d((cdw0) obj).a(fpf0.a(VoipCallComponent.class))).L1();
            default:
                int i6 = WriteBarButtonsBubbleView.h;
                return ((WriteBarButtonsBubbleView) obj).findViewById(R.id.writebar_attach);
        }
    }
}
