package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class fkh {
    public final SharedPreferences a;

    public fkh(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final wtq0 a() {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("antirobot_token", null);
        if (string == null) {
            return null;
        }
        return new wtq0(string, sharedPreferences.getLong("antirobot_timestamp", 0L), sharedPreferences.getLong("antirobot_expires", 0L));
    }
}
