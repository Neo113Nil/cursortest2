package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class na51 {
    public final kuy a(Context context, String str, WorkerParameters workerParameters) {
        String str2;
        String str3;
        try {
            try {
                kuy kuyVar = (kuy) Class.forName(str).asSubclass(kuy.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                if (!kuyVar.isUsed()) {
                    return kuyVar;
                }
                w511.m("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
                return null;
            } catch (Throwable th) {
                hgz g = hgz.g();
                str3 = oa51.a;
                g.f(str3, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            hgz g2 = hgz.g();
            str2 = oa51.a;
            g2.f(str2, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }
}
