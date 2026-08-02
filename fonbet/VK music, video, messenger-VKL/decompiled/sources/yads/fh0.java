package yads;

import android.R;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.g3;
import com.yandex.mobile.ads.R$drawable;
import org.json.JSONObject;
import xsna.epx;

/* loaded from: classes10.dex */
public final class fh0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        int i;
        String str = null;
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = g3Var.i;
        if (jSONObject == null || !jSONObject.has("progress_color")) {
            str = "#000000";
        } else {
            JSONObject jSONObject2 = g3Var.i;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("progress_color");
            }
        }
        try {
            i = Color.parseColor(str);
        } catch (Throwable unused) {
            i = -16777216;
        }
        Drawable drawable = progressBar.getContext().getDrawable(R$drawable.monetization_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return epx.f(str, "close_progress_view");
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, g3 g3Var) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }
}
