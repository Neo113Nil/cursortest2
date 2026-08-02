package xsna;

import com.vk.im.reporters.api.engine.LongPollReporter;
import com.vk.im.reporters.api.util.PerformanceReporters;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ImReportersImpl.kt */
/* loaded from: classes11.dex */
public final class sbw implements pbw {
    public final bpn0 a;
    public final bpn0 e;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final vz30 b = new vz30(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
    public final vz30 c = new vz30(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL);
    public final prw d = prw.b;
    public final bpn0 f = new bpn0(new j55(6));

    public sbw(final ohp0 ohp0Var, final b25 b25Var, final cau0 cau0Var, final jhg jhgVar, final g3j g3jVar) {
        this.a = new bpn0(new gzs() { // from class: xsna.qbw
            @Override // xsna.gzs
            public final Object invoke() {
                return new f38(ohp0.this, b25Var, g3jVar);
            }
        });
        this.e = new bpn0(new gzs() { // from class: xsna.rbw
            @Override // xsna.gzs
            public final Object invoke() {
                return new tw90(cau0.this, jhgVar);
            }
        });
        this.g = new bpn0(new s0f(cau0Var, 3));
        new bpn0(new an(cau0Var, 4));
        this.h = new bpn0(new v94(8));
        this.i = new bpn0(new w94(9));
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ ktm a() {
        return ntm.a;
    }

    @Override // xsna.pbw
    public final feb b() {
        return new geb();
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ bcw c() {
        return ccw.a;
    }

    @Override // xsna.pbw
    public final ry30 d() {
        return wy30.a;
    }

    @Override // xsna.pbw
    public final uz30 e() {
        return this.b;
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ uim f() {
        return vim.a;
    }

    @Override // xsna.pbw
    public final n2w g() {
        return (n2w) this.h.getValue();
    }

    @Override // xsna.pbw
    public final orw h() {
        return this.d;
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ t3v0 i() {
        return u3v0.a;
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ cim j() {
        return dim.a;
    }

    @Override // xsna.pbw
    public final vok0 k(String str) {
        return new wok0(str);
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ cxs0 l() {
        return dxs0.a;
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ jkb m() {
        return kkb.a;
    }

    @Override // xsna.pbw
    public final PerformanceReporters n() {
        return (tw90) this.e.getValue();
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ cb20 o() {
        return db20.a;
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ gxv p() {
        return hxv.a;
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ lau0 q() {
        return mau0.a;
    }

    @Override // xsna.pbw
    public final /* bridge */ /* synthetic */ mvw r() {
        return nvw.a;
    }

    @Override // xsna.pbw
    public final e38 s() {
        return (e38) this.a.getValue();
    }

    @Override // xsna.pbw
    public final n2n0 t() {
        return (o2n0) this.g.getValue();
    }

    @Override // xsna.pbw
    public final LongPollReporter u() {
        return q400.a;
    }

    @Override // xsna.pbw
    public final uz30 v() {
        return this.c;
    }

    @Override // xsna.pbw
    public final k0w w() {
        return new l0w();
    }

    @Override // xsna.pbw
    public final mwv x() {
        return (lwv) this.f.getValue();
    }

    @Override // xsna.pbw
    public final yz2 y() {
        return (yz2) this.i.getValue();
    }

    @Override // xsna.pbw
    public final m400 z() {
        return n400.a;
    }
}
