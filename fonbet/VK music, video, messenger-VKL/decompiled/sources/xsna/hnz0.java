package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class hnz0 extends zmz0 implements c.b, c.InterfaceC0114c {
    public static final pkz0 j = snz0.a;
    public final Context a;
    public final Handler b;
    public final pkz0 e = j;
    public final Set f;
    public final olc g;
    public znz0 h;
    public kmz0 i;

    public hnz0(Context context, Handler handler, @NonNull olc olcVar) {
        this.a = context;
        this.b = handler;
        this.g = olcVar;
        this.f = olcVar.b;
    }

    public final void H1(kmz0 kmz0Var) {
        znz0 znz0Var = this.h;
        if (znz0Var != null) {
            znz0Var.disconnect();
        }
        Integer valueOf = Integer.valueOf(System.identityHashCode(this));
        olc olcVar = this.g;
        olcVar.h = valueOf;
        Handler handler = this.b;
        this.h = (znz0) this.e.buildClient(this.a, handler.getLooper(), olcVar, (Object) olcVar.g, (c.b) this, (c.InterfaceC0114c) this);
        this.i = kmz0Var;
        Set set = this.f;
        if (set == null || set.isEmpty()) {
            handler.post(new way0(this, 1));
        } else {
            this.h.l();
        }
    }

    public final void I1() {
        znz0 znz0Var = this.h;
        if (znz0Var != null) {
            znz0Var.disconnect();
        }
    }

    @Override // xsna.aoz0
    public final void V(com.google.android.gms.signin.internal.zak zakVar) {
        this.b.post(new cvy0(1, this, zakVar));
    }

    @Override // xsna.x3j
    public final void f(@Nullable Bundle bundle) {
        this.h.c(this);
    }

    @Override // xsna.i380
    public final void g(@NonNull ConnectionResult connectionResult) {
        this.i.b(connectionResult);
    }

    @Override // xsna.x3j
    public final void onConnectionSuspended(int i) {
        kmz0 kmz0Var = this.i;
        hmz0 hmz0Var = (hmz0) kmz0Var.f.k.get(kmz0Var.b);
        if (hmz0Var != null) {
            if (hmz0Var.k) {
                hmz0Var.n(new ConnectionResult(17));
            } else {
                hmz0Var.onConnectionSuspended(i);
            }
        }
    }
}
