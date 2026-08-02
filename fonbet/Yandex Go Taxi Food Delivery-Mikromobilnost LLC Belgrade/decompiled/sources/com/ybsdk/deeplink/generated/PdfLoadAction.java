package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010\u0018R \u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/ybsdk/deeplink/generated/PdfLoadAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "type", "", "isSharingEnabled", "agreementId", "fileName", "reportType", "reportVersion", "operationId", "operationTimestamp", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/PdfLoadAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Z", "getAgreementId", "getFileName", "getReportType", "getReportVersion", "getOperationId", "getOperationTimestamp", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PdfLoadAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<PdfLoadAction> CREATOR = new Creator();
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String fileName;
    private final boolean isSharingEnabled;
    private final String operationId;
    private final String operationTimestamp;
    private final String reportType;
    private final String reportVersion;
    private final String type;

    public PdfLoadAction(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = str;
        this.isSharingEnabled = z;
        this.agreementId = str2;
        this.fileName = str3;
        this.reportType = str4;
        this.reportVersion = str5;
        this.operationId = str6;
        this.operationTimestamp = str7;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/pdf_load", "type", str);
        j.appendQueryParameter("is_sharing_enabled", String.valueOf(z));
        if (str2 != null) {
            j.appendQueryParameter("agreement_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("file_name", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("report_type", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("report_version", str5);
        }
        if (str6 != null) {
            j.appendQueryParameter("operation_id", str6);
        }
        if (str7 != null) {
            j.appendQueryParameter("operation_timestamp", str7);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ PdfLoadAction copy$default(PdfLoadAction pdfLoadAction, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfLoadAction.type;
        }
        if ((i & 2) != 0) {
            z = pdfLoadAction.isSharingEnabled;
        }
        if ((i & 4) != 0) {
            str2 = pdfLoadAction.agreementId;
        }
        if ((i & 8) != 0) {
            str3 = pdfLoadAction.fileName;
        }
        if ((i & 16) != 0) {
            str4 = pdfLoadAction.reportType;
        }
        if ((i & 32) != 0) {
            str5 = pdfLoadAction.reportVersion;
        }
        if ((i & 64) != 0) {
            str6 = pdfLoadAction.operationId;
        }
        if ((i & 128) != 0) {
            str7 = pdfLoadAction.operationTimestamp;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return pdfLoadAction.copy(str, z, str2, str3, str10, str11, str8, str9);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSharingEnabled() {
        return this.isSharingEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReportType() {
        return this.reportType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReportVersion() {
        return this.reportVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOperationTimestamp() {
        return this.operationTimestamp;
    }

    public final PdfLoadAction copy(String type, boolean isSharingEnabled, String agreementId, String fileName, String reportType, String reportVersion, String operationId, String operationTimestamp) {
        return new PdfLoadAction(type, isSharingEnabled, agreementId, fileName, reportType, reportVersion, operationId, operationTimestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfLoadAction)) {
            return false;
        }
        PdfLoadAction pdfLoadAction = (PdfLoadAction) other;
        return jl40.l(this.type, pdfLoadAction.type) && this.isSharingEnabled == pdfLoadAction.isSharingEnabled && jl40.l(this.agreementId, pdfLoadAction.agreementId) && jl40.l(this.fileName, pdfLoadAction.fileName) && jl40.l(this.reportType, pdfLoadAction.reportType) && jl40.l(this.reportVersion, pdfLoadAction.reportVersion) && jl40.l(this.operationId, pdfLoadAction.operationId) && jl40.l(this.operationTimestamp, pdfLoadAction.operationTimestamp);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final String getOperationTimestamp() {
        return this.operationTimestamp;
    }

    public final String getReportType() {
        return this.reportType;
    }

    public final String getReportVersion() {
        return this.reportVersion;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int e = unr0.e(this.type.hashCode() * 31, 31, this.isSharingEnabled);
        String str = this.agreementId;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reportType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reportVersion;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.operationId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.operationTimestamp;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isSharingEnabled() {
        return this.isSharingEnabled;
    }

    public String toString() {
        String str = this.type;
        boolean z = this.isSharingEnabled;
        String str2 = this.agreementId;
        String str3 = this.fileName;
        String str4 = this.reportType;
        String str5 = this.reportVersion;
        String str6 = this.operationId;
        String str7 = this.operationTimestamp;
        StringBuilder l = oo31.l("PdfLoadAction(type=", str, ", isSharingEnabled=", ", agreementId=", z);
        g8e.D(l, str2, ", fileName=", str3, ", reportType=");
        g8e.D(l, str4, ", reportVersion=", str5, ", operationId=");
        return g8e.r(l, str6, ", operationTimestamp=", str7, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeInt(this.isSharingEnabled ? 1 : 0);
        dest.writeString(this.agreementId);
        dest.writeString(this.fileName);
        dest.writeString(this.reportType);
        dest.writeString(this.reportVersion);
        dest.writeString(this.operationId);
        dest.writeString(this.operationTimestamp);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PdfLoadAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PdfLoadAction createFromParcel(Parcel parcel) {
            return new PdfLoadAction(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PdfLoadAction[] newArray(int i) {
            return new PdfLoadAction[i];
        }
    }

    public /* synthetic */ PdfLoadAction(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }
}
