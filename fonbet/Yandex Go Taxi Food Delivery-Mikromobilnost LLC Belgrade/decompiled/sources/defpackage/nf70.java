package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class nf70 extends rf70 {
    public final ArrayList a;

    public nf70(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final Collection b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf70) && this.a.equals(((nf70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
