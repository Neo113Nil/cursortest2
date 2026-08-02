package xsna;

import xsna.tlo0;

/* compiled from: CategoryItem.kt */
/* loaded from: classes16.dex */
public final class vka implements hfz {
    public final fld b;
    public final tlo0.h c;
    public final CharSequence d;
    public final boolean e;

    public vka(fld fldVar, tlo0.h hVar, CharSequence charSequence, boolean z) {
        this.b = fldVar;
        this.c = hVar;
        this.d = charSequence;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vka)) {
            return false;
        }
        vka vkaVar = (vka) obj;
        return epx.f(this.b, vkaVar.b) && this.c.equals(vkaVar.c) && epx.f(this.d, vkaVar.d) && this.e == vkaVar.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + u11.c(u11.c(this.b.hashCode() * 31, 31, this.c.a), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryItem(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append((Object) this.d);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
