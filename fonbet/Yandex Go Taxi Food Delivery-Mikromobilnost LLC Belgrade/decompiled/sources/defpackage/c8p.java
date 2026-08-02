package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes10.dex */
public final class c8p {
    public final Object a;
    public final a b;

    public c8p(o0t0 o0t0Var, a aVar) {
        this.a = o0t0Var;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c8p) {
            c8p c8pVar = (c8p) obj;
            return jl40.l(this.a, c8pVar.a) && this.b == c8pVar.b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
