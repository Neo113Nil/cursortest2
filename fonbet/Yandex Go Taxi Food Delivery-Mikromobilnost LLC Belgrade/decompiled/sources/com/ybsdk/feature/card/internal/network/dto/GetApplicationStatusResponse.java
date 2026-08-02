package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusResponse$Status;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "titleTimeout", "descriptionTimeout", "cardId", "supportUrl", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusResponse$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusResponse$Status;", "getTitle", "()Ljava/lang/String;", "getDescription", "getTitleTimeout", "getDescriptionTimeout", "getCardId", "getSupportUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetApplicationStatusResponse {
    private final String cardId;
    private final String description;
    private final String descriptionTimeout;
    private final Status status;
    private final String supportUrl;
    private final String title;
    private final String titleTimeout;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESS", "FAILED", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PROCESSING = new Status("PROCESSING", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);
        public static final Status FAILED = new Status("FAILED", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PROCESSING, SUCCESS, FAILED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public GetApplicationStatusResponse(@Json(name = "status") Status status, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "title_timeout") String str3, @Json(name = "description_timeout") String str4, @Json(name = "card_id") String str5, @Json(name = "support_url") String str6) {
        this.status = status;
        this.title = str;
        this.description = str2;
        this.titleTimeout = str3;
        this.descriptionTimeout = str4;
        this.cardId = str5;
        this.supportUrl = str6;
    }

    public static /* synthetic */ GetApplicationStatusResponse copy$default(GetApplicationStatusResponse getApplicationStatusResponse, Status status, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            status = getApplicationStatusResponse.status;
        }
        if ((i & 2) != 0) {
            str = getApplicationStatusResponse.title;
        }
        if ((i & 4) != 0) {
            str2 = getApplicationStatusResponse.description;
        }
        if ((i & 8) != 0) {
            str3 = getApplicationStatusResponse.titleTimeout;
        }
        if ((i & 16) != 0) {
            str4 = getApplicationStatusResponse.descriptionTimeout;
        }
        if ((i & 32) != 0) {
            str5 = getApplicationStatusResponse.cardId;
        }
        if ((i & 64) != 0) {
            str6 = getApplicationStatusResponse.supportUrl;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return getApplicationStatusResponse.copy(status, str, str10, str3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitleTimeout() {
        return this.titleTimeout;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescriptionTimeout() {
        return this.descriptionTimeout;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final GetApplicationStatusResponse copy(@Json(name = "status") Status status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "title_timeout") String titleTimeout, @Json(name = "description_timeout") String descriptionTimeout, @Json(name = "card_id") String cardId, @Json(name = "support_url") String supportUrl) {
        return new GetApplicationStatusResponse(status, title, description, titleTimeout, descriptionTimeout, cardId, supportUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetApplicationStatusResponse)) {
            return false;
        }
        GetApplicationStatusResponse getApplicationStatusResponse = (GetApplicationStatusResponse) other;
        return this.status == getApplicationStatusResponse.status && jl40.l(this.title, getApplicationStatusResponse.title) && jl40.l(this.description, getApplicationStatusResponse.description) && jl40.l(this.titleTimeout, getApplicationStatusResponse.titleTimeout) && jl40.l(this.descriptionTimeout, getApplicationStatusResponse.descriptionTimeout) && jl40.l(this.cardId, getApplicationStatusResponse.cardId) && jl40.l(this.supportUrl, getApplicationStatusResponse.supportUrl);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionTimeout() {
        return this.descriptionTimeout;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleTimeout() {
        return this.titleTimeout;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.status.hashCode() * 31, 31, this.title), 31, this.description);
        String str = this.titleTimeout;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.descriptionTimeout;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.supportUrl;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        Status status = this.status;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.titleTimeout;
        String str4 = this.descriptionTimeout;
        String str5 = this.cardId;
        String str6 = this.supportUrl;
        StringBuilder sb = new StringBuilder("GetApplicationStatusResponse(status=");
        sb.append(status);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        g8e.D(sb, str2, ", titleTimeout=", str3, ", descriptionTimeout=");
        g8e.D(sb, str4, ", cardId=", str5, ", supportUrl=");
        return oyr.t(sb, str6, Extension.C_BRAKE);
    }
}
