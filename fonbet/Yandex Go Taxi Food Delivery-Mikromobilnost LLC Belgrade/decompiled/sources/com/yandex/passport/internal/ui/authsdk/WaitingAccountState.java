package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
class WaitingAccountState extends BaseState implements Parcelable {
    public static final Parcelable.Creator<WaitingAccountState> CREATOR = new Parcelable.Creator<WaitingAccountState>() { // from class: com.yandex.passport.internal.ui.authsdk.WaitingAccountState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WaitingAccountState createFromParcel(Parcel parcel) {
            return new WaitingAccountState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WaitingAccountState[] newArray(int i) {
            return new WaitingAccountState[i];
        }
    };
    final boolean isReLoginRequired;
    final Uid uid;

    private WaitingAccountState(Parcel parcel) {
        super(parcel);
        this.uid = (Uid) parcel.readParcelable(Uid.class.getClassLoader());
        this.isReLoginRequired = parcel.readByte() != 0;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public BaseState next(l lVar) {
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.uid, i);
        parcel.writeByte(this.isReLoginRequired ? (byte) 1 : (byte) 0);
    }

    public WaitingAccountState(Uid uid) {
        this(uid, false);
    }

    public WaitingAccountState(Uid uid, boolean z) {
        this.uid = uid;
        this.isReLoginRequired = z;
    }
}
