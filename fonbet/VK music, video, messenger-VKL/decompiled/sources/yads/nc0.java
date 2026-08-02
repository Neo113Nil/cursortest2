package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.aoq0;

/* loaded from: classes10.dex */
public final class nc0 implements b30 {
    public final hh1 a;
    public final vo b;
    public final int[] c;
    public final int d;
    public final p30 e;
    public final long f;
    public final uf2 g;
    public final lc0[] h;
    public pp0 i;
    public c30 j;
    public int k;
    public zo l;
    public boolean m;

    public nc0(du duVar, hh1 hh1Var, c30 c30Var, vo voVar, int i, int[] iArr, pp0 pp0Var, int i2, p30 p30Var, long j, boolean z, ArrayList arrayList, uf2 uf2Var, zf2 zf2Var) {
        this.a = hh1Var;
        this.j = c30Var;
        this.b = voVar;
        this.c = iArr;
        this.i = pp0Var;
        int i3 = i2;
        this.d = i3;
        this.e = p30Var;
        this.k = i;
        this.f = j;
        uf2 uf2Var2 = uf2Var;
        this.g = uf2Var2;
        long c = c30Var.c(i);
        ArrayList a = a();
        this.h = new lc0[pp0Var.f()];
        int i4 = 0;
        while (i4 < this.h.length) {
            mp2 mp2Var = (mp2) a.get(pp0Var.b(i4));
            uo b = voVar.b(mp2Var.b);
            lc0[] lc0VarArr = this.h;
            uo uoVar = b == null ? (uo) mp2Var.b.get(0) : b;
            nx0 nx0Var = mp2Var.a;
            ((aoq0) duVar).getClass();
            long j2 = c;
            lc0VarArr[i4] = new lc0(j2, mp2Var, uoVar, ar.a(i3, nx0Var, z, arrayList, uf2Var2, zf2Var), 0L, mp2Var.d());
            i4++;
            i3 = i2;
            uf2Var2 = uf2Var;
            c = j2;
        }
    }

    public final ArrayList a() {
        List list = ((gd2) this.j.m.get(this.k)).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((zb) list.get(i)).c);
        }
        return arrayList;
    }
}
