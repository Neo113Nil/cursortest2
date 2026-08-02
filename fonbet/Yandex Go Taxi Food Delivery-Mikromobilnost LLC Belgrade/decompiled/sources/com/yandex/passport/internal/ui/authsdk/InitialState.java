package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class InitialState extends BaseState implements Parcelable {
    public static final Parcelable.Creator<InitialState> CREATOR = new Parcelable.Creator<InitialState>() { // from class: com.yandex.passport.internal.ui.authsdk.InitialState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InitialState createFromParcel(Parcel parcel) {
            return new InitialState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InitialState[] newArray(int i) {
            return new InitialState[i];
        }
    };
    private final Uid uid;

    private InitialState(Parcel parcel) {
        super(parcel);
        this.uid = (Uid) parcel.readParcelable(Uid.class.getClassLoader());
    }

    private BaseState loadAccount(Uid uid, l lVar) {
        lVar.A.m(new k(null, 0));
        ModernAccount e = lVar.C.a().e(uid);
        if (e != null) {
            return new LoadPermissionsState(e);
        }
        lVar.e0();
        return new WaitingAccountState((Uid) null);
    }

    private BaseState loadAccounts(l lVar) {
        ArrayList f = lVar.C.a().f();
        if (f.size() == 1) {
            return new LoadPermissionsState((ModernAccount) f.get(0));
        }
        lVar.e0();
        return new WaitingAccountState(this.uid);
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public BaseState next(l lVar) {
        Uid uid = this.uid;
        return uid == null ? loadAccounts(lVar) : loadAccount(uid, lVar);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.uid, i);
    }

    public InitialState(Uid uid) {
        this.uid = uid;
    }
}
