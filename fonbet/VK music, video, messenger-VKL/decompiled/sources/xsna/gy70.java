package xsna;

import com.vk.api.sdk.VKApiConfig;
import java.util.LinkedHashMap;

/* compiled from: OkHttpMethodCall.kt */
/* loaded from: classes.dex */
public class gy70 {
    public final String a;
    public final VKApiConfig.EndpointPathName b;
    public final String c;
    public final String d;
    public final String e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final l8g0 h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public String o;

    /* compiled from: OkHttpMethodCall.kt */
    public static class a {
        public String a;
        public String e;
        public l8g0 h;
        public boolean i;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public VKApiConfig.EndpointPathName b = VKApiConfig.EndpointPathName.METHOD;
        public String c = "";
        public String d = "";
        public final LinkedHashMap f = new LinkedHashMap();
        public final LinkedHashMap g = new LinkedHashMap();
        public int j = 4;

        public void a(String str, String str2) {
            this.f.put(str, str2);
        }

        public gy70 b() {
            return new gy70(this);
        }

        public a c(com.vk.api.sdk.a aVar) {
            d(aVar.c);
            f(aVar.d);
            this.e = aVar.e;
            this.f.putAll(aVar.f);
            this.i = aVar.j;
            this.j = aVar.g;
            e(aVar.a);
            this.b = aVar.b;
            this.k = aVar.m;
            this.l = aVar.n;
            this.m = aVar.o;
            this.n = aVar.p;
            return this;
        }

        public void d(String str) {
            this.c = str;
        }

        public void e(String str) {
            this.a = str;
        }

        public void f(String str) {
            this.d = str;
        }
    }

    public gy70(a aVar) {
        if (drm0.N(aVar.c)) {
            throw new IllegalArgumentException("method is null or empty");
        }
        if (drm0.N(aVar.d)) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.e;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
    }
}
