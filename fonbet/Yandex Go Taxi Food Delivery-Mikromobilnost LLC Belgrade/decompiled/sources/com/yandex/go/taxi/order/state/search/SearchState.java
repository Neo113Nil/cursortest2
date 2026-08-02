package com.yandex.go.taxi.order.state.search;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.search.polling.model.ETA;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.wpp0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/state/search/SearchState;", "", "Companion", "com/yandex/go/taxi/order/state/search/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchState {
    public static final SearchState A;
    public static final c Companion = new c();
    public static final i3y[] z;
    public final String a;
    public final String b;
    public final ServiceLevel.SearchingPulsarDTO.SearchingPulsar c;
    public final SearchOverlayType d;
    public final SearchInfoResponse$TaxiSearch.CandidateSearchState e;
    public final boolean f;
    public final ETA g;
    public final boolean h;
    public final String i;
    public final Integer j;
    public final boolean k;
    public final DriverCandidate l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final SearchAccessibilityValues p;
    public final boolean q;
    public final Long r;
    public final Double s;
    public final boolean t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;

    static {
        com.yandex.go.taxi.order.search.polling.model.a aVar = DriverCandidate.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        z = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new wpp0(17)), kotlin.a.b(lazyThreadSafetyMode, new wpp0(18)), kotlin.a.b(lazyThreadSafetyMode, new wpp0(19)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        A = new SearchState(0);
    }

    public /* synthetic */ SearchState(int i, String str, String str2, ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar, SearchOverlayType searchOverlayType, SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState, boolean z2, ETA eta, boolean z3, String str3, Integer num, boolean z4, DriverCandidate driverCandidate, boolean z5, boolean z6, int i2, SearchAccessibilityValues searchAccessibilityValues, boolean z7, Long l, Double d, boolean z8, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = ServiceLevel.SearchingPulsarDTO.SearchingPulsar.NONE;
        } else {
            this.c = searchingPulsar;
        }
        if ((i & 8) == 0) {
            this.d = SearchOverlayType.NONE;
        } else {
            this.d = searchOverlayType;
        }
        if ((i & 16) == 0) {
            this.e = SearchInfoResponse$TaxiSearch.CandidateSearchState.SEARCH;
        } else {
            this.e = candidateSearchState;
        }
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = eta;
        }
        if ((i & 128) == 0) {
            this.h = true;
        } else {
            this.h = z3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = driverCandidate;
        }
        if ((i & 4096) == 0) {
            this.m = true;
        } else {
            this.m = z5;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z6;
        }
        if ((i & 16384) == 0) {
            this.o = 0;
        } else {
            this.o = i2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = searchAccessibilityValues;
        }
        if ((65536 & i) == 0) {
            this.q = false;
        } else {
            this.q = z7;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = d;
        }
        if ((524288 & i) == 0) {
            this.t = false;
        } else {
            this.t = z8;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = str4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str5;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str6;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = str7;
        }
        if ((i & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = str8;
        }
    }

    public static SearchState a(SearchState searchState, String str, String str2, ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar, SearchOverlayType searchOverlayType, SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState, boolean z2, ETA eta, boolean z3, String str3, Integer num, boolean z4, DriverCandidate driverCandidate, boolean z5, boolean z6, int i, SearchAccessibilityValues searchAccessibilityValues, boolean z7, Long l, Double d, boolean z8, String str4, String str5, String str6, String str7, String str8, int i2) {
        ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar2 = (i2 & 4) != 0 ? searchState.c : searchingPulsar;
        SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState2 = (i2 & 16) != 0 ? searchState.e : candidateSearchState;
        ETA eta2 = (i2 & 64) != 0 ? searchState.g : eta;
        String str9 = (i2 & 256) != 0 ? searchState.i : str3;
        Integer num2 = (i2 & 512) != 0 ? searchState.j : num;
        boolean z9 = (i2 & 1024) != 0 ? searchState.k : z4;
        DriverCandidate driverCandidate2 = (i2 & 2048) != 0 ? searchState.l : driverCandidate;
        int i3 = (i2 & 16384) != 0 ? searchState.o : i;
        SearchAccessibilityValues searchAccessibilityValues2 = (32768 & i2) != 0 ? searchState.p : searchAccessibilityValues;
        Long l2 = (131072 & i2) != 0 ? searchState.r : l;
        Double d2 = (262144 & i2) != 0 ? searchState.s : d;
        boolean z10 = (524288 & i2) != 0 ? searchState.t : z8;
        String str10 = (1048576 & i2) != 0 ? searchState.u : str4;
        String str11 = (2097152 & i2) != 0 ? searchState.v : str5;
        String str12 = (4194304 & i2) != 0 ? searchState.w : str6;
        String str13 = (8388608 & i2) != 0 ? searchState.x : str7;
        String str14 = (i2 & 16777216) != 0 ? searchState.y : str8;
        searchState.getClass();
        return new SearchState(str, str2, searchingPulsar2, searchOverlayType, candidateSearchState2, z2, eta2, z3, str9, num2, z9, driverCandidate2, z5, z6, i3, searchAccessibilityValues2, z7, l2, d2, z10, str10, str11, str12, str13, str14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) obj;
        return jl40.l(this.a, searchState.a) && jl40.l(this.b, searchState.b) && this.c == searchState.c && this.d == searchState.d && this.e == searchState.e && this.f == searchState.f && jl40.l(this.g, searchState.g) && this.h == searchState.h && jl40.l(this.i, searchState.i) && jl40.l(this.j, searchState.j) && this.k == searchState.k && jl40.l(this.l, searchState.l) && this.m == searchState.m && this.n == searchState.n && this.o == searchState.o && jl40.l(this.p, searchState.p) && this.q == searchState.q && jl40.l(this.r, searchState.r) && jl40.l(this.s, searchState.s) && this.t == searchState.t && jl40.l(this.u, searchState.u) && jl40.l(this.v, searchState.v) && jl40.l(this.w, searchState.w) && jl40.l(this.x, searchState.x) && jl40.l(this.y, searchState.y);
    }

    public final int hashCode() {
        int e = unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f);
        ETA eta = this.g;
        int e2 = unr0.e((e + (eta == null ? 0 : eta.hashCode())) * 31, 31, this.h);
        String str = this.i;
        int hashCode = (e2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.j;
        int e3 = unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.k);
        DriverCandidate driverCandidate = this.l;
        int b = oyr.b(this.o, unr0.e(unr0.e((e3 + (driverCandidate == null ? 0 : driverCandidate.hashCode())) * 31, 31, this.m), 31, this.n), 31);
        SearchAccessibilityValues searchAccessibilityValues = this.p;
        int e4 = unr0.e((b + (searchAccessibilityValues == null ? 0 : searchAccessibilityValues.a.hashCode())) * 31, 31, this.q);
        Long l = this.r;
        int hashCode2 = (e4 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.s;
        int e5 = unr0.e((hashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.t);
        String str2 = this.u;
        int hashCode3 = (e5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.v;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.w;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.x;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.y;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SearchState(orderId=", this.a, ", tariffZone=", this.b, ", searchingPulsar=");
        v.append(this.c);
        v.append(", searchOverlayType=");
        v.append(this.d);
        v.append(", candidateSearchState=");
        v.append(this.e);
        v.append(", isShadowOverlayVisible=");
        v.append(this.f);
        v.append(", eta=");
        v.append(this.g);
        v.append(", isPinVisible=");
        v.append(this.h);
        v.append(", stateTp=");
        vfc.w(this.j, this.i, ", candidatesCount=", ", hasPreviousCandidates=", v);
        v.append(this.k);
        v.append(", candidate=");
        v.append(this.l);
        v.append(", shouldHideProgress=");
        nnm.v(", shouldShowTimer=", ", candidateQueueOrder=", v, this.m, this.n);
        v.append(this.o);
        v.append(", searchAccessibilityValues=");
        v.append(this.p);
        v.append(", shouldHidePinEta=");
        v.append(this.q);
        v.append(", delayToShowCompanionsPins=");
        v.append(this.r);
        v.append(", searchRadiusCompanions=");
        v.append(this.s);
        v.append(", shouldShowLongSearchBanner=");
        v.append(this.t);
        v.append(", longSearchTitle=");
        g8e.D(v, this.u, ", bannerTitle=", this.v, ", bannerIconTag=");
        g8e.D(v, this.w, ", mapToggleTitle=", this.x, ", mapToggleAccessibilityContentDescription=");
        return oyr.t(v, this.y, Extension.C_BRAKE);
    }

    public SearchState() {
        this(0);
    }

    public SearchState(String str, String str2, ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar, SearchOverlayType searchOverlayType, SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState, boolean z2, ETA eta, boolean z3, String str3, Integer num, boolean z4, DriverCandidate driverCandidate, boolean z5, boolean z6, int i, SearchAccessibilityValues searchAccessibilityValues, boolean z7, Long l, Double d, boolean z8, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = searchingPulsar;
        this.d = searchOverlayType;
        this.e = candidateSearchState;
        this.f = z2;
        this.g = eta;
        this.h = z3;
        this.i = str3;
        this.j = num;
        this.k = z4;
        this.l = driverCandidate;
        this.m = z5;
        this.n = z6;
        this.o = i;
        this.p = searchAccessibilityValues;
        this.q = z7;
        this.r = l;
        this.s = d;
        this.t = z8;
        this.u = str4;
        this.v = str5;
        this.w = str6;
        this.x = str7;
        this.y = str8;
    }

    public /* synthetic */ SearchState(int i) {
        this("", "", ServiceLevel.SearchingPulsarDTO.SearchingPulsar.NONE, SearchOverlayType.NONE, SearchInfoResponse$TaxiSearch.CandidateSearchState.SEARCH, true, null, true, null, null, false, null, true, false, 0, null, false, null, null, false, null, null, null, null, null);
    }
}
