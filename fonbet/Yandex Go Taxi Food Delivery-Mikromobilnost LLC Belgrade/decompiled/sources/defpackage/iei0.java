package defpackage;

import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import java.util.Map;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class iei0 extends jei0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iei0(CreativeType creativeType, String str, int i, int i2, Map map, MapBuilder mapBuilder, Map map2) {
        super(r1, creativeType, r3, str, map, r0.j(), map2);
        long currentTimeMillis = System.currentTimeMillis();
        RealtimeEventType realtimeEventType = RealtimeEventType.PartialShown;
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.putAll(mapBuilder);
        mapBuilder2.put("part", Integer.valueOf(i));
        mapBuilder2.put("total_parts", Integer.valueOf(i2));
    }

    public iei0(CreativeType creativeType, String str, Map map, Map map2, int i) {
        super(RealtimeEventType.Shown, creativeType, System.currentTimeMillis(), str, map, (i & 16) != 0 ? b.f() : map2, 64);
    }

    public iei0(CreativeType creativeType, String str, Map map, Map map2, Map map3, int i) {
        super(RealtimeEventType.Clicked, creativeType, System.currentTimeMillis(), str, map, (i & 16) != 0 ? b.f() : map2, (i & 32) != 0 ? null : map3);
    }

    public iei0(CreativeType creativeType, String str, Map map) {
        super(RealtimeEventType.ReceivedTech, creativeType, System.currentTimeMillis(), str, map, (Map) null, 96);
    }

    public iei0(CreativeType creativeType, String str, Map map, MapBuilder mapBuilder) {
        super(RealtimeEventType.MissedSeen, creativeType, System.currentTimeMillis(), str, map, mapBuilder, 64);
    }
}
