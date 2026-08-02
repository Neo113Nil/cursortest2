package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;

/* loaded from: classes10.dex */
public final class fme0 {
    public final Context a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public final String f;
    public PreferenceScreen g;
    public eme0 h;
    public cme0 i;
    public dme0 j;

    public fme0(Context context) {
        this.a = context;
        this.f = b(context);
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(b(context), 0);
    }

    public static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor c() {
        if (!this.e) {
            return d().edit();
        }
        if (this.d == null) {
            this.d = d().edit();
        }
        return this.d;
    }

    public final SharedPreferences d() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }

    public final PreferenceScreen e(Context context, int i, PreferenceScreen preferenceScreen) {
        this.e = true;
        bme0 bme0Var = new bme0(context, this);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            PreferenceGroup c = bme0Var.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) c;
            preferenceScreen2.l(this);
            SharedPreferences.Editor editor = this.d;
            if (editor != null) {
                editor.apply();
            }
            this.e = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
