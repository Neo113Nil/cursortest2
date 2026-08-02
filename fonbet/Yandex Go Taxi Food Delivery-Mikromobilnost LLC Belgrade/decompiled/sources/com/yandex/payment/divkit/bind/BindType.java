package com.yandex.payment.divkit.bind;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.yandex.payment.sdk.core.camerascanner.CameraCardScannerProvider;
import defpackage.cp7;
import defpackage.vv5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00072\u00020\u0001:\u0004\b\t\n\u000bR\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0003\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/payment/divkit/bind/BindType;", "Landroid/os/Parcelable;", "", "isPaymentContext", "()Z", "isNfcEnabled", "isCardScannerEnabled", "Companion", "OnlyBind", "BindAndPay", "PreselectBindAndPay", "vv5", "Lcom/yandex/payment/divkit/bind/BindType$BindAndPay;", "Lcom/yandex/payment/divkit/bind/BindType$OnlyBind;", "Lcom/yandex/payment/divkit/bind/BindType$PreselectBindAndPay;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BindType extends Parcelable {
    public static final vv5 Companion = vv5.a;

    /* renamed from: isCardScannerEnabled */
    boolean getIsCardScannerEnabled();

    /* renamed from: isNfcEnabled */
    boolean getIsNfcEnabled();

    /* renamed from: isPaymentContext */
    boolean getIsPaymentContext();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/divkit/bind/BindType$BindAndPay;", "Lcom/yandex/payment/divkit/bind/BindType;", "", "isNfcEnabled", "isPaymentContext", "isBackButtonEnabled", "shouldShowSaveCard", "isCardScannerEnabled", "<init>", "(ZZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "getShouldShowSaveCard", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BindAndPay implements BindType {
        public static final Parcelable.Creator<BindAndPay> CREATOR = new Creator();
        private final boolean isBackButtonEnabled;
        private final boolean isCardScannerEnabled;
        private final boolean isNfcEnabled;
        private final boolean isPaymentContext;
        private final boolean shouldShowSaveCard;

        public /* synthetic */ BindAndPay(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, z5);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean getShouldShowSaveCard() {
            return this.shouldShowSaveCard;
        }

        /* renamed from: isBackButtonEnabled, reason: from getter */
        public final boolean getIsBackButtonEnabled() {
            return this.isBackButtonEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isCardScannerEnabled, reason: from getter */
        public boolean getIsCardScannerEnabled() {
            return this.isCardScannerEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isNfcEnabled, reason: from getter */
        public boolean getIsNfcEnabled() {
            return this.isNfcEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isPaymentContext, reason: from getter */
        public boolean getIsPaymentContext() {
            return this.isPaymentContext;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.isNfcEnabled ? 1 : 0);
            dest.writeInt(this.isPaymentContext ? 1 : 0);
            dest.writeInt(this.isBackButtonEnabled ? 1 : 0);
            dest.writeInt(this.shouldShowSaveCard ? 1 : 0);
            dest.writeInt(this.isCardScannerEnabled ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BindAndPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BindAndPay createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z5 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z6 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new BindAndPay(z5, z6, z2, z3, z4);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BindAndPay[] newArray(int i) {
                return new BindAndPay[i];
            }
        }

        public BindAndPay(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.isNfcEnabled = z;
            this.isPaymentContext = z2;
            this.isBackButtonEnabled = z3;
            this.shouldShowSaveCard = z4;
            this.isCardScannerEnabled = z5;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010!R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010!R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010!¨\u0006\""}, d2 = {"Lcom/yandex/payment/divkit/bind/BindType$OnlyBind;", "Lcom/yandex/payment/divkit/bind/BindType;", "", "verifyCardId", "Lcom/yandex/payment/sdk/core/camerascanner/CameraCardScannerProvider;", "scannerProvider", "", "isNfcEnabled", "isPaymentContext", "isCardScannerEnabled", "<init>", "(Ljava/lang/String;Lcom/yandex/payment/sdk/core/camerascanner/CameraCardScannerProvider;ZZZ)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lcp7;", "provideScanner", "(Landroidx/fragment/app/Fragment;)Lcp7;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getVerifyCardId", "()Ljava/lang/String;", "Lcom/yandex/payment/sdk/core/camerascanner/CameraCardScannerProvider;", "getScannerProvider", "()Lcom/yandex/payment/sdk/core/camerascanner/CameraCardScannerProvider;", "Z", "()Z", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OnlyBind implements BindType {
        public static final Parcelable.Creator<OnlyBind> CREATOR = new Creator();
        private final boolean isCardScannerEnabled;
        private final boolean isNfcEnabled;
        private final boolean isPaymentContext;
        private final CameraCardScannerProvider scannerProvider;
        private final String verifyCardId;

        public /* synthetic */ OnlyBind(String str, CameraCardScannerProvider cameraCardScannerProvider, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, cameraCardScannerProvider, z, (i & 8) != 0 ? false : z2, z3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final CameraCardScannerProvider getScannerProvider() {
            return this.scannerProvider;
        }

        public final String getVerifyCardId() {
            return this.verifyCardId;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isCardScannerEnabled, reason: from getter */
        public boolean getIsCardScannerEnabled() {
            return this.isCardScannerEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isNfcEnabled, reason: from getter */
        public boolean getIsNfcEnabled() {
            return this.isNfcEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isPaymentContext, reason: from getter */
        public boolean getIsPaymentContext() {
            return this.isPaymentContext;
        }

        public final cp7 provideScanner(Fragment fragment) {
            CameraCardScannerProvider cameraCardScannerProvider = this.scannerProvider;
            if (cameraCardScannerProvider != null) {
                return CameraCardScannerProvider.provide$default(cameraCardScannerProvider, fragment, null, 2, null);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.verifyCardId);
            dest.writeParcelable(this.scannerProvider, flags);
            dest.writeInt(this.isNfcEnabled ? 1 : 0);
            dest.writeInt(this.isPaymentContext ? 1 : 0);
            dest.writeInt(this.isCardScannerEnabled ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OnlyBind> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnlyBind createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                String readString = parcel.readString();
                CameraCardScannerProvider cameraCardScannerProvider = (CameraCardScannerProvider) parcel.readParcelable(OnlyBind.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new OnlyBind(readString, cameraCardScannerProvider, z3, z4, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnlyBind[] newArray(int i) {
                return new OnlyBind[i];
            }
        }

        public OnlyBind(String str, CameraCardScannerProvider cameraCardScannerProvider, boolean z, boolean z2, boolean z3) {
            this.verifyCardId = str;
            this.scannerProvider = cameraCardScannerProvider;
            this.isNfcEnabled = z;
            this.isPaymentContext = z2;
            this.isCardScannerEnabled = z3;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/divkit/bind/BindType$PreselectBindAndPay;", "Lcom/yandex/payment/divkit/bind/BindType;", "", "isNfcEnabled", "isPaymentContext", "isBackButtonEnabled", "startPaymentAfterSelect", "isCardScannerEnabled", "<init>", "(ZZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "getStartPaymentAfterSelect", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreselectBindAndPay implements BindType {
        public static final Parcelable.Creator<PreselectBindAndPay> CREATOR = new Creator();
        private final boolean isBackButtonEnabled;
        private final boolean isCardScannerEnabled;
        private final boolean isNfcEnabled;
        private final boolean isPaymentContext;
        private final boolean startPaymentAfterSelect;

        public /* synthetic */ PreselectBindAndPay(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, z5);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean getStartPaymentAfterSelect() {
            return this.startPaymentAfterSelect;
        }

        /* renamed from: isBackButtonEnabled, reason: from getter */
        public final boolean getIsBackButtonEnabled() {
            return this.isBackButtonEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isCardScannerEnabled, reason: from getter */
        public boolean getIsCardScannerEnabled() {
            return this.isCardScannerEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isNfcEnabled, reason: from getter */
        public boolean getIsNfcEnabled() {
            return this.isNfcEnabled;
        }

        @Override // com.yandex.payment.divkit.bind.BindType
        /* renamed from: isPaymentContext, reason: from getter */
        public boolean getIsPaymentContext() {
            return this.isPaymentContext;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.isNfcEnabled ? 1 : 0);
            dest.writeInt(this.isPaymentContext ? 1 : 0);
            dest.writeInt(this.isBackButtonEnabled ? 1 : 0);
            dest.writeInt(this.startPaymentAfterSelect ? 1 : 0);
            dest.writeInt(this.isCardScannerEnabled ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PreselectBindAndPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectBindAndPay createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z5 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z6 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new PreselectBindAndPay(z5, z6, z2, z3, z4);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreselectBindAndPay[] newArray(int i) {
                return new PreselectBindAndPay[i];
            }
        }

        public PreselectBindAndPay(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.isNfcEnabled = z;
            this.isPaymentContext = z2;
            this.isBackButtonEnabled = z3;
            this.startPaymentAfterSelect = z4;
            this.isCardScannerEnabled = z5;
        }
    }
}
