package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final class nlk {
    public static void a(View view, int i, m3k m3kVar, b bVar, Div2View div2View, rvo rvoVar) {
        String a;
        hgk E = div2View.getDiv2Component().E();
        aw5 a2 = div2View.getBindingContext().a(rvoVar);
        egk d = m3kVar.d();
        if (d instanceof dbl) {
            dbl dblVar = (dbl) d;
            a = dblVar.p;
            if (a == null && (a = dblVar.x) == null) {
                a = "";
            }
        } else {
            String id = d.getId();
            a = id == null ? mpb.a(i) : id;
        }
        E.b(a2, view, m3kVar, bVar.a(a));
        div2View.getRuntimeStore().g(m3kVar.d());
    }

    public static View b(nlk nlkVar, m3k m3kVar, b bVar, Div2View div2View) {
        rvo expressionResolver = div2View.getExpressionResolver();
        nlkVar.getClass();
        z2k v = div2View.getDiv2Component().v();
        aw5 a = div2View.getBindingContext().a(expressionResolver);
        View a2 = v.a(m3kVar, a, bVar);
        v.b.b(a, a2, m3kVar, bVar);
        return a2;
    }
}
