package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.p000authapi.zbat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class uqz0 extends u2u {
    public final GoogleSignInOptions b;

    public uqz0(Context context, Looper looper, olc olcVar, @Nullable GoogleSignInOptions googleSignInOptions, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 91, olcVar, bVar, interfaceC0114c);
        GoogleSignInOptions.a aVar;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
            aVar.a = new HashSet(googleSignInOptions.c);
            aVar.b = googleSignInOptions.f;
            aVar.c = googleSignInOptions.g;
            aVar.d = googleSignInOptions.e;
            aVar.e = googleSignInOptions.h;
            aVar.f = googleSignInOptions.d;
            aVar.g = googleSignInOptions.i;
            aVar.h = GoogleSignInOptions.i(googleSignInOptions.j);
            aVar.i = googleSignInOptions.k;
        } else {
            aVar = new GoogleSignInOptions.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
        }
        aVar.i = zbat.zba();
        if (!olcVar.c.isEmpty()) {
            for (Scope scope : olcVar.c) {
                HashSet hashSet = aVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.a;
        if (hashSet2.contains(GoogleSignInOptions.p)) {
            Scope scope2 = GoogleSignInOptions.o;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f == null || !hashSet2.isEmpty())) {
            aVar.a.add(GoogleSignInOptions.n);
        }
        this.b = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f, aVar.d, aVar.b, aVar.c, aVar.e, aVar.g, aVar.h, aVar.i);
    }

    @Override // xsna.rd6
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof nrz0 ? (nrz0) queryLocalInterface : new nrz0(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final Intent getSignInIntent() {
        return grz0.a(getContext(), this.b);
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final boolean providesSignIn() {
        return true;
    }
}
