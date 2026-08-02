package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.analytics.q;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final class pho {
    public final gp50 a;
    public final w8h b;
    public final xhh c;

    public pho(gp50 gp50Var, w8h w8hVar, xhh xhhVar) {
        this.a = gp50Var;
        this.b = w8hVar;
        this.c = xhhVar;
    }

    public final void a(String str, HashMap hashMap, int i, Map map) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        hashMap4.put("version", Integer.valueOf(i));
        hashMap3.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap4);
        hashMap3.put("interfaces", map);
        hashMap2.put("_meta", hashMap3);
        hashMap2.putAll(hashMap);
        hashMap2.put("CommonParams", (MapBuilder) this.b.a().b);
        this.c.getClass();
        hashMap2.putAll(new uvc0().a);
        ((q) ((ac20) this.a.b)).h(str, hashMap2);
    }
}
