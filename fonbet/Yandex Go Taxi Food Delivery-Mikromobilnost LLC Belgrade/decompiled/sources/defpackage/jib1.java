package defpackage;

import android.graphics.PointF;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public abstract class jib1 {
    public static final void a(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1326224723);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(f530Var, 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            nhl0 nhl0Var = nhl0.a;
            com.yandex.go.design.compose.loading.b.a(ljs0.e(nhl0Var.a(c530Var, 0.5f, true), 16.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 0, 252);
            oeb1.c(btsVar, nhl0Var.a(c530Var, 0.2f, true));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(nhl0Var.a(c530Var, 0.3f, true), 16.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 0, 252);
            n.y(btsVar, true, c530Var, 20.0f, btsVar);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 192.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(n.e(c530Var, 12.0f, btsVar, c530Var, 1.0f), 16.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 6, 252);
            ly3.B(c530Var, 28.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 13);
        }
    }

    public static final lum b() {
        return new lum(new qls0(16), d1v0.a, new omu0(8), e1v0.a);
    }

    public static final lum c(tls tlsVar) {
        return new lum(new qls0(17), f1v0.a, new uwl0(19, tlsVar), g1v0.a);
    }

    public static final lum d(tls tlsVar) {
        return new lum(new qls0(15), h1v0.a, new uwl0(18, tlsVar), i1v0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wrr e(HashMap hashMap) {
        ArrayList arrayList;
        PointF pointF;
        Object obj = hashMap.get("icon_anchor_x");
        if (!(obj != null ? obj instanceof Number : true)) {
            obj = null;
        }
        Number number = (Number) obj;
        Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
        Object obj2 = hashMap.get("icon_anchor_y");
        if (!(obj2 != null ? obj2 instanceof Number : true)) {
            obj2 = null;
        }
        Number number2 = (Number) obj2;
        Double valueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
        Object obj3 = hashMap.get("icon_rotation_enabled");
        if (!(obj3 != null ? obj3 instanceof Boolean : true)) {
            obj3 = null;
        }
        Boolean bool = (Boolean) obj3;
        Object obj4 = hashMap.get("icon_flat");
        if (!(obj4 != null ? obj4 instanceof Boolean : true)) {
            obj4 = null;
        }
        Boolean bool2 = (Boolean) obj4;
        Object obj5 = hashMap.get("icon_z_index");
        if (!(obj5 != null ? obj5 instanceof Number : true)) {
            obj5 = null;
        }
        Number number3 = (Number) obj5;
        Integer valueOf3 = number3 != null ? Integer.valueOf(number3.intValue()) : null;
        Object obj6 = hashMap.get("icon_scale");
        if (!(obj6 != null ? obj6 instanceof Number : true)) {
            obj6 = null;
        }
        Number number4 = (Number) obj6;
        Double valueOf4 = number4 != null ? Double.valueOf(number4.doubleValue()) : null;
        Object obj7 = hashMap.get("tappable_area");
        if (!(obj7 instanceof List)) {
            obj7 = null;
        }
        List<HashMap> list = (List) obj7;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (HashMap hashMap2 : list) {
                Object obj8 = hashMap2.get(RemoteBioParameters.X);
                if (!(obj8 instanceof Double)) {
                    obj8 = null;
                }
                Double d = (Double) obj8;
                if (d != null) {
                    float doubleValue = (float) d.doubleValue();
                    Object obj9 = hashMap2.get(RemoteBioParameters.Y);
                    if (!(obj9 instanceof Double)) {
                        obj9 = null;
                    }
                    Double d2 = (Double) obj9;
                    if (d2 != null) {
                        pointF = new PointF(doubleValue, (float) d2.doubleValue());
                        if (pointF == null) {
                            arrayList2.add(pointF);
                        }
                    }
                }
                pointF = null;
                if (pointF == null) {
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new wrr(arrayList, valueOf, valueOf2, bool, bool2, valueOf3, valueOf4, 21);
    }

    public static final Point f(HashMap hashMap) {
        Object obj = hashMap.get("lat");
        Object obj2 = hashMap.get("lon");
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return new Point(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
        }
        return null;
    }
}
