package yads;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.g3;
import kotlin.Result;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class eh0 implements DivCustomContainerViewAdapter {
    public static Integer a(g3 g3Var, String str) {
        Object failure;
        JSONObject jSONObject = g3Var.i;
        try {
            failure = Integer.valueOf(Color.parseColor(jSONObject != null ? jSONObject.optString(str) : null));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Integer) (failure instanceof Result.Failure ? null : failure);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer a = a(g3Var, "progress_color");
        if (a != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(a.intValue()));
        }
        Integer a2 = a(g3Var, "background_color");
        if (a2 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(a2.intValue()));
        }
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, g3 g3Var) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }
}
