package xsna;

/* compiled from: Selection.kt */
/* loaded from: classes7.dex */
public final class sbi0 {
    public final int a;

    public sbi0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbi0) && this.a == ((sbi0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return h5s.c(this.a, ", isMultiPickerEnabled=true)", new StringBuilder("GoodsMultiPickerConfig(limit="));
    }
}
