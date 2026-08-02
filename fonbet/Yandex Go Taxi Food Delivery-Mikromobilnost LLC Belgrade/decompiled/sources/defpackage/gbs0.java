package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes11.dex */
public final class gbs0 extends ukt implements kz81 {
    public final boolean a0;
    public final y2c b0;
    public final Bundle c0;
    public final Integer d0;

    public gbs0(Context context, Looper looper, y2c y2cVar, Bundle bundle, wst wstVar, xst xstVar) {
        super(context, looper, 44, y2cVar, wstVar, xstVar);
        this.a0 = true;
        this.b0 = y2cVar;
        this.c0 = bundle;
        this.d0 = y2cVar.g;
    }

    @Override // defpackage.kz81
    public final void a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            zaf zafVar = (zaf) i();
            Integer num = this.d0;
            cvw.l(num);
            zafVar.zaf(iAccountAccessor, num.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.kz81
    public final void b(zac zacVar) {
        try {
            this.b0.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? yiu0.a(this.A).b() : null;
            Integer num = this.d0;
            cvw.l(num);
            ((zaf) i()).zag(new zai(1, new zat(account, num.intValue(), b)), zacVar);
        } catch (RemoteException e) {
            try {
                zacVar.zab(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle g() {
        y2c y2cVar = this.b0;
        boolean equals = this.A.getPackageName().equals(y2cVar.d);
        Bundle bundle = this.c0;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", y2cVar.d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final boolean requiresSignIn() {
        return this.a0;
    }

    @Override // defpackage.kz81
    public final void zaa() {
        try {
            zaf zafVar = (zaf) i();
            Integer num = this.d0;
            cvw.l(num);
            zafVar.zae(num.intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.kz81
    public final void zab() {
        connect(new c25(this));
    }
}
