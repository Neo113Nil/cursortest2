package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: SharedPrefKeysetWriter.java */
/* loaded from: classes.dex */
public final class naj0 {
    public final SharedPreferences.Editor a;
    public final String b;

    public naj0(Context context, String str, String str2) {
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = Preference.g(applicationContext).edit();
        } else {
            this.a = Preference.h(applicationContext, 0, str2).edit();
        }
    }
}
