package io.appmetrica.analytics.impl;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.i5s;
import xsna.j5g;
import xsna.j9x;
import xsna.k9x;
import xsna.swe0;
import xsna.zcl;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5091pd implements InterfaceC4788dk {
    public final El a;
    public final String b;
    public final SystemTimeProvider c;
    public final List d;
    public final String e;
    public final long f;

    public C5091pd(El el, String str, SystemTimeProvider systemTimeProvider, List<C5013md> list) {
        this.a = el;
        this.b = str;
        this.c = systemTimeProvider;
        this.d = list;
        this.e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f = TimeUnit.DAYS.toMillis(1L);
    }

    public final C4762ck a() {
        Ed ed;
        C5013md c5013md;
        if (!this.d.isEmpty()) {
            List D0 = j5g.D0(new C5065od(), this.d);
            String c = ((Jd) this.a).c(this.e, (String) null);
            if (c != null) {
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                    k9x q = swe0.q(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(c5g.u(q, 10));
                    j9x it = q.iterator();
                    while (it.d) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(it.nextInt());
                        try {
                            c5013md = new C5013md(jSONObject2.getString("moduleName"), jSONObject2.getBoolean(X3.i.r));
                        } catch (Throwable unused) {
                            c5013md = new C5013md("", false);
                        }
                        arrayList.add(c5013md);
                    }
                    ed = new Ed(arrayList, jSONObject.getLong("lastSendTime"));
                } catch (Throwable unused2) {
                    ed = new Ed(EmptyList.b, 0L);
                }
            } else {
                ed = null;
            }
            long currentTimeMillis = this.c.currentTimeMillis();
            if (ed == null || currentTimeMillis - ed.b > this.f || !epx.f(D0, ed.a)) {
                Ed ed2 = new Ed(D0, currentTimeMillis);
                El el = this.a;
                Jd jd = (Jd) el;
                return new C4762ck(i5s.a(new StringBuilder(), this.b, "_status"), ed2.a());
            }
        }
        return null;
    }

    public /* synthetic */ C5091pd(El el, String str, SystemTimeProvider systemTimeProvider, List list, int i, zcl zclVar) {
        this(el, str, (i & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
