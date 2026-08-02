package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class gcb1 {
    public static final int a = 9;
    public static final int b = 10;
    public static final int c = 12;

    public static final void a(tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1606976498);
        int i2 = (btsVar.k(null) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new zp5(2, tlsVar);
                btsVar.o0(Q);
            }
            ydb1.a(q791.b(c530.a, null, null, false, null, new awk0(0), (sls) Q, 12), null, wwg.S(433052509, true, new j2d(4), btsVar), null, na01.a, null, SlotSize.L, false, btsVar, 1573248, MSException.ERROR_BUSY);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sg0(i, 5, tlsVar);
        }
    }

    public static final qor b(wg6 wg6Var, int i, List list, fid fidVar, int i2) {
        boolean z = ((((i2 & 14) ^ 6) > 4 && ((bts) fidVar).k(wg6Var)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && fidVar.c(i)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && ((bts) fidVar).k(list)) || (i2 & 384) == 256);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            Q = jeb1.g(f.d(new sgp0(wg6Var, list.indexOf(new dtr0(i)), 1)));
            btsVar.o0(Q);
        }
        return (qor) Q;
    }
}
