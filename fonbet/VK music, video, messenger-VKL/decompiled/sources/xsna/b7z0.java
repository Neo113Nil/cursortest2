package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class b7z0 {
    public static volatile b7z0 b;
    public final SharedPreferences a;

    public b7z0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static b7z0 b(Context context) {
        b7z0 b7z0Var;
        b7z0 b7z0Var2 = b;
        if (b7z0Var2 != null) {
            return b7z0Var2;
        }
        synchronized (b7z0.class) {
            try {
                b7z0Var = b;
                if (b7z0Var == null) {
                    b = new b7z0(Preference.h(context, 0, "mytarget_prefs"));
                    b7z0Var = b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b7z0Var;
    }

    public final int a(String str) {
        try {
            return this.a.getInt(str, -1);
        } catch (Throwable th) {
            gu8.d("PrefsCache exception - " + th);
            return 0;
        }
    }

    public final void c(String str, int i) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putInt(str, i);
            edit.commit();
        } catch (Throwable th) {
            gu8.d("PrefsCache exception - " + th);
        }
    }

    public final void d(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Throwable th) {
            gu8.d("PrefsCache exception - " + th);
        }
    }

    public final String e(String str) {
        try {
            String string = this.a.getString(str, null);
            return string != null ? string : "";
        } catch (Throwable th) {
            gu8.d("PrefsCache exception - " + th);
            return "";
        }
    }
}
