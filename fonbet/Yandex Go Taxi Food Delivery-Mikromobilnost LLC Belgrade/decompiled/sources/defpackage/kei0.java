package defpackage;

import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class kei0 extends jei0 {
    public final r5r i;

    public kei0(CreativeType creativeType, String str, r5r r5rVar, Map map) {
        super(RealtimeEventType.PriorityFiltered, creativeType, System.currentTimeMillis(), str, map, (Map) null, 96);
        this.i = r5rVar;
    }

    @Override // defpackage.mei0
    public final MapBuilder toMap() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.putAll(super.toMap());
        r5r r5rVar = this.i;
        mapBuilder.put("FilteringContext", b.i(new Pair("AlternativeCreativeId", r5rVar.a), new Pair("AlternativeCreativeType", r5rVar.b.getCreativeName())));
        return mapBuilder.j();
    }
}
