package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h3f0 extends i63 {
    public z7t0[] f;
    public int g;
    public kjz h;

    @Override // defpackage.i63
    public final z7t0 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.g; i2++) {
            z7t0[] z7t0VarArr = this.f;
            z7t0 z7t0Var = z7t0VarArr[i2];
            if (!zArr[z7t0Var.b]) {
                kjz kjzVar = this.h;
                kjzVar.b = z7t0Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((z7t0) kjzVar.b).A[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    z7t0 z7t0Var2 = z7t0VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = z7t0Var2.A[i3];
                            float f3 = ((z7t0) kjzVar.b).A[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.i63
    public final boolean e() {
        return this.g == 0;
    }

    @Override // defpackage.i63
    public final void i(ijy ijyVar, i63 i63Var, boolean z) {
        z7t0 z7t0Var = i63Var.a;
        if (z7t0Var == null) {
            return;
        }
        float[] fArr = z7t0Var.A;
        o53 o53Var = i63Var.d;
        int d = o53Var.d();
        for (int i = 0; i < d; i++) {
            z7t0 e = o53Var.e(i);
            float f = o53Var.f(i);
            kjz kjzVar = this.h;
            kjzVar.b = e;
            if (e.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((z7t0) kjzVar.b).A;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((z7t0) kjzVar.b).A[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((h3f0) kjzVar.c).k((z7t0) kjzVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((z7t0) kjzVar.b).A[i3] = f4;
                    } else {
                        ((z7t0) kjzVar.b).A[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (i63Var.b * f) + this.b;
        }
        k(z7t0Var);
    }

    public final void j(z7t0 z7t0Var) {
        int i = this.g + 1;
        z7t0[] z7t0VarArr = this.f;
        if (i > z7t0VarArr.length) {
            z7t0[] z7t0VarArr2 = (z7t0[]) Arrays.copyOf(z7t0VarArr, z7t0VarArr.length * 2);
            this.f = z7t0VarArr2;
        }
        z7t0[] z7t0VarArr3 = this.f;
        int i2 = this.g;
        z7t0VarArr3[i2] = z7t0Var;
        int i3 = i2 + 1;
        this.g = i3;
        if (i3 > 1) {
            int i4 = z7t0Var.b;
        }
        z7t0Var.a = true;
        z7t0Var.a(this);
    }

    public final void k(z7t0 z7t0Var) {
        int i = 0;
        while (i < this.g) {
            if (this.f[i] == z7t0Var) {
                while (true) {
                    int i2 = this.g;
                    if (i >= i2 - 1) {
                        this.g = i2 - 1;
                        z7t0Var.a = false;
                        return;
                    } else {
                        z7t0[] z7t0VarArr = this.f;
                        int i3 = i + 1;
                        z7t0VarArr[i] = z7t0VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.i63
    public final String toString() {
        kjz kjzVar = this.h;
        String i = uw51.i(new StringBuilder(" goal -> ("), this.b, ") : ");
        for (int i2 = 0; i2 < this.g; i2++) {
            kjzVar.b = this.f[i2];
            i = i + kjzVar + " ";
        }
        return i;
    }
}
