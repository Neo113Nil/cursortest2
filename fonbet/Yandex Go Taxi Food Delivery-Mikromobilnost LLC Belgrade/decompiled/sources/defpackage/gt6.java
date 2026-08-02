package defpackage;

import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gt6 {
    public final Div2View a;
    public int b;
    public mmk c;
    public boolean d = true;
    public final ArrayList e = new ArrayList();

    public gt6(Div2View div2View) {
        this.a = div2View;
    }

    public final void a() {
        mmk mmkVar = this.c;
        if (mmkVar == null) {
            return;
        }
        long j = mmkVar.b;
        Div2View div2View = this.a;
        long currentStateId = div2View.getCurrentStateId();
        ArrayList arrayList = this.e;
        if (j != currentStateId) {
            div2View.switchToState(j, this.d);
        } else if (div2View.getChildCount() != 0) {
            try {
                div2View.getViewComponent().m().a(div2View.getBindingContext(), mmkVar, ym11.g(arrayList) ? Collections.unmodifiableList(new ArrayList(arrayList)) : arrayList);
            } catch (StateConflictException e) {
                div2View.logError(e);
                div2View.resetToInitialState();
            }
        }
        this.c = null;
        this.d = true;
        arrayList.clear();
    }

    public final void b(mmk mmkVar, List list, boolean z) {
        mmk mmkVar2 = this.c;
        ArrayList arrayList = this.e;
        if (mmkVar2 != null && !jl40.l(mmkVar, mmkVar2)) {
            this.c = null;
            this.d = true;
            arrayList.clear();
        }
        this.c = mmkVar;
        this.d = this.d && z;
        List<b> list2 = list;
        ycc.r(list2, arrayList);
        for (b bVar : list2) {
            Div2View div2View = this.a;
            div2View.getDiv2Component().getStateManager().d(div2View.getDivTag().a, bVar, z);
        }
        if (this.b == 0) {
            a();
        }
    }
}
