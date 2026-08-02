package xsna;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class q4k {
    public final /* synthetic */ u4k a;

    public q4k(u4k u4kVar) {
        this.a = u4kVar;
    }

    public final void a(@NonNull k1j0 k1j0Var, @NonNull Thread thread, @NonNull Throwable th) {
        Task continueWithTask;
        u4k u4kVar = this.a;
        synchronized (u4kVar) {
            Objects.toString(th);
            thread.getName();
            long currentTimeMillis = System.currentTimeMillis();
            z5k z5kVar = u4kVar.e.a;
            s4k s4kVar = new s4k(u4kVar, currentTimeMillis, th, thread, k1j0Var);
            synchronized (z5kVar.c) {
                continueWithTask = z5kVar.d.continueWithTask(z5kVar.b, new com.vk.movika.sdk.base.hooks.f(s4kVar, 15));
                z5kVar.d = continueWithTask;
            }
            try {
                try {
                    g3r0.a(continueWithTask);
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }
}
