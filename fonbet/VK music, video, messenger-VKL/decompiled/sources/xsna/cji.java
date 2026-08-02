package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: OnboardingFullscreenScreenContent.kt */
/* loaded from: classes18.dex */
public final class cji {
    public static final jai a = new jai(-449974057, a.b, false);

    /* compiled from: OnboardingFullscreenScreenContent.kt */
    public static final class a implements a0t<kys, l5g, q630, androidx.compose.runtime.a, Integer, s3q0> {
        public static final a b = new a();

        @Override // xsna.a0t
        public final s3q0 invoke(kys kysVar, l5g l5gVar, q630 q630Var, androidx.compose.runtime.a aVar, Integer num) {
            kys kysVar2 = kysVar;
            final long j = l5gVar.a;
            q630 q630Var2 = q630Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-449974057, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$OnboardingFullscreenScreenContentKt.lambda$-449974057.<anonymous> (OnboardingFullscreenScreenContent.kt:61)");
            }
            kysVar2.a(q630Var2, kai.c(-500194714, new yzs() { // from class: xsna.bji
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-500194714, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$OnboardingFullscreenScreenContentKt.lambda$-449974057.<anonymous>.<anonymous> (OnboardingFullscreenScreenContent.kt:62)");
                        }
                        q630 m = hr80.m(txj0.d(q630.a.a, 1.0f), j, androidx.compose.ui.graphics.e.a);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, m);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c, cri.a.d);
                        yqv0.a("Description of step", null, l5g.d, l2l0.l(130), b6s.k, null, 0L, 0, l2l0.l(90), null, 0, false, 0, 0, null, null, aVar3, 200070, 48, 1046482);
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, aVar2), aVar2, ((intValue << 9) & 7168) | ((intValue >> 3) & 112) | 390);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return s3q0.a;
        }
    }
}
