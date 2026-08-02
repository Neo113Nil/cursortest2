package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: SharedPrefKeysetReader.java */
/* loaded from: classes.dex */
public final class maj0 {
    public final SharedPreferences a;
    public final String b;

    public maj0(Context context, String str, String str2) throws IOException {
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = Preference.g(applicationContext);
        } else {
            this.a = Preference.h(applicationContext, 0, str2);
        }
    }

    public final byte[] a() throws IOException {
        String str = this.b;
        try {
            String string = this.a.getString(str, null);
            if (string != null) {
                return g2v.a(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value " + str + " does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(zr.a("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }
}
