package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J2\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00028\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/ExpireableDto;", "T", "", "ttl", "", "content", "behaviour", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;", "<init>", "(JLjava/lang/Object;Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;)V", "getTtl", "()J", "getContent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getBehaviour", "()Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;", "component1", "component2", "component3", "copy", "(JLjava/lang/Object;Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;)Lcom/ybsdk/core/common/data/network/dto/cache/ExpireableDto;", "equals", "", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExpireableDto<T> {
    private final DataEntryDescriptorDto.Behaviour behaviour;
    private final T content;
    private final long ttl;

    public ExpireableDto(@Json(name = "ttl") long j, @Json(name = "content") T t, @Json(name = "behavior") DataEntryDescriptorDto.Behaviour behaviour) {
        this.ttl = j;
        this.content = t;
        this.behaviour = behaviour;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpireableDto copy$default(ExpireableDto expireableDto, long j, Object obj, DataEntryDescriptorDto.Behaviour behaviour, int i, Object obj2) {
        if ((i & 1) != 0) {
            j = expireableDto.ttl;
        }
        if ((i & 2) != 0) {
            obj = expireableDto.content;
        }
        if ((i & 4) != 0) {
            behaviour = expireableDto.behaviour;
        }
        return expireableDto.copy(j, obj, behaviour);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    public final T component2() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final DataEntryDescriptorDto.Behaviour getBehaviour() {
        return this.behaviour;
    }

    public final ExpireableDto<T> copy(@Json(name = "ttl") long ttl, @Json(name = "content") T content, @Json(name = "behavior") DataEntryDescriptorDto.Behaviour behaviour) {
        return new ExpireableDto<>(ttl, content, behaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpireableDto)) {
            return false;
        }
        ExpireableDto expireableDto = (ExpireableDto) other;
        return this.ttl == expireableDto.ttl && jl40.l(this.content, expireableDto.content) && this.behaviour == expireableDto.behaviour;
    }

    public final DataEntryDescriptorDto.Behaviour getBehaviour() {
        return this.behaviour;
    }

    public final T getContent() {
        return this.content;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.ttl) * 31;
        T t = this.content;
        return this.behaviour.hashCode() + ((hashCode + (t == null ? 0 : t.hashCode())) * 31);
    }

    public String toString() {
        return "ExpireableDto(ttl=" + this.ttl + ", content=" + this.content + ", behaviour=" + this.behaviour + Extension.C_BRAKE;
    }
}
