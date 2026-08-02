package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/ThemedDataEntryDescriptorDto;", "", "dark", "", "light", "behaviour", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;)V", "getDark", "()Ljava/lang/String;", "getLight", "getBehaviour", "()Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ThemedDataEntryDescriptorDto {
    private final DataEntryDescriptorDto.Behaviour behaviour;
    private final String dark;
    private final String light;

    public ThemedDataEntryDescriptorDto(@Json(name = "dark") String str, @Json(name = "light") String str2, @Json(name = "behavior") DataEntryDescriptorDto.Behaviour behaviour) {
        this.dark = str;
        this.light = str2;
        this.behaviour = behaviour;
    }

    public static /* synthetic */ ThemedDataEntryDescriptorDto copy$default(ThemedDataEntryDescriptorDto themedDataEntryDescriptorDto, String str, String str2, DataEntryDescriptorDto.Behaviour behaviour, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themedDataEntryDescriptorDto.dark;
        }
        if ((i & 2) != 0) {
            str2 = themedDataEntryDescriptorDto.light;
        }
        if ((i & 4) != 0) {
            behaviour = themedDataEntryDescriptorDto.behaviour;
        }
        return themedDataEntryDescriptorDto.copy(str, str2, behaviour);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDark() {
        return this.dark;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLight() {
        return this.light;
    }

    /* renamed from: component3, reason: from getter */
    public final DataEntryDescriptorDto.Behaviour getBehaviour() {
        return this.behaviour;
    }

    public final ThemedDataEntryDescriptorDto copy(@Json(name = "dark") String dark, @Json(name = "light") String light, @Json(name = "behavior") DataEntryDescriptorDto.Behaviour behaviour) {
        return new ThemedDataEntryDescriptorDto(dark, light, behaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedDataEntryDescriptorDto)) {
            return false;
        }
        ThemedDataEntryDescriptorDto themedDataEntryDescriptorDto = (ThemedDataEntryDescriptorDto) other;
        return jl40.l(this.dark, themedDataEntryDescriptorDto.dark) && jl40.l(this.light, themedDataEntryDescriptorDto.light) && this.behaviour == themedDataEntryDescriptorDto.behaviour;
    }

    public final DataEntryDescriptorDto.Behaviour getBehaviour() {
        return this.behaviour;
    }

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    public int hashCode() {
        return this.behaviour.hashCode() + unr0.b(this.dark.hashCode() * 31, 31, this.light);
    }

    public String toString() {
        String str = this.dark;
        String str2 = this.light;
        DataEntryDescriptorDto.Behaviour behaviour = this.behaviour;
        StringBuilder v = b64.v("ThemedDataEntryDescriptorDto(dark=", str, ", light=", str2, ", behaviour=");
        v.append(behaviour);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
