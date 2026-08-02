package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.fintechsdk.core.bdui.api.state.BduiStateTag;
import java.io.IOException;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import yads.c63;
import yads.n72;

/* loaded from: classes11.dex */
public abstract class bia1 {
    public static final void a(ob obVar, sls slsVar, fid fidVar, int i) {
        int i2;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1020840059);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(obVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        int i3 = 3;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
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
            f530 e = ljs0.e(an91.k(ljs0.c(c530Var, 1.0f), 16.0f), 56.0f);
            ldc ldcVar = obVar.c;
            if (ldcVar == null) {
                btsVar.e0(2144755306);
                j = ((el51) btsVar.m(gl51.a)).f();
                btsVar.t(false);
            } else {
                btsVar.e0(2144753942);
                btsVar.t(false);
                j = ldcVar.a;
            }
            a.a(slsVar, e, null, j, 0L, null, !(obVar.i instanceof wpi), null, null, null, wwg.S(1974741416, true, new bj0(i3, obVar), btsVar), btsVar, (i2 >> 3) & 14, 3828);
            b(obVar.h, btsVar, 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(obVar, slsVar, i, 3);
        }
    }

    public static final void b(v4v v4vVar, fid fidVar, int i) {
        v4v v4vVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1917272508);
        int i2 = (btsVar.k(v4vVar) ? 32 : 16) | i;
        int i3 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            v4vVar2 = v4vVar;
            btsVar.Y();
        } else if (v4vVar == null) {
            btsVar.e0(1304857829);
            btsVar.t(false);
            v4vVar2 = v4vVar;
        } else {
            btsVar.e0(1304857830);
            v4vVar2 = v4vVar;
            s3b1.f(v4vVar2, an91.o(ljs0.e(cj6.a.a(c530.a, x4c.x), 72.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14), mhe.c, btsVar, 384, 0);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mb(v4vVar2, i, i3);
        }
    }

    public static final void c(h31 h31Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1620199645);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(h31Var) : btsVar.e(h31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, tnb1.e(new up2(ldc.l), null, btsVar, 4), null, null, false, false, wwg.S(-595633229, true, new ohi0(tlsVar, h31Var, i3), btsVar), wwg.S(2128306411, true, new ohi0(h31Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(h31Var, tlsVar, i, 13);
        }
    }

    public static gl61 d(IOException iOException) {
        String str;
        String message = iOException.getMessage();
        if (message != null) {
            String lowerCase = message.toLowerCase(Locale.ROOT);
            if (evu0.y(lowerCase, "connection reset", false)) {
                str = "connection_reset";
            } else if (evu0.y(lowerCase, "connection abort", false)) {
                str = "connection_aborted";
            } else if (evu0.y(lowerCase, "broken pipe", false)) {
                str = "broken_pipe";
            } else if (evu0.y(lowerCase, "connection closed", false)) {
                str = "connection_closed";
            } else if (evu0.y(lowerCase, "unexpected end of stream", false)) {
                str = "unexpected_eof";
            } else if (evu0.y(lowerCase, "socket closed", false)) {
                str = "socket_closed";
            }
            return new gl61(c63.c, str, message, null);
        }
        return null;
    }

    public static gl61 e(n72 n72Var) {
        String message;
        Throwable cause = n72Var.getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            message = n72Var.getMessage();
        }
        if (cause instanceof UnknownHostException) {
            c63 c63Var = c63.c;
            if (message == null) {
                message = "Failed to resolve server address";
            }
            return new gl61(c63Var, "unknown_host", message, null);
        }
        if (!(cause instanceof ConnectException)) {
            c63 c63Var2 = c63.c;
            if (message == null) {
                message = "No connection to server";
            }
            return new gl61(c63Var2, "no_connection", message, null);
        }
        String message2 = cause.getMessage();
        String lowerCase = message2 != null ? message2.toLowerCase(Locale.ROOT) : "";
        String str = evu0.y(lowerCase, "connection refused", false) ? "connection_refused" : evu0.y(lowerCase, "network unreachable", false) ? "network_unreachable" : "connect_failed";
        String str2 = str.equals("connection_refused") ? "Connection refused" : str.equals("network_unreachable") ? "Network unreachable" : "Failed to connect to server";
        c63 c63Var3 = c63.c;
        if (message == null) {
            message = str2;
        }
        return new gl61(c63Var3, str, message, null);
    }

    public static final String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return ((Number) obj).toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(((Boolean) obj).booleanValue());
        }
        return null;
    }

    public static final Map g(c cVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.a.entrySet()) {
            String str = (String) entry.getKey();
            Serializable i = i((kotlinx.serialization.json.b) entry.getValue());
            Pair pair = i != null ? new Pair(str, i) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.b.s(arrayList);
    }

    public static final void h(Map map, List list, Object obj) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            map.put(list.get(0), obj);
            return;
        }
        String str = (String) list.get(0);
        List subList = list.subList(1, list.size());
        if (map.get(str) == null || !ym11.h(map.get(str))) {
            map.put(str, new LinkedHashMap());
        }
        Object obj2 = map.get(str);
        Map map2 = ym11.h(obj2) ? (Map) obj2 : null;
        if (map2 != null) {
            h(map2, subList, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable i(kotlinx.serialization.json.b bVar) {
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (bVar instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVar;
            if (dVar.b()) {
                return dVar.a();
            }
            if (qcx.f(dVar) != null) {
                return Boolean.valueOf(qcx.e(dVar));
            }
            if (qcx.o(dVar) == null) {
                return qcx.i(dVar) != null ? Double.valueOf(qcx.h(dVar)) : dVar.a();
            }
            try {
                return Long.valueOf(qcx.p(dVar));
            } catch (JsonDecodingException e) {
                throw new NumberFormatException(e.getMessage());
            }
        }
        if (bVar instanceof kotlinx.serialization.json.a) {
            Iterable iterable = (Iterable) bVar;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(i((kotlinx.serialization.json.b) it.next()));
            }
            return arrayList;
        }
        if (!(bVar instanceof c)) {
            w511.b();
            return null;
        }
        Map map = (Map) bVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), i((kotlinx.serialization.json.b) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final void j(sh5 sh5Var, List list, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h(linkedHashMap, list, obj);
        sh5Var.update(linkedHashMap, Collections.singletonList(BduiStateTag.SEND_TO_BACKEND));
    }
}
