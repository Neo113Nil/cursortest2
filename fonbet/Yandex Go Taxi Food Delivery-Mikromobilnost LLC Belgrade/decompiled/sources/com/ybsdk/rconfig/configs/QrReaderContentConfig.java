package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.qr.api.QrReaderContentCameraPermission;
import com.ybsdk.feature.qr.api.QrReaderContentInfo;
import com.ybsdk.feature.qr.api.QrReaderContentLogo;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/ybsdk/rconfig/configs/QrReaderContentConfig;", "", "Lcom/ybsdk/feature/qr/api/QrReaderContentLogo;", "logo", "Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;", "info", "Lcom/ybsdk/feature/qr/api/QrReaderContentCameraPermission;", "cameraPermission", "<init>", "(Lcom/ybsdk/feature/qr/api/QrReaderContentLogo;Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;Lcom/ybsdk/feature/qr/api/QrReaderContentCameraPermission;)V", "component1", "()Lcom/ybsdk/feature/qr/api/QrReaderContentLogo;", "component2", "()Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;", "component3", "()Lcom/ybsdk/feature/qr/api/QrReaderContentCameraPermission;", "copy", "(Lcom/ybsdk/feature/qr/api/QrReaderContentLogo;Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;Lcom/ybsdk/feature/qr/api/QrReaderContentCameraPermission;)Lcom/ybsdk/rconfig/configs/QrReaderContentConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/qr/api/QrReaderContentLogo;", "getLogo", "Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;", "getInfo", "Lcom/ybsdk/feature/qr/api/QrReaderContentCameraPermission;", "getCameraPermission", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrReaderContentConfig {

    @Json(name = "camera_permission")
    private final QrReaderContentCameraPermission cameraPermission;

    @Json(name = "info")
    private final QrReaderContentInfo info;

    @Json(name = "logo")
    private final QrReaderContentLogo logo;

    public QrReaderContentConfig(QrReaderContentLogo qrReaderContentLogo, QrReaderContentInfo qrReaderContentInfo, QrReaderContentCameraPermission qrReaderContentCameraPermission) {
        this.logo = qrReaderContentLogo;
        this.info = qrReaderContentInfo;
        this.cameraPermission = qrReaderContentCameraPermission;
    }

    public static /* synthetic */ QrReaderContentConfig copy$default(QrReaderContentConfig qrReaderContentConfig, QrReaderContentLogo qrReaderContentLogo, QrReaderContentInfo qrReaderContentInfo, QrReaderContentCameraPermission qrReaderContentCameraPermission, int i, Object obj) {
        if ((i & 1) != 0) {
            qrReaderContentLogo = qrReaderContentConfig.logo;
        }
        if ((i & 2) != 0) {
            qrReaderContentInfo = qrReaderContentConfig.info;
        }
        if ((i & 4) != 0) {
            qrReaderContentCameraPermission = qrReaderContentConfig.cameraPermission;
        }
        return qrReaderContentConfig.copy(qrReaderContentLogo, qrReaderContentInfo, qrReaderContentCameraPermission);
    }

    /* renamed from: component1, reason: from getter */
    public final QrReaderContentLogo getLogo() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final QrReaderContentInfo getInfo() {
        return this.info;
    }

    /* renamed from: component3, reason: from getter */
    public final QrReaderContentCameraPermission getCameraPermission() {
        return this.cameraPermission;
    }

    public final QrReaderContentConfig copy(QrReaderContentLogo logo, QrReaderContentInfo info, QrReaderContentCameraPermission cameraPermission) {
        return new QrReaderContentConfig(logo, info, cameraPermission);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderContentConfig)) {
            return false;
        }
        QrReaderContentConfig qrReaderContentConfig = (QrReaderContentConfig) other;
        return jl40.l(this.logo, qrReaderContentConfig.logo) && jl40.l(this.info, qrReaderContentConfig.info) && jl40.l(this.cameraPermission, qrReaderContentConfig.cameraPermission);
    }

    public final QrReaderContentCameraPermission getCameraPermission() {
        return this.cameraPermission;
    }

    public final QrReaderContentInfo getInfo() {
        return this.info;
    }

    public final QrReaderContentLogo getLogo() {
        return this.logo;
    }

    public int hashCode() {
        QrReaderContentLogo qrReaderContentLogo = this.logo;
        int hashCode = (qrReaderContentLogo == null ? 0 : qrReaderContentLogo.hashCode()) * 31;
        QrReaderContentInfo qrReaderContentInfo = this.info;
        int hashCode2 = (hashCode + (qrReaderContentInfo == null ? 0 : qrReaderContentInfo.hashCode())) * 31;
        QrReaderContentCameraPermission qrReaderContentCameraPermission = this.cameraPermission;
        return hashCode2 + (qrReaderContentCameraPermission != null ? qrReaderContentCameraPermission.hashCode() : 0);
    }

    public String toString() {
        return "QrReaderContentConfig(logo=" + this.logo + ", info=" + this.info + ", cameraPermission=" + this.cameraPermission + Extension.C_BRAKE;
    }
}
