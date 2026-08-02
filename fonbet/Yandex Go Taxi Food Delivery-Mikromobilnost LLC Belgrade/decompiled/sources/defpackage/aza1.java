package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class aza1 implements lya1 {
    public final ArrayList a;

    public aza1(Context context, vya1 vya1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (vya1Var.c()) {
            arrayList.add(new b1b1(context, vya1Var));
        }
    }

    @Override // defpackage.lya1
    public final void a(wl91 wl91Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lya1) it.next()).a(wl91Var);
        }
    }
}
