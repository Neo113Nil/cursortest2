package defpackage;

import com.yandex.payment.sdk.flex.impl.b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final /* synthetic */ class ehr implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Map b;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                d6x d6xVar = (d6x) obj;
                v6x v6xVar = d6xVar.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(v6xVar.a.a);
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    j5x j5xVar = (j5x) v6xVar.a.a.get(str);
                    m5x m5xVar = null;
                    if (j5xVar != null) {
                        m5x m5xVar2 = j5xVar instanceof m5x ? (m5x) j5xVar : null;
                        if (m5xVar2 != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(m5xVar2.a);
                            for (Map.Entry entry2 : map2.entrySet()) {
                                String str2 = (String) entry2.getKey();
                                j5x b = b.b(entry2.getValue());
                                if (b != null) {
                                    linkedHashMap2.put(str2, b);
                                }
                            }
                            m5xVar = new m5x(kotlin.collections.b.t(linkedHashMap2));
                        }
                    }
                    if (m5xVar != null) {
                        linkedHashMap.put(str, m5xVar);
                    }
                }
                v6x v6xVar2 = new v6x(new m5x(linkedHashMap));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(d6xVar.b.a);
                q6x q6xVar = (q6x) linkedHashMap3.get("send-to-backend");
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry3 : map.entrySet()) {
                    q6x c = b.c(entry3.getValue());
                    if (c != null) {
                        linkedHashMap4.put(entry3.getKey(), c);
                    }
                }
                linkedHashMap3.put("send-to-backend", b.f(q6xVar, new r6x(linkedHashMap4)));
                return new d6x(v6xVar2, new s6x(linkedHashMap3));
            default:
                Matcher matcher = ((w610) obj).a;
                String str3 = (String) map.get(matcher.group());
                return str3 != null ? str3 : matcher.group();
        }
    }

    public /* synthetic */ ehr(Map map, b bVar) {
        this.b = map;
    }
}
