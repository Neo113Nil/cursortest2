package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wpp0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch", "Lcom/yandex/go/taxi/order/models/api/response/r7;", "Companion", "AccessibilityInfo", "PerformerInfoResponse", "CandidateSearchState", "$serializer", "com/yandex/go/taxi/order/models/api/response/o7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchInfoResponse$TaxiSearch extends r7 {
    public static final o7 Companion = new o7();
    public static final i3y[] j;
    public final CandidateSearchState a;
    public final Integer b;
    public final String c;
    public final Boolean d;
    public final Integer e;
    public final PerformerInfoResponse f;
    public final AccessibilityInfo g;
    public final SearchInfoResponse$DisplaySettings h;
    public final SearchOverlayType i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch$CandidateSearchState;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/n7", "SEARCH", "WAITING_RESPONSE", "REJECTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CandidateSearchState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CandidateSearchState[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final n7 Companion;
        public static final CandidateSearchState REJECTED;
        public static final CandidateSearchState SEARCH;
        public static final CandidateSearchState WAITING_RESPONSE;

        static {
            CandidateSearchState candidateSearchState = new CandidateSearchState("SEARCH", 0);
            SEARCH = candidateSearchState;
            CandidateSearchState candidateSearchState2 = new CandidateSearchState("WAITING_RESPONSE", 1);
            WAITING_RESPONSE = candidateSearchState2;
            CandidateSearchState candidateSearchState3 = new CandidateSearchState("REJECTED", 2);
            REJECTED = candidateSearchState3;
            CandidateSearchState[] candidateSearchStateArr = {candidateSearchState, candidateSearchState2, candidateSearchState3};
            $VALUES = candidateSearchStateArr;
            $ENTRIES = kotlin.enums.a.a(candidateSearchStateArr);
            Companion = new n7();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(7));
        }

        public static CandidateSearchState valueOf(String str) {
            return (CandidateSearchState) Enum.valueOf(CandidateSearchState.class, str);
        }

        public static CandidateSearchState[] values() {
            return (CandidateSearchState[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wpp0(5)), null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wpp0(6))};
    }

    public SearchInfoResponse$TaxiSearch(int i, CandidateSearchState candidateSearchState, Integer num, String str, Boolean bool, Integer num2, PerformerInfoResponse performerInfoResponse, AccessibilityInfo accessibilityInfo, SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings, SearchOverlayType searchOverlayType) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = candidateSearchState;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = performerInfoResponse;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = accessibilityInfo;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = searchInfoResponse$DisplaySettings;
        }
        if ((i & 256) == 0) {
            this.i = SearchOverlayType.NONE;
        } else {
            this.i = searchOverlayType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInfoResponse$TaxiSearch)) {
            return false;
        }
        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch = (SearchInfoResponse$TaxiSearch) obj;
        return this.a == searchInfoResponse$TaxiSearch.a && jl40.l(this.b, searchInfoResponse$TaxiSearch.b) && jl40.l(this.c, searchInfoResponse$TaxiSearch.c) && jl40.l(this.d, searchInfoResponse$TaxiSearch.d) && jl40.l(this.e, searchInfoResponse$TaxiSearch.e) && jl40.l(this.f, searchInfoResponse$TaxiSearch.f) && jl40.l(this.g, searchInfoResponse$TaxiSearch.g) && jl40.l(this.h, searchInfoResponse$TaxiSearch.h) && this.i == searchInfoResponse$TaxiSearch.i;
    }

    public final int hashCode() {
        CandidateSearchState candidateSearchState = this.a;
        int hashCode = (candidateSearchState == null ? 0 : candidateSearchState.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PerformerInfoResponse performerInfoResponse = this.f;
        int hashCode6 = (hashCode5 + (performerInfoResponse == null ? 0 : performerInfoResponse.hashCode())) * 31;
        AccessibilityInfo accessibilityInfo = this.g;
        int hashCode7 = (hashCode6 + (accessibilityInfo == null ? 0 : accessibilityInfo.hashCode())) * 31;
        SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = this.h;
        return this.i.hashCode() + ((hashCode7 + (searchInfoResponse$DisplaySettings != null ? searchInfoResponse$DisplaySettings.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiSearch(state=");
        sb.append(this.a);
        sb.append(", candidatesCount=");
        sb.append(this.b);
        sb.append(", stateTp=");
        tse0.A(sb, this.c, ", hasPreviousCandidates=", this.d, ", etaInSeconds=");
        sb.append(this.e);
        sb.append(", performerInfo=");
        sb.append(this.f);
        sb.append(", accessibilityInfo=");
        sb.append(this.g);
        sb.append(", displaySettings=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch$AccessibilityInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/m7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AccessibilityInfo {
        public static final m7 Companion = new m7();
        public final String a;

        public /* synthetic */ AccessibilityInfo(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccessibilityInfo) && jl40.l(this.a, ((AccessibilityInfo) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("AccessibilityInfo(photo=", this.a, Extension.C_BRAKE);
        }

        public AccessibilityInfo() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch$PerformerInfoResponse;", "", "Companion", "DriverPositionResponse", "$serializer", "com/yandex/go/taxi/order/models/api/response/p7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PerformerInfoResponse {
        public static final p7 Companion = new p7();
        public static final i3y[] i = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(8)), null, null, null, null, null};
        public final String a;
        public final String b;
        public final List c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        public /* synthetic */ PerformerInfoResponse(int i2, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7) {
            if ((i2 & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i2 & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i2 & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
            if ((i2 & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i2 & 16) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i2 & 32) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
            if ((i2 & 64) == 0) {
                this.g = null;
            } else {
                this.g = str6;
            }
            if ((i2 & 128) == 0) {
                this.h = null;
            } else {
                this.h = str7;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PerformerInfoResponse)) {
                return false;
            }
            PerformerInfoResponse performerInfoResponse = (PerformerInfoResponse) obj;
            return jl40.l(this.a, performerInfoResponse.a) && jl40.l(this.b, performerInfoResponse.b) && jl40.l(this.c, performerInfoResponse.c) && jl40.l(this.d, performerInfoResponse.d) && jl40.l(this.e, performerInfoResponse.e) && jl40.l(this.f, performerInfoResponse.f) && jl40.l(this.g, performerInfoResponse.g) && jl40.l(this.h, performerInfoResponse.h);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int c = unr0.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
            String str3 = this.d;
            int hashCode2 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.h;
            return hashCode5 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("PerformerInfoResponse(id=", this.a, ", displayTariff=", this.b, ", coordinates=");
            oyr.D(", carColorCode=", this.d, ", name=", v, this.c);
            g8e.D(v, this.e, ", rating=", this.f, ", photoUrlTag=");
            return g8e.r(v, this.g, ", photoUrl=", this.h, Extension.C_BRAKE);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/q7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class DriverPositionResponse {
            public static final q7 Companion = new q7();
            public final Double a;
            public final Double b;
            public final Double c;
            public final Double d;
            public final String e;

            public /* synthetic */ DriverPositionResponse(int i, Double d, Double d2, Double d3, Double d4, String str) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = d;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = d2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = d3;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = d4;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = str;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DriverPositionResponse)) {
                    return false;
                }
                DriverPositionResponse driverPositionResponse = (DriverPositionResponse) obj;
                return jl40.l(this.a, driverPositionResponse.a) && jl40.l(this.b, driverPositionResponse.b) && jl40.l(this.c, driverPositionResponse.c) && jl40.l(this.d, driverPositionResponse.d) && jl40.l(this.e, driverPositionResponse.e);
            }

            public final int hashCode() {
                Double d = this.a;
                int hashCode = (d == null ? 0 : d.hashCode()) * 31;
                Double d2 = this.b;
                int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
                Double d3 = this.c;
                int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
                Double d4 = this.d;
                int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
                String str = this.e;
                return hashCode4 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DriverPositionResponse(lon=");
                sb.append(this.a);
                sb.append(", lat=");
                sb.append(this.b);
                sb.append(", direction=");
                sb.append(this.c);
                sb.append(", speed=");
                sb.append(this.d);
                sb.append(", timestamp=");
                return oyr.t(sb, this.e, Extension.C_BRAKE);
            }

            public DriverPositionResponse() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
            }
        }

        public PerformerInfoResponse() {
            this.a = null;
            this.b = null;
            this.c = EmptyList.a;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
    }

    public SearchInfoResponse$TaxiSearch(CandidateSearchState candidateSearchState, Integer num, String str, Boolean bool, Integer num2, PerformerInfoResponse performerInfoResponse, AccessibilityInfo accessibilityInfo, SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings, SearchOverlayType searchOverlayType) {
        this.a = candidateSearchState;
        this.b = num;
        this.c = str;
        this.d = bool;
        this.e = num2;
        this.f = performerInfoResponse;
        this.g = accessibilityInfo;
        this.h = searchInfoResponse$DisplaySettings;
        this.i = searchOverlayType;
    }

    public SearchInfoResponse$TaxiSearch() {
        this(null, null, null, null, null, null, null, null, SearchOverlayType.NONE);
    }
}
