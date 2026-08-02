package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.wpp0;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/SearchInfoResponse$CompanionsSearch", "Lcom/yandex/go/taxi/order/models/api/response/r7;", "Companion", "TravelCompanion", "$serializer", "com/yandex/go/taxi/order/models/api/response/c7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchInfoResponse$CompanionsSearch extends r7 {
    public static final c7 Companion = new c7();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(2)), null, null, null};
    public final List a;
    public final long b;
    public final double c;
    public final SearchInfoResponse$DisplaySettings d;

    public SearchInfoResponse$CompanionsSearch(int i, List list, long j, double d, SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 0.0d;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = searchInfoResponse$DisplaySettings;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInfoResponse$CompanionsSearch)) {
            return false;
        }
        SearchInfoResponse$CompanionsSearch searchInfoResponse$CompanionsSearch = (SearchInfoResponse$CompanionsSearch) obj;
        return jl40.l(this.a, searchInfoResponse$CompanionsSearch.a) && this.b == searchInfoResponse$CompanionsSearch.b && Double.compare(this.c, searchInfoResponse$CompanionsSearch.c) == 0 && jl40.l(this.d, searchInfoResponse$CompanionsSearch.d);
    }

    public final int hashCode() {
        int a = unr0.a(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = this.d;
        return a + (searchInfoResponse$DisplaySettings == null ? 0 : searchInfoResponse$DisplaySettings.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompanionsSearch(companions=");
        sb.append(this.a);
        sb.append(", delayToShowPins=");
        sb.append(this.b);
        nzs.o(sb, ", searchRadius=", this.c, ", displaySettings=");
        sb.append(this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$CompanionsSearch$TravelCompanion;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TravelCompanion {
        public static final d7 Companion = new d7();
        public final String a;
        public final zzs b;
        public final long c;

        public /* synthetic */ TravelCompanion(int i, String str, zzs zzsVar, long j) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = zzs.f;
            } else {
                this.b = zzsVar;
            }
            if ((i & 4) == 0) {
                this.c = 0L;
            } else {
                this.c = j;
            }
        }

        /* renamed from: a, reason: from getter */
        public final zzs getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TravelCompanion)) {
                return false;
            }
            TravelCompanion travelCompanion = (TravelCompanion) obj;
            return jl40.l(this.a, travelCompanion.a) && jl40.l(this.b, travelCompanion.b) && this.c == travelCompanion.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + nnm.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TravelCompanion(iconTag=");
            sb.append(this.a);
            sb.append(", point=");
            sb.append(this.b);
            sb.append(", delayToShow=");
            return oyr.n(this.c, Extension.C_BRAKE, sb);
        }

        public TravelCompanion() {
            zzs zzsVar = zzs.f;
            this.a = "";
            this.b = zzsVar;
            this.c = 0L;
        }
    }

    public SearchInfoResponse$CompanionsSearch() {
        this.a = EmptyList.a;
        this.b = 0L;
        this.c = 0.0d;
        this.d = null;
    }
}
