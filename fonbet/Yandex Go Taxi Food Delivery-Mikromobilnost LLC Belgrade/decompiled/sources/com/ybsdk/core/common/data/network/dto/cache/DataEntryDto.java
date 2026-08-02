package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDto;", "", "ttl", "", "type", "", "value", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getTtl", "()J", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DataEntryDto {
    private final long ttl;
    private final String type;
    private final String value;

    public DataEntryDto(@Json(name = "ttl") long j, @Json(name = "type") String str, @Json(name = "value") String str2) {
        this.ttl = j;
        this.type = str;
        this.value = str2;
    }

    public static /* synthetic */ DataEntryDto copy$default(DataEntryDto dataEntryDto, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dataEntryDto.ttl;
        }
        if ((i & 2) != 0) {
            str = dataEntryDto.type;
        }
        if ((i & 4) != 0) {
            str2 = dataEntryDto.value;
        }
        return dataEntryDto.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final DataEntryDto copy(@Json(name = "ttl") long ttl, @Json(name = "type") String type, @Json(name = "value") String value) {
        return new DataEntryDto(ttl, type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataEntryDto)) {
            return false;
        }
        DataEntryDto dataEntryDto = (DataEntryDto) other;
        return this.ttl == dataEntryDto.ttl && jl40.l(this.type, dataEntryDto.type) && jl40.l(this.value, dataEntryDto.value);
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + unr0.b(Long.hashCode(this.ttl) * 31, 31, this.type);
    }

    public String toString() {
        long j = this.ttl;
        String str = this.type;
        return unr0.r(x4e.k("DataEntryDto(ttl=", j, ", type=", str), ", value=", this.value, Extension.C_BRAKE);
    }
}
