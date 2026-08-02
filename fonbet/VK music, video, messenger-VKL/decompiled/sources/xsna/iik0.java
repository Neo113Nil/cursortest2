package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.vho0;

/* compiled from: SpanStyle.kt */
/* loaded from: classes11.dex */
public final class iik0 {
    public static final long a = l2l0.l(14);
    public static final long b = l2l0.l(0);
    public static final long c = l5g.j;
    public static final vho0 d;

    static {
        long j = l5g.b;
        d = j != 16 ? new j8g(j) : vho0.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00b6, code lost:
    
        if (r15.equals(r24.i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00c5, code lost:
    
        if (r39.equals(r24.j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00d4, code lost:
    
        if (r40.equals(r24.k) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hik0 a(hik0 hik0Var, long j, yk8 yk8Var, float f, long j2, b6s b6sVar, u5s u5sVar, v5s v5sVar, v4s v4sVar, String str, long j3, et6 et6Var, zho0 zho0Var, lwz lwzVar, long j4, pdo0 pdo0Var, v4j0 v4j0Var, hua0 hua0Var, qio qioVar) {
        et6 et6Var2;
        v4j0 v4j0Var2;
        hua0 hua0Var2;
        qio qioVar2;
        lwz lwzVar2;
        long j5;
        long j6;
        hua0 hua0Var3;
        v5s v5sVar2 = v5sVar;
        v4s v4sVar2 = v4sVar;
        String str2 = str;
        long j7 = j3;
        gno0[] gno0VarArr = fno0.b;
        long j8 = j2 & 1095216660480L;
        if ((j8 == 0 || fno0.b(j2, hik0Var.b)) && ((yk8Var != null || j == 16 || l5g.d(j, hik0Var.a.c())) && ((u5sVar == null || u5sVar.equals(hik0Var.d)) && ((b6sVar == null || b6sVar.equals(hik0Var.c)) && ((v4sVar2 == null || v4sVar2 == hik0Var.f) && (((j7 & 1095216660480L) == 0 || fno0.b(j7, hik0Var.h)) && ((pdo0Var == null || pdo0Var.equals(hik0Var.m)) && epx.f(yk8Var, hik0Var.a.e()) && ((yk8Var == null || f == hik0Var.a.a()) && ((v5sVar2 == null || v5sVar2.equals(hik0Var.e)) && (str2 == null || str2.equals(hik0Var.g))))))))))) {
            if (et6Var != null) {
                et6Var2 = et6Var;
            } else {
                et6Var2 = et6Var;
            }
            if (zho0Var == null) {
            }
            if (lwzVar == null) {
            }
            if (j4 == 16 || l5g.d(j4, hik0Var.l)) {
                v4j0Var2 = v4j0Var;
                if (v4j0Var2 == null || v4j0Var2.equals(hik0Var.n)) {
                    hua0Var2 = hua0Var;
                    if (hua0Var2 == null || hua0Var2.equals(hik0Var.o)) {
                        qioVar2 = qioVar;
                        if (qioVar2 == null || qioVar2.equals(hik0Var.p)) {
                            return hik0Var;
                        }
                        vho0 vho0Var = vho0.a.a;
                        if (yk8Var == null) {
                            if (yk8Var instanceof rek0) {
                                long s = qxm0.s(f, ((rek0) yk8Var).b);
                                if (s != 16) {
                                    vho0Var = new j8g(s);
                                }
                            } else {
                                if (!(yk8Var instanceof n4j0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                vho0Var = new dl8((n4j0) yk8Var, f);
                            }
                        } else if (j != 16) {
                            vho0Var = new j8g(j);
                        }
                        vho0 d2 = hik0Var.a.d(vho0Var);
                        if (v4sVar2 == null) {
                            v4sVar2 = hik0Var.f;
                        }
                        long j9 = j8 != 0 ? hik0Var.b : j2;
                        b6s b6sVar2 = b6sVar != null ? hik0Var.c : b6sVar;
                        u5s u5sVar2 = u5sVar != null ? hik0Var.d : u5sVar;
                        if (v5sVar2 == null) {
                            v5sVar2 = hik0Var.e;
                        }
                        if (str2 == null) {
                            str2 = hik0Var.g;
                        }
                        if ((j7 & 1095216660480L) == 0) {
                            j7 = hik0Var.h;
                        }
                        if (et6Var2 == null) {
                            et6Var2 = hik0Var.i;
                        }
                        zho0 zho0Var2 = zho0Var != null ? hik0Var.j : zho0Var;
                        lwz lwzVar3 = lwzVar != null ? hik0Var.k : lwzVar;
                        if (j4 == 16) {
                            lwzVar2 = lwzVar3;
                            j5 = j9;
                            j6 = j4;
                        } else {
                            lwzVar2 = lwzVar3;
                            j5 = j9;
                            j6 = hik0Var.l;
                        }
                        pdo0 pdo0Var2 = pdo0Var != null ? hik0Var.m : pdo0Var;
                        if (v4j0Var2 == null) {
                            v4j0Var2 = hik0Var.n;
                        }
                        long j10 = j6;
                        hua0Var3 = hik0Var.o;
                        if (hua0Var3 == null) {
                            hua0Var3 = hua0Var2;
                        }
                        if (qioVar2 == null) {
                            qioVar2 = hik0Var.p;
                        }
                        return new hik0(d2, j5, b6sVar2, u5sVar2, v5sVar2, v4sVar2, str2, j7, et6Var2, zho0Var2, lwzVar2, j10, pdo0Var2, v4j0Var2, hua0Var3, qioVar2);
                    }
                    qioVar2 = qioVar;
                    vho0 vho0Var2 = vho0.a.a;
                    if (yk8Var == null) {
                    }
                    vho0 d22 = hik0Var.a.d(vho0Var2);
                    if (v4sVar2 == null) {
                    }
                    if (j8 != 0) {
                    }
                    if (b6sVar != null) {
                    }
                    if (u5sVar != null) {
                    }
                    if (v5sVar2 == null) {
                    }
                    if (str2 == null) {
                    }
                    if ((j7 & 1095216660480L) == 0) {
                    }
                    if (et6Var2 == null) {
                    }
                    if (zho0Var != null) {
                    }
                    if (lwzVar != null) {
                    }
                    if (j4 == 16) {
                    }
                    if (pdo0Var != null) {
                    }
                    if (v4j0Var2 == null) {
                    }
                    long j102 = j6;
                    hua0Var3 = hik0Var.o;
                    if (hua0Var3 == null) {
                    }
                    if (qioVar2 == null) {
                    }
                    return new hik0(d22, j5, b6sVar2, u5sVar2, v5sVar2, v4sVar2, str2, j7, et6Var2, zho0Var2, lwzVar2, j102, pdo0Var2, v4j0Var2, hua0Var3, qioVar2);
                }
                hua0Var2 = hua0Var;
                qioVar2 = qioVar;
                vho0 vho0Var22 = vho0.a.a;
                if (yk8Var == null) {
                }
                vho0 d222 = hik0Var.a.d(vho0Var22);
                if (v4sVar2 == null) {
                }
                if (j8 != 0) {
                }
                if (b6sVar != null) {
                }
                if (u5sVar != null) {
                }
                if (v5sVar2 == null) {
                }
                if (str2 == null) {
                }
                if ((j7 & 1095216660480L) == 0) {
                }
                if (et6Var2 == null) {
                }
                if (zho0Var != null) {
                }
                if (lwzVar != null) {
                }
                if (j4 == 16) {
                }
                if (pdo0Var != null) {
                }
                if (v4j0Var2 == null) {
                }
                long j1022 = j6;
                hua0Var3 = hik0Var.o;
                if (hua0Var3 == null) {
                }
                if (qioVar2 == null) {
                }
                return new hik0(d222, j5, b6sVar2, u5sVar2, v5sVar2, v4sVar2, str2, j7, et6Var2, zho0Var2, lwzVar2, j1022, pdo0Var2, v4j0Var2, hua0Var3, qioVar2);
            }
        } else {
            et6Var2 = et6Var;
        }
        v4j0Var2 = v4j0Var;
        hua0Var2 = hua0Var;
        qioVar2 = qioVar;
        vho0 vho0Var222 = vho0.a.a;
        if (yk8Var == null) {
        }
        vho0 d2222 = hik0Var.a.d(vho0Var222);
        if (v4sVar2 == null) {
        }
        if (j8 != 0) {
        }
        if (b6sVar != null) {
        }
        if (u5sVar != null) {
        }
        if (v5sVar2 == null) {
        }
        if (str2 == null) {
        }
        if ((j7 & 1095216660480L) == 0) {
        }
        if (et6Var2 == null) {
        }
        if (zho0Var != null) {
        }
        if (lwzVar != null) {
        }
        if (j4 == 16) {
        }
        if (pdo0Var != null) {
        }
        if (v4j0Var2 == null) {
        }
        long j10222 = j6;
        hua0Var3 = hik0Var.o;
        if (hua0Var3 == null) {
        }
        if (qioVar2 == null) {
        }
        return new hik0(d2222, j5, b6sVar2, u5sVar2, v5sVar2, v4sVar2, str2, j7, et6Var2, zho0Var2, lwzVar2, j10222, pdo0Var2, v4j0Var2, hua0Var3, qioVar2);
    }

    public static final Object b(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        gno0[] gno0VarArr = fno0.b;
        long j3 = j & 1095216660480L;
        if (j3 == 0 || (1095216660480L & j2) == 0) {
            return ((fno0) b(f, new fno0(j), new fno0(j2))).a;
        }
        l2l0.h(j, j2);
        return l2l0.n(q6x.z(fno0.d(j), fno0.d(j2), f), j3);
    }
}
