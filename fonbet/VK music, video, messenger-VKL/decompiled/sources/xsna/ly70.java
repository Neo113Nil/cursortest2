package xsna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.okx;
import xsna.xjv;

/* compiled from: OkHttpPostCall.kt */
/* loaded from: classes15.dex */
public class ly70 {
    public final String a;
    public final boolean b;
    public final HashMap c;

    /* compiled from: OkHttpPostCall.kt */
    public static class a {
        public String a = "";
        public boolean b = true;
        public final HashMap c = new HashMap();
        public long d;
    }

    public ly70(okx.a aVar) {
        HashMap hashMap = aVar.c;
        if (drm0.N(aVar.a)) {
            throw new IllegalArgumentException("Illegal url value: url is blank.");
        }
        long j = aVar.d;
        if (j < 0) {
            throw new IllegalArgumentException(qlb0.a(j, "Illegal timeout value: ", ". It must be >= 0.").toString());
        }
        if (!aVar.b && !hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!(((Map.Entry) it.next()).getValue() instanceof xjv.b)) {
                    throw new IllegalStateException("Non multipart calls should consist of text arguments only");
                }
            }
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = hashMap;
    }

    public final Map<String, xjv> a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public ly70(xbr0 xbr0Var) {
        this.a = xbr0Var.a;
        this.b = xbr0Var.b;
        this.c = xbr0Var.c;
    }
}
