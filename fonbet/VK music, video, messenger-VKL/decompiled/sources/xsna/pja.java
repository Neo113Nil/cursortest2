package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.ecomm.categories.impl.presentation.CategoriesFragment;
import com.vk.ecomm.design.compose.reviewcard.ReviewCardTypeOfState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pja implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pja(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                CategoriesFragment.b bVar = (CategoriesFragment.b) this.c;
                z37 z37Var = (z37) obj;
                cka ckaVar = (cka) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(ckaVar) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-172681545, i, -1, "com.vk.ecomm.categories.impl.presentation.CategoriesFragment.ContentView.ThemedContent.<anonymous> (CategoriesFragment.kt:97)");
                    }
                    String str = bVar.n;
                    boolean z = (i & 14) == 4;
                    Object x = aVar.x();
                    if (z || x == a.C0011a.a) {
                        x = new ay0(z37Var, 19);
                        aVar.R(x);
                    }
                    zja.a(str, ckaVar, (izs) x, aVar, i & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                wh50 wh50Var = (wh50) this.c;
                izs izsVar = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.y(izsVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1362863841, intValue2, -1, "com.vk.community.design.compose.onboarding.HighlightedHeader.<anonymous>.<anonymous>.<anonymous> (CommunityCreationOnboarding.kt:147)");
                    }
                    q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "community_creation_onboarding_block_title");
                    us2 us2Var = (us2) wh50Var.getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.p;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.d(us2Var, E, ylu0Var.getText().m, 0, null, 0, false, 0, izsVar, null, frv0Var, aVar2, 48, (intValue2 << 3) & 112, 6136);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                int intValue3 = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-827461159, intValue4, -1, "com.vk.design.demo.presentation.screens.MarketReviewCardContent.Content.<anonymous> (MarketReviewCardContent.kt:83)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                int hashCode = Long.hashCode(n34.n(aVar3));
                sy90 D = aVar3.D();
                q630.a aVar4 = q630.a.a;
                q630 c = qri.c(aVar3, aVar4);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (aVar3.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar3.H();
                if (aVar3.L()) {
                    aVar3.I(aVar5);
                } else {
                    aVar3.f();
                }
                k9q0.w(aVar3, a, cri.a.f);
                k9q0.w(aVar3, D, cri.a.e);
                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(aVar3, cri.a.h);
                k9q0.w(aVar3, c, cri.a.d);
                yqv0.c("State = " + ((ReviewCardTypeOfState) ((Pair) arrayList.get(intValue3)).i()).name(), null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar3, 0, 0, 16382);
                f9t.e(txj0.h(aVar4, (float) 10), aVar3, 6);
                q630 f = txj0.f(aVar4, 1.0f);
                wgg0 wgg0Var = (wgg0) ((Pair) arrayList.get(intValue3)).j();
                ReviewCardTypeOfState reviewCardTypeOfState = (ReviewCardTypeOfState) ((Pair) arrayList.get(intValue3)).i();
                Object x2 = aVar3.x();
                if (x2 == a.C0011a.a) {
                    x2 = new d69((byte) 0, 3);
                    aVar3.R(x2);
                }
                vgg0.d(wgg0Var, f, reviewCardTypeOfState, (wzs) x2, aVar3, 3120);
                aVar3.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }
}
