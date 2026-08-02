package yads;

import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.g3;

/* loaded from: classes10.dex */
public final class ah0 implements DivCustomContainerViewAdapter {
    public final DivCustomContainerViewAdapter[] a;

    public ah0(DivCustomContainerViewAdapter... divCustomContainerViewAdapterArr) {
        this.a = divCustomContainerViewAdapterArr;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        DivCustomContainerViewAdapter divCustomContainerViewAdapter;
        View createView;
        DivCustomContainerViewAdapter[] divCustomContainerViewAdapterArr = this.a;
        int length = divCustomContainerViewAdapterArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                divCustomContainerViewAdapter = null;
                break;
            }
            divCustomContainerViewAdapter = divCustomContainerViewAdapterArr[i];
            if (divCustomContainerViewAdapter.isCustomTypeSupported(g3Var.j)) {
                break;
            }
            i++;
        }
        return (divCustomContainerViewAdapter == null || (createView = divCustomContainerViewAdapter.createView(g3Var, div2View, expressionResolver, divStatePath)) == null) ? new View(div2View.getContext()) : createView;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        for (DivCustomContainerViewAdapter divCustomContainerViewAdapter : this.a) {
            if (divCustomContainerViewAdapter.isCustomTypeSupported(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, g3 g3Var) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, g3 g3Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }
}
