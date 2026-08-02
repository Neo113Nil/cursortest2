package com.ybsdk.feature.change.payment.method.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016Jh\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0019R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0016¨\u0006."}, d2 = {"Lcom/ybsdk/feature/change/payment/method/api/ChangePaymentMethodParameter;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "scenario", "initialSelectedPaymentMethod", "", "successActions", "failActions", "cancelActions", "agreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/ybsdk/feature/change/payment/method/api/ChangePaymentMethodParameter;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScenario", "getInitialSelectedPaymentMethod", "Ljava/util/List;", "getSuccessActions", "getFailActions", "getCancelActions", "getAgreementId", "feature-change-payment-method-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangePaymentMethodParameter implements ScreenParams {
    public static final Parcelable.Creator<ChangePaymentMethodParameter> CREATOR = new Creator();
    private final String agreementId;
    private final List<String> cancelActions;
    private final List<String> failActions;
    private final String initialSelectedPaymentMethod;
    private final String scenario;
    private final List<String> successActions;

    public ChangePaymentMethodParameter(String str, String str2, List<String> list, List<String> list2, List<String> list3, String str3) {
        this.scenario = str;
        this.initialSelectedPaymentMethod = str2;
        this.successActions = list;
        this.failActions = list2;
        this.cancelActions = list3;
        this.agreementId = str3;
    }

    public static /* synthetic */ ChangePaymentMethodParameter copy$default(ChangePaymentMethodParameter changePaymentMethodParameter, String str, String str2, List list, List list2, List list3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePaymentMethodParameter.scenario;
        }
        if ((i & 2) != 0) {
            str2 = changePaymentMethodParameter.initialSelectedPaymentMethod;
        }
        if ((i & 4) != 0) {
            list = changePaymentMethodParameter.successActions;
        }
        if ((i & 8) != 0) {
            list2 = changePaymentMethodParameter.failActions;
        }
        if ((i & 16) != 0) {
            list3 = changePaymentMethodParameter.cancelActions;
        }
        if ((i & 32) != 0) {
            str3 = changePaymentMethodParameter.agreementId;
        }
        List list4 = list3;
        String str4 = str3;
        return changePaymentMethodParameter.copy(str, str2, list, list2, list4, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitialSelectedPaymentMethod() {
        return this.initialSelectedPaymentMethod;
    }

    public final List<String> component3() {
        return this.successActions;
    }

    public final List<String> component4() {
        return this.failActions;
    }

    public final List<String> component5() {
        return this.cancelActions;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final ChangePaymentMethodParameter copy(String scenario, String initialSelectedPaymentMethod, List<String> successActions, List<String> failActions, List<String> cancelActions, String agreementId) {
        return new ChangePaymentMethodParameter(scenario, initialSelectedPaymentMethod, successActions, failActions, cancelActions, agreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePaymentMethodParameter)) {
            return false;
        }
        ChangePaymentMethodParameter changePaymentMethodParameter = (ChangePaymentMethodParameter) other;
        return jl40.l(this.scenario, changePaymentMethodParameter.scenario) && jl40.l(this.initialSelectedPaymentMethod, changePaymentMethodParameter.initialSelectedPaymentMethod) && jl40.l(this.successActions, changePaymentMethodParameter.successActions) && jl40.l(this.failActions, changePaymentMethodParameter.failActions) && jl40.l(this.cancelActions, changePaymentMethodParameter.cancelActions) && jl40.l(this.agreementId, changePaymentMethodParameter.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final List<String> getCancelActions() {
        return this.cancelActions;
    }

    public final List<String> getFailActions() {
        return this.failActions;
    }

    public final String getInitialSelectedPaymentMethod() {
        return this.initialSelectedPaymentMethod;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final List<String> getSuccessActions() {
        return this.successActions;
    }

    public int hashCode() {
        int hashCode = this.scenario.hashCode() * 31;
        String str = this.initialSelectedPaymentMethod;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.successActions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.failActions;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.cancelActions;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.agreementId;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.scenario;
        String str2 = this.initialSelectedPaymentMethod;
        List<String> list = this.successActions;
        List<String> list2 = this.failActions;
        List<String> list3 = this.cancelActions;
        String str3 = this.agreementId;
        StringBuilder v = b64.v("ChangePaymentMethodParameter(scenario=", str, ", initialSelectedPaymentMethod=", str2, ", successActions=");
        nnm.w(v, list, ", failActions=", list2, ", cancelActions=");
        return n.l(", agreementId=", str3, Extension.C_BRAKE, v, list3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scenario);
        dest.writeString(this.initialSelectedPaymentMethod);
        dest.writeStringList(this.successActions);
        dest.writeStringList(this.failActions);
        dest.writeStringList(this.cancelActions);
        dest.writeString(this.agreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangePaymentMethodParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangePaymentMethodParameter createFromParcel(Parcel parcel) {
            return new ChangePaymentMethodParameter(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangePaymentMethodParameter[] newArray(int i) {
            return new ChangePaymentMethodParameter[i];
        }
    }

    public /* synthetic */ ChangePaymentMethodParameter(String str, String str2, List list, List list2, List list3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list, list2, list3, (i & 32) != 0 ? null : str3);
    }
}
