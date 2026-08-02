package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import xsna.cri;
import xsna.dt1;
import xsna.hv70;
import xsna.q630;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class nwo implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nwo(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((qwo) obj5).l((uwo) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((lat) obj5).h((xet) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                uau.c(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj5, (gzs) obj4, (q630) obj3);
                return s3q0.a;
            case 3:
                dlv0 dlv0Var = (dlv0) obj5;
                izs izsVar = (izs) obj3;
                wh50 wh50Var = (wh50) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1110133666, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView.ContentSurface.<anonymous> (GroupedNotificationListView.kt:114)");
                    }
                    dou.b(dlv0Var, (xh70) wh50Var.getValue(), izsVar, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                cv70.b((hv70.c) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                zbb0.a((kbb0) obj5, (q630) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            default:
                UserProfileBaseInfoState.b bVar = (UserProfileBaseInfoState.b) obj5;
                UserProfileBaseInfoState.VerifyInfo verifyInfo = (UserProfileBaseInfoState.VerifyInfo) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-361954481, intValue2, -1, "com.vk.profile.design.view.profileheader.UserName.<anonymous> (UserProfileBaseInfoView.kt:162)");
                    }
                    q630 H = s200.H(q630.a.a, (bVar == null && verifyInfo == null) ? 0 : kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    dt1.a.getClass();
                    ty6.b bVar2 = dt1.a.l;
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.q), bVar2, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    if (bVar == null) {
                        aVar2.K(-815649840);
                    } else {
                        aVar2.K(-815649839);
                        com.vk.profile.design.view.profileheader.b.m(bVar, izsVar2, aVar2, 0);
                    }
                    aVar2.j();
                    if (verifyInfo == null) {
                        aVar2.K(-815553120);
                    } else {
                        aVar2.K(-815553119);
                        com.vk.profile.design.view.profileheader.b.p(verifyInfo, izsVar2, aVar2, 0);
                    }
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ nwo(UserProfileBaseInfoState.b bVar, UserProfileBaseInfoState.VerifyInfo verifyInfo, izs izsVar) {
        this.b = 6;
        this.d = bVar;
        this.e = verifyInfo;
        this.c = izsVar;
    }

    public /* synthetic */ nwo(hv70.c cVar, izs izsVar, q630 q630Var, int i) {
        this.b = 4;
        this.d = cVar;
        this.c = izsVar;
        this.e = q630Var;
    }

    public /* synthetic */ nwo(dlv0 dlv0Var, izs izsVar, wh50 wh50Var) {
        this.b = 3;
        this.d = dlv0Var;
        this.c = izsVar;
        this.e = wh50Var;
    }
}
