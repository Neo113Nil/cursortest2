package com.ybsdk.feature.testpayment.internal.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.testpayment.api.TestPaymentFlow;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload;", "Landroid/os/Parcelable;", "AutoTopup", "AutoPayment", "Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload$AutoPayment;", "Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload$AutoTopup;", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TestPaymentPayload extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload$AutoPayment;", "Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload;", "", "agreementId", "memberId", "Lcom/ybsdk/feature/testpayment/api/TestPaymentFlow;", "paymentFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/testpayment/api/TestPaymentFlow;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/testpayment/api/TestPaymentFlow;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/testpayment/api/TestPaymentFlow;)Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload$AutoPayment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getMemberId", "Lcom/ybsdk/feature/testpayment/api/TestPaymentFlow;", "getPaymentFlow", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoPayment implements TestPaymentPayload {
        public static final Parcelable.Creator<AutoPayment> CREATOR = new Creator();
        private final String agreementId;
        private final String memberId;
        private final TestPaymentFlow paymentFlow;

        public AutoPayment(String str, String str2, TestPaymentFlow testPaymentFlow) {
            this.agreementId = str;
            this.memberId = str2;
            this.paymentFlow = testPaymentFlow;
        }

        public static /* synthetic */ AutoPayment copy$default(AutoPayment autoPayment, String str, String str2, TestPaymentFlow testPaymentFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autoPayment.agreementId;
            }
            if ((i & 2) != 0) {
                str2 = autoPayment.memberId;
            }
            if ((i & 4) != 0) {
                testPaymentFlow = autoPayment.paymentFlow;
            }
            return autoPayment.copy(str, str2, testPaymentFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* renamed from: component3, reason: from getter */
        public final TestPaymentFlow getPaymentFlow() {
            return this.paymentFlow;
        }

        public final AutoPayment copy(String agreementId, String memberId, TestPaymentFlow paymentFlow) {
            return new AutoPayment(agreementId, memberId, paymentFlow);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoPayment)) {
                return false;
            }
            AutoPayment autoPayment = (AutoPayment) other;
            return jl40.l(this.agreementId, autoPayment.agreementId) && jl40.l(this.memberId, autoPayment.memberId) && this.paymentFlow == autoPayment.paymentFlow;
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getMemberId() {
            return this.memberId;
        }

        public final TestPaymentFlow getPaymentFlow() {
            return this.paymentFlow;
        }

        public int hashCode() {
            String str = this.agreementId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.memberId;
            return this.paymentFlow.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.agreementId;
            String str2 = this.memberId;
            TestPaymentFlow testPaymentFlow = this.paymentFlow;
            StringBuilder v = b64.v("AutoPayment(agreementId=", str, ", memberId=", str2, ", paymentFlow=");
            v.append(testPaymentFlow);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
            dest.writeString(this.memberId);
            dest.writeString(this.paymentFlow.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoPayment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoPayment createFromParcel(Parcel parcel) {
                return new AutoPayment(parcel.readString(), parcel.readString(), TestPaymentFlow.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoPayment[] newArray(int i) {
                return new AutoPayment[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload$AutoTopup;", "Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload;", "", "agreementId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/testpayment/internal/presentation/TestPaymentPayload$AutoTopup;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoTopup implements TestPaymentPayload {
        public static final Parcelable.Creator<AutoTopup> CREATOR = new Creator();
        private final String agreementId;

        public AutoTopup(String str) {
            this.agreementId = str;
        }

        public static /* synthetic */ AutoTopup copy$default(AutoTopup autoTopup, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autoTopup.agreementId;
            }
            return autoTopup.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        public final AutoTopup copy(String agreementId) {
            return new AutoTopup(agreementId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoTopup) && jl40.l(this.agreementId, ((AutoTopup) other).agreementId);
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public int hashCode() {
            return this.agreementId.hashCode();
        }

        public String toString() {
            return oyr.p("AutoTopup(agreementId=", this.agreementId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoTopup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoTopup createFromParcel(Parcel parcel) {
                return new AutoTopup(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoTopup[] newArray(int i) {
                return new AutoTopup[i];
            }
        }
    }
}
