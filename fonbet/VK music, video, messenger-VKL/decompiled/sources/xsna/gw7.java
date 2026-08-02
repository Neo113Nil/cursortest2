package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bv7;
import xsna.iw7;
import xsna.xv7;

/* compiled from: BookingRecordsScreenReducer.kt */
/* loaded from: classes18.dex */
public final class gw7 extends dm50<nw7, xv7, iw7> {
    @Override // xsna.dm50
    public final iw7 c(iw7 iw7Var, xv7 xv7Var) {
        Map f;
        iw7 iw7Var2 = iw7Var;
        xv7 xv7Var2 = xv7Var;
        if (xv7Var2 instanceof xv7.e) {
            return new iw7.c(((xv7.e) xv7Var2).b);
        }
        if (xv7Var2 instanceof xv7.c) {
            xv7.c cVar = (xv7.c) xv7Var2;
            return new iw7.a(cVar.b, cVar.c);
        }
        if (xv7Var2 instanceof xv7.d) {
            xv7.d dVar = (xv7.d) xv7Var2;
            ArrayList arrayList = dVar.b.b;
            boolean isEmpty = arrayList.isEmpty();
            if (isEmpty) {
                f = jgp.b;
            } else {
                if (isEmpty) {
                    throw new NoWhenBranchMatchedException();
                }
                f = on00.f(new Pair(1, hw7.a(arrayList)));
            }
            return new iw7.d(f, dVar.c, dVar.d, !arrayList.isEmpty() && arrayList.size() >= 10, 42);
        }
        if (xv7Var2 instanceof xv7.a) {
            return iw7Var2 instanceof iw7.d ? iw7.d.a((iw7.d) iw7Var2, null, 0, null, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : iw7Var2;
        }
        if (xv7Var2 instanceof xv7.b) {
            return iw7Var2 instanceof iw7.d ? iw7.d.a((iw7.d) iw7Var2, null, 0, ((xv7.b) xv7Var2).b, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : iw7Var2;
        }
        if (xv7Var2 instanceof aw7) {
            if (!(iw7Var2 instanceof iw7.d)) {
                return iw7Var2;
            }
            iw7.d dVar2 = (iw7.d) iw7Var2;
            aw7 aw7Var = (aw7) xv7Var2;
            return iw7.d.a(dVar2, pn00.o(dVar2.b, new Pair(Integer.valueOf(aw7Var.b), Collections.singletonList(bv7.b.b))), aw7Var.b, null, true, false, 28);
        }
        if (!(xv7Var2 instanceof yv7)) {
            if (!(xv7Var2 instanceof zv7)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(iw7Var2 instanceof iw7.d)) {
                return iw7Var2;
            }
            iw7.d dVar3 = (iw7.d) iw7Var2;
            Map<Integer, List<bv7>> map = dVar3.b;
            zv7 zv7Var = (zv7) xv7Var2;
            int i = zv7Var.b;
            return iw7.d.a(dVar3, pn00.o(pn00.l(Integer.valueOf(i), map), new Pair(Integer.valueOf(i), Collections.singletonList(new bv7.a(zv7Var.c)))), zv7Var.b, null, false, false, 28);
        }
        if (!(iw7Var2 instanceof iw7.d)) {
            return iw7Var2;
        }
        iw7.d dVar4 = (iw7.d) iw7Var2;
        Map<Integer, List<bv7>> map2 = dVar4.b;
        yv7 yv7Var = (yv7) xv7Var2;
        int i2 = yv7Var.b;
        cv7 cv7Var = yv7Var.c;
        Map l = pn00.l(Integer.valueOf(i2), map2);
        ArrayList arrayList2 = cv7Var.b;
        boolean isEmpty2 = arrayList2.isEmpty();
        if (!isEmpty2) {
            if (isEmpty2) {
                throw new NoWhenBranchMatchedException();
            }
            l = pn00.o(l, new Pair(Integer.valueOf(i2), hw7.a(arrayList2)));
        }
        return iw7.d.a(dVar4, l, yv7Var.b, null, false, !arrayList2.isEmpty() && arrayList2.size() >= 10, 28);
    }

    @Override // xsna.dm50
    public final nw7 d() {
        return new nw7(e(new pe1(6)), e(new ve0(5)), e(new nj(2)));
    }

    @Override // xsna.dm50
    public final void h(iw7 iw7Var, nw7 nw7Var) {
        iw7 iw7Var2 = iw7Var;
        nw7 nw7Var2 = nw7Var;
        if (iw7Var2 instanceof iw7.a) {
            f(nw7Var2.a, iw7Var2);
        } else if (iw7Var2 instanceof iw7.c) {
            f(nw7Var2.b, iw7Var2);
        } else if (iw7Var2 instanceof iw7.d) {
            f(nw7Var2.c, iw7Var2);
        }
    }
}
