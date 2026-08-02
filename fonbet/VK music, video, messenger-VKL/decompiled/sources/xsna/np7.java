package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.profile.community.members.impl.ui.MembersState;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class np7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ np7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                yzt0 yzt0Var = (yzt0) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1958468889, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.addConsentToProcessingOfPersonalData.<anonymous> (BookingEditScreenMviView.kt:346)");
                    }
                    ho7.a(jk50.a(yzt0Var, aVar, 0, 3), izsVar, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                MembersState membersState = (MembersState) this.c;
                z37 z37Var = (z37) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-255226109, intValue2, -1, "com.vk.profile.community.members.impl.ui.MembersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MembersScreen.kt:138)");
                    }
                    MembersListBanner membersListBanner = membersState.f;
                    boolean J = aVar2.J(z37Var);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new jjx(z37Var, 6);
                        aVar2.R(x);
                    }
                    izs izsVar2 = (izs) x;
                    boolean J2 = aVar2.J(z37Var);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new ozh(z37Var, 29);
                        aVar2.R(x2);
                    }
                    com.vk.profile.community.members.impl.ui.d.a(membersListBanner, izsVar2, (izs) x2, null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                u8i0 u8i0Var = (u8i0) this.c;
                wh50 wh50Var = u8i0Var.c;
                mh2 mh2Var = (mh2) this.d;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(spg0Var) ? 4 : 2;
                }
                if (aVar3.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1440946525, intValue3, -1, "com.vk.core.compose.component.input.SelectImpl.Content.<anonymous>.<anonymous> (SelectImpl.kt:103)");
                    }
                    r2x r2xVar = (r2x) ((zak0) u8i0Var.g).getValue();
                    q630.a aVar4 = q630.a.a;
                    if (r2xVar == null) {
                        aVar3.K(960225115);
                    } else {
                        aVar3.K(-1770140314);
                        r2xVar.a(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), aVar3, 0);
                    }
                    aVar3.j();
                    String str = (String) ((zak0) wh50Var).getValue();
                    if (str.length() == 0 && (str = (String) ((zak0) u8i0Var.f).getValue()) == null) {
                        str = "";
                    }
                    long j = ((String) ((zak0) wh50Var).getValue()).length() > 0 ? ((l5g) ((zak0) u8i0Var.j).getValue()).a : ((l5g) ((zak0) u8i0Var.k).getValue()).a;
                    q630 b = spg0Var.b(1.0f, aVar4, true);
                    dt1.a.getClass();
                    int i = intValue3;
                    yqv0.c(str, spg0Var.a(b, dt1.a.l), j, null, null, 0, 0, null, 0, false, 0, 1, null, (frv0) ((zak0) u8i0Var.l).getValue(), aVar3, 0, 48, 6136);
                    if (!((Boolean) ((zak0) u8i0Var.h).getValue()).booleanValue() || ((String) ((zak0) wh50Var).getValue()).length() <= 0) {
                        aVar3.K(955816575);
                    } else {
                        aVar3.K(960908108);
                        u8i0Var.c(spg0Var, aVar3, i & 14);
                    }
                    aVar3.j();
                    ((zak0) mh2Var.a).setValue(Boolean.valueOf(u8i0Var.b()));
                    mh2Var.a(s200.H(aVar4, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
