package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import org.json.JSONObject;
import yads.d53;
import yads.h72;

/* loaded from: classes7.dex */
public final class q071 implements plk {
    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        Context context = div2View.getContext();
        lm71 lm71Var = mf71.d.a(context).c;
        JSONObject jSONObject = clkVar.i;
        Object obj = jSONObject != null ? jSONObject.get("on_image_url") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = jSONObject != null ? jSONObject.get("off_image_url") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        d53 d53Var = new d53(context);
        if (str != null) {
            Resources resources = context.getResources();
            lm71Var.getClass();
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            d53Var.setCheckedIcon(new BitmapDrawable(resources, (Bitmap) ((h72) lm71Var.b).get(ae81.a(str))));
        }
        if (str2 != null) {
            Resources resources2 = context.getResources();
            lm71Var.getClass();
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER_INSIDE;
            d53Var.setUncheckedIcon(new BitmapDrawable(resources2, (Bitmap) ((h72) lm71Var.b).get(ae81.a(str2))));
        }
        if (jSONObject != null && jSONObject.has("is_focusable")) {
            d53Var.setFocusable(jSONObject.optBoolean("is_focusable"));
        }
        return d53Var;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return "mute_button".equals(str);
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
