package com.ybsdk.core.transfer.utils;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "Landroid/os/Parcelable;", "SelectTarget", "AllTargets", "PhoneTransfer", "CrossBorderTransfer", "RequisitesTransfer", "Me2MeTopup", "AftTopup", "RawAction", "Self", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$AftTopup;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$AllTargets;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$CrossBorderTransfer;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Me2MeTopup;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$PhoneTransfer;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$RawAction;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$RequisitesTransfer;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$SelectTarget;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self;", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TransferDeeplink extends Parcelable {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "Topup", "Transfer", "ItemsSheet", "SectionsSheet", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$ItemsSheet;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$SectionsSheet;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$Topup;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$Transfer;", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Self extends TransferDeeplink {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$ItemsSheet;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ItemsSheet implements Self {
            public static final ItemsSheet INSTANCE = new ItemsSheet();
            public static final Parcelable.Creator<ItemsSheet> CREATOR = new Creator();

            private ItemsSheet() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ItemsSheet> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ItemsSheet createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ItemsSheet.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ItemsSheet[] newArray(int i) {
                    return new ItemsSheet[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$SectionsSheet;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SectionsSheet implements Self {
            public static final SectionsSheet INSTANCE = new SectionsSheet();
            public static final Parcelable.Creator<SectionsSheet> CREATOR = new Creator();

            private SectionsSheet() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SectionsSheet> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SectionsSheet createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return SectionsSheet.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SectionsSheet[] newArray(int i) {
                    return new SectionsSheet[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$Topup;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Topup implements Self {
            public static final Topup INSTANCE = new Topup();
            public static final Parcelable.Creator<Topup> CREATOR = new Creator();

            private Topup() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Topup> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Topup createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Topup.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Topup[] newArray(int i) {
                    return new Topup[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self$Transfer;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Self;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Transfer implements Self {
            public static final Transfer INSTANCE = new Transfer();
            public static final Parcelable.Creator<Transfer> CREATOR = new Creator();

            private Transfer() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Transfer> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Transfer createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Transfer.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Transfer[] newArray(int i) {
                    return new Transfer[i];
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$AftTopup;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AftTopup implements TransferDeeplink {
        public static final AftTopup INSTANCE = new AftTopup();
        public static final Parcelable.Creator<AftTopup> CREATOR = new Creator();

        private AftTopup() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AftTopup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AftTopup createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AftTopup.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AftTopup[] newArray(int i) {
                return new AftTopup[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$AllTargets;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AllTargets implements TransferDeeplink {
        public static final AllTargets INSTANCE = new AllTargets();
        public static final Parcelable.Creator<AllTargets> CREATOR = new Creator();

        private AllTargets() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AllTargets> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllTargets createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AllTargets.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllTargets[] newArray(int i) {
                return new AllTargets[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$CrossBorderTransfer;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CrossBorderTransfer implements TransferDeeplink {
        public static final CrossBorderTransfer INSTANCE = new CrossBorderTransfer();
        public static final Parcelable.Creator<CrossBorderTransfer> CREATOR = new Creator();

        private CrossBorderTransfer() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CrossBorderTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CrossBorderTransfer createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CrossBorderTransfer.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CrossBorderTransfer[] newArray(int i) {
                return new CrossBorderTransfer[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$Me2MeTopup;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Me2MeTopup implements TransferDeeplink {
        public static final Me2MeTopup INSTANCE = new Me2MeTopup();
        public static final Parcelable.Creator<Me2MeTopup> CREATOR = new Creator();

        private Me2MeTopup() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Me2MeTopup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Me2MeTopup createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Me2MeTopup.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Me2MeTopup[] newArray(int i) {
                return new Me2MeTopup[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$PhoneTransfer;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PhoneTransfer implements TransferDeeplink {
        public static final PhoneTransfer INSTANCE = new PhoneTransfer();
        public static final Parcelable.Creator<PhoneTransfer> CREATOR = new Creator();

        private PhoneTransfer() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PhoneTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhoneTransfer createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PhoneTransfer.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhoneTransfer[] newArray(int i) {
                return new PhoneTransfer[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$RawAction;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "", "action", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/core/transfer/utils/TransferDeeplink$RawAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RawAction implements TransferDeeplink {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$RequisitesTransfer;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequisitesTransfer implements TransferDeeplink {
        public static final RequisitesTransfer INSTANCE = new RequisitesTransfer();
        public static final Parcelable.Creator<RequisitesTransfer> CREATOR = new Creator();

        private RequisitesTransfer() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RequisitesTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RequisitesTransfer createFromParcel(Parcel parcel) {
                parcel.readInt();
                return RequisitesTransfer.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RequisitesTransfer[] newArray(int i) {
                return new RequisitesTransfer[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferDeeplink$SelectTarget;", "Lcom/ybsdk/core/transfer/utils/TransferDeeplink;", "", "ybId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/core/transfer/utils/TransferDeeplink$SelectTarget;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getYbId", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectTarget implements TransferDeeplink {
        public static final Parcelable.Creator<SelectTarget> CREATOR = new Creator();
        private final String ybId;

        public SelectTarget(String str) {
            this.ybId = str;
        }

        public static /* synthetic */ SelectTarget copy$default(SelectTarget selectTarget, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectTarget.ybId;
            }
            return selectTarget.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getYbId() {
            return this.ybId;
        }

        public final SelectTarget copy(String ybId) {
            return new SelectTarget(ybId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectTarget) && jl40.l(this.ybId, ((SelectTarget) other).ybId);
        }

        public final String getYbId() {
            return this.ybId;
        }

        public int hashCode() {
            return this.ybId.hashCode();
        }

        public String toString() {
            return oyr.p("SelectTarget(ybId=", this.ybId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.ybId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectTarget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectTarget createFromParcel(Parcel parcel) {
                return new SelectTarget(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectTarget[] newArray(int i) {
                return new SelectTarget[i];
            }
        }
    }
}
