package com.yandex.passport.internal.flags.experiments;

import defpackage.jl40;
import defpackage.smw0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class l extends n {
    public final ExperimentsOperator a;
    public final ArrayList b;

    public l(ExperimentsOperator experimentsOperator, ArrayList arrayList) {
        this.a = experimentsOperator;
        this.b = arrayList;
    }

    @Override // com.yandex.passport.internal.flags.experiments.n
    public final boolean a(d dVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l((String) obj, dVar.a)) {
                break;
            }
        }
        String str = (String) obj;
        boolean z = false;
        if (c.a[this.a.ordinal()] != 1 ? str == null : str != null) {
            z = true;
        }
        return !z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b.equals(lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdRestriction(operator=");
        sb.append(this.a);
        sb.append(", listId=");
        return smw0.m(sb, this.b, ')');
    }
}
