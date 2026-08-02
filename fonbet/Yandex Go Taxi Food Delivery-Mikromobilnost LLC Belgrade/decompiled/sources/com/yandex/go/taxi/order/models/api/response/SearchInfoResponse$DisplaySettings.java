package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/SearchInfoResponse$DisplaySettings", "", "Companion", "MapToggle", "$serializer", "com/yandex/go/taxi/order/models/api/response/g7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchInfoResponse$DisplaySettings {
    public static final g7 Companion = new g7();
    public final Boolean a;
    public final Boolean b;
    public final MapToggle c;

    public /* synthetic */ SearchInfoResponse$DisplaySettings(int i, Boolean bool, Boolean bool2, MapToggle mapToggle) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = mapToggle;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInfoResponse$DisplaySettings)) {
            return false;
        }
        SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = (SearchInfoResponse$DisplaySettings) obj;
        return jl40.l(this.a, searchInfoResponse$DisplaySettings.a) && jl40.l(this.b, searchInfoResponse$DisplaySettings.b) && jl40.l(this.c, searchInfoResponse$DisplaySettings.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MapToggle mapToggle = this.c;
        return hashCode2 + (mapToggle != null ? mapToggle.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$DisplaySettings$MapToggle;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/h7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class MapToggle {
        public static final h7 Companion = new h7();
        public final String a;
        public final String b;

        public /* synthetic */ MapToggle(int i, String str, String str2) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapToggle)) {
                return false;
            }
            MapToggle mapToggle = (MapToggle) obj;
            return jl40.l(this.a, mapToggle.a) && jl40.l(this.b, mapToggle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public MapToggle() {
            this.a = "";
            this.b = "";
        }
    }

    public SearchInfoResponse$DisplaySettings() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
