package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class f0b1 {
    public static final void a(final hsm0 hsm0Var, tls tlsVar, fid fidVar, int i) {
        boolean z;
        c530 c530Var;
        float f;
        o430 o430Var;
        boolean z2;
        tls tlsVar2;
        tls tlsVar3 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(768006682);
        int i2 = i | (btsVar.k(hsm0Var) ? 4 : 2) | (btsVar.e(tlsVar3) ? 32 : 16);
        final int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 d = i9a1.d(an91.k(c530Var2, 8.0f));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            CharSequence charSequence = hsm0Var.c.b;
            o430 o430Var2 = did.a;
            if (charSequence != null) {
                btsVar.e0(-1922673574);
                f530 c = ljs0.c(an91.o(c530Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), 1.0f);
                boolean z3 = (i2 & 112) == 32;
                Object Q = btsVar.Q();
                if (z3 || Q == o430Var2) {
                    Q = new wzl0(8, tlsVar3);
                    btsVar.o0(Q);
                }
                c530Var = c530Var2;
                f = 1.0f;
                o430Var = o430Var2;
                z = false;
                xlb1.a((sls) Q, c, false, null, null, wwg.S(-1498627844, true, new zls() { // from class: asm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        hsm0 hsm0Var2 = hsm0Var;
                        switch (i4) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var, hsm0Var2.c.b, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 16382);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var2, hsm0Var2.c.a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16382);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, btsVar, 196656, 988);
                btsVar.t(false);
            } else {
                z = false;
                c530Var = c530Var2;
                f = 1.0f;
                o430Var = o430Var2;
                btsVar.e0(-1922367790);
                btsVar.t(false);
            }
            if (hsm0Var.c.a != null) {
                btsVar.e0(-1922298753);
                f530 c2 = ljs0.c(c530Var, f);
                boolean z4 = (i2 & 112) == 32 ? true : z;
                Object Q2 = btsVar.Q();
                if (z4 || Q2 == o430Var) {
                    tlsVar2 = tlsVar;
                    Q2 = new wzl0(9, tlsVar2);
                    btsVar.o0(Q2);
                } else {
                    tlsVar2 = tlsVar;
                }
                final int i4 = 1;
                tlsVar3 = tlsVar2;
                z2 = true;
                phb1.b((sls) Q2, c2, false, null, null, wwg.S(-1909755167, true, new zls() { // from class: asm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i42 = i4;
                        zy11 zy11Var = zy11.a;
                        hsm0 hsm0Var2 = hsm0Var;
                        switch (i42) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var, hsm0Var2.c.b, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 16382);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var2, hsm0Var2.c.a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16382);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, btsVar, 196656, 988);
                btsVar.t(z);
            } else {
                tlsVar3 = tlsVar;
                z2 = true;
                btsVar.e0(-1922028526);
                btsVar.t(z);
            }
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(hsm0Var, tlsVar3, i, 18);
        }
    }

    public static final void b(ybu ybuVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-732292026);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 60.0f);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new iws(15);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(e, false, (tls) Q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            ymb1.j(ybuVar.a, an91.o(c530Var, 16.0f, 20.0f, 16.0f, 0.0f, 8), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 4, null, null, btsVar, 24624, HProv.ALG_TYPE_SECURECHANNEL, 57324);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(ybuVar, i, 8);
        }
    }

    public static final void c(fsm0 fsm0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(397361192);
        int i2 = (btsVar.k(fsm0Var) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            for (final esm0 esm0Var : fsm0Var.a) {
                ydb1.a(null, wwg.S(562313060, true, new zls() { // from class: zrm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        esm0 esm0Var2 = esm0Var;
                        switch (i5) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    String str = esm0Var2.a;
                                    if (str != null && str.length() != 0) {
                                        btsVar2.e0(1495966344);
                                        tdb1.d(ibp0Var, mja1.a(esm0Var2.a, null, 6), null, null, null, mhe.c, 0.0f, 0, null, btsVar2, (intValue & 14) | 1572864, 478);
                                        btsVar2.t(false);
                                        break;
                                    } else {
                                        btsVar2.e0(1496118740);
                                        udb1.c(ibp0Var, wza1.i(), null, null, btsVar2, intValue & 14, 14);
                                        btsVar2.t(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    qgy.b(esm0Var2.b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(-2049335095, true, new zls() { // from class: zrm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        esm0 esm0Var2 = esm0Var;
                        switch (i5) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    String str = esm0Var2.a;
                                    if (str != null && str.length() != 0) {
                                        btsVar2.e0(1495966344);
                                        tdb1.d(ibp0Var, mja1.a(esm0Var2.a, null, 6), null, null, null, mhe.c, 0.0f, 0, null, btsVar2, (intValue & 14) | 1572864, 478);
                                        btsVar2.t(false);
                                        break;
                                    } else {
                                        btsVar2.e0(1496118740);
                                        udb1.c(ibp0Var, wza1.i(), null, null, btsVar2, intValue & 14, 14);
                                        btsVar2.t(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    qgy.b(esm0Var2.b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, false, btsVar, 432, 249);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(fsm0Var, i, 19);
        }
    }

    public static final void d(hsm0 hsm0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-175807574);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(hsm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new ut9(26, hsm0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(hsm0Var, tlsVar, i, 27);
        }
    }

    public static final void e(gsm0 gsm0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(659450280);
        int i2 = (btsVar.k(gsm0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ydb1.a(an91.o(c530.a, 0.0f, 12.0f, 0.0f, 0.0f, 13), null, wwg.S(484386425, true, new pdf0(24, gsm0Var), btsVar), null, null, null, null, false, btsVar, 390, 250);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(gsm0Var, i, 20);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean f(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0b1.f(java.lang.String, java.lang.String):boolean");
    }

    public static String g(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ HexString.CHAR_SPACE);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String h(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ HexString.CHAR_SPACE);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
