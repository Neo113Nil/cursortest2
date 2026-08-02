package yads;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import xsna.ikn;

/* loaded from: classes10.dex */
public final class ci0 implements DivExtensionHandler {
    public final ai0 a;
    public final ei0 b;

    public /* synthetic */ ci0(ai0 ai0Var) {
        this(ai0Var, new ei0());
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
        Context context = view.getContext();
        di0 a = this.b.a(iknVar);
        if (a != null) {
            ou ouVar = new ou(context, new bi0(this.a, a));
            view.setOnTouchListener(ouVar);
            view.setOnClickListener(ouVar);
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(ikn iknVar) {
        return this.b.a(iknVar) != null;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }

    public ci0(ai0 ai0Var, ei0 ei0Var) {
        this.a = ai0Var;
        this.b = ei0Var;
    }
}
