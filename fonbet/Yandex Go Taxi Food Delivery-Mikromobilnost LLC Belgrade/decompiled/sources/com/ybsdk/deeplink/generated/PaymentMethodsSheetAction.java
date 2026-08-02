package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014JJ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u0014R \u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/ybsdk/deeplink/generated/PaymentMethodsSheetAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "scenario", "selectedPaymentMethodId", "successAction", "failAction", "cancelAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/PaymentMethodsSheetAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScenario", "getSelectedPaymentMethodId", "getSuccessAction", "getFailAction", "getCancelAction", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodsSheetAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<PaymentMethodsSheetAction> CREATOR = new Creator();
    private final String cancelAction;
    private final Uri deeplinkUri;
    private final String failAction;
    private final String scenario;
    private final String selectedPaymentMethodId;
    private final String successAction;

    public PaymentMethodsSheetAction(String str, String str2, String str3, String str4, String str5) {
        this.scenario = str;
        this.selectedPaymentMethodId = str2;
        this.successAction = str3;
        this.failAction = str4;
        this.cancelAction = str5;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/payment_methods_sheet", "scenario", str);
        if (str2 != null) {
            j.appendQueryParameter("selected_payment_method_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("success_action", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("fail_action", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("cancel_action", str5);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ PaymentMethodsSheetAction copy$default(PaymentMethodsSheetAction paymentMethodsSheetAction, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodsSheetAction.scenario;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodsSheetAction.selectedPaymentMethodId;
        }
        if ((i & 4) != 0) {
            str3 = paymentMethodsSheetAction.successAction;
        }
        if ((i & 8) != 0) {
            str4 = paymentMethodsSheetAction.failAction;
        }
        if ((i & 16) != 0) {
            str5 = paymentMethodsSheetAction.cancelAction;
        }
        String str6 = str5;
        String str7 = str3;
        return paymentMethodsSheetAction.copy(str, str2, str7, str4, str6);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedPaymentMethodId() {
        return this.selectedPaymentMethodId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSuccessAction() {
        return this.successAction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFailAction() {
        return this.failAction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCancelAction() {
        return this.cancelAction;
    }

    public final PaymentMethodsSheetAction copy(String scenario, String selectedPaymentMethodId, String successAction, String failAction, String cancelAction) {
        return new PaymentMethodsSheetAction(scenario, selectedPaymentMethodId, successAction, failAction, cancelAction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodsSheetAction)) {
            return false;
        }
        PaymentMethodsSheetAction paymentMethodsSheetAction = (PaymentMethodsSheetAction) other;
        return jl40.l(this.scenario, paymentMethodsSheetAction.scenario) && jl40.l(this.selectedPaymentMethodId, paymentMethodsSheetAction.selectedPaymentMethodId) && jl40.l(this.successAction, paymentMethodsSheetAction.successAction) && jl40.l(this.failAction, paymentMethodsSheetAction.failAction) && jl40.l(this.cancelAction, paymentMethodsSheetAction.cancelAction);
    }

    public final String getCancelAction() {
        return this.cancelAction;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getFailAction() {
        return this.failAction;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final String getSelectedPaymentMethodId() {
        return this.selectedPaymentMethodId;
    }

    public final String getSuccessAction() {
        return this.successAction;
    }

    public int hashCode() {
        int hashCode = this.scenario.hashCode() * 31;
        String str = this.selectedPaymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.successAction;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.failAction;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cancelAction;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.scenario;
        String str2 = this.selectedPaymentMethodId;
        String str3 = this.successAction;
        String str4 = this.failAction;
        String str5 = this.cancelAction;
        StringBuilder v = b64.v("PaymentMethodsSheetAction(scenario=", str, ", selectedPaymentMethodId=", str2, ", successAction=");
        g8e.D(v, str3, ", failAction=", str4, ", cancelAction=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scenario);
        dest.writeString(this.selectedPaymentMethodId);
        dest.writeString(this.successAction);
        dest.writeString(this.failAction);
        dest.writeString(this.cancelAction);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodsSheetAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsSheetAction createFromParcel(Parcel parcel) {
            return new PaymentMethodsSheetAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsSheetAction[] newArray(int i) {
            return new PaymentMethodsSheetAction[i];
        }
    }

    public /* synthetic */ PaymentMethodsSheetAction(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
