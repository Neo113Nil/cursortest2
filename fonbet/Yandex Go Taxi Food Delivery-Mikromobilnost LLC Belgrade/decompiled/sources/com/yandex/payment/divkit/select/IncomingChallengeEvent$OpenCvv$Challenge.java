package com.yandex.payment.divkit.select;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.xpv;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"com/yandex/payment/divkit/select/IncomingChallengeEvent$OpenCvv$Challenge", "Lxpv;", "Landroid/os/Parcelable;", "", "digits", "", "cardSystem", "cardSuffix", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", CA20Status.STATUS_USER_I, "getDigits", "Ljava/lang/String;", "getCardSystem", "()Ljava/lang/String;", "getCardSuffix", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IncomingChallengeEvent$OpenCvv$Challenge extends xpv implements Parcelable {
    public static final Parcelable.Creator<IncomingChallengeEvent$OpenCvv$Challenge> CREATOR = new Creator();
    private final String cardSuffix;
    private final String cardSystem;
    private final int digits;

    public IncomingChallengeEvent$OpenCvv$Challenge(int i, String str, String str2) {
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
    public static final class Creator implements Parcelable.Creator<IncomingChallengeEvent$OpenCvv$Challenge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IncomingChallengeEvent$OpenCvv$Challenge createFromParcel(Parcel parcel) {
            return new IncomingChallengeEvent$OpenCvv$Challenge(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IncomingChallengeEvent$OpenCvv$Challenge[] newArray(int i) {
            return new IncomingChallengeEvent$OpenCvv$Challenge[i];
        }
    }
}
