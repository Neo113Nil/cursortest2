package xsna;

import java.nio.ByteBuffer;

/* compiled from: ObuParser.java */
/* loaded from: classes12.dex */
public final class rs70 {

    /* compiled from: ObuParser.java */
    public static final class a {
        public final boolean a;

        public a(d dVar, c cVar) throws b {
            int i = cVar.a;
            ByteBuffer byteBuffer = cVar.b;
            fxc0.p(i == 6 || i == 3);
            int min = Math.min(4, byteBuffer.remaining());
            byte[] bArr = new byte[min];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            wi90 wi90Var = new wi90(bArr, min);
            if (dVar.a) {
                throw new b();
            }
            if (wi90Var.f()) {
                this.a = false;
                return;
            }
            int g = wi90Var.g(2);
            boolean f = wi90Var.f();
            if (dVar.b) {
                throw new b();
            }
            if (!f) {
                this.a = true;
                return;
            }
            boolean f2 = (g == 3 || g == 0) ? true : wi90Var.f();
            wi90Var.n();
            if (!dVar.d) {
                throw new b();
            }
            if (wi90Var.f()) {
                if (!dVar.e) {
                    throw new b();
                }
                wi90Var.n();
            }
            if (dVar.c) {
                throw new b();
            }
            if (g != 3) {
                wi90Var.n();
            }
            wi90Var.o(dVar.f);
            if (g != 2 && g != 0 && !f2) {
                wi90Var.o(3);
            }
            this.a = ((g == 3 || g == 0) ? 255 : wi90Var.g(8)) != 0;
        }
    }

    /* compiled from: ObuParser.java */
    public static class b extends Exception {
    }

    /* compiled from: ObuParser.java */
    public static final class c {
        public final int a;
        public final ByteBuffer b;

        public c(int i, ByteBuffer byteBuffer) {
            this.a = i;
            this.b = byteBuffer;
        }
    }

    /* compiled from: ObuParser.java */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;
        public final int k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final int q;
        public final byte r;
        public final byte s;
        public final byte t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        public d(c cVar) throws b {
            int i;
            int i2;
            boolean z;
            ?? r8;
            int i3 = cVar.a;
            ByteBuffer byteBuffer = cVar.b;
            fxc0.p(i3 == 1);
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            wi90 wi90Var = new wi90(bArr, remaining);
            this.g = wi90Var.g(3);
            wi90Var.n();
            boolean f = wi90Var.f();
            this.a = f;
            if (f) {
                i2 = wi90Var.g(5);
                this.b = false;
                this.j = false;
                r8 = 0;
                i = 0;
            } else {
                if (wi90Var.f()) {
                    wi90Var.o(64);
                    if (wi90Var.f()) {
                        int i4 = 0;
                        while (!wi90Var.f()) {
                            i4++;
                        }
                        if (i4 < 32) {
                            wi90Var.o(i4);
                        }
                    }
                    boolean f2 = wi90Var.f();
                    this.b = f2;
                    if (f2) {
                        wi90Var.o(47);
                    }
                } else {
                    this.b = false;
                }
                this.j = wi90Var.f();
                int g = wi90Var.g(5);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = false;
                i = 0;
                while (i6 <= g) {
                    wi90Var.o(12);
                    if (i6 == 0) {
                        i5 = wi90Var.g(5);
                        z = z2;
                        if (i5 > 7) {
                            z = wi90Var.f();
                        }
                    } else {
                        z = z2;
                        if (wi90Var.g(5) > 7) {
                            wi90Var.n();
                            z = z2;
                        }
                    }
                    if (this.b) {
                        wi90Var.n();
                    }
                    if (this.j && wi90Var.f()) {
                        if (i6 == 0) {
                            i = wi90Var.g(4);
                        } else {
                            wi90Var.o(4);
                        }
                    }
                    i6++;
                    z2 = z;
                }
                i2 = i5;
                r8 = z2;
            }
            int g2 = wi90Var.g(4);
            int g3 = wi90Var.g(4);
            wi90Var.o(g2 + 1);
            wi90Var.o(g3 + 1);
            if (this.a) {
                this.c = false;
            } else {
                this.c = wi90Var.f();
            }
            if (this.c) {
                wi90Var.o(4);
                wi90Var.o(3);
            }
            wi90Var.o(3);
            if (this.a) {
                this.e = true;
                this.d = true;
                this.f = 0;
            } else {
                wi90Var.o(4);
                boolean f3 = wi90Var.f();
                if (f3) {
                    wi90Var.o(2);
                }
                if (wi90Var.f()) {
                    this.d = true;
                } else {
                    this.d = wi90Var.f();
                }
                if (!this.d) {
                    this.e = true;
                } else if (wi90Var.f()) {
                    this.e = true;
                } else {
                    this.e = wi90Var.f();
                }
                if (f3) {
                    this.f = wi90Var.g(3) + 1;
                } else {
                    this.f = 0;
                }
            }
            this.h = i2;
            this.i = r8;
            this.k = i;
            wi90Var.o(3);
            boolean f4 = wi90Var.f();
            this.l = f4;
            if (this.g == 2 && f4) {
                this.m = wi90Var.f();
            } else {
                this.m = false;
            }
            if (this.g != 1) {
                this.n = wi90Var.f();
            } else {
                this.n = false;
            }
            if (wi90Var.f()) {
                this.r = (byte) wi90Var.g(8);
                this.s = (byte) wi90Var.g(8);
                this.t = (byte) wi90Var.g(8);
            } else {
                this.r = (byte) 0;
                this.s = (byte) 0;
                this.t = (byte) 0;
            }
            if (this.n) {
                wi90Var.n();
                this.o = false;
                this.p = false;
                this.q = 0;
            } else if (this.r == 1 && this.s == 13 && this.t == 0) {
                this.o = false;
                this.p = false;
                this.q = 0;
            } else {
                wi90Var.n();
                int i7 = this.g;
                if (i7 == 0) {
                    this.o = true;
                    this.p = true;
                } else if (i7 == 1) {
                    this.o = false;
                    this.p = false;
                } else if (this.m) {
                    boolean f5 = wi90Var.f();
                    this.o = f5;
                    if (f5) {
                        this.p = wi90Var.f();
                    } else {
                        this.p = false;
                    }
                } else {
                    this.o = true;
                    this.p = false;
                }
                if (this.o && this.p) {
                    this.q = wi90Var.g(2);
                } else {
                    this.q = 0;
                }
            }
            wi90Var.n();
        }
    }
}
