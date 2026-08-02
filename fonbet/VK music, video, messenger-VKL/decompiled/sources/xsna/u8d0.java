package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.q630;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u8d0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8d0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                w8d0 w8d0Var = (w8d0) this.c;
                int intValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1445771293, intValue2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.Content.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockServicesListContentImpl.kt:100)");
                    }
                    ua10 ua10Var = (ua10) w8d0Var.e0().a.get(intValue);
                    w8d0Var.a0(ua10Var.a, com.vk.core.compose.component.semantics.b.b(txj0.v(q630.a.a, Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE), ua10Var.b), intValue, aVar, (intValue2 << 3) & 896);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                List list = (List) this.c;
                q630 q630Var = (q630) obj;
                int intValue3 = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i = (aVar2.J(q630Var) ? 4 : 2) | intValue4;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= aVar2.o(intValue3) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1364870380, i, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCards.<anonymous>.<anonymous> (SlidingCards.kt:47)");
                    }
                    q1k0.a((r1k0.a) list.get(intValue3), s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), aVar2, 0);
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
}
