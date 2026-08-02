package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/AfsParamsDto;", "", "metricaId", "", "ownId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMetricaId", "()Ljava/lang/String;", "getOwnId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AfsParamsDto {
    private final String metricaId;
    private final String ownId;

    public AfsParamsDto(@Json(name = "metrica_device_id") String str, @Json(name = "own_device_id") String str2) {
        this.metricaId = str;
        this.ownId = str2;
    }

    public static /* synthetic */ AfsParamsDto copy$default(AfsParamsDto afsParamsDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = afsParamsDto.metricaId;
        }
        if ((i & 2) != 0) {
            str2 = afsParamsDto.ownId;
        }
        return afsParamsDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMetricaId() {
        return this.metricaId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOwnId() {
        return this.ownId;
    }

    public final AfsParamsDto copy(@Json(name = "metrica_device_id") String metricaId, @Json(name = "own_device_id") String ownId) {
        return new AfsParamsDto(metricaId, ownId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AfsParamsDto)) {
            return false;
        }
        AfsParamsDto afsParamsDto = (AfsParamsDto) other;
        return jl40.l(this.metricaId, afsParamsDto.metricaId) && jl40.l(this.ownId, afsParamsDto.ownId);
    }

    public final String getMetricaId() {
        return this.metricaId;
    }

    public final String getOwnId() {
        return this.ownId;
    }

    public int hashCode() {
        String str = this.metricaId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("AfsParamsDto(metricaId=", this.metricaId, ", ownId=", this.ownId, Extension.C_BRAKE);
    }
}
