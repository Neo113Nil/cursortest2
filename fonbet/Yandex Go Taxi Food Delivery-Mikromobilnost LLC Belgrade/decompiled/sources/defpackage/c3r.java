package defpackage;

/* loaded from: classes15.dex */
public final class c3r {
    public final evu a;
    public final Iterable b;
    public final oyq c;
    public final String d;
    public final String e;
    public final go3 f;
    public boolean g = false;
    public xo3 h;
    public final a1r i;
    public final b7m j;

    public c3r(String str, String str2, Iterable iterable, boolean z, evu evuVar, nk21 nk21Var, oyq oyqVar, go3 go3Var, a1r a1rVar, b7m b7mVar) {
        this.b = iterable;
        this.c = oyqVar;
        this.a = evuVar;
        this.d = str;
        this.e = str2;
        this.f = go3Var;
        this.i = a1rVar;
        this.j = b7mVar;
        if (z || !oyqVar.a(str)) {
            this.h = nk21Var.a(new b3r(this));
        } else {
            if (this.g) {
                return;
            }
            go3Var.D(new myj0(str));
        }
    }
}
