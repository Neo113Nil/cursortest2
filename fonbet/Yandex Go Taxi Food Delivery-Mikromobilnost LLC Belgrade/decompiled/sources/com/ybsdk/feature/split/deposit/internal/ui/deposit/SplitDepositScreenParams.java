package com.ybsdk.feature.split.deposit.internal.ui.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/deposit/SplitDepositScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "scenario", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/split/deposit/internal/ui/deposit/SplitDepositScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId", "getScenario", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitDepositScreenParams implements ScreenParams {
    public static final Parcelable.Creator<SplitDepositScreenParams> CREATOR = new Creator();
    private final String orderId;
    private final String scenario;

    public SplitDepositScreenParams(String str, String str2) {
        this.orderId = str;
        this.scenario = str2;
    }

    public static /* synthetic */ SplitDepositScreenParams copy$default(SplitDepositScreenParams splitDepositScreenParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = splitDepositScreenParams.orderId;
        }
        if ((i & 2) != 0) {
            str2 = splitDepositScreenParams.scenario;
        }
        return splitDepositScreenParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final SplitDepositScreenParams copy(String orderId, String scenario) {
        return new SplitDepositScreenParams(orderId, scenario);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitDepositScreenParams)) {
            return false;
        }
        SplitDepositScreenParams splitDepositScreenParams = (SplitDepositScreenParams) other;
        return jl40.l(this.orderId, splitDepositScreenParams.orderId) && jl40.l(this.scenario, splitDepositScreenParams.scenario);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int hashCode = this.orderId.hashCode() * 31;
        String str = this.scenario;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("SplitDepositScreenParams(orderId=", this.orderId, ", scenario=", this.scenario, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.orderId);
        dest.writeString(this.scenario);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SplitDepositScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositScreenParams createFromParcel(Parcel parcel) {
            return new SplitDepositScreenParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositScreenParams[] newArray(int i) {
            return new SplitDepositScreenParams[i];
        }
    }
}
