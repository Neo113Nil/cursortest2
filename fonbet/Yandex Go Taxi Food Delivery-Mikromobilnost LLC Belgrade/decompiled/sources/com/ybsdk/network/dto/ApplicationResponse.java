package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationResponse;", "", "applicationId", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;", "agreement", "form", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;Ljava/lang/String;Ljava/util/Map;)V", "getApplicationId", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;", "getAgreement", "getForm", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ApplicationStatus", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApplicationResponse {
    private final String agreement;
    private final String applicationId;
    private final Map<String, Object> form;
    private final ApplicationStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "PROCESSING", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ApplicationStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ApplicationStatus[] $VALUES;
        public static final ApplicationStatus CREATED = new ApplicationStatus("CREATED", 0);
        public static final ApplicationStatus PROCESSING = new ApplicationStatus("PROCESSING", 1);

        private static final /* synthetic */ ApplicationStatus[] $values() {
            return new ApplicationStatus[]{CREATED, PROCESSING};
        }

        static {
            ApplicationStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ApplicationStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ApplicationStatus valueOf(String str) {
            return (ApplicationStatus) Enum.valueOf(ApplicationStatus.class, str);
        }

        public static ApplicationStatus[] values() {
            return (ApplicationStatus[]) $VALUES.clone();
        }
    }

    public ApplicationResponse(@Json(name = "application_id") String str, @Json(name = "status") ApplicationStatus applicationStatus, @Json(name = "agreement") String str2, @Json(name = "form") Map<String, ? extends Object> map) {
        this.applicationId = str;
        this.status = applicationStatus;
        this.agreement = str2;
        this.form = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplicationResponse copy$default(ApplicationResponse applicationResponse, String str, ApplicationStatus applicationStatus, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationResponse.applicationId;
        }
        if ((i & 2) != 0) {
            applicationStatus = applicationResponse.status;
        }
        if ((i & 4) != 0) {
            str2 = applicationResponse.agreement;
        }
        if ((i & 8) != 0) {
            map = applicationResponse.form;
        }
        return applicationResponse.copy(str, applicationStatus, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApplicationStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreement() {
        return this.agreement;
    }

    public final Map<String, Object> component4() {
        return this.form;
    }

    public final ApplicationResponse copy(@Json(name = "application_id") String applicationId, @Json(name = "status") ApplicationStatus status, @Json(name = "agreement") String agreement, @Json(name = "form") Map<String, ? extends Object> form) {
        return new ApplicationResponse(applicationId, status, agreement, form);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationResponse)) {
            return false;
        }
        ApplicationResponse applicationResponse = (ApplicationResponse) other;
        return jl40.l(this.applicationId, applicationResponse.applicationId) && this.status == applicationResponse.status && jl40.l(this.agreement, applicationResponse.agreement) && jl40.l(this.form, applicationResponse.form);
    }

    public final String getAgreement() {
        return this.agreement;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final Map<String, Object> getForm() {
        return this.form;
    }

    public final ApplicationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int b = unr0.b((this.status.hashCode() + (this.applicationId.hashCode() * 31)) * 31, 31, this.agreement);
        Map<String, Object> map = this.form;
        return b + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "ApplicationResponse(applicationId=" + this.applicationId + ", status=" + this.status + ", agreement=" + this.agreement + ", form=" + this.form + Extension.C_BRAKE;
    }

    public /* synthetic */ ApplicationResponse(String str, ApplicationStatus applicationStatus, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, applicationStatus, (i & 4) != 0 ? "" : str2, map);
    }
}
