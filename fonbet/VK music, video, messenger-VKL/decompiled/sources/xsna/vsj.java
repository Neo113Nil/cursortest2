package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import ru.ok.android.commons.http.Http;
import xsna.zjv;

/* compiled from: CookieInterceptor.kt */
/* loaded from: classes.dex */
public final class vsj implements ojv, uz80 {
    public final boolean a;

    public vsj(boolean z) {
        this.a = z;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv b = aVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.e());
        if (this.a) {
            List list = (List) linkedHashMap.get(Http.Header.COOKIE);
            if (list != null) {
                List list2 = list;
                if (!list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list2);
                    String str = (String) j5g.Y(arrayList);
                    arrayList.set(0, drm0.N(str) ? "XDEBUG_SESSION=PHPSTORM" : str.concat("; XDEBUG_SESSION=PHPSTORM"));
                    linkedHashMap.put(Http.Header.COOKIE, arrayList);
                }
            }
            linkedHashMap.put(Http.Header.COOKIE, Collections.singletonList("XDEBUG_SESSION=PHPSTORM"));
        }
        return aVar.c(ckv.a(b, null, linkedHashMap, null, null, 27));
    }

    @Override // xsna.uz80
    public final String getTag() {
        return Http.Header.COOKIE;
    }
}
