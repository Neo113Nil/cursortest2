package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashSet;
import xsna.q630;

/* compiled from: NodeChain.kt */
/* loaded from: classes11.dex */
public final class u470 {
    public final LayoutNode a;
    public final b b;
    public final androidx.compose.ui.node.c c;
    public androidx.compose.ui.node.o d;
    public final t2o0 e;
    public q630.c f;
    public ci50<q630.b> g;
    public ci50<q630.b> h;
    public final ci50<q630> i;
    public a j;

    /* compiled from: NodeChain.kt */
    public final class a {
        public q630.c a;
        public int b;
        public ci50<q630.b> c;
        public ci50<q630.b> d;
        public boolean e;

        public a(q630.c cVar, int i, ci50<q630.b> ci50Var, ci50<q630.b> ci50Var2, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = ci50Var;
            this.d = ci50Var2;
            this.e = z;
        }

        public final boolean a(int i, int i2) {
            ci50<q630.b> ci50Var = this.c;
            int i3 = this.b;
            q630.b bVar = ci50Var.b[i + i3];
            q630.b bVar2 = this.d.b[i3 + i2];
            return epx.f(bVar, bVar2) || bVar.getClass() == bVar2.getClass();
        }
    }

    /* compiled from: NodeChain.kt */
    public static final class b extends q630.c {
        public final String toString() {
            return "<Head>";
        }
    }

    public u470(LayoutNode layoutNode) {
        this.a = layoutNode;
        b bVar = new b();
        bVar.e = -1;
        this.b = bVar;
        androidx.compose.ui.node.c cVar = new androidx.compose.ui.node.c(layoutNode);
        this.c = cVar;
        this.d = cVar;
        t2o0 t2o0Var = cVar.Y;
        this.e = t2o0Var;
        this.f = t2o0Var;
        this.i = new ci50<>(new q630[16]);
    }

    public static final void a(u470 u470Var, q630.c cVar, androidx.compose.ui.node.o oVar) {
        for (q630.c cVar2 = cVar.f; cVar2 != null; cVar2 = cVar2.f) {
            if (cVar2 == u470Var.b) {
                LayoutNode I = u470Var.a.I();
                oVar.u = I != null ? I.G.c : null;
                u470Var.d = oVar;
                return;
            } else {
                if ((cVar2.d & 2) != 0) {
                    return;
                }
                cVar2.h2(oVar);
            }
        }
    }

    public static q630.c b(q630.b bVar, q630.c cVar) {
        q630.c cVar2;
        if (bVar instanceof d730) {
            cVar2 = ((d730) bVar).r();
            cVar2.d = a570.f(cVar2);
        } else {
            androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a();
            aVar.d = a570.d(bVar);
            aVar.p = bVar;
            aVar.q = true;
            aVar.s = new HashSet<>();
            cVar2 = aVar;
        }
        if (cVar2.o) {
            uzw.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVar2.j = true;
        q630.c cVar3 = cVar.g;
        if (cVar3 != null) {
            cVar3.f = cVar2;
            cVar2.g = cVar3;
        }
        cVar.g = cVar2;
        cVar2.f = cVar;
        return cVar2;
    }

    public static q630.c c(q630.c cVar) {
        boolean z = cVar.o;
        if (z) {
            eh50<Object> eh50Var = a570.a;
            if (!z) {
                uzw.b("autoInvalidateRemovedNode called on unattached node");
            }
            a570.a(cVar, -1, 2);
            cVar.f2();
            cVar.Z1();
        }
        q630.c cVar2 = cVar.g;
        q630.c cVar3 = cVar.f;
        if (cVar2 != null) {
            cVar2.f = cVar3;
            cVar.g = null;
        }
        if (cVar3 != null) {
            cVar3.g = cVar2;
            cVar.f = null;
        }
        return cVar3;
    }

    public static void h(q630.b bVar, q630.b bVar2, q630.c cVar) {
        if ((bVar instanceof d730) && (bVar2 instanceof d730)) {
            ((d730) bVar2).s(cVar);
            if (cVar.o) {
                a570.c(cVar);
                return;
            } else {
                cVar.k = true;
                return;
            }
        }
        if (!(cVar instanceof androidx.compose.ui.node.a)) {
            uzw.b("Unknown Modifier.Node type");
            return;
        }
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) cVar;
        if (aVar.o) {
            aVar.j2();
        }
        aVar.p = bVar2;
        aVar.d = a570.d(bVar2);
        if (aVar.o) {
            aVar.i2(false);
        }
        if (cVar.o) {
            a570.c(cVar);
        } else {
            cVar.k = true;
        }
    }

    public final boolean d(int i) {
        return (i & this.f.e) != 0;
    }

    public final void e() {
        for (q630.c cVar = this.f; cVar != null; cVar = cVar.g) {
            cVar.e2();
            if (cVar.j) {
                eh50<Object> eh50Var = a570.a;
                if (!cVar.o) {
                    uzw.b("autoInvalidateInsertedNode called on unattached node");
                }
                a570.a(cVar, -1, 1);
            }
            if (cVar.k) {
                a570.c(cVar);
            }
            cVar.j = false;
            cVar.k = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, ci50<q630.b> ci50Var, ci50<q630.b> ci50Var2, q630.c cVar, boolean z) {
        int i2;
        ci50<q630.b> ci50Var3;
        ci50<q630.b> ci50Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        a aVar = this.j;
        if (aVar == null) {
            i2 = i;
            ci50Var3 = ci50Var;
            ci50Var4 = ci50Var2;
            aVar = new a(cVar, i2, ci50Var3, ci50Var4, z);
            this.j = aVar;
        } else {
            i2 = i;
            ci50Var3 = ci50Var;
            ci50Var4 = ci50Var2;
            aVar.a = cVar;
            aVar.b = i2;
            aVar.c = ci50Var3;
            aVar.d = ci50Var4;
            aVar.e = z;
        }
        u470 u470Var = u470.this;
        int i9 = ci50Var3.d - i2;
        int i10 = ci50Var4.d - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        r9x r9xVar = new r9x(i11 * 3);
        r9x r9xVar2 = new r9x(i11 * 4);
        int i12 = 0;
        r9xVar2.b(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = r9xVar2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = r9xVar2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            r9xVar2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            r9xVar2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            r9xVar2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            r9xVar2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && aVar.a(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        r9xVar.a(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    r9xVar2.b(i23, iArr2[i15], i19, iArr2[c2]);
                    r9xVar2.b(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = r9xVar.b;
        if (i55 % 3 != 0) {
            uzw.b("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            r9xVar.c(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        r9xVar.a(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < r9xVar.b) {
            int[] iArr8 = r9xVar.a;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                q630.c cVar2 = aVar.a;
                q630.c cVar3 = cVar2.g;
                if ((cVar3.d & 2) != 0) {
                    androidx.compose.ui.node.o oVar = cVar3.i;
                    androidx.compose.ui.node.o oVar2 = oVar.u;
                    androidx.compose.ui.node.o oVar3 = oVar.t;
                    if (oVar2 != null) {
                        oVar2.t = oVar3;
                    }
                    oVar3.u = oVar2;
                    a(u470Var, cVar2, oVar3);
                }
                aVar.a = c(cVar3);
                i57++;
            }
            while (i58 < i62) {
                q630.c b2 = b(aVar.d.b[aVar.b + i58], aVar.a);
                aVar.a = b2;
                if (aVar.e) {
                    androidx.compose.ui.node.o oVar4 = b2.g.i;
                    noy c5 = itl.c(b2);
                    if (c5 != null) {
                        androidx.compose.ui.node.d dVar = new androidx.compose.ui.node.d(u470Var.a, c5);
                        aVar.a.h2(dVar);
                        a(u470Var, aVar.a, dVar);
                        dVar.u = oVar4.u;
                        dVar.t = oVar4;
                        oVar4.u = dVar;
                    } else {
                        aVar.a.h2(oVar4);
                    }
                    aVar.a.Y1();
                    aVar.a.e2();
                    q630.c cVar4 = aVar.a;
                    eh50<Object> eh50Var = a570.a;
                    if (!cVar4.o) {
                        uzw.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    a570.a(cVar4, -1, 1);
                } else {
                    b2.j = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    aVar.a = aVar.a.g;
                    ci50<q630.b> ci50Var5 = aVar.c;
                    int i64 = aVar.b;
                    q630.b bVar = ci50Var5.b[i64 + i57];
                    q630.b bVar2 = aVar.d.b[i64 + i58];
                    if (!epx.f(bVar, bVar2)) {
                        h(bVar, bVar2, aVar.a);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (q630.c cVar5 = this.e.f; cVar5 != null && cVar5 != this.b; cVar5 = cVar5.f) {
            i65 |= cVar5.d;
            cVar5.e = i65;
        }
    }

    public final void g() {
        LayoutNode layoutNode;
        androidx.compose.ui.node.d dVar;
        q630.c cVar = this.e.f;
        androidx.compose.ui.node.o oVar = this.c;
        q630.c cVar2 = cVar;
        while (true) {
            layoutNode = this.a;
            if (cVar2 == null) {
                break;
            }
            noy c = itl.c(cVar2);
            if (c != null) {
                androidx.compose.ui.node.o oVar2 = cVar2.i;
                if (oVar2 != null) {
                    androidx.compose.ui.node.d dVar2 = (androidx.compose.ui.node.d) oVar2;
                    noy noyVar = dVar2.Y;
                    dVar2.n2(c);
                    dVar = dVar2;
                    if (noyVar != cVar2) {
                        m490 m490Var = dVar2.P;
                        dVar = dVar2;
                        if (m490Var != null) {
                            m490Var.invalidate();
                            dVar = dVar2;
                        }
                    }
                } else {
                    androidx.compose.ui.node.d dVar3 = new androidx.compose.ui.node.d(layoutNode, c);
                    cVar2.h2(dVar3);
                    dVar = dVar3;
                }
                oVar.u = dVar;
                dVar.t = oVar;
                oVar = dVar;
            } else {
                cVar2.h2(oVar);
            }
            cVar2 = cVar2.f;
        }
        LayoutNode I = layoutNode.I();
        oVar.u = I != null ? I.G.c : null;
        this.d = oVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        q630.c cVar = this.f;
        t2o0 t2o0Var = this.e;
        if (cVar != t2o0Var) {
            while (true) {
                if (cVar == null || cVar == t2o0Var) {
                    break;
                }
                sb.append(String.valueOf(cVar));
                if (cVar.g == t2o0Var) {
                    sb.append(X3.j.e);
                    break;
                }
                sb.append(StringUtils.COMMA);
                cVar = cVar.g;
            }
        } else {
            sb.append(X3.j.e);
        }
        return sb.toString();
    }
}
