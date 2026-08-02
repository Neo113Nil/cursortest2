package xsna;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class noz0 extends onz0 {
    public final ehz.a c;

    public noz0(ehz.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = aVar;
    }

    @Override // xsna.tmz0
    @Nullable
    public final Feature[] f(hmz0 hmz0Var) {
        bnz0 bnz0Var = (bnz0) hmz0Var.h.get(this.c);
        if (bnz0Var == null) {
            return null;
        }
        return bnz0Var.a.b;
    }

    @Override // xsna.tmz0
    public final boolean g(hmz0 hmz0Var) {
        bnz0 bnz0Var = (bnz0) hmz0Var.h.get(this.c);
        return bnz0Var != null && bnz0Var.a.c;
    }

    @Override // xsna.tmz0
    public final int h(hmz0 hmz0Var) {
        bnz0 bnz0Var = (bnz0) hmz0Var.h.get(this.c);
        if (bnz0Var != null) {
            return bnz0Var.a.d;
        }
        return -1;
    }

    @Override // xsna.onz0
    public final void i(hmz0 hmz0Var) throws RemoteException {
        bnz0 bnz0Var = (bnz0) hmz0Var.h.remove(this.c);
        if (bnz0Var == null) {
            this.b.trySetResult(Boolean.FALSE);
            return;
        }
        ((dnz0) bnz0Var.b).b.b.accept(hmz0Var.b, this.b);
        bnz0Var.a.a.b = null;
    }

    @Override // xsna.qoz0
    public final /* bridge */ /* synthetic */ void c(@NonNull qkz0 qkz0Var, boolean z) {
    }
}
