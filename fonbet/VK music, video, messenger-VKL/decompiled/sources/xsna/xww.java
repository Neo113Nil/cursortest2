package xsna;

import android.content.Context;

/* compiled from: VideoDiskCacheManagerMessages.kt */
/* loaded from: classes8.dex */
public final class xww {
    public final Context a;
    public final bhs0 b;
    public final ny7 c;

    public xww(Context context, bhs0 bhs0Var, ny7 ny7Var) {
        this.a = context;
        this.b = bhs0Var;
        this.c = ny7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xww)) {
            return false;
        }
        xww xwwVar = (xww) obj;
        return epx.f(this.a, xwwVar.a) && this.b.equals(xwwVar.b) && this.c.equals(xwwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InitArgs(context=" + this.a + ", config=" + this.b + ", onResult=" + this.c + ")";
    }
}
