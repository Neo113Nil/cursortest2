package com.ybsdk.feature.partnerselection.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.ki90;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Companion", "BackPressed", "Close", "Success", "ki90", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult$BackPressed;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult$Close;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult$Success;", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PartnerSelectionResult extends Parcelable {
    public static final ki90 Companion = ki90.a;

    Bundle toBundle();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult$BackPressed;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BackPressed implements PartnerSelectionResult {
        public static final BackPressed INSTANCE = new BackPressed();
        public static final Parcelable.Creator<BackPressed> CREATOR = new Creator();

        private BackPressed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BackPressed);
        }

        public int hashCode() {
            return -1188361622;
        }

        @Override // com.ybsdk.feature.partnerselection.api.PartnerSelectionResult
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("PartnerSelectionResult", this);
            return bundle;
        }

        public String toString() {
            return "BackPressed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BackPressed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BackPressed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BackPressed.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BackPressed[] newArray(int i) {
                return new BackPressed[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult$Close;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Close implements PartnerSelectionResult {
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
            return 143456871;
        }

        @Override // com.ybsdk.feature.partnerselection.api.PartnerSelectionResult
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("PartnerSelectionResult", this);
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult$Success;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult;", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "partner", "<init>", "(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "copy", "(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;)Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult$Success;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;", "getPartner", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements PartnerSelectionResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final SelectedPartner partner;

        public Success(SelectedPartner selectedPartner) {
            this.partner = selectedPartner;
        }

        public static /* synthetic */ Success copy$default(Success success, SelectedPartner selectedPartner, int i, Object obj) {
            if ((i & 1) != 0) {
                selectedPartner = success.partner;
            }
            return success.copy(selectedPartner);
        }

        /* renamed from: component1, reason: from getter */
        public final SelectedPartner getPartner() {
            return this.partner;
        }

        public final Success copy(SelectedPartner partner) {
            return new Success(partner);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && jl40.l(this.partner, ((Success) other).partner);
        }

        public final SelectedPartner getPartner() {
            return this.partner;
        }

        public int hashCode() {
            return this.partner.hashCode();
        }

        @Override // com.ybsdk.feature.partnerselection.api.PartnerSelectionResult
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("PartnerSelectionResult", this);
            return bundle;
        }

        public String toString() {
            return "Success(partner=" + this.partner + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.partner.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(SelectedPartner.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }
    }
}
