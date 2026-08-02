package defpackage;

import com.yandex.div.core.view2.Div2View;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class obk {
    public final HashSet a;

    public obk(HashSet hashSet) {
        this.a = hashSet;
    }

    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((nbk) obj).a(str, jbkVar, div2View, rvoVar)) {
                break;
            }
        }
        boolean z = obj != null;
        if (!z) {
            int i = wfx.a;
        }
        return z;
    }
}
