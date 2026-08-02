package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class k4n implements tqn, gz71 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public k4n(List list, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.f = list;
                this.g = new fb81[list.size()];
                this.c = -9223372036854775807L;
                break;
            default:
                this.f = list;
                this.g = new g001[list.size()];
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.gz71
    public void a(yg71 yg71Var, xi11 xi11Var) {
        fb81[] fb81VarArr = (fb81[]) this.g;
        for (int i = 0; i < fb81VarArr.length; i++) {
            xu71 xu71Var = (xu71) ((List) this.f).get(i);
            xi11Var.a();
            xi11Var.b();
            fb81 l = yg71Var.l(xi11Var.d, 3);
            da81 da81Var = new da81();
            xi11Var.b();
            da81Var.a = xi11Var.e;
            da81Var.k = "application/dvbsubs";
            da81Var.m = Collections.singletonList(xu71Var.b);
            da81Var.c = xu71Var.a;
            l.k(new qd81(da81Var));
            fb81VarArr[i] = l;
        }
    }

    @Override // defpackage.tqn
    public void b(ef90 ef90Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (ef90Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (ef90Var.y() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (ef90Var.a() == 0) {
                            z = false;
                        } else {
                            if (ef90Var.y() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = ef90Var.b;
                    int a = ef90Var.a();
                    for (g001 g001Var : (g001[]) this.g) {
                        ef90Var.K(i);
                        g001Var.a(ef90Var, a, 0);
                    }
                    this.e += a;
                    break;
                }
                break;
            default:
                ef90 ef90Var2 = (ef90) this.f;
                d6z.z((g001) this.g);
                if (this.b) {
                    int a2 = ef90Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(ef90Var.a, ef90Var.b, ef90Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            ef90Var2.K(0);
                            if (73 != ef90Var2.y() || 68 != ef90Var2.y() || 51 != ef90Var2.y()) {
                                lk91.j("Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                ef90Var2.L(3);
                                this.d = ef90Var2.x() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((g001) this.g).a(ef90Var, min2, 0);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gz71
    public void c(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.b = true;
        if (j != -9223372036854775807L) {
            this.c = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.tqn
    public void d() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.tqn
    public void e(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gz71
    public void f(dl81 dl81Var) {
        boolean z;
        boolean z2;
        if (this.b) {
            if (this.d == 2) {
                if (dl81Var.c - dl81Var.b == 0) {
                    z2 = false;
                } else {
                    if (dl81Var.s() != 32) {
                        this.b = false;
                    }
                    this.d--;
                    z2 = this.b;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (dl81Var.c - dl81Var.b == 0) {
                    z = false;
                } else {
                    if (dl81Var.s() != 0) {
                        this.b = false;
                    }
                    this.d--;
                    z = this.b;
                }
                if (!z) {
                    return;
                }
            }
            int i = dl81Var.b;
            int i2 = dl81Var.c - i;
            for (fb81 fb81Var : (fb81[]) this.g) {
                dl81Var.m(i);
                fb81Var.a(i2, dl81Var);
            }
            this.e += i2;
        }
    }

    @Override // defpackage.tqn
    public void g(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    d6z.x(this.c != -9223372036854775807L);
                    for (g001 g001Var : (g001[]) this.g) {
                        g001Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                d6z.z((g001) this.g);
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    d6z.x(this.c != -9223372036854775807L);
                    ((g001) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tqn
    public void h(d5p d5pVar, xi11 xi11Var) {
        switch (this.a) {
            case 0:
                g001[] g001VarArr = (g001[]) this.g;
                for (int i = 0; i < g001VarArr.length; i++) {
                    wi11 wi11Var = (wi11) ((List) this.f).get(i);
                    xi11Var.c();
                    xi11Var.d();
                    g001 B = d5pVar.B(xi11Var.d, 3);
                    f7s f7sVar = new f7s();
                    xi11Var.d();
                    f7sVar.a = xi11Var.e;
                    f7sVar.l = eh20.q("video/mp2t");
                    f7sVar.m = eh20.q("application/dvbsubs");
                    f7sVar.p = Collections.singletonList(wi11Var.b);
                    f7sVar.d = wi11Var.a;
                    smw0.u(f7sVar, B);
                    g001VarArr[i] = B;
                }
                break;
            default:
                xi11Var.c();
                xi11Var.d();
                g001 B2 = d5pVar.B(xi11Var.d, 5);
                this.g = B2;
                f7s f7sVar2 = new f7s();
                xi11Var.d();
                f7sVar2.a = xi11Var.e;
                f7sVar2.l = eh20.q("video/mp2t");
                f7sVar2.m = eh20.q("application/id3");
                smw0.u(f7sVar2, B2);
                break;
        }
    }

    public k4n() {
        this.a = 1;
        this.f = new ef90(10);
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.gz71
    public void a() {
        this.b = false;
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.gz71
    public void b() {
        if (this.b) {
            if (this.c != -9223372036854775807L) {
                for (fb81 fb81Var : (fb81[]) this.g) {
                    fb81Var.b(this.c, 1, this.e, 0, null);
                }
            }
            this.b = false;
        }
    }
}
