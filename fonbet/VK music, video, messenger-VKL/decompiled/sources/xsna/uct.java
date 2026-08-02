package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.profile.community.members.impl.domain.BannerButton;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.profile.community.members.impl.ui.d;
import kotlin.NoWhenBranchMatchedException;
import xsna.d16;
import xsna.q630;
import xsna.z06;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uct implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uct(MembersListBanner membersListBanner, izs izsVar, izs izsVar2, swn swnVar) {
        this.e = membersListBanner;
        this.c = izsVar;
        this.f = izsVar2;
        this.d = swnVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ButtonAppearance buttonAppearance;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vct.a((zct) this.e, (gzs) this.c, (gzs) this.f, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                nty.a((gzs) this.c, (q630) this.d, (cuy) this.e, (oty) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                MembersListBanner membersListBanner = (MembersListBanner) this.e;
                izs izsVar = (izs) this.c;
                izs izsVar2 = (izs) this.f;
                lg90 lg90Var = (lg90) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-664969255, intValue, -1, "com.vk.profile.community.members.impl.ui.DonutBanner.<anonymous> (MembersScreen.kt:251)");
                    }
                    q630 a = r18.a((float) 0.5d, tdu0.b(Banner$Notification$Appearance.Neutral, aVar, 6), ahn.E(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), "community:friends:banner"), tdu0.g(0));
                    String str = membersListBanner.b;
                    String str2 = membersListBanner.c;
                    BannerButton bannerButton = membersListBanner.d;
                    String str3 = bannerButton.b;
                    ButtonSize buttonSize = ButtonSize.Small;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    int i = d.g.$EnumSwitchMapping$0[bannerButton.c.ordinal()];
                    if (i == 1) {
                        buttonAppearance = ButtonAppearance.Neutral;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        buttonAppearance = ButtonAppearance.Positive;
                    }
                    ButtonAppearance buttonAppearance2 = buttonAppearance;
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new d220(0);
                        aVar.R(x);
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    boolean J = aVar.J(izsVar) | aVar.J(membersListBanner);
                    Object x2 = aVar.x();
                    if (J || x2 == c0012a) {
                        x2 = new com.vk.catalog2.common.ui.holders.a(16, izsVar, membersListBanner);
                        aVar.R(x2);
                    }
                    xl20 a3 = d16.b.a(str, str2, null, d16.a.C2697a.a(buttonStyle, buttonAppearance2, buttonSize, str3, null, null, null, null, null, null, null, a2, (gzs) x2, aVar, 390, 24576, 4080), null, null, null, null, aVar, 100663296, 244);
                    boolean J2 = aVar.J(izsVar2) | aVar.J(membersListBanner);
                    Object x3 = aVar.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new com.vk.catalog2.common.ui.holders.b(17, izsVar2, membersListBanner);
                        aVar.R(x3);
                    }
                    beu0.a(a3, a, lg90Var, null, null, null, null, null, z06.b.a.a((gzs) x3, null, null, null, null, null, aVar, 1572864, 62), null, null, null, aVar, 512, 0, 3832);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ uct(gzs gzsVar, q630 q630Var, cuy cuyVar, oty otyVar, int i) {
        this.c = gzsVar;
        this.d = q630Var;
        this.e = cuyVar;
        this.f = otyVar;
    }

    public /* synthetic */ uct(zct zctVar, gzs gzsVar, gzs gzsVar2, q630 q630Var, int i) {
        this.e = zctVar;
        this.c = gzsVar;
        this.f = gzsVar2;
        this.d = q630Var;
    }
}
