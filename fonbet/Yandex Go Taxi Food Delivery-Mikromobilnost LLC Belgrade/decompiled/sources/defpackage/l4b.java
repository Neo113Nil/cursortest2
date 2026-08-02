package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class l4b extends xij {
    public final m4b a;
    public List b = new ArrayList();
    public List c = new ArrayList();

    public l4b(m4b m4bVar) {
        this.a = m4bVar;
    }

    public static boolean f(int i, List list) {
        return !((p4b) list.get(i)).e && (i > 0 && ((p4b) list.get(i - 1)).e);
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        return jl40.l(this.b.get(i), this.c.get(i2)) && f(i, this.b) == f(i2, this.c);
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        return ((p4b) this.b.get(i)).a.equals(((p4b) this.c.get(i2)).a);
    }

    @Override // defpackage.xij
    public final int d() {
        return this.c.size();
    }

    @Override // defpackage.xij
    public final int e() {
        return this.b.size();
    }
}
