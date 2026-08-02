package xsna;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public final class l620 {
    public final Runnable a;
    public final CopyOnWriteArrayList<c820> b = new CopyOnWriteArrayList<>();
    public final HashMap c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* loaded from: classes11.dex */
    public static class a {
        public final Lifecycle a;
        public androidx.lifecycle.l b;

        public a(Lifecycle lifecycle, androidx.lifecycle.l lVar) {
            this.a = lifecycle;
            this.b = lVar;
            lifecycle.addObserver(lVar);
        }

        public final void a() {
            this.a.removeObserver(this.b);
            this.b = null;
        }
    }

    public l620(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(c820 c820Var) {
        this.b.remove(c820Var);
        a aVar = (a) this.c.remove(c820Var);
        if (aVar != null) {
            aVar.a();
        }
        this.a.run();
    }
}
