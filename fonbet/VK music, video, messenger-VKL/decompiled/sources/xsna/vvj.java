package xsna;

import kotlin.coroutines.d;

/* compiled from: CoroutineName.kt */
/* loaded from: classes11.dex */
public final class vvj extends kotlin.coroutines.a {
    public static final a c = new a();
    public final String b;

    /* compiled from: CoroutineName.kt */
    public static final class a implements d.c<vvj> {
    }

    public vvj(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvj) && epx.f(this.b, ((vvj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
