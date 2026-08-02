package defpackage;

import com.squareup.moshi.Moshi;

/* loaded from: classes8.dex */
public final /* synthetic */ class cx50 {
    public final /* synthetic */ c7j0 a;
    public final /* synthetic */ bg7 b;
    public final /* synthetic */ Moshi c;

    public /* synthetic */ cx50(c7j0 c7j0Var, bg7 bg7Var, Moshi moshi) {
        this.a = c7j0Var;
        this.b = bg7Var;
        this.c = moshi;
    }

    public final t0k0 a(String str) {
        s0k0 s0k0Var = new s0k0();
        s0k0Var.b(str);
        s0k0Var.a = this.a;
        s0k0Var.d.add(this.b);
        s0k0Var.a(r830.d(this.c));
        return s0k0Var.c();
    }
}
