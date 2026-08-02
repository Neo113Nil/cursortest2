package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import xsna.apn;

/* loaded from: classes10.dex */
public final class rz2 extends DivActionHandler {
    public final qu a;
    public ph0 b;

    public rz2(qu quVar) {
        this.a = quVar;
    }

    public final void a(ph0 ph0Var) {
        ph0 ph0Var2 = this.b;
        if (ph0Var2 != null) {
            ph0Var2.c.b = null;
        }
        if (ph0Var != null) {
            ph0Var.c.b = this.a;
        }
        this.b = ph0Var;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(divAction, divViewFacade, expressionResolver)) {
            return true;
        }
        ph0 ph0Var = this.b;
        return ph0Var != null && ph0Var.handleAction(divAction, divViewFacade, expressionResolver);
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(apn apnVar, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(apnVar, divViewFacade, expressionResolver)) {
            return true;
        }
        ph0 ph0Var = this.b;
        return ph0Var != null && ph0Var.handleAction(apnVar, divViewFacade, expressionResolver);
    }
}
