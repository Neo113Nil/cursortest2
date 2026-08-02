package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes6.dex */
public final class hkx0 {
    public final m1a0 a;
    public String c;
    public String d;
    public String e;
    public String f;
    public c1f0 g;
    public int h;
    public jn40 k;
    public mct0 l;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public kb5 b = kb5.g;
    public List i = EmptyList.a;
    public final ArrayList j = new ArrayList();
    public String m = "";
    public String n = "";
    public Map o = b.f();
    public Map p = b.f();
    public Map q = b.f();

    public hkx0(m1a0 m1a0Var) {
        this.a = m1a0Var;
    }

    public final ikx0 a(int i) {
        kb5 kb5Var = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        String str2 = this.d;
        String str3 = this.e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f;
        if (str4 == null) {
            str4 = "";
        }
        c1f0 c1f0Var = this.g;
        if (c1f0Var == null) {
            ny61.g("priceUiState");
            return null;
        }
        return new ikx0(i, kb5Var, str, str2, str3, str4, c1f0Var, this.h, this.i, new ArrayList(this.j), this.k, this.l, this.m, this.n, this.r, null, this.a, this.o, this.p, this.q, this.s, this.t, this.u, this.v);
    }
}
