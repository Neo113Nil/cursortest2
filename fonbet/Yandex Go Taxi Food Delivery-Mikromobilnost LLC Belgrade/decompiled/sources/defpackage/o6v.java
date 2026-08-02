package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class o6v {
    public final SharedPreferences a;
    public final String b;
    public String c;

    public o6v(qh41 qh41Var) {
        String str;
        SharedPreferences sharedPreferences = (SharedPreferences) qh41Var.o.getValue();
        this.a = sharedPreferences;
        String o = g8e.o("X_UUID_KEY_V2", qh41Var.g.c);
        this.c = sharedPreferences.getString("DEVICE_ID_KEY", null);
        if (sharedPreferences.contains("X_UUID_KEY")) {
            str = sharedPreferences.getString("X_UUID_KEY", null);
            sharedPreferences.edit().remove("X_UUID_KEY").apply();
        } else {
            str = null;
        }
        if (sharedPreferences.contains(o)) {
            String string = sharedPreferences.getString(o, null);
            if (string == null) {
                jl40.x("null uuid saved");
                string = udq0.F();
            }
            this.b = string;
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        str = str == null ? udq0.F() : str;
        this.b = str;
        edit.putString(o, str);
        edit.apply();
    }
}
