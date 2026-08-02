package xsna;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public abstract class irz0 extends com.google.android.gms.internal.p000authapi.zbb {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        BasePendingResult b;
        String e;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            prz0 prz0Var = (prz0) this;
            prz0Var.f();
            hrz0.a(prz0Var.a).b();
            return true;
        }
        prz0 prz0Var2 = (prz0) this;
        prz0Var2.f();
        RevocationBoundService revocationBoundService = prz0Var2.a;
        lgl0 a = lgl0.a(revocationBoundService);
        GoogleSignInAccount b2 = a.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.m;
        if (b2 != null) {
            String e2 = a.e("defaultGoogleSignInAccount");
            if (!TextUtils.isEmpty(e2) && (e = a.e(lgl0.f("googleSignInOptions", e2))) != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.b(e);
                } catch (JSONException unused) {
                }
            }
            googleSignInOptions = null;
        }
        exc0.i(googleSignInOptions);
        hau hauVar = new hau(revocationBoundService, l15.a, googleSignInOptions, new b.a(new dy2(), Looper.getMainLooper()));
        if (b2 != null) {
            com.google.android.gms.common.api.c asGoogleApiClient = hauVar.asGoogleApiClient();
            Context applicationContext = hauVar.getApplicationContext();
            boolean z = hauVar.a() == 3;
            grz0.a.a("Revoking access", new Object[0]);
            String e3 = lgl0.a(applicationContext).e("refreshToken");
            grz0.b(applicationContext);
            if (!z) {
                b = asGoogleApiClient.b(new crz0(asGoogleApiClient));
            } else if (e3 == null) {
                p100 p100Var = nqz0.d;
                Status status = new Status(4);
                exc0.a("Status code must not be SUCCESS", !status.i());
                b = new nnz0(null, status);
                b.setResult(status);
            } else {
                nqz0 nqz0Var = new nqz0(e3);
                new Thread(nqz0Var).start();
                b = nqz0Var.c;
            }
            dv90.a(b, new cqz0());
        } else {
            com.google.android.gms.common.api.c asGoogleApiClient2 = hauVar.asGoogleApiClient();
            Context applicationContext2 = hauVar.getApplicationContext();
            boolean z2 = hauVar.a() == 3;
            grz0.a.a("Signing out", new Object[0]);
            grz0.b(applicationContext2);
            dv90.a(z2 ? xo9.p(Status.f, asGoogleApiClient2) : asGoogleApiClient2.b(new zqz0(asGoogleApiClient2)), new cqz0());
        }
        return true;
    }
}
