package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "", "key", "", "behaviour", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;)V", "getKey", "()Ljava/lang/String;", "getBehaviour", "()Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Behaviour", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DataEntryDescriptorDto {
    private final Behaviour behaviour;
    private final String key;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto$Behaviour;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRED", "OPTIONAL", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Behaviour {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Behaviour[] $VALUES;
        public static final Behaviour REQUIRED = new Behaviour("REQUIRED", 0);
        public static final Behaviour OPTIONAL = new Behaviour("OPTIONAL", 1);

        private static final /* synthetic */ Behaviour[] $values() {
            return new Behaviour[]{REQUIRED, OPTIONAL};
        }

        static {
            Behaviour[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Behaviour(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Behaviour valueOf(String str) {
            return (Behaviour) Enum.valueOf(Behaviour.class, str);
        }

        public static Behaviour[] values() {
            return (Behaviour[]) $VALUES.clone();
        }
    }

    public DataEntryDescriptorDto(@Json(name = "key") String str, @Json(name = "behavior") Behaviour behaviour) {
        this.key = str;
        this.behaviour = behaviour;
    }

    public static /* synthetic */ DataEntryDescriptorDto copy$default(DataEntryDescriptorDto dataEntryDescriptorDto, String str, Behaviour behaviour, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataEntryDescriptorDto.key;
        }
        if ((i & 2) != 0) {
            behaviour = dataEntryDescriptorDto.behaviour;
        }
        return dataEntryDescriptorDto.copy(str, behaviour);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final Behaviour getBehaviour() {
        return this.behaviour;
    }

    public final DataEntryDescriptorDto copy(@Json(name = "key") String key, @Json(name = "behavior") Behaviour behaviour) {
        return new DataEntryDescriptorDto(key, behaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataEntryDescriptorDto)) {
            return false;
        }
        DataEntryDescriptorDto dataEntryDescriptorDto = (DataEntryDescriptorDto) other;
        return jl40.l(this.key, dataEntryDescriptorDto.key) && this.behaviour == dataEntryDescriptorDto.behaviour;
    }

    public final Behaviour getBehaviour() {
        return this.behaviour;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.behaviour.hashCode() + (this.key.hashCode() * 31);
    }

    public String toString() {
        return "DataEntryDescriptorDto(key=" + this.key + ", behaviour=" + this.behaviour + Extension.C_BRAKE;
    }
}
