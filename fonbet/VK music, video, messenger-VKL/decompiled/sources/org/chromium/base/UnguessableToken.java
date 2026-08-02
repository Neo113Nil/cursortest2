package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes8.dex */
public final class UnguessableToken extends TokenBase implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new Parcelable.Creator<UnguessableToken>() { // from class: org.chromium.base.UnguessableToken.1
        @Override // android.os.Parcelable.Creator
        public UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new UnguessableToken(readLong, readLong2, 0);
        }

        @Override // android.os.Parcelable.Creator
        public UnguessableToken[] newArray(int i) {
            return new UnguessableToken[i];
        }
    };
    private static int sCounterForTesting;

    public /* synthetic */ UnguessableToken(long j, long j2, int i) {
        this(j, j2);
    }

    public static UnguessableToken createForTesting() {
        int i = sCounterForTesting;
        long j = i + 1;
        int i2 = i + 2;
        sCounterForTesting = i2;
        return new UnguessableToken(j, i2);
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getHighForTesting() {
        return this.mHigh;
    }

    public long getLowForTesting() {
        return this.mLow;
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mHigh);
        parcel.writeLong(this.mLow);
    }

    @CalledByNative
    private UnguessableToken(long j, long j2) {
        super(j, j2);
    }
}
