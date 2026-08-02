package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class ne1 {
    public final SharedPreferences a;

    public ne1(Context context) {
        this.a = context.getSharedPreferences("smart_cookie_refresh_prefs", 0);
    }

    public ne1(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }
}
