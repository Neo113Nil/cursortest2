package xsna;

import android.app.Activity;
import android.graphics.RectF;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.bridges.ProfileType;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.user.UserProfile;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.qrcode.QRStatsTracker;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.video.assistant.api.di.AiAssistantComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.di.VideoAsyncInflaterComponent;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x1e0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x1e0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if ((r0.c instanceof com.vk.libvideo.api.minimizable.VideoMinimizableState.Expanded) != false) goto L24;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        VkSearchView vkSearchView;
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                bqu0 bqu0Var = ((a2e0) obj).b;
                if (bqu0Var != null) {
                    bqu0Var.show();
                }
                return s3q0.a;
            case 1:
                itg0.m(rsg0.T(new yjs(((UserProfile) obj).c, (String) null)));
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.ADD_FRIEND);
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return ((ReactionsFeedFragment) obj).ho();
            case 3:
                return Integer.valueOf(((kcf0) obj).getBindingAdapterPosition());
            case 4:
                Activity activity = (Activity) obj;
                if (activity != null) {
                    activity.finishAndRemoveTask();
                }
                rgd0.a.getClass();
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 5:
                ((Runnable) obj).run();
                return s3q0.a;
            case 6:
                afi0 afi0Var = (afi0) obj;
                if (afi0Var.w == SearchMode.FULL && (vkSearchView = afi0Var.i) != null) {
                    vkSearchView.f5(false);
                }
                return s3q0.a;
            case 7:
                return (RecyclerView) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.targets_recycler);
            case 8:
                HorizontalRecyclerPaginationView a = ((znj0) obj).h().a();
                if (a != null) {
                    a.lb();
                }
                return s3q0.a;
            case 9:
                return Integer.valueOf(((jhk0) obj).b.size());
            case 10:
                bpn0 bpn0Var = enj.a;
                return e3m.h((l7s) obj);
            case 11:
                int i2 = StoryMediaPickerFragment.d0;
                return ((InfoBridgeComponent) m7m.d((StoryMediaPickerFragment) obj).a(fpf0.a(InfoBridgeComponent.class))).t();
            case 12:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.c(((o8m0) obj).b)).a(fpf0.a(StoryEditorExtDepsComponent.class))).k7();
            case 13:
                int i3 = StoryStatisticsViewersFragment.f0;
                return ((StoriesComponent) m7m.d((StoryStatisticsViewersFragment) obj).a(fpf0.a(StoriesComponent.class))).b7();
            case 14:
                return ((com.vk.story.viewer.impl.presentation.stories.b) obj).getViewEntryPoint();
            case 15:
                return xpm0.a(((wak0) ((hsn0) obj).a).getIntValue());
            case 16:
                return (RectF) obj;
            case 17:
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) obj;
                dw20 dw20Var = userProfileDialogs.l;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                userProfileDialogs.l = null;
                return s3q0.a;
            case 18:
                int i4 = UserProfileFragment.p0;
                return (NewsFeedComponent) m7m.d((UserProfileFragment) obj).a(fpf0.a(NewsFeedComponent.class));
            case 19:
                Object systemService = ((ggu0) ((v6r0) obj).f.c).b.getSystemService("accessibility");
                if (systemService instanceof AccessibilityManager) {
                    return (AccessibilityManager) systemService;
                }
                return null;
            case 20:
                BrowserPerfState browserPerfState = ((ker0) obj).G;
                if (browserPerfState != null) {
                    return browserPerfState;
                }
                return null;
            case 21:
                return new vlm(((com.vk.im.ui.components.msg_search.vc.d) obj).a);
            case 22:
                return ((AiAssistantComponent) ((k7m) m7m.f((b9s0) obj)).mo408a(fpf0.a(AiAssistantComponent.class))).Sd();
            case 23:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj;
                int i5 = VideoCatalogRootVh.M0;
                vtk0.d().d(videoCatalogRootVh.R(), videoCatalogRootVh.f0.n);
                return s3q0.a;
            case 24:
                gas0 gas0Var = (gas0) obj;
                if (o25.a().c0() != ProfileType.RELATED) {
                    ((vqs0) gas0Var.j.getValue()).getClass();
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                int i6 = VideoCommentThreadFragment.B0;
                return ((AttachmentMappersComponent) m7m.d((VideoCommentThreadFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 26:
                return ((VideoSeekComponent) ((k7m) m7m.f((VideoItemListLargeVh) obj)).mo408a(fpf0.a(VideoSeekComponent.class))).E1();
            case 27:
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                VideoMinimizableState P0 = ((VideoMinimizableDiscoveryFragment) obj).b3().P0();
                if (P0 != null) {
                    if (!(P0 instanceof VideoMinimizableState.Expanded)) {
                        if (P0 instanceof VideoMinimizableState.Animating) {
                            VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) P0;
                            if (animating.b instanceof VideoMinimizableState.Hidden) {
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 28:
                return (VideoAsyncInflaterComponent) ((f8m) obj).a(fpf0.a(VideoAsyncInflaterComponent.class));
            default:
                int i8 = VideoOfflineFragment.f1;
                FragmentActivity activity2 = ((VideoOfflineFragment) obj).getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
                return s3q0.a;
        }
    }
}
