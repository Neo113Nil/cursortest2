package xsna;

/* compiled from: CircularList.kt */
/* loaded from: classes12.dex */
public final class ldc {
    public final int a;

    public ldc(int i) {
        this.a = i;
    }

    public final int a(int i) {
        int i2 = this.a;
        int i3 = i % i2;
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i3 + i2;
    }
}
