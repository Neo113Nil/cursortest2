package defpackage;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes14.dex */
public final class oa1 {
    public final lx4 a;

    public /* synthetic */ oa1(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static final Map a(c6y0 c6y0Var, long j, String str) {
        if (!(c6y0Var instanceof a6y0)) {
            return null;
        }
        a6y0 a6y0Var = (a6y0) c6y0Var;
        return b.i(new Pair("endpoint", str), new Pair("time_since_intent", Long.valueOf(a6y0Var.b - j)), new Pair("request_duration", Long.valueOf(a6y0Var.c)), new Pair("trace_id", a6y0Var.d));
    }

    public void b(DetailsOpenReason detailsOpenReason, String str) {
        i d = ((j) this.a).d("SuperappOrderDetails.Screen.Show");
        d.d(CRLReasonCodeExtension.REASON, detailsOpenReason.alias);
        if (!evu0.J(str)) {
            d.d(MetaDataField.SCREEN_FIELD, str);
        }
        if (detailsOpenReason == DetailsOpenReason.ON_START) {
            d.j((r2 & 1) == 0);
        }
        d.m();
    }

    public void c(String str, h6y0 h6y0Var, wmk0 wmk0Var) {
        f6y0 f6y0Var = h6y0Var.a;
        if (f6y0Var == null) {
            return;
        }
        long j = wmk0Var.b - f6y0Var.a;
        i d = ((j) this.a).d(str);
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("id", h6y0Var.b);
        linkedHashMap.put("intent_reason", f6y0Var.b.toString());
        d.c(j, RemoteBioParameters.TIME);
        d.c(wmk0Var.c, "frame_time");
        d.m();
        ffx.O(str).c(j, TimeUnit.MILLISECONDS);
    }

    public void d(double d, String str, String str2, String str3) {
        i d2 = ((j) this.a).d(str);
        LinkedHashMap linkedHashMap = d2.a;
        linkedHashMap.put("id", str2);
        linkedHashMap.put("intent_reason", str3);
        d2.a(d, "value");
        d2.m();
        ffx.O(str).c(m810.c(d), TimeUnit.MILLISECONDS);
    }

    public void e(String str, h6y0 h6y0Var, wmk0 wmk0Var) {
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        f6y0 f6y0Var = h6y0Var.a;
        if (f6y0Var == null) {
            return;
        }
        long j = wmk0Var.b;
        vfk0 vfk0Var = wmk0Var.e;
        long j2 = j - f6y0Var.a;
        i d = ((j) this.a).d(str);
        d.d("id", h6y0Var.b);
        d.d("intent_reason", f6y0Var.b.toString());
        d.c(j2, RemoteBioParameters.TIME);
        d.c(wmk0Var.c, "frame_time");
        if (vfk0Var == null) {
            str2 = null;
        } else if (vfk0Var instanceof sfk0) {
            str2 = "defaults";
        } else if (vfk0Var instanceof rfk0) {
            str2 = "complete";
        } else {
            if (!(vfk0Var instanceof ufk0)) {
                w511.b();
                return;
            }
            str2 = "remote";
        }
        d.d("source", str2);
        if (jl40.l(vfk0Var, ufk0.a)) {
            if (jl40.l(f6y0Var != null ? f6y0Var.b : null, bei.R)) {
                long j3 = f6y0Var.a;
                List list = h6y0Var.d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((c6y0) obj).a() == TaxiOrderSessionCheckpoint.ORDERDRAFT) {
                            break;
                        }
                    }
                }
                c6y0 c6y0Var = (c6y0) obj;
                Map a = c6y0Var != null ? a(c6y0Var, j3, "orderdraft") : null;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (((c6y0) obj2).a() == TaxiOrderSessionCheckpoint.ORDERCOMMIT) {
                            break;
                        }
                    }
                }
                c6y0 c6y0Var2 = (c6y0) obj2;
                Map a2 = c6y0Var2 != null ? a(c6y0Var2, j3, "ordercommit") : null;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it3.next();
                        if (((c6y0) obj3).a() == TaxiOrderSessionCheckpoint.TAXIONTHEWAY) {
                            break;
                        }
                    }
                }
                c6y0 c6y0Var3 = (c6y0) obj3;
                List A = j73.A(new Map[]{a, a2, c6y0Var3 != null ? a(c6y0Var3, j3, "taxiontheway") : null});
                if (!A.isEmpty()) {
                    d.a.put("endpoints", A);
                }
            }
        }
        d.i();
        d.m();
        ffx.O(str).c(j2, TimeUnit.MILLISECONDS);
    }

    public void f(int i, String str, String str2, String str3) {
        i d = ((j) this.a).d(str);
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("id", str2);
        linkedHashMap.put("intent_reason", str3);
        d.b(i, "value");
        d.m();
        ffx.O(str).c(i, TimeUnit.MILLISECONDS);
    }
}
