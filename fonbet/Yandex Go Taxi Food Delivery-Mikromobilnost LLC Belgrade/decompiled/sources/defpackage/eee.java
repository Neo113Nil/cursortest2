package defpackage;

import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class eee extends fll {
    public final String a;
    public final ArrayList b = new ArrayList();

    public eee(String str) {
        this.a = str;
    }

    @Override // defpackage.fll
    public final void a(m3k m3kVar, aw5 aw5Var, b bVar) {
        if (jl40.l(m3kVar.d().getId(), this.a)) {
            this.b.add(new cxk(m3kVar, aw5Var.b));
        }
    }

    public final cxk i(Div2View div2View) {
        omk omkVar = div2View.get_divData();
        if (omkVar == null) {
            return null;
        }
        h(omkVar, div2View.getBindingContext());
        ArrayList arrayList = this.b;
        boolean isEmpty = arrayList.isEmpty();
        String str = this.a;
        if (isEmpty) {
            div2View.logError(new RuntimeException(oyr.p("Error resolving container. Elements that respond to id '", str, "' are not found.")));
            return null;
        }
        if (arrayList.size() <= 1) {
            return (cxk) a.P(arrayList);
        }
        div2View.logError(new RuntimeException(oyr.p("Error resolving container. Found multiple elements that respond to id '", str, "'.")));
        return null;
    }
}
