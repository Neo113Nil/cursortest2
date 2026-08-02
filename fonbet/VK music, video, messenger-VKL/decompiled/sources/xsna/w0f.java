package xsna;

import com.vk.attachpicker.impl.di.AttachPickerComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.notification.settings.impl.MessengerNotificationSettingsComponentImpl;
import com.vk.mediastore.storage.MediaStorage;
import com.vk.music.offline.configs.impl.di.AudioRestrictionComponentImpl;
import com.vk.music.podcast.impl.di.PodcastComponentImpl;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;
import com.vk.sidecontrols.impl.di.AnimatedSharingViewProviderComponentImpl;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.VKApplication;
import xsna.wdx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class w0f implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ w0f(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                return new AnimatedSharingViewProviderComponentImpl.a();
            case 1:
                return Preference.j();
            case 2:
                MediaStorage mediaStorage = MediaStorage.b;
                return MediaStorage.b(0L, "");
            case 3:
                return ((CommunitiesCatalogComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(CommunitiesCatalogComponent.class))).a().c();
            case 4:
                return new AudioRestrictionComponentImpl.a();
            case 5:
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.b()) {
                    CoreFeatures coreFeatures = CoreFeatures.API_STREAM_RESPONSE_PARSE;
                    coreFeatures.getClass();
                    if (bVar.a(coreFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 6:
                return Boolean.valueOf(fxc0.B().J().b());
            case 7:
                return new hj9(new w9(23), OKVoipEngine.E, new sk4(27), new OKVoipEngine.g(OKVoipEngine.b));
            case 8:
                return new csx0(new qus(ow90.e));
            case 9:
                qcy<Object>[] qcyVarArr = PodcastComponentImpl.g;
                return new egb0();
            case 10:
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                return o260Var.f(NetworkClient.ClientType.CLIENT_SSE);
            case 11:
                VKApplication.a aVar = VKApplication.c;
                return ((ProductTileCtaButtonComponent) m7m.e().a(fpf0.a(ProductTileCtaButtonComponent.class))).W5();
            case 12:
                dhr0.a.getClass();
                return dhr0.E();
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_TWO_STEP_ONBOARDING;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                return Boolean.valueOf(fxc0.B().J().s1());
            case 15:
                return new MessengerNotificationSettingsComponentImpl.a();
            case 16:
                return new AttachPickerComponentImpl.a();
            case 17:
                qcy<Object>[] qcyVarArr2 = VoipAnalyticsInternalComponent.b;
                return new epw0(new b3x0());
            case 18:
                return com.vk.voip.ui.c.O;
            default:
                return new wdx0.b();
        }
    }

    public /* synthetic */ w0f(VKApplication vKApplication) {
        this.b = 11;
    }
}
