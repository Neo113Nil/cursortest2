package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationSubmitCodeResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/ApplicationSubmitCodeResponse$Status;", "hint", "", "supportUrl", "<init>", "(Lcom/ybsdk/network/dto/ApplicationSubmitCodeResponse$Status;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/network/dto/ApplicationSubmitCodeResponse$Status;", "getHint", "()Ljava/lang/String;", "getSupportUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApplicationSubmitCodeResponse {
    private final String hint;
    private final Status status;
    private final String supportUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationSubmitCodeResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "FAILED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status OK = new Status("OK", 0);
        public static final Status FAILED = new Status("FAILED", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{OK, FAILED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
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

    public ApplicationSubmitCodeResponse(@Json(name = "status") Status status, @Json(name = "hint") String str, @Json(name = "support_url") String str2) {
        this.status = status;
        this.hint = str;
        this.supportUrl = str2;
    }

    public static /* synthetic */ ApplicationSubmitCodeResponse copy$default(ApplicationSubmitCodeResponse applicationSubmitCodeResponse, Status status, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            status = applicationSubmitCodeResponse.status;
        }
        if ((i & 2) != 0) {
            str = applicationSubmitCodeResponse.hint;
        }
        if ((i & 4) != 0) {
            str2 = applicationSubmitCodeResponse.supportUrl;
        }
        return applicationSubmitCodeResponse.copy(status, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final ApplicationSubmitCodeResponse copy(@Json(name = "status") Status status, @Json(name = "hint") String hint, @Json(name = "support_url") String supportUrl) {
        return new ApplicationSubmitCodeResponse(status, hint, supportUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationSubmitCodeResponse)) {
            return false;
        }
        ApplicationSubmitCodeResponse applicationSubmitCodeResponse = (ApplicationSubmitCodeResponse) other;
        return this.status == applicationSubmitCodeResponse.status && jl40.l(this.hint, applicationSubmitCodeResponse.hint) && jl40.l(this.supportUrl, applicationSubmitCodeResponse.supportUrl);
    }

    public final String getHint() {
        return this.hint;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.hint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.supportUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Status status = this.status;
        String str = this.hint;
        String str2 = this.supportUrl;
        StringBuilder sb = new StringBuilder("ApplicationSubmitCodeResponse(status=");
        sb.append(status);
        sb.append(", hint=");
        sb.append(str);
        sb.append(", supportUrl=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
