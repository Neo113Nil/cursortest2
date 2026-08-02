package xsna;

import xsna.xd2;

/* compiled from: AndroidViewHolder.android.kt */
/* loaded from: classes11.dex */
final class jc8 extends d730<pc8> {
    public final xd2.k a;

    public jc8(xd2.k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jc8) {
            return this.a == ((jc8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final pc8 r() {
        return new pc8(this.a);
    }

    @Override // xsna.d730
    public final void s(pc8 pc8Var) {
        pc8 pc8Var2 = pc8Var;
        xd2.k kVar = this.a;
        pc8Var2.p = kVar;
        if (pc8Var2.o) {
            kVar.invoke(pc8Var2.q);
        }
    }
}
