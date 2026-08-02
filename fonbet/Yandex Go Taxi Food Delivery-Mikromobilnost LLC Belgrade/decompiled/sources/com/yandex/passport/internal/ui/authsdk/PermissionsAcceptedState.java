package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.JwtToken;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import com.yandex.passport.internal.network.response.LoginSdkResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class PermissionsAcceptedState extends BaseState implements Parcelable {
    public static final Parcelable.Creator<PermissionsAcceptedState> CREATOR = new Parcelable.Creator<PermissionsAcceptedState>() { // from class: com.yandex.passport.internal.ui.authsdk.PermissionsAcceptedState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionsAcceptedState createFromParcel(Parcel parcel) {
            return new PermissionsAcceptedState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionsAcceptedState[] newArray(int i) {
            return new PermissionsAcceptedState[i];
        }
    };
    private final ModernAccount account;
    private final ExternalApplicationPermissionsResult permissionsResult;

    private PermissionsAcceptedState(Parcel parcel) {
        super(parcel);
        this.permissionsResult = (ExternalApplicationPermissionsResult) parcel.readParcelable(ExternalApplicationPermissionsResult.class.getClassLoader());
        ModernAccount modernAccount = (ModernAccount) parcel.readParcelable(AccountRow.class.getClassLoader());
        modernAccount.getClass();
        this.account = modernAccount;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public ModernAccount getModernAccount() {
        return this.account;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.BaseState
    public BaseState next(l lVar) {
        try {
            com.yandex.passport.internal.network.client.a a0 = lVar.a0();
            AuthSdkProperties authSdkProperties = lVar.I;
            LoginSdkResult b = a0.b(this.account.getMasterToken(), this.permissionsResult.getRequestId());
            JwtToken i = (!authSdkProperties.isTurboApp() || b.getAccessToken() == null) ? null : lVar.a0().i(b.getAccessToken());
            n nVar = AuthSdkResultContainer.Companion;
            Uid uid = this.account.getUid();
            String clientId = authSdkProperties.getClientId();
            List<ExternalApplicationPermissionsResult.Scope> alreadyGrantedScopes = this.permissionsResult.getAlreadyGrantedScopes();
            List<ExternalApplicationPermissionsResult.Scope> requestedScopes = this.permissionsResult.getRequestedScopes();
            nVar.getClass();
            return new ResultState(new AuthSdkResultContainer(b, uid, clientId, i, new ArrayList(kotlin.collections.a.I(kotlin.collections.a.m0(o.a(requestedScopes), o.a(alreadyGrantedScopes))))));
        } catch (Exception e) {
            lVar.c0(e, this.account);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.permissionsResult, i);
        parcel.writeParcelable(this.account, i);
    }

    public PermissionsAcceptedState(ExternalApplicationPermissionsResult externalApplicationPermissionsResult, ModernAccount modernAccount) {
        this.permissionsResult = externalApplicationPermissionsResult;
        this.account = modernAccount;
    }
}
