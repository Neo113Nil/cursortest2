package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001=Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019Jj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b4\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b5\u0010\u0019R \u00107\u001a\u0002068\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/ybsdk/deeplink/generated/TopupAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "depositType", "currency", "", "openKycEds", "", "amount", "agreementId", "paymentMethodId", "suggestAmounts", "suggestBehaviour", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/TopupAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDepositType", "getCurrency", "Z", "getOpenKycEds", "Ljava/lang/Double;", "getAmount", "getAgreementId", "getPaymentMethodId", "getSuggestAmounts", "getSuggestBehaviour", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "lrb1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopupAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<TopupAction> CREATOR = new Creator();
    private final String agreementId;
    private final Double amount;
    private final String currency;
    private final Uri deeplinkUri;
    private final String depositType;
    private final boolean openKycEds;
    private final String paymentMethodId;
    private final String suggestAmounts;
    private final String suggestBehaviour;

    public TopupAction(String str, String str2, boolean z, Double d, String str3, String str4, String str5, String str6) {
        this.depositType = str;
        this.currency = str2;
        this.openKycEds = z;
        this.amount = d;
        this.agreementId = str3;
        this.paymentMethodId = str4;
        this.suggestAmounts = str5;
        this.suggestBehaviour = str6;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/topup", "deposit_type", str);
        j.appendQueryParameter("currency", str2);
        j.appendQueryParameter("open_kyc_eds", String.valueOf(z));
        if (d != null) {
            j.appendQueryParameter("amount", String.valueOf(d.doubleValue()));
        }
        if (str3 != null) {
            j.appendQueryParameter("agreement_id", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("payment_method_id", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("suggest_amounts", str5);
        }
        if (str6 != null) {
            j.appendQueryParameter("suggest_behaviour", str6);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ TopupAction copy$default(TopupAction topupAction, String str, String str2, boolean z, Double d, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topupAction.depositType;
        }
        if ((i & 2) != 0) {
            str2 = topupAction.currency;
        }
        if ((i & 4) != 0) {
            z = topupAction.openKycEds;
        }
        if ((i & 8) != 0) {
            d = topupAction.amount;
        }
        if ((i & 16) != 0) {
            str3 = topupAction.agreementId;
        }
        if ((i & 32) != 0) {
            str4 = topupAction.paymentMethodId;
        }
        if ((i & 64) != 0) {
            str5 = topupAction.suggestAmounts;
        }
        if ((i & 128) != 0) {
            str6 = topupAction.suggestBehaviour;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return topupAction.copy(str, str2, z, d, str9, str10, str7, str8);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getDepositType() {
        return this.depositType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOpenKycEds() {
        return this.openKycEds;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSuggestAmounts() {
        return this.suggestAmounts;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSuggestBehaviour() {
        return this.suggestBehaviour;
    }

    public final TopupAction copy(String depositType, String currency, boolean openKycEds, Double amount, String agreementId, String paymentMethodId, String suggestAmounts, String suggestBehaviour) {
        return new TopupAction(depositType, currency, openKycEds, amount, agreementId, paymentMethodId, suggestAmounts, suggestBehaviour);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupAction)) {
            return false;
        }
        TopupAction topupAction = (TopupAction) other;
        return jl40.l(this.depositType, topupAction.depositType) && jl40.l(this.currency, topupAction.currency) && this.openKycEds == topupAction.openKycEds && jl40.l(this.amount, topupAction.amount) && jl40.l(this.agreementId, topupAction.agreementId) && jl40.l(this.paymentMethodId, topupAction.paymentMethodId) && jl40.l(this.suggestAmounts, topupAction.suggestAmounts) && jl40.l(this.suggestBehaviour, topupAction.suggestBehaviour);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getDepositType() {
        return this.depositType;
    }

    public final boolean getOpenKycEds() {
        return this.openKycEds;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getSuggestAmounts() {
        return this.suggestAmounts;
    }

    public final String getSuggestBehaviour() {
        return this.suggestBehaviour;
    }

    public int hashCode() {
        int e = unr0.e(unr0.b(this.depositType.hashCode() * 31, 31, this.currency), 31, this.openKycEds);
        Double d = this.amount;
        int hashCode = (e + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentMethodId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suggestAmounts;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.suggestBehaviour;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.depositType;
        String str2 = this.currency;
        boolean z = this.openKycEds;
        Double d = this.amount;
        String str3 = this.agreementId;
        String str4 = this.paymentMethodId;
        String str5 = this.suggestAmounts;
        String str6 = this.suggestBehaviour;
        StringBuilder v = b64.v("TopupAction(depositType=", str, ", currency=", str2, ", openKycEds=");
        v.append(z);
        v.append(", amount=");
        v.append(d);
        v.append(", agreementId=");
        g8e.D(v, str3, ", paymentMethodId=", str4, ", suggestAmounts=");
        return g8e.r(v, str5, ", suggestBehaviour=", str6, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.depositType);
        dest.writeString(this.currency);
        dest.writeInt(this.openKycEds ? 1 : 0);
        Double d = this.amount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        dest.writeString(this.agreementId);
        dest.writeString(this.paymentMethodId);
        dest.writeString(this.suggestAmounts);
        dest.writeString(this.suggestBehaviour);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TopupAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopupAction createFromParcel(Parcel parcel) {
            return new TopupAction(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopupAction[] newArray(int i) {
            return new TopupAction[i];
        }
    }

    public TopupAction() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TopupAction(java.lang.String r2, java.lang.String r3, boolean r4, java.lang.Double r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            java.lang.String r2 = "exact"
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lc
            java.lang.String r3 = "RUB"
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L11
            r4 = 0
        L11:
            r11 = r10 & 8
            r0 = 0
            if (r11 == 0) goto L17
            r5 = r0
        L17:
            r11 = r10 & 16
            if (r11 == 0) goto L1c
            r6 = r0
        L1c:
            r11 = r10 & 32
            if (r11 == 0) goto L21
            r7 = r0
        L21:
            r11 = r10 & 64
            if (r11 == 0) goto L26
            r8 = r0
        L26:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L34
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3d
        L34:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ybsdk.deeplink.generated.TopupAction.<init>(java.lang.String, java.lang.String, boolean, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
