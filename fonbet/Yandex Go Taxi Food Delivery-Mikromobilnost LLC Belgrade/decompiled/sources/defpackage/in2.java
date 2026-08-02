package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.AtomicInt;
import com.squareup.moshi.Moshi;
import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.cc4;
import flex.engine.a;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.b;
import kotlinx.serialization.json.c;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes9.dex */
public final /* synthetic */ class in2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ in2(vnq0 vnq0Var, r32 r32Var, c52 c52Var, e52 e52Var) {
        this.a = 22;
        this.b = r32Var;
        this.c = c52Var;
        this.w = e52Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[LOOP:1: B:66:0x0205->B:75:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        boolean b;
        c cVar;
        int i2 = this.a;
        int i3 = 2;
        int i4 = 3;
        r5 = false;
        boolean z = false;
        int i5 = 1;
        zy11 zy11Var = zy11.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                on2 on2Var = (on2) obj3;
                OkHttpClient okHttpClient = (OkHttpClient) on2Var.j.getValue();
                nxf0 nxf0Var = (nxf0) on2Var.i.getValue();
                gxf0 gxf0Var = (gxf0) ((h3y) obj2).get();
                GoApiName goApiName = GoApiName.TaxiV4;
                p8w[] p8wVarArr = {on2Var.h, (ey2) obj, on2Var.g};
                OkHttpClient.a b2 = okHttpClient.b();
                ((qot) gxf0Var).a(b2, goApiName);
                for (int i6 = 0; i6 < 3; i6++) {
                    b2.a(p8wVarArr[i6]);
                }
                if (nxf0Var != null) {
                    b2.d(nxf0Var);
                }
                break;
            case 1:
                ((cc4.a) obj3).a();
                AtomicInt atomicInt = ((cc4) obj2).c;
                int i7 = ((Ref$IntRef) obj).element;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i7 ? i - 1 : i));
            case 2:
                break;
            case 3:
                eg90 eg90Var = (eg90) obj;
                pul pulVar = (pul) ((sul) obj3).a.getValue();
                zr50 zr50Var = (zr50) b.j(b.g(j73.v((zr50[]) obj2), rul.a));
                break;
            case 4:
                ((a) obj3).l((gfe) obj2, (ViewGroup) obj);
                break;
            case 5:
                cop0 cop0Var = (cop0) obj2;
                break;
            case 6:
                String str = (String) obj3;
                String str2 = (String) obj2;
                break;
            case 7:
                gxf0 gxf0Var2 = (gxf0) ((yvf0) obj3).get();
                OkHttpClient.a b3 = ((OkHttpClient) ((yvf0) obj2).get()).b();
                ((qot) gxf0Var2).a(b3, null);
                b3.l = null;
                break;
            case 8:
                Map map = (Map) obj3;
                ew2 ew2Var = (ew2) obj2;
                String str3 = (String) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.putAll((Map) ew2Var.c);
                if (ew2Var.a) {
                    Log.i("InternalAnalytics", str3 + " " + map);
                }
                ((t720) ew2Var.b).a(str3, linkedHashMap);
                break;
            case 9:
                eex eexVar = (eex) obj3;
                am2 am2Var = (am2) obj2;
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                SSLSession sSLSession = (SSLSession) obj;
                List a = ((io20) obj3).a.a((String) obj2);
                if (!(a instanceof Collection) || !a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str4 = (String) it.next();
                            if (str4.length() == ((int) q5z.d0(str4))) {
                                try {
                                    b = vv60.b(str4, (X509Certificate) sSLSession.getPeerCertificates()[0]);
                                } catch (SSLException unused) {
                                }
                                if (!b) {
                                    z = true;
                                }
                            }
                            b = false;
                            if (!b) {
                            }
                        }
                    }
                }
                break;
            case 13:
                StringBuilder sb = new StringBuilder("Attempting to assign conflicting values '");
                sb.append(obj3);
                sb.append("' and '");
                sb.append(obj2);
                sb.append("' to field '");
                break;
            case 14:
                z9a0 z9a0Var = (z9a0) obj3;
                aaa0 aaa0Var = (aaa0) obj2;
                oep0 oep0Var = (oep0) obj;
                String str5 = z9a0Var.b;
                String str6 = z9a0Var.c;
                if ((str5 == null || !e2a1.c(str5)) && str5 != null && str6 != null) {
                    if (!str5.equals("transport") || !str6.equals("transport_cards")) {
                        jst.e.f("PaymentsDeeplink.PaymentService", "PaymentMethodsDeeplinkHandler", b64.l("Unsupported payment service name=", str5, " type=", str6));
                        break;
                    } else {
                        ((pep0) oep0Var).f((m950) aaa0Var.d.get(), new ur30(7), hxx.a);
                        break;
                    }
                } else {
                    ((pep0) oep0Var).f((m950) aaa0Var.c.get(), new daa0(z9a0Var.a), hxx.a);
                    break;
                }
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                fad0 fad0Var = (fad0) obj3;
                com.yandex.plus.pay.internal.di.b bVar = fad0Var.a;
                break;
            case 18:
                com.yandex.go.plus.provider.b bVar2 = new com.yandex.go.plus.provider.b(((ru.yandex.taxi.plus.sdk.cache.c) obj3).b());
                ((gld0) obj).a.getClass();
                ike M = bvf0.M((tse) obj2, uyj.a);
                xsr0.a.getClass();
                break;
            case 19:
                String str7 = (String) obj;
                break;
            case 20:
                dfr dfrVar = (dfr) obj3;
                Moshi moshi = ((com.ybsdk.rconfig.b) obj2).c;
                String str8 = (String) ((Ref$ObjectRef) obj).element;
                if (str8 == null) {
                    dfrVar.getClass();
                    break;
                } else {
                    break;
                }
            case 21:
                rzo.p(((flex.engine.section.c) obj3).b, (kr) obj2, new pxl(((nie) obj).d));
                break;
            case 22:
                r32 r32Var = (r32) obj3;
                c52 c52Var = (c52) obj2;
                e52 e52Var = (e52) obj;
                List list = r32Var.c;
                if (list != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Map map2 = (Map) c52Var.a.get((String) it2.next());
                        if (map2 != null) {
                            linkedHashMap2.putAll(map2);
                        }
                    }
                    cVar = new c(linkedHashMap2);
                } else {
                    cVar = new c(kotlin.collections.b.f());
                }
                e52Var.a(r32Var.b, cVar);
                break;
            case 23:
                ((wku0) obj3).a.d(((ExperimentSource) obj2).getValue(), (List) obj);
                break;
            default:
                ((wls) obj3).invoke(Integer.valueOf(((Ref$IntRef) obj2).element), Integer.valueOf(((Ref$IntRef) obj).element));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ in2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
