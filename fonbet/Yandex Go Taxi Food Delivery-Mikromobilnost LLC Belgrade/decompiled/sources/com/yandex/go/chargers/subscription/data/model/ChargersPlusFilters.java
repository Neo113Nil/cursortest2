package com.yandex.go.chargers.subscription.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nba;
import defpackage.oyr;
import defpackage.qv10;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersPlusFilters;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPlusFilters {
    public static final c Companion = new c();
    public static final i3y[] d;
    public final List a;
    public final List b;
    public final String c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new nba(27)), kotlin.a.b(lazyThreadSafetyMode, new nba(28)), null};
    }

    public /* synthetic */ ChargersPlusFilters(int i, String str, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPlusFilters)) {
            return false;
        }
        ChargersPlusFilters chargersPlusFilters = (ChargersPlusFilters) obj;
        return jl40.l(this.a, chargersPlusFilters.a) && jl40.l(this.b, chargersPlusFilters.b) && jl40.l(this.c, chargersPlusFilters.c);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(qv10.v("ChargersPlusFilters(features=", this.a, ", options=", this.b, ", tariffId="), this.c, Extension.C_BRAKE);
    }

    public ChargersPlusFilters() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
