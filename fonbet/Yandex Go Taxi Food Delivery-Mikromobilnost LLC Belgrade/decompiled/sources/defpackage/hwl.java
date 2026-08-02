package defpackage;

import com.yandex.div.core.Div2Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hwl implements gvy0 {
    public final gqq a;
    public final z131 b = new z131(DivkitThemeChangeListener.THEME_VARIABLE_NAME, "<default>");

    public hwl(gqq gqqVar) {
        this.a = gqqVar;
        gqqVar.d.add(new bwl(1, this));
    }

    @Override // defpackage.gvy0
    public final void onThemeChanged(String str) {
        z131 z131Var = this.b;
        z131Var.g(str);
        Iterator it = this.a.c.values().iterator();
        while (it.hasNext()) {
            ((Div2Context) it.next()).getDivVariableController().i(z131Var);
        }
    }
}
