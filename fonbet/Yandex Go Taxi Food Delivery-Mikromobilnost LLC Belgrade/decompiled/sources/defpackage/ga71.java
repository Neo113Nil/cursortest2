package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import org.json.JSONObject;
import yads.ak2;

/* loaded from: classes7.dex */
public final class ga71 implements plk {
    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        ak2 ak2Var = new ak2(div2View.getContext());
        JSONObject jSONObject = clkVar.i;
        if (jSONObject != null) {
            if (jSONObject.has("is_focusable")) {
                ak2Var.setFocusable(jSONObject.optBoolean("is_focusable"));
            }
            if (jSONObject.has("descendant_focusability")) {
                ak2Var.setDescendantFocusability(jSONObject.optInt("descendant_focusability"));
            }
        }
        return ak2Var;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return "rating".equals(str);
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
