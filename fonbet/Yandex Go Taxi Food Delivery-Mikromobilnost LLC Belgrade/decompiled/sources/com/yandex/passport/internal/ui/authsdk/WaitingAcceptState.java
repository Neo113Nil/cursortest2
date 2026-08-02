package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import defpackage.w53;

/* loaded from: classes2.dex */
class WaitingAcceptState extends BaseState implements Parcelable {
    public static final Parcelable.Creator<WaitingAcceptState> CREATOR = new Parcelable.Creator<WaitingAcceptState>() { // from class: com.yandex.passport.internal.ui.authsdk.WaitingAcceptState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WaitingAcceptState createFromParcel(Parcel parcel) {
            return new WaitingAcceptState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WaitingAcceptState[] newArray(int i) {
            return new WaitingAcceptState[i];
        }
    };
    final ModernAccount modernAccount;
    final ExternalApplicationPermissionsResult permissionsResult;

    private WaitingAcceptState(Parcel parcel) {
        super(parcel);
        this.permissionsResult = (ExternalApplicationPermissionsResult) parcel.readParcelable(ExternalApplicationPermissionsResult.class.getClassLoader());
        ModernAccount modernAccount = (ModernAccount) parcel.readParcelable(AccountRow.class.getClassLoader());
        modernAccount.getClass();
        this.modernAccount = modernAccount;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public ModernAccount getModernAccount() {
        return this.modernAccount;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public BaseState next(l lVar) {
        if (!this.permissionsResult.getIsRequireUserConfirm() && !lVar.I.getForceConfirm()) {
            return new PermissionsAcceptedState(this.permissionsResult, this.modernAccount);
        }
        lVar.A.m(new j(this.permissionsResult, this.modernAccount, 0));
        c0 c0Var = lVar.G;
        String clientId = lVar.I.getClientId();
        c0Var.getClass();
        w53 w53Var = new w53();
        w53Var.put("reporter", clientId);
        c0Var.a.a(com.yandex.passport.internal.analytics.o.d, w53Var);
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.permissionsResult, i);
        parcel.writeParcelable(this.modernAccount, i);
    }

    public WaitingAcceptState(ExternalApplicationPermissionsResult externalApplicationPermissionsResult, ModernAccount modernAccount) {
        this.permissionsResult = externalApplicationPermissionsResult;
        this.modernAccount = modernAccount;
    }
}
