package xsna;

/* compiled from: CounterItem.kt */
/* loaded from: classes4.dex */
public final class rxj {
    public final int a;

    public rxj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxj) && this.a == ((rxj) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("CounterItem(count="), this.a, ')');
    }
}
