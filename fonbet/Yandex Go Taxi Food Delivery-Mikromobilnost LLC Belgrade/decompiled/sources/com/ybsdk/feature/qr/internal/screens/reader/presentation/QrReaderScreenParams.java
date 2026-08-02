package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.api.QrReaderScreenType;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b2\u0010\u001a¨\u00063"}, d2 = {"Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/QrReaderScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "requestPermissionOnlyOnce", "", "origin", "Lcom/ybsdk/feature/qr/api/QrReaderScreenType;", "screenType", "agreementId", "Lcom/ybsdk/core/utils/text/Text;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "autopaymentId", "<init>", "(ZLjava/lang/String;Lcom/ybsdk/feature/qr/api/QrReaderScreenType;Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/feature/qr/api/QrReaderScreenType;", "component4", "component5", "()Lcom/ybsdk/core/utils/text/Text;", "component6", "copy", "(ZLjava/lang/String;Lcom/ybsdk/feature/qr/api/QrReaderScreenType;Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/QrReaderScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRequestPermissionOnlyOnce", "Ljava/lang/String;", "getOrigin", "Lcom/ybsdk/feature/qr/api/QrReaderScreenType;", "getScreenType", "getAgreementId", "Lcom/ybsdk/core/utils/text/Text;", "getDescription", "getAutopaymentId", "feature-qr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrReaderScreenParams implements ScreenParams {
    public static final Parcelable.Creator<QrReaderScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final String autopaymentId;
    private final Text description;
    private final String origin;
    private final boolean requestPermissionOnlyOnce;
    private final QrReaderScreenType screenType;

    public QrReaderScreenParams(boolean z, String str, QrReaderScreenType qrReaderScreenType, String str2, Text text, String str3) {
        this.requestPermissionOnlyOnce = z;
        this.origin = str;
        this.screenType = qrReaderScreenType;
        this.agreementId = str2;
        this.description = text;
        this.autopaymentId = str3;
    }

    public static /* synthetic */ QrReaderScreenParams copy$default(QrReaderScreenParams qrReaderScreenParams, boolean z, String str, QrReaderScreenType qrReaderScreenType, String str2, Text text, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = qrReaderScreenParams.requestPermissionOnlyOnce;
        }
        if ((i & 2) != 0) {
            str = qrReaderScreenParams.origin;
        }
        if ((i & 4) != 0) {
            qrReaderScreenType = qrReaderScreenParams.screenType;
        }
        if ((i & 8) != 0) {
            str2 = qrReaderScreenParams.agreementId;
        }
        if ((i & 16) != 0) {
            text = qrReaderScreenParams.description;
        }
        if ((i & 32) != 0) {
            str3 = qrReaderScreenParams.autopaymentId;
        }
        Text text2 = text;
        String str4 = str3;
        return qrReaderScreenParams.copy(z, str, qrReaderScreenType, str2, text2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRequestPermissionOnlyOnce() {
        return this.requestPermissionOnlyOnce;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component3, reason: from getter */
    public final QrReaderScreenType getScreenType() {
        return this.screenType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final Text getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final QrReaderScreenParams copy(boolean requestPermissionOnlyOnce, String origin, QrReaderScreenType screenType, String agreementId, Text description, String autopaymentId) {
        return new QrReaderScreenParams(requestPermissionOnlyOnce, origin, screenType, agreementId, description, autopaymentId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderScreenParams)) {
            return false;
        }
        QrReaderScreenParams qrReaderScreenParams = (QrReaderScreenParams) other;
        return this.requestPermissionOnlyOnce == qrReaderScreenParams.requestPermissionOnlyOnce && jl40.l(this.origin, qrReaderScreenParams.origin) && jl40.l(this.screenType, qrReaderScreenParams.screenType) && jl40.l(this.agreementId, qrReaderScreenParams.agreementId) && jl40.l(this.description, qrReaderScreenParams.description) && jl40.l(this.autopaymentId, qrReaderScreenParams.autopaymentId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final Text getDescription() {
        return this.description;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final boolean getRequestPermissionOnlyOnce() {
        return this.requestPermissionOnlyOnce;
    }

    public final QrReaderScreenType getScreenType() {
        return this.screenType;
    }

    public int hashCode() {
        int hashCode = (this.screenType.hashCode() + unr0.b(Boolean.hashCode(this.requestPermissionOnlyOnce) * 31, 31, this.origin)) * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Text text = this.description;
        int hashCode3 = (hashCode2 + (text == null ? 0 : text.hashCode())) * 31;
        String str2 = this.autopaymentId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.requestPermissionOnlyOnce;
        String str = this.origin;
        QrReaderScreenType qrReaderScreenType = this.screenType;
        String str2 = this.agreementId;
        Text text = this.description;
        String str3 = this.autopaymentId;
        StringBuilder v = ly3.v("QrReaderScreenParams(requestPermissionOnlyOnce=", ", origin=", str, ", screenType=", z);
        v.append(qrReaderScreenType);
        v.append(", agreementId=");
        v.append(str2);
        v.append(", description=");
        v.append(text);
        v.append(", autopaymentId=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.requestPermissionOnlyOnce ? 1 : 0);
        dest.writeString(this.origin);
        dest.writeParcelable(this.screenType, flags);
        dest.writeString(this.agreementId);
        dest.writeParcelable(this.description, flags);
        dest.writeString(this.autopaymentId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QrReaderScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrReaderScreenParams createFromParcel(Parcel parcel) {
            return new QrReaderScreenParams(parcel.readInt() != 0, parcel.readString(), (QrReaderScreenType) parcel.readParcelable(QrReaderScreenParams.class.getClassLoader()), parcel.readString(), (Text) parcel.readParcelable(QrReaderScreenParams.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrReaderScreenParams[] newArray(int i) {
            return new QrReaderScreenParams[i];
        }
    }
}
