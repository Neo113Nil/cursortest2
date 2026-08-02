package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class ir4 {
    public final SharedPreferences a;

    public ir4(Context context) {
        this.a = context.getSharedPreferences("communications_assets", 0);
    }

    public final String a(String str) {
        return this.a.getString(str, null);
    }
}
