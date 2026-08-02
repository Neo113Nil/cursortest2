package defpackage;

import com.yandex.messaging.miniapps.js.ChannelEventType;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class hci0 extends rh20 {
    public final tls e;

    public hci0(String str, tls tlsVar) {
        super(ChannelEventType.Null, true, str);
        this.e = tlsVar;
    }

    @Override // defpackage.rh20
    public final void a(dqv dqvVar) {
        c e;
        b bVar;
        Integer k;
        jjs0 c;
        JSONObject jSONObject = dqvVar.c;
        tls tlsVar = this.e;
        jjs0 jjs0Var = null;
        if (jSONObject == null || (e = n5b1.e(jSONObject)) == null || (bVar = (b) e.get("payload")) == null) {
            tlsVar.invoke(null);
            return;
        }
        c m = qcx.m(bVar);
        b bVar2 = (b) m.get("size");
        if (bVar2 == null || (c = edb1.c(bVar2)) == null) {
            b bVar3 = (b) m.get("height");
            if (bVar3 != null && (k = qcx.k(qcx.n(bVar3))) != null) {
                jjs0Var = new jjs0(new sjs0(k.intValue()));
            }
        } else {
            jjs0Var = c;
        }
        tlsVar.invoke(jjs0Var);
    }
}
