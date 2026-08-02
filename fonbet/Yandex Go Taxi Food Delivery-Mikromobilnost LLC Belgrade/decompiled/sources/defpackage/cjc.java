package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class cjc implements di41 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.di41
    public final void k(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((di41) it.next()).k(str);
        }
    }

    @Override // defpackage.di41
    public final void s(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((di41) it.next()).s(str);
        }
    }
}
