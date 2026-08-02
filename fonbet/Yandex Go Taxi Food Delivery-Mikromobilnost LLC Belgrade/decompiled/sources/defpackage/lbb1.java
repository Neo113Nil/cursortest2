package defpackage;

import android.graphics.Paint;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ViewMode;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class lbb1 {
    public static final void a(eo6 eo6Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1696465039);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(eo6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ViewMode viewMode = eo6Var.d;
            long j = eo6Var.e;
            int i3 = lo6.a[viewMode.ordinal()];
            int i4 = 11;
            c530 c530Var = c530.a;
            if (i3 == 1) {
                btsVar.e0(510008086);
                vqr.c(an91.m(c530Var, 16.0f, 0.0f, 2), new i43(c8m.b(j), true, new quz(i4)), new i43(c8m.a(j), true, new quz(i4)), null, 0, 0, wwg.S(-1451439316, true, new qk30(8, eo6Var, tlsVar, tlsVar2), btsVar), btsVar, 1572870, 56);
                btsVar.t(false);
            } else {
                if (i3 != 2) {
                    throw unr0.y(-1784664910, btsVar, false);
                }
                btsVar.e0(510374413);
                i43 i43Var = new i43(c8m.b(j), true, new quz(i4));
                to5 to5Var = x4c.F;
                f530 l = pw91.l(c530Var, pw91.o(btsVar), 14);
                lhl0 a = khl0.a(i43Var, to5Var, btsVar, 48);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, l);
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
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d);
                oeb1.c(btsVar, ljs0.q(c530Var, 12.0f));
                c(eo6Var, tlsVar, tlsVar2, btsVar, i2 & 1022);
                oeb1.c(btsVar, ljs0.q(c530Var, 12.0f));
                btsVar.t(true);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jo6(eo6Var, tlsVar, tlsVar2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, boolean z, float f, float f2, jt1 jt1Var, byk0 byk0Var, final a aVar, fid fidVar, final int i, final int i2) {
        final f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        float f3;
        int i5;
        byk0 byk0Var2;
        final float f4;
        bts btsVar;
        final boolean z3;
        final float f5;
        final byk0 byk0Var3;
        final jt1 jt1Var2;
        aii0 v;
        f530 f530Var3;
        jt1 jt1Var3;
        float f6;
        int i6;
        float f7;
        byk0 byk0Var4;
        boolean z4;
        int i7;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-676863600);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                f3 = f2;
                i3 |= btsVar2.b(f3) ? 2048 : 1024;
                i5 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        byk0Var2 = byk0Var;
                        if (btsVar2.k(byk0Var2)) {
                            i7 = 131072;
                            i5 |= i7;
                        }
                    } else {
                        byk0Var2 = byk0Var;
                    }
                    i7 = 65536;
                    i5 |= i7;
                } else {
                    byk0Var2 = byk0Var;
                }
                if ((1572864 & i) == 0) {
                    i5 |= btsVar2.e(aVar) ? 1048576 : 524288;
                }
                if (btsVar2.V(i5 & 1, (599187 & i5) != 599186)) {
                    btsVar2.a0();
                    if ((i & 1) == 0 || btsVar2.C()) {
                        f530 f530Var4 = i8 != 0 ? c530.a : f530Var2;
                        if (i9 != 0) {
                            z2 = true;
                        }
                        float f8 = ((YandexShapes) btsVar2.m(qm51.a)).d;
                        int i10 = i5 & (-897);
                        float f9 = i4 != 0 ? -8.0f : f3;
                        uo5 uo5Var = x4c.b;
                        if ((i2 & 32) != 0) {
                            byk0Var4 = cyk0.e(f8, f8, 0.0f, 0.0f, 12);
                            f530Var3 = f530Var4;
                            jt1Var3 = uo5Var;
                            f6 = f8;
                            i6 = i5 & (-459649);
                            z4 = z2;
                            f7 = f9;
                            btsVar2.u();
                            byk0 byk0Var5 = byk0Var4;
                            jt1 jt1Var4 = jt1Var3;
                            float floatValue = ((Number) androidx.compose.animation.core.b.b(z4 ? 0.07f : 0.0f, sb2.K(300, 0, null, 6), "alpha_shadowed_box", null, btsVar2, 3120, 20).getValue()).floatValue();
                            long j = ldc.b;
                            int X = rzo.X(ldc.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                            final int X2 = rzo.X(ldc.b(j, floatValue, 0.0f, 0.0f, 0.0f, 14));
                            final eb2 eb2Var = new eb2();
                            final Paint paint = eb2Var.a;
                            paint.setColor(X);
                            final float f10 = f6;
                            final float f11 = f7;
                            f530 l = ymb1.l(m4m0.b(bb1.g(f530Var3, new tls() { // from class: gx21
                                @Override // defpackage.tls
                                public final Object invoke(Object obj) {
                                    qam qamVar = (qam) obj;
                                    i28 q = qamVar.N().q();
                                    paint.setShadowLayer(qamVar.w0(7.0f), qamVar.w0(0.0f), qamVar.w0(f11), X2);
                                    q.save();
                                    float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                    float f12 = f10;
                                    q.e(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, qamVar.w0(f12), qamVar.w0(f12), eb2Var);
                                    q.n();
                                    return zy11.a;
                                }
                            }), ((el51) btsVar2.m(gl51.a)).c(), byk0Var5), byk0Var5);
                            z910 d = pi6.d(jt1Var4, false);
                            int hashCode = Long.hashCode(btsVar2.T);
                            r1b0 o = btsVar2.o();
                            f530 d2 = b.d(btsVar2, l);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (btsVar2.a != null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar2.i0();
                            if (btsVar2.S) {
                                btsVar2.n(slsVar);
                            } else {
                                btsVar2.r0();
                            }
                            qje.W(btsVar2, d.f, d);
                            qje.W(btsVar2, d.e, o);
                            wls wlsVar = d.g;
                            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                                b64.z(hashCode, btsVar2, hashCode, wlsVar);
                            }
                            qje.W(btsVar2, d.d, d2);
                            nnm.p((i6 >> 18) & 14, aVar, btsVar2, true);
                            f4 = f10;
                            btsVar = btsVar2;
                            f5 = f11;
                            f530Var2 = f530Var3;
                            z3 = z4;
                            jt1Var2 = jt1Var4;
                            byk0Var3 = byk0Var5;
                        } else {
                            f530Var3 = f530Var4;
                            jt1Var3 = uo5Var;
                            f6 = f8;
                            i6 = i10;
                            f7 = f9;
                            byk0Var4 = byk0Var2;
                        }
                    } else {
                        btsVar2.Y();
                        int i11 = i5 & (-897);
                        if ((i2 & 32) != 0) {
                            i11 = i5 & (-459649);
                        }
                        f6 = f;
                        i6 = i11;
                        f7 = f3;
                        byk0Var4 = byk0Var2;
                        jt1Var3 = jt1Var;
                        f530Var3 = f530Var2;
                    }
                    z4 = z2;
                    btsVar2.u();
                    byk0 byk0Var52 = byk0Var4;
                    jt1 jt1Var42 = jt1Var3;
                    float floatValue2 = ((Number) androidx.compose.animation.core.b.b(z4 ? 0.07f : 0.0f, sb2.K(300, 0, null, 6), "alpha_shadowed_box", null, btsVar2, 3120, 20).getValue()).floatValue();
                    long j2 = ldc.b;
                    int X3 = rzo.X(ldc.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                    final int X22 = rzo.X(ldc.b(j2, floatValue2, 0.0f, 0.0f, 0.0f, 14));
                    final eb2 eb2Var2 = new eb2();
                    final Paint paint2 = eb2Var2.a;
                    paint2.setColor(X3);
                    final float f102 = f6;
                    final float f112 = f7;
                    f530 l2 = ymb1.l(m4m0.b(bb1.g(f530Var3, new tls() { // from class: gx21
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            qam qamVar = (qam) obj;
                            i28 q = qamVar.N().q();
                            paint2.setShadowLayer(qamVar.w0(7.0f), qamVar.w0(0.0f), qamVar.w0(f112), X22);
                            q.save();
                            float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            float f12 = f102;
                            q.e(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, qamVar.w0(f12), qamVar.w0(f12), eb2Var2);
                            q.n();
                            return zy11.a;
                        }
                    }), ((el51) btsVar2.m(gl51.a)).c(), byk0Var52), byk0Var52);
                    z910 d3 = pi6.d(jt1Var42, false);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d22 = b.d(btsVar2, l2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a != null) {
                    }
                } else {
                    btsVar2.Y();
                    f4 = f;
                    btsVar = btsVar2;
                    z3 = z2;
                    f5 = f3;
                    byk0Var3 = byk0Var2;
                    jt1Var2 = jt1Var;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: zgr0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lbb1.b(f530.this, z3, f4, f5, jt1Var2, byk0Var3, aVar, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            f3 = f2;
            i5 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (btsVar2.V(i5 & 1, (599187 & i5) != 599186)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z2 = z;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        i5 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (btsVar2.V(i5 & 1, (599187 & i5) != 599186)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public static final void c(eo6 eo6Var, tls tlsVar, final tls tlsVar2, fid fidVar, int i) {
        bts btsVar;
        long g;
        ldc ldcVar;
        final tls tlsVar3 = tlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1583701036);
        int i2 = (i & 6) == 0 ? (btsVar2.k(eo6Var) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar3) ? 32 : 16;
        }
        int i4 = 256;
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        }
        final int i5 = 1;
        final boolean z = 0;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            bts btsVar3 = btsVar2;
            for (final zn6 zn6Var : eo6Var.c) {
                int i6 = ((i2 & 112) == i3 ? i5 : z) | (btsVar3.k(zn6Var) ? 1 : 0);
                Object Q = btsVar3.Q();
                o430 o430Var = did.a;
                Object obj = Q;
                if (i6 != 0 || Q == o430Var) {
                    sls slsVar = new sls() { // from class: ko6
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i7 = z;
                            zy11 zy11Var = zy11.a;
                            zn6 zn6Var2 = zn6Var;
                            tls tlsVar4 = tlsVar3;
                            switch (i7) {
                                case 0:
                                    tlsVar4.invoke(zn6Var2.g);
                                    break;
                                default:
                                    tlsVar4.invoke(zn6Var2.f);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar3.o0(slsVar);
                    obj = slsVar;
                }
                sls slsVar2 = (sls) obj;
                int i7 = ((i2 & 896) == i4 ? i5 : z) | (btsVar3.k(zn6Var) ? 1 : 0);
                Object Q2 = btsVar3.Q();
                Object obj2 = Q2;
                if (i7 != 0 || Q2 == o430Var) {
                    sls slsVar3 = new sls() { // from class: ko6
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i72 = i5;
                            zy11 zy11Var = zy11.a;
                            zn6 zn6Var2 = zn6Var;
                            tls tlsVar4 = tlsVar2;
                            switch (i72) {
                                case 0:
                                    tlsVar4.invoke(zn6Var2.g);
                                    break;
                                default:
                                    tlsVar4.invoke(zn6Var2.f);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar3.o0(slsVar3);
                    obj2 = slsVar3;
                }
                sls slsVar4 = (sls) obj2;
                boolean z2 = zn6Var.a;
                dty0 dty0Var = zn6Var.d;
                if (z2) {
                    btsVar3.e0(1069292279);
                    g = ((el51) btsVar3.m(gl51.a)).f();
                    btsVar3.t(z);
                } else {
                    btsVar3.e0(1069359766);
                    g = ((el51) btsVar3.m(gl51.a)).g();
                    btsVar3.t(z);
                }
                ldc ldcVar2 = new ldc(g);
                float f = zn6Var.b;
                if (dty0Var == null || (ldcVar = dty0Var.c) == null) {
                    if (z2) {
                        btsVar3.e0(1069517649);
                        long p = ((el51) btsVar3.m(gl51.a)).p();
                        btsVar3.t(z);
                        ldcVar = new ldc(p);
                    } else {
                        btsVar3.e0(1069590065);
                        btsVar3.t(z);
                        ldcVar = null;
                    }
                }
                bts btsVar4 = btsVar3;
                ru.yandex.taxi.logistics.sdk.ui.form.a.a(slsVar2, slsVar4, ldcVar2, f, 0.0f, 0L, ldcVar, zn6Var.c, dty0Var != null ? dty0Var.a : null, dty0Var != null ? dty0Var.b : null, zn6Var.e, null, false, null, Boolean.valueOf(z2), false, btsVar4, 0, ImageMetadata.EDGE_MODE, 14384);
                i2 = i2;
                i4 = 256;
                i3 = 32;
                btsVar3 = btsVar4;
                i5 = i5;
                z = z;
                tlsVar3 = tlsVar;
            }
            btsVar = btsVar3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jo6(eo6Var, tlsVar, tlsVar2, i, 1);
        }
    }

    public static String d(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
