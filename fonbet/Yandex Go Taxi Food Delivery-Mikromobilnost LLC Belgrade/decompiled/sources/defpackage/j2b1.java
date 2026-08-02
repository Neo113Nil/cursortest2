package defpackage;

import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class j2b1 {
    public static final void a(f530 f530Var, tzu tzuVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-83920058);
        int i2 = (btsVar2.k(f530Var) ? 4 : 2) | i | (btsVar2.k(tzuVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            qgy.b(tzuVar.a, null, an91.o(f530Var, 16.0f, 0.0f, 12.0f, 12.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16378);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(f530Var, tzuVar, i, 29);
        }
    }

    public static final c22 b(cn11 cn11Var, AutoTopupInputType autoTopupInputType) {
        Object obj;
        List list = cn11Var.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((c22) obj).a == autoTopupInputType) {
                    break;
                }
            }
            c22 c22Var = (c22) obj;
            if (c22Var != null) {
                return c22Var;
            }
        }
        return new c22(autoTopupInputType, null, null, BigDecimal.ZERO, NumberFormatUtils$Currencies.RUB.getSymbol());
    }

    public static ysn0 c() {
        return ysn0.e;
    }
}
