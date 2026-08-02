package xsna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SelectionRegistrarImpl.kt */
/* loaded from: classes11.dex */
public final class oei0 implements mei0 {
    public static final fh9 l = new fh9(new od1(6), new juz(29));
    public boolean a;
    public final ArrayList b;
    public final xg50<cai0> c;
    public final AtomicLong d;
    public or50 e;
    public od80 f;
    public tdi0 g;
    public rka0 h;
    public vlc0 i;
    public waf0 j;
    public final wh50 k;

    public oei0(long j) {
        this.b = new ArrayList();
        xg50 xg50Var = t300.a;
        this.c = new xg50<>();
        this.d = new AtomicLong(j);
        this.k = androidx.compose.runtime.k.b(t300.a);
    }

    @Override // xsna.mei0
    public final void a(long j) {
        this.a = false;
        or50 or50Var = this.e;
        if (or50Var != null) {
            or50Var.invoke(Long.valueOf(j));
        }
    }

    @Override // xsna.mei0
    public final boolean b(tny tnyVar, long j, long j2, zbi0 zbi0Var, boolean z) {
        tdi0 tdi0Var = this.g;
        if (tdi0Var == null) {
            return true;
        }
        bei0 bei0Var = tdi0Var.b;
        long a = bei0Var.a(tnyVar, j);
        long a2 = bei0Var.a(tnyVar, j2);
        bei0Var.k(z);
        return bei0Var.n(a, a2, false, zbi0Var);
    }

    @Override // xsna.mei0
    public final void c() {
        rka0 rka0Var = this.h;
        if (rka0Var != null) {
            rka0Var.invoke();
        }
    }

    @Override // xsna.mei0
    public final long d() {
        AtomicLong atomicLong = this.d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // xsna.mei0
    public final void e(long j) {
        vlc0 vlc0Var = this.i;
        if (vlc0Var != null) {
            vlc0Var.invoke(Long.valueOf(j));
        }
    }

    @Override // xsna.mei0
    public final cai0 f(x640 x640Var) {
        long j = x640Var.a;
        if (j == 0) {
            xzw.a("The selectable contains an invalid id: " + j);
        }
        xg50<cai0> xg50Var = this.c;
        if (xg50Var.a(j)) {
            xzw.a("Another selectable with the id: " + x640Var + ".selectableId has already subscribed.");
        }
        xg50Var.i(j, x640Var);
        this.b.add(x640Var);
        this.a = false;
        return x640Var;
    }

    @Override // xsna.mei0
    public final void g(tny tnyVar, long j, zbi0 zbi0Var, boolean z) {
        od80 od80Var = this.f;
        if (od80Var != null) {
            od80Var.invoke(Boolean.valueOf(z), tnyVar, new ov70(j), zbi0Var);
        }
    }

    @Override // xsna.mei0
    public final void h(cai0 cai0Var) {
        long e = cai0Var.e();
        xg50<cai0> xg50Var = this.c;
        if (xg50Var.a(e)) {
            this.b.remove(cai0Var);
            xg50Var.h(cai0Var.e());
            waf0 waf0Var = this.j;
            if (waf0Var != null) {
                waf0Var.invoke(Long.valueOf(cai0Var.e()));
            }
        }
    }

    @Override // xsna.mei0
    public final s300<obi0> i() {
        return (s300) ((zak0) this.k).getValue();
    }

    public final ArrayList j(tny tnyVar) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            final com.vk.movika.sdk.android.defaultplayer.control.n nVar = new com.vk.movika.sdk.android.defaultplayer.control.n(tnyVar, 7);
            g5g.L(arrayList, new Comparator() { // from class: xsna.nei0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) com.vk.movika.sdk.android.defaultplayer.control.n.this.invoke(obj, obj2)).intValue();
                }
            });
            this.a = true;
        }
        return arrayList;
    }

    public oei0() {
        this(1L);
    }
}
