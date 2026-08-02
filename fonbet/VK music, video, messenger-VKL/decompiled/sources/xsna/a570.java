package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: NodeKind.kt */
/* loaded from: classes11.dex */
public final class a570 {
    public static final eh50<Object> a = pp70.a();

    public static final void a(q630.c cVar, int i, int i2) {
        if (!(cVar instanceof ytl)) {
            b(cVar, i & cVar.d, i2);
            return;
        }
        ytl ytlVar = (ytl) cVar;
        b(cVar, ytlVar.p & i, i2);
        int i3 = (~ytlVar.p) & i;
        for (q630.c cVar2 = ytlVar.q; cVar2 != null; cVar2 = cVar2.g) {
            a(cVar2, i3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(q630.c cVar, int i, int i2) {
        if (i2 != 0 || cVar.X1()) {
            if ((i & 2) != 0 && (cVar instanceof noy)) {
                itl.f((noy) cVar).Q();
                if (i2 == 2) {
                    itl.d(cVar, 2).W1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                itl.f(cVar).Q();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                LayoutNode f = itl.f(cVar);
                LayoutNode.c cVar2 = LayoutNode.S;
                f.e0(false);
            }
            if ((i & 256) != 0 && (cVar instanceof o1u)) {
                if (i2 == 1) {
                    LayoutNode f2 = itl.f(cVar);
                    f2.k0(f2.Q + 1);
                } else if (i2 == 2) {
                    itl.f(cVar).k0(r0.Q - 1);
                }
                if (i2 != 2) {
                    LayoutNode f3 = itl.f(cVar);
                    if (f3.Q != 0 && !f3.D() && !f3.E() && !f3.P) {
                        voy.a(f3).b(f3);
                    }
                }
            }
            if ((i & 4) != 0 && (cVar instanceof lio)) {
                mio.a((lio) cVar);
            }
            if ((i & 8) != 0 && (cVar instanceof fgi0)) {
                itl.f(cVar).s = true;
            }
            if ((i & 64) != 0 && (cVar instanceof mi90)) {
                androidx.compose.ui.node.e eVar = itl.f((mi90) cVar).H;
                eVar.p.s = true;
                androidx.compose.ui.node.g gVar = eVar.q;
                if (gVar != null) {
                    gVar.y = true;
                }
            }
            if ((i & 2048) != 0 && (cVar instanceof owr)) {
                owr owrVar = (owr) cVar;
                ep9.b = null;
                owrVar.f1(ep9.a);
                if (ep9.b != null) {
                    if (!owrVar.z().o) {
                        uzw.b("visitChildren called on an unattached node");
                    }
                    ci50 ci50Var = new ci50(new q630.c[16]);
                    q630.c cVar3 = owrVar.z().g;
                    if (cVar3 == null) {
                        itl.a(ci50Var, owrVar.z());
                    } else {
                        ci50Var.b(cVar3);
                    }
                    while (true) {
                        int i3 = ci50Var.d;
                        if (i3 == 0) {
                            break;
                        }
                        q630.c cVar4 = (q630.c) ci50Var.k(i3 - 1);
                        if ((cVar4.e & 1024) == 0) {
                            itl.a(ci50Var, cVar4);
                        } else {
                            while (true) {
                                if (cVar4 == null) {
                                    break;
                                }
                                if ((cVar4.d & 1024) != 0) {
                                    ci50 ci50Var2 = null;
                                    while (cVar4 != null) {
                                        if (cVar4 instanceof dxr) {
                                            dxr dxrVar = (dxr) cVar4;
                                            itl.g(dxrVar).getFocusOwner().l(dxrVar);
                                        } else if ((cVar4.d & 1024) != 0 && (cVar4 instanceof ytl)) {
                                            int i4 = 0;
                                            for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                                if ((cVar5.d & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cVar4 = cVar5;
                                                    } else {
                                                        if (ci50Var2 == null) {
                                                            ci50Var2 = new ci50(new q630.c[16]);
                                                        }
                                                        if (cVar4 != null) {
                                                            ci50Var2.b(cVar4);
                                                            cVar4 = null;
                                                        }
                                                        ci50Var2.b(cVar5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        cVar4 = itl.b(ci50Var2);
                                    }
                                } else {
                                    cVar4 = cVar4.g;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (cVar instanceof lvr)) {
                lvr lvrVar = (lvr) cVar;
                itl.g(lvrVar).getFocusOwner().o(lvrVar);
            }
            if ((i & 2097152) != 0 && (cVar instanceof puw) && i2 == 2) {
                ((puw) cVar).J0();
            }
        }
    }

    public static final void c(q630.c cVar) {
        if (!cVar.o) {
            uzw.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cVar, -1, 0);
    }

    public static final int d(q630.b bVar) {
        int i = bVar instanceof loy ? 3 : 1;
        if (bVar instanceof kio) {
            i |= 4;
        }
        if (bVar instanceof dgi0) {
            i |= 8;
        }
        if (bVar instanceof bmb0) {
            i |= 16;
        }
        if ((bVar instanceof y630) || (bVar instanceof b730)) {
            i |= 32;
        }
        if (bVar instanceof kvr) {
            i |= 4096;
        }
        if (bVar instanceof cwr) {
            i |= 2048;
        }
        if (bVar instanceof j680) {
            i |= 256;
        }
        if (bVar instanceof li90) {
            i |= 64;
        }
        if (bVar instanceof ca80) {
            i |= 4194304;
        }
        if (bVar instanceof ta80) {
            i |= 128;
        }
        return bVar instanceof kc8 ? 524288 | i : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int e(q630.c cVar) {
        int i;
        int i2 = cVar.d;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = cVar.getClass();
        eh50<Object> eh50Var = a;
        int a2 = eh50Var.a(cls);
        if (a2 >= 0) {
            return eh50Var.c[a2];
        }
        int i3 = cVar instanceof noy ? 3 : 1;
        if (cVar instanceof lio) {
            i3 |= 4;
        }
        if (cVar instanceof fgi0) {
            i3 |= 8;
        }
        if (cVar instanceof cmb0) {
            i3 |= 16;
        }
        if (cVar instanceof a730) {
            i3 |= 32;
        }
        if (cVar instanceof mi90) {
            i3 |= 64;
        }
        if (cVar instanceof da80) {
            i = 4194304;
        } else {
            if (!(cVar instanceof ony)) {
                if (cVar instanceof lp10) {
                    i3 |= 128;
                }
                if (cVar instanceof o1u) {
                    i3 |= 256;
                }
                if (cVar instanceof td3) {
                    i3 |= 512;
                }
                if (cVar instanceof dxr) {
                    i3 |= 1024;
                }
                if (cVar instanceof owr) {
                    i3 |= 2048;
                }
                if (cVar instanceof lvr) {
                    i3 |= 4096;
                }
                if (cVar instanceof ndy) {
                    i3 |= 8192;
                }
                if (cVar instanceof rmg0) {
                    i3 |= 16384;
                }
                if (cVar instanceof nvi) {
                    i3 |= 32768;
                }
                if (cVar instanceof lek0) {
                    i3 |= 131072;
                }
                if (cVar instanceof npp0) {
                    i3 |= SQLiteDatabase.OPEN_PRIVATECACHE;
                }
                if (cVar instanceof kc8) {
                    i3 |= 524288;
                }
                if (cVar instanceof y4q0) {
                    i3 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                if (cVar instanceof puw) {
                    i3 |= 2097152;
                }
                if (cVar instanceof gy6) {
                    i3 |= 8388608;
                }
                eh50Var.i(cls, i3);
                return i3;
            }
            i = 4194432;
        }
        i3 |= i;
        if (cVar instanceof o1u) {
        }
        if (cVar instanceof td3) {
        }
        if (cVar instanceof dxr) {
        }
        if (cVar instanceof owr) {
        }
        if (cVar instanceof lvr) {
        }
        if (cVar instanceof ndy) {
        }
        if (cVar instanceof rmg0) {
        }
        if (cVar instanceof nvi) {
        }
        if (cVar instanceof lek0) {
        }
        if (cVar instanceof npp0) {
        }
        if (cVar instanceof kc8) {
        }
        if (cVar instanceof y4q0) {
        }
        if (cVar instanceof puw) {
        }
        if (cVar instanceof gy6) {
        }
        eh50Var.i(cls, i3);
        return i3;
    }

    public static final int f(q630.c cVar) {
        if (!(cVar instanceof ytl)) {
            return e(cVar);
        }
        ytl ytlVar = (ytl) cVar;
        int i = ytlVar.p;
        for (q630.c cVar2 = ytlVar.q; cVar2 != null; cVar2 = cVar2.g) {
            i |= f(cVar2);
        }
        return i;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
