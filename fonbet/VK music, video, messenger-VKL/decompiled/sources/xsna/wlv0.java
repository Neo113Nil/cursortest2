package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import okhttp3.m;
import okhttp3.o;

/* compiled from: VkStatHttpSender.kt */
/* loaded from: classes5.dex */
public final class wlv0 {
    public final String a;
    public final zzp b;
    public final okhttp3.o c;
    public final okhttp3.m d;

    public wlv0(String str, zzp zzpVar) {
        this.a = str;
        this.b = zzpVar;
        o.a aVar = new o.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.c(30L, timeUnit);
        aVar.e(30L, timeUnit);
        this.c = new okhttp3.o(aVar);
        Pattern pattern = okhttp3.m.e;
        this.d = m.a.a("application/json");
    }

    public final String a(Collection<jvu0> collection) {
        Collection<jvu0> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        for (jvu0 jvu0Var : collection2) {
            b9y e = bay.e(jvu0Var.e);
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("id", Integer.valueOf(jvu0Var.a));
            mapBuilder.put("event_type_id", jvu0Var.b);
            String str = jvu0Var.c;
            if (str != null) {
                mapBuilder.put("schema_version", str);
            }
            mapBuilder.put("user_id", Long.valueOf(jvu0Var.d));
            mapBuilder.put("data", e);
            arrayList.add(mapBuilder.h());
        }
        return this.b.a(on00.f(new Pair("events", arrayList)));
    }
}
