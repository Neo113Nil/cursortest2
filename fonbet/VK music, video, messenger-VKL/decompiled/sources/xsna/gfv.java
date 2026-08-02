package xsna;

/* compiled from: TextLayout.android.kt */
/* loaded from: classes11.dex */
public final class gfv {
    public final fjo0 a;
    public int b = -1;
    public float c;

    public gfv(fjo0 fjo0Var) {
        this.a = fjo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(boolean z, int i, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        int i3 = 1;
        fjo0 fjo0Var = this.a;
        if (z) {
            int s = xa4.s(fjo0Var.f, i, z);
            int lineStart = fjo0Var.f.getLineStart(s);
            int f = fjo0Var.f(s);
            if (i == lineStart || i == f) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.b != i2) {
                    return this.c;
                }
                float h = z3 ? fjo0Var.h(i, z) : fjo0Var.i(i, z);
                if (z2) {
                    this.b = i2;
                    this.c = h;
                }
                return h;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.b != i2) {
        }
    }
}
