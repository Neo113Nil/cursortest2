package xsna;

import androidx.compose.runtime.a;
import xsna.vdi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class udi implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        z37 z37Var = (z37) obj;
        wqh wqhVar = (wqh) obj2;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (aVar.J(z37Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar.J(wqhVar) ? 32 : 16;
        }
        if (aVar.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(755022406, i, -1, "com.vk.music.screens.about.ComposableSingletons$CommunityProfileLinksFragmentKt.lambda$755022406.<anonymous> (CommunityProfileLinksFragment.kt:62)");
            }
            boolean z = (i & 14) == 4;
            Object x = aVar.x();
            if (z || x == a.C0011a.a) {
                vdi.a aVar2 = new vdi.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                aVar.R(aVar2);
                x = aVar2;
            }
            pqh.b(wqhVar, (izs) ((fcy) x), aVar, (i >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
