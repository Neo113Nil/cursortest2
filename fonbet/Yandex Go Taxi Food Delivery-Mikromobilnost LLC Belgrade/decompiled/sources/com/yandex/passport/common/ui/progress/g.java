package com.yandex.passport.common.ui.progress;

import defpackage.unr0;

/* loaded from: classes8.dex */
public final class g {
    public static final g e = new g(new a(0), r.a, e.a, true);
    public final c a;
    public final u b;
    public final f c;
    public final boolean d;

    public g(c cVar, u uVar, f fVar, boolean z) {
        this.a = cVar;
        this.b = uVar;
        this.c = fVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressProperties(animation=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", showCancelButton=");
        return unr0.u(sb, this.d, ')');
    }
}
