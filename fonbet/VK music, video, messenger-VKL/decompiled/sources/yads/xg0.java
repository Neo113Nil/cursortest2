package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes10.dex */
public abstract class xg0 {
    public static final rz2 a(Div2View div2View) {
        DivActionHandler actionHandler = div2View.getActionHandler();
        rz2 rz2Var = actionHandler instanceof rz2 ? (rz2) actionHandler : null;
        if (rz2Var != null) {
            return rz2Var;
        }
        rz2 rz2Var2 = new rz2(new qu());
        div2View.setActionHandler(rz2Var2);
        return rz2Var2;
    }
}
