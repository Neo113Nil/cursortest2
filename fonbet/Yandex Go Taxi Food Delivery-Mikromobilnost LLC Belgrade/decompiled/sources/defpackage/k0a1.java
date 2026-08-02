package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.google.common.primitives.ImmutableIntArray;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeOrientation;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeType;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dj6;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.gv90;
import defpackage.hi91;
import defpackage.j4z;
import defpackage.jl40;
import defpackage.k0a1;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.ln1;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.n8e;
import defpackage.o5n;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.t8j;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.uzh0;
import defpackage.vfc;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.ymj;
import defpackage.z910;
import defpackage.zy11;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class k0a1 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static final void a(String str, v4v v4vVar, fid fidVar, int i) {
        bts btsVar;
        a aVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1259865048);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i | (btsVar2.k(v4vVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 o = an91.o(c530.a, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            a aVar2 = null;
            if (str == null) {
                btsVar2.e0(1079745117);
                btsVar2.t(false);
                aVar = null;
            } else {
                btsVar2.e0(1079745118);
                a S = wwg.S(367307503, true, new q0(str, 20), btsVar2);
                btsVar2.t(false);
                aVar = S;
            }
            if (v4vVar == null) {
                btsVar2.e0(1079837714);
                btsVar2.t(false);
            } else {
                btsVar2.e0(1079837715);
                aVar2 = wwg.S(-1635556677, true, new mb(v4vVar, 8), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(o, 32.0f, false, 0.0f, null, null, aVar, null, null, aVar2, null, null, false, btsVar, 6, 0, 7612);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(str, v4vVar, i, 27);
        }
    }

    public static final void b(final o5n o5nVar, f530 f530Var, final tls tlsVar, tls tlsVar2, tls tlsVar3, fid fidVar, int i) {
        tls tlsVar4;
        tls tlsVar5;
        bts btsVar;
        boolean z;
        final oz40 oz40Var;
        final boolean z2;
        boolean z3;
        final boolean z4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1588875756);
        int i2 = i | (btsVar2.k(o5nVar) ? 4 : 2) | (btsVar2.k(f530Var) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q);
            }
            final tse tseVar = (tse) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(null);
                btsVar2.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            boolean z5 = o5nVar.g == DeliveryStateItem$Barcode$BarcodeOrientation.HORIZONTAL;
            if (o5nVar.d == DeliveryStateItem$Barcode$BarcodeType.QR) {
                z = false;
                oz40Var = oz40Var2;
                z2 = true;
            } else {
                z = false;
                oz40Var = oz40Var2;
                z2 = false;
            }
            if (o5nVar.e == null && o5nVar.f == null) {
                z3 = z5;
                z4 = z;
            } else {
                z3 = z5;
                z4 = true;
            }
            if ((i2 & 14) == 4) {
                z = true;
            }
            Object Q3 = btsVar2.Q();
            if (z || Q3 == o430Var) {
                tlsVar4 = tlsVar2;
                tlsVar5 = tlsVar3;
                Q3 = new f89(29, tlsVar4, o5nVar, tlsVar5);
                btsVar2.o0(Q3);
            } else {
                tlsVar4 = tlsVar2;
                tlsVar5 = tlsVar3;
            }
            zpn.a(zy11.a, (tls) Q3, btsVar2);
            f530 k = ljs0.c(c530.a, 1.0f).k(f530Var);
            final boolean z6 = z3;
            a S = wwg.S(1999463874, true, new zls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui.a
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v13 */
                /* JADX WARN: Type inference failed for: r13v15, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r13v16 */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Pair pair;
                    int f0;
                    boolean z7;
                    c530 c530Var;
                    f530 f530Var2;
                    boolean z8;
                    ?? r13;
                    dj6 dj6Var = (dj6) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    boolean V = btsVar3.V(intValue & 1, (intValue & 19) != 18);
                    dmw0 dmw0Var = btsVar3.a;
                    if (V) {
                        long j = dj6Var.b;
                        Configuration configuration = (Configuration) btsVar3.m(AndroidCompositionLocals_androidKt.a);
                        boolean z9 = z6;
                        if (z9) {
                            btsVar3.e0(-872981002);
                            pair = new Pair(Integer.valueOf(n8e.i(j)), Integer.valueOf(((fwi) btsVar3.m(j.h)).f0(56.0f)));
                            btsVar3.t(false);
                        } else {
                            btsVar3.e0(-872805015);
                            pair = new Pair(Integer.valueOf(n8e.i(j)), Integer.valueOf((((fwi) btsVar3.m(j.h)).f0(configuration.screenHeightDp) * 70) / 100));
                            btsVar3.t(false);
                        }
                        int intValue2 = ((Number) pair.getFirst()).intValue();
                        int intValue3 = ((Number) pair.getSecond()).intValue();
                        if (z9) {
                            btsVar3.e0(-872544305);
                            f0 = ((fwi) btsVar3.m(j.h)).f0(200.0f);
                            btsVar3.t(false);
                        } else {
                            btsVar3.e0(-872458032);
                            f0 = ((fwi) btsVar3.m(j.h)).f0(286.0f);
                            btsVar3.t(false);
                        }
                        int i3 = f0;
                        o5n o5nVar2 = o5nVar;
                        boolean k2 = btsVar3.k(o5nVar2.c) | btsVar3.c(o5nVar2.g.ordinal()) | btsVar3.c(o5nVar2.d.ordinal());
                        Object Q4 = btsVar3.Q();
                        oz40 oz40Var3 = oz40Var;
                        boolean z10 = z2;
                        Object obj4 = did.a;
                        if (k2 || Q4 == obj4) {
                            z7 = z9;
                            Q4 = tje.N(tseVar, uyj.a, null, new DynamicContentBarcodeKt$DynamicContentBarcode$4$3$1(oz40Var3, z10, o5nVar2, i3, intValue2, intValue3, z7, null), 2);
                            btsVar3.o0(Q4);
                        } else {
                            z7 = z9;
                        }
                        gv90 gv90Var = o5nVar2.h;
                        c530 c530Var2 = c530.a;
                        if (gv90Var != null) {
                            btsVar3.e0(1634447283);
                            tls tlsVar6 = tlsVar;
                            boolean k3 = btsVar3.k(tlsVar6) | btsVar3.k(o5nVar2);
                            Object Q5 = btsVar3.Q();
                            if (k3 || Q5 == obj4) {
                                Q5 = new ymj(15, tlsVar6, o5nVar2);
                                btsVar3.o0(Q5);
                            }
                            f530Var2 = q791.d(c530Var2, false, null, null, (sls) Q5, 15);
                            c530Var = c530Var2;
                            btsVar3.t(false);
                        } else {
                            c530Var = c530Var2;
                            btsVar3.e0(1634449002);
                            btsVar3.t(false);
                            f530Var2 = c530Var;
                        }
                        String e = ohb1.e(btsVar3, uzh0.delivery_barcode);
                        f530 k4 = hi91.d(ljs0.c(c530Var, 1.0f), false, null, 3).k(f530Var2);
                        boolean k5 = btsVar3.k(e) | btsVar3.k(o5nVar2);
                        Object Q6 = btsVar3.Q();
                        if (k5 || Q6 == obj4) {
                            Q6 = new t8j(15, e, o5nVar2);
                            btsVar3.o0(Q6);
                        }
                        f530 a2 = fnq0.a(k4, (tls) Q6);
                        sic a3 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                        int hashCode = Long.hashCode(btsVar3.T);
                        r1b0 o = btsVar3.o();
                        f530 d = androidx.compose.ui.b.d(btsVar3, a2);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar3.i0();
                        if (btsVar3.S) {
                            btsVar3.n(slsVar);
                        } else {
                            btsVar3.r0();
                        }
                        wls wlsVar = d.f;
                        qje.W(btsVar3, wlsVar, a3);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar3, wlsVar2, o);
                        wls wlsVar3 = d.g;
                        if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                            b64.z(hashCode, btsVar3, hashCode, wlsVar3);
                        }
                        wls wlsVar4 = d.d;
                        qje.W(btsVar3, wlsVar4, d);
                        float f = (z10 && z7) ? 95.0f : z10 ? 45.0f : 16.0f;
                        Bitmap bitmap = (Bitmap) oz40Var3.getValue();
                        if (bitmap == null) {
                            btsVar3.e0(-1500191669);
                            btsVar3.t(false);
                            r13 = 0;
                        } else {
                            btsVar3.e0(-1500191668);
                            f530 b = m4m0.b(vfc.j(x4c.H, ymb1.l(an91.m(ljs0.c(c530Var, 1.0f), f, 0.0f, 2), cyk0.c(8.0f))), ldc.f, qke.q);
                            z910 d2 = pi6.d(x4c.b, false);
                            int hashCode2 = Long.hashCode(btsVar3.T);
                            r1b0 o2 = btsVar3.o();
                            f530 d3 = androidx.compose.ui.b.d(btsVar3, b);
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar);
                            } else {
                                btsVar3.r0();
                            }
                            qje.W(btsVar3, wlsVar, d2);
                            qje.W(btsVar3, wlsVar2, o2);
                            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode2))) {
                                b64.z(hashCode2, btsVar3, hashCode2, wlsVar3);
                            }
                            qje.W(btsVar3, wlsVar4, d3);
                            f530 l = an91.l(ljs0.c(c530Var, 1.0f), (!z7 || z10) ? 0.0f : 8.0f, (z7 || z10) ? 0.0f : 8.0f);
                            boolean e2 = btsVar3.e(bitmap);
                            Object Q7 = btsVar3.Q();
                            if (e2 || Q7 == obj4) {
                                z8 = true;
                                Q7 = new ln1(bitmap, 1);
                                btsVar3.o0(Q7);
                            } else {
                                z8 = true;
                            }
                            s3b1.f(new j4z((tls) Q7, null, 30), l, null, btsVar3, 0, 4);
                            btsVar3.t(z8);
                            r13 = 0;
                            btsVar3.t(false);
                        }
                        if (z4) {
                            btsVar3.e0(-1499139590);
                            k0a1.a(o5nVar2.e, o5nVar2.f, btsVar3, r13);
                            btsVar3.t(r13);
                        } else {
                            btsVar3.e0(-1499062710);
                            btsVar3.t(r13);
                        }
                        btsVar3.t(true);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2);
            btsVar = btsVar2;
            xab1.a(k, null, S, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            tlsVar4 = tlsVar2;
            tlsVar5 = tlsVar3;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) o5nVar, f530Var, tlsVar, (cms) tlsVar4, (Object) tlsVar5, i, 15);
        }
    }

    public static final List d(List list) {
        return list.size() > 1 ? kotlin.collections.a.v0(y6i0.n(1, list.size()), list) : EmptyList.a;
    }

    public static final List e(List list) {
        return (List) kotlin.collections.a.R(list);
    }

    public static boolean f(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (a[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static r3t0 g(c5p c5pVar, boolean z, boolean z2) {
        r3t0 r3t0Var;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int[] iArr;
        long length = c5pVar.getLength();
        long j = -1;
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i5 = (int) j2;
        ef90 ef90Var = new ef90(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (i7 < i5) {
            ef90Var.H(8);
            if (!c5pVar.H(ef90Var.a, i6, 8, true)) {
                break;
            }
            long A = ef90Var.A();
            int k = ef90Var.k();
            long j3 = j;
            if (A == 1) {
                c5pVar.g(8, 8, ef90Var.a);
                ef90Var.J(16);
                A = ef90Var.s();
                i3 = 16;
                i2 = i7;
            } else {
                if (A == 0) {
                    long length2 = c5pVar.getLength();
                    if (length2 != j3) {
                        A = (length2 - c5pVar.L()) + 8;
                    }
                }
                i2 = i7;
                i3 = 8;
            }
            long j4 = A;
            r3t0Var = null;
            long j5 = i3;
            if (j4 < j5) {
                return new gly0();
            }
            int i8 = i2 + i3;
            if (k == 1836019574) {
                i5 += (int) j4;
                if (length != -1 && i5 > length) {
                    i5 = (int) length;
                }
                i7 = i8;
                j = j3;
                i6 = 0;
            } else {
                if (k == 1836019558 || k == 1836475768) {
                    i = 1;
                    break;
                }
                if (k == 1835295092) {
                    z4 = true;
                }
                long j6 = length;
                if ((i8 + j4) - j5 >= i5) {
                    i = 0;
                    break;
                }
                int i9 = (int) (j4 - j5);
                i7 = i8 + i9;
                if (k != 1718909296) {
                    i4 = 0;
                    if (i9 != 0) {
                        c5pVar.N(i9);
                    }
                } else {
                    if (i9 < 8) {
                        return new gly0();
                    }
                    ef90Var.H(i9);
                    i4 = 0;
                    c5pVar.g(0, i9, ef90Var.a);
                    if (f(ef90Var.k(), z2)) {
                        z4 = true;
                    }
                    ef90Var.L(4);
                    int a2 = ef90Var.a() / 4;
                    if (!z4 && a2 > 0) {
                        iArr = new int[a2];
                        int i10 = 0;
                        while (true) {
                            if (i10 >= a2) {
                                z3 = z4;
                                break;
                            }
                            int k2 = ef90Var.k();
                            iArr[i10] = k2;
                            if (f(k2, z2)) {
                                z3 = true;
                                break;
                            }
                            i10++;
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        hay hayVar = new hay(16);
                        if (iArr == null) {
                            ImmutableIntArray immutableIntArray = ImmutableIntArray.a;
                            return hayVar;
                        }
                        ImmutableIntArray immutableIntArray2 = ImmutableIntArray.a;
                        if (iArr.length == 0) {
                            return hayVar;
                        }
                        new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
                        return hayVar;
                    }
                    z4 = z3;
                }
                i6 = i4;
                j = j3;
                length = j6;
            }
        }
        r3t0Var = null;
        i = i6;
        return !z4 ? wfz.H : z != i ? i != 0 ? xpb1.I : xpb1.J : r3t0Var;
    }
}
