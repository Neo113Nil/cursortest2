package defpackage;

import androidx.compose.animation.core.a;

/* loaded from: classes10.dex */
public final class ejs0 {
    public final a a;
    public long b;

    public ejs0(a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ejs0) {
            ejs0 ejs0Var = (ejs0) obj;
            if (this.a == ejs0Var.a && k6w.a(this.b, ejs0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) k6w.b(this.b)) + ')';
    }
}
