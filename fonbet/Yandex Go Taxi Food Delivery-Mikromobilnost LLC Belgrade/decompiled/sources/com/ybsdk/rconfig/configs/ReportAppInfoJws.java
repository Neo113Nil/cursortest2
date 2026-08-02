package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.X509CertImpl;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/ReportAppInfoJws;", "", "", "payload", "protected", X509CertImpl.SIGNATURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/ReportAppInfoJws;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPayload", "getProtected", "getSignature", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReportAppInfoJws {

    @Json(name = "payload")
    private final String payload;

    @Json(name = "protected")
    private final String protected;

    @Json(name = X509CertImpl.SIGNATURE)
    private final String signature;

    public ReportAppInfoJws(String str, String str2, String str3) {
        this.payload = str;
        this.protected = str2;
        this.signature = str3;
    }

    public static /* synthetic */ ReportAppInfoJws copy$default(ReportAppInfoJws reportAppInfoJws, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportAppInfoJws.payload;
        }
        if ((i & 2) != 0) {
            str2 = reportAppInfoJws.protected;
        }
        if ((i & 4) != 0) {
            str3 = reportAppInfoJws.signature;
        }
        return reportAppInfoJws.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProtected() {
        return this.protected;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final ReportAppInfoJws copy(String payload, String r2, String signature) {
        return new ReportAppInfoJws(payload, r2, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportAppInfoJws)) {
            return false;
        }
        ReportAppInfoJws reportAppInfoJws = (ReportAppInfoJws) other;
        return jl40.l(this.payload, reportAppInfoJws.payload) && jl40.l(this.protected, reportAppInfoJws.protected) && jl40.l(this.signature, reportAppInfoJws.signature);
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getProtected() {
        return this.protected;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode() + unr0.b(this.payload.hashCode() * 31, 31, this.protected);
    }

    public String toString() {
        String str = this.payload;
        String str2 = this.protected;
        return oyr.t(b64.v("ReportAppInfoJws(payload=", str, ", protected=", str2, ", signature="), this.signature, Extension.C_BRAKE);
    }
}
