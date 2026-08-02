package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.tasks.Tasks;
import com.vk.core.preference.Preference;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import xsna.g6k;

/* compiled from: IdManager.java */
/* loaded from: classes.dex */
public final class isv {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote(DomExceptionUtils.SEPARATOR);
    public final epf a;
    public final Context b;
    public final String c;
    public final uir d;
    public final wtk e;
    public wm5 f;

    public isv(Context context, String str, uir uirVar, wtk wtkVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = uirVar;
        this.e = wtkVar;
        this.a = new epf();
    }

    @NonNull
    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:12|13|4|5|6|7|8)|3|4|5|6|7|8) */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qir b(boolean z) {
        String b;
        g6k.a aVar = g6k.d;
        aVar.getClass();
        g6k.a.a(new e6k(0, aVar, g6k.a.class, "isNotMainThread", "isNotMainThread()Z", 0), f6k.i);
        uir uirVar = this.d;
        String str = null;
        if (z) {
            try {
                b = ((k6x) Tasks.await(uirVar.getToken(), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception unused) {
            }
            str = (String) Tasks.await(uirVar.getId(), 10000L, TimeUnit.MILLISECONDS);
            return new qir(str, b);
        }
        b = null;
        str = (String) Tasks.await(uirVar.getId(), 10000L, TimeUnit.MILLISECONDS);
        return new qir(str, b);
    }

    @NonNull
    public final synchronized d6x c() {
        String str;
        wm5 wm5Var = this.f;
        if (wm5Var != null && (wm5Var.b != null || !this.e.b())) {
            return this.f;
        }
        SharedPreferences h2 = Preference.h(this.b, 0, "com.google.firebase.crashlytics");
        String string = h2.getString("firebase.installation.id", null);
        if (this.e.b()) {
            qir b = b(false);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new qir(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new wm5(h2.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new wm5(a(h2, b.a), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new wm5(a(h2, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new wm5(h2.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f);
        return this.f;
    }

    public final String d() {
        String str;
        epf epfVar = this.a;
        Context context = this.b;
        synchronized (epfVar) {
            try {
                if (((String) epfVar.b) == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    epfVar.b = installerPackageName;
                }
                str = "".equals((String) epfVar.b) ? null : (String) epfVar.b;
            } finally {
            }
        }
        return str;
    }
}
