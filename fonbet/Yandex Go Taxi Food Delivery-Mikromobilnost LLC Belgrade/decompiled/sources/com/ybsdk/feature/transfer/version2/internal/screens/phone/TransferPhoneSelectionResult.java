package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import defpackage.jl40;
import defpackage.pn01;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Companion", "Close", "Success", "pn01", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult$Close;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult$Success;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransferPhoneSelectionResult extends Parcelable {
    public static final pn01 Companion = pn01.a;

    Bundle toBundle();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult$Close;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Close implements TransferPhoneSelectionResult {
        public static final Close INSTANCE = new Close();
        public static final Parcelable.Creator<Close> CREATOR = new Creator();

        private Close() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Close);
        }

        public int hashCode() {
            return 193837173;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneSelectionResult
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("TransferPhoneSelectionResult", this);
            return bundle;
        }

        public String toString() {
            return "Close";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Close> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Close createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Close.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Close[] newArray(int i) {
                return new Close[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult$Success;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult;", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "partner", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "inputSource", "<init>", "(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "component2", "()Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "copy", "(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;)Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/TransferPhoneSelectionResult$Success;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "getPartner", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "getInputSource", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements TransferPhoneSelectionResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final PhoneInputSource inputSource;
        private final SelectedPartner partner;

        public Success(SelectedPartner selectedPartner, PhoneInputSource phoneInputSource) {
            this.partner = selectedPartner;
            this.inputSource = phoneInputSource;
        }

        public static /* synthetic */ Success copy$default(Success success, SelectedPartner selectedPartner, PhoneInputSource phoneInputSource, int i, Object obj) {
            if ((i & 1) != 0) {
                selectedPartner = success.partner;
            }
            if ((i & 2) != 0) {
                phoneInputSource = success.inputSource;
            }
            return success.copy(selectedPartner, phoneInputSource);
        }

        /* renamed from: component1, reason: from getter */
        public final SelectedPartner getPartner() {
            return this.partner;
        }

        /* renamed from: component2, reason: from getter */
        public final PhoneInputSource getInputSource() {
            return this.inputSource;
        }

        public final Success copy(SelectedPartner partner, PhoneInputSource inputSource) {
            return new Success(partner, inputSource);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return jl40.l(this.partner, success.partner) && this.inputSource == success.inputSource;
        }

        public final PhoneInputSource getInputSource() {
            return this.inputSource;
        }

        public final SelectedPartner getPartner() {
            return this.partner;
        }

        public int hashCode() {
            return this.inputSource.hashCode() + (this.partner.hashCode() * 31);
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneSelectionResult
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("TransferPhoneSelectionResult", this);
            return bundle;
        }

        public String toString() {
            return "Success(partner=" + this.partner + ", inputSource=" + this.inputSource + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.partner, flags);
            dest.writeString(this.inputSource.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((SelectedPartner) parcel.readParcelable(Success.class.getClassLoader()), PhoneInputSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }
    }
}
