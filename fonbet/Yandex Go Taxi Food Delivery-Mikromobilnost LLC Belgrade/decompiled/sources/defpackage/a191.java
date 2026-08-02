package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbs;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class a191 extends ukt {
    public final GoogleSignInOptions a0;

    public a191(Context context, Looper looper, y2c y2cVar, GoogleSignInOptions googleSignInOptions, wst wstVar, xst xstVar) {
        super(context, looper, 91, y2cVar, wstVar, xstVar);
        Set<Scope> set = y2cVar.b;
        GoogleSignInOptions.a aVar = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar.i = r091.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.a0 = aVar.a();
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof zbs ? (zbs) queryLocalInterface : new zbs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final Intent getSignInIntent() {
        return f191.a(this.A, this.a0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
