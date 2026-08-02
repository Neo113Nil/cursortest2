package xsna;

import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: Attributes.java */
/* loaded from: classes11.dex */
public interface q94 {
    static jk3 j(i94 i94Var, Object obj) {
        return (i94Var == null || i94Var.getKey().isEmpty() || obj == null) ? jk3.e : new jk3(new Object[]{i94Var, obj});
    }

    static jk3 k(i94 i94Var, Object obj, i94 i94Var2, Object obj2) {
        return (i94Var == null || i94Var.getKey().isEmpty() || obj == null) ? j(i94Var2, obj2) : (i94Var2 == null || i94Var2.getKey().isEmpty() || obj2 == null) ? j(i94Var, obj) : i94Var.getKey().equals(i94Var2.getKey()) ? j(i94Var2, obj2) : i94Var.getKey().compareTo(i94Var2.getKey()) > 0 ? new jk3(new Object[]{i94Var2, obj2, i94Var, obj}) : new jk3(new Object[]{i94Var, obj, i94Var2, obj2});
    }

    void forEach(BiConsumer<? super i94<?>, ? super Object> biConsumer);

    Map<i94<?>, Object> i();

    boolean isEmpty();

    int size();

    lk3 toBuilder();
}
