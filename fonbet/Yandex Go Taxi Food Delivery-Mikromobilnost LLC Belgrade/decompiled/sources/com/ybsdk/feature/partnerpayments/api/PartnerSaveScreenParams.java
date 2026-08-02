package com.ybsdk.feature.partnerpayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "SelectPartner", "BindingParner", "Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams$BindingParner;", "Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams$SelectPartner;", "feature-partner-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PartnerSaveScreenParams extends ScreenParams {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams$BindingParner;", "Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams;", "", "memberId", "Lcom/ybsdk/feature/partnerpayments/api/PartnerPaymentsFeature$BindingStatus;", "bindingStatus", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerpayments/api/PartnerPaymentsFeature$BindingStatus;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/partnerpayments/api/PartnerPaymentsFeature$BindingStatus;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerpayments/api/PartnerPaymentsFeature$BindingStatus;)Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams$BindingParner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMemberId", "Lcom/ybsdk/feature/partnerpayments/api/PartnerPaymentsFeature$BindingStatus;", "getBindingStatus", "feature-partner-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BindingParner implements PartnerSaveScreenParams {
        public static final Parcelable.Creator<BindingParner> CREATOR = new Creator();
        private final PartnerPaymentsFeature$BindingStatus bindingStatus;
        private final String memberId;

        public BindingParner(String str, PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus) {
            this.memberId = str;
            this.bindingStatus = partnerPaymentsFeature$BindingStatus;
        }

        public static /* synthetic */ BindingParner copy$default(BindingParner bindingParner, String str, PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bindingParner.memberId;
            }
            if ((i & 2) != 0) {
                partnerPaymentsFeature$BindingStatus = bindingParner.bindingStatus;
            }
            return bindingParner.copy(str, partnerPaymentsFeature$BindingStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* renamed from: component2, reason: from getter */
        public final PartnerPaymentsFeature$BindingStatus getBindingStatus() {
            return this.bindingStatus;
        }

        public final BindingParner copy(String memberId, PartnerPaymentsFeature$BindingStatus bindingStatus) {
            return new BindingParner(memberId, bindingStatus);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindingParner)) {
                return false;
            }
            BindingParner bindingParner = (BindingParner) other;
            return jl40.l(this.memberId, bindingParner.memberId) && this.bindingStatus == bindingParner.bindingStatus;
        }

        public final PartnerPaymentsFeature$BindingStatus getBindingStatus() {
            return this.bindingStatus;
        }

        public final String getMemberId() {
            return this.memberId;
        }

        public int hashCode() {
            String str = this.memberId;
            return this.bindingStatus.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "BindingParner(memberId=" + this.memberId + ", bindingStatus=" + this.bindingStatus + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.memberId);
            dest.writeString(this.bindingStatus.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BindingParner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BindingParner createFromParcel(Parcel parcel) {
                return new BindingParner(parcel.readString(), PartnerPaymentsFeature$BindingStatus.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BindingParner[] newArray(int i) {
                return new BindingParner[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams$SelectPartner;", "Lcom/ybsdk/feature/partnerpayments/api/PartnerSaveScreenParams;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-partner-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectPartner implements PartnerSaveScreenParams {
        public static final SelectPartner INSTANCE = new SelectPartner();
        public static final Parcelable.Creator<SelectPartner> CREATOR = new Creator();

        private SelectPartner() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SelectPartner);
        }

        public int hashCode() {
            return 1395216454;
        }

        public String toString() {
            return "SelectPartner";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectPartner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectPartner createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SelectPartner.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectPartner[] newArray(int i) {
                return new SelectPartner[i];
            }
        }
    }
}
