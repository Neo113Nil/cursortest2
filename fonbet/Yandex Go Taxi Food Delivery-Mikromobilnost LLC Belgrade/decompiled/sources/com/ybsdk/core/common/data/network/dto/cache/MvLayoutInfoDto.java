package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00028\u0000\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u0017\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00028\u00002\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDto;", "T", "", "ttl", "", "hash", "", "info", "version", "", "<init>", "(JLjava/lang/String;Ljava/lang/Object;I)V", "getTtl", "()J", "getHash", "()Ljava/lang/String;", "getInfo", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getVersion", "()I", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/Object;I)Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDto;", "equals", "", "other", "hashCode", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MvLayoutInfoDto<T> {
    private final String hash;
    private final T info;
    private final long ttl;
    private final int version;

    public MvLayoutInfoDto(@Json(name = "ttl") long j, @Json(name = "hash") String str, @Json(name = "info") T t, @Json(name = "version") int i) {
        this.ttl = j;
        this.hash = str;
        this.info = t;
        this.version = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MvLayoutInfoDto copy$default(MvLayoutInfoDto mvLayoutInfoDto, long j, String str, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            j = mvLayoutInfoDto.ttl;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = mvLayoutInfoDto.hash;
        }
        String str2 = str;
        T t = obj;
        if ((i2 & 4) != 0) {
            t = mvLayoutInfoDto.info;
        }
        T t2 = t;
        if ((i2 & 8) != 0) {
            i = mvLayoutInfoDto.version;
        }
        return mvLayoutInfoDto.copy(j2, str2, t2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final T component3() {
        return this.info;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final MvLayoutInfoDto<T> copy(@Json(name = "ttl") long ttl, @Json(name = "hash") String hash, @Json(name = "info") T info, @Json(name = "version") int version) {
        return new MvLayoutInfoDto<>(ttl, hash, info, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MvLayoutInfoDto)) {
            return false;
        }
        MvLayoutInfoDto mvLayoutInfoDto = (MvLayoutInfoDto) other;
        return this.ttl == mvLayoutInfoDto.ttl && jl40.l(this.hash, mvLayoutInfoDto.hash) && jl40.l(this.info, mvLayoutInfoDto.info) && this.version == mvLayoutInfoDto.version;
    }

    public final String getHash() {
        return this.hash;
    }

    public final T getInfo() {
        return this.info;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int b = unr0.b(Long.hashCode(this.ttl) * 31, 31, this.hash);
        T t = this.info;
        return Integer.hashCode(this.version) + ((b + (t == null ? 0 : t.hashCode())) * 31);
    }

    public String toString() {
        long j = this.ttl;
        String str = this.hash;
        T t = this.info;
        int i = this.version;
        StringBuilder k = x4e.k("MvLayoutInfoDto(ttl=", j, ", hash=", str);
        k.append(", info=");
        k.append(t);
        k.append(", version=");
        k.append(i);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
