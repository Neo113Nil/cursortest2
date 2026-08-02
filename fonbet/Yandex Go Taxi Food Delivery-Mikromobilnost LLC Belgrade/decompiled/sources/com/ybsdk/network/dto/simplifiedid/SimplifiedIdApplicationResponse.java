package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002'(BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\b\u0001\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0012\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006)"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse;", "", "applicationId", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$ApplicationStatus;", "secondDocuments", "", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$SecondDocument;", "agreement", "form", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;", "widgets", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$ApplicationStatus;Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;Ljava/util/List;)V", "getApplicationId", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$ApplicationStatus;", "getSecondDocuments", "()Ljava/util/List;", "getAgreement", "getForm", "()Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;", "getWidgets", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ApplicationStatus", "SecondDocument", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimplifiedIdApplicationResponse {
    private final String agreement;
    private final String applicationId;
    private final SimplifiedIdApplicationForm form;
    private final List<SecondDocument> secondDocuments;
    private final ApplicationStatus status;
    private final List<SimplifiedIdWidget> widgets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$ApplicationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "PROCESSING", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            $ENTRIES = a.a($values);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$SecondDocument;", "", "<init>", "(Ljava/lang/String;I)V", "INN", "SNILS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SecondDocument {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SecondDocument[] $VALUES;
        public static final SecondDocument INN = new SecondDocument("INN", 0);
        public static final SecondDocument SNILS = new SecondDocument("SNILS", 1);

        private static final /* synthetic */ SecondDocument[] $values() {
            return new SecondDocument[]{INN, SNILS};
        }

        static {
            SecondDocument[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private SecondDocument(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SecondDocument valueOf(String str) {
            return (SecondDocument) Enum.valueOf(SecondDocument.class, str);
        }

        public static SecondDocument[] values() {
            return (SecondDocument[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimplifiedIdApplicationResponse(@Json(name = "application_id") String str, @Json(name = "status") ApplicationStatus applicationStatus, @Json(name = "second_documents") List<? extends SecondDocument> list, @Json(name = "agreement") String str2, @Json(name = "form") SimplifiedIdApplicationForm simplifiedIdApplicationForm, @Json(name = "widgets") List<SimplifiedIdWidget> list2) {
        this.applicationId = str;
        this.status = applicationStatus;
        this.secondDocuments = list;
        this.agreement = str2;
        this.form = simplifiedIdApplicationForm;
        this.widgets = list2;
    }

    public static /* synthetic */ SimplifiedIdApplicationResponse copy$default(SimplifiedIdApplicationResponse simplifiedIdApplicationResponse, String str, ApplicationStatus applicationStatus, List list, String str2, SimplifiedIdApplicationForm simplifiedIdApplicationForm, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplifiedIdApplicationResponse.applicationId;
        }
        if ((i & 2) != 0) {
            applicationStatus = simplifiedIdApplicationResponse.status;
        }
        if ((i & 4) != 0) {
            list = simplifiedIdApplicationResponse.secondDocuments;
        }
        if ((i & 8) != 0) {
            str2 = simplifiedIdApplicationResponse.agreement;
        }
        if ((i & 16) != 0) {
            simplifiedIdApplicationForm = simplifiedIdApplicationResponse.form;
        }
        if ((i & 32) != 0) {
            list2 = simplifiedIdApplicationResponse.widgets;
        }
        SimplifiedIdApplicationForm simplifiedIdApplicationForm2 = simplifiedIdApplicationForm;
        List list3 = list2;
        return simplifiedIdApplicationResponse.copy(str, applicationStatus, list, str2, simplifiedIdApplicationForm2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApplicationStatus getStatus() {
        return this.status;
    }

    public final List<SecondDocument> component3() {
        return this.secondDocuments;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreement() {
        return this.agreement;
    }

    /* renamed from: component5, reason: from getter */
    public final SimplifiedIdApplicationForm getForm() {
        return this.form;
    }

    public final List<SimplifiedIdWidget> component6() {
        return this.widgets;
    }

    public final SimplifiedIdApplicationResponse copy(@Json(name = "application_id") String applicationId, @Json(name = "status") ApplicationStatus status, @Json(name = "second_documents") List<? extends SecondDocument> secondDocuments, @Json(name = "agreement") String agreement, @Json(name = "form") SimplifiedIdApplicationForm form, @Json(name = "widgets") List<SimplifiedIdWidget> widgets) {
        return new SimplifiedIdApplicationResponse(applicationId, status, secondDocuments, agreement, form, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplifiedIdApplicationResponse)) {
            return false;
        }
        SimplifiedIdApplicationResponse simplifiedIdApplicationResponse = (SimplifiedIdApplicationResponse) other;
        return jl40.l(this.applicationId, simplifiedIdApplicationResponse.applicationId) && this.status == simplifiedIdApplicationResponse.status && jl40.l(this.secondDocuments, simplifiedIdApplicationResponse.secondDocuments) && jl40.l(this.agreement, simplifiedIdApplicationResponse.agreement) && jl40.l(this.form, simplifiedIdApplicationResponse.form) && jl40.l(this.widgets, simplifiedIdApplicationResponse.widgets);
    }

    public final String getAgreement() {
        return this.agreement;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final SimplifiedIdApplicationForm getForm() {
        return this.form;
    }

    public final List<SecondDocument> getSecondDocuments() {
        return this.secondDocuments;
    }

    public final ApplicationStatus getStatus() {
        return this.status;
    }

    public final List<SimplifiedIdWidget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (this.applicationId.hashCode() * 31)) * 31;
        List<SecondDocument> list = this.secondDocuments;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.agreement;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SimplifiedIdApplicationForm simplifiedIdApplicationForm = this.form;
        int hashCode4 = (hashCode3 + (simplifiedIdApplicationForm == null ? 0 : simplifiedIdApplicationForm.hashCode())) * 31;
        List<SimplifiedIdWidget> list2 = this.widgets;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.applicationId;
        ApplicationStatus applicationStatus = this.status;
        List<SecondDocument> list = this.secondDocuments;
        String str2 = this.agreement;
        SimplifiedIdApplicationForm simplifiedIdApplicationForm = this.form;
        List<SimplifiedIdWidget> list2 = this.widgets;
        StringBuilder sb = new StringBuilder("SimplifiedIdApplicationResponse(applicationId=");
        sb.append(str);
        sb.append(", status=");
        sb.append(applicationStatus);
        sb.append(", secondDocuments=");
        oyr.D(", agreement=", str2, ", form=", sb, list);
        sb.append(simplifiedIdApplicationForm);
        sb.append(", widgets=");
        sb.append(list2);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
