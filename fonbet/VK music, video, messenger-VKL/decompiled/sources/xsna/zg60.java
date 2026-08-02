package xsna;

import xsna.is60;

/* compiled from: NewsfeedCustomViewState.kt */
/* loaded from: classes4.dex */
public final class zg60 implements lm50 {
    public final String b;
    public final is60.a c;
    public final boolean d;

    public zg60(String str, is60.a aVar, boolean z) {
        this.b = str;
        this.c = aVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg60)) {
            return false;
        }
        zg60 zg60Var = (zg60) obj;
        return epx.f(this.b, zg60Var.b) && epx.f(this.c, zg60Var.c) && this.d == zg60Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCustomViewState(title=");
        sb.append(this.b);
        sb.append(", listViewState=");
        sb.append(this.c);
        sb.append(", isEmptyVisible=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
