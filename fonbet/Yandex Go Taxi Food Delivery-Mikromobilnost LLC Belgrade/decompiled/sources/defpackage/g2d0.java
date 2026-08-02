package defpackage;

import com.yandex.plus.core.gradient.api.PlusDrawable;

/* loaded from: classes2.dex */
public final class g2d0 extends h2d0 {
    public final PlusDrawable a;

    public g2d0(PlusDrawable plusDrawable) {
        this.a = plusDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2d0) && jl40.l(this.a, ((g2d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Drawable(drawable=" + this.a + ')';
    }
}
