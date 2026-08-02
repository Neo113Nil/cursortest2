package com.ybsdk.feature.partnerselection.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink;", "Landroid/os/Parcelable;", "SelectPartner", "AllPartners", "SelectCrossBorderPartner", "RawAction", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$AllPartners;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$RawAction;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$SelectCrossBorderPartner;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$SelectPartner;", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PartnerSelectionDeeplink extends Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$AllPartners;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AllPartners implements PartnerSelectionDeeplink {
        public static final AllPartners INSTANCE = new AllPartners();
        public static final Parcelable.Creator<AllPartners> CREATOR = new Creator();

        private AllPartners() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AllPartners);
        }

        public int hashCode() {
            return 642512868;
        }

        public String toString() {
            return "AllPartners";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AllPartners> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllPartners createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AllPartners.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllPartners[] newArray(int i) {
                return new AllPartners[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$RawAction;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink;", "", "action", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$RawAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RawAction implements PartnerSelectionDeeplink {
        public static final Parcelable.Creator<RawAction> CREATOR = new Creator();
        private final String action;

        public RawAction(String str) {
            this.action = str;
        }

        public static /* synthetic */ RawAction copy$default(RawAction rawAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rawAction.action;
            }
            return rawAction.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final RawAction copy(String action) {
            return new RawAction(action);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RawAction) && jl40.l(this.action, ((RawAction) other).action);
        }

        public final String getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return oyr.p("RawAction(action=", this.action, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.action);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RawAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RawAction createFromParcel(Parcel parcel) {
                return new RawAction(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RawAction[] newArray(int i) {
                return new RawAction[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$SelectCrossBorderPartner;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink;", "", "partnerId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$SelectCrossBorderPartner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartnerId", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectCrossBorderPartner implements PartnerSelectionDeeplink {
        public static final Parcelable.Creator<SelectCrossBorderPartner> CREATOR = new Creator();
        private final String partnerId;

        public SelectCrossBorderPartner(String str) {
            this.partnerId = str;
        }

        public static /* synthetic */ SelectCrossBorderPartner copy$default(SelectCrossBorderPartner selectCrossBorderPartner, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectCrossBorderPartner.partnerId;
            }
            return selectCrossBorderPartner.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        public final SelectCrossBorderPartner copy(String partnerId) {
            return new SelectCrossBorderPartner(partnerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectCrossBorderPartner) && jl40.l(this.partnerId, ((SelectCrossBorderPartner) other).partnerId);
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        public int hashCode() {
            return this.partnerId.hashCode();
        }

        public String toString() {
            return oyr.p("SelectCrossBorderPartner(partnerId=", this.partnerId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.partnerId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectCrossBorderPartner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectCrossBorderPartner createFromParcel(Parcel parcel) {
                return new SelectCrossBorderPartner(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectCrossBorderPartner[] newArray(int i) {
                return new SelectCrossBorderPartner[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$SelectPartner;", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink;", "", "partnerId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionDeeplink$SelectPartner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartnerId", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectPartner implements PartnerSelectionDeeplink {
        public static final Parcelable.Creator<SelectPartner> CREATOR = new Creator();
        private final String partnerId;

        public SelectPartner(String str) {
            this.partnerId = str;
        }

        public static /* synthetic */ SelectPartner copy$default(SelectPartner selectPartner, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectPartner.partnerId;
            }
            return selectPartner.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        public final SelectPartner copy(String partnerId) {
            return new SelectPartner(partnerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectPartner) && jl40.l(this.partnerId, ((SelectPartner) other).partnerId);
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        public int hashCode() {
            return this.partnerId.hashCode();
        }

        public String toString() {
            return oyr.p("SelectPartner(partnerId=", this.partnerId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.partnerId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectPartner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectPartner createFromParcel(Parcel parcel) {
                return new SelectPartner(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectPartner[] newArray(int i) {
                return new SelectPartner[i];
            }
        }
    }
}
