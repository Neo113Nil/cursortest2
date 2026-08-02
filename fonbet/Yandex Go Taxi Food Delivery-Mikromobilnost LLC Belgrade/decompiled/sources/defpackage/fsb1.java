package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes11.dex */
public abstract class fsb1 {
    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var, List list) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-485890907);
        int i2 = i | 6 | (btsVar.k(list) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530Var2 = c530.a;
            f530 m = an91.m(ljs0.c(f530Var2, 1.0f), 16.0f, 0.0f, 2);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(179131893);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dd01.a((ed01) it.next(), tlsVar, btsVar, i2 & 910);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z840(f530Var2, list, tlsVar, i, 3);
        }
    }

    public static final Object b(noh nohVar) {
        try {
            return nohVar.c();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String c(HttpsURLConnection httpsURLConnection) {
        List W;
        Object obj;
        List W2;
        String contentType = httpsURLConnection.getContentType();
        String str = null;
        if (contentType != null) {
            W = evu0.W(contentType, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
            Iterator it = W.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (evu0.y((String) obj, "charset=", false)) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                W2 = evu0.W(str2, new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
                str = (String) W2.get(1);
            }
        }
        return str == null ? "" : str;
    }
}
