package defpackage;

import io.appmetrica.analytics.RtmClientEvent;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class krp0 {
    public static final Pair a(jnl jnlVar, qhl0 qhl0Var, w42 w42Var) {
        RtmClientEvent.Builder newBuilder;
        JSONObject D = vng.D(new JSONObject(), qhl0Var);
        String str = qhl0Var.a;
        JSONObject put = D.put("source", str).put("value", jnlVar.a);
        String str2 = jnlVar.b;
        JSONObject put2 = put.put("eventType", str2);
        if (jnlVar instanceof jrp0) {
            jrp0 jrp0Var = (jrp0) jnlVar;
            String str3 = jrp0Var.c;
            put2.put("amount", str3).put("bank", jrp0Var.d);
            newBuilder = RtmClientEvent.newBuilder("Transfer done", str3);
        } else if (jnlVar.equals(hrp0.c)) {
            newBuilder = RtmClientEvent.newBuilder("Dashboard opened", (String) null);
        } else if (jnlVar instanceof frp0) {
            frp0 frp0Var = (frp0) jnlVar;
            put2.put("deviceSupported", frp0Var.c).put("userConfirmed", frp0Var.d);
            newBuilder = RtmClientEvent.newBuilder("Biometric Enabled", (String) null);
        } else if (jnlVar instanceof grp0) {
            for (Map.Entry entry : ((grp0) jnlVar).c.entrySet()) {
                put2.put((String) entry.getKey(), entry.getValue());
            }
            newBuilder = RtmClientEvent.newBuilder("tech.zxing_used", (String) null);
        } else {
            if (!(jnlVar instanceof irp0)) {
                w511.b();
                return null;
            }
            newBuilder = RtmClientEvent.newBuilder(str2, (int) ((irp0) jnlVar).c);
        }
        return new Pair(newBuilder.withSource(str).withVersion("0.233.1").withAdditional(erp0.b(put2, w42Var).toString()).build(), put2);
    }
}
