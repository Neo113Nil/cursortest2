package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes.dex */
public final class d5k {
    public final Context a;
    public final wtk b;
    public final y380 c;
    public final long d;
    public e5k e;
    public e5k f;
    public boolean g;
    public u4k h;
    public final isv i;
    public final sar j;
    public final lx1 k;
    public final mx1 l;
    public final n4k m;
    public final h5k n;
    public final zuf0 o;
    public final g6k p;

    public d5k(vhr vhrVar, isv isvVar, h5k h5kVar, wtk wtkVar, lx1 lx1Var, mx1 mx1Var, sar sarVar, n4k n4kVar, zuf0 zuf0Var, g6k g6kVar) {
        this.b = wtkVar;
        vhrVar.a();
        this.a = vhrVar.a;
        this.i = isvVar;
        this.n = h5kVar;
        this.k = lx1Var;
        this.l = mx1Var;
        this.j = sarVar;
        this.m = n4kVar;
        this.o = zuf0Var;
        this.p = g6kVar;
        this.d = System.currentTimeMillis();
        this.c = new y380(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.b5k] */
    public final void a(k1j0 k1j0Var) {
        g6k.a();
        g6k.a();
        this.e.a();
        try {
            try {
                this.k.a(new bb8() { // from class: xsna.b5k
                    @Override // xsna.bb8
                    public final void a(String str) {
                        long currentTimeMillis = System.currentTimeMillis();
                        d5k d5kVar = d5k.this;
                        d5kVar.p.a.a(new a5k(d5kVar, currentTimeMillis - d5kVar.d, str));
                    }
                });
                this.h.g();
            } finally {
                c();
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
        }
        if (!k1j0Var.b().b.a) {
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        }
        u4k u4kVar = this.h;
        u4kVar.getClass();
        g6k.a();
        y5k y5kVar = u4kVar.n;
        if (!(y5kVar != null && y5kVar.d.get())) {
            try {
                u4kVar.b(true, k1j0Var, true);
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e2);
            }
        }
        this.h.h(k1j0Var.i.get().getTask());
    }

    public final void b(k1j0 k1j0Var) {
        try {
            this.p.a.b.submit(new qo2(3, this, k1j0Var)).get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        g6k.a();
        try {
            e5k e5kVar = this.e;
            sar sarVar = e5kVar.b;
            String str = e5kVar.a;
            sarVar.getClass();
            new File(sarVar.c, str).delete();
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public final void d(@Nullable Boolean bool) {
        Boolean a;
        wtk wtkVar = this.b;
        synchronized (wtkVar) {
            if (bool != null) {
                a = bool;
            } else {
                vhr vhrVar = wtkVar.b;
                vhrVar.a();
                a = wtkVar.a(vhrVar.a);
            }
            wtkVar.f = a;
            SharedPreferences.Editor edit = wtkVar.a.edit();
            if (bool != null) {
                edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                edit.remove("firebase_crashlytics_collection_enabled");
            }
            edit.apply();
            synchronized (wtkVar.c) {
                try {
                    if (wtkVar.b()) {
                        if (!wtkVar.e) {
                            wtkVar.d.trySetResult(null);
                            wtkVar.e = true;
                        }
                    } else if (wtkVar.e) {
                        wtkVar.d = new TaskCompletionSource<>();
                        wtkVar.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void e(final String str, final String str2) {
        this.p.a.a(new Runnable() { // from class: xsna.y4k
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                String str4 = str2;
                u4k u4kVar = d5k.this.h;
                u4kVar.getClass();
                try {
                    u4kVar.d.d.a(str3, str4);
                } catch (IllegalArgumentException e) {
                    Context context = u4kVar.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
            }
        });
    }
}
