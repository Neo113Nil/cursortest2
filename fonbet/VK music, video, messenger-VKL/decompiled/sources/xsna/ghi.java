package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ghi implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        z37 z37Var = (z37) obj;
        u710 u710Var = (u710) obj2;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (aVar.J(z37Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar.J(u710Var) ? 32 : 16;
        }
        if (aVar.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-998467283, i, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.ComposableSingletons$MarketLinkedContentScreenKt.lambda$-998467283.<anonymous> (MarketLinkedContentScreen.kt:118)");
            }
            emi.e.g(6, aVar, kai.c(-1451444145, new bta(4, u710Var, z37Var), aVar));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
