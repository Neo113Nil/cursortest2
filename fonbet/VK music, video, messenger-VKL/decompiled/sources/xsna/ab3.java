package xsna;

import android.graphics.Path;
import com.vk.clips.viewer.impl.di.ClipActionsComponentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.music.snippet.player.di.AudioSnippetComponentImpl;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.task.di.components.SuperAppMinimizablePlayerComponentImpl;
import java.util.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ab3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ab3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return asu0.a.A(5, "vk-toggle-scheduler-thread");
            case 1:
                return new ClipActionsComponentImpl.a();
            case 2:
                return new Path();
            case 3:
                return new zhr();
            case 4:
                return rhs.e();
            case 5:
                return jrd.a;
            case 6:
                zdw zdwVar = i7o0.b;
                return (zdwVar != null ? zdwVar : null).e().c();
            case 7:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_PLAYER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 8:
                return new AudioSnippetComponentImpl.a();
            case 9:
                CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 10:
                qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
                VkHttpCallFactory vkHttpCallFactory = new VkHttpCallFactory(VkHttpCallFactory.MediaType.MUSIC, new nm0(25));
                o260 o260Var = d260.a;
                return new ig40(vkHttpCallFactory, (o260Var != null ? o260Var : null).b(NetworkClient.ClientType.CLIENT_IMAGE_LOADER));
            case 11:
                UiTracker uiTracker = UiTracker.a;
                return UiTracker.c();
            case 12:
                return ((QueueSyncComponent) ((k7m) m7m.f(t6g0.b)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 13:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new p870();
            case 14:
                qcy<Object>[] qcyVarArr3 = SuperAppMinimizablePlayerComponentImpl.g;
                return io.reactivex.rxjava3.subjects.d.O0(Optional.empty());
            default:
                return new TabbarSettingsComponentImpl.a();
        }
    }
}
