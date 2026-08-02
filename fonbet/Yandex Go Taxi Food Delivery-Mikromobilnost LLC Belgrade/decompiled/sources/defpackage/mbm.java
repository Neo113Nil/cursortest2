package defpackage;

import android.graphics.drawable.Drawable;
import coil.graphics.DataSource;

/* loaded from: classes10.dex */
public final class mbm extends iwq {
    public final Drawable a;
    public final boolean b;
    public final DataSource c;

    public mbm(Drawable drawable, boolean z, DataSource dataSource) {
        this.a = drawable;
        this.b = z;
        this.c = dataSource;
    }

    public final DataSource a() {
        return this.c;
    }

    public final Drawable b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbm)) {
            return false;
        }
        mbm mbmVar = (mbm) obj;
        return jl40.l(this.a, mbmVar.a) && this.b == mbmVar.b && this.c == mbmVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }
}
