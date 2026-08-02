package com.ybsdk.feature.qr.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.cbg0;
import defpackage.ccv;
import defpackage.dzh0;
import defpackage.fob1;
import defpackage.g8e;
import defpackage.hdg0;
import defpackage.jl40;
import defpackage.nbv;
import defpackage.nyg0;
import defpackage.pbv;
import defpackage.rbv;
import defpackage.rev;
import defpackage.unr0;
import defpackage.vfv;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderContentCameraPermission;", "", "Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "image", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonText", "<init>", "(Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lhdg0;", "toEntity", "()Lhdg0;", "component1", "()Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/qr/api/QrReaderContentCameraPermission;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "getImage", "Ljava/lang/String;", "getTitle", "getDescription", "getButtonText", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class QrReaderContentCameraPermission {

    @Json(name = "button_text")
    private final String buttonText;

    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    private final String description;

    @Json(name = "image")
    private final QrReaderLogoImage image;

    @Json(name = "title")
    private final String title;

    public QrReaderContentCameraPermission(QrReaderLogoImage qrReaderLogoImage, String str, String str2, String str3) {
        this.image = qrReaderLogoImage;
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
    }

    public static /* synthetic */ QrReaderContentCameraPermission copy$default(QrReaderContentCameraPermission qrReaderContentCameraPermission, QrReaderLogoImage qrReaderLogoImage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            qrReaderLogoImage = qrReaderContentCameraPermission.image;
        }
        if ((i & 2) != 0) {
            str = qrReaderContentCameraPermission.title;
        }
        if ((i & 4) != 0) {
            str2 = qrReaderContentCameraPermission.description;
        }
        if ((i & 8) != 0) {
            str3 = qrReaderContentCameraPermission.buttonText;
        }
        return qrReaderContentCameraPermission.copy(qrReaderLogoImage, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv toEntity$lambda$0(String str) {
        return new pbv(str, new ccv(nyg0.ybsdk_ic_error_icon), rev.n, new ccv(nyg0.ybsdk_ic_error_icon), (vfv) null, 48);
    }

    /* renamed from: component1, reason: from getter */
    public final QrReaderLogoImage getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    public final QrReaderContentCameraPermission copy(QrReaderLogoImage image, String title, String description, String buttonText) {
        return new QrReaderContentCameraPermission(image, title, description, buttonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderContentCameraPermission)) {
            return false;
        }
        QrReaderContentCameraPermission qrReaderContentCameraPermission = (QrReaderContentCameraPermission) other;
        return jl40.l(this.image, qrReaderContentCameraPermission.image) && jl40.l(this.title, qrReaderContentCameraPermission.title) && jl40.l(this.description, qrReaderContentCameraPermission.description) && jl40.l(this.buttonText, qrReaderContentCameraPermission.buttonText);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final QrReaderLogoImage getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        QrReaderLogoImage qrReaderLogoImage = this.image;
        int hashCode = (qrReaderLogoImage == null ? 0 : qrReaderLogoImage.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final hdg0 toEntity() {
        QrReaderLogoImage qrReaderLogoImage = this.image;
        String light = qrReaderLogoImage != null ? qrReaderLogoImage.getLight() : null;
        QrReaderLogoImage qrReaderLogoImage2 = this.image;
        rbv c = fob1.c(light, qrReaderLogoImage2 != null ? qrReaderLogoImage2.getDark() : null, new cbg0(2));
        if (c == null) {
            c = new nbv(nyg0.ybsdk_ic_error_icon);
        }
        String str = this.title;
        Text constant = str != null ? new Text.Constant(str) : unr0.h(Text.Companion, dzh0.ybsdk_transfer_permission_access_required_title);
        String str2 = this.description;
        Text constant2 = str2 != null ? new Text.Constant(str2) : unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_camera_permission_warning_description);
        String str3 = this.buttonText;
        return new hdg0(c, constant, constant2, str3 != null ? new Text.Constant(str3) : unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_open_settings_button));
    }

    public String toString() {
        QrReaderLogoImage qrReaderLogoImage = this.image;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.buttonText;
        StringBuilder sb = new StringBuilder("QrReaderContentCameraPermission(image=");
        sb.append(qrReaderLogoImage);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        return g8e.r(sb, str2, ", buttonText=", str3, Extension.C_BRAKE);
    }
}
