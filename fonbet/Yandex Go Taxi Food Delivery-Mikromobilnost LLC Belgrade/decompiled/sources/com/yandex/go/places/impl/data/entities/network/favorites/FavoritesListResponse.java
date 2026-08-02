package com.yandex.go.places.impl.data.entities.network.favorites;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.thp;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/favorites/FavoritesListResponse;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/favorites/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FavoritesListResponse {
    public static final b Companion = new b();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final int c;
    public final int d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new thp(8)), kotlin.a.b(lazyThreadSafetyMode, new thp(9)), null, null};
    }

    public /* synthetic */ FavoritesListResponse(int i, int i2, int i3, List list, List list2) {
        int i4 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i4 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = -1;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = -1;
        } else {
            this.d = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoritesListResponse)) {
            return false;
        }
        FavoritesListResponse favoritesListResponse = (FavoritesListResponse) obj;
        return jl40.l(this.a, favoritesListResponse.a) && jl40.l(this.b, favoritesListResponse.b) && this.c == favoritesListResponse.c && this.d == favoritesListResponse.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", offset=", Extension.C_BRAKE, qv10.v("FavoritesListResponse(mapObjects=", this.a, ", favorites=", this.b, ", limit="));
    }

    public FavoritesListResponse() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = -1;
        this.d = -1;
    }
}
