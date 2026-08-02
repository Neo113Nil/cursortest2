package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/LocationDto;", "", "lon", "", "lan", "<init>", "(DD)V", "getLon", "()D", "getLan", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationDto {
    private final double lan;
    private final double lon;

    public LocationDto(@Json(name = "lon") double d, @Json(name = "lat") double d2) {
        this.lon = d;
        this.lan = d2;
    }

    public static /* synthetic */ LocationDto copy$default(LocationDto locationDto, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = locationDto.lon;
        }
        if ((i & 2) != 0) {
            d2 = locationDto.lan;
        }
        return locationDto.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLan() {
        return this.lan;
    }

    public final LocationDto copy(@Json(name = "lon") double lon, @Json(name = "lat") double lan) {
        return new LocationDto(lon, lan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationDto)) {
            return false;
        }
        LocationDto locationDto = (LocationDto) other;
        return Double.compare(this.lon, locationDto.lon) == 0 && Double.compare(this.lan, locationDto.lan) == 0;
    }

    public final double getLan() {
        return this.lan;
    }

    public final double getLon() {
        return this.lon;
    }

    public int hashCode() {
        return Double.hashCode(this.lan) + (Double.hashCode(this.lon) * 31);
    }

    public String toString() {
        double d = this.lon;
        return nzs.c(oyr.u(d, "LocationDto(lon=", ", lan="), this.lan, Extension.C_BRAKE);
    }
}
