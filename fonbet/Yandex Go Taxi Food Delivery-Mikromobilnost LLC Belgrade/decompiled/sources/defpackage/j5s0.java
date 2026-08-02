package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivContainer;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class j5s0 implements dpk {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public static List a(egk egkVar) {
        boolean z = egkVar instanceof hsk;
        EmptyList emptyList = EmptyList.a;
        if (z) {
            hsk hskVar = (hsk) egkVar;
            ?? r0 = hskVar.d;
            if (r0 != 0) {
                emptyList = r0;
            }
            return a.m0(scc.h(hskVar.b), emptyList);
        }
        if (egkVar instanceof ffl) {
            ffl fflVar = (ffl) egkVar;
            ?? r02 = fflVar.d;
            if (r02 != 0) {
                emptyList = r02;
            }
            return a.m0(scc.h(fflVar.b), emptyList);
        }
        if (egkVar instanceof psk) {
            psk pskVar = (psk) egkVar;
            ?? r03 = pskVar.d;
            if (r03 != 0) {
                emptyList = r03;
            }
            return a.m0(scc.h(pskVar.b), emptyList);
        }
        if (!(egkVar instanceof DivContainer)) {
            return emptyList;
        }
        DivContainer divContainer = (DivContainer) egkVar;
        ?? r04 = divContainer.d;
        if (r04 != 0) {
            emptyList = r04;
        }
        return a.m0(scc.h(divContainer.b), emptyList);
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        List a = a(egkVar);
        if (a.isEmpty()) {
            return;
        }
        view.setOnLongClickListener(new run(view, this, a));
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List list;
        List extensions = egkVar.getExtensions();
        Object obj = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, "debug_show_actions_by_longtap")) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        if (obj == null || a(egkVar).isEmpty()) {
            return false;
        }
        if (egkVar instanceof hsk) {
            List list2 = ((hsk) egkVar).A;
            return list2 == null || list2.isEmpty();
        }
        if (egkVar instanceof ffl) {
            List list3 = ((ffl) egkVar).J;
            return list3 == null || list3.isEmpty();
        }
        if (!(egkVar instanceof psk)) {
            return !(egkVar instanceof DivContainer) || (list = ((DivContainer) egkVar).G) == null || list.isEmpty();
        }
        List list4 = ((psk) egkVar).D;
        return list4 == null || list4.isEmpty();
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        view.setOnLongClickListener(null);
    }
}
