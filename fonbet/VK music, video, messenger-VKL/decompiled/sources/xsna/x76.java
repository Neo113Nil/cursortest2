package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.clips.favorites.impl.ui.folders.renaming.view.ClipsFolderNameFormField;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.e8v0;
import xsna.qav;
import xsna.xbo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x76 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x76(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        CatalogProfileLocalState.FollowSource followSource;
        int i = this.b;
        int i2 = 2;
        boolean z = false;
        z = false;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((q7v0) ((k86) obj3).Y.getValue()).a((VkOnboardingCampaign) obj2, VkOnboardingType.Highlighter, e8v0.m.b);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                BuyMusicSubscriptionComposeButtonKt.b((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                orb orbVar = (orb) obj3;
                bwt0.o0(orbVar.l, orbVar.c.f(R.attr.vk_ui_icon_secondary));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                int i3 = ClipsFolderNameFormField.p;
                ((ClipsFolderNameFormField) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.profile.community.impl.ui.trust_mark.e.e((CommunityTrustMarksArgs.TrustMarkData) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                bgp.a((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                kym0 kym0Var = (kym0) obj3;
                UIBlock uIBlock = (UIBlock) obj2;
                boolean z2 = uIBlock instanceof UIBlockProfile;
                if (z2) {
                    UIBlockProfile uIBlockProfile = (UIBlockProfile) uIBlock;
                    pair = new Pair(uIBlockProfile.A, uIBlockProfile.z);
                } else {
                    if (!(uIBlock instanceof UIBlockSearchEntityPerson)) {
                        return s3q0.a;
                    }
                    pair = new Pair(((UIBlockSearchEntityPerson) uIBlock).C.a(), null);
                }
                UserProfile userProfile = (UserProfile) pair.d();
                CatalogProfileLocalState catalogProfileLocalState = (CatalogProfileLocalState) pair.g();
                if (userProfile == null) {
                    return s3q0.a;
                }
                if (epx.f(userProfile.c, kym0Var.b)) {
                    SubscribeStatus.a aVar = SubscribeStatus.Companion;
                    SubscribeStatus subscribeStatus = kym0Var.a;
                    aVar.getClass();
                    int d = SubscribeStatus.a.d(subscribeStatus);
                    userProfile.v = d;
                    if (z2) {
                        UIBlockProfile uIBlockProfile2 = (UIBlockProfile) uIBlock;
                        if (uIBlockProfile2.e == CatalogDataType.DATA_TYPE_CATALOG_USERS && uIBlockProfile2.d == CatalogViewType.SYNTHETIC_LIST_FOLLOWERS) {
                            if (d == 2) {
                                i2 = 0;
                            } else if (d == 3) {
                                i2 = 1;
                            }
                            uIBlockProfile2.E = i2;
                        }
                    }
                    if (catalogProfileLocalState != null && (followSource = catalogProfileLocalState.b) != null) {
                        z = followSource.h();
                    }
                    if (catalogProfileLocalState != null) {
                        catalogProfileLocalState.b = (userProfile.M() && z) ? CatalogProfileLocalState.FollowSource.Internal : userProfile.M() ? CatalogProfileLocalState.FollowSource.External : CatalogProfileLocalState.FollowSource.None;
                    }
                }
                return s3q0.a;
            case 7:
                qav.b bVar = (qav.b) obj;
                qav.a aVar2 = (qav.a) obj2;
                ((qav) obj3).getClass();
                L.e("check interaction id " + bVar.a.a + ' ' + aVar2.a);
                if (epx.f(bVar.a.a, aVar2.a)) {
                    return bVar;
                }
                throw new IllegalStateException("Opponent interaction id differs from our");
            case 8:
                ((Integer) obj2).getClass();
                ((sw20) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                go6 go6Var = new go6((UIBlockLink) obj2, (de40) obj3, (View) obj);
                bpn0 bpn0Var = jjc.a;
                return new ijc(400L, go6Var);
            case 10:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1822840847, intValue, -1, "com.vk.music.stickyplayer.StickyMusicPlayerContentView.Theme.<anonymous> (StickyMusicPlayerContentView.kt:67)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-703433078, new bfl0(z ? 1 : 0, jaiVar), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                ((xbo0.a) obj3).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((drq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ x76(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
