package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018R \u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/ybsdk/deeplink/generated/CreateSavingsAccountAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "currency", "tariffId", "sourceAgreementId", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/ybsdk/deeplink/generated/CreateSavingsAccountAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency", "getTariffId", "getSourceAgreementId", "Ljava/lang/Double;", "getAmount", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreateSavingsAccountAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<CreateSavingsAccountAction> CREATOR = new Creator();
    private final Double amount;
    private final String currency;
    private final Uri deeplinkUri;
    private final String sourceAgreementId;
    private final String tariffId;

    public CreateSavingsAccountAction(String str, String str2, String str3, Double d) {
        this.currency = str;
        this.tariffId = str2;
        this.sourceAgreementId = str3;
        this.amount = d;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/create_savings_account", "currency", str);
        if (str2 != null) {
            j.appendQueryParameter("tariff_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("source_agreement_id", str3);
        }
        if (d != null) {
            j.appendQueryParameter("amount", String.valueOf(d.doubleValue()));
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ CreateSavingsAccountAction copy$default(CreateSavingsAccountAction createSavingsAccountAction, String str, String str2, String str3, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSavingsAccountAction.currency;
        }
        if ((i & 2) != 0) {
            str2 = createSavingsAccountAction.tariffId;
        }
        if ((i & 4) != 0) {
            str3 = createSavingsAccountAction.sourceAgreementId;
        }
        if ((i & 8) != 0) {
            d = createSavingsAccountAction.amount;
        }
        return createSavingsAccountAction.copy(str, str2, str3, d);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTariffId() {
        return this.tariffId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    public final CreateSavingsAccountAction copy(String currency, String tariffId, String sourceAgreementId, Double amount) {
        return new CreateSavingsAccountAction(currency, tariffId, sourceAgreementId, amount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSavingsAccountAction)) {
            return false;
        }
        CreateSavingsAccountAction createSavingsAccountAction = (CreateSavingsAccountAction) other;
        return jl40.l(this.currency, createSavingsAccountAction.currency) && jl40.l(this.tariffId, createSavingsAccountAction.tariffId) && jl40.l(this.sourceAgreementId, createSavingsAccountAction.sourceAgreementId) && jl40.l(this.amount, createSavingsAccountAction.amount);
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

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getTariffId() {
        return this.tariffId;
    }

    public int hashCode() {
        int hashCode = this.currency.hashCode() * 31;
        String str = this.tariffId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceAgreementId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.amount;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        String str = this.currency;
        String str2 = this.tariffId;
        String str3 = this.sourceAgreementId;
        Double d = this.amount;
        StringBuilder v = b64.v("CreateSavingsAccountAction(currency=", str, ", tariffId=", str2, ", sourceAgreementId=");
        v.append(str3);
        v.append(", amount=");
        v.append(d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.currency);
        dest.writeString(this.tariffId);
        dest.writeString(this.sourceAgreementId);
        Double d = this.amount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateSavingsAccountAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSavingsAccountAction createFromParcel(Parcel parcel) {
            return new CreateSavingsAccountAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSavingsAccountAction[] newArray(int i) {
            return new CreateSavingsAccountAction[i];
        }
    }

    public CreateSavingsAccountAction() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ CreateSavingsAccountAction(String str, String str2, String str3, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "RUB" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : d);
    }
}
