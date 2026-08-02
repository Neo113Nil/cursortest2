package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto;", "", "defaultsGroup", "", "eventId", MetaDataField.SCREEN_FIELD, "type", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto$CommunicationTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto$CommunicationTypeDto;)V", "getDefaultsGroup", "()Ljava/lang/String;", "getEventId", "getScreen", "getType", "()Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto$CommunicationTypeDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CommunicationTypeDto", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommunicationsShownInfoItemDto {
    private final String defaultsGroup;
    private final String eventId;
    private final String screen;
    private final CommunicationTypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto$CommunicationTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "FULLSCREEN", "EDUCATION", "SMALL_TOOLTIP", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CommunicationTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CommunicationTypeDto[] $VALUES;
        public static final CommunicationTypeDto FULLSCREEN = new CommunicationTypeDto("FULLSCREEN", 0);
        public static final CommunicationTypeDto EDUCATION = new CommunicationTypeDto("EDUCATION", 1);
        public static final CommunicationTypeDto SMALL_TOOLTIP = new CommunicationTypeDto("SMALL_TOOLTIP", 2);

        private static final /* synthetic */ CommunicationTypeDto[] $values() {
            return new CommunicationTypeDto[]{FULLSCREEN, EDUCATION, SMALL_TOOLTIP};
        }

        static {
            CommunicationTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CommunicationTypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CommunicationTypeDto valueOf(String str) {
            return (CommunicationTypeDto) Enum.valueOf(CommunicationTypeDto.class, str);
        }

        public static CommunicationTypeDto[] values() {
            return (CommunicationTypeDto[]) $VALUES.clone();
        }
    }

    public CommunicationsShownInfoItemDto(@Json(name = "defaults_group") String str, @Json(name = "event_id") String str2, @Json(name = "screen") String str3, @Json(name = "type") CommunicationTypeDto communicationTypeDto) {
        this.defaultsGroup = str;
        this.eventId = str2;
        this.screen = str3;
        this.type = communicationTypeDto;
    }

    public static /* synthetic */ CommunicationsShownInfoItemDto copy$default(CommunicationsShownInfoItemDto communicationsShownInfoItemDto, String str, String str2, String str3, CommunicationTypeDto communicationTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communicationsShownInfoItemDto.defaultsGroup;
        }
        if ((i & 2) != 0) {
            str2 = communicationsShownInfoItemDto.eventId;
        }
        if ((i & 4) != 0) {
            str3 = communicationsShownInfoItemDto.screen;
        }
        if ((i & 8) != 0) {
            communicationTypeDto = communicationsShownInfoItemDto.type;
        }
        return communicationsShownInfoItemDto.copy(str, str2, str3, communicationTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultsGroup() {
        return this.defaultsGroup;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    /* renamed from: component4, reason: from getter */
    public final CommunicationTypeDto getType() {
        return this.type;
    }

    public final CommunicationsShownInfoItemDto copy(@Json(name = "defaults_group") String defaultsGroup, @Json(name = "event_id") String eventId, @Json(name = "screen") String screen, @Json(name = "type") CommunicationTypeDto type) {
        return new CommunicationsShownInfoItemDto(defaultsGroup, eventId, screen, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationsShownInfoItemDto)) {
            return false;
        }
        CommunicationsShownInfoItemDto communicationsShownInfoItemDto = (CommunicationsShownInfoItemDto) other;
        return jl40.l(this.defaultsGroup, communicationsShownInfoItemDto.defaultsGroup) && jl40.l(this.eventId, communicationsShownInfoItemDto.eventId) && jl40.l(this.screen, communicationsShownInfoItemDto.screen) && this.type == communicationsShownInfoItemDto.type;
    }

    public final String getDefaultsGroup() {
        return this.defaultsGroup;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getScreen() {
        return this.screen;
    }

    public final CommunicationTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.defaultsGroup;
        return this.type.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.eventId), 31, this.screen);
    }

    public String toString() {
        String str = this.defaultsGroup;
        String str2 = this.eventId;
        String str3 = this.screen;
        CommunicationTypeDto communicationTypeDto = this.type;
        StringBuilder v = b64.v("CommunicationsShownInfoItemDto(defaultsGroup=", str, ", eventId=", str2, ", screen=");
        v.append(str3);
        v.append(", type=");
        v.append(communicationTypeDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
