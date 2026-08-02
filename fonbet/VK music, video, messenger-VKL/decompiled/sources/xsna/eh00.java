package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;
import xsna.udt;
import xsna.zg00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class eh00 implements yzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eh00(izs izsVar, zg00.b bVar, zg00.d dVar, kh00 kh00Var) {
        this.d = dVar;
        this.c = izsVar;
        this.e = kh00Var;
        this.f = bVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                zg00.d dVar = (zg00.d) this.d;
                kh00 kh00Var = (kh00) this.e;
                zg00.b bVar = (zg00.b) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-735190396, intValue, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.ContentSurface.<anonymous> (ManageCommunitiesNotificationsView.kt:94)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    uov0.a(q630.a.a, null, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1133641693, new yro(this.c, bVar, dVar, kh00Var), aVar), aVar, 1572870, 58);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                yj00 yj00Var = (yj00) this.d;
                xvy xvyVar = yj00Var.c;
                dct dctVar = (dct) this.e;
                q630 q630Var = (q630) this.f;
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(ksyVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1700378493, intValue2, -1, "com.vk.games.presentation.components.addBannerSections.<anonymous> (MapCatalogItemsToView.kt:267)");
                    }
                    boolean z = yj00Var.e.d;
                    izs izsVar = this.c;
                    if (z) {
                        aVar2.K(-1131327055);
                        f5e0.a(((udt.g) dctVar).b, yj00Var.e, izsVar, xvyVar, ksy.c(ksyVar, q630Var, 7), aVar2, 0);
                        aVar2.j();
                    } else {
                        aVar2.K(-1130989899);
                        e5e0.a(((udt.g) dctVar).b, yj00Var.e, izsVar, xvyVar, ksy.c(ksyVar, q630Var, 7), aVar2, 0);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ eh00(yj00 yj00Var, udt.g gVar, izs izsVar, q630 q630Var) {
        this.d = yj00Var;
        this.e = gVar;
        this.c = izsVar;
        this.f = q630Var;
    }
}
