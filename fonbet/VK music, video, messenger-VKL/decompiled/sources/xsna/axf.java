package xsna;

import android.content.Context;
import com.google.android.gms.maps.model.MarkerOptions;
import xsna.twf;

/* compiled from: ClusterRendererBridge.kt */
/* loaded from: classes3.dex */
public final class axf<T extends twf> extends mcl<jbr0<? extends T>> implements zwf<T> {
    public bxf s;

    public axf(Context context, ndr0 ndr0Var, kbr0<T> kbr0Var) {
        super(context, ndr0Var.a, kbr0Var);
    }

    @Override // xsna.zwf
    public final void a(twf twfVar, qdr0 qdr0Var) {
        super.l((jbr0) twfVar, qdr0Var.a);
    }

    @Override // xsna.zwf
    public final boolean b(xwf xwfVar) {
        return super.n(new ywf(xwfVar));
    }

    @Override // xsna.zwf
    public final void c(xwf xwfVar, qdr0 qdr0Var) {
        qdr0Var.a.c(h(new ywf(xwfVar)));
    }

    @Override // xsna.zwf
    public final void d(twf twfVar, rdr0 rdr0Var) {
        super.j((jbr0) twfVar, rdr0Var.a);
    }

    @Override // xsna.zwf
    public final void e(xwf xwfVar, rdr0 rdr0Var) {
        ywf ywfVar = new ywf(xwfVar);
        rdr0Var.a.e = h(ywfVar);
    }

    @Override // xsna.zwf
    public final fo00 f(jwf<? extends T> jwfVar) {
        eo00 eo00Var = (eo00) this.l.a.get(new ywf(jwfVar));
        if (eo00Var != null) {
            return new qdr0(eo00Var);
        }
        return null;
    }

    @Override // xsna.mcl
    public final void j(uwf uwfVar, MarkerOptions markerOptions) {
        jbr0 jbr0Var = (jbr0) uwfVar;
        bxf bxfVar = this.s;
        if (bxfVar == null) {
            bxfVar = null;
        }
        bxfVar.d(jbr0Var.a, new rdr0(markerOptions));
    }

    @Override // xsna.mcl
    public final void k(kwf<jbr0<T>> kwfVar, MarkerOptions markerOptions) {
        bxf bxfVar = this.s;
        if (bxfVar == null) {
            bxfVar = null;
        }
        bxfVar.e(new xwf(kwfVar), new rdr0(markerOptions));
    }

    @Override // xsna.mcl
    public final void l(uwf uwfVar, eo00 eo00Var) {
        jbr0 jbr0Var = (jbr0) uwfVar;
        bxf bxfVar = this.s;
        if (bxfVar == null) {
            bxfVar = null;
        }
        bxfVar.a(jbr0Var.a, new qdr0(eo00Var));
    }

    @Override // xsna.mcl
    public final void m(kwf<jbr0<T>> kwfVar, eo00 eo00Var) {
        bxf bxfVar = this.s;
        if (bxfVar == null) {
            bxfVar = null;
        }
        bxfVar.c(new xwf(kwfVar), new qdr0(eo00Var));
    }

    @Override // xsna.mcl
    public final boolean n(kwf<jbr0<T>> kwfVar) {
        bxf bxfVar = this.s;
        if (bxfVar == null) {
            bxfVar = null;
        }
        return bxfVar.b(new xwf(kwfVar));
    }
}
