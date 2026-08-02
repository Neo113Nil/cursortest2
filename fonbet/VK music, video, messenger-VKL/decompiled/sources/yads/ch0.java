package yads;

import android.view.View;
import com.ironsource.X3;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.g3;

/* loaded from: classes10.dex */
public final class ch0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        return new CustomizableMediaView(div2View.getContext());
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return X3.i.I0.equals(str);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, g3 g3Var) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }
}
