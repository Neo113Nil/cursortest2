package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.RestMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class k6p extends b5j0 {
    public final String a;
    public final RestMethod b;
    public final Map c;
    public final Map d;
    public final LinkedHashMap e;

    public k6p(String str, RestMethod restMethod, Map map, Map map2, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = restMethod;
        this.c = map;
        this.d = map2;
        this.e = linkedHashMap;
    }

    @Override // defpackage.b5j0
    public final m5j0 a() {
        LinkedHashMap linkedHashMap = this.e;
        if (linkedHashMap == null) {
            return null;
        }
        String h = new u3u().h(linkedHashMap);
        int i = m5j0.a;
        Regex regex = wg10.e;
        return wms.a(h, qje.o("application/json; charset=utf-8"));
    }

    @Override // defpackage.b5j0
    public final RestMethod b() {
        return this.b;
    }

    @Override // defpackage.b5j0
    public final String c() {
        return this.a;
    }

    @Override // defpackage.b5j0
    public final Map d() {
        Map map = this.c;
        return map == null ? b.f() : map;
    }

    @Override // defpackage.b5j0
    public final Map e() {
        Map map = this.d;
        return map == null ? b.f() : map;
    }
}
