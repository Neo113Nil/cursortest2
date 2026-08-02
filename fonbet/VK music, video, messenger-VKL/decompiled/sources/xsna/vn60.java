package xsna;

import android.os.SystemClock;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.b0g;
import xsna.ds60;
import xsna.lsw;
import xsna.r070;
import xsna.vs60;
import xsna.xh60;
import xsna.xn60;

/* compiled from: NewsfeedLifecycleActor.kt */
/* loaded from: classes4.dex */
public final class vn60 extends al50<qz60, vs60.f, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;
    public final AtomicReference<wn60> d;
    public final ts60 e;
    public final jt60 f;
    public final vh8 g;
    public final lsw h;
    public final tq60 i;
    public boolean j;
    public boolean k;
    public int l;
    public final bpn0 m;

    public vn60(ot60 ot60Var, sj50<qz60, on50, r070, jv60, xh60> sj50Var, AtomicReference<wn60> atomicReference, ts60 ts60Var, jt60 jt60Var, vh8 vh8Var, lsw lswVar) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = atomicReference;
        this.e = ts60Var;
        this.f = jt60Var;
        this.g = vh8Var;
        this.h = lswVar;
        this.i = new tq60(new dht(this, ot60Var), atomicReference);
        this.m = new bpn0(new lz2(21));
    }

    public final boolean m() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        vs60.f fVar = (vs60.f) lj50Var;
        if (!(fVar instanceof vs60.f.a)) {
            throw new NoWhenBranchMatchedException();
        }
        xn60.c cVar = ((vs60.f.a) fVar).b;
        this.i.p(cVar);
        boolean z = cVar instanceof xn60.c.a;
        jt60 jt60Var = this.f;
        AtomicReference<wn60> atomicReference = this.d;
        lsw lswVar = this.h;
        ts60 ts60Var = this.e;
        if (z) {
            xn60.c.a aVar = (xn60.c.a) cVar;
            if (aVar.equals(xn60.c.a.C4021a.b)) {
                a(r070.a.C3586a.b);
                c(xh60.c.a);
            } else {
                boolean equals = aVar.equals(xn60.c.a.d.b);
                vh8 vh8Var = this.g;
                if (equals) {
                    ts60Var.k(NewsDebuggerPoint.Lifecycle, new nm0(24));
                    this.j = true;
                    b0g b0gVar = b0g.a;
                    b0g.a(new b0g.a() { // from class: xsna.tn60
                        @Override // xsna.b0g.a
                        public final void a() {
                            vn60 vn60Var = vn60.this;
                            if (vn60Var.m()) {
                                vn60Var.a(r070.f.h.b);
                                return;
                            }
                            if (vn60Var.j) {
                                qz60 qz60Var = (qz60) vn60Var.b.getCurrentState();
                                jt60 jt60Var2 = vn60Var.f;
                                int i = qz60Var.c;
                                bi6 bi6Var = new bi6(vn60Var, 8);
                                ts60 ts60Var2 = jt60Var2.c;
                                if (!jt60Var2.n) {
                                    jt60Var2.n = true;
                                    NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                                    ts60Var2.T();
                                    long j = jt60Var2.m;
                                    long j2 = jt60Var2.l;
                                    if (j != j2) {
                                        jt60Var2.m = j2;
                                        jt60Var2.c();
                                        ts60Var2.j();
                                        jt60Var2.a(i, bi6Var, false);
                                    }
                                }
                                vn60Var.h.a(lsw.b.AbstractC3288b.C3289b.a);
                            }
                        }
                    });
                    ((AtomicLong) vh8Var.b).set(0L);
                    qz60 qz60Var = (qz60) this.b.getCurrentState();
                    if (!qz60Var.b.b.a.isEmpty() && qz60Var.c == 0 && ce60.b.e()) {
                        a(new r070.h.c(ds60.f.c.b));
                        c(new xh60.e(vp60.a));
                    }
                } else if (aVar.equals(xn60.c.a.C4022c.b)) {
                    ts60Var.k(NewsDebuggerPoint.Lifecycle, new i21(23));
                    this.j = false;
                    ((AtomicLong) vh8Var.b).set(SystemClock.elapsedRealtime());
                    if (m()) {
                        a(r070.f.e.b);
                    } else {
                        new ai6(1, this, vn60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0, 7);
                        if (jt60Var.n) {
                            jt60Var.n = false;
                        }
                        lswVar.a(lsw.b.AbstractC3288b.a.a);
                    }
                } else {
                    if (!aVar.equals(xn60.c.a.b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!m()) {
                        jt60Var.c();
                    }
                }
            }
            ts60Var.k(NewsDebuggerPoint.ScreenVisibility, new us60(atomicReference.get().a));
            return;
        }
        if (cVar instanceof co60) {
            return;
        }
        if (cVar instanceof do60) {
            ts60Var.k(NewsDebuggerPoint.Lifecycle, new ig(22));
            this.j = false;
            ts60Var.T();
            if (m()) {
                return;
            }
            jt60Var.c();
            lswVar.a(lsw.b.a.C3286a.a);
            return;
        }
        if (cVar instanceof eo60) {
            ts60Var.k(NewsDebuggerPoint.Lifecycle, new lg(25));
            this.j = true;
            b0g b0gVar2 = b0g.a;
            b0g.a(new b0g.a() { // from class: xsna.un60
                @Override // xsna.b0g.a
                public final void a() {
                    vn60 vn60Var = vn60.this;
                    if (!vn60Var.j || vn60Var.m()) {
                        return;
                    }
                    qz60 qz60Var2 = (qz60) vn60Var.b.getCurrentState();
                    ts60 ts60Var2 = vn60Var.e;
                    int i = qz60Var2.c;
                    ts60Var2.a();
                    vn60Var.f.a(qz60Var2.c, new ee8(vn60Var, 11), false);
                    vn60Var.h.a(lsw.b.a.C3287b.a);
                }
            });
            return;
        }
        if (cVar instanceof xn60.c.InterfaceC4025c) {
            xn60.c.InterfaceC4025c interfaceC4025c = (xn60.c.InterfaceC4025c) cVar;
            if (interfaceC4025c.equals(xn60.c.InterfaceC4025c.b.b)) {
                if (!this.k) {
                    this.k = true;
                }
            } else {
                if (!interfaceC4025c.equals(xn60.c.InterfaceC4025c.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.k) {
                    this.k = false;
                }
            }
            ts60Var.k(NewsDebuggerPoint.ScreenVisibility, new us60(atomicReference.get().a));
            return;
        }
        if (!(cVar instanceof xn60.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        xn60.c.b bVar = (xn60.c.b) cVar;
        if (bVar.equals(xn60.c.b.C4024c.b)) {
            if ((atomicReference.get().a & 2) != 0) {
                int i = this.l + 1;
                this.l = i;
                if (i == 1) {
                    if (m()) {
                        a(r070.f.c.b);
                    } else {
                        lswVar.a(lsw.b.d.a.a);
                    }
                }
            }
        } else if (!bVar.equals(xn60.c.b.h.b)) {
            if (bVar.equals(xn60.c.b.d.b)) {
                int i2 = this.l - 1;
                this.l = i2;
                if (i2 <= 0) {
                    if (m()) {
                        a(r070.f.d.b);
                    } else {
                        lswVar.a(lsw.b.d.C3290b.a);
                    }
                }
            } else if (!(bVar instanceof xn60.c.b.f) && !(bVar instanceof xn60.c.b.e) && !(bVar instanceof xn60.c.b.g) && !bVar.equals(xn60.c.b.C4023b.b) && !bVar.equals(xn60.c.b.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ts60Var.k(NewsDebuggerPoint.ScreenVisibility, new us60(atomicReference.get().a));
    }
}
