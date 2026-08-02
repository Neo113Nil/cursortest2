package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class bfc {
    public final ArrayList a;

    public bfc(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfc) && this.a.equals(((bfc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("ColorFragment(value="), this.a, ')');
    }
}
