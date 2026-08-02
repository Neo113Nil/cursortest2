package xsna;

import com.vk.knet.core.http.HttpProtocol;
import java.util.List;
import java.util.Map;

/* compiled from: HttpResponseMeta.kt */
/* loaded from: classes2.dex */
public final class pkv {
    public final int a;
    public final String b;
    public final Long c;
    public final HttpProtocol d;
    public final Map<String, List<String>> e;

    public pkv(int i, String str, Long l, HttpProtocol httpProtocol, Map map) {
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = httpProtocol;
        this.e = map;
    }

    public final Long a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final Map<String, List<String>> c() {
        return this.e;
    }

    public final HttpProtocol d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }
}
