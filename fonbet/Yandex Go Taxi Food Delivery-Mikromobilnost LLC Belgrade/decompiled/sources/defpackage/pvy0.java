package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class pvy0 {
    public String a;
    public final ArrayList b = new ArrayList();

    public final void a(String str) {
        if (jl40.l(this.a, str)) {
            return;
        }
        this.a = str;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((gvy0) it.next()).onThemeChanged(str);
        }
    }
}
