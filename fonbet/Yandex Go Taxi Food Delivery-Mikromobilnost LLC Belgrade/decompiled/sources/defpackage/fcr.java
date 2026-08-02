package defpackage;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.a;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class fcr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ fcr(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        w0b0 c;
        w0b0 f;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.a();
                return;
            case 1:
                aVar.a();
                return;
            default:
                Object obj = a.m;
                synchronized (obj) {
                    try {
                        com.google.firebase.a aVar2 = aVar.a;
                        aVar2.a();
                        lb7 j = lb7.j(aVar2.a);
                        try {
                            c = aVar.c.c();
                            if (j != null) {
                                j.w();
                            }
                        } catch (Throwable th) {
                            if (j != null) {
                                j.w();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    PersistedInstallation$RegistrationStatus f2 = c.f();
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = PersistedInstallation$RegistrationStatus.REGISTER_ERROR;
                    if (!(f2 == persistedInstallation$RegistrationStatus)) {
                        if (!(c.f() == PersistedInstallation$RegistrationStatus.UNREGISTERED)) {
                            if (aVar.d.a(c)) {
                                f = aVar.b(c);
                                synchronized (obj) {
                                    try {
                                        com.google.firebase.a aVar3 = aVar.a;
                                        aVar3.a();
                                        lb7 j2 = lb7.j(aVar3.a);
                                        try {
                                            aVar.c.b(f);
                                            if (j2 != null) {
                                                j2.w();
                                            }
                                        } catch (Throwable th2) {
                                            if (j2 != null) {
                                                j2.w();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (aVar) {
                                    try {
                                        if (aVar.k.size() != 0 && !TextUtils.equals(((u74) c).b, ((u74) f).b)) {
                                            Iterator it = aVar.k.iterator();
                                            if (it.hasNext()) {
                                                if (it.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (f.f() == PersistedInstallation$RegistrationStatus.REGISTERED) {
                                    String str = ((u74) f).b;
                                    synchronized (aVar) {
                                        aVar.j = str;
                                    }
                                }
                                if (f.f() == persistedInstallation$RegistrationStatus) {
                                    aVar.g(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
                                    return;
                                } else if (f.f() == PersistedInstallation$RegistrationStatus.NOT_GENERATED || f.f() == PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION) {
                                    aVar.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    aVar.h(f);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    f = aVar.f(c);
                    synchronized (obj) {
                    }
                } catch (FirebaseInstallationsException e) {
                    aVar.g(e);
                    return;
                }
                break;
        }
    }
}
