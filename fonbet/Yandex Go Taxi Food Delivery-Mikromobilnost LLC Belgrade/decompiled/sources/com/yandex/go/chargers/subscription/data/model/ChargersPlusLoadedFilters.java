package com.yandex.go.chargers.subscription.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nba;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersPlusLoadedFilters;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPlusLoadedFilters {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(29))};
    public final List a;

    public /* synthetic */ ChargersPlusLoadedFilters(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersPlusLoadedFilters) && jl40.l(this.a, ((ChargersPlusLoadedFilters) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tse0.k("ChargersPlusLoadedFilters(optionIds=", Extension.C_BRAKE, this.a);
    }

    public ChargersPlusLoadedFilters() {
        this.a = null;
    }
}
