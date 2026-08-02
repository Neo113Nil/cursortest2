package com.ybsdk.network.dto.changephone;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse$ChangePhoneStatus;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "supportUrl", "<init>", "(Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse$ChangePhoneStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse$ChangePhoneStatus;", "getTitle", "()Ljava/lang/String;", "getDescription", "getSupportUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ChangePhoneStatus", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangePhoneApplicationStatusResponse {
    private final String description;
    private final ChangePhoneStatus status;
    private final String supportUrl;
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse$ChangePhoneStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "READY_FOR_CONFIRMATION", "SUCCESS", "FAILED", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ChangePhoneStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ChangePhoneStatus[] $VALUES;
        public static final ChangePhoneStatus PROCESSING = new ChangePhoneStatus("PROCESSING", 0);
        public static final ChangePhoneStatus READY_FOR_CONFIRMATION = new ChangePhoneStatus("READY_FOR_CONFIRMATION", 1);
        public static final ChangePhoneStatus SUCCESS = new ChangePhoneStatus("SUCCESS", 2);
        public static final ChangePhoneStatus FAILED = new ChangePhoneStatus("FAILED", 3);
        public static final ChangePhoneStatus UNKNOWN = new ChangePhoneStatus("UNKNOWN", 4);

        private static final /* synthetic */ ChangePhoneStatus[] $values() {
            return new ChangePhoneStatus[]{PROCESSING, READY_FOR_CONFIRMATION, SUCCESS, FAILED, UNKNOWN};
        }

        static {
            ChangePhoneStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ChangePhoneStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ChangePhoneStatus valueOf(String str) {
            return (ChangePhoneStatus) Enum.valueOf(ChangePhoneStatus.class, str);
        }

        public static ChangePhoneStatus[] values() {
            return (ChangePhoneStatus[]) $VALUES.clone();
        }
    }

    public ChangePhoneApplicationStatusResponse(@Json(name = "status") ChangePhoneStatus changePhoneStatus, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "support_url") String str3) {
        this.status = changePhoneStatus;
        this.title = str;
        this.description = str2;
        this.supportUrl = str3;
    }

    public static /* synthetic */ ChangePhoneApplicationStatusResponse copy$default(ChangePhoneApplicationStatusResponse changePhoneApplicationStatusResponse, ChangePhoneStatus changePhoneStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            changePhoneStatus = changePhoneApplicationStatusResponse.status;
        }
        if ((i & 2) != 0) {
            str = changePhoneApplicationStatusResponse.title;
        }
        if ((i & 4) != 0) {
            str2 = changePhoneApplicationStatusResponse.description;
        }
        if ((i & 8) != 0) {
            str3 = changePhoneApplicationStatusResponse.supportUrl;
        }
        return changePhoneApplicationStatusResponse.copy(changePhoneStatus, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final ChangePhoneStatus getStatus() {
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
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final ChangePhoneApplicationStatusResponse copy(@Json(name = "status") ChangePhoneStatus status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "support_url") String supportUrl) {
        return new ChangePhoneApplicationStatusResponse(status, title, description, supportUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePhoneApplicationStatusResponse)) {
            return false;
        }
        ChangePhoneApplicationStatusResponse changePhoneApplicationStatusResponse = (ChangePhoneApplicationStatusResponse) other;
        return this.status == changePhoneApplicationStatusResponse.status && jl40.l(this.title, changePhoneApplicationStatusResponse.title) && jl40.l(this.description, changePhoneApplicationStatusResponse.description) && jl40.l(this.supportUrl, changePhoneApplicationStatusResponse.supportUrl);
    }

    public final String getDescription() {
        return this.description;
    }

    public final ChangePhoneStatus getStatus() {
        return this.status;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        ChangePhoneStatus changePhoneStatus = this.status;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.supportUrl;
        StringBuilder sb = new StringBuilder("ChangePhoneApplicationStatusResponse(status=");
        sb.append(changePhoneStatus);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        return g8e.r(sb, str2, ", supportUrl=", str3, Extension.C_BRAKE);
    }
}
