package xsna;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: ByFunctionOrdering.java */
/* loaded from: classes13.dex */
public final class lt8<F, T> extends yx80<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final szs<F, ? extends T> function;
    final yx80<T> ordering;

    public lt8(szs<F, ? extends T> szsVar, yx80<T> yx80Var) {
        szsVar.getClass();
        this.function = szsVar;
        yx80Var.getClass();
        this.ordering = yx80Var;
    }

    @Override // java.util.Comparator
    public final int compare(F f, F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lt8) {
            lt8 lt8Var = (lt8) obj;
            if (this.function.equals(lt8Var.function) && this.ordering.equals(lt8Var.ordering)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public final String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
