package xsna;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;
import xsna.h6k;
import xsna.hq;
import xsna.mti0;
import xsna.oir;
import xsna.sar;
import xsna.wn5;

/* compiled from: FirebaseCrashlyticsNdk.java */
/* loaded from: classes13.dex */
public final class oir implements f5k {
    public final h6k a;
    public final boolean b;
    public String c;

    public oir(@NonNull h6k h6kVar, boolean z) {
        this.a = h6kVar;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.firebase.crashlytics.ndk.b] */
    @Override // xsna.f5k
    public final synchronized void a(@NonNull final String str, final long j, @NonNull final wn5 wn5Var) {
        try {
            try {
                this.c = str;
                ?? r0 = new Object() { // from class: com.google.firebase.crashlytics.ndk.b
                    public final void a() {
                        long j2 = j;
                        wn5 wn5Var2 = wn5Var;
                        h6k h6kVar = oir.this.a;
                        sar sarVar = h6kVar.c;
                        String str2 = str;
                        try {
                            String canonicalPath = sarVar.b(str2).getCanonicalPath();
                            if (((JniNativeApi) h6kVar.b).b(h6kVar.a.getAssets(), canonicalPath)) {
                                h6kVar.getClass();
                                HashMap a = hq.a("session_id", str2, "generator", "Crashlytics Android SDK/19.4.4");
                                a.put("started_at_seconds", Long.valueOf(j2));
                                h6k.f(h6kVar.c, str2, new JSONObject(a).toString(), "session.json");
                                h6kVar.d(str2, wn5Var2.a);
                                h6kVar.g(str2, wn5Var2.b);
                                h6kVar.e(str2, wn5Var2.c);
                            }
                        } catch (IOException e) {
                            Log.e("FirebaseCrashlytics", "Error initializing Crashlytics NDK", e);
                        }
                    }
                };
                if (this.b) {
                    r0.a();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // xsna.f5k
    @NonNull
    public final fw50 b(@NonNull String str) {
        return new nti0(this.a.b(str));
    }

    @Override // xsna.f5k
    public final boolean c() {
        String str = this.c;
        return str != null && d(str);
    }

    @Override // xsna.f5k
    public final boolean d(@NonNull String str) {
        mti0.b bVar = this.a.b(str).a;
        if (bVar == null) {
            return false;
        }
        File file = bVar.a;
        return (file != null && file.exists()) || bVar.b != null;
    }
}
