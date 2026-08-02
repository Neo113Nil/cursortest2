package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/PdfErrorDetailsReportingFlag;", "", "", "isEnabled", "isUrlReportingEnabled", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/ybsdk/rconfig/configs/PdfErrorDetailsReportingFlag;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PdfErrorDetailsReportingFlag {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "is_url_reporting_enabled")
    private final boolean isUrlReportingEnabled;

    public PdfErrorDetailsReportingFlag(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isUrlReportingEnabled = z2;
    }

    public static /* synthetic */ PdfErrorDetailsReportingFlag copy$default(PdfErrorDetailsReportingFlag pdfErrorDetailsReportingFlag, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pdfErrorDetailsReportingFlag.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = pdfErrorDetailsReportingFlag.isUrlReportingEnabled;
        }
        return pdfErrorDetailsReportingFlag.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUrlReportingEnabled() {
        return this.isUrlReportingEnabled;
    }

    public final PdfErrorDetailsReportingFlag copy(boolean isEnabled, boolean isUrlReportingEnabled) {
        return new PdfErrorDetailsReportingFlag(isEnabled, isUrlReportingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfErrorDetailsReportingFlag)) {
            return false;
        }
        PdfErrorDetailsReportingFlag pdfErrorDetailsReportingFlag = (PdfErrorDetailsReportingFlag) other;
        return this.isEnabled == pdfErrorDetailsReportingFlag.isEnabled && this.isUrlReportingEnabled == pdfErrorDetailsReportingFlag.isUrlReportingEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isUrlReportingEnabled) + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isUrlReportingEnabled() {
        return this.isUrlReportingEnabled;
    }

    public String toString() {
        return ly3.o("PdfErrorDetailsReportingFlag(isEnabled=", ", isUrlReportingEnabled=", Extension.C_BRAKE, this.isEnabled, this.isUrlReportingEnabled);
    }
}
