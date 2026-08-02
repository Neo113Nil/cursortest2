package com.ybsdk.feature.qr.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;", "", "image", "Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "action", "", "accessibilityLabel", "analyticsButtonClick", "<init>", "(Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "getAction", "()Ljava/lang/String;", "getAccessibilityLabel", "getAnalyticsButtonClick", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class QrReaderContentInfo {

    @Json(name = "accessibility_label")
    private final String accessibilityLabel;

    @Json(name = "action")
    private final String action;

    @Json(name = "analytics_button_click")
    private final String analyticsButtonClick;

    @Json(name = "image")
    private final QrReaderLogoImage image;

    public QrReaderContentInfo(QrReaderLogoImage qrReaderLogoImage, String str, String str2, String str3) {
        this.image = qrReaderLogoImage;
        this.action = str;
        this.accessibilityLabel = str2;
        this.analyticsButtonClick = str3;
    }

    public static /* synthetic */ QrReaderContentInfo copy$default(QrReaderContentInfo qrReaderContentInfo, QrReaderLogoImage qrReaderLogoImage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            qrReaderLogoImage = qrReaderContentInfo.image;
        }
        if ((i & 2) != 0) {
            str = qrReaderContentInfo.action;
        }
        if ((i & 4) != 0) {
            str2 = qrReaderContentInfo.accessibilityLabel;
        }
        if ((i & 8) != 0) {
            str3 = qrReaderContentInfo.analyticsButtonClick;
        }
        return qrReaderContentInfo.copy(qrReaderLogoImage, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final QrReaderLogoImage getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAnalyticsButtonClick() {
        return this.analyticsButtonClick;
    }

    public final QrReaderContentInfo copy(QrReaderLogoImage image, String action, String accessibilityLabel, String analyticsButtonClick) {
        return new QrReaderContentInfo(image, action, accessibilityLabel, analyticsButtonClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderContentInfo)) {
            return false;
        }
        QrReaderContentInfo qrReaderContentInfo = (QrReaderContentInfo) other;
        return jl40.l(this.image, qrReaderContentInfo.image) && jl40.l(this.action, qrReaderContentInfo.action) && jl40.l(this.accessibilityLabel, qrReaderContentInfo.accessibilityLabel) && jl40.l(this.analyticsButtonClick, qrReaderContentInfo.analyticsButtonClick);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticsButtonClick() {
        return this.analyticsButtonClick;
    }

    public final QrReaderLogoImage getImage() {
        return this.image;
    }

    public int hashCode() {
        int b = unr0.b(this.image.hashCode() * 31, 31, this.action);
        String str = this.accessibilityLabel;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsButtonClick;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        QrReaderLogoImage qrReaderLogoImage = this.image;
        String str = this.action;
        String str2 = this.accessibilityLabel;
        String str3 = this.analyticsButtonClick;
        StringBuilder sb = new StringBuilder("QrReaderContentInfo(image=");
        sb.append(qrReaderLogoImage);
        sb.append(", action=");
        sb.append(str);
        sb.append(", accessibilityLabel=");
        return g8e.r(sb, str2, ", analyticsButtonClick=", str3, Extension.C_BRAKE);
    }
}
