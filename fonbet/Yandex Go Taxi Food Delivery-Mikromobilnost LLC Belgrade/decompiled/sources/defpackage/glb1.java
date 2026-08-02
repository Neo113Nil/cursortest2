package defpackage;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class glb1 {
    public static final void a(f530 f530Var, xnb xnbVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(668281440);
        int i2 = i | 6 | (btsVar.k(xnbVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            qy20.a(null, null, null, false, wwg.S(1346317186, true, new sp5(xnbVar, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
            f530Var = c530.a;
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(f530Var2, xnbVar, tlsVar, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g720 b(String str) {
        Map map;
        p520 p520Var;
        String str2;
        i3y i3yVar = vjt0.a;
        if (str == null) {
            h620 h620Var = h620.d;
            z83.i();
            return h620Var;
        }
        r520 r520Var = null;
        if (cvu0.x(str, "host_source|", false)) {
            String substring = str.substring(12);
            try {
                rbx rbxVar = sbx.d;
                rbxVar.getClass();
                auu0 auu0Var = auu0.a;
                map = (Map) rbxVar.b(new k8u(auu0Var, auu0Var, 1), substring);
                str2 = (String) map.get("host_name");
            } catch (NoSuchElementException e) {
                z83.k(null, e);
            } catch (SerializationException e2) {
                z83.k(null, e2);
            }
            if (str2 == null) {
                throw new IllegalStateException("No host name");
            }
            String str3 = (String) map.get("host_string");
            if (str3 == null) {
                throw new IllegalStateException("No host string");
            }
            p520Var = new p520(str2, str3);
            if (p520Var == null) {
                return p520Var;
            }
            if (cvu0.x(str, "intent_with_data|", false)) {
                String substring2 = str.substring(17);
                try {
                    rbx rbxVar2 = sbx.d;
                    rbxVar2.getClass();
                    auu0 auu0Var2 = auu0.a;
                    Map map2 = (Map) rbxVar2.b(new k8u(auu0Var2, qke.n(auu0Var2), 1), substring2);
                    r520Var = new r520((String) map2.get("service_id"), (String) map2.get("visit_id"), (String) map2.get("click_id"));
                } catch (NoSuchElementException e3) {
                    z83.k(null, e3);
                } catch (SerializationException e4) {
                    z83.k(null, e4);
                }
            }
            if (r520Var != null) {
                return r520Var;
            }
            g720 g720Var = (g720) ((Map) vjt0.a.getValue()).get(str);
            if (g720Var != null) {
                return g720Var;
            }
            h620 h620Var2 = h620.d;
            z83.i();
            return h620Var2;
        }
        p520Var = null;
        if (p520Var == null) {
        }
    }

    public static int c(UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType, int i) {
        int i2 = wfy0.a[useCaseConfigFactory$CaptureType.ordinal()];
        return i2 != 1 ? (i2 == 2 && xbj.a.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 1;
    }
}
