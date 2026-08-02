package xsna;

import android.content.Context;
import com.vk.contacts.e;
import com.vk.core.apps.BuildInfo;
import com.vk.donut.video.impl.di.DonutVideoComponentImpl;
import com.vk.im.engine.di.sync.VkAppSynchronizationComponentImpl;
import com.vk.media.playback.di.MediaPlaybackComponentImpl;
import com.vk.music.player.core.di.EqualizerControllerComponentImpl;
import com.vk.passkey.api.di.PasskeyComponent;
import com.vk.posting.di.PostingComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.Features;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.profile.di.VideoProfileComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUploaderComponentVkApp;
import java.io.File;
import kotlin.random.Random;
import ru.ok.android.commons.app.ApplicationProvider;
import xsna.mgn0;
import xsna.qu70;
import xsna.s8t0;
import xsna.t99;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class cd3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cd3(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String installerPackageName_delegate$lambda$0;
        switch (this.b) {
            case 0:
                installerPackageName_delegate$lambda$0 = ApplicationProvider.installerPackageName_delegate$lambda$0();
                return installerPackageName_delegate$lambda$0;
            case 1:
                umu0 umu0Var = r55.g;
                return (String) (umu0Var != null ? umu0Var : null).t.invoke();
            case 2:
                return new ClipsUploadSdkUploaderComponentVkApp.a();
            case 3:
                return new e.b();
            case 4:
                return new PostingComponentImpl.a();
            case 5:
                qcy<Object>[] qcyVarArr = DonutVideoComponentImpl.j;
                return new g5o();
            case 6:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(com.vk.toggle.b.A.a(MusicFeatures.AUDIO_NEW_DOWNLOADED_TRACKS_DUPLICATE_FIX));
            case 7:
                return new EqualizerControllerComponentImpl.a();
            case 8:
                return new qu70.a(new nt8(new byte[0]));
            case 9:
                return ((PasskeyComponent) ((k7m) m7m.f(com.vk.onepasspromo.impl.a.b)).a(fpf0.a(PasskeyComponent.class))).i9();
            case 10:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new mjm0(new avl0(), x1o0.c(), new svl0(), new m220());
            case 11:
                mgn0 mgn0Var = jgn0.a;
                return ((mgn0.h) (mgn0Var != null ? mgn0Var : null).j.getValue()).c();
            case 12:
                VKApplication.a aVar = VKApplication.c;
                nb3.b.getClass();
                o2l.a.getClass();
                if (!o2l.b("__dbg_mem_leak", false) && BuildInfo.e()) {
                    Random.b.getClass();
                    if (Random.c.k(10) < 3) {
                        com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_ENABLE_LEAK_CANARY);
                    }
                }
                q5m.a().getClass();
                return s3q0.a;
            case 13:
                return new MediaPlaybackComponentImpl.a();
            case 14:
                return new VideoProfileComponentImpl.a(s8t0.a.a.getSTUB());
            case 15:
                qcy<Object>[] qcyVarArr3 = VkAppSynchronizationComponentImpl.c;
                a1w a1wVar = q1w.a;
                return new kxv(a1wVar != null ? a1wVar : null);
            case 16:
                return (String) com.vk.core.apps.a.c("", "com.vk.APP_MY_TRACKER_INSTALLATION_PARAMS");
            case 17:
                Context context = e43.a;
                return new File((context != null ? context : null).getFilesDir(), "vk_executors_config");
            case 18:
                return new clg();
            case 19:
                return new t99.a(0);
            case 20:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
            default:
                return new aix0();
        }
    }

    public /* synthetic */ cd3(VKApplication vKApplication) {
        this.b = 12;
    }
}
