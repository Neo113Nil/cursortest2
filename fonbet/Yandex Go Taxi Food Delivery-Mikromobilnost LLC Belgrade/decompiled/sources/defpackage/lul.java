package defpackage;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.x0;
import com.yandex.div2.c3;
import flex.engine.a;
import flex.section.divkit.cache.DivWrapperView;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class lul extends v0x {
    public final j3k c;
    public final w0j d;
    public final jul e;
    public final vol f;
    public final rzl g;
    public final kul h = new kul(0);

    public lul(j3k j3kVar, w0j w0jVar, jul julVar, vol volVar, lb7 lb7Var) {
        this.c = j3kVar;
        this.d = w0jVar;
        this.e = julVar;
        this.f = volVar;
        this.g = lb7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    @Override // defpackage.v0x
    public final boolean a(x0 x0Var, u0x u0xVar, List list) {
        oc9 oc9Var;
        hul hulVar = (hul) x0Var;
        aul aulVar = (aul) u0xVar;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                oc9Var = 0;
                break;
            }
            oc9Var = listIterator.previous();
            if (oc9Var instanceof oc9) {
                break;
            }
        }
        oc9 oc9Var2 = oc9Var instanceof oc9 ? oc9Var : null;
        if (oc9Var2 == null) {
            return false;
        }
        List<? extends c3> list2 = oc9Var2.a;
        hulVar.N.updateActionHandler(new gul(0, aulVar.k));
        DivWrapperView divWrapperView = hulVar.N;
        hulVar.R = aulVar.a.a;
        y2l y2lVar = oc9Var2.b;
        if (y2lVar != null) {
            divWrapperView.applyPatch(y2lVar);
        }
        if (!list2.isEmpty()) {
            divWrapperView.updateVariables(list2);
        }
        return !oc9Var2.c;
    }

    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        hul hulVar = (hul) x0Var;
        aul aulVar = (aul) u0xVar;
        String str = aulVar.l;
        xvl xvlVar = aulVar.a;
        gul gulVar = new gul(0, aulVar.k);
        mw5 mw5Var = aulVar.p;
        cql cqlVar = new cql(hulVar.N, str, gulVar);
        vol volVar = hulVar.O;
        dee a = volVar != null ? volVar.a(cqlVar) : null;
        hulVar.P = a;
        if (a != null) {
            a.c = mw5Var;
            a.b(xvlVar.b.a, xvlVar.c, null);
        }
        hulVar.R = xvlVar.a;
    }

    @Override // defpackage.v0x
    public final boolean c(x0 x0Var, u0x u0xVar) {
        ((hul) x0Var).N.updateActionHandler(new gul(0, ((aul) u0xVar).k));
        return true;
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        hul a = this.e.a(new DivWrapperView(this.c, viewGroup.getContext()));
        a.O = this.f;
        a.Q = this.g;
        return a;
    }

    @Override // defpackage.v0x
    public final pdh e() {
        return this.h;
    }

    @Override // defpackage.v0x
    public final void f(x0 x0Var) {
        hul hulVar = (hul) x0Var;
        w0j w0jVar = this.d;
        ((a) w0jVar.b).m().a(hulVar);
        a aVar = (a) w0jVar.b;
        if (aVar.m().w.a(Lifecycle.State.STARTED)) {
            hulVar.onStart(w0jVar);
        }
        if (aVar.m().w.a(Lifecycle.State.RESUMED)) {
            hulVar.onResume(w0jVar);
        }
    }

    @Override // defpackage.v0x
    public final void g(x0 x0Var) {
        ((a) this.d.b).m().d((hul) x0Var);
    }

    @Override // defpackage.v0x
    public final void h(x0 x0Var) {
        hul hulVar = (hul) x0Var;
        dee deeVar = hulVar.P;
        if (deeVar != null) {
            deeVar.a();
        }
        hulVar.P = null;
    }
}
