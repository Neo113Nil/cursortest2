package xsna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.xjv;

/* compiled from: VKHttpPostCall.kt */
/* loaded from: classes15.dex */
public class xbr0 {
    public final String a;
    public final boolean b;
    public final HashMap c;
    public final int d;
    public final long e;
    public final boolean f;

    /* compiled from: VKHttpPostCall.kt */
    public static class a {
        public String a = "";
        public boolean b = true;
        public final HashMap c = new HashMap();
        public int d = Integer.MAX_VALUE;
        public long e;
        public boolean f;

        public a a(String str, String str2) {
            xjv.b bVar = new xjv.b();
            bVar.a = str2;
            this.c.put(str, bVar);
            return this;
        }
    }

    public xbr0(a aVar) {
        HashMap hashMap = aVar.c;
        if (drm0.N(aVar.a)) {
            throw new IllegalArgumentException(go9.b("Illegal url value: ", aVar.a));
        }
        if (aVar.e < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(aVar.e, "Illegal timeout value: "));
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
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.f;
    }
}
