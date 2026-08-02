package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n;
import defpackage.oyr;
import defpackage.tse0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J2\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u0012R \u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/ybsdk/deeplink/generated/SplitDepositRepaymentAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "", "previousPaymentIndex", "scenario", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/SplitDepositRepaymentAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId", "Ljava/lang/Integer;", "getPreviousPaymentIndex", "getScenario", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitDepositRepaymentAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SplitDepositRepaymentAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String orderId;
    private final Integer previousPaymentIndex;
    private final String scenario;

    public SplitDepositRepaymentAction(String str, Integer num, String str2) {
        this.orderId = str;
        this.previousPaymentIndex = num;
        this.scenario = str2;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/split_deposit_repayment", "order_id", str);
        if (num != null) {
            j.appendQueryParameter("previous_payment_index", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            j.appendQueryParameter("scenario", str2);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ SplitDepositRepaymentAction copy$default(SplitDepositRepaymentAction splitDepositRepaymentAction, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = splitDepositRepaymentAction.orderId;
        }
        if ((i & 2) != 0) {
            num = splitDepositRepaymentAction.previousPaymentIndex;
        }
        if ((i & 4) != 0) {
            str2 = splitDepositRepaymentAction.scenario;
        }
        return splitDepositRepaymentAction.copy(str, num, str2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPreviousPaymentIndex() {
        return this.previousPaymentIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final SplitDepositRepaymentAction copy(String orderId, Integer previousPaymentIndex, String scenario) {
        return new SplitDepositRepaymentAction(orderId, previousPaymentIndex, scenario);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitDepositRepaymentAction)) {
            return false;
        }
        SplitDepositRepaymentAction splitDepositRepaymentAction = (SplitDepositRepaymentAction) other;
        return jl40.l(this.orderId, splitDepositRepaymentAction.orderId) && jl40.l(this.previousPaymentIndex, splitDepositRepaymentAction.previousPaymentIndex) && jl40.l(this.scenario, splitDepositRepaymentAction.scenario);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Integer getPreviousPaymentIndex() {
        return this.previousPaymentIndex;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int hashCode = this.orderId.hashCode() * 31;
        Integer num = this.previousPaymentIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.scenario;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.orderId;
        Integer num = this.previousPaymentIndex;
        return oyr.t(n.q("SplitDepositRepaymentAction(orderId=", num, str, ", previousPaymentIndex=", ", scenario="), this.scenario, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.orderId);
        Integer num = this.previousPaymentIndex;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        dest.writeString(this.scenario);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SplitDepositRepaymentAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositRepaymentAction createFromParcel(Parcel parcel) {
            return new SplitDepositRepaymentAction(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositRepaymentAction[] newArray(int i) {
            return new SplitDepositRepaymentAction[i];
        }
    }

    public /* synthetic */ SplitDepositRepaymentAction(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
