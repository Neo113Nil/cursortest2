package defpackage;

import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes.dex */
public class jei0 implements mei0 {
    public final /* synthetic */ int a = 0;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final Map f;
    public final Map g;
    public final Map h;

    public /* synthetic */ jei0(RealtimeEventType realtimeEventType, CreativeType creativeType, long j, String str, Map map, Map map2, int i) {
        this(realtimeEventType, creativeType, (i & 4) != 0 ? System.currentTimeMillis() : j, str, map, (i & 32) != 0 ? b.f() : map2, (Map) null);
    }

    @Override // defpackage.mei0
    public final Map a() {
        switch (this.a) {
            case 0:
                return this.g;
            default:
                return this.f;
        }
    }

    @Override // defpackage.mei0
    public final String b() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.e;
        }
    }

    @Override // defpackage.mei0
    public final String c() {
        switch (this.a) {
            case 0:
                return this.e;
            default:
                return this.c;
        }
    }

    @Override // defpackage.mei0
    public final Map d() {
        switch (this.a) {
            case 0:
                return this.h;
            default:
                return this.g;
        }
    }

    @Override // defpackage.mei0
    public final String getEventType() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.b;
        }
    }

    @Override // defpackage.mei0
    public final Map getPayload() {
        switch (this.a) {
            case 0:
                return this.f;
            default:
                return (LinkedHashMap) this.h;
        }
    }

    @Override // defpackage.mei0
    public final long getTimestamp() {
        switch (this.a) {
        }
        return this.d;
    }

    public jei0(RealtimeEventType realtimeEventType, CreativeType creativeType, long j, String str, Map map, Map map2, Map map3) {
        this.d = j;
        this.b = str;
        this.f = map;
        this.g = map2;
        this.h = map3;
        this.c = realtimeEventType.getEventName();
        this.e = creativeType.getCreativeName();
    }

    public jei0(String str, String str2, long j, String str3, LinkedHashMap linkedHashMap, Map map, LinkedHashMap linkedHashMap2) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.h = linkedHashMap;
        this.f = map;
        this.g = linkedHashMap2;
    }
}
