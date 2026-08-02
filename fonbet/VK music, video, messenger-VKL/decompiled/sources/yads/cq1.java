package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class cq1 extends fq1 {
    public cq1(d4 d4Var) {
        super(d4Var);
    }

    @Override // yads.fq1
    public final Map a(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.a(context));
        e13 e13Var = this.a.d.a;
        if (e13Var != null) {
            linkedHashMap.put("width", Integer.valueOf(e13Var.c(context)));
            linkedHashMap.put("height", Integer.valueOf(e13Var.a(context)));
        }
        return linkedHashMap;
    }
}
