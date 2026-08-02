package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "", "value", "", "version", "Lcom/ybsdk/core/common/data/network/dto/HmacDto$Version;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/HmacDto$Version;)V", "getValue", "()Ljava/lang/String;", "getVersion", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto$Version;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Version", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class HmacDto {
    private final String value;
    private final Version version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/HmacDto$Version;", "", "<init>", "(Ljava/lang/String;I)V", "ONE", "FOUR", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Version {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Version[] $VALUES;

        @Json(name = "1")
        public static final Version ONE = new Version("ONE", 0);

        @Json(name = "4")
        public static final Version FOUR = new Version("FOUR", 1);

        private static final /* synthetic */ Version[] $values() {
            return new Version[]{ONE, FOUR};
        }

        static {
            Version[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Version(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) $VALUES.clone();
        }
    }

    public HmacDto(@Json(name = "value") String str, @Json(name = "version") Version version) {
        this.value = str;
        this.version = version;
    }

    public static /* synthetic */ HmacDto copy$default(HmacDto hmacDto, String str, Version version, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hmacDto.value;
        }
        if ((i & 2) != 0) {
            version = hmacDto.version;
        }
        return hmacDto.copy(str, version);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final Version getVersion() {
        return this.version;
    }

    public final HmacDto copy(@Json(name = "value") String value, @Json(name = "version") Version version) {
        return new HmacDto(value, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmacDto)) {
            return false;
        }
        HmacDto hmacDto = (HmacDto) other;
        return jl40.l(this.value, hmacDto.value) && this.version == hmacDto.version;
    }

    public final String getValue() {
        return this.value;
    }

    public final Version getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.value.hashCode() * 31);
    }

    public String toString() {
        return "HmacDto(value=" + this.value + ", version=" + this.version + Extension.C_BRAKE;
    }
}
