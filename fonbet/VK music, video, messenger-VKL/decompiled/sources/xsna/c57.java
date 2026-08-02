package xsna;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BiometricManager.java */
/* loaded from: classes11.dex */
public final class c57 {

    @NonNull
    public final c a;

    @Nullable
    public final BiometricManager b;

    @Nullable
    public final p490 c;

    /* compiled from: BiometricManager.java */
    public static class a {
        public static int a(@NonNull BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        @Nullable
        public static BiometricManager b(@NonNull Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        @Nullable
        public static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* compiled from: BiometricManager.java */
    public static class b {
        public static int a(@NonNull BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    /* compiled from: BiometricManager.java */
    public static class c {

        @NonNull
        public final Context a;

        public c(@NonNull Context context) {
            this.a = context.getApplicationContext();
        }
    }

    public c57(@NonNull c cVar) {
        this.a = cVar;
        int i = Build.VERSION.SDK_INT;
        this.b = i >= 29 ? a.b(cVar.a) : null;
        this.c = i <= 29 ? new p490() : null;
    }

    @NonNull
    public static c57 c(@NonNull Context context) {
        return new c57(new c(context));
    }

    public final int a(int i) {
        int a2;
        BiometricPrompt.CryptoObject b2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.b;
            if (biometricManager != null) {
                return b.a(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        c cVar = this.a;
        Context context = cVar.a;
        if (!e75.b(i)) {
            return -2;
        }
        if (i == 0 || why.a(context) == null) {
            return 12;
        }
        int i3 = 0;
        if (e75.a(i)) {
            KeyguardManager a3 = why.a(context);
            return a3 == null ? false : why.b(a3) ? 0 : 11;
        }
        if (i2 != 29) {
            if (i2 != 28) {
                return b();
            }
            if (!((context == null || context.getPackageManager() == null || !c890.a(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager a4 = why.a(cVar.a);
            return !(a4 == null ? false : why.b(a4)) ? b() : b() == 0 ? 0 : -1;
        }
        if ((i & 255) == 255) {
            BiometricManager biometricManager2 = this.b;
            if (biometricManager2 != null) {
                return a.a(biometricManager2);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c2 = a.c();
        if (c2 != null && (b2 = ujk.b(ujk.a())) != null) {
            try {
                Object invoke = c2.invoke(this.b, b2);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        BiometricManager biometricManager3 = this.b;
        if (biometricManager3 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            a2 = 1;
        } else {
            a2 = a.a(biometricManager3);
        }
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                if (str.equals(str2)) {
                    break;
                }
            }
        }
        r3 = false;
        if (r3 || a2 != 0) {
            return a2;
        }
        KeyguardManager a5 = why.a(cVar.a);
        if (!(a5 == null ? false : why.b(a5))) {
            i3 = b();
        } else if (b() != 0) {
            i3 = -1;
        }
        return i3;
    }

    public final int b() {
        p490 p490Var = this.c;
        if (p490Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        p490Var.getClass();
        return 12;
    }
}
