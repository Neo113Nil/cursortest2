package com.google.common.collect;

import defpackage.oyr;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class CompoundOrdering<T> extends z implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] comparators;

    /* JADX WARN: Multi-variable type inference failed */
    public CompoundOrdering(z zVar, Comparator comparator) {
        z[] zVarArr = (Comparator<? super T>[]) new Comparator[2];
        zVarArr[0] = zVar;
        zVarArr[1] = comparator;
        this.comparators = zVarArr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.comparators, ((CompoundOrdering) obj).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public final String toString() {
        return oyr.t(new StringBuilder("Ordering.compound("), Arrays.toString(this.comparators), Extension.C_BRAKE);
    }
}
