package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Fc implements R8 {
    public final C4707ah a;
    public final C4860gf b;
    public final String c = "activation_unlock_event_sending";
    public final AtomicBoolean d;

    public Fc(C4707ah c4707ah, A4 a4, C4860gf c4860gf) {
        this.a = c4707ah;
        this.b = c4860gf;
        this.d = new AtomicBoolean(c4860gf.a(false) || a(a4));
    }

    public final void a(String str) {
        try {
            C4710ak c4710ak = AbstractC5326yj.a;
            String str2 = this.c;
            JSONObject put = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            Y9 i = C5342za.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C5277wk c5277wk = C5342za.I.D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c5277wk.a.currentTimeMillis() - c5277wk.b, TimeUnit.MILLISECONDS)).toString();
            c4710ak.getClass();
            c4710ak.a(new Yj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.R8
    public final boolean b() {
        String str;
        if (!this.d.get() && (str = ((C5224uh) this.a.a()).m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a("activation");
        }
        return this.d.get();
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a("timer");
        }
    }

    public static boolean a(A4 a4) {
        String str = a4.a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
