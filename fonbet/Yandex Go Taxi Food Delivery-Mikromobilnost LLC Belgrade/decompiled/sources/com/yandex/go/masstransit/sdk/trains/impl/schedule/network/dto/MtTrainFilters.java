package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.e540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainFilters;", "", "Companion", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/n", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainFilters {
    public static final n Companion = new n();
    public static final i3y[] c;
    public static final MtTrainFilters d;
    public final Map a;
    public final List b;

    static {
        k kVar = MtTrainFilter.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new e540(17)), kotlin.a.b(lazyThreadSafetyMode, new e540(19))};
        d = new MtTrainFilters(0);
    }

    public /* synthetic */ MtTrainFilters(int i, List list, Map map) {
        this.a = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainFilters)) {
            return false;
        }
        MtTrainFilters mtTrainFilters = (MtTrainFilters) obj;
        return jl40.l(this.a, mtTrainFilters.a) && jl40.l(this.b, mtTrainFilters.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtTrainFilters(selectedIds=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }

    public MtTrainFilters() {
        this(0);
    }

    public MtTrainFilters(int i) {
        this.a = kotlin.collections.b.f();
        this.b = EmptyList.a;
    }
}
