package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

/* loaded from: classes3.dex */
public final class alm0 implements dpk {
    public static void a(rvo rvoVar, String str, String str2, double d, double d2, View view) {
        Double i;
        z3k z3kVar = new z3k(14);
        ums umsVar = wm11.c;
        Set set = jdo.c;
        String str3 = (String) rvoVar.b(str, str2, eja1.z(str2), new i1m0(26), z3kVar, umsVar, eg90.a);
        float doubleValue = (float) (d2 - ((d2 - d) * ((str3 == null || (i = avu0.i(str3)) == null) ? 0.0d : i.doubleValue())));
        view.setScaleX(doubleValue);
        view.setScaleY(doubleValue);
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
                    if (jl40.l(((bpk) obj).a, "scale")) {
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
            final double optDouble = jSONObject.optDouble("min", 1.0d);
            final double optDouble2 = jSONObject.optDouble(CspBioProgressConstants.MAX, 1.0d);
            final String p = oyr.p("@{", str, "}");
            a(rvoVar, str, p, optDouble, optDouble2, view);
            view.setTag(xah0.ybsdk_scale_progress_variable_subscription, rvoVar.a(p, Collections.singletonList(str), new sls(this) { // from class: zkm0
                @Override // defpackage.sls
                public final Object invoke() {
                    alm0.a(rvoVar, str, p, optDouble, optDouble2, view);
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
            if (jl40.l(((bpk) it.next()).a, "scale")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(xah0.ybsdk_scale_progress_variable_subscription);
        f1k f1kVar = tag instanceof f1k ? (f1k) tag : null;
        if (f1kVar == null) {
            return;
        }
        f1kVar.close();
        view.setTag(xah0.ybsdk_scale_progress_variable_subscription, null);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }
}
