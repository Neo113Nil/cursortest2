package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/ReportAppInfoJwsConfiguration;", "", "Lcom/ybsdk/rconfig/configs/ReportAppInfoJws;", "jws", "<init>", "(Lcom/ybsdk/rconfig/configs/ReportAppInfoJws;)V", "component1", "()Lcom/ybsdk/rconfig/configs/ReportAppInfoJws;", "copy", "(Lcom/ybsdk/rconfig/configs/ReportAppInfoJws;)Lcom/ybsdk/rconfig/configs/ReportAppInfoJwsConfiguration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/ReportAppInfoJws;", "getJws", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReportAppInfoJwsConfiguration {

    @Json(name = "jws")
    private final ReportAppInfoJws jws;

    public ReportAppInfoJwsConfiguration(ReportAppInfoJws reportAppInfoJws) {
        this.jws = reportAppInfoJws;
    }

    public static /* synthetic */ ReportAppInfoJwsConfiguration copy$default(ReportAppInfoJwsConfiguration reportAppInfoJwsConfiguration, ReportAppInfoJws reportAppInfoJws, int i, Object obj) {
        if ((i & 1) != 0) {
            reportAppInfoJws = reportAppInfoJwsConfiguration.jws;
        }
        return reportAppInfoJwsConfiguration.copy(reportAppInfoJws);
    }

    /* renamed from: component1, reason: from getter */
    public final ReportAppInfoJws getJws() {
        return this.jws;
    }

    public final ReportAppInfoJwsConfiguration copy(ReportAppInfoJws jws) {
        return new ReportAppInfoJwsConfiguration(jws);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReportAppInfoJwsConfiguration) && jl40.l(this.jws, ((ReportAppInfoJwsConfiguration) other).jws);
    }

    public final ReportAppInfoJws getJws() {
        return this.jws;
    }

    public int hashCode() {
        ReportAppInfoJws reportAppInfoJws = this.jws;
        if (reportAppInfoJws == null) {
            return 0;
        }
        return reportAppInfoJws.hashCode();
    }

    public String toString() {
        return "ReportAppInfoJwsConfiguration(jws=" + this.jws + Extension.C_BRAKE;
    }
}
