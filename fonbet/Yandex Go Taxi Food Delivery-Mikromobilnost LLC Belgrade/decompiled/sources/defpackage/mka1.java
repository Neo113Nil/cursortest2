package defpackage;

import android.net.Uri;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.deeplink.generated.ActivateAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.jobs.request.NetworkType;
import ru.yandex.taxi.jobs.request.RetryPolicy;

/* loaded from: classes5.dex */
public abstract class mka1 {
    public static final void a(boolean z, xj50 xj50Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1306607473);
        int i2 = 4;
        int i3 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.k(xj50Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 896) == 256;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new azd(20, tlsVar);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            cx20.a(null, null, tnb1.e(z ? new up2(ldc.l) : AppColor$Palette.Fog, z ? null : slsVar, btsVar, 4), null, null, false, false, wwg.S(-1339392391, true, new wu40(i2, slsVar), btsVar), wwg.S(-728442815, true, new nfj(7, xj50Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(z, xj50Var, tlsVar, i, 9);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-465736934);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            f530 o = an91.o(c530.a, 16.0f, 0.0f, 16.0f, 12.0f, 2);
            btsVar = btsVar2;
            jeb1.f(str == null ? "" : str, o, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).e.d, btsVar, 48, 0, 16380);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 25);
        }
    }

    public static ys81 c() {
        ys81 ys81Var;
        ys81 ys81Var2 = ys81.b;
        if (ys81Var2 != null) {
            return ys81Var2;
        }
        synchronized (ys81.a) {
            ys81Var = ys81.b;
            if (ys81Var == null) {
                ys81Var = new ys81();
                ys81.b = ys81Var;
            }
        }
        return ys81Var;
    }

    public static final ba51 d(w4j0 w4j0Var, hzk hzkVar) {
        aa51 q270Var;
        BackoffPolicy backoffPolicy;
        String str = w4j0Var.a;
        Class cls = (Class) ((Map) ((i3y) hzkVar.b).getValue()).get(str);
        if (cls == null) {
            ny61.g(g8e.o("Unknown work tag: ", str));
            return null;
        }
        long j = w4j0Var.i;
        if (j > 0) {
            q270Var = new qxa0(cls);
            fa51 fa51Var = q270Var.c;
            fa51Var.getClass();
            if (j < 900000) {
                hgz.g().getClass();
            }
            long j2 = j < 900000 ? 900000L : j;
            long j3 = j < 900000 ? 900000L : j;
            if (j2 < 900000) {
                hgz.g().getClass();
            }
            fa51Var.h = j2 >= 900000 ? j2 : 900000L;
            if (j3 < MapiClientImpl.RETRIES_TIME_MILLIS) {
                hgz.g().getClass();
            }
            if (j3 > fa51Var.h) {
                hgz.g().getClass();
            }
            fa51Var.i = y6i0.f(j3, MapiClientImpl.RETRIES_TIME_MILLIS, fa51Var.h);
        } else {
            q270Var = new q270(cls);
        }
        q270Var.d.add(str);
        i8e i8eVar = new i8e();
        if (w4j0Var.e == NetworkType.CONNECTED) {
            i8eVar.c = androidx.work.NetworkType.CONNECTED;
            i8eVar.b = new jz50(null);
            i4u i4uVar = w4j0Var.d;
            if (i4uVar != null) {
                int i = k6j0.a[((RetryPolicy) i4uVar.a).ordinal()];
                if (i == 1) {
                    backoffPolicy = BackoffPolicy.EXPONENTIAL;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    backoffPolicy = BackoffPolicy.LINEAR;
                }
                q270Var.d(backoffPolicy);
            }
        }
        if (w4j0Var.j) {
            OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            fa51 fa51Var2 = q270Var.c;
            fa51Var2.q = true;
            fa51Var2.r = outOfQuotaPolicy;
        }
        HashMap hashMap = w4j0Var.c.a;
        HashMap hashMap2 = hashMap.isEmpty() ? null : hashMap;
        if (hashMap2 != null) {
            mng mngVar = new mng();
            mngVar.c(hashMap2);
            q270Var.c.e = mngVar.a();
        }
        long j4 = w4j0Var.b;
        if (j4 > 0) {
            q270Var.e(j4);
        }
        i8eVar.d = w4j0Var.f;
        i8eVar.a = w4j0Var.g;
        q270Var.c.j = i8eVar.a();
        return q270Var.a();
    }

    public static ActivateAction e(Uri uri) {
        String queryParameter = uri.getQueryParameter("ymevent");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!Collections.singleton("ymevent").contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String queryParameter2 = uri.getQueryParameter((String) next);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            linkedHashMap.put(next, queryParameter2);
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        return new ActivateAction(queryParameter, linkedHashMap);
    }
}
