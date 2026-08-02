package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class cno0 {
    public final zuj0 a;
    public final xdf b;

    public cno0(zuj0 zuj0Var, xdf xdfVar) {
        this.a = zuj0Var;
        this.b = xdfVar;
    }

    public final String a(fef fefVar, int i, Object... objArr) {
        Object[] c = c(fefVar, objArr);
        return ((avj0) this.a).i(i, Arrays.copyOf(c, c.length));
    }

    public final String b(fef fefVar, String str, Object... objArr) {
        Object[] c = c(fefVar, objArr);
        Object[] copyOf = Arrays.copyOf(c, c.length);
        return String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public final Object[] c(fef fefVar, Object[] objArr) {
        ArrayList arrayList;
        String str;
        String str2;
        String str3 = fefVar.c;
        if (str3 == null || evu0.J(str3) || (str = fefVar.d) == null || evu0.J(str) || (str2 = fefVar.b) == null || evu0.J(str2)) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof e1f0) {
                    obj = Double.valueOf(((e1f0) obj).a() / 100.0d);
                }
                arrayList.add(obj);
            }
        } else {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                if (obj2 instanceof e1f0) {
                    obj2 = this.b.b(fefVar, Double.valueOf(((e1f0) obj2).a() / 100.0d));
                }
                arrayList.add(obj2);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public final String d(fef fefVar, String str) {
        return this.b.a(fefVar, str, false, true);
    }
}
