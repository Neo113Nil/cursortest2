package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class obr extends v4j0 {
    public final Map b;
    public final c c;
    public final String d;
    public final RestMethod e;
    public final String f;
    public final String g;

    public obr(String str, Map map, String str2, c cVar) {
        super(null);
        this.b = map;
        this.c = cVar;
        this.d = str;
        this.e = RestMethod.POST;
        this.f = "fintech_remote_action-".concat(str2);
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                List list = (List) entry.getValue();
                String encode = URLEncoder.encode(str3, "UTF-8");
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(encode + "=" + URLEncoder.encode((String) it.next(), "UTF-8"));
                }
                ycc.r(arrayList2, arrayList);
            }
            String X = a.X(arrayList, "&", null, null, null, 62);
            if (X.length() != 0) {
                str2 = g8e.p(str2, evu0.z(str2, '?') ? "&" : "?", X);
            }
        }
        this.g = str2;
    }

    @Override // defpackage.v4j0
    public final c a() {
        c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        kdx kdxVar = new kdx();
        kdxVar.b("request", cVar);
        return kdxVar.a();
    }

    @Override // defpackage.v4j0
    public final String b() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.e;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.f;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.g;
    }
}
