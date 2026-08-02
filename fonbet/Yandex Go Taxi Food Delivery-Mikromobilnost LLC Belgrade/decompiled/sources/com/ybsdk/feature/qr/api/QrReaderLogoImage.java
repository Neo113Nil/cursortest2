package com.ybsdk.feature.qr.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.cbg0;
import defpackage.ccv;
import defpackage.dcv;
import defpackage.fob1;
import defpackage.jl40;
import defpackage.pbv;
import defpackage.rbv;
import defpackage.rev;
import defpackage.unr0;
import defpackage.vfv;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "", "", "light", "dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lrbv;", "toImageModel", "()Lrbv;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/qr/api/QrReaderLogoImage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLight", "getDark", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class QrReaderLogoImage {

    @Json(name = "dark")
    private final String dark;

    @Json(name = "light")
    private final String light;

    public QrReaderLogoImage(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public static /* synthetic */ QrReaderLogoImage copy$default(QrReaderLogoImage qrReaderLogoImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrReaderLogoImage.light;
        }
        if ((i & 2) != 0) {
            str2 = qrReaderLogoImage.dark;
        }
        return qrReaderLogoImage.copy(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv toImageModel$lambda$0(String str) {
        return new pbv(str, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDark() {
        return this.dark;
    }

    public final QrReaderLogoImage copy(String light, String dark) {
        return new QrReaderLogoImage(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderLogoImage)) {
            return false;
        }
        QrReaderLogoImage qrReaderLogoImage = (QrReaderLogoImage) other;
        return jl40.l(this.light, qrReaderLogoImage.light) && jl40.l(this.dark, qrReaderLogoImage.dark);
    }

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    public int hashCode() {
        String str = this.light;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final rbv toImageModel() {
        return fob1.c(this.light, this.dark, new cbg0(5));
    }

    public String toString() {
        return unr0.p("QrReaderLogoImage(light=", this.light, ", dark=", this.dark, Extension.C_BRAKE);
    }
}
