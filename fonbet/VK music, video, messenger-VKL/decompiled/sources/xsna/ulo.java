package xsna;

import android.graphics.Bitmap;

/* compiled from: ViewBlur.kt */
/* loaded from: classes17.dex */
public final class ulo {
    public final tny a;
    public final d52 b;
    public final Bitmap c;

    public ulo(tny tnyVar, d52 d52Var, Bitmap bitmap) {
        this.a = tnyVar;
        this.b = d52Var;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulo)) {
            return false;
        }
        ulo uloVar = (ulo) obj;
        return epx.f(this.a, uloVar.a) && this.b.equals(uloVar.b) && epx.f(this.c, uloVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawingState(coordinates=");
        sb.append(this.a);
        sb.append(", canvas=");
        sb.append(this.b);
        sb.append(", bitmap=");
        return qr.c(sb, this.c, ')');
    }
}
