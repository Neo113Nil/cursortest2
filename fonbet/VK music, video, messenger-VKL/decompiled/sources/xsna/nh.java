package xsna;

import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.ecomm.market.api.ctabutton.di.ProductTileCtaButtonComponent$Companion$STUB$1;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.friends.impl.di.FeedFriendsComponentImpl;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUiComponentVkApp;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.isd0;
import xsna.lwv;
import xsna.p4r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nh implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nh(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 2;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = ph.n1;
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 1:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_CHOICES_BOTTOM_SHEET_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 2:
                AlbumChooseFragmentInternalComponent.a aVar = AlbumChooseFragmentInternalComponent.g;
                bpn0 bpn0Var = fxc0.a;
                return (g7s0) (bpn0Var != null ? bpn0Var : null).getValue();
            case 3:
                return new float[3];
            case 4:
                qcy<Object>[] qcyVarArr2 = BookingMastersScreenFragmentMvi2.S;
                return null;
            case 5:
                qcy<Object>[] qcyVarArr3 = ClipsUploadSdkUiComponentVkApp.c;
                return new skf();
            case 6:
                return new uft0();
            case 7:
                qcy<Object>[] qcyVarArr4 = ClipsViewerComponentImpl.o0;
                return new sgj0();
            case 8:
                return new s290();
            case 9:
                return new nhs(new jwx(2, 80));
            case 10:
                qcy<Object>[] qcyVarArr5 = FeedFriendsComponentImpl.f;
                return new hqs();
            case 11:
                return new p4r.a();
            case 12:
                return new lu();
            case 13:
                und0 und0Var = new und0();
                nsd0 nsd0Var = new nsd0();
                iid0 iid0Var = new iid0();
                return e43.l(new Pair(zcw.c, new bpn0(new z3i(und0Var, 20))), new Pair(azv.c, new bpn0(new tju(und0Var, i))), new Pair(eyv.c, new bpn0(new yqf(und0Var, 24))), new Pair(czv.c, new bpn0(new zqf(und0Var, 29))), new Pair(gaw.c, new bpn0(new b1j(und0Var, 25))), new Pair(hyv.c, new bpn0(new bzj(nsd0Var, 17))), new Pair(oyv.b, new bpn0(new nuj(iid0Var, 13))), new Pair(qyv.b, new bpn0(new v3n(iid0Var, 10))), new Pair(syv.b, new bpn0(new p3h(new lwv.c(), 26))));
            case 14:
                return ((OAuthComponent) x6y.H().a(fpf0.a(OAuthComponent.class))).p1();
            case 15:
                return p9y.b;
            case 16:
                return Float.valueOf(iah0.b(8.0f));
            case 17:
                return new tzr0();
            case 18:
                pqo pqoVar = jwz.a;
                return null;
            case 19:
                return new int[]{R.id.reaction_tab_1, R.id.reaction_tab_2, R.id.reaction_tab_3, R.id.reaction_tab_4, R.id.reaction_tab_5, R.id.reaction_tab_6, R.id.reaction_tab_7, R.id.reaction_tab_8};
            case 20:
                return new hy40();
            case 21:
                OfflineCatalogCategories.c cVar = OfflineCatalogCategories.Companion;
                return Boolean.TRUE;
            case 22:
                return new Regex("[A-Za-z0-9]+");
            case 23:
                qcy<Object>[] qcyVarArr6 = ProductTileCtaButtonComponent$Companion$STUB$1.c;
                return isd0.a.a.getSTUB();
            case 24:
                return new gdp();
            case 25:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.CONSENT_SCREEN, null, null, null, 12);
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.k0().b;
            case 28:
                return new qxq();
            default:
                return new dz60();
        }
    }

    public /* synthetic */ nh(x6y x6yVar) {
        this.b = 14;
    }
}
