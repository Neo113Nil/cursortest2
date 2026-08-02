package xsna;

/* compiled from: ProfileFabState.kt */
/* loaded from: classes5.dex */
public final class dwd0 {
    public final int a;

    public dwd0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwd0) && this.a == ((dwd0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("RightButton(textId="), this.a, ')');
    }
}
