package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySelectedFrom;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class i991 {
    public static final z3k a = new z3k(3);

    public static final void a(cx90 cx90Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-79547041);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(cx90Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            byk0 e = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
            long j = ldc.l;
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new u290(13, cx90Var);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            a.b(slsVar, null, e, j, 0L, null, null, null, false, null, null, new l27((tls) Q), wwg.S(1275182878, true, new wg30(26, cx90Var), btsVar2), btsVar, ((i2 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL, 384, 2034);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(cx90Var, slsVar, i, 1);
        }
    }

    public static final boolean b(r0i r0iVar) {
        if (jl40.l(r0iVar, r0i.d)) {
            return false;
        }
        if ((r0iVar != null ? r0iVar.c : null) == DeliverySelectedFrom.MANUAL) {
            return true;
        }
        if ((r0iVar != null ? r0iVar.c : null) != DeliverySelectedFrom.CONTACTS) {
            return (r0iVar != null ? r0iVar.c : null) == DeliverySelectedFrom.STANDALONE;
        }
        return true;
    }

    public static void c() {
        z83.j("Backend should be initialized");
    }
}
