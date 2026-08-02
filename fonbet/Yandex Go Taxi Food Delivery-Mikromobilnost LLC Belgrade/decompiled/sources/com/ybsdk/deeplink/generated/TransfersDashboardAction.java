package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013R \u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/ybsdk/deeplink/generated/TransfersDashboardAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "origin", "agreementId", "autopaymentId", "tokenizationProductId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/TransfersDashboardAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrigin", "getAgreementId", "getAutopaymentId", "getTokenizationProductId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransfersDashboardAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<TransfersDashboardAction> CREATOR = new Creator();
    private final String agreementId;
    private final String autopaymentId;
    private final Uri deeplinkUri;
    private final String origin;
    private final String tokenizationProductId;

    public TransfersDashboardAction(String str, String str2, String str3, String str4) {
        this.origin = str;
        this.agreementId = str2;
        this.autopaymentId = str3;
        this.tokenizationProductId = str4;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/transfers_dashboard", "origin", str);
        if (str2 != null) {
            j.appendQueryParameter("agreement_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("autopayment_id", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("tokenization_product_id", str4);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ TransfersDashboardAction copy$default(TransfersDashboardAction transfersDashboardAction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transfersDashboardAction.origin;
        }
        if ((i & 2) != 0) {
            str2 = transfersDashboardAction.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = transfersDashboardAction.autopaymentId;
        }
        if ((i & 8) != 0) {
            str4 = transfersDashboardAction.tokenizationProductId;
        }
        return transfersDashboardAction.copy(str, str2, str3, str4);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTokenizationProductId() {
        return this.tokenizationProductId;
    }

    public final TransfersDashboardAction copy(String origin, String agreementId, String autopaymentId, String tokenizationProductId) {
        return new TransfersDashboardAction(origin, agreementId, autopaymentId, tokenizationProductId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersDashboardAction)) {
            return false;
        }
        TransfersDashboardAction transfersDashboardAction = (TransfersDashboardAction) other;
        return jl40.l(this.origin, transfersDashboardAction.origin) && jl40.l(this.agreementId, transfersDashboardAction.agreementId) && jl40.l(this.autopaymentId, transfersDashboardAction.autopaymentId) && jl40.l(this.tokenizationProductId, transfersDashboardAction.tokenizationProductId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getTokenizationProductId() {
        return this.tokenizationProductId;
    }

    public int hashCode() {
        int hashCode = this.origin.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.autopaymentId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenizationProductId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.origin;
        String str2 = this.agreementId;
        return g8e.r(b64.v("TransfersDashboardAction(origin=", str, ", agreementId=", str2, ", autopaymentId="), this.autopaymentId, ", tokenizationProductId=", this.tokenizationProductId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.origin);
        dest.writeString(this.agreementId);
        dest.writeString(this.autopaymentId);
        dest.writeString(this.tokenizationProductId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransfersDashboardAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransfersDashboardAction createFromParcel(Parcel parcel) {
            return new TransfersDashboardAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransfersDashboardAction[] newArray(int i) {
            return new TransfersDashboardAction[i];
        }
    }

    public TransfersDashboardAction() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ TransfersDashboardAction(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "unknown" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
