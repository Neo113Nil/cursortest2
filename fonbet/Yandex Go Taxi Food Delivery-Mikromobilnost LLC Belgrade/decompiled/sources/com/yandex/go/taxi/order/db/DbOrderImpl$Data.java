package com.yandex.go.taxi.order.db;

import defpackage.cue;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/db/DbOrderImpl$Data", "", "Companion", "$serializer", "com/yandex/go/taxi/order/db/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DbOrderImpl$Data {
    public static final a Companion = new a();
    public static final i3y[] e;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final LinkedHashMap c;
    public String d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new cue(23)), kotlin.a.b(lazyThreadSafetyMode, new cue(24)), kotlin.a.b(lazyThreadSafetyMode, new cue(25)), null};
    }

    public /* synthetic */ DbOrderImpl$Data(int i, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap, String str) {
        this.a = (i & 1) == 0 ? new LinkedHashSet() : linkedHashSet;
        if ((i & 2) == 0) {
            this.b = new LinkedHashSet();
        } else {
            this.b = linkedHashSet2;
        }
        if ((i & 4) == 0) {
            this.c = new LinkedHashMap();
        } else {
            this.c = linkedHashMap;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public DbOrderImpl$Data() {
        this(0);
    }

    public DbOrderImpl$Data(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap, String str) {
        this.a = linkedHashSet;
        this.b = linkedHashSet2;
        this.c = linkedHashMap;
        this.d = str;
    }

    public /* synthetic */ DbOrderImpl$Data(int i) {
        this(new LinkedHashSet(), new LinkedHashSet(), new LinkedHashMap(), null);
    }
}
