package xsna;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.vk.log.L;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FirebaseLogTarget.kt */
/* loaded from: classes3.dex */
public final class wir extends u000 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public wir() {
        rhr.a(new o1e(this, 22));
    }

    @Override // xsna.u000
    public final void b(L.LogType logType, String str, String str2, boolean z) {
        L.a.getClass();
        if (L.b.contains(logType)) {
            lb6 lb6Var = new lb6(this, str, str2);
            FirebaseCrashlytics firebaseCrashlytics = null;
            try {
                if (rhr.c()) {
                    firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                }
            } catch (RuntimeException e) {
                L.i(e);
            }
            if (firebaseCrashlytics != null) {
                lb6Var.invoke();
            } else {
                this.a.add(lb6Var);
            }
        }
    }
}
