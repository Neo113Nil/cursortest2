package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment$ScreenContent$lambda$16$lambda$15$lambda$13$$inlined$filterIsInstance$1;
import com.vk.core.compose.component.cell.content.RichCell$Middle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ffa implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ffa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        androidx.compose.runtime.a aVar;
        int i2;
        int i3 = this.b;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                CatalogSectionScreenFragment catalogSectionScreenFragment = (CatalogSectionScreenFragment) obj5;
                z37 z37Var = (z37) obj;
                wfa wfaVar = (wfa) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                if ((intValue & 6) == 0) {
                    i = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? aVar2.J(wfaVar) : aVar2.y(wfaVar) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-881397501, i, -1, "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment.ScreenContent.<anonymous>.<anonymous> (CatalogSectionScreenFragment.kt:105)");
                    }
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new a1q(new com.vk.catalog.mvi.section.screen.impl.ui.b(new com.vk.catalog.mvi.section.screen.impl.ui.d(new com.vk.catalog.mvi.section.screen.impl.ui.a(new com.vk.catalog.mvi.section.screen.impl.ui.c(new CatalogSectionScreenFragment$ScreenContent$lambda$16$lambda$15$lambda$13$$inlined$filterIsInstance$1(tci.k(catalogSectionScreenFragment.go())), 0), 0), 0), 0));
                        aVar2.R(x);
                    }
                    ksr<T> ksrVar = ((a1q) x).a;
                    bga bgaVar = (bga) catalogSectionScreenFragment.Q.getValue();
                    boolean z = (i & 14) == 4;
                    Object x2 = aVar2.x();
                    if (z || x2 == c0012a) {
                        aVar = aVar2;
                        i37 i37Var = new i37(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0, 2);
                        aVar.R(i37Var);
                        x2 = i37Var;
                    } else {
                        aVar = aVar2;
                    }
                    vfa.a(bgaVar, wfaVar, (izs) ((fcy) x2), ksrVar, null, aVar, 3072 | (i & 112));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                RichCell$Middle.h hVar = (RichCell$Middle.h) obj5;
                q9g q9gVar = (q9g) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (aVar3.J(q9gVar) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= aVar3.J(q630Var) ? 32 : 16;
                }
                if (aVar3.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2109436566, i2, -1, "com.vk.core.compose.component.cell.content.toSexyCellTitle.<anonymous> (SexyMiddleImpl.kt:180)");
                    }
                    hVar.b(q9gVar, q630Var, RichCell$Middle.Size.Medium, aVar3, (i2 & 14) | 384 | (i2 & 112));
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
