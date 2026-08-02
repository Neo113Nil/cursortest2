package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.geometry.GeometryType;
import ru.yandex.taxi.logistics.sdk.pay_on_delivery.data.DeliveryPayNowApi;

/* loaded from: classes11.dex */
public abstract class d9b1 {
    public static final void a(int i, int i2, fid fidVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-8910692);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 a = ljs0.a(m4m0.b(f530Var, ldc.b(ldc.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), cyk0.c(16.0f)), 140.0f, 140.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            wqy0.b(String.valueOf(i), null, ldc.f, uh6.E(48), null, lzr.E, tq7.a, 0L, null, null, uh6.E(46), 0, false, 0, 0, null, null, btsVar, 1772928, 6, 129938);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(i, f530Var, i2, 15);
        }
    }

    public static final void b(String str, String str2, String str3, sls slsVar, sls slsVar2, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1088252115);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.k(str3) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024) | (btsVar.e(slsVar2) ? 16384 : 8192) | ImageMetadata.EDGE_MODE;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            qti.c(null, null, true, wwg.S(-1687801196, true, new b0(str, slsVar, slsVar2, str2, str3), btsVar), btsVar, 3456, 3);
            f530Var2 = c530.a;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(str, str2, str3, slsVar, slsVar2, f530Var2, i);
        }
    }

    public static final boolean c(u2t u2tVar, zzs zzsVar) {
        List list = u2tVar.a;
        if (list == null) {
            return false;
        }
        GeometryType geometryType = u2tVar.b;
        int i = geometryType == null ? -1 : w46.a[geometryType.ordinal()];
        if (i == 1) {
            List list2 = (List) a.R(list);
            return list2 != null && d(list2, zzsVar);
        }
        if (i != 2) {
            return false;
        }
        List list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return false;
        }
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            if (d((List) it.next(), zzsVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(List list, zzs zzsVar) {
        List list2 = (List) a.R(list);
        if (list2 == null) {
            return false;
        }
        int f = scc.f(list2);
        int size = list2.size();
        int i = f;
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            double d = ((zzs) list2.get(i2)).b;
            double d2 = ((zzs) list2.get(i2)).a;
            double d3 = ((zzs) list2.get(i)).b;
            double d4 = ((zzs) list2.get(i)).a;
            i = i2;
            double d5 = zzsVar.a;
            List list3 = list2;
            if ((d2 > d5) != (d4 > d5)) {
                if (zzsVar.b < (((d5 - d2) * (d3 - d)) / (d4 - d2)) + d) {
                    z = !z;
                }
            }
            i2 = i + 1;
            list2 = list3;
        }
        return z;
    }

    public static DeliveryPayNowApi e(t0k0 t0k0Var) {
        return (DeliveryPayNowApi) t0k0Var.b(DeliveryPayNowApi.class);
    }
}
