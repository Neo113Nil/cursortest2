package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class m7 {
    public final u3s a;

    public m7(u3s u3sVar) {
        this.a = u3sVar;
    }

    public static pre a(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        pre preVar = null;
        while (it.hasNext() && preVar == null) {
            pre preVar2 = (pre) it.next();
            if (jl40.l(preVar2.getType(), str) && jl40.l(preVar2.getId(), str2)) {
                preVar = preVar2;
            } else if (preVar2 instanceof kg31) {
                preVar = a(str, str2, ((kg31) preVar2).b);
            }
        }
        return preVar;
    }

    public final l7 b(String str) {
        return new l7(0, new q98(new mth(this.a.a(), 6), 1), this, str);
    }

    public abstract String c();

    public abstract tpr d(String str);
}
