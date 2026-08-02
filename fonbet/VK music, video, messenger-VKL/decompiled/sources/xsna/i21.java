package xsna;

import com.vk.clips.attachments.api.di.ClipsAttachmentsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.preference.Preference;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.ui.impl.catalog.GlobalSearchPeopleCatalogFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.libverify.js.bridge.impl.di.JsLibverifyDelegateComponentImpl;
import com.vk.toggle.features.SmbFeatures;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.bbv0;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class i21 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ i21(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return k840.a.g().b();
            case 3:
                return s3q0.a;
            case 4:
                ClipsAttachmentsComponentStub.f.getClass();
                return new com.vk.clips.attachments.api.di.a();
            case 5:
                return s3q0.a;
            case 6:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                int i = 7;
                return new uqd(new cj4(10), new tj2(i), new nd1(9), new fn4(i));
            case 7:
                CoverChooseFragmentInternalComponent.a aVar = CoverChooseFragmentInternalComponent.e;
                return g1k.b;
            case 8:
                return new GlobalSearchPeopleCatalogFragment.a(GlobalSearchPeopleCatalogFragment.class, null, null).f();
            case 9:
                return new u1r0();
            case 10:
                int i2 = GamesCatalogDetailFragment.d0;
                int i3 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 11:
                return new x7k(cn70.b(4));
            case 12:
                return new iid0();
            case 13:
                return new i1t0(true, bo.h());
            case 14:
                qcy<Object>[] qcyVarArr2 = JsLibverifyDelegateComponentImpl.b;
                return new t4y();
            case 15:
                return new Regex("login\\.(vk|vkontakte)\\.(com|ru|me)");
            case 16:
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 17:
                o2l.a.getClass();
                return Long.valueOf(BuildInfo.h() ? Preference.j().getLong("__dbg_lp_sync_start_delay_ms", 0L) : 0L);
            case 18:
                return s3q0.a;
            case 19:
                int i4 = ku30.n;
                return Boolean.TRUE;
            case 20:
                return s3q0.a;
            case 21:
                return new zc7(0);
            case 22:
                qcy<Object>[] qcyVarArr3 = NewsfeedFragment.J0;
                return new y3v();
            case 23:
                return "Fragment.onPause";
            case 24:
                return new jwx(2, 30);
            case 25:
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (com.vk.libvideo.autoplay.e.g()) {
                    VideoMinifiedPlayerStateHolder.a.getClass();
                    if (!VideoMinifiedPlayerStateHolder.a()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 27:
                return new a390();
            case 28:
                return Long.valueOf(ProcessorStatistics.c());
            default:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.d(SchemeStatSak$EventScreen.PARTIAL_SILENT_EXPAND_PASSWORD, null, null, 12);
                return s3q0.a;
        }
    }
}
