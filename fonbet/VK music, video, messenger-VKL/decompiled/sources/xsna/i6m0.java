package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.libvideo.api.di.VideoPlaylistVideosComponent;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.video.assistant.api.di.AiAssistantComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.xcw0;
import xsna.zuu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i6m0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i6m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (xsna.iah0.r(r2.requireContext()) != false) goto L29;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        com.vk.video.ui.discovery.minimizable.m mVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = StoryMediaPickerFragment.d0;
                return ((StoriesComponent) m7m.d((StoryMediaPickerFragment) obj).a(fpf0.a(StoriesComponent.class))).Ca();
            case 1:
                int i3 = StoryStatisticsViewersFragment.f0;
                return ((StoryViewerComponent) m7m.d((StoryStatisticsViewersFragment) obj).a(fpf0.a(StoryViewerComponent.class))).Nd();
            case 2:
                int i4 = x9n0.p1;
                return ((BridgeComponent) m7m.d((x9n0) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 3:
                int i5 = zfp0.x1;
                return ((PlayerAnalyticsComponent) m7m.d((zfp0) obj).a(fpf0.a(PlayerAnalyticsComponent.class))).z7();
            case 4:
                return "generateUploadFile: file " + ((File) obj) + " already existed. Increment suffix";
            case 5:
                gzs gzsVar = (gzs) ((Ref$ObjectRef) obj).element;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 6:
                int i6 = UserProfileFragment.p0;
                return (NewsFeedBridgeComponent) ((k7m) m7m.f((UserProfileFragment) obj)).a(fpf0.a(NewsFeedBridgeComponent.class));
            case 7:
                WebApiApplication webApiApplication = (WebApiApplication) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                superappUiRouterBridge.W(webApiApplication, null);
                return s3q0.a;
            case 8:
                return new xuv0(new nid0((ker0) obj, 17));
            case 9:
                VideoBottomPanelView videoBottomPanelView = (VideoBottomPanelView) obj;
                View.OnClickListener onClickListener = videoBottomPanelView.z;
                if (onClickListener != null) {
                    onClickListener.onClick(videoBottomPanelView.L);
                }
                return s3q0.a;
            case 10:
                return ((AiAssistantComponent) ((k7m) m7m.f((b9s0) obj)).mo408a(fpf0.a(AiAssistantComponent.class))).a();
            case 11:
                return ((VideoCatalogRootVh) obj).b0;
            case 12:
                return (AuthBridgeComponent) ((g8m) obj).a(fpf0.a(AuthBridgeComponent.class));
            case 13:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                if (videoMinimizableDiscoveryFragment.oo() && (mVar = videoMinimizableDiscoveryFragment.J0) != null) {
                    z = true;
                    if (com.vk.video.ui.discovery.minimizable.m.h(mVar.c())) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 14:
                return (VideoPlaylistVideosComponent) ((f8m) obj).c(fpf0.a(VideoPlaylistVideosComponent.class));
            case 15:
                zuu0.a aVar = ((zuu0) obj).f;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
            case 16:
                return new ulw0(((ylw0) obj).u1);
            case 17:
                ((nrw0) obj).q(xcw0.c0.a);
                return s3q0.a;
            case 18:
                return LayoutInflater.from(((qyw0) obj).a).inflate(R.layout.voip_call_scheduled_media_setting_view, (ViewGroup) null);
            default:
                int i8 = WriteBarButtonsBubbleView.h;
                return ((WriteBarButtonsBubbleView) obj).findViewById(R.id.writebar_settings_new);
        }
    }

    public /* synthetic */ i6m0(ubr0 ubr0Var, WebApiApplication webApiApplication) {
        this.b = 7;
        this.c = webApiApplication;
    }
}
