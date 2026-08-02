package xsna;

/* compiled from: TitleRes.kt */
/* loaded from: classes18.dex */
public final class vzo0 implements ezo0 {
    public final String a;

    public vzo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzo0) && epx.f(this.a, ((vzo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TitleString(text="), this.a, ')');
    }
}
