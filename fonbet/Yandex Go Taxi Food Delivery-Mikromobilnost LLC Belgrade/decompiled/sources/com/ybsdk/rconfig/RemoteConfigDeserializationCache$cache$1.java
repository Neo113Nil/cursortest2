package com.ybsdk.rconfig;

import defpackage.tui0;
import defpackage.uui0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/ybsdk/rconfig/RemoteConfigDeserializationCache$cache$1", "Ljava/util/LinkedHashMap;", "Ltui0;", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RemoteConfigDeserializationCache$cache$1 extends LinkedHashMap<tui0, Object> {
    final /* synthetic */ uui0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigDeserializationCache$cache$1(uui0 uui0Var) {
        super(512, 0.75f, true);
        this.this$0 = uui0Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof tui0) {
            return super.containsKey((tui0) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof tui0) {
            return super.get((tui0) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof tui0) ? obj2 : super.getOrDefault((tui0) obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof tui0) && obj2 != null) {
            return super.remove((tui0) obj, obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<tui0, Object> entry) {
        return super.size() > this.this$0.a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof tui0) {
            return super.remove((tui0) obj);
        }
        return null;
    }
}
