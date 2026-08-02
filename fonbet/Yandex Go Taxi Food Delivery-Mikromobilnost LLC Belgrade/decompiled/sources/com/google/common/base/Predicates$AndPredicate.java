package com.google.common.base;

import defpackage.hie0;
import java.io.Serializable;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
final class Predicates$AndPredicate<T> implements hie0, Serializable {
    private static final long serialVersionUID = 0;
    private final List<? extends hie0> components;

    public Predicates$AndPredicate(List list) {
        this.components = list;
    }

    @Override // defpackage.hie0
    public final boolean apply(Object obj) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!this.components.get(i).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Predicates$AndPredicate) {
            return this.components.equals(((Predicates$AndPredicate) obj).components);
        }
        return false;
    }

    public final int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends hie0> list = this.components;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : list) {
            if (!z) {
                sb.append(HexString.CHAR_COMMA);
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
