package defpackage;

import com.yandex.messaging.miniapps.size.PredefinedSizeValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes4.dex */
public abstract class edb1 {
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0193, code lost:
    
        r3 = r8;
        defpackage.ny61.g("Invalid KeyAgreeRecipientIdentifier: ".concat(r12.getClass().getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a5, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [i3] */
    /* JADX WARN: Type inference failed for: r14v11, types: [i3] */
    /* JADX WARN: Type inference failed for: r15v1, types: [p1, x3] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [qgi0] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [p0x] */
    /* JADX WARN: Type inference failed for: r7v11, types: [ogi0, ojx] */
    /* JADX WARN: Type inference failed for: r7v9, types: [ogi0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pgi0 a(m3 m3Var, xr1 xr1Var, c06 c06Var) {
        kgi0 kgi0Var;
        ohx ohxVar;
        pgi0 pgi0Var;
        ?? r15;
        pgi0 pgi0Var2;
        nhx nhxVar;
        mjx mjxVar;
        qfx qfxVar;
        mjx mjxVar2;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            a2[] a2VarArr = m3Var.a;
            if (i == a2VarArr.length) {
                return new pgi0(arrayList);
            }
            a2 m = ngi0.n(a2VarArr[i]).m();
            pgi0 pgi0Var3 = null;
            if (m instanceof njx) {
                njx njxVar = (njx) m;
                ?? ojxVar = new ojx(njxVar.c, xr1Var, c06Var);
                ojxVar.e = njxVar;
                mgi0 mgi0Var = njxVar.b;
                boolean z2 = mgi0Var.a instanceof s3;
                o2 m2 = mgi0Var.m();
                if (z2) {
                    mjxVar2 = new mjx(null, null, w2.x(m2).a);
                } else {
                    p0x m3 = p0x.m(m2);
                    mjxVar2 = new mjx(m3.a, m3.b.x(), null);
                }
                ojxVar.a = mjxVar2;
                qfxVar = ojxVar;
            } else if (m instanceof jr80) {
                jr80 m4 = jr80.m((o2) m);
                if (p87.h1.q(m4.a)) {
                    a2 a2Var = m4.b;
                    rfx rfxVar = a2Var instanceof rfx ? (rfx) a2Var : a2Var != null ? new rfx(i3.z(a2Var)) : null;
                    ?? sfxVar = new sfx(rfxVar.c, xr1Var, c06Var);
                    mgi0 mgi0Var2 = rfxVar.b;
                    boolean z3 = mgi0Var2.a instanceof s3;
                    o2 m5 = mgi0Var2.m();
                    if (z3) {
                        mjxVar = new mjx(null, null, w2.x(m5).a);
                    } else {
                        p0x m6 = p0x.m(m5);
                        mjxVar = new mjx(m6.a, m6.b.x(), null);
                    }
                    sfxVar.a = mjxVar;
                    qfxVar = sfxVar;
                } else {
                    i++;
                    z = false;
                }
            } else if (m instanceof pfx) {
                pfx pfxVar = (pfx) m;
                qfx qfxVar2 = new qfx(pfxVar.c, xr1Var, c06Var);
                qfxVar2.a = new ofx(pfxVar.b.a.a);
                qfxVar = qfxVar2;
            } else {
                if (m instanceof phx) {
                    phx phxVar = (phx) m;
                    i3 i3Var = phxVar.x;
                    int i2 = z ? 1 : 0;
                    ?? r3 = z;
                    while (i2 < i3Var.size()) {
                        a2 A = i3Var.A(i2);
                        if (A instanceof kgi0) {
                            kgi0Var = (kgi0) A;
                        } else if (A != null) {
                            ?? z4 = i3.z(A);
                            kgi0 kgi0Var2 = new kgi0();
                            a2 A2 = z4.A(r3);
                            if (A2 != null && !(A2 instanceof ohx)) {
                                if (!(A2 instanceof i3)) {
                                    if (!(A2 instanceof s3)) {
                                        break loop0;
                                    }
                                    s3 s3Var = (s3) A2;
                                    if (s3Var.c != 0) {
                                        break loop0;
                                    }
                                    i3 i3Var2 = (i3) i3.b.Hg(s3Var, r3);
                                    if (i3Var2 != null) {
                                        ?? z5 = i3.z(i3Var2);
                                        qgi0 qgi0Var = new qgi0();
                                        qgi0Var.a = w2.x(z5.A(r3));
                                        int size = z5.size();
                                        if (size != 1) {
                                            pgi0Var = pgi0Var3;
                                            if (size != 2) {
                                                if (size != 3) {
                                                    ny61.g("Invalid RecipientKeyIdentifier");
                                                    return pgi0Var;
                                                }
                                                qgi0Var.b = g2.z(z5.A(1));
                                            } else if (z5.A(1) instanceof g2) {
                                                qgi0Var.b = g2.z(z5.A(1));
                                                r15 = qgi0Var;
                                            }
                                            qgi0Var.c = hr80.m(z5.A(2));
                                            r15 = qgi0Var;
                                        } else {
                                            pgi0Var = pgi0Var3;
                                            r15 = qgi0Var;
                                        }
                                    } else {
                                        pgi0Var = pgi0Var3;
                                        r15 = pgi0Var;
                                    }
                                    ohx ohxVar2 = new ohx();
                                    ohxVar2.a = pgi0Var;
                                    ohxVar2.b = r15;
                                    ohxVar = ohxVar2;
                                } else {
                                    ohxVar = new ohx(p0x.m((o2) A2));
                                }
                            } else {
                                ohxVar = (ohx) A2;
                            }
                            kgi0Var2.a = ohxVar;
                            kgi0Var2.b = (w2) z4.A(1);
                            kgi0Var = kgi0Var2;
                        } else {
                            kgi0Var = null;
                        }
                        ohx ohxVar3 = kgi0Var.a;
                        p0x p0xVar = ohxVar3.a;
                        if (p0xVar != null) {
                            pgi0Var2 = null;
                            nhxVar = new nhx(p0xVar.a, p0xVar.b.x(), null);
                        } else {
                            pgi0Var2 = null;
                            nhxVar = new nhx(null, null, ohxVar3.b.a.a);
                        }
                        w2 w2Var = kgi0Var.b;
                        qhx qhxVar = new qhx(phxVar.w, xr1Var, c06Var);
                        qhxVar.e = phxVar;
                        qhxVar.a = nhxVar;
                        qhxVar.f = w2Var;
                        arrayList.add(qhxVar);
                        i2++;
                        pgi0Var3 = pgi0Var2;
                        r3 = 0;
                    }
                } else if (m instanceof wp90) {
                    xp90 xp90Var = new xp90(((wp90) m).c, xr1Var, c06Var);
                    xp90Var.a = new vp90();
                    arrayList.add(xp90Var);
                }
                i++;
                z = false;
            }
            arrayList.add(qfxVar);
            i++;
            z = false;
        }
    }

    public static final List b(q5y q5yVar, z5y z5yVar, a5y a5yVar) {
        d6w d6wVar;
        wz40 wz40Var = a5yVar.a;
        if (!(wz40Var.c != 0) && z5yVar.a.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        if (a5yVar.a.c != 0) {
            int i = wz40Var.c;
            if (i == 0) {
                w511.i("MutableVector is empty.");
                return null;
            }
            Object[] objArr = wz40Var.a;
            int i2 = ((z4y) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((z4y) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                lxv.a("negative minIndex");
            }
            int i5 = wz40Var.c;
            if (i5 == 0) {
                w511.i("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = wz40Var.a;
            int i6 = ((z4y) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((z4y) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            d6wVar = new d6w(i2, Math.min(i6, q5yVar.getItemCount() - 1), 1);
        } else {
            d6wVar = d6w.w;
        }
        int size = z5yVar.a.size();
        for (int i9 = 0; i9 < size; i9++) {
            y5y y5yVar = (y5y) z5yVar.get(i9);
            int b = idb1.b(y5yVar.c, q5yVar, y5yVar.a);
            int i10 = d6wVar.a;
            if ((b > d6wVar.b || i10 > b) && b >= 0 && b < q5yVar.getItemCount()) {
                arrayList.add(Integer.valueOf(b));
            }
        }
        int i11 = d6wVar.a;
        int i12 = d6wVar.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static jjs0 c(b bVar) {
        String a;
        b bVar2;
        b bVar3 = (b) qcx.m(bVar).get("height");
        hdb1 hdb1Var = null;
        if (bVar3 == null) {
            return null;
        }
        c m = qcx.m(bVar3);
        b bVar4 = (b) m.get("type");
        if (bVar4 != null && (a = qcx.n(bVar4).a()) != null && (bVar2 = (b) m.get("value")) != null) {
            if (a.equals("numeric")) {
                Integer l = bvu0.l(10, qcx.n(bVar2).a());
                if (l != null) {
                    hdb1Var = new sjs0(l.intValue());
                }
            } else if (a.equals("predefined") && jl40.l(qcx.n(bVar2).a(), "match_safe_viewport_area")) {
                hdb1Var = new tjs0(PredefinedSizeValue.MatchSafeViewportArea);
            }
        }
        return new jjs0(hdb1Var);
    }
}
