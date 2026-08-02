package defpackage;

import androidx.compose.ui.focus.a;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.LayoutNode;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public abstract class ce60 {
    public static final qy40 a = kp60.a();

    public static final void a(e530 e530Var) {
        if (!e530Var.isAttached()) {
            ixv.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(e530Var, -1, 1);
    }

    public static final void b(e530 e530Var, int i, int i2) {
        if (!(e530Var instanceof lqh)) {
            c(e530Var, i & e530Var.getKindSet$ui(), i2);
            return;
        }
        lqh lqhVar = (lqh) e530Var;
        int i3 = lqhVar.a;
        c(e530Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (e530 e530Var2 = lqhVar.b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
            b(e530Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(e530 e530Var, int i, int i2) {
        if (i2 != 0 || e530Var.getShouldAutoInvalidate()) {
            if ((i & 2) != 0 && (e530Var instanceof v0y)) {
                qje.P((v0y) e530Var).C();
                if (i2 == 2) {
                    qje.N(e530Var, 2).n1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                qje.P(e530Var).C();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                LayoutNode P = qje.P(e530Var);
                z0y z0yVar = LayoutNode.m0;
                P.S(false);
            }
            if ((i & 256) != 0 && (e530Var instanceof ejt)) {
                if (i2 == 1) {
                    LayoutNode P2 = qje.P(e530Var);
                    P2.Y(P2.k0 + 1);
                } else if (i2 == 2) {
                    qje.P(e530Var).Y(r0.k0 - 1);
                }
                if (i2 != 2) {
                    LayoutNode P3 = qje.P(e530Var);
                    if (P3.k0 != 0 && !P3.n() && !P3.o() && !P3.j0) {
                        d1y.a(P3).requestOnPositionedCallback(P3);
                    }
                }
            }
            if ((i & 4) != 0 && (e530Var instanceof pam)) {
                rzo.D((pam) e530Var);
            }
            if ((i & 8) != 0 && (e530Var instanceof gnq0)) {
                qje.P(e530Var).K = true;
            }
            if ((i & 64) != 0 && (e530Var instanceof ae90)) {
                w691.d((ae90) e530Var);
            }
            if ((i & 2048) != 0 && (e530Var instanceof uur)) {
                uur uurVar = (uur) e530Var;
                iu7.b = null;
                uurVar.applyFocusProperties(iu7.a);
                if (iu7.b != null) {
                    if (!uurVar.getNode().isAttached()) {
                        ixv.b("visitChildren called on an unattached node");
                    }
                    wz40 wz40Var = new wz40(new e530[16]);
                    e530 child$ui = uurVar.getNode().getChild$ui();
                    if (child$ui == null) {
                        qje.b(wz40Var, uurVar.getNode());
                    } else {
                        wz40Var.b(child$ui);
                    }
                    while (true) {
                        int i3 = wz40Var.c;
                        if (i3 == 0) {
                            break;
                        }
                        e530 e530Var2 = (e530) wz40Var.k(i3 - 1);
                        if ((e530Var2.getAggregateChildKindSet$ui() & 1024) == 0) {
                            qje.b(wz40Var, e530Var2);
                        } else {
                            while (true) {
                                if (e530Var2 == null) {
                                    break;
                                }
                                if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                    wz40 wz40Var2 = null;
                                    while (e530Var2 != null) {
                                        if (e530Var2 instanceof d) {
                                            d dVar = (d) e530Var2;
                                            a aVar = ((c) qje.Q(dVar).getFocusOwner()).d;
                                            if (aVar.c.a(dVar)) {
                                                aVar.a();
                                            }
                                        } else if ((e530Var2.getKindSet$ui() & 1024) != 0 && (e530Var2 instanceof lqh)) {
                                            int i4 = 0;
                                            for (e530 e530Var3 = ((lqh) e530Var2).b; e530Var3 != null; e530Var3 = e530Var3.getChild$ui()) {
                                                if ((e530Var3.getKindSet$ui() & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        e530Var2 = e530Var3;
                                                    } else {
                                                        if (wz40Var2 == null) {
                                                            wz40Var2 = new wz40(new e530[16]);
                                                        }
                                                        if (e530Var2 != null) {
                                                            wz40Var2.b(e530Var2);
                                                            e530Var2 = null;
                                                        }
                                                        wz40Var2.b(e530Var3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        e530Var2 = qje.c(wz40Var2);
                                    }
                                } else {
                                    e530Var2 = e530Var2.getChild$ui();
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (e530Var instanceof ytr)) {
                fqa1.g((ytr) e530Var);
            }
            if ((i & 2097152) != 0 && (e530Var instanceof isv) && i2 == 2) {
                ((isv) e530Var).y0();
            }
        }
    }

    public static final void d(e530 e530Var) {
        if (!e530Var.isAttached()) {
            ixv.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(e530Var, -1, 0);
    }

    public static final int e(d530 d530Var) {
        int i = d530Var instanceof s0y ? 3 : 1;
        if (d530Var instanceof oam) {
            i |= 4;
        }
        if (d530Var instanceof enq0) {
            i |= 8;
        }
        if (d530Var instanceof fwd0) {
            i |= 16;
        }
        if (d530Var instanceof qy60) {
            i |= 256;
        }
        if (d530Var instanceof zd90) {
            i |= 64;
        }
        return d530Var instanceof nk6 ? 524288 | i : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int f(e530 e530Var) {
        int i;
        if (e530Var.getKindSet$ui() != 0) {
            return e530Var.getKindSet$ui();
        }
        Class<?> cls = e530Var.getClass();
        qy40 qy40Var = a;
        int d = qy40Var.d(cls);
        if (d >= 0) {
            return qy40Var.c[d];
        }
        int i2 = e530Var instanceof v0y ? 3 : 1;
        if (e530Var instanceof pam) {
            i2 |= 4;
        }
        if (e530Var instanceof gnq0) {
            i2 |= 8;
        }
        if (e530Var instanceof gwd0) {
            i2 |= 16;
        }
        if (e530Var instanceof i530) {
            i2 |= 32;
        }
        if (e530Var instanceof ae90) {
            i2 |= 64;
        }
        if (e530Var instanceof d070) {
            i = SelfTester_JCP.ENCRYPT_CBC;
        } else {
            if (!(e530Var instanceof izx)) {
                if (e530Var instanceof ga10) {
                    i2 |= 128;
                }
                if (e530Var instanceof ejt) {
                    i2 |= 256;
                }
                if (e530Var instanceof d) {
                    i2 |= 1024;
                }
                if (e530Var instanceof uur) {
                    i2 |= 2048;
                }
                if (e530Var instanceof ytr) {
                    i2 |= 4096;
                }
                if (e530Var instanceof lix) {
                    i2 |= 8192;
                }
                if (e530Var instanceof androidx.compose.ui.platform.a) {
                    i2 |= 16384;
                }
                if (e530Var instanceof fud) {
                    i2 |= 32768;
                }
                if (e530Var instanceof t5t0) {
                    i2 |= 131072;
                }
                if (e530Var instanceof dd11) {
                    i2 |= 262144;
                }
                if (e530Var instanceof nk6) {
                    i2 |= 524288;
                }
                if (e530Var instanceof isv) {
                    i2 |= 2097152;
                }
                if (e530Var instanceof lo5) {
                    i2 |= SelfTester_JCP.ENCRYPT_CNT;
                }
                qy40Var.g(cls, i2);
                return i2;
            }
            i = 4194432;
        }
        i2 |= i;
        if (e530Var instanceof ejt) {
        }
        if (e530Var instanceof d) {
        }
        if (e530Var instanceof uur) {
        }
        if (e530Var instanceof ytr) {
        }
        if (e530Var instanceof lix) {
        }
        if (e530Var instanceof androidx.compose.ui.platform.a) {
        }
        if (e530Var instanceof fud) {
        }
        if (e530Var instanceof t5t0) {
        }
        if (e530Var instanceof dd11) {
        }
        if (e530Var instanceof nk6) {
        }
        if (e530Var instanceof isv) {
        }
        if (e530Var instanceof lo5) {
        }
        qy40Var.g(cls, i2);
        return i2;
    }

    public static final int g(e530 e530Var) {
        if (!(e530Var instanceof lqh)) {
            return f(e530Var);
        }
        lqh lqhVar = (lqh) e530Var;
        int i = lqhVar.a;
        for (e530 e530Var2 = lqhVar.b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
            i |= g(e530Var2);
        }
        return i;
    }

    public static final boolean h(int i) {
        return ((i & 128) != 0) | ((i & SelfTester_JCP.ENCRYPT_CBC) != 0);
    }
}
