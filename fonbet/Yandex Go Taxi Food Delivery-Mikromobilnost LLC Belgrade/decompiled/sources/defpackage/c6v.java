package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.crashlytics.internal.concurrency.a;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c6v {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final yvi0 a;
    public final Context b;
    public final String c;
    public final hcr d;
    public final uo2 e;
    public z64 f;

    public c6v(Context context, String str, hcr hcrVar, uo2 uo2Var) {
        if (context == null) {
            ny61.g("appContext must not be null");
            throw null;
        }
        if (str == null) {
            ny61.g("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = hcrVar;
        this.e = uo2Var;
        this.a = new yvi0();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:12|13|4|5|6|7|8)|3|4|5|6|7|8) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dcr b(boolean z) {
        String a;
        a.c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hcr hcrVar = this.d;
        String str = null;
        if (z) {
            try {
                a = ((f3w) udq0.g(((com.google.firebase.installations.a) hcrVar).d(), 10000L, timeUnit)).a();
            } catch (Exception unused) {
            }
            str = (String) udq0.g(((com.google.firebase.installations.a) hcrVar).c(), 10000L, timeUnit);
            return new dcr(str, a);
        }
        a = null;
        str = (String) udq0.g(((com.google.firebase.installations.a) hcrVar).c(), 10000L, timeUnit);
        return new dcr(str, a);
    }

    public final synchronized x2w c() {
        String str;
        z64 z64Var = this.f;
        if (z64Var != null && (z64Var.b != null || !this.e.c())) {
            return this.f;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.e.c()) {
            dcr b = b(false);
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new dcr(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new z64(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new z64(a(sharedPreferences, b.a), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new z64(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new z64(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f);
        Log.isLoggable("FirebaseCrashlytics", 2);
        return this.f;
    }

    public final String d() {
        String str;
        yvi0 yvi0Var = this.a;
        Context context = this.b;
        synchronized (yvi0Var) {
            try {
                if (((String) yvi0Var.a) == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    yvi0Var.a = installerPackageName;
                }
                str = "".equals((String) yvi0Var.a) ? null : (String) yvi0Var.a;
            } finally {
            }
        }
        return str;
    }
}
