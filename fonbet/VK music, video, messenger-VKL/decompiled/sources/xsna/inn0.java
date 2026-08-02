package xsna;

/* compiled from: SwitchRecyclerItem.kt */
/* loaded from: classes16.dex */
public final class inn0 extends v8l {
    public final boolean c;
    public final long d;

    public inn0(boolean z, long j) {
        super(0);
        this.c = z;
        this.d = j;
    }

    @Override // xsna.zif0
    public final long a() {
        return this.d;
    }

    @Override // xsna.zif0
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return inn0.class.equals(obj != null ? obj.getClass() : null) && this.c == ((inn0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
