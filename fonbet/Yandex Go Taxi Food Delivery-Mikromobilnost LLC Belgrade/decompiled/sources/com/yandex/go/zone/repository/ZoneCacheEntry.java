package com.yandex.go.zone.repository;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/repository/ZoneCacheEntry;", "", "Companion", "$serializer", "com/yandex/go/zone/repository/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ZoneCacheEntry {
    public static final g Companion = new g();
    public final kotlinx.serialization.json.c a;
    public final long b;
    public long c;
    public final Integer d;

    public /* synthetic */ ZoneCacheEntry(int i, kotlinx.serialization.json.c cVar, long j, long j2, Integer num) {
        this.a = (i & 1) == 0 ? new kotlinx.serialization.json.c(kotlin.collections.b.f()) : cVar;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = this.b;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public ZoneCacheEntry() {
        this(null, 0L, null, 15);
    }

    public ZoneCacheEntry(kotlinx.serialization.json.c cVar, long j, Integer num, int i) {
        cVar = (i & 1) != 0 ? new kotlinx.serialization.json.c(kotlin.collections.b.f()) : cVar;
        j = (i & 2) != 0 ? 0L : j;
        num = (i & 8) != 0 ? null : num;
        this.a = cVar;
        this.b = j;
        this.c = j;
        this.d = num;
    }
}
