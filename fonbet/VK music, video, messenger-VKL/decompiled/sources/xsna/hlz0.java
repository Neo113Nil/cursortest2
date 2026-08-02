package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class hlz0 implements c.b, c.InterfaceC0114c {
    public final /* synthetic */ jlz0 a;

    public /* synthetic */ hlz0(jlz0 jlz0Var) {
        this.a = jlz0Var;
    }

    @Override // xsna.x3j
    public final void f(@Nullable Bundle bundle) {
        jlz0 jlz0Var = this.a;
        exc0.i(jlz0Var.r);
        znz0 znz0Var = jlz0Var.k;
        exc0.i(znz0Var);
        znz0Var.c(new glz0(jlz0Var));
    }

    @Override // xsna.i380
    public final void g(@NonNull ConnectionResult connectionResult) {
        jlz0 jlz0Var = this.a;
        Lock lock = jlz0Var.b;
        Lock lock2 = jlz0Var.b;
        lock.lock();
        try {
            if (jlz0Var.l && !connectionResult.i()) {
                jlz0Var.d();
                jlz0Var.a();
            } else {
                jlz0Var.e(connectionResult);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    @Override // xsna.x3j
    public final void onConnectionSuspended(int i) {
    }
}
