package xsna;

import xsna.is60;

/* compiled from: NewsfeedSearchViewState.kt */
/* loaded from: classes4.dex */
public final class wy60 implements lm50 {
    public final String b;
    public final is60.a c;
    public final bip d;

    public wy60(String str, is60.a aVar, bip bipVar) {
        this.b = str;
        this.c = aVar;
        this.d = bipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy60)) {
            return false;
        }
        wy60 wy60Var = (wy60) obj;
        return epx.f(this.b, wy60Var.b) && epx.f(this.c, wy60Var.c) && epx.f(this.d, wy60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NewsfeedSearchViewState(hint=" + this.b + ", listViewState=" + this.c + ", emptyViewState=" + this.d + ')';
    }
}
