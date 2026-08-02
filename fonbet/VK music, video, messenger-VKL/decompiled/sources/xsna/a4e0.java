package xsna;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: ProgressiveJpegParser.java */
/* loaded from: classes12.dex */
public final class a4e0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final ut8 h;

    public a4e0(ut8 ut8Var) {
        ut8Var.getClass();
        this.h = ut8Var;
        this.c = 0;
        this.b = 0;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.a = 0;
    }

    public final boolean a(jvb0 jvb0Var) {
        int read;
        int i = this.e;
        while (this.a != 6 && (read = jvb0Var.read()) != -1) {
            try {
                int i2 = this.c;
                this.c = i2 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i3 = this.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.a = 5;
                                } else if (i3 != 5) {
                                    sex0.f(false);
                                } else {
                                    int i4 = ((this.b << 8) + read) - 2;
                                    k7b0.k(jvb0Var, i4);
                                    this.c += i4;
                                    this.a = 2;
                                }
                            } else if (read == 255) {
                                this.a = 3;
                            } else if (read == 0) {
                                this.a = 2;
                            } else if (read == 217) {
                                this.g = true;
                                int i5 = i2 - 1;
                                int i6 = this.d;
                                if (i6 > 0) {
                                    this.f = i5;
                                }
                                this.d = i6 + 1;
                                this.e = i6;
                                this.a = 2;
                            } else {
                                if (read == 218) {
                                    int i7 = i2 - 1;
                                    int i8 = this.d;
                                    if (i8 > 0) {
                                        this.f = i7;
                                    }
                                    this.d = i8 + 1;
                                    this.e = i8;
                                }
                                if (read != 1 && ((read < 208 || read > 215) && read != 217 && read != 216)) {
                                    this.a = 4;
                                }
                                this.a = 2;
                            }
                        } else if (read == 255) {
                            this.a = 3;
                        }
                    } else if (read == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (read == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = read;
            } catch (IOException e) {
                s200.K(e);
                throw new RuntimeException(e);
            }
        }
        return (this.a == 6 || this.e == i) ? false : true;
    }

    public final boolean b(rip ripVar) {
        if (this.a == 6 || ripVar.r() <= this.c) {
            return false;
        }
        InputStream p = ripVar.p();
        p.getClass();
        ut8 ut8Var = this.h;
        jvb0 jvb0Var = new jvb0(p, ut8Var.get(16384), ut8Var);
        try {
            try {
                k7b0.k(jvb0Var, this.c);
                return a(jvb0Var);
            } catch (IOException e) {
                s200.K(e);
                throw new RuntimeException(e);
            }
        } finally {
            yvf.b(jvb0Var);
        }
    }
}
