package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fv60 implements dpk {
    public static void a(rvo rvoVar, String str, String str2, View view, double d, double d2, double d3, double d4, float f) {
        Double i;
        z3k z3kVar = new z3k(14);
        ums umsVar = wm11.c;
        Set set = jdo.c;
        String str3 = (String) rvoVar.b(str, str2, eja1.z(str2), new fd60(14), z3kVar, umsVar, eg90.a);
        double doubleValue = (str3 == null || (i = avu0.i(str3)) == null) ? 0.0d : i.doubleValue();
        double a = x4e.a(d2, d, doubleValue, d);
        double a2 = x4e.a(d4, d3, doubleValue, d3);
        double d5 = f;
        view.setTranslationX((float) (a * d5));
        view.setTranslationY((float) (a2 * d5));
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, final rvo rvoVar, final View view, egk egkVar) {
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
                    if (jl40.l(((bpk) obj).a, "offset")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar == null || (jSONObject = bpkVar.b) == null) {
                return;
            }
            String optString = jSONObject.optString("progress_variable_name");
            if (optString == null) {
                optString = "";
            }
            final String str = optString;
            if (str.length() == 0) {
                return;
            }
            final double optDouble = jSONObject.optDouble("x_min", 0.0d);
            final double optDouble2 = jSONObject.optDouble("x_max", 0.0d);
            final double optDouble3 = jSONObject.optDouble("y_min", 0.0d);
            final double optDouble4 = jSONObject.optDouble("y_max", 0.0d);
            final float f = view.getResources().getDisplayMetrics().density;
            final String p = oyr.p("@{", str, "}");
            a(rvoVar, str, p, view, optDouble, optDouble2, optDouble3, optDouble4, f);
            view.setTag(xah0.ybsdk_offset_progress_variable_subscription, rvoVar.a(p, Collections.singletonList(str), new sls(this) { // from class: ev60
                @Override // defpackage.sls
                public final Object invoke() {
                    fv60.a(rvoVar, str, p, view, optDouble, optDouble2, optDouble3, optDouble4, f);
                    return zy11.a;
                }
            }));
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
            if (jl40.l(((bpk) it.next()).a, "offset")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(xah0.ybsdk_offset_progress_variable_subscription);
        f1k f1kVar = tag instanceof f1k ? (f1k) tag : null;
        if (f1kVar == null) {
            return;
        }
        f1kVar.close();
        view.setTag(xah0.ybsdk_offset_progress_variable_subscription, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
