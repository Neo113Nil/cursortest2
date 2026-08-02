package xsna;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: WorkerFactory.kt */
/* loaded from: classes.dex */
public abstract class iyx0 {
    public final androidx.work.b a(Context context, String str, WorkerParameters workerParameters) {
        String str2;
        String str3;
        try {
            try {
                androidx.work.b bVar = (androidx.work.b) Class.forName(str).asSubclass(androidx.work.b.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                if (!bVar.isUsed()) {
                    return bVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                m100 c = m100.c();
                str3 = jyx0.a;
                c.b(str3, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            m100 c2 = m100.c();
            str2 = jyx0.a;
            c2.b(str2, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }
}
