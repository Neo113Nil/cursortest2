package defpackage;

import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final class pbk implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        if (!(jbkVar instanceof xak)) {
            return false;
        }
        div2View.hideTooltip((String) ((xak) jbkVar).b.a.a(rvoVar));
        return true;
    }
}
