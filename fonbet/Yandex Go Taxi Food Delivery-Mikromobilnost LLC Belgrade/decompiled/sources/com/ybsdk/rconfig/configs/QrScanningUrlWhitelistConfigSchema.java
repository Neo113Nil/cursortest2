package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrScanningUrlWhitelistConfigSchema;", "", "", "", "allowedToOpenUrlRegexes", "allowedToOpenWithoutLandingUrlRegexes", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/ybsdk/rconfig/configs/QrScanningUrlWhitelistConfigSchema;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAllowedToOpenUrlRegexes", "getAllowedToOpenWithoutLandingUrlRegexes", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrScanningUrlWhitelistConfigSchema {

    @Json(name = "allowed_to_open_url_regexes")
    private final List<String> allowedToOpenUrlRegexes;

    @Json(name = "allowed_to_open_without_landing_url_regexes")
    private final List<String> allowedToOpenWithoutLandingUrlRegexes;

    public QrScanningUrlWhitelistConfigSchema(List<String> list, List<String> list2) {
        this.allowedToOpenUrlRegexes = list;
        this.allowedToOpenWithoutLandingUrlRegexes = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QrScanningUrlWhitelistConfigSchema copy$default(QrScanningUrlWhitelistConfigSchema qrScanningUrlWhitelistConfigSchema, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qrScanningUrlWhitelistConfigSchema.allowedToOpenUrlRegexes;
        }
        if ((i & 2) != 0) {
            list2 = qrScanningUrlWhitelistConfigSchema.allowedToOpenWithoutLandingUrlRegexes;
        }
        return qrScanningUrlWhitelistConfigSchema.copy(list, list2);
    }

    public final List<String> component1() {
        return this.allowedToOpenUrlRegexes;
    }

    public final List<String> component2() {
        return this.allowedToOpenWithoutLandingUrlRegexes;
    }

    public final QrScanningUrlWhitelistConfigSchema copy(List<String> allowedToOpenUrlRegexes, List<String> allowedToOpenWithoutLandingUrlRegexes) {
        return new QrScanningUrlWhitelistConfigSchema(allowedToOpenUrlRegexes, allowedToOpenWithoutLandingUrlRegexes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrScanningUrlWhitelistConfigSchema)) {
            return false;
        }
        QrScanningUrlWhitelistConfigSchema qrScanningUrlWhitelistConfigSchema = (QrScanningUrlWhitelistConfigSchema) other;
        return jl40.l(this.allowedToOpenUrlRegexes, qrScanningUrlWhitelistConfigSchema.allowedToOpenUrlRegexes) && jl40.l(this.allowedToOpenWithoutLandingUrlRegexes, qrScanningUrlWhitelistConfigSchema.allowedToOpenWithoutLandingUrlRegexes);
    }

    public final List<String> getAllowedToOpenUrlRegexes() {
        return this.allowedToOpenUrlRegexes;
    }

    public final List<String> getAllowedToOpenWithoutLandingUrlRegexes() {
        return this.allowedToOpenWithoutLandingUrlRegexes;
    }

    public int hashCode() {
        return this.allowedToOpenWithoutLandingUrlRegexes.hashCode() + (this.allowedToOpenUrlRegexes.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("QrScanningUrlWhitelistConfigSchema(allowedToOpenUrlRegexes=", this.allowedToOpenUrlRegexes, ", allowedToOpenWithoutLandingUrlRegexes=", this.allowedToOpenWithoutLandingUrlRegexes, Extension.C_BRAKE);
    }
}
