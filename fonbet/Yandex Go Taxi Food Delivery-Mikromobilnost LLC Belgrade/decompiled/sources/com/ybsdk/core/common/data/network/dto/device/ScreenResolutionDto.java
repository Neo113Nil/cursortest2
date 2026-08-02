package com.ybsdk.core.common.data.network.dto.device;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/device/ScreenResolutionDto;", "", CRLDistributionPointsExtension.POINTS, "", "px", "<init>", "(II)V", "getPoints", "()I", "getPx", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ScreenResolutionDto {
    private final int points;
    private final int px;

    public ScreenResolutionDto(@Json(name = "points") int i, @Json(name = "px") int i2) {
        this.points = i;
        this.px = i2;
    }

    public static /* synthetic */ ScreenResolutionDto copy$default(ScreenResolutionDto screenResolutionDto, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = screenResolutionDto.points;
        }
        if ((i3 & 2) != 0) {
            i2 = screenResolutionDto.px;
        }
        return screenResolutionDto.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPx() {
        return this.px;
    }

    public final ScreenResolutionDto copy(@Json(name = "points") int points, @Json(name = "px") int px) {
        return new ScreenResolutionDto(points, px);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenResolutionDto)) {
            return false;
        }
        ScreenResolutionDto screenResolutionDto = (ScreenResolutionDto) other;
        return this.points == screenResolutionDto.points && this.px == screenResolutionDto.px;
    }

    public final int getPoints() {
        return this.points;
    }

    public final int getPx() {
        return this.px;
    }

    public int hashCode() {
        return Integer.hashCode(this.px) + (Integer.hashCode(this.points) * 31);
    }

    public String toString() {
        return b64.d(this.points, this.px, "ScreenResolutionDto(points=", ", px=", Extension.C_BRAKE);
    }
}
