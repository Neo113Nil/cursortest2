package com.yandex.payment.divkit.cvv_confirm;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments;", "Landroid/os/Parcelable;", "<init>", "()V", "ForceCvv", "Challenge", "NoPaymentChallenge", "Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments$Challenge;", "Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments$ForceCvv;", "Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments$NoPaymentChallenge;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CvvScreenArguments implements Parcelable {
    public /* synthetic */ CvvScreenArguments(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments$Challenge;", "Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments;", "", "digits", "", "cardSystem", "cardSuffix", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", CA20Status.STATUS_USER_I, "getDigits", "Ljava/lang/String;", "getCardSystem", "()Ljava/lang/String;", "getCardSuffix", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Challenge extends CvvScreenArguments {
        public static final Parcelable.Creator<Challenge> CREATOR = new Creator();
        private final String cardSuffix;
        private final String cardSystem;
        private final int digits;

        public Challenge(int i, String str, String str2) {
            super(null);
            this.digits = i;
            this.cardSystem = str;
            this.cardSuffix = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getCardSuffix() {
            return this.cardSuffix;
        }

        public final String getCardSystem() {
            return this.cardSystem;
        }

        public final int getDigits() {
            return this.digits;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.digits);
            dest.writeString(this.cardSystem);
            dest.writeString(this.cardSuffix);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Challenge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Challenge createFromParcel(Parcel parcel) {
                return new Challenge(parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Challenge[] newArray(int i) {
                return new Challenge[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments$ForceCvv;", "Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "method", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "getMethod", "()Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForceCvv extends CvvScreenArguments {
        public static final Parcelable.Creator<ForceCvv> CREATOR = new Creator();
        private final PaymentMethod.Card method;

        public ForceCvv(PaymentMethod.Card card) {
            super(null);
            this.method = card;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final PaymentMethod.Card getMethod() {
            return this.method;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.method, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ForceCvv> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForceCvv createFromParcel(Parcel parcel) {
                return new ForceCvv((PaymentMethod.Card) parcel.readParcelable(ForceCvv.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForceCvv[] newArray(int i) {
                return new ForceCvv[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments$NoPaymentChallenge;", "Lcom/yandex/payment/divkit/cvv_confirm/CvvScreenArguments;", "", "digits", "", "cardSystem", "cardSuffix", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", CA20Status.STATUS_USER_I, "getDigits", "Ljava/lang/String;", "getCardSystem", "()Ljava/lang/String;", "getCardSuffix", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoPaymentChallenge extends CvvScreenArguments {
        public static final Parcelable.Creator<NoPaymentChallenge> CREATOR = new Creator();
        private final String cardSuffix;
        private final String cardSystem;
        private final int digits;

        public NoPaymentChallenge(int i, String str, String str2) {
            super(null);
            this.digits = i;
            this.cardSystem = str;
            this.cardSuffix = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getCardSuffix() {
            return this.cardSuffix;
        }

        public final String getCardSystem() {
            return this.cardSystem;
        }

        public final int getDigits() {
            return this.digits;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.digits);
            dest.writeString(this.cardSystem);
            dest.writeString(this.cardSuffix);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoPaymentChallenge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoPaymentChallenge createFromParcel(Parcel parcel) {
                return new NoPaymentChallenge(parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoPaymentChallenge[] newArray(int i) {
                return new NoPaymentChallenge[i];
            }
        }
    }

    private CvvScreenArguments() {
    }
}
