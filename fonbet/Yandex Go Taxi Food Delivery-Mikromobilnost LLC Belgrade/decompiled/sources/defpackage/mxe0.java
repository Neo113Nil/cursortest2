package defpackage;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.a;
import com.yandex.div2.DivContainer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mxe0 implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        List<bpk> list;
        String str;
        if ((view instanceof ViewGroup) && (egkVar instanceof DivContainer) && (list = ((DivContainer) egkVar).s) != null) {
            for (bpk bpkVar : list) {
                if (jl40.l(bpkVar.a, "pressed_color")) {
                    JSONObject jSONObject = bpkVar.b;
                    if (jSONObject == null || (str = jSONObject.getString("value")) == null) {
                        str = "#EDEFF2";
                    }
                    try {
                        int parseColor = Color.parseColor((String) new a("pressed_color_key", str, new vld0(22), new z3k(14), new qxk(1), wm11.c, null).a(div2View.getExpressionResolver()));
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(parseColor));
                        stateListDrawable.addState(new int[0], new ColorDrawable(0));
                        ((ViewGroup) view).setBackground(stateListDrawable);
                    } catch (Throwable unused) {
                    }
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
                    if (jl40.l(((bpk) it.next()).a, "pressed_color")) {
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
