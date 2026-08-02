package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a6v implements dpk {
    public final LinkedHashMap a = b.l(new Pair("payments_method_title", Integer.valueOf(l9h0.payments_method_title)), new Pair("recycler_view", Integer.valueOf(l9h0.recycler_view)), new Pair("banks_recycler_view", Integer.valueOf(l9h0.banks_recycler_view)));

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        String J;
        Integer num;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : extensions) {
                bpk bpkVar = (bpk) obj;
                if (jl40.l(bpkVar.a, "id_ext") || jl40.l(bpkVar.a, "id_extension_for_list")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = ((bpk) it.next()).b;
                if (jSONObject != null && (J = cvw.J("id", jSONObject)) != null && (num = (Integer) this.a.get(J)) != null) {
                    view.setId(num.intValue());
                }
            }
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        Boolean bool;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            List list = extensions;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (jl40.l(((bpk) it.next()).a, "id_ext")) {
                        z = true;
                        break;
                    }
                }
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        return n891.o(bool);
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }
}
