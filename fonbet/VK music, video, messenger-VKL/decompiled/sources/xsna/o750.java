package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o750 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o750(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                MusicPlayerInformerViewState.a aVar = (MusicPlayerInformerViewState.a) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2033765026, intValue, -1, "com.vk.music.informer.MusicStandaloneInformerContainer.<anonymous>.<anonymous>.<anonymous> (MusicStandaloneInformerContainer.kt:97)");
                }
                q630.a aVar3 = q630.a.a;
                q630 E = s200.E(aVar3, 16, 6);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(aVar2));
                sy90 D = aVar2.D();
                q630 c = qri.c(aVar2, E);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar4);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(aVar2, cri.a.h);
                k9q0.w(aVar2, c, cri.a.d);
                q630 f = txj0.f(ahn.E(aVar3, "concertInformer"), 1.0f);
                lg90 a = com.vk.music.informer.mvi.c.a(aVar.c, aVar2);
                String str = aVar.a;
                boolean J = ((((intValue & 112) ^ 48) > 32 && aVar2.J(aVar)) || (intValue & 48) == 32) | aVar2.J(izsVar);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new i4(11, izsVar, aVar);
                    aVar2.R(x);
                }
                q750.b(4480, aVar2, str, (gzs) x, f, a);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            default:
                RichCell$Middle.e eVar = (RichCell$Middle.e) this.c;
                q9g q9gVar = (q9g) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar5.J(q9gVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar5.J(q630Var) ? 32 : 16;
                }
                if (aVar5.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-533200298, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellSubtitle.<anonymous> (SexyMiddleImpl.kt:192)");
                    }
                    eVar.b(q9gVar, q630Var, RichCell$Middle.Size.Medium, aVar5, (i & 14) | 384 | (i & 112));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }
}
