package defpackage;

import com.yandex.plus.core.gradient.api.PlusDrawable;

/* loaded from: classes2.dex */
public final class dht implements fht {
    public final PlusDrawable a;

    public dht(PlusDrawable plusDrawable) {
        this.a = plusDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dht) && jl40.l(this.a, ((dht) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GradientDrawable(drawable=" + this.a + ')';
    }
}
