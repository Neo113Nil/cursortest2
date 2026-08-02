package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SystemStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class grn0 implements frn0 {
    public final tgl0 a;

    public grn0(tgl0 tgl0Var) {
        this.a = tgl0Var;
    }

    @Override // xsna.frn0
    public final void a(long j, long j2) {
        this.a.I0().k().j(defpackage.k0.a(j, "lp_ts_channel-"), j2);
    }

    @Override // xsna.frn0
    public final int b() {
        return this.a.I0().k().getInt("phase_managed_groups", 1);
    }

    @Override // xsna.frn0
    public final void c(int i) {
        this.a.I0().k().putInt("phase", i);
    }

    @Override // xsna.frn0
    public final int d() {
        return this.a.I0().k().getInt("phase", 1);
    }

    @Override // xsna.frn0
    public final void e(int i, String str) {
        this.a.I0().k().putInt("phase_channel-".concat(str), i);
    }

    @Override // xsna.frn0
    public final Long f(long j) {
        return this.a.I0().k().h("lp_ts_channel-" + j);
    }

    @Override // xsna.frn0
    public final void g() {
        this.a.I0().k().delete("lp_ts_channels");
    }

    @Override // xsna.frn0
    public final Long h(String str) {
        return this.a.I0().k().h("lp_ts_channel-".concat(str));
    }

    @Override // xsna.frn0
    public final void i(int i) {
        this.a.I0().k().putInt("phase_channels", i);
    }

    @Override // xsna.frn0
    public final int j() {
        return this.a.I0().k().getInt("phase_channels", 1);
    }

    @Override // xsna.frn0
    public final Long k() {
        return this.a.I0().k().h("lp_ts");
    }

    @Override // xsna.frn0
    public final void l(long j) {
        this.a.I0().k().j("lp_ts_channels", j);
    }

    @Override // xsna.frn0
    public final void m(int i, long j) {
        this.a.I0().k().putInt("phase_channel-" + j, i);
    }

    @Override // xsna.frn0
    public final int n(String str) {
        return this.a.I0().k().getInt("phase_channel-".concat(str), 1);
    }

    @Override // xsna.frn0
    public final void o(long j, String str) {
        this.a.I0().k().j("lp_ts_channel-".concat(str), j);
    }

    @Override // xsna.frn0
    public final Long p() {
        return this.a.I0().k().h("lp_ts_channels");
    }

    @Override // xsna.frn0
    public final Long q() {
        return this.a.I0().k().h("lp_pts");
    }

    @Override // xsna.frn0
    public final int r(long j) {
        return this.a.I0().k().getInt("phase_channel-" + j, 1);
    }

    @Override // xsna.frn0
    public final void s(List<Long> list) {
        List<Long> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add("phase_channel-" + ((Number) it.next()).longValue());
        }
        this.a.I0().k().a(arrayList);
    }

    @Override // xsna.frn0
    public final void t(long j) {
        this.a.I0().k().j("lp_pts", j);
    }

    @Override // xsna.frn0
    public final void u(long j) {
        this.a.I0().k().j("lp_ts", j);
    }

    @Override // xsna.frn0
    public final int v() {
        return ((Number) this.a.b().h(new qzl0(this, 7))).intValue();
    }

    @Override // xsna.frn0
    public final void w(List<Long> list) {
        List<Long> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add("lp_ts_channel-" + ((Number) it.next()).longValue());
        }
        this.a.I0().k().a(arrayList);
    }
}
