package defpackage;

/* loaded from: classes9.dex */
public final class cip0 {
    public int a;

    public final int a(int i, boolean z) {
        int i2 = z ? 1 : -1;
        int abs = Math.abs(this.a + i2);
        int i3 = this.a;
        if (abs > 2) {
            i2 = -i3;
            this.a = 0;
        } else {
            this.a = i3 + i2;
        }
        return i + i2;
    }
}
