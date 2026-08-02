package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public final class otv0 {
    public final WeakHashMap a = new WeakHashMap();

    public static final class a {
        public boolean a;
        public zph b;
    }

    public static final void c(otv0 otv0Var, u45 u45Var, a aVar, View view, ogu0 ogu0Var) {
        if (otv0Var.a.get(u45Var) == aVar && view.getWidth() > 0 && view.getHeight() > 0) {
            aVar.a = true;
            ogu0Var.invoke();
        }
    }

    public final void a() {
        Iterator it = kotlin.collections.a.J0(this.a.keySet()).iterator();
        while (it.hasNext()) {
            b((u45) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(u45 u45Var) {
        a aVar = (a) this.a.remove(u45Var);
        if (aVar == null) {
            return;
        }
        View view = u45Var instanceof View ? (View) u45Var : null;
        if (view != null) {
            view.removeOnLayoutChangeListener(aVar.b);
        }
    }
}
