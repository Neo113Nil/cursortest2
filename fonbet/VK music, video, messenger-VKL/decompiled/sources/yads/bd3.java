package yads;

import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes10.dex */
public abstract class bd3 {
    public static final void a(sv3 sv3Var, fp2 fp2Var) {
        String str;
        Set set;
        try {
            c a = fp2Var.a();
            if (a == null || (str = a.a()) == null) {
                str = "";
            }
            c a2 = fp2Var.a();
            if (a2 == null || (set = a2.b()) == null) {
                set = EmptySet.b;
            }
            sv3Var.a(str);
            sv3Var.a(set);
            Objects.toString(set);
        } catch (Throwable th) {
            th.toString();
        }
    }
}
