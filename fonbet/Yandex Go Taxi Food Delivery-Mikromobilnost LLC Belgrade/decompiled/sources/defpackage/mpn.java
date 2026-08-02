package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mpn implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object obj;
        JSONObject jSONObject;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "education_view_id")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null && (jSONObject = bpkVar.b) != null) {
                String optString = jSONObject.optString("view_id");
                if (optString == null) {
                    x4c.g("view_id is missing for extension education_view_id", null, null, null, 14);
                    return;
                } else {
                    li91.j(view, optString);
                    return;
                }
            }
        }
        x4c.g("No params found for extension education_view_id", null, null, null, 14);
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
            if (jl40.l(((bpk) it.next()).a, "education_view_id")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        li91.d(view);
        li91.j(view, null);
    }
}
