package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: Action.kt */
/* loaded from: classes13.dex */
public final class zt<T> {
    public final T a;
    public final int b;
    public final Drawable c;
    public final CharSequence d;

    /* JADX WARN: Multi-variable type inference failed */
    public zt(u8m u8mVar, int i, Drawable drawable, CharSequence charSequence) {
        this.a = u8mVar;
        this.b = i;
        this.c = drawable;
        this.d = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt)) {
            return false;
        }
        zt ztVar = (zt) obj;
        return epx.f(this.a, ztVar.a) && this.b == ztVar.b && epx.f(this.c, ztVar.c) && epx.f(this.d, ztVar.d);
    }

    public final int hashCode() {
        T t = this.a;
        int a = shy.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31);
        Drawable drawable = this.c;
        int hashCode = (a + (drawable == null ? 0 : drawable.hashCode())) * 31;
        CharSequence charSequence = this.d;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action(id=");
        sb.append(this.a);
        sb.append(", group=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", label=");
        return thl0.a(sb, this.d, ')');
    }
}
