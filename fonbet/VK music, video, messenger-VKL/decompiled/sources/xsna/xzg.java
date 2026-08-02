package xsna;

import xsna.a0h;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xzg implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xzg(int i, q630 q630Var, boolean z) {
        this.c = z;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                a0h.a aVar = (a0h.a) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-50162883, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityCreationOnboardingItem.CommunityNewOnBoardingHolder.<anonymous>.<anonymous> (CommunityCreationOnboardingItem.kt:57)");
                    }
                    a0h a0hVar = (a0h) ((zak0) aVar.p).getValue();
                    if (a0hVar == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().g, vog0.b(16));
                        c0h c0hVar = a0hVar.g;
                        com.vk.community.design.compose.onboarding.a.b(new mzg(c0hVar.b, c0hVar.c, c0hVar.d, c0hVar.e, c0hVar.f), new zzg(this.c), aVar.n, aVar.o, m, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                ayz.c(ne7.I(1), (androidx.compose.runtime.a) obj, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xzg(a0h.a aVar, boolean z) {
        this.d = aVar;
        this.c = z;
    }
}
