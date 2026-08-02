package xsna;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes.dex */
public final class k1j0 {
    public final Context a;
    public final k3j0 b;
    public final t2j0 c;
    public final ozg0 d;
    public final ny8 e;
    public final o04 f;
    public final wtk g;
    public final AtomicReference<d0j0> h;
    public final AtomicReference<TaskCompletionSource<d0j0>> i;

    public k1j0(Context context, k3j0 k3j0Var, ozg0 ozg0Var, t2j0 t2j0Var, ny8 ny8Var, o04 o04Var, wtk wtkVar) {
        AtomicReference<d0j0> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.b = k3j0Var;
        this.d = ozg0Var;
        this.c = t2j0Var;
        this.e = ny8Var;
        this.f = o04Var;
        this.g = wtkVar;
        atomicReference.set(kml.b(ozg0Var));
    }

    public final d0j0 a(a1j0 a1j0Var) {
        JSONObject b;
        try {
            if (!a1j0.SKIP_CACHE_LOOKUP.equals(a1j0Var) && (b = this.e.b()) != null) {
                d0j0 a = this.c.a(b);
                b.toString();
                this.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (a1j0.IGNORE_CACHE_EXPIRATION.equals(a1j0Var)) {
                    return a;
                }
                if (a.c >= currentTimeMillis) {
                    return a;
                }
            }
            return null;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
            return null;
        }
    }

    public final d0j0 b() {
        return this.h.get();
    }
}
