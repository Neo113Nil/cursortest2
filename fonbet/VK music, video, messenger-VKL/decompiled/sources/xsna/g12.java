package xsna;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class g12 extends wn4 {
    public final int a;

    public g12(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g12) && ((g12) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
