package com.ybsdk.feature.transfer.version2.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult", "Landroid/os/Parcelable;", "<init>", "()V", "Cancel", "VerificationToken", "Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult$Cancel;", "Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult$VerificationToken;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TransferTwoFactorScreenProvider$TwoFactorResult implements Parcelable {
    public /* synthetic */ TransferTwoFactorScreenProvider$TwoFactorResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult$Cancel;", "Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cancel extends TransferTwoFactorScreenProvider$TwoFactorResult {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        private Cancel() {
            super(null);
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
        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cancel.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult$VerificationToken;", "Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult;", "", "verificationToken", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferTwoFactorScreenProvider$TwoFactorResult$VerificationToken;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVerificationToken", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VerificationToken extends TransferTwoFactorScreenProvider$TwoFactorResult {
        public static final Parcelable.Creator<VerificationToken> CREATOR = new Creator();
        private final String verificationToken;

        public VerificationToken(String str) {
            super(null);
            this.verificationToken = str;
        }

        public static /* synthetic */ VerificationToken copy$default(VerificationToken verificationToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verificationToken.verificationToken;
            }
            return verificationToken.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public final VerificationToken copy(String verificationToken) {
            return new VerificationToken(verificationToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerificationToken) && jl40.l(this.verificationToken, ((VerificationToken) other).verificationToken);
        }

        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public int hashCode() {
            return this.verificationToken.hashCode();
        }

        public String toString() {
            return oyr.p("VerificationToken(verificationToken=", this.verificationToken, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.verificationToken);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationToken createFromParcel(Parcel parcel) {
                return new VerificationToken(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationToken[] newArray(int i) {
                return new VerificationToken[i];
            }
        }
    }

    private TransferTwoFactorScreenProvider$TwoFactorResult() {
    }
}
