package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ki10 {
    public final Bitmap a;
    public final Map b;

    public ki10(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final Bitmap a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki10)) {
            return false;
        }
        ki10 ki10Var = (ki10) obj;
        return this.a.equals(ki10Var.a) && jl40.l(this.b, ki10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(bitmap=");
        sb.append(this.a);
        sb.append(", extras=");
        return smw0.n(sb, this.b, ')');
    }
}
