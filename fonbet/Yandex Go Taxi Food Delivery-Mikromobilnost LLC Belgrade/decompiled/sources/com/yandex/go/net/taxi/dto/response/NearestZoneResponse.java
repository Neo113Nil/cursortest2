package com.yandex.go.net.taxi.dto.response;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;", "", "Companion", "NearestZoneError", "NearestZoneDetails", "com/yandex/go/net/taxi/dto/response/a", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NearestZoneResponse {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final NearestZoneError c;
    public final String d;
    public final String e;
    public final NearestZoneDetails f;

    public /* synthetic */ NearestZoneResponse(int i, String str, String str2, NearestZoneError nearestZoneError, String str3, String str4, NearestZoneDetails nearestZoneDetails) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = nearestZoneError;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = nearestZoneDetails;
        }
    }

    public final String a() {
        String str = this.d;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        NearestZoneError nearestZoneError = this.c;
        if (nearestZoneError != null) {
            return nearestZoneError.a;
        }
        return null;
    }

    public final String b() {
        String str;
        NearestZoneDetails nearestZoneDetails = this.f;
        if (nearestZoneDetails != null && (str = nearestZoneDetails.a) != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        NearestZoneError nearestZoneError = this.c;
        if (nearestZoneError != null) {
            return nearestZoneError.b;
        }
        return null;
    }

    public final String c() {
        String str;
        NearestZoneDetails nearestZoneDetails = this.f;
        if (nearestZoneDetails != null && (str = nearestZoneDetails.b) != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        NearestZoneError nearestZoneError = this.c;
        if (nearestZoneError != null) {
            return nearestZoneError.c;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse$NearestZoneDetails;", "", "Companion", "$serializer", "com/yandex/go/net/taxi/dto/response/b", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NearestZoneDetails {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ NearestZoneDetails(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public NearestZoneDetails() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse$NearestZoneError;", "", "Companion", "$serializer", "com/yandex/go/net/taxi/dto/response/c", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NearestZoneError {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ NearestZoneError(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public NearestZoneError() {
            this(null, null, 7);
        }

        public NearestZoneError(String str, String str2, int i) {
            str = (i & 2) != 0 ? null : str;
            str2 = (i & 4) != 0 ? null : str2;
            this.a = null;
            this.b = str;
            this.c = str2;
        }
    }

    public NearestZoneResponse() {
        this(null, null, null, null, null, 63);
    }

    public NearestZoneResponse(String str, String str2, NearestZoneError nearestZoneError, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        nearestZoneError = (i & 4) != 0 ? null : nearestZoneError;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        this.a = str;
        this.b = str2;
        this.c = nearestZoneError;
        this.d = str3;
        this.e = str4;
        this.f = null;
    }
}
