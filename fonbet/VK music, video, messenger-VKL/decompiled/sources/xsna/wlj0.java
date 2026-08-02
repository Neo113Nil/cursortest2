package xsna;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes13.dex */
public final class wlj0 extends u2u<foz0> implements znz0 {
    public static final /* synthetic */ int f = 0;
    public final boolean b;
    public final olc c;
    public final Bundle d;

    @Nullable
    public final Integer e;

    public wlj0(@NonNull Context context, @NonNull Looper looper, @NonNull olc olcVar, @NonNull Bundle bundle, @NonNull c.b bVar, @NonNull c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 44, olcVar, bVar, interfaceC0114c);
        this.b = true;
        this.c = olcVar;
        this.d = bundle;
        this.e = olcVar.h;
    }

    @NonNull
    public static Bundle b(@NonNull olc olcVar) {
        olcVar.getClass();
        Integer num = olcVar.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", olcVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.znz0
    public final void a(@NonNull com.google.android.gms.common.internal.b bVar, boolean z) {
        try {
            foz0 foz0Var = (foz0) getService();
            Integer num = this.e;
            exc0.i(num);
            int intValue = num.intValue();
            Parcel zaa = foz0Var.zaa();
            com.google.android.gms.internal.base.zac.zac(zaa, bVar);
            zaa.writeInt(intValue);
            zaa.writeInt(z ? 1 : 0);
            foz0Var.zac(9, zaa);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.znz0
    public final void c(zmz0 zmz0Var) {
        try {
            Account account = this.c.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? lgl0.a(getContext()).b() : null;
            Integer num = this.e;
            exc0.i(num);
            com.google.android.gms.common.internal.zay zayVar = new com.google.android.gms.common.internal.zay(account, num.intValue(), b);
            foz0 foz0Var = (foz0) getService();
            com.google.android.gms.signin.internal.zai zaiVar = new com.google.android.gms.signin.internal.zai(1, zayVar);
            Parcel zaa = foz0Var.zaa();
            com.google.android.gms.internal.base.zac.zab(zaa, zaiVar);
            com.google.android.gms.internal.base.zac.zac(zaa, zmz0Var);
            foz0Var.zac(12, zaa);
        } catch (RemoteException e) {
            try {
                zmz0Var.V(new com.google.android.gms.signin.internal.zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // xsna.rd6
    @NonNull
    public final IInterface createServiceInterface(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof foz0 ? (foz0) queryLocalInterface : new foz0(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // xsna.rd6
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        olc olcVar = this.c;
        boolean equals = getContext().getPackageName().equals(olcVar.e);
        Bundle bundle = this.d;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", olcVar.e);
        }
        return bundle;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // xsna.rd6
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // xsna.znz0
    public final void l() {
        connect(new rd6.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.znz0
    public final void m() {
        try {
            foz0 foz0Var = (foz0) getService();
            Integer num = this.e;
            exc0.i(num);
            int intValue = num.intValue();
            Parcel zaa = foz0Var.zaa();
            zaa.writeInt(intValue);
            foz0Var.zac(7, zaa);
        } catch (RemoteException unused) {
        }
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.b;
    }
}
