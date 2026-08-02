package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes9.dex */
public final class oy1 implements je60 {
    public final uwd a;
    public final ArrayList b;

    public oy1(uwd uwdVar, ArrayList arrayList) {
        this.a = uwdVar;
        this.b = arrayList;
    }

    @Override // defpackage.s7s
    public final m9s a() {
        return this.a.a();
    }

    @Override // defpackage.s7s
    public final wf90 b() {
        ListBuilder a = rcc.a();
        a.add(this.a.b());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a.add(((s7s) it.next()).b());
        }
        return new wf90(EmptyList.a, a.j());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oy1)) {
            return false;
        }
        oy1 oy1Var = (oy1) obj;
        return this.a.equals(oy1Var.a) && this.b.equals(oy1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return smw0.m(new StringBuilder("AlternativesParsing("), this.b, ')');
    }
}
