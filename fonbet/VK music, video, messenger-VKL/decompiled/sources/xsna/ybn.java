package xsna;

/* compiled from: DislikesContentState.kt */
/* loaded from: classes16.dex */
public final class ybn {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ybn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybn)) {
            return false;
        }
        ybn ybnVar = (ybn) obj;
        return this.a == ybnVar.a && this.b == ybnVar.b && this.c == ybnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DislikesContentState(isAvailable=");
        sb.append(this.a);
        sb.append(", isAvailableForItem=");
        sb.append(this.b);
        sb.append(", isDisliked=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public /* synthetic */ ybn(int i) {
        this(true, true, false);
    }

    public ybn(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
