package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jd\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b'\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b(\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lcom/ybsdk/rconfig/configs/KycOnlinePhotoConfig;", "", "", "uploadSuccessDeeplink", "", "uploadTimeoutThresholdMs", "uploadTakesTooLongThresholdMs", "photoTargetWidth", "photoTargetHeight", "photoTargetCompressionQuality", "geoRequestStatus", "", "previewInFrameEnabled", "<init>", "(Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/rconfig/configs/KycOnlinePhotoConfig;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadSuccessDeeplink", CA20Status.STATUS_USER_I, "getUploadTimeoutThresholdMs", "getUploadTakesTooLongThresholdMs", "getPhotoTargetWidth", "getPhotoTargetHeight", "getPhotoTargetCompressionQuality", "getGeoRequestStatus", "Ljava/lang/Boolean;", "getPreviewInFrameEnabled", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KycOnlinePhotoConfig {

    @Json(name = "geo_request_status")
    private final String geoRequestStatus;

    @Json(name = "photo_target_compression_quality")
    private final int photoTargetCompressionQuality;

    @Json(name = "photo_target_height")
    private final int photoTargetHeight;

    @Json(name = "photo_target_width")
    private final int photoTargetWidth;

    @Json(name = "preview_in_frame_enabled")
    private final Boolean previewInFrameEnabled;

    @Json(name = "upload_success_deeplink")
    private final String uploadSuccessDeeplink;

    @Json(name = "upload_takes_too_long_threshold_ms")
    private final int uploadTakesTooLongThresholdMs;

    @Json(name = "upload_timeout_threshold_ms")
    private final int uploadTimeoutThresholdMs;

    public KycOnlinePhotoConfig(String str, int i, int i2, int i3, int i4, int i5, String str2, Boolean bool) {
        this.uploadSuccessDeeplink = str;
        this.uploadTimeoutThresholdMs = i;
        this.uploadTakesTooLongThresholdMs = i2;
        this.photoTargetWidth = i3;
        this.photoTargetHeight = i4;
        this.photoTargetCompressionQuality = i5;
        this.geoRequestStatus = str2;
        this.previewInFrameEnabled = bool;
    }

    public static /* synthetic */ KycOnlinePhotoConfig copy$default(KycOnlinePhotoConfig kycOnlinePhotoConfig, String str, int i, int i2, int i3, int i4, int i5, String str2, Boolean bool, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = kycOnlinePhotoConfig.uploadSuccessDeeplink;
        }
        if ((i6 & 2) != 0) {
            i = kycOnlinePhotoConfig.uploadTimeoutThresholdMs;
        }
        if ((i6 & 4) != 0) {
            i2 = kycOnlinePhotoConfig.uploadTakesTooLongThresholdMs;
        }
        if ((i6 & 8) != 0) {
            i3 = kycOnlinePhotoConfig.photoTargetWidth;
        }
        if ((i6 & 16) != 0) {
            i4 = kycOnlinePhotoConfig.photoTargetHeight;
        }
        if ((i6 & 32) != 0) {
            i5 = kycOnlinePhotoConfig.photoTargetCompressionQuality;
        }
        if ((i6 & 64) != 0) {
            str2 = kycOnlinePhotoConfig.geoRequestStatus;
        }
        if ((i6 & 128) != 0) {
            bool = kycOnlinePhotoConfig.previewInFrameEnabled;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        int i7 = i4;
        int i8 = i5;
        return kycOnlinePhotoConfig.copy(str, i, i2, i3, i7, i8, str3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUploadSuccessDeeplink() {
        return this.uploadSuccessDeeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUploadTimeoutThresholdMs() {
        return this.uploadTimeoutThresholdMs;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUploadTakesTooLongThresholdMs() {
        return this.uploadTakesTooLongThresholdMs;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPhotoTargetWidth() {
        return this.photoTargetWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPhotoTargetHeight() {
        return this.photoTargetHeight;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPhotoTargetCompressionQuality() {
        return this.photoTargetCompressionQuality;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGeoRequestStatus() {
        return this.geoRequestStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getPreviewInFrameEnabled() {
        return this.previewInFrameEnabled;
    }

    public final KycOnlinePhotoConfig copy(String uploadSuccessDeeplink, int uploadTimeoutThresholdMs, int uploadTakesTooLongThresholdMs, int photoTargetWidth, int photoTargetHeight, int photoTargetCompressionQuality, String geoRequestStatus, Boolean previewInFrameEnabled) {
        return new KycOnlinePhotoConfig(uploadSuccessDeeplink, uploadTimeoutThresholdMs, uploadTakesTooLongThresholdMs, photoTargetWidth, photoTargetHeight, photoTargetCompressionQuality, geoRequestStatus, previewInFrameEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycOnlinePhotoConfig)) {
            return false;
        }
        KycOnlinePhotoConfig kycOnlinePhotoConfig = (KycOnlinePhotoConfig) other;
        return jl40.l(this.uploadSuccessDeeplink, kycOnlinePhotoConfig.uploadSuccessDeeplink) && this.uploadTimeoutThresholdMs == kycOnlinePhotoConfig.uploadTimeoutThresholdMs && this.uploadTakesTooLongThresholdMs == kycOnlinePhotoConfig.uploadTakesTooLongThresholdMs && this.photoTargetWidth == kycOnlinePhotoConfig.photoTargetWidth && this.photoTargetHeight == kycOnlinePhotoConfig.photoTargetHeight && this.photoTargetCompressionQuality == kycOnlinePhotoConfig.photoTargetCompressionQuality && jl40.l(this.geoRequestStatus, kycOnlinePhotoConfig.geoRequestStatus) && jl40.l(this.previewInFrameEnabled, kycOnlinePhotoConfig.previewInFrameEnabled);
    }

    public final String getGeoRequestStatus() {
        return this.geoRequestStatus;
    }

    public final int getPhotoTargetCompressionQuality() {
        return this.photoTargetCompressionQuality;
    }

    public final int getPhotoTargetHeight() {
        return this.photoTargetHeight;
    }

    public final int getPhotoTargetWidth() {
        return this.photoTargetWidth;
    }

    public final Boolean getPreviewInFrameEnabled() {
        return this.previewInFrameEnabled;
    }

    public final String getUploadSuccessDeeplink() {
        return this.uploadSuccessDeeplink;
    }

    public final int getUploadTakesTooLongThresholdMs() {
        return this.uploadTakesTooLongThresholdMs;
    }

    public final int getUploadTimeoutThresholdMs() {
        return this.uploadTimeoutThresholdMs;
    }

    public int hashCode() {
        int b = oyr.b(this.photoTargetCompressionQuality, oyr.b(this.photoTargetHeight, oyr.b(this.photoTargetWidth, oyr.b(this.uploadTakesTooLongThresholdMs, oyr.b(this.uploadTimeoutThresholdMs, this.uploadSuccessDeeplink.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.geoRequestStatus;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.previewInFrameEnabled;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.uploadSuccessDeeplink;
        int i = this.uploadTimeoutThresholdMs;
        int i2 = this.uploadTakesTooLongThresholdMs;
        int i3 = this.photoTargetWidth;
        int i4 = this.photoTargetHeight;
        int i5 = this.photoTargetCompressionQuality;
        String str2 = this.geoRequestStatus;
        Boolean bool = this.previewInFrameEnabled;
        StringBuilder u = b64.u(i, "KycOnlinePhotoConfig(uploadSuccessDeeplink=", str, ", uploadTimeoutThresholdMs=", ", uploadTakesTooLongThresholdMs=");
        vfc.u(i2, i3, ", photoTargetWidth=", ", photoTargetHeight=", u);
        vfc.u(i4, i5, ", photoTargetCompressionQuality=", ", geoRequestStatus=", u);
        u.append(str2);
        u.append(", previewInFrameEnabled=");
        u.append(bool);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
