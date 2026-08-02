package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class isb1 implements bsb1 {
    public final ArrayList a;

    public isb1(Context context, gsb1 gsb1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (gsb1Var.c()) {
            arrayList.add(new ktb1(context, gsb1Var));
        }
    }

    @Override // defpackage.bsb1
    public final void a(o3 o3Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bsb1) it.next()).a(o3Var);
        }
    }
}
