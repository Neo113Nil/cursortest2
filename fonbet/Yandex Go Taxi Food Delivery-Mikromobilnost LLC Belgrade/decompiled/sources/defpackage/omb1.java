package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class omb1 {
    public static final void a(ak20 ak20Var, sls slsVar, tls tlsVar, tls tlsVar2, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1150049163);
        int i2 = (btsVar.k(ak20Var) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024) | (btsVar.e(slsVar2) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            if (ak20Var != null) {
                btsVar.e0(160724236);
                b(ak20Var, slsVar, tlsVar, btsVar, i2 & 1022);
                btsVar.t(false);
            } else {
                btsVar.e0(160803503);
                pmb1.a(btsVar, 0);
                btsVar.t(false);
            }
            Double valueOf = ak20Var != null ? Double.valueOf(ak20Var.a.b.c.a) : null;
            if (jl40.h(valueOf, 1.0d)) {
                btsVar.e0(160963370);
                boolean z = ((i2 & HProv.ALG_CLASS_ALL) == 16384) | ((i2 & 7168) == 2048);
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new yoe(tlsVar2, slsVar2, 1);
                    btsVar.o0(Q);
                }
                zpn.a(valueOf, (tls) Q, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(161160375);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(ak20Var, slsVar, tlsVar, tlsVar2, slsVar2, i);
        }
    }

    public static final void b(ak20 ak20Var, sls slsVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2080556425);
        int i2 = (btsVar.k(ak20Var) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            r3b1.a(ljs0.e(c530.a, 619.0f), ak20Var.a.a, null, null, wwg.S(98557601, true, new qk30(24, ak20Var, tlsVar, slsVar), btsVar), btsVar, 24582, 12);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(ak20Var, slsVar, tlsVar, i, 27);
        }
    }

    public static String c(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte a = byteString.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append(CSPStore.UNIQUE_SEPARATOR);
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final LinkedHashMap d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(qoi0.a((Class) entry.getKey()), entry.getValue());
        }
        return linkedHashMap;
    }
}
