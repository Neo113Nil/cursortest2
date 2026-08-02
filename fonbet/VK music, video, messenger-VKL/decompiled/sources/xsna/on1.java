package xsna;

import androidx.compose.runtime.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class on1 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ on1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ir1 ir1Var = (ir1) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1875070052, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.albums.<anonymous> (AlbumsItem.kt:50)");
                    }
                    if (ir1Var.c) {
                        aVar.K(132768885);
                        co1.b(ir1Var.b, ir1Var.d, izsVar, aVar, 0);
                    } else {
                        aVar.K(130401446);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                buw buwVar = (buw) this.c;
                wax waxVar = (wax) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-353972293);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-353972293, intValue2, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
                }
                buwVar.b(waxVar, aVar2);
                ne7 ne7Var = ne7.g;
                boolean J = aVar2.J(ne7Var);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new duw(ne7Var);
                    aVar2.R(x);
                }
                duw duwVar = (duw) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return duwVar;
        }
    }
}
