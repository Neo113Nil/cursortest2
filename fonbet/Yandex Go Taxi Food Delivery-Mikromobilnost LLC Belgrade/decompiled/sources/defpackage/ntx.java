package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ntx implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        ArrayList arrayList;
        Object obj;
        JSONObject jSONObject;
        int i;
        RecyclerView recyclerView;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "divkit_scroll_last_item")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            x43 x43Var = new x43();
            x43Var.addLast(view);
            while (true) {
                i = 3;
                if (x43Var.isEmpty()) {
                    jst.e.getClass();
                    recyclerView = null;
                    break;
                }
                View view2 = (View) x43Var.removeFirst();
                if (view2 instanceof RecyclerView) {
                    recyclerView = (RecyclerView) view2;
                    break;
                } else if (view2 instanceof ViewGroup) {
                    Iterator it2 = new i73(i, (ViewGroup) view2).iterator();
                    while (true) {
                        h8 h8Var = (h8) it2;
                        if (h8Var.hasNext()) {
                            x43Var.addLast((View) h8Var.next());
                        }
                    }
                }
            }
            if (recyclerView == null) {
                return;
            }
            RecyclerView.e layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            u2l u2lVar = new u2l(eg90.b);
            JSONArray optJSONArray = jSONObject.optJSONArray("onLastItemChange");
            if (optJSONArray != null) {
                int i2 = 0;
                ltx ltxVar = new ltx(u2lVar, i2);
                ArrayList arrayList2 = new ArrayList();
                int length = optJSONArray.length();
                while (i2 < length) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject == null) {
                        jst.e.getClass();
                    } else {
                        try {
                            arrayList2.add(ltxVar.invoke(optJSONObject));
                        } catch (Exception unused) {
                            jst.e.getClass();
                        }
                    }
                    i2++;
                }
                arrayList = arrayList2;
            }
            mtx mtxVar = new mtx(linearLayoutManager, arrayList, div2View, rvoVar);
            recyclerView.addOnScrollListener(mtxVar);
            tje.F(view).a(new dxg(i, recyclerView, mtxVar));
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "divkit_scroll_last_item")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        tje.m(view);
    }
}
