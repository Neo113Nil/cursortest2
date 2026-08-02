package xsna;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class w901 {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ x901 d;

    public w901(x901 x901Var, String str) {
        this.d = x901Var;
        exc0.f(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.o().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.o().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
