package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class mvb1 implements jvb1 {
    public final ArrayList a;

    public mvb1(Context context, lvb1 lvb1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (lvb1Var.c()) {
            arrayList.add(new qvb1(context, lvb1Var));
        }
    }

    @Override // defpackage.jvb1
    public final void a(o3 o3Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jvb1) it.next()).a(o3Var);
        }
    }
}
