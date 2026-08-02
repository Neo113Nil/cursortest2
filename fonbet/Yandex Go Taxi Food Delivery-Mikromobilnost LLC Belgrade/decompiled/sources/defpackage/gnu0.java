package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.order.l;

/* loaded from: classes10.dex */
public final class gnu0 {
    public final o370 a;
    public String b;
    public final ArrayList c = new ArrayList();

    public gnu0(o370 o370Var) {
        this.a = o370Var;
    }

    public final void a(String str) {
        this.b = null;
        l lVar = (l) this.a.a;
        lVar.f = false;
        lVar.a();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((fnu0) it.next()).e();
        }
    }

    public final void b(String str) {
        this.b = str;
        l lVar = (l) this.a.a;
        lVar.f = true;
        lVar.a();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((fnu0) it.next()).d(str);
        }
    }
}
