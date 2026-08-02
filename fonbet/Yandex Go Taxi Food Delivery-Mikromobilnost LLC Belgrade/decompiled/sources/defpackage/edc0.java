package defpackage;

/* loaded from: classes13.dex */
public final class edc0 implements p1c0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r12 < 8.0f) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public edc0(int i, float f, fdc0 fdc0Var, float f2) {
        float f3 = i / f;
        odc0 odc0Var = fdc0Var.c;
        boolean z = true;
        int i2 = 0;
        boolean z2 = f3 <= odc0Var.a || f2 >= odc0Var.b;
        this.a = z2;
        if (z2) {
            double d = f3;
            if (d > 0.4d) {
                if (f2 < 12.0f) {
                    if (d <= 0.7d) {
                    }
                }
            }
            this.b = z;
            int i3 = odc0Var.c;
            float f4 = fdc0Var.a;
            this.c = (int) (i3 * f4);
            this.d = (int) fdc0Var.b;
            this.e = (int) ((f2 < 19.0f ? 75.0f : 100.0f) * f4);
            iq31 iq31Var = odc0Var.d;
            int rint = (int) Math.rint((iq31Var.b * f) + iq31Var.a);
            iq31 iq31Var2 = odc0Var.e;
            int rint2 = (int) Math.rint((iq31Var2.b * f) + iq31Var2.a);
            iq31 iq31Var3 = odc0Var.f;
            int rint3 = (int) Math.rint((iq31Var3.b * f) + iq31Var3.a);
            this.f = z ? 0 : rint3;
            if (!z) {
                i2 = rint2;
            } else if (z2) {
                i2 = rint2 + rint3;
            }
            this.g = i2;
            this.h = z2 ? rint : rint + rint2 + rint3;
        }
        z = false;
        this.b = z;
        int i32 = odc0Var.c;
        float f42 = fdc0Var.a;
        this.c = (int) (i32 * f42);
        this.d = (int) fdc0Var.b;
        this.e = (int) ((f2 < 19.0f ? 75.0f : 100.0f) * f42);
        iq31 iq31Var4 = odc0Var.d;
        int rint4 = (int) Math.rint((iq31Var4.b * f) + iq31Var4.a);
        iq31 iq31Var22 = odc0Var.e;
        int rint22 = (int) Math.rint((iq31Var22.b * f) + iq31Var22.a);
        iq31 iq31Var32 = odc0Var.f;
        int rint32 = (int) Math.rint((iq31Var32.b * f) + iq31Var32.a);
        this.f = z ? 0 : rint32;
        if (!z) {
        }
        this.g = i2;
        this.h = z2 ? rint4 : rint4 + rint22 + rint32;
    }

    @Override // defpackage.p1c0
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.p1c0
    public final int b() {
        return this.h;
    }

    @Override // defpackage.p1c0
    public final int c() {
        return this.g;
    }

    @Override // defpackage.p1c0
    public final int d() {
        return this.e;
    }

    @Override // defpackage.p1c0
    public final boolean e() {
        return false;
    }

    @Override // defpackage.p1c0
    public final int f() {
        return this.c;
    }

    @Override // defpackage.p1c0
    public final int g() {
        return this.f;
    }

    @Override // defpackage.p1c0
    public final int h() {
        return this.d;
    }

    @Override // defpackage.p1c0
    public final boolean i() {
        return this.b;
    }
}
