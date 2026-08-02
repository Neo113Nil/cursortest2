package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.tsp0;

/* compiled from: PesReader.java */
/* loaded from: classes12.dex */
public final class z1a0 implements tsp0 {
    public final zap a;
    public final wi90 b = new wi90(new byte[10], 10);
    public int c = 0;
    public int d;
    public txo0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public z1a0(zap zapVar) {
        this.a = zapVar;
    }

    @Override // xsna.tsp0
    public final void a(int i, xi90 xi90Var) throws ParserException {
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        zap zapVar = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    ahn.F("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        ahn.F("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    zapVar.d(xi90Var.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (xi90Var.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                wi90 wi90Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (c(xi90Var, wi90Var.b, Math.min(10, this.i)) && c(xi90Var, null, this.i)) {
                            wi90Var.m(0);
                            this.l = C.TIME_UNSET;
                            if (this.f) {
                                wi90Var.o(4);
                                wi90Var.o(1);
                                wi90Var.o(1);
                                long g = (wi90Var.g(15) << 15) | (wi90Var.g(3) << 30) | wi90Var.g(15);
                                wi90Var.o(1);
                                if (!this.h && this.g) {
                                    wi90Var.o(4);
                                    wi90Var.o(1);
                                    wi90Var.o(1);
                                    wi90Var.o(1);
                                    this.e.b((wi90Var.g(3) << 30) | (wi90Var.g(15) << 15) | wi90Var.g(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(g);
                            }
                            i6 |= this.k ? 4 : 0;
                            zapVar.c(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        int a = xi90Var.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : a - i8;
                        if (i9 > 0) {
                            a -= i9;
                            xi90Var.O(xi90Var.b + a);
                        }
                        zapVar.a(xi90Var);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - a;
                            this.j = i11;
                            if (i11 == 0) {
                                zapVar.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (c(xi90Var, wi90Var.b, 9)) {
                    this.c = d() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                xi90Var.Q(xi90Var.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // xsna.tsp0
    public final void b(txo0 txo0Var, rgq rgqVar, tsp0.c cVar) {
        this.e = txo0Var;
        this.a.b(rgqVar, cVar);
    }

    public final boolean c(xi90 xi90Var, @Nullable byte[] bArr, int i) {
        int min = Math.min(xi90Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xi90Var.Q(min);
        } else {
            xi90Var.n(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    public final boolean d() {
        wi90 wi90Var = this.b;
        wi90Var.m(0);
        int g = wi90Var.g(24);
        if (g != 1) {
            sn.d(g, "Unexpected start code prefix: ");
            this.j = -1;
            return false;
        }
        wi90Var.o(8);
        int g2 = wi90Var.g(16);
        wi90Var.o(5);
        this.k = wi90Var.f();
        wi90Var.o(2);
        this.f = wi90Var.f();
        this.g = wi90Var.f();
        wi90Var.o(6);
        int g3 = wi90Var.g(8);
        this.i = g3;
        if (g2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (g2 - 3) - g3;
        this.j = i;
        if (i < 0) {
            ahn.F("Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }

    @Override // xsna.tsp0
    public final void seek() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.seek();
    }
}
