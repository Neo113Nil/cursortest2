package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class b040 {
    public static final /* synthetic */ int e = 0;
    public final j540 a;
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public final n0 d = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    static {
        kgx[] kgxVarArr = j540.c;
    }

    public b040(j540 j540Var) {
        this.a = j540Var;
    }

    public final void a(String str) {
        HashSet hashSet = this.b;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        j540 j540Var = this.a;
        j540Var.getClass();
        HashMap hashMap = new HashMap(j540Var.a());
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new a040(0);
            hashMap.put(str, obj);
        }
        a040 a040Var = (a040) obj;
        a040Var.a++;
        hashMap.put(str, a040Var);
        j540Var.b.setValue(j540Var, j540.c[0], ((xnt) j540Var.a).e(hashMap, j540.d));
    }
}
