package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class s32 implements tz1 {
    public final z02 a;

    public s32(z02 z02Var) {
        this.a = z02Var;
    }

    @Override // yads.tz1
    public final void a(Context context, sz1 sz1Var, nj2 nj2Var, rz1 rz1Var, y02 y02Var, g02 g02Var, i02 i02Var) {
        List list = sz1Var.a.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pz1 a = this.a.a(context, sz1Var, nj2Var, rz1Var, y02Var, g02Var, (gz1) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            i02Var.a(h9.a);
        } else {
            i02Var.a(arrayList);
        }
    }

    public /* synthetic */ s32(ov2 ov2Var) {
        this(new z02(ov2Var));
    }
}
