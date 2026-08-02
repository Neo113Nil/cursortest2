package xsna;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class goz0 extends onz0 {
    public final bnz0 c;

    public goz0(bnz0 bnz0Var, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.c = bnz0Var;
    }

    @Override // xsna.tmz0
    @Nullable
    public final Feature[] f(hmz0 hmz0Var) {
        return this.c.a.b;
    }

    @Override // xsna.tmz0
    public final boolean g(hmz0 hmz0Var) {
        return this.c.a.c;
    }

    @Override // xsna.tmz0
    public final int h(hmz0 hmz0Var) {
        return this.c.a.d;
    }

    @Override // xsna.onz0
    public final void i(hmz0 hmz0Var) throws RemoteException {
        bnz0 bnz0Var = this.c;
        eqf0 eqf0Var = bnz0Var.a;
        eqf0Var.c(hmz0Var.b, this.b);
        ehz.a aVar = eqf0Var.a.b;
        if (aVar != null) {
            hmz0Var.h.put(aVar, bnz0Var);
        }
    }

    @Override // xsna.qoz0
    public final /* bridge */ /* synthetic */ void c(@NonNull qkz0 qkz0Var, boolean z) {
    }
}
