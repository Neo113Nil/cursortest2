package xsna;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.zjv;

/* compiled from: ZstdAcceptEncodingInterceptor.kt */
/* loaded from: classes2.dex */
public final class i7y0 extends j7y0 {
    public i7y0(m7y0 m7y0Var) {
        super(m7y0Var);
    }

    @Override // xsna.j7y0
    public final mkv b(zjv.a aVar) {
        ckv ckvVar = aVar.b;
        Map<String, List<String>> map = ckvVar.c;
        eoi0 a = this.a.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("Accept-Encoding", Collections.singletonList(yiz.d(e43.o("zstd"))));
        if (a != null) {
            linkedHashMap.put("x-zstd-dict-version", Collections.singletonList(a.b));
        }
        s3q0 s3q0Var = s3q0.a;
        return aVar.c(ckv.a(ckvVar, null, linkedHashMap, null, null, 27));
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "ZstdAccept";
    }
}
