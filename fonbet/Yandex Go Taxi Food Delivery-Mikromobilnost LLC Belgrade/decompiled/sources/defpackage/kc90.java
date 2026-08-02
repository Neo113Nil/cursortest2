package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class kc90 extends d6z {
    public final /* synthetic */ int f;
    public final /* synthetic */ d6z g;

    public /* synthetic */ kc90(d6z d6zVar, int i) {
        this.f = i;
        this.g = d6zVar;
    }

    @Override // defpackage.d6z
    public final void c(q5j0 q5j0Var, Object obj) {
        int i = this.f;
        d6z d6zVar = this.g;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        d6zVar.c(q5j0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        d6zVar.c(q5j0Var, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
