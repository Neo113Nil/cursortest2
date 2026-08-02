package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013R \u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/ybsdk/deeplink/generated/NfcPaymentAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "nfcPaymentScenario", CreateApplicationWithProductJsonAdapter.productKey, "agreementId", "nfcErrorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/NfcPaymentAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNfcPaymentScenario", "getProduct", "getAgreementId", "getNfcErrorType", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcPaymentAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<NfcPaymentAction> CREATOR = new Creator();
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String nfcErrorType;
    private final String nfcPaymentScenario;
    private final String product;

    public NfcPaymentAction(String str, String str2, String str3, String str4) {
        this.nfcPaymentScenario = str;
        this.product = str2;
        this.agreementId = str3;
        this.nfcErrorType = str4;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/nfc_payment");
        if (str != null) {
            l.appendQueryParameter("nfc_payment_scenario", str);
        }
        if (str2 != null) {
            l.appendQueryParameter(CreateApplicationWithProductJsonAdapter.productKey, str2);
        }
        if (str3 != null) {
            l.appendQueryParameter("agreement_id", str3);
        }
        if (str4 != null) {
            l.appendQueryParameter("nfc_error_type", str4);
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ NfcPaymentAction copy$default(NfcPaymentAction nfcPaymentAction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nfcPaymentAction.nfcPaymentScenario;
        }
        if ((i & 2) != 0) {
            str2 = nfcPaymentAction.product;
        }
        if ((i & 4) != 0) {
            str3 = nfcPaymentAction.agreementId;
        }
        if ((i & 8) != 0) {
            str4 = nfcPaymentAction.nfcErrorType;
        }
        return nfcPaymentAction.copy(str, str2, str3, str4);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getNfcPaymentScenario() {
        return this.nfcPaymentScenario;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNfcErrorType() {
        return this.nfcErrorType;
    }

    public final NfcPaymentAction copy(String nfcPaymentScenario, String product, String agreementId, String nfcErrorType) {
        return new NfcPaymentAction(nfcPaymentScenario, product, agreementId, nfcErrorType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPaymentAction)) {
            return false;
        }
        NfcPaymentAction nfcPaymentAction = (NfcPaymentAction) other;
        return jl40.l(this.nfcPaymentScenario, nfcPaymentAction.nfcPaymentScenario) && jl40.l(this.product, nfcPaymentAction.product) && jl40.l(this.agreementId, nfcPaymentAction.agreementId) && jl40.l(this.nfcErrorType, nfcPaymentAction.nfcErrorType);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getNfcErrorType() {
        return this.nfcErrorType;
    }

    public final String getNfcPaymentScenario() {
        return this.nfcPaymentScenario;
    }

    public final String getProduct() {
        return this.product;
    }

    public int hashCode() {
        String str = this.nfcPaymentScenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.product;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agreementId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nfcErrorType;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.nfcPaymentScenario;
        String str2 = this.product;
        return g8e.r(b64.v("NfcPaymentAction(nfcPaymentScenario=", str, ", product=", str2, ", agreementId="), this.agreementId, ", nfcErrorType=", this.nfcErrorType, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nfcPaymentScenario);
        dest.writeString(this.product);
        dest.writeString(this.agreementId);
        dest.writeString(this.nfcErrorType);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcPaymentAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NfcPaymentAction createFromParcel(Parcel parcel) {
            return new NfcPaymentAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NfcPaymentAction[] newArray(int i) {
            return new NfcPaymentAction[i];
        }
    }

    public NfcPaymentAction() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ NfcPaymentAction(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
