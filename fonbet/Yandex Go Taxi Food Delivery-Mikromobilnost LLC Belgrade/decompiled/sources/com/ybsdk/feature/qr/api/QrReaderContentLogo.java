package com.ybsdk.feature.qr.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderContentLogo;", "", "image", "Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "width", "", "height", "topMargin", "<init>", "(Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;III)V", "getImage", "()Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "getWidth", "()I", "getHeight", "getTopMargin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class QrReaderContentLogo {

    @Json(name = "height")
    private final int height;

    @Json(name = "image")
    private final QrReaderLogoImage image;

    @Json(name = "top_margin")
    private final int topMargin;

    @Json(name = "width")
    private final int width;

    public QrReaderContentLogo(QrReaderLogoImage qrReaderLogoImage, int i, int i2, int i3) {
        this.image = qrReaderLogoImage;
        this.width = i;
        this.height = i2;
        this.topMargin = i3;
    }

    public static /* synthetic */ QrReaderContentLogo copy$default(QrReaderContentLogo qrReaderContentLogo, QrReaderLogoImage qrReaderLogoImage, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            qrReaderLogoImage = qrReaderContentLogo.image;
        }
        if ((i4 & 2) != 0) {
            i = qrReaderContentLogo.width;
        }
        if ((i4 & 4) != 0) {
            i2 = qrReaderContentLogo.height;
        }
        if ((i4 & 8) != 0) {
            i3 = qrReaderContentLogo.topMargin;
        }
        return qrReaderContentLogo.copy(qrReaderLogoImage, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final QrReaderLogoImage getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTopMargin() {
        return this.topMargin;
    }

    public final QrReaderContentLogo copy(QrReaderLogoImage image, int width, int height, int topMargin) {
        return new QrReaderContentLogo(image, width, height, topMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderContentLogo)) {
            return false;
        }
        QrReaderContentLogo qrReaderContentLogo = (QrReaderContentLogo) other;
        return jl40.l(this.image, qrReaderContentLogo.image) && this.width == qrReaderContentLogo.width && this.height == qrReaderContentLogo.height && this.topMargin == qrReaderContentLogo.topMargin;
    }

    public final int getHeight() {
        return this.height;
    }

    public final QrReaderLogoImage getImage() {
        return this.image;
    }

    public final int getTopMargin() {
        return this.topMargin;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.topMargin) + oyr.b(this.height, oyr.b(this.width, this.image.hashCode() * 31, 31), 31);
    }

    public String toString() {
        QrReaderLogoImage qrReaderLogoImage = this.image;
        int i = this.width;
        int i2 = this.height;
        int i3 = this.topMargin;
        StringBuilder sb = new StringBuilder("QrReaderContentLogo(image=");
        sb.append(qrReaderLogoImage);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        return ly3.k(i2, i3, ", topMargin=", Extension.C_BRAKE, sb);
    }
}
