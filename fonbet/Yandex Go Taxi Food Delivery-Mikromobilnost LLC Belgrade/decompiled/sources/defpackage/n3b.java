package defpackage;

import android.os.Looper;

/* loaded from: classes12.dex */
public final class n3b {
    public final k020 a;
    public final to3 b;
    public final Looper c;
    public final h9b d;

    public n3b(k020 k020Var, Looper looper, to3 to3Var, h9b h9bVar) {
        this.c = looper;
        this.b = to3Var;
        this.a = k020Var;
        this.d = h9bVar;
    }

    public final void a(String str) {
        z83.g(null, this.c, Looper.myLooper());
        md6 md6Var = new md6((Object) this, (Object) str, false, 25);
        to3 to3Var = this.b;
        to3Var.a.a(new io3(12, to3Var, new String[]{str}, md6Var));
    }
}
