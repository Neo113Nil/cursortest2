package yads;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.g3;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class dh0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        Context context = div2View.getContext();
        tb3 tb3Var = x92.d.a(context).c;
        JSONObject jSONObject = g3Var.i;
        Object obj = jSONObject != null ? jSONObject.get("on_image_url") : null;
        String str = obj instanceof String ? (String) obj : null;
        JSONObject jSONObject2 = g3Var.i;
        Object obj2 = jSONObject2 != null ? jSONObject2.get("off_image_url") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        d83 d83Var = new d83(context);
        if (str != null) {
            d83Var.setCheckedIcon(new BitmapDrawable(context.getResources(), tb3Var.a(str)));
        }
        if (str2 != null) {
            d83Var.setUncheckedIcon(new BitmapDrawable(context.getResources(), tb3Var.a(str2)));
        }
        return d83Var;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return "mute_button".equals(str);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, g3 g3Var) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }
}
