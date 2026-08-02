package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class jf3 implements Comparator {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ jf3(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3;
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                hf3 hf3Var = (hf3) obj;
                hf3 hf3Var2 = (hf3) obj2;
                if (hf3Var != null || hf3Var2 != null) {
                    if (hf3Var != null) {
                        if (hf3Var2 != null) {
                            Class<?> cls = hf3Var.getClass();
                            Class<?> cls2 = hf3Var2.getClass();
                            if (!cls.equals(cls2)) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        Class cls3 = (Class) obj3;
                                        if (!jl40.l(cls3, cls) && !jl40.l(cls3, cls2)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                if (jl40.l((Class) obj3, cls)) {
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                return 0;
            default:
                return Integer.valueOf(list.indexOf(((yck0) obj).a)).compareTo(Integer.valueOf(list.indexOf(((yck0) obj2).a)));
        }
    }
}
