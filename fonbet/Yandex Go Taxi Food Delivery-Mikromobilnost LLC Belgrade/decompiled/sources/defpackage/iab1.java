package defpackage;

import androidx.compose.runtime.internal.a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class iab1 {
    public static final void a(f530 f530Var, to5 to5Var, wls wlsVar, to5 to5Var2, wls wlsVar2, to5 to5Var3, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        to5 to5Var4;
        wls wlsVar3;
        to5 to5Var5;
        wls wlsVar4;
        to5 to5Var6;
        to5 to5Var7;
        to5 to5Var8;
        to5 to5Var9;
        wls wlsVar5;
        wls wlsVar6;
        f530 f530Var3;
        to5 to5Var10 = x4c.F;
        bts btsVar = (bts) fidVar;
        btsVar.g0(108994447);
        int i2 = i | 224694 | (btsVar.e(slsVar) ? 1048576 : 524288);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                l3d l3dVar = l3d.a;
                l3dVar.getClass();
                a aVar = l3d.b;
                l3dVar.getClass();
                to5Var7 = to5Var10;
                to5Var8 = to5Var7;
                to5Var9 = to5Var8;
                wlsVar5 = l3d.c;
                wlsVar6 = aVar;
                f530Var3 = c530.a;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                to5Var7 = to5Var;
                wlsVar6 = wlsVar;
                to5Var8 = to5Var2;
                wlsVar5 = wlsVar2;
                to5Var9 = to5Var3;
            }
            btsVar.u();
            rab1.b(f530Var3, wwg.S(-1066346908, true, new us4(i3, slsVar), btsVar), to5Var7, wlsVar6, to5Var8, wlsVar5, to5Var9, btsVar, 1797558, 0);
            f530Var2 = f530Var3;
            to5Var4 = to5Var7;
            wlsVar3 = wlsVar6;
            to5Var5 = to5Var8;
            wlsVar4 = wlsVar5;
            to5Var6 = to5Var9;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            to5Var4 = to5Var;
            wlsVar3 = wlsVar;
            to5Var5 = to5Var2;
            wlsVar4 = wlsVar2;
            to5Var6 = to5Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(f530Var2, to5Var4, wlsVar3, to5Var5, wlsVar4, to5Var6, slsVar, i, 3);
        }
    }

    public static final void b(f530 f530Var, sls slsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        sls slsVar2;
        sls slsVar3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(966460445);
        int i3 = i | 6 | (((i2 & 2) == 0 && btsVar.e(slsVar)) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                int i4 = i2 & 2;
                c530 c530Var = c530.a;
                if (i4 != 0) {
                    slsVar = (sls) btsVar.m(c3z.a);
                    i3 &= -113;
                }
                slsVar3 = slsVar;
                f530Var3 = c530Var;
            } else {
                btsVar.Y();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                f530Var3 = f530Var;
                slsVar3 = slsVar;
            }
            btsVar.u();
            nab1.b(vza1.c(), ohb1.e(btsVar, xxh0.common_back), slsVar3, f530Var3, btsVar, ((i3 << 3) & 896) | HProv.ALG_TYPE_SECURECHANNEL, 0);
            slsVar2 = slsVar3;
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            slsVar2 = slsVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ve6(i, i2, 0, slsVar2, f530Var2);
        }
    }

    public static final boolean c(b580 b580Var, pex0 pex0Var) {
        Object obj;
        Iterator it = pex0Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((lmw0) obj).getName(), b580Var.a)) {
                break;
            }
        }
        lmw0 lmw0Var = (lmw0) obj;
        return (lmw0Var == null || lmw0Var.k(pex0Var.b)) ? false : true;
    }

    public static Object d(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(d(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray2.put(d(Array.get(obj, i)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), d(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }
}
