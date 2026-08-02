package androidx.datastore.preferences.protobuf;

import defpackage.bci0;
import defpackage.fac;
import defpackage.fvf0;
import defpackage.ny61;
import defpackage.pqw;
import defpackage.qyo;
import defpackage.tom0;
import defpackage.tqw;
import defpackage.yv4;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements bci0 {
    public final yv4 a;
    public int b;
    public int c;
    public int d = 0;

    public f(yv4 yv4Var) {
        Charset charset = tqw.a;
        this.a = yv4Var;
        yv4Var.b = this;
    }

    public static void y(int i) {
        if ((i & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static void z(int i) {
        if ((i & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.y();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj, tom0 tom0Var, qyo qyoVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            tom0Var.g(obj, this, qyoVar);
            if (this.b == this.c) {
            } else {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, tom0 tom0Var, qyo qyoVar) {
        yv4 yv4Var = this.a;
        int z = yv4Var.z();
        if (yv4Var.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int h = yv4Var.h(z);
        yv4Var.a++;
        tom0Var.g(obj, this, qyoVar);
        yv4Var.a(0);
        yv4Var.a--;
        yv4Var.g(h);
    }

    public final void d(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Boolean.valueOf(yv4Var.i()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Boolean.valueOf(yv4Var.i()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final ByteString e() {
        w(2);
        return this.a.j();
    }

    public final void f(pqw pqwVar) {
        int y;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            pqwVar.add(e());
            yv4 yv4Var = this.a;
            if (yv4Var.e()) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == this.b);
        this.d = y;
    }

    public final void g(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 1) {
            do {
                pqwVar.add(Double.valueOf(yv4Var.l()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int z = yv4Var.z();
        z(z);
        int d = yv4Var.d() + z;
        do {
            pqwVar.add(Double.valueOf(yv4Var.l()));
        } while (yv4Var.d() < d);
    }

    public final void h(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Integer.valueOf(yv4Var.m()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Integer.valueOf(yv4Var.m()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final Object i(WireFormat$FieldType wireFormat$FieldType, Class cls, qyo qyoVar) {
        int i = fac.a[wireFormat$FieldType.ordinal()];
        yv4 yv4Var = this.a;
        switch (i) {
            case 1:
                w(0);
                return Boolean.valueOf(yv4Var.i());
            case 2:
                return e();
            case 3:
                w(1);
                return Double.valueOf(yv4Var.l());
            case 4:
                w(0);
                return Integer.valueOf(yv4Var.m());
            case 5:
                w(5);
                return Integer.valueOf(yv4Var.n());
            case 6:
                w(1);
                return Long.valueOf(yv4Var.o());
            case 7:
                w(5);
                return Float.valueOf(yv4Var.p());
            case 8:
                w(0);
                return Integer.valueOf(yv4Var.q());
            case 9:
                w(0);
                return Long.valueOf(yv4Var.r());
            case 10:
                w(2);
                tom0 a = fvf0.c.a(cls);
                GeneratedMessageLite d = a.d();
                c(d, a, qyoVar);
                a.c(d);
                return d;
            case 11:
                w(5);
                return Integer.valueOf(yv4Var.s());
            case 12:
                w(1);
                return Long.valueOf(yv4Var.t());
            case 13:
                w(0);
                return Integer.valueOf(yv4Var.u());
            case 14:
                w(0);
                return Long.valueOf(yv4Var.v());
            case 15:
                w(2);
                return yv4Var.x();
            case 16:
                w(0);
                return Integer.valueOf(yv4Var.z());
            case 17:
                w(0);
                return Long.valueOf(yv4Var.A());
            default:
                ny61.g("unsupported field type.");
                return null;
        }
    }

    public final void j(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 2) {
            int z = yv4Var.z();
            y(z);
            int d = yv4Var.d() + z;
            do {
                pqwVar.add(Integer.valueOf(yv4Var.n()));
            } while (yv4Var.d() < d);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            pqwVar.add(Integer.valueOf(yv4Var.n()));
            if (yv4Var.e()) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == this.b);
        this.d = y;
    }

    public final void k(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 1) {
            do {
                pqwVar.add(Long.valueOf(yv4Var.o()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int z = yv4Var.z();
        z(z);
        int d = yv4Var.d() + z;
        do {
            pqwVar.add(Long.valueOf(yv4Var.o()));
        } while (yv4Var.d() < d);
    }

    public final void l(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 2) {
            int z = yv4Var.z();
            y(z);
            int d = yv4Var.d() + z;
            do {
                pqwVar.add(Float.valueOf(yv4Var.p()));
            } while (yv4Var.d() < d);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            pqwVar.add(Float.valueOf(yv4Var.p()));
            if (yv4Var.e()) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == this.b);
        this.d = y;
    }

    public final void m(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Integer.valueOf(yv4Var.q()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Integer.valueOf(yv4Var.q()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final void n(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Long.valueOf(yv4Var.r()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Long.valueOf(yv4Var.r()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final void o(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 2) {
            int z = yv4Var.z();
            y(z);
            int d = yv4Var.d() + z;
            do {
                pqwVar.add(Integer.valueOf(yv4Var.s()));
            } while (yv4Var.d() < d);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            pqwVar.add(Integer.valueOf(yv4Var.s()));
            if (yv4Var.e()) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == this.b);
        this.d = y;
    }

    public final void p(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 1) {
            do {
                pqwVar.add(Long.valueOf(yv4Var.t()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int z = yv4Var.z();
        z(z);
        int d = yv4Var.d() + z;
        do {
            pqwVar.add(Long.valueOf(yv4Var.t()));
        } while (yv4Var.d() < d);
    }

    public final void q(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Integer.valueOf(yv4Var.u()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Integer.valueOf(yv4Var.u()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final void r(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Long.valueOf(yv4Var.v()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Long.valueOf(yv4Var.v()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final void s(pqw pqwVar, boolean z) {
        String w;
        int y;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            yv4 yv4Var = this.a;
            if (z) {
                w(2);
                w = yv4Var.x();
            } else {
                w(2);
                w = yv4Var.w();
            }
            pqwVar.add(w);
            if (yv4Var.e()) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == this.b);
        this.d = y;
    }

    public final void t(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Integer.valueOf(yv4Var.z()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Integer.valueOf(yv4Var.z()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final void u(pqw pqwVar) {
        int y;
        int i = this.b & 7;
        yv4 yv4Var = this.a;
        if (i == 0) {
            do {
                pqwVar.add(Long.valueOf(yv4Var.A()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d = yv4Var.d() + yv4Var.z();
        do {
            pqwVar.add(Long.valueOf(yv4Var.A()));
        } while (yv4Var.d() < d);
        v(d);
    }

    public final void v(int i) {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.j();
        }
    }

    public final void w(int i) {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.c();
        }
    }

    public final boolean x() {
        int i;
        yv4 yv4Var = this.a;
        if (yv4Var.e() || (i = this.b) == this.c) {
            return false;
        }
        return yv4Var.B(i);
    }
}
