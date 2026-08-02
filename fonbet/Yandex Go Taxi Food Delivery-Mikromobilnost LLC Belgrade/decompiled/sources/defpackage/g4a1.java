package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class g4a1 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ o5a1 e;

    public g4a1(o5a1 o5a1Var, String str, boolean z) {
        this.e = o5a1Var;
        cvw.i(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.Kg().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.e.Kg().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
