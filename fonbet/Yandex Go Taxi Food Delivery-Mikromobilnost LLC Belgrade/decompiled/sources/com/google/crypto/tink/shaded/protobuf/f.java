package com.google.crypto.tink.shaded.protobuf;

import defpackage.aor;
import defpackage.c5m;
import defpackage.h7y;
import defpackage.h96;
import defpackage.n5w;
import defpackage.oyo;
import defpackage.plz;
import defpackage.qqw;
import defpackage.rom0;
import defpackage.yv4;
import defpackage.zbi0;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements zbi0 {
    public final yv4 a;
    public int b;
    public int c;
    public int d = 0;

    public f(yv4 yv4Var) {
        qqw.a(yv4Var, "input");
        this.a = yv4Var;
        yv4Var.b = this;
    }

    public static void w(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public static void x(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.i();
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

    public final void b(Object obj, rom0 rom0Var, oyo oyoVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            rom0Var.j(obj, this, oyoVar);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.i();
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, rom0 rom0Var, oyo oyoVar) {
        yv4 yv4Var = this.a;
        int z = yv4Var.z();
        if (yv4Var.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int h = yv4Var.h(z);
        yv4Var.a++;
        rom0Var.j(obj, this, oyoVar);
        yv4Var.a(0);
        yv4Var.a--;
        yv4Var.g(h);
    }

    public final void d(List list) {
        int y;
        int y2;
        boolean z = list instanceof h96;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(yv4Var.i()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Boolean.valueOf(yv4Var.i()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        h96 h96Var = (h96) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                h96Var.b(yv4Var.i());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            h96Var.b(yv4Var.i());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final ByteString e() {
        v(2);
        return this.a.k();
    }

    public final void f(List list) {
        int y;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.f();
        }
        do {
            list.add(e());
            yv4 yv4Var = this.a;
            if (yv4Var.e()) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == this.b);
        this.d = y;
    }

    public final void g(List list) {
        int y;
        int y2;
        boolean z = list instanceof c5m;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(yv4Var.l()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int z2 = yv4Var.z();
            x(z2);
            int d = yv4Var.d() + z2;
            do {
                list.add(Double.valueOf(yv4Var.l()));
            } while (yv4Var.d() < d);
            return;
        }
        c5m c5mVar = (c5m) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                c5mVar.b(yv4Var.l());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int z3 = yv4Var.z();
        x(z3);
        int d2 = yv4Var.d() + z3;
        do {
            c5mVar.b(yv4Var.l());
        } while (yv4Var.d() < d2);
    }

    public final void h(List list) {
        int y;
        int y2;
        boolean z = list instanceof n5w;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(yv4Var.m()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Integer.valueOf(yv4Var.m()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        n5w n5wVar = (n5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n5wVar.b(yv4Var.m());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            n5wVar.b(yv4Var.m());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final void i(List list) {
        int y;
        int y2;
        boolean z = list instanceof n5w;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int z2 = yv4Var.z();
                w(z2);
                int d = yv4Var.d() + z2;
                do {
                    list.add(Integer.valueOf(yv4Var.n()));
                } while (yv4Var.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Integer.valueOf(yv4Var.n()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        n5w n5wVar = (n5w) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int z3 = yv4Var.z();
            w(z3);
            int d2 = yv4Var.d() + z3;
            do {
                n5wVar.b(yv4Var.n());
            } while (yv4Var.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.f();
        }
        do {
            n5wVar.b(yv4Var.n());
            if (yv4Var.e()) {
                return;
            } else {
                y2 = yv4Var.y();
            }
        } while (y2 == this.b);
        this.d = y2;
    }

    public final void j(List list) {
        int y;
        int y2;
        boolean z = list instanceof plz;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(yv4Var.o()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int z2 = yv4Var.z();
            x(z2);
            int d = yv4Var.d() + z2;
            do {
                list.add(Long.valueOf(yv4Var.o()));
            } while (yv4Var.d() < d);
            return;
        }
        plz plzVar = (plz) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                plzVar.b(yv4Var.o());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int z3 = yv4Var.z();
        x(z3);
        int d2 = yv4Var.d() + z3;
        do {
            plzVar.b(yv4Var.o());
        } while (yv4Var.d() < d2);
    }

    public final void k(List list) {
        int y;
        int y2;
        boolean z = list instanceof aor;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int z2 = yv4Var.z();
                w(z2);
                int d = yv4Var.d() + z2;
                do {
                    list.add(Float.valueOf(yv4Var.p()));
                } while (yv4Var.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Float.valueOf(yv4Var.p()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        aor aorVar = (aor) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int z3 = yv4Var.z();
            w(z3);
            int d2 = yv4Var.d() + z3;
            do {
                aorVar.b(yv4Var.p());
            } while (yv4Var.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.f();
        }
        do {
            aorVar.b(yv4Var.p());
            if (yv4Var.e()) {
                return;
            } else {
                y2 = yv4Var.y();
            }
        } while (y2 == this.b);
        this.d = y2;
    }

    public final void l(List list) {
        int y;
        int y2;
        boolean z = list instanceof n5w;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(yv4Var.q()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Integer.valueOf(yv4Var.q()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        n5w n5wVar = (n5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n5wVar.b(yv4Var.q());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            n5wVar.b(yv4Var.q());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final void m(List list) {
        int y;
        int y2;
        boolean z = list instanceof plz;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(yv4Var.r()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Long.valueOf(yv4Var.r()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        plz plzVar = (plz) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                plzVar.b(yv4Var.r());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            plzVar.b(yv4Var.r());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final void n(List list) {
        int y;
        int y2;
        boolean z = list instanceof n5w;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int z2 = yv4Var.z();
                w(z2);
                int d = yv4Var.d() + z2;
                do {
                    list.add(Integer.valueOf(yv4Var.s()));
                } while (yv4Var.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.f();
            }
            do {
                list.add(Integer.valueOf(yv4Var.s()));
                if (yv4Var.e()) {
                    return;
                } else {
                    y = yv4Var.y();
                }
            } while (y == this.b);
            this.d = y;
            return;
        }
        n5w n5wVar = (n5w) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int z3 = yv4Var.z();
            w(z3);
            int d2 = yv4Var.d() + z3;
            do {
                n5wVar.b(yv4Var.s());
            } while (yv4Var.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.f();
        }
        do {
            n5wVar.b(yv4Var.s());
            if (yv4Var.e()) {
                return;
            } else {
                y2 = yv4Var.y();
            }
        } while (y2 == this.b);
        this.d = y2;
    }

    public final void o(List list) {
        int y;
        int y2;
        boolean z = list instanceof plz;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(yv4Var.t()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int z2 = yv4Var.z();
            x(z2);
            int d = yv4Var.d() + z2;
            do {
                list.add(Long.valueOf(yv4Var.t()));
            } while (yv4Var.d() < d);
            return;
        }
        plz plzVar = (plz) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                plzVar.b(yv4Var.t());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int z3 = yv4Var.z();
        x(z3);
        int d2 = yv4Var.d() + z3;
        do {
            plzVar.b(yv4Var.t());
        } while (yv4Var.d() < d2);
    }

    public final void p(List list) {
        int y;
        int y2;
        boolean z = list instanceof n5w;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(yv4Var.u()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Integer.valueOf(yv4Var.u()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        n5w n5wVar = (n5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n5wVar.b(yv4Var.u());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            n5wVar.b(yv4Var.u());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final void q(List list) {
        int y;
        int y2;
        boolean z = list instanceof plz;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(yv4Var.v()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Long.valueOf(yv4Var.v()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        plz plzVar = (plz) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                plzVar.b(yv4Var.v());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            plzVar.b(yv4Var.v());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final void r(List list, boolean z) {
        String w;
        int y;
        int y2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.f();
        }
        boolean z2 = list instanceof h7y;
        yv4 yv4Var = this.a;
        if (z2 && !z) {
            h7y h7yVar = (h7y) list;
            do {
                h7yVar.H0(e());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        do {
            if (z) {
                v(2);
                w = yv4Var.x();
            } else {
                v(2);
                w = yv4Var.w();
            }
            list.add(w);
            if (yv4Var.e()) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == this.b);
        this.d = y;
    }

    public final void s(List list) {
        int y;
        int y2;
        boolean z = list instanceof n5w;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(yv4Var.z()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Integer.valueOf(yv4Var.z()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        n5w n5wVar = (n5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n5wVar.b(yv4Var.z());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            n5wVar.b(yv4Var.z());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final void t(List list) {
        int y;
        int y2;
        boolean z = list instanceof plz;
        int i = this.b;
        yv4 yv4Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(yv4Var.A()));
                    if (yv4Var.e()) {
                        return;
                    } else {
                        y = yv4Var.y();
                    }
                } while (y == this.b);
                this.d = y;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.f();
            }
            int d = yv4Var.d() + yv4Var.z();
            do {
                list.add(Long.valueOf(yv4Var.A()));
            } while (yv4Var.d() < d);
            u(d);
            return;
        }
        plz plzVar = (plz) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                plzVar.b(yv4Var.A());
                if (yv4Var.e()) {
                    return;
                } else {
                    y2 = yv4Var.y();
                }
            } while (y2 == this.b);
            this.d = y2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int d2 = yv4Var.d() + yv4Var.z();
        do {
            plzVar.b(yv4Var.A());
        } while (yv4Var.d() < d2);
        u(d2);
    }

    public final void u(int i) {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.l();
        }
    }

    public final void v(int i) {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.f();
        }
    }
}
