package defpackage;

import java.util.Iterator;
import kotlin.a;

/* loaded from: classes6.dex */
public final class ewn0 {
    public final i3y a;
    public boolean b;

    public ewn0(sls slsVar) {
        this.a = a.a(slsVar);
    }

    public final boolean a() {
        return this.b;
    }

    public final void b() {
        this.b = false;
        Iterator it = ((dwn0) this.a.getValue()).a.iterator();
        while (it.hasNext()) {
            ((cwn0) it.next()).onDismiss();
        }
    }

    public final void c() {
        this.b = true;
        Iterator it = ((dwn0) this.a.getValue()).a.iterator();
        while (it.hasNext()) {
            ((cwn0) it.next()).b();
        }
    }
}
