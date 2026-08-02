package xsna;

/* compiled from: TitleRes.kt */
/* loaded from: classes18.dex */
public final class tzo0 implements ezo0 {
    public final int a;

    public tzo0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzo0) && this.a == ((tzo0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("TitleRes(title="), this.a, ')');
    }
}
