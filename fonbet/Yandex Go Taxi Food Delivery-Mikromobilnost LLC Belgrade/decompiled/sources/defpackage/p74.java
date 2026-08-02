package defpackage;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes10.dex */
public final class p74 extends sy80 {
    public final Surface a;
    public final Size b;
    public final int c;

    public p74(Surface surface, Size size, int i) {
        if (surface == null) {
            ny61.t("Null surface");
            throw null;
        }
        this.a = surface;
        if (size == null) {
            ny61.t("Null size");
            throw null;
        }
        this.b = size;
        this.c = i;
    }

    @Override // defpackage.sy80
    public final int a() {
        return this.c;
    }

    @Override // defpackage.sy80
    public final Size b() {
        return this.b;
    }

    @Override // defpackage.sy80
    public final Surface c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sy80)) {
            return false;
        }
        sy80 sy80Var = (sy80) obj;
        return this.a.equals(sy80Var.c()) && this.b.equals(sy80Var.b()) && this.c == sy80Var.a();
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", imageFormat=");
        return oyr.m(this.c, "}", sb);
    }
}
