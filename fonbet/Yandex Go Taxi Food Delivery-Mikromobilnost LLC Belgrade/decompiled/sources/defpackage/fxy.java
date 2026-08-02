package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class fxy {
    public final l6e0 a;
    public final List b;
    public final String c;

    public fxy(Class cls, Class cls2, Class cls3, List list, l6e0 l6e0Var) {
        this.a = l6e0Var;
        if (list.isEmpty()) {
            ny61.g("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final otj0 a(int i, int i2, xjg xjgVar, cpg cpgVar, mg70 mg70Var) {
        l6e0 l6e0Var = this.a;
        Object a = l6e0Var.a();
        z2a1.e(a, "Argument must not be null");
        List list = (List) a;
        try {
            List list2 = this.b;
            int size = list2.size();
            otj0 otj0Var = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    otj0Var = ((vxg) list2.get(i3)).a(i, i2, xjgVar, cpgVar, mg70Var);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (otj0Var != null) {
                    break;
                }
            }
            if (otj0Var != null) {
                return otj0Var;
            }
            throw new GlideException(this.c, new ArrayList(list));
        } finally {
            l6e0Var.a0(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
