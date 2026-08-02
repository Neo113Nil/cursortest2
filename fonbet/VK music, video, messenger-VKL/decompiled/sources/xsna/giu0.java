package xsna;

/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class giu0 {
    public final int a;

    public giu0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof giu0) && this.a == ((giu0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Res(resId="), this.a, ')');
    }
}
