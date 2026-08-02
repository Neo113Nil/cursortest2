package xsna;

import java.util.Collections;
import java.util.LinkedHashMap;
import xsna.zjv;

/* compiled from: MsgPackHeaderInterceptor.kt */
/* loaded from: classes.dex */
public final class hn30 implements ojv, uz80 {
    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv b = aVar.b();
        if (!zjy.b(b)) {
            return aVar.c(b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.e());
        linkedHashMap.put("X-Response-Format", Collections.singletonList("msgpack"));
        s3q0 s3q0Var = s3q0.a;
        return aVar.c(ckv.a(b, null, linkedHashMap, null, null, 27));
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "MsgPackHeader";
    }
}
