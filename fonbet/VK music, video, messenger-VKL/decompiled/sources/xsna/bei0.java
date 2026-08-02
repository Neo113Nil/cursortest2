package xsna;

import androidx.compose.foundation.text.Handle;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import xsna.obi0;
import xsna.us2;

/* compiled from: SelectionManager.kt */
/* loaded from: classes11.dex */
public final class bei0 {
    public final oei0 a;
    public vtu e;
    public izs<? super us2, s3q0> f;
    public ymo0 g;
    public ov70 l;
    public tny m;
    public ndi0 u;
    public boolean v;
    public yvj w;
    public aua0 x;
    public boolean y;
    public final wh50<obi0> b = androidx.compose.runtime.k.b(null);
    public final wh50<Boolean> c = androidx.compose.runtime.k.b(Boolean.TRUE);
    public izs<? super obi0, s3q0> d = new hs00(this, 29);
    public final pwi h = new pwi(2);
    public final rwr i = new rwr();
    public final wh50 j = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final f1m k = bbk0.b(new mqe0(this, 6));
    public final wh50 n = androidx.compose.runtime.k.a(s3q0.a, w65.e);
    public final wh50 o = androidx.compose.runtime.k.b(new ov70(0));
    public final wh50 p = androidx.compose.runtime.k.b(new ov70(0));
    public final wh50 q = androidx.compose.runtime.k.b(null);
    public final wh50 r = androidx.compose.runtime.k.b(null);
    public final wh50 s = androidx.compose.runtime.k.b(null);
    public final wh50 t = androidx.compose.runtime.k.b(null);

    public bei0(oei0 oei0Var) {
        this.a = oei0Var;
        oei0Var.e = new or50(this, 21);
        oei0Var.f = new od80(this, 1);
        oei0Var.g = new tdi0(this);
        oei0Var.h = new rka0(this, 16);
        oei0Var.i = new vlc0(this, 8);
        oei0Var.j = new waf0(this, 6);
    }

    public final long a(tny tnyVar, long j) {
        tny tnyVar2 = this.m;
        if (tnyVar2 == null || !tnyVar2.e()) {
            return 9205357640488583168L;
        }
        return j().w(tnyVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        us2 us2Var;
        izs<? super us2, s3q0> izsVar;
        int i;
        if (f() != null) {
            oei0 oei0Var = this.a;
            if (oei0Var.i().e != 0) {
                us2.b bVar = new us2.b();
                ArrayList j = oei0Var.j(j());
                ListIterator listIterator = j.listIterator(j.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    }
                    obi0 b = oei0Var.i().b(((cai0) listIterator.previous()).e());
                    if (b != null && b.a.b != b.b.b) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    int size = j.size();
                    int i2 = 0;
                    while (i2 < size) {
                        cai0 cai0Var = (cai0) j.get(i2);
                        obi0 b2 = oei0Var.i().b(cai0Var.e());
                        if (b2 != null) {
                            us2 text = cai0Var.getText();
                            long c = jgz.c(b2.a.b, b2.b.b);
                            boolean z = i2 >= i;
                            bVar.i(text, qko0.f(c), qko0.e(c));
                            if (!z) {
                                bVar.b.append('\n');
                            }
                        }
                        i2++;
                    }
                }
                us2Var = bVar.n();
                if (us2Var == null) {
                    us2 us2Var2 = us2Var.c.length() > 0 ? us2Var : null;
                    if (us2Var2 == null || (izsVar = this.f) == null) {
                        return;
                    }
                    izsVar.invoke(us2Var2);
                    return;
                }
                return;
            }
        }
        us2Var = null;
        if (us2Var == null) {
        }
    }

    public final cai0 c(obi0.a aVar) {
        return this.a.c.b(aVar.c);
    }

    public final Pair<us2, qko0> d() {
        int i;
        int i2;
        int i3;
        if (f() == null) {
            return null;
        }
        oei0 oei0Var = this.a;
        if (oei0Var.b.isEmpty()) {
            return null;
        }
        us2.b bVar = new us2.b();
        ArrayList j = oei0Var.j(j());
        ListIterator listIterator = j.listIterator(j.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            obi0 b = oei0Var.i().b(((cai0) listIterator.previous()).e());
            if (b != null && b.a.b != b.b.b) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = j.size();
            int i4 = 0;
            i2 = -1;
            i3 = -1;
            int i5 = 0;
            while (i5 < size) {
                cai0 cai0Var = (cai0) j.get(i5);
                obi0 b2 = oei0Var.i().b(cai0Var.e());
                if (b2 != null) {
                    us2 text = cai0Var.getText();
                    long c = jgz.c(b2.a.b, b2.b.b);
                    int i6 = i5 >= i ? 1 : i4;
                    if (i2 == -1) {
                        i2 = qko0.f(c);
                        bVar.i(text, i4, qko0.f(c));
                    }
                    bVar.i(text, qko0.f(c), qko0.e(c));
                    StringBuilder sb = bVar.b;
                    if (i6 == 0) {
                        sb.append('\n');
                    } else {
                        i3 = sb.length();
                        bVar.i(text, qko0.e(c), text.c.length());
                    }
                }
                i5++;
                i4 = 0;
            }
        } else {
            i2 = -1;
            i3 = -1;
        }
        us2 n = bVar.n();
        if (i2 == -1 || i3 == -1) {
            return null;
        }
        return new Pair<>(n, new qko0(jgz.c(i2, i3)));
    }

    public final Handle e() {
        return (Handle) ((zak0) this.s).getValue();
    }

    public final obi0 f() {
        return (obi0) ((zak0) this.b).getValue();
    }

    public final boolean g() {
        return ((Boolean) ((zak0) this.c).getValue()).booleanValue();
    }

    public final boolean h() {
        obi0 f = f();
        if (f != null) {
            obi0.a aVar = f.b;
            obi0.a aVar2 = f.a;
            if (!epx.f(aVar2, aVar)) {
                if (aVar2.c == aVar.c) {
                    return true;
                }
                tny j = j();
                oei0 oei0Var = this.a;
                ArrayList j2 = oei0Var.j(j);
                int size = j2.size();
                for (int i = 0; i < size; i++) {
                    obi0 b = oei0Var.i().b(((cai0) j2.get(i)).e());
                    if (b != null && b.a.b != b.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        vtu vtuVar;
        ((zak0) this.a.k).setValue(t300.a);
        this.y = false;
        o();
        if (f() != null) {
            this.d.invoke(null);
            if (!g() || (vtuVar = this.e) == null) {
                return;
            }
            vtuVar.a(9);
        }
    }

    public final tny j() {
        tny tnyVar = this.m;
        if (tnyVar == null) {
            throw jq.f("null coordinates");
        }
        if (!tnyVar.e()) {
            xzw.a("unattached coordinates");
        }
        return tnyVar;
    }

    public final void k(boolean z) {
        wh50<Boolean> wh50Var = this.c;
        if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue() != z) {
            ((zak0) wh50Var).setValue(Boolean.valueOf(z));
            o();
        }
    }

    public final void l(obi0 obi0Var) {
        ((zak0) this.b).setValue(obi0Var);
        if (obi0Var != null) {
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (xsna.cei0.a(r10, r11) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        long j;
        ov70 ov70Var;
        obi0.a aVar;
        obi0.a aVar2;
        obi0 f = f();
        tny tnyVar = this.m;
        ov70 ov70Var2 = null;
        cai0 c = (f == null || (aVar2 = f.a) == null) ? null : c(aVar2);
        cai0 c2 = (f == null || (aVar = f.b) == null) ? null : c(aVar);
        tny a = c != null ? c.a() : null;
        tny a2 = c2 != null ? c2.a() : null;
        wh50 wh50Var = this.r;
        wh50 wh50Var2 = this.q;
        if (f == null || tnyVar == null || !tnyVar.e() || (a == null && a2 == null)) {
            ((zak0) wh50Var2).setValue(null);
            ((zak0) wh50Var).setValue(null);
            return;
        }
        zhf0 c3 = cei0.c(tnyVar);
        if (a != null) {
            j = 9205357640488583168L;
            long h = c.h(f, true);
            if ((h & 9223372034707292159L) != 9205357640488583168L) {
                long w = tnyVar.w(a, h);
                ov70Var = new ov70(w);
                if (e() != Handle.SelectionStart) {
                }
                ((zak0) wh50Var2).setValue(ov70Var);
                if (a2 != null) {
                    long h2 = c2.h(f, false);
                    if ((h2 & 9223372034707292159L) != j) {
                        long w2 = tnyVar.w(a2, h2);
                        ov70 ov70Var3 = new ov70(w2);
                        if (e() == Handle.SelectionEnd || cei0.a(c3, w2)) {
                            ov70Var2 = ov70Var3;
                        }
                    }
                }
                ((zak0) wh50Var).setValue(ov70Var2);
            }
        } else {
            j = 9205357640488583168L;
        }
        ov70Var = null;
        ((zak0) wh50Var2).setValue(ov70Var);
        if (a2 != null) {
        }
        ((zak0) wh50Var).setValue(ov70Var2);
    }

    public final boolean n(long j, long j2, boolean z, zbi0 zbi0Var) {
        ((zak0) this.s).setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
        ((zak0) this.t).setValue(new ov70(j));
        tny j3 = j();
        oei0 oei0Var = this.a;
        ArrayList j4 = oei0Var.j(j3);
        int i = o300.a;
        vg50 vg50Var = new vg50(6);
        int size = j4.size();
        for (int i2 = 0; i2 < size; i2++) {
            vg50Var.e(i2, ((cai0) j4.get(i2)).e());
        }
        ndi0 ndi0Var = null;
        odi0 odi0Var = new odi0(j, j2, j3, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : f(), new wdi0(vg50Var));
        int size2 = j4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((cai0) j4.get(i3)).g(odi0Var);
        }
        int i4 = odi0Var.k + 1;
        ArrayList arrayList = odi0Var.h;
        int size3 = arrayList.size();
        if (size3 != 0) {
            if (size3 != 1) {
                int i5 = odi0Var.i;
                if (i5 == -1) {
                    i5 = i4;
                }
                int i6 = odi0Var.j;
                if (i6 == -1) {
                    i6 = i4;
                }
                ndi0Var = new d640(odi0Var.g, arrayList, i5, i6, odi0Var.d, odi0Var.e);
            } else {
                jai0 jai0Var = (jai0) j5g.z0(arrayList);
                int i7 = odi0Var.i;
                int i8 = i7 == -1 ? i4 : i7;
                int i9 = odi0Var.j;
                ndi0Var = new yvj0(odi0Var.d, i8, i9 == -1 ? i4 : i9, odi0Var.e, jai0Var);
            }
        }
        if (ndi0Var == null || !ndi0Var.e(this.u)) {
            return false;
        }
        obi0 a = zbi0Var.a(ndi0Var);
        if (!epx.f(a, f())) {
            if (g()) {
                ArrayList arrayList2 = oei0Var.b;
                int size4 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        break;
                    }
                    if (((cai0) arrayList2.get(i10)).getText().c.length() > 0) {
                        vtu vtuVar = this.e;
                        if (vtuVar != null) {
                            vtuVar.a(9);
                        }
                    } else {
                        i10++;
                    }
                }
            }
            ((zak0) oei0Var.k).setValue(ndi0Var.c(a));
            this.d.invoke(a);
            this.v = false;
        }
        this.u = ndi0Var;
        return true;
    }

    public final void o() {
        yok0 yok0Var;
        if (((Boolean) ((zak0) this.j).getValue()).booleanValue()) {
            boolean z = this.y;
            pwi pwiVar = this.h;
            if (z && g()) {
                if (((zhf0) this.k.getValue()) == null) {
                    return;
                }
                pwiVar.c();
            } else {
                ndo0 ndo0Var = (ndo0) pwiVar.b;
                if (ndo0Var == null || (yok0Var = ndo0Var.v) == null) {
                    return;
                }
                yok0Var.b(null);
                ndo0Var.v = null;
            }
        }
    }
}
