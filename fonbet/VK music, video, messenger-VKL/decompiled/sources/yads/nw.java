package yads;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import xsna.epx;

/* loaded from: classes10.dex */
public final class nw extends DivActionHandler {
    public final mw a;

    public nw(mw mwVar) {
        this.a = mwVar;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression<Uri> expression = divAction.k;
        boolean z = false;
        if (expression != null) {
            String uri = expression.evaluate(expressionResolver).toString();
            if (epx.f(uri, "close_ad")) {
                mw mwVar = this.a;
                ng0.a(mwVar.a);
                mwVar.b.e();
            } else if (epx.f(uri, "close_dialog")) {
                ng0.a(this.a.a);
            }
            z = true;
        }
        return z ? z : super.handleAction(divAction, divViewFacade, expressionResolver);
    }
}
