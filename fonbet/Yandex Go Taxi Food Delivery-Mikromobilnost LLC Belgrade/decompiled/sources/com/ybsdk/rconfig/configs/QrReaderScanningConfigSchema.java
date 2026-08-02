package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.fcg0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrReaderScanningConfigSchema;", "", "", "isHuaweiAreaRestrictionEnabled", "", "minIntersectionPercent", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Lfcg0;", "toEntity", "()Lfcg0;", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/ybsdk/rconfig/configs/QrReaderScanningConfigSchema;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getMinIntersectionPercent", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrReaderScanningConfigSchema {

    @Json(name = "is_huawei_area_restriction_enabled")
    private final Boolean isHuaweiAreaRestrictionEnabled;

    @Json(name = "min_intersection_percent")
    private final Integer minIntersectionPercent;

    public QrReaderScanningConfigSchema(Boolean bool, Integer num) {
        this.isHuaweiAreaRestrictionEnabled = bool;
        this.minIntersectionPercent = num;
    }

    public static /* synthetic */ QrReaderScanningConfigSchema copy$default(QrReaderScanningConfigSchema qrReaderScanningConfigSchema, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = qrReaderScanningConfigSchema.isHuaweiAreaRestrictionEnabled;
        }
        if ((i & 2) != 0) {
            num = qrReaderScanningConfigSchema.minIntersectionPercent;
        }
        return qrReaderScanningConfigSchema.copy(bool, num);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsHuaweiAreaRestrictionEnabled() {
        return this.isHuaweiAreaRestrictionEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMinIntersectionPercent() {
        return this.minIntersectionPercent;
    }

    public final QrReaderScanningConfigSchema copy(Boolean isHuaweiAreaRestrictionEnabled, Integer minIntersectionPercent) {
        return new QrReaderScanningConfigSchema(isHuaweiAreaRestrictionEnabled, minIntersectionPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderScanningConfigSchema)) {
            return false;
        }
        QrReaderScanningConfigSchema qrReaderScanningConfigSchema = (QrReaderScanningConfigSchema) other;
        return jl40.l(this.isHuaweiAreaRestrictionEnabled, qrReaderScanningConfigSchema.isHuaweiAreaRestrictionEnabled) && jl40.l(this.minIntersectionPercent, qrReaderScanningConfigSchema.minIntersectionPercent);
    }

    public final Integer getMinIntersectionPercent() {
        return this.minIntersectionPercent;
    }

    public int hashCode() {
        Boolean bool = this.isHuaweiAreaRestrictionEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.minIntersectionPercent;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final Boolean isHuaweiAreaRestrictionEnabled() {
        return this.isHuaweiAreaRestrictionEnabled;
    }

    public final fcg0 toEntity() {
        Integer num = this.minIntersectionPercent;
        return new fcg0(num != null ? num.intValue() : 80);
    }

    public String toString() {
        return "QrReaderScanningConfigSchema(isHuaweiAreaRestrictionEnabled=" + this.isHuaweiAreaRestrictionEnabled + ", minIntersectionPercent=" + this.minIntersectionPercent + Extension.C_BRAKE;
    }
}
