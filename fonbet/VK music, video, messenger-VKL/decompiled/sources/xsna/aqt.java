package xsna;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;
import xsna.xm5;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes.dex */
public final class aqt implements guk0 {
    public final h3r0 a;
    public final TaskCompletionSource<k6x> b;

    public aqt(h3r0 h3r0Var, TaskCompletionSource<k6x> taskCompletionSource) {
        this.a = h3r0Var;
        this.b = taskCompletionSource;
    }

    @Override // xsna.guk0
    public final boolean a(com.google.firebase.installations.local.a aVar) {
        if (aVar.f() != PersistedInstallation.RegistrationStatus.REGISTERED || this.a.a(aVar)) {
            return false;
        }
        xm5.a a = k6x.a();
        a.b(aVar.d);
        a.d(aVar.f);
        a.c(aVar.g);
        this.b.setResult(a.a());
        return true;
    }

    @Override // xsna.guk0
    public final boolean b(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }
}
