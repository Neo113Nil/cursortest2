package xsna;

import com.vk.api.sdk.utils.log.Logger;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.upload.vk.impl.di.ClipsUploadVkComponentImpl;
import com.vk.community.strikes.impl.di.CommunityStrikesComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.ecomm.market.impl.photoviewer.di.MarketPhotoviewerComponentImpl;
import com.vk.ecomm.orders.impl.di.MarketOrdersComponentImpl;
import com.vk.feed.blacklist.impl.di.BlacklistComponentImpl;
import com.vk.im.engine.di.experiments.ImExperimentsComponentImpl;
import com.vk.importcontacts.impl.di.ImportContactsComponentImpl;
import com.vk.libvideo.impl.di.VideoPlaylistVideosComponentImpl;
import com.vk.splashscreen.api.di.SplashScreenComponent;
import com.vk.story.archive.impl.di.StoryArchiveComponentImpl;
import com.vkontakte.android.VKApplication;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class c13 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ c13(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Preference.j().getBoolean("__dbg_api", false) ? Logger.LogLevel.VERBOSE : Logger.LogLevel.WARNING;
            case 1:
                qcy<Object>[] qcyVarArr = BlacklistComponentImpl.c;
                return new je7();
            case 2:
                qcy<Object>[] qcyVarArr2 = ClipsUploadVkComponentImpl.h;
                return new x9c0();
            case 3:
                return new CommunityStrikesComponentImpl.a();
            case 4:
                return new StoryArchiveComponentImpl.a();
            case 5:
                return l9u0.a;
            case 6:
                throw null;
            case 7:
                return new Regex("^[a-z0-9_.]{5,}$");
            case 8:
                return o25.a().i().P;
            case 9:
                x870 x870Var = x870.a;
                return e43.l("private_messages_ver2", "group_chats_ver2", "community_channels_messages", RTCStatsConstants.KEY_CHANNELS);
            case 10:
                return new ImExperimentsComponentImpl.a();
            case 11:
                qcy<Object>[] qcyVarArr3 = MarketOrdersComponentImpl.b;
                return new iy80();
            case 12:
                return new jqb();
            case 13:
                return new MarketPhotoviewerComponentImpl.a();
            case 14:
                return ((vz2) dgn0.b.getValue()).a();
            case 15:
                VKApplication.a aVar = VKApplication.c;
                asu0.a.getClass();
                return asu0.h();
            case 16:
                VKApplication.a aVar2 = VKApplication.c;
                v94 v94Var = new v94(13);
                b25 a = o25.a();
                gbl gblVar = new gbl(v94Var, 5);
                if (a.b()) {
                    gblVar.invoke();
                } else {
                    a.b0(new n25(gblVar));
                }
                return s3q0.a;
            case 17:
                return new SplashScreenComponent.a();
            case 18:
                return new ImportContactsComponentImpl.a();
            case 19:
                return new VideoPlaylistVideosComponentImpl.a();
            case 20:
                return new ebl();
            case 21:
                chr0 chr0Var = new chr0(10);
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                return new r5x0(chr0Var, cVar, com.vk.voip.ui.c.H());
            case 22:
                return new cjt();
            default:
                return ((BridgeComponent) ((k7m) m7m.f(qfx0.d)).a(fpf0.a(BridgeComponent.class))).x();
        }
    }

    public /* synthetic */ c13(Object obj, int i) {
        this.b = i;
    }
}
