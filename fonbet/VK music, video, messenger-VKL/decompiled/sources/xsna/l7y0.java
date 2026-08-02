package xsna;

import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;
import ru.ok.android.commons.http.Http;
import xsna.zjv;

/* compiled from: ZstdContentEncodingInterceptor.kt */
/* loaded from: classes2.dex */
public final class l7y0 extends j7y0 {
    public l7y0(m7y0 m7y0Var) {
        super(m7y0Var);
    }

    @Override // xsna.j7y0
    public final mkv b(zjv.a aVar) {
        mkv c = aVar.c(aVar.b);
        okv okvVar = c.g;
        if (okvVar == null) {
            return c;
        }
        String o = c.o(Http.Header.CONTENT_ENCODING);
        boolean D = o != null ? drm0.D(o, "zstd", true) : false;
        m63.j(m63.c(), new Pair("http.response.content_encoding", D ? "zstd" : null));
        String o2 = c.o("x-zstd-dict-version");
        m7y0 m7y0Var = this.a;
        eoi0 a = m7y0Var.a();
        if (!D) {
            return c;
        }
        m7y0Var.b(a != null ? a.b : null, o2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.f);
        linkedHashMap.put(Http.Header.CONTENT_ENCODING, Collections.singletonList("identity"));
        s3q0 s3q0Var = s3q0.a;
        return mkv.b(c, linkedHashMap, okvVar.p(m7y0Var.d(okvVar.n(), o2, a, new x9d(8))), 15);
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "ZstdContent";
    }
}
