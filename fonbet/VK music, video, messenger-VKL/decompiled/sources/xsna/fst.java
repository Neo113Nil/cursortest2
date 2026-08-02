package xsna;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;

/* compiled from: GetIdListener.java */
/* loaded from: classes.dex */
public final class fst implements guk0 {
    public final TaskCompletionSource<String> a;

    public fst(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // xsna.guk0
    public final boolean a(com.google.firebase.installations.local.a aVar) {
        if (aVar.f() != PersistedInstallation.RegistrationStatus.UNREGISTERED && aVar.f() != PersistedInstallation.RegistrationStatus.REGISTERED && aVar.f() != PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
            return false;
        }
        this.a.trySetResult(aVar.b);
        return true;
    }

    @Override // xsna.guk0
    public final boolean b(Exception exc) {
        return false;
    }
}
