package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class h491 {
    public y391 a;
    public y391 b;
    public final ArrayList c;

    public h491() {
        this.a = new y391("", 0L, null);
        this.b = new y391("", 0L, null);
        this.c = new ArrayList();
    }

    public final y391 a() {
        return this.a;
    }

    public final void b(y391 y391Var) {
        this.a = y391Var;
        this.b = y391Var.clone();
        this.c.clear();
    }

    public final y391 c() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        h491 h491Var = new h491(this.a.clone());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            h491Var.c.add(((y391) it.next()).clone());
        }
        return h491Var;
    }

    public final List d() {
        return this.c;
    }

    public h491(y391 y391Var) {
        this.a = y391Var;
        this.b = y391Var.clone();
        this.c = new ArrayList();
    }
}
