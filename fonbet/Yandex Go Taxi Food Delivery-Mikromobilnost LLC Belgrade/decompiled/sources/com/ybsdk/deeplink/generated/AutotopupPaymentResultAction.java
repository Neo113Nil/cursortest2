package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012R \u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ybsdk/deeplink/generated/AutotopupPaymentResultAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "agreementId", "type", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/AutotopupPaymentResultAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getType", "getSource", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutotopupPaymentResultAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<AutotopupPaymentResultAction> CREATOR = new Creator();
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String source;
    private final String type;

    public AutotopupPaymentResultAction(String str, String str2, String str3) {
        this.agreementId = str;
        this.type = str2;
        this.source = str3;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/autotopup_payment_result", "agreement_id", str);
        j.appendQueryParameter("type", str2);
        if (str3 != null) {
            j.appendQueryParameter("source", str3);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ AutotopupPaymentResultAction copy$default(AutotopupPaymentResultAction autotopupPaymentResultAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autotopupPaymentResultAction.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = autotopupPaymentResultAction.type;
        }
        if ((i & 4) != 0) {
            str3 = autotopupPaymentResultAction.source;
        }
        return autotopupPaymentResultAction.copy(str, str2, str3);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final AutotopupPaymentResultAction copy(String agreementId, String type, String source) {
        return new AutotopupPaymentResultAction(agreementId, type, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotopupPaymentResultAction)) {
            return false;
        }
        AutotopupPaymentResultAction autotopupPaymentResultAction = (AutotopupPaymentResultAction) other;
        return jl40.l(this.agreementId, autotopupPaymentResultAction.agreementId) && jl40.l(this.type, autotopupPaymentResultAction.type) && jl40.l(this.source, autotopupPaymentResultAction.source);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(this.agreementId.hashCode() * 31, 31, this.type);
        String str = this.source;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.type;
        return oyr.t(b64.v("AutotopupPaymentResultAction(agreementId=", str, ", type=", str2, ", source="), this.source, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeString(this.type);
        dest.writeString(this.source);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotopupPaymentResultAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutotopupPaymentResultAction createFromParcel(Parcel parcel) {
            return new AutotopupPaymentResultAction(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutotopupPaymentResultAction[] newArray(int i) {
            return new AutotopupPaymentResultAction[i];
        }
    }

    public /* synthetic */ AutotopupPaymentResultAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
