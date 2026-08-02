package com.google.common.collect;

import defpackage.vls;
import java.io.Serializable;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class ByFunctionOrdering<F, T> extends z implements Serializable {
    private static final long serialVersionUID = 0;
    final vls function;
    final z ordering;

    public ByFunctionOrdering(vls vlsVar, z zVar) {
        vlsVar.getClass();
        this.function = vlsVar;
        this.ordering = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.mo489apply(obj), this.function.mo489apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.function, this.ordering);
    }

    public final String toString() {
        return this.ordering + ".onResultOf(" + this.function + Extension.C_BRAKE;
    }
}
