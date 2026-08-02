package xsna;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.k4n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ohz implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ohz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                pos0 pos0Var = (pos0) this.c;
                gzs gzsVar = (gzs) this.d;
                gzs gzsVar2 = (gzs) this.e;
                q630 q630Var = (q630) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1510934588, intValue, -1, "com.vk.video.growth.impl.listing.ListingBottomSheetContent.<anonymous> (ListingBottomSheetContent.kt:41)");
                    }
                    phz.a(pos0Var, gzsVar, gzsVar2, q630Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                d64 d64Var = (d64) this.c;
                d64 d64Var2 = (d64) this.d;
                d64 d64Var3 = (d64) this.e;
                d64 d64Var4 = (d64) this.f;
                rj50 rj50Var = (rj50) obj;
                k4n0 k4n0Var = (k4n0) obj2;
                if (k4n0Var instanceof k4n0.c) {
                    return rj50Var.a(d64Var, k4n0Var);
                }
                if (k4n0Var instanceof k4n0.b) {
                    return rj50Var.a(d64Var2, k4n0Var);
                }
                if (k4n0Var instanceof k4n0.a) {
                    return rj50Var.a(d64Var3, k4n0Var);
                }
                if (k4n0Var instanceof l4n0) {
                    return rj50Var.a(d64Var4, k4n0Var);
                }
                throw new NoWhenBranchMatchedException();
            default:
                ((Integer) obj2).getClass();
                ypp0.a((List) this.c, (izs) this.d, (q630) this.f, (yzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ ohz(List list, izs izsVar, q630 q630Var, yzs yzsVar, int i) {
        this.b = 2;
        this.c = list;
        this.d = izsVar;
        this.f = q630Var;
        this.e = yzsVar;
    }
}
