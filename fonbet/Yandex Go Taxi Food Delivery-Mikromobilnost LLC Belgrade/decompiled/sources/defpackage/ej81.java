package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ej81 extends gr81 {
    @Override // defpackage.gr81
    public final LinkedHashMap b(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.b(context));
        a271 a271Var = ((fe81) this.b).d.a;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            linkedHashMap.put("width", Integer.valueOf(jd81Var.b(context)));
            linkedHashMap.put("height", Integer.valueOf(jd81Var.a(context)));
        }
        return linkedHashMap;
    }
}
