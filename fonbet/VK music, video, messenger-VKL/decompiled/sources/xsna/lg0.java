package xsna;

import androidx.compose.runtime.a;
import com.vk.libvideo.api.ad.AdChoice;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdMenuAction;
import xsna.ldj0;
import xsna.mg0;
import xsna.wdj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mg0 mg0Var = (mg0) this.c;
                mg0.b bVar = (mg0.b) obj2;
                ((Integer) obj3).getClass();
                wc0 wc0Var = mg0Var.d;
                AdChoice.a aVar = bVar.a.c;
                wc0Var.c(aVar instanceof AdChoice.a.b ? CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction.COPY_ERID : aVar instanceof AdChoice.a.d ? CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction.ABOUT_ADVERTISER : aVar instanceof AdChoice.a.C1193a ? CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction.COMPLAIN : CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction.OTHER);
                mg0Var.c.a(bVar);
                return s3q0.a;
            case 1:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1213371744, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:71)");
                    }
                    tyqVar.e(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                jdj0 jdj0Var = (jdj0) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar3.K(-646656198);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-646656198, intValue2, -1, "com.vk.core.compose.shimmer.shimmer.<anonymous> (ShimmerModifier.kt:17)");
                }
                if (jdj0Var == null) {
                    aVar3.K(1333652989);
                    jdj0Var = xx1.D(ldj0.b.a, null, aVar3, 6, 2);
                } else {
                    aVar3.K(1333652462);
                }
                aVar3.j();
                azl azlVar = (azl) aVar3.r(uvi.h);
                tjv0 tjv0Var = jdj0Var.a;
                float f = tjv0Var.f;
                float f2 = tjv0Var.c;
                float I0 = azlVar.I0(f);
                boolean n = aVar3.n(I0) | aVar3.n(f2);
                Object x = aVar3.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (n || x == c0012a) {
                    x = new kdj0(I0, f2);
                    aVar3.R(x);
                }
                kdj0 kdj0Var = (kdj0) x;
                boolean y = aVar3.y(jdj0Var) | aVar3.y(kdj0Var);
                Object x2 = aVar3.x();
                if (y || x2 == c0012a) {
                    x2 = new wdj0.a(jdj0Var, kdj0Var, null);
                    aVar3.R(x2);
                }
                bap.f(kdj0Var, jdj0Var, (wzs) x2, aVar3, 0);
                boolean J = aVar3.J(kdj0Var) | aVar3.J(jdj0Var);
                Object x3 = aVar3.x();
                if (J || x3 == c0012a) {
                    x3 = new vdj0(kdj0Var, jdj0Var.b);
                    aVar3.R(x3);
                }
                vdj0 vdj0Var = (vdj0) x3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return vdj0Var;
            default:
                jai jaiVar = (jai) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar4.J(q630Var) ? 4 : 2;
                }
                if (aVar4.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(741552850, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.TopHeader.<anonymous>.<anonymous> (TopHeader.kt:62)");
                    }
                    jaiVar.invoke(q630Var, aVar4, Integer.valueOf(intValue3 & 14));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
