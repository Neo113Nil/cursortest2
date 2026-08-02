package xsna;

import com.vk.catalog.mvi.section.screen.impl.di.CatalogSectionScreenComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.music.notifications.subscription.MusicBuyMusicSubscriptionFragment;
import com.vk.music.player.playback.PlayableType;
import com.vk.newsfeed.impl.postmodal.reactions.di.ModalPostReactionsComponentImpl;
import com.vk.profile.community.creationonboarding.impl.di.CreationOnboardingComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import xsna.ds60;
import xsna.z8n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class nh0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nh0(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new DecimalFormat("#.##", new DecimalFormatSymbols());
            case 1:
                qcy<Object>[] qcyVarArr = CatalogSectionScreenComponentImpl.b;
                return new nfa();
            case 2:
                return s3q0.a;
            case 3:
                return "showChannel: ";
            case 4:
                SoccomFeatures soccomFeatures = SoccomFeatures.CHECKOUT_NEW_FLOW;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 5:
                return s3q0.a;
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new yne();
            case 7:
                return new zqu();
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                L.e("Room participants update completed");
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr3 = CreationOnboardingComponentImpl.d;
                return new ybk();
            case 12:
                return e43.l(z8n.a.C4166a.b, new t8n(ds60.a.C2747a.b), new t8n(ds60.a.b.b));
            case 13:
                return new p4r();
            case 14:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 15:
                return new y1q0(0);
            case 16:
                return new srs();
            case 17:
                qcy<Object>[] qcyVarArr4 = com.vk.geo.impl.presentation.b.H;
                return Boolean.FALSE;
            case 18:
                return new p8w(jgp.b);
            case 19:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_LINKVH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 20:
                return new qog();
            case 21:
                return s3q0.a;
            case 22:
                return new afq0();
            case 23:
                qcy<Object>[] qcyVarArr5 = ModalPostReactionsComponentImpl.b;
                return new tst(new att(), new ttt());
            case 24:
                return new dy30();
            case 25:
                int i = MusicBuyMusicSubscriptionFragment.V;
                return Boolean.valueOf(MusicFeatures.SUBSCRIPTION_NAV_SCREENS.h());
            case 26:
                return new s550();
            case 27:
                return s3q0.a;
            case 28:
                return new q4b0(new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null), PlayableType.MUSIC_TRACK, false, 0L, (r4b0) r4b0.e.getValue());
            default:
                return Boolean.valueOf(MusicFeatures.AUDIO_KIDS_MODE.h());
        }
    }
}
