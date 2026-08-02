package com.yandex.go.loyalty.impl.selector.data.model;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/GeoState;", "", "Companion", "$serializer", "com/yandex/go/loyalty/impl/selector/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GeoState {
    public static final a Companion = new a();
    public final Float a;
    public final String b;
    public final zzs c;

    public /* synthetic */ GeoState(int i, Float f, String str, zzs zzsVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, GeoState$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = str;
        this.c = zzsVar;
    }

    public GeoState(Float f, String str, zzs zzsVar) {
        this.a = f;
        this.b = str;
        this.c = zzsVar;
    }
}
