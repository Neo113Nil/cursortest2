package xsna;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.zjv;

/* compiled from: UserAgentInterceptor.kt */
/* loaded from: classes.dex */
public final class egq0 implements ojv, uz80 {
    public final String a;
    public final List<String> b;

    public egq0(String str) {
        this.a = str;
        this.b = Collections.singletonList(str);
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv b = aVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.e());
        linkedHashMap.put("User-Agent", this.b);
        s3q0 s3q0Var = s3q0.a;
        return aVar.c(ckv.a(b, null, linkedHashMap, null, null, 27));
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "UserAgent";
    }

    public final String toString() {
        return i5s.a(new StringBuilder("UserAgentInterceptor(\""), this.a, "\")");
    }
}
