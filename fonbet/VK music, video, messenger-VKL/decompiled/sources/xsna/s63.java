package xsna;

import android.content.Context;
import com.vk.clips.external.nps.impl.di.ClipsExternalNpsComponentImpl;
import com.vk.dzenarticle.impl.di.DzenArticleComponentImpl;
import com.vk.music.podcast.impl.di.PodcastComponentImpl;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.subscription.impl.di.SubscriptionComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.glo;
import xsna.pzv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class s63 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ s63(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 18;
        switch (this.b) {
            case 0:
                asu0.a.getClass();
                asu0.n().execute(new o52(1));
                return s3q0.a;
            case 1:
                vx2.a.getClass();
                return vx2.b().a.g;
            case 2:
                return new ClipsExternalNpsComponentImpl.a();
            case 3:
                return Boolean.valueOf(fxc0.B().J().s1());
            case 4:
                Context e = ((lrv0) glo.b.getValue()).e();
                return new glo.a(e, e.getResources());
            case 5:
                return new Regex("width=\"(\\d+)", RegexOption.MULTILINE);
            case 6:
                wjy wjyVar = wjy.a;
                return 1000L;
            case 7:
                return ((QueueSyncComponent) ((k7m) m7m.f(f620.b)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 8:
                return new pzv.b(new kk1(13), new ig(i), new i21(17));
            case 9:
                return new PodcastComponentImpl.a();
            case 10:
                FeedFeatures feedFeatures = FeedFeatures.DS_AUDIO_ATTACH;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 11:
                VKApplication.a aVar = VKApplication.c;
                com.vk.core.utils.newtork.b.a.getClass();
                return Boolean.valueOf(com.vk.core.utils.newtork.b.d());
            case 12:
                VKApplication.a aVar2 = VKApplication.c;
                return m7m.e();
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.DELEGATE_REMOVE_LISTENER_ON_UNFOCUS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                return new Regex("expires[/=](\\d+)");
            case 15:
                t03 t03Var = new t03(12);
                j55 j55Var = new j55(i);
                asu0.a.getClass();
                return new ese0(t03Var, j55Var, asu0.n());
            case 16:
                return new SubscriptionComponentImpl.a();
            case 17:
                return new DzenArticleComponentImpl.a();
            case 18:
                return new gun0();
            default:
                return asu0.j;
        }
    }

    public /* synthetic */ s63(VKApplication vKApplication) {
        this.b = 12;
    }
}
