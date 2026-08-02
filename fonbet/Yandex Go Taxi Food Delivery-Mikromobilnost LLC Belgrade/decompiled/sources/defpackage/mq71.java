package defpackage;

import java.util.Iterator;
import yads.f5;
import yads.o30;

/* loaded from: classes7.dex */
public final class mq71 implements oy71 {
    public final e971 a;
    public final bp5 b;
    public final pt71 c;

    public mq71(e971 e971Var, bp5 bp5Var, qu71 qu71Var, Iterator it, z081 z081Var) {
        this.a = e971Var;
        this.b = bp5Var;
        this.c = new pt71(e971Var, bp5Var, qu71Var, it, z081Var);
    }

    @Override // defpackage.oy71
    public final void a() {
        this.a.a(f5.q);
        this.b.b();
        this.c.a();
    }

    @Override // defpackage.oy71
    public final void b() {
        this.a.a(f5.q);
        this.b.b();
        this.c.e.a(o30.f);
    }

    @Override // defpackage.oy71
    public final void c() {
    }
}
