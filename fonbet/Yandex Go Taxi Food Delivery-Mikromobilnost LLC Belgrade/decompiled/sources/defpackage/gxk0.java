package defpackage;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes.dex */
public final class gxk0 implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        double d;
        Object obj;
        JSONObject jSONObject;
        Expression a;
        Double d2;
        new nlv();
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "rotation_extension")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null && (jSONObject = bpkVar.b) != null && (a = pdx.a(jSONObject, "rotation_angle", b.g, pdx.a, wm11.d)) != null && (d2 = (Double) a.a(rvoVar)) != null) {
                d = d2.doubleValue();
                OneShotPreDrawListener.add(view, new fxk0(view, d));
            }
        }
        d = 0.0d;
        OneShotPreDrawListener.add(view, new fxk0(view, d));
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
            if (jl40.l(((bpk) it.next()).a, "rotation_extension")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        view.setRotation(0.0f);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(mih0.rotation_extension_original_width) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        Object tag2 = view2 != null ? view2.getTag(mih0.rotation_extension_original_height) : null;
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (view2 == null || num == null || num2 == null) {
            return;
        }
        c.D(num.intValue(), view2.getLayoutParams().height, view2);
        c.D(view2.getLayoutParams().width, num2.intValue(), view2);
    }
}
