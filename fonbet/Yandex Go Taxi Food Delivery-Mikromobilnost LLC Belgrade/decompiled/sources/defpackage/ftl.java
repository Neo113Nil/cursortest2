package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import core.divkit.view.DivViewLayout;

/* loaded from: classes4.dex */
public final class ftl extends gfe {
    public final zmk A;
    public qnh B;
    public final w0j a;
    public final b3k b;
    public final tls c;
    public final n530 w;
    public final o530 x;
    public final vol y;
    public final l3k z;

    public ftl(w0j w0jVar, b3k b3kVar, cyl cylVar, tls tlsVar, n530 n530Var, o530 o530Var, vol volVar) {
        a851 a851Var = new a851(new s7s0(23));
        this.a = w0jVar;
        this.b = b3kVar;
        this.c = tlsVar;
        this.w = n530Var;
        this.x = o530Var;
        this.y = volVar;
        this.z = new l3k(cylVar, a851Var);
        this.A = new zmk("divkit-content");
    }

    @Override // defpackage.gfe
    public final boolean b(elc elcVar) {
        return false;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        DivViewLayout b = l3k.b(this.z, this.b.a(viewGroup.getContext(), this.a), new ViewGroup.LayoutParams(-1, -1));
        this.B = new qnh(b);
        return b;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        qnh qnhVar = this.B;
        if (qnhVar != null) {
            DivViewLayout divViewLayout = (DivViewLayout) qnhVar.a;
            divViewLayout.getDivView().cleanup();
            divViewLayout.getDivView().setActionHandler(null);
        }
        this.B = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        tg2 tg2Var;
        qnh qnhVar;
        Div2View divView;
        tg2 tg2Var2;
        qnh qnhVar2;
        Div2View divView2;
        nie nieVar = (nie) obj;
        etl etlVar = (etl) nieVar.c;
        boolean z = nieVar.e;
        dtl dtlVar = etlVar.d;
        o530 o530Var = this.x;
        if (z) {
            if (dtlVar != null && (tg2Var2 = dtlVar.b) != null && (qnhVar2 = this.B) != null && (divView2 = ((DivViewLayout) qnhVar2.a).getDivView()) != null) {
                o530Var.p(tg2Var2, new ryh(divView2));
            }
        } else if (dtlVar != null && (tg2Var = dtlVar.a) != null && (qnhVar = this.B) != null && (divView = ((DivViewLayout) qnhVar.a).getDivView()) != null) {
            o530Var.p(tg2Var, new ryh(divView));
        }
        cnr0 cnr0Var = nieVar.d;
        qnh qnhVar3 = this.B;
        if (qnhVar3 != null) {
            dee a = this.y.a((DivViewLayout) qnhVar3.a);
            omk omkVar = etlVar.a.a;
            String str = etlVar.c;
            a.b(omkVar, str != null ? new zmk(str) : this.A, new lc0(qnhVar3, this, etlVar, cnr0Var, 17));
        }
    }

    public /* synthetic */ ftl(w0j w0jVar, b3k b3kVar, cyl cylVar, lhj lhjVar, n530 n530Var, o530 o530Var) {
        this(w0jVar, b3kVar, cylVar, lhjVar, n530Var, o530Var, vol.a);
    }
}
