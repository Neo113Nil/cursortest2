package xsna;

import androidx.compose.runtime.a;
import xsna.efi;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dfi implements zzs {
    public final /* synthetic */ int b;

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                afo afoVar = (afo) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(afoVar) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(203071939, i, -1, "com.vk.draftslist.impl.ui.ComposableSingletons$DraftsListFragmentKt.lambda$203071939.<anonymous> (DraftsListFragment.kt:113)");
                    }
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = yq.f(aVar);
                    }
                    dlv0 dlv0Var = (dlv0) x;
                    boolean z = (i & 14) == 4;
                    Object x2 = aVar.x();
                    if (z || x2 == c0012a) {
                        efi.a aVar2 = new efi.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(aVar2);
                        x2 = aVar2;
                    }
                    jeo.a(dlv0Var, (izs) ((fcy) x2), kai.c(1318297105, new cfi(afoVar, z37Var, dlv0Var, 0), aVar), aVar, 390);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-354611292, intValue3, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$TabsScreenContentKt.lambda$-354611292.<anonymous> (TabsScreenContent.kt:140)");
                }
                q630.a aVar4 = q630.a.a;
                if (intValue2 == 0) {
                    aVar3.K(-1479033108);
                    jzn0.d(txj0.c(aVar4, 1.0f), aVar3, 6);
                    aVar3.j();
                } else if (intValue2 != 1) {
                    aVar3.K(-1479028593);
                    jzn0.b(txj0.c(aVar4, 1.0f), aVar3, 6);
                    aVar3.j();
                } else {
                    aVar3.K(-1479030990);
                    jzn0.i(txj0.c(aVar4, 1.0f), aVar3, 6);
                    aVar3.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
