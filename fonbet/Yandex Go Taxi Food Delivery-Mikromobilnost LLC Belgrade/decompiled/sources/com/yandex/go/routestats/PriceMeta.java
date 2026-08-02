package com.yandex.go.routestats;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.rpe0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/routestats/PriceMeta;", "", "Companion", "$serializer", "com/yandex/go/routestats/b", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PriceMeta {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final Map a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new rpe0(4)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(5))};
    }

    public /* synthetic */ PriceMeta(int i, Map map, Map map2) {
        this.a = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceMeta)) {
            return false;
        }
        PriceMeta priceMeta = (PriceMeta) obj;
        return jl40.l(this.a, priceMeta.a) && jl40.l(this.b, priceMeta.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PriceMeta(args=" + this.a + ", usedFormats=" + this.b + Extension.C_BRAKE;
    }

    public PriceMeta(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public PriceMeta() {
        this(kotlin.collections.b.f(), kotlin.collections.b.f());
    }
}
