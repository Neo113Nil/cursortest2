package defpackage;

import android.util.Log;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import yads.ct1;

/* loaded from: classes11.dex */
public abstract class i4a1 {
    public static final void a(yel0 yel0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-711656729);
        int i2 = (btsVar.k(yel0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            yrl.e(cj6.a.a(c530Var, uo5Var), null, btsVar, 0, 6);
            awk0 awk0Var = new awk0(0);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new azd(13, tlsVar);
                btsVar.o0(Q);
            }
            f530 d3 = q791.d(c530Var, false, null, awk0Var, (sls) Q, 11);
            a7d.a.getClass();
            ydb1.a(d3, a7d.b, wwg.S(1546958576, true, new ota(23, yel0Var), btsVar), null, null, null, null, false, btsVar, 432, 248);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(yel0Var, tlsVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final afl0 afl0Var, final ju2 ju2Var, final String str, final tls tlsVar, final int i, final int i2, final boolean z, f530 f530Var, f530 f530Var2, boolean z2, List list, fid fidVar, final int i3, final int i4) {
        int i5;
        f530 f530Var3;
        int i6;
        bts btsVar;
        final f530 f530Var4;
        final boolean z3;
        final List list2;
        final f530 f530Var5;
        f530 f530Var6;
        boolean z4;
        boolean z5;
        List list3;
        boolean k;
        Object Q;
        StringBuilder sb;
        String str2;
        boolean a;
        int i7;
        Object obj;
        boolean k2;
        Object Q2;
        boolean k3;
        Object Q3;
        boolean z6;
        Object Q4;
        int i8;
        boolean z7 = afl0Var.c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1595457814);
        if ((i3 & 6) == 0) {
            i5 = (btsVar2.k(afl0Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= btsVar2.k(ju2Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= btsVar2.k(str) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar2.c(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= btsVar2.c(i2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= btsVar2.a(z) ? 1048576 : 524288;
        }
        int i9 = i4 & 128;
        if (i9 != 0) {
            i5 |= 12582912;
            f530Var3 = f530Var;
        } else {
            f530Var3 = f530Var;
            if ((i3 & 12582912) == 0) {
                i5 |= btsVar2.k(f530Var3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
            }
        }
        int i10 = i4 & 256;
        if (i10 != 0) {
            i5 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i5 |= btsVar2.k(f530Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i3 & 805306368) == 0) {
            int i11 = i5;
            if ((i4 & 512) == 0 && btsVar2.a(z2)) {
                i8 = 536870912;
                i6 = i11 | i8;
            }
            i8 = SelfTester_JCP.IMITA;
            i6 = i11 | i8;
        } else {
            i6 = i5;
        }
        int i12 = i4 & 1024;
        int i13 = i12 != 0 ? 6 : btsVar2.k(list) ? 4 : 2;
        if (btsVar2.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                f530 f530Var7 = i9 != 0 ? c530.a : f530Var3;
                f530Var6 = i10 != 0 ? null : f530Var2;
                if ((i4 & 512) != 0) {
                    z4 = f530Var6 != null;
                    i6 &= -1879048193;
                } else {
                    z4 = z2;
                }
                if (i12 != 0) {
                    boolean z8 = z4;
                    f530Var3 = f530Var7;
                    z5 = z8;
                    list3 = EmptyList.a;
                    int i14 = i6;
                    btsVar2.u();
                    boolean z9 = z5;
                    String d = ohb1.d(kyh0.list_item_position_description, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, btsVar2);
                    int i15 = 57344 & i14;
                    k = ((i14 & 14) != 4) | (i15 != 16384) | btsVar2.k(d);
                    Q = btsVar2.Q();
                    f530 f530Var8 = f530Var6;
                    Object obj2 = did.a;
                    if (!k || Q == obj2) {
                        sb = new StringBuilder();
                        sb.append(afl0Var.b);
                        str2 = afl0Var.e;
                        if (str2 != null && i == afl0Var.f) {
                            sb.append(Extension.FIX_SPACE);
                            sb.append(str2);
                        }
                        sb.append(Extension.FIX_SPACE);
                        sb.append(d);
                        Q = sb.toString();
                        btsVar2.o0(Q);
                    }
                    Object obj3 = (String) Q;
                    oz40 n = f.n(tlsVar, btsVar2);
                    a = btsVar2.a(z7) | (i15 != 16384) | ((i14 & 896) != 256);
                    Object Q5 = btsVar2.Q();
                    if (!a || Q5 == obj2) {
                        if (z7) {
                            i7 = 4;
                            obj = null;
                        } else {
                            i7 = 4;
                            obj = new nif(new ys0(n, i, i7), str);
                        }
                        btsVar2.o0(obj);
                    } else {
                        obj = Q5;
                        i7 = 4;
                    }
                    Object obj4 = (nif) obj;
                    k2 = ((i13 & 14) != i7) | btsVar2.k(obj4);
                    Q2 = btsVar2.Q();
                    if (!k2 || Q2 == obj2) {
                        Q2 = a.m0(scc.h(obj4), list3);
                        btsVar2.o0(Q2);
                    }
                    Object obj5 = (List) Q2;
                    k3 = btsVar2.k(obj3) | ((3670016 & i14) != 1048576) | btsVar2.e(obj5);
                    Q3 = btsVar2.Q();
                    if (!k3 || Q3 == obj2) {
                        Q3 = new rx3(obj3, z, obj5, 6);
                        btsVar2.o0(Q3);
                    }
                    f530 a2 = fnq0.a(f530Var3, (tls) Q3);
                    z6 = ((i14 & 7168) != 2048) | (i15 == 16384);
                    Q4 = btsVar2.Q();
                    if (!z6 || Q4 == obj2) {
                        Q4 = new oz6(i, 3, tlsVar);
                        btsVar2.o0(Q4);
                    }
                    btsVar = btsVar2;
                    ydb1.a(q791.d(a2, z, null, null, (sls) Q4, 14), wwg.S(-952347328, true, new ota(24, ju2Var), btsVar2), wwg.S(1210835813, true, new noi(afl0Var, i), btsVar2), wwg.S(1306095374, true, new zls() { // from class: znn
                        @Override // defpackage.zls
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            ibp0 ibp0Var = (ibp0) obj6;
                            fid fidVar2 = (fid) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                            } else if (afl0.this.c) {
                                btsVar3.e0(1778603615);
                                tls tlsVar2 = tlsVar;
                                boolean k4 = btsVar3.k(tlsVar2);
                                int i16 = i;
                                boolean c = k4 | btsVar3.c(i16);
                                Object Q6 = btsVar3.Q();
                                if (c || Q6 == did.a) {
                                    Q6 = new oz6(i16, 2, tlsVar2);
                                    btsVar3.o0(Q6);
                                }
                                xrb1.c(ibp0Var, mub1.d(), q791.d(c530.a, false, null, null, (sls) Q6, 15), str, AppColor$Palette.Line, btsVar3, (intValue & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0);
                                btsVar3.t(false);
                            } else {
                                btsVar3.e0(1778877748);
                                btsVar3.t(false);
                            }
                            return zy11.a;
                        }
                    }, btsVar2), wwg.S(130491371, true, new my8(f530Var8, z9, 7), btsVar2), null, null, false, btsVar, 28080, 224);
                    f530Var4 = f530Var8;
                    z3 = z9;
                    f530Var5 = f530Var3;
                    list2 = list3;
                } else {
                    boolean z10 = z4;
                    f530Var3 = f530Var7;
                    z5 = z10;
                }
            } else {
                btsVar2.Y();
                if ((i4 & 512) != 0) {
                    i6 &= -1879048193;
                }
                f530Var6 = f530Var2;
                z5 = z2;
            }
            list3 = list;
            int i142 = i6;
            btsVar2.u();
            boolean z92 = z5;
            String d2 = ohb1.d(kyh0.list_item_position_description, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, btsVar2);
            int i152 = 57344 & i142;
            k = ((i142 & 14) != 4) | (i152 != 16384) | btsVar2.k(d2);
            Q = btsVar2.Q();
            f530 f530Var82 = f530Var6;
            Object obj22 = did.a;
            if (!k) {
            }
            sb = new StringBuilder();
            sb.append(afl0Var.b);
            str2 = afl0Var.e;
            if (str2 != null) {
                sb.append(Extension.FIX_SPACE);
                sb.append(str2);
            }
            sb.append(Extension.FIX_SPACE);
            sb.append(d2);
            Q = sb.toString();
            btsVar2.o0(Q);
            Object obj32 = (String) Q;
            oz40 n2 = f.n(tlsVar, btsVar2);
            a = btsVar2.a(z7) | (i152 != 16384) | ((i142 & 896) != 256);
            Object Q52 = btsVar2.Q();
            if (a) {
            }
            if (z7) {
            }
            btsVar2.o0(obj);
            Object obj42 = (nif) obj;
            k2 = ((i13 & 14) != i7) | btsVar2.k(obj42);
            Q2 = btsVar2.Q();
            if (!k2) {
            }
            Q2 = a.m0(scc.h(obj42), list3);
            btsVar2.o0(Q2);
            Object obj52 = (List) Q2;
            k3 = btsVar2.k(obj32) | ((3670016 & i142) != 1048576) | btsVar2.e(obj52);
            Q3 = btsVar2.Q();
            if (!k3) {
            }
            Q3 = new rx3(obj32, z, obj52, 6);
            btsVar2.o0(Q3);
            f530 a22 = fnq0.a(f530Var3, (tls) Q3);
            z6 = ((i142 & 7168) != 2048) | (i152 == 16384);
            Q4 = btsVar2.Q();
            if (!z6) {
            }
            Q4 = new oz6(i, 3, tlsVar);
            btsVar2.o0(Q4);
            btsVar = btsVar2;
            ydb1.a(q791.d(a22, z, null, null, (sls) Q4, 14), wwg.S(-952347328, true, new ota(24, ju2Var), btsVar2), wwg.S(1210835813, true, new noi(afl0Var, i), btsVar2), wwg.S(1306095374, true, new zls() { // from class: znn
                @Override // defpackage.zls
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    ibp0 ibp0Var = (ibp0) obj6;
                    fid fidVar2 = (fid) obj7;
                    int intValue = ((Integer) obj8).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                        btsVar3.Y();
                    } else if (afl0.this.c) {
                        btsVar3.e0(1778603615);
                        tls tlsVar2 = tlsVar;
                        boolean k4 = btsVar3.k(tlsVar2);
                        int i16 = i;
                        boolean c = k4 | btsVar3.c(i16);
                        Object Q6 = btsVar3.Q();
                        if (c || Q6 == did.a) {
                            Q6 = new oz6(i16, 2, tlsVar2);
                            btsVar3.o0(Q6);
                        }
                        xrb1.c(ibp0Var, mub1.d(), q791.d(c530.a, false, null, null, (sls) Q6, 15), str, AppColor$Palette.Line, btsVar3, (intValue & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(1778877748);
                        btsVar3.t(false);
                    }
                    return zy11.a;
                }
            }, btsVar2), wwg.S(130491371, true, new my8(f530Var82, z92, 7), btsVar2), null, null, false, btsVar, 28080, 224);
            f530Var4 = f530Var82;
            z3 = z92;
            f530Var5 = f530Var3;
            list2 = list3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var4 = f530Var2;
            z3 = z2;
            list2 = list;
            f530Var5 = f530Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: xnn
                @Override // defpackage.wls
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int O = vng.O(i3 | 1);
                    i4a1.b(afl0.this, ju2Var, str, tlsVar, i, i2, z, f530Var5, f530Var4, z3, list2, (fid) obj6, O, i4);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-815930846);
        int i2 = (btsVar.a(z) ? 4 : 2) | i;
        int i3 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(2119168382);
            yrl.e(null, null, btsVar, 0, 7);
            btsVar.t(false);
        } else {
            btsVar.e0(2119201056);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vxd(z, i, i3);
        }
    }

    public static final void d(dfl0 dfl0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-520907464);
        int i2 = i | (btsVar.k(dfl0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 256 : 128);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            bpl0 bpl0Var = dfl0Var.b;
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new dv9(28, tlsVar);
                btsVar.o0(Q);
            }
            z9m a = com.yandex.go.routestops.v2.ui.utils.a.a(bpl0Var, (tls) Q, btsVar);
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = ((i2 & 14) == 4) | (i4 == 256) | btsVar.e(a);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new ynn(i3, dfl0Var, a, tlsVar);
                btsVar.o0(Q2);
            }
            adb1.a(c, null, null, null, null, null, false, null, (tls) Q2, btsVar, 0, 510);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(dfl0Var, f530Var, tlsVar, i, 2);
        }
    }

    public static m2v e(n291 n291Var) {
        if (m2v.z == null) {
            synchronized (m2v.y) {
                if (m2v.z == null) {
                    lm71 lm71Var = new lm71(12, new ht81());
                    kj61 kj61Var = new kj61();
                    new p291();
                    ct1 ct1Var = ct1.b;
                    m2v m2vVar = new m2v();
                    m2vVar.a = lm71Var;
                    m2vVar.b = kj61Var;
                    m2vVar.c = n291Var;
                    m2vVar.w = ct1Var;
                    m2v.z = m2vVar;
                }
            }
        }
        m2v m2vVar2 = m2v.z;
        if (m2vVar2 != null) {
            return m2vVar2;
        }
        ny61.r("Required value was null.");
        return null;
    }

    public static final f530 f(f530 f530Var, wls wlsVar) {
        return f530Var.k(new rj0(wlsVar));
    }

    public static final Class g(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + str + '\'', e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object[] h(int i, Class cls) {
        int i2 = 0;
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            boolean z = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i2 < length) {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z) {
                            break;
                        }
                        z = true;
                        constructor = constructor2;
                    }
                    i2++;
                } else if (!z) {
                }
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null);
            throw new ClassCastException();
        } catch (KotlinReflectionNotSupportedError unused) {
            ny61.r("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            return null;
        }
    }
}
