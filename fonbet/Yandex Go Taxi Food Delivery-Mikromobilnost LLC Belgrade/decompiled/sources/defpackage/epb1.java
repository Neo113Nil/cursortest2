package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;
import ru.yandex.taxi.communications.ticket.ui.component.TicketCardType;

/* loaded from: classes11.dex */
public abstract class epb1 {
    public static final void a(String str, final t740 t740Var, String str2, Long l, boolean z, float f, final tls tlsVar, fid fidVar, int i) {
        int i2;
        int i3;
        ldc ldcVar;
        ldc ldcVar2;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(317948881);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(t740Var) : btsVar.e(t740Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(l) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.b(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            boolean z2 = t740Var instanceof o740;
            o430 o430Var = did.a;
            if (z2) {
                btsVar.e0(1612542548);
                o740 o740Var = (o740) t740Var;
                b411 b411Var = o740Var.a;
                l8v l8vVar = o740Var.b;
                String str3 = o740Var.f;
                String str4 = o740Var.c;
                wp2 wp2Var = o740Var.d;
                ldc ldcVar3 = null;
                if (wp2Var == null) {
                    btsVar.e0(1612842441);
                    btsVar.t(false);
                    i3 = i2;
                    ldcVar = null;
                } else {
                    btsVar.e0(606216504);
                    i3 = i2;
                    long n = tje.n(wp2Var, btsVar);
                    btsVar.t(false);
                    ldcVar = new ldc(n);
                }
                wp2 wp2Var2 = o740Var.e;
                if (wp2Var2 == null) {
                    btsVar.e0(1612916841);
                    btsVar.t(false);
                    ldcVar2 = ldcVar;
                    i4 = i3;
                } else {
                    btsVar.e0(606218904);
                    ldcVar2 = ldcVar;
                    i4 = i3;
                    long n2 = tje.n(wp2Var2, btsVar);
                    btsVar.t(false);
                    ldcVar3 = new ldc(n2);
                }
                boolean z3 = ((i4 & 14) == 4) | ((i4 & 3670016) == 1048576);
                Object Q = btsVar.Q();
                if (z3 || Q == o430Var) {
                    Q = new a91(str, tlsVar);
                    btsVar.o0(Q);
                }
                sls slsVar = (sls) Q;
                int i5 = i4 << 12;
                dpb1.a(b411Var, l8vVar, str3, str2, str4, ldcVar2, ldcVar3, l, z, f, slsVar, btsVar, ((i4 << 3) & 7168) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), 0);
                btsVar.t(false);
            } else {
                int i6 = i2;
                if (t740Var instanceof p740) {
                    btsVar.e0(1613252355);
                    p740 p740Var = (p740) t740Var;
                    b411 b411Var2 = p740Var.a;
                    l8v l8vVar2 = p740Var.b;
                    String str5 = p740Var.d;
                    String str6 = p740Var.c;
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new bgc(12);
                        btsVar.o0(Q2);
                    }
                    int i7 = i6 << 12;
                    dpb1.a(b411Var2, l8vVar2, str5, str2, str6, null, null, l, z, f, (sls) Q2, btsVar, ((i6 << 3) & 7168) | 1769472 | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), 6);
                    btsVar.t(false);
                } else if (t740Var instanceof q740) {
                    btsVar.e0(1613797800);
                    q740 q740Var = (q740) t740Var;
                    int i8 = i6 & 3670016;
                    int i9 = i6 & 112;
                    boolean z4 = (i8 == 1048576) | (i9 == 32 || ((i6 & 64) != 0 && btsVar.e(t740Var)));
                    Object Q3 = btsVar.Q();
                    if (z4 || Q3 == o430Var) {
                        final int i10 = 0;
                        Q3 = new sls() { // from class: v640
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i11 = i10;
                                zy11 zy11Var = zy11.a;
                                t740 t740Var2 = t740Var;
                                tls tlsVar2 = tlsVar;
                                switch (i11) {
                                    case 0:
                                        tlsVar2.invoke(((q740) t740Var2).d);
                                        break;
                                    default:
                                        tlsVar2.invoke(((q740) t740Var2).e);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q3);
                    }
                    sls slsVar2 = (sls) Q3;
                    boolean z5 = (i8 == 1048576) | (i9 == 32 || ((i6 & 64) != 0 && btsVar.e(t740Var)));
                    Object Q4 = btsVar.Q();
                    if (z5 || Q4 == o430Var) {
                        final int i11 = 1;
                        Q4 = new sls() { // from class: v640
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i112 = i11;
                                zy11 zy11Var = zy11.a;
                                t740 t740Var2 = t740Var;
                                tls tlsVar2 = tlsVar;
                                switch (i112) {
                                    case 0:
                                        tlsVar2.invoke(((q740) t740Var2).d);
                                        break;
                                    default:
                                        tlsVar2.invoke(((q740) t740Var2).e);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q4);
                    }
                    nl91.a(q740Var, slsVar2, (sls) Q4, btsVar, 8 | ((i6 >> 3) & 14));
                    btsVar.t(false);
                } else if (t740Var instanceof r740) {
                    btsVar.e0(1614054201);
                    fpb1.b((r740) t740Var, btsVar, 8 | ((i6 >> 3) & 14));
                    btsVar.t(false);
                } else {
                    if (!(t740Var instanceof s740)) {
                        throw unr0.y(606206626, btsVar, false);
                    }
                    btsVar.e0(1614129438);
                    hpb1.b((s740) t740Var, btsVar, 8 | ((i6 >> 3) & 14));
                    btsVar.t(false);
                }
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new w640(str, t740Var, str2, l, z, f, tlsVar, i);
        }
    }

    public static final void b(final f530 f530Var, final long j, TicketCardType ticketCardType, TicketMode ticketMode, a aVar, fid fidVar, final int i) {
        TicketCardType ticketCardType2;
        TicketMode ticketMode2;
        final a aVar2;
        byk0 e;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1201661164);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.d(j) ? 32 : 16) | (btsVar.c(ticketMode.ordinal()) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ((nx2) btsVar.m(uy2.c)).getClass();
            byk0 c = cyk0.c(24.0f);
            ticketMode2 = ticketMode;
            if (ticketMode2 != TicketMode.TICKET) {
                int i3 = c2z0.a[ticketCardType.ordinal()];
                if (i3 == 1) {
                    e = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return;
                    }
                    e = cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3);
                }
                c = e;
            }
            TicketCardType ticketCardType3 = TicketCardType.TopCard;
            f530 f530Var2 = c530.a;
            ticketCardType2 = ticketCardType;
            if (ticketCardType2 == ticketCardType3) {
                btsVar.e0(-549801900);
            } else {
                btsVar.e0(-549801063);
                f530Var2 = hbb1.c(f530Var2, igr0.a(dbb1.b(btsVar), new up2(rzo.d(1291845632)), 14), false, 24.0f, null, 10);
            }
            btsVar.t(false);
            f530 b = m4m0.b(ljs0.c(f530Var, 1.0f).k(f530Var2), j, c);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            aVar2 = aVar;
            nnm.p(6, aVar2, btsVar, true);
        } else {
            ticketCardType2 = ticketCardType;
            ticketMode2 = ticketMode;
            aVar2 = aVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final TicketCardType ticketCardType4 = ticketCardType2;
            final TicketMode ticketMode3 = ticketMode2;
            v.d = new wls(j, ticketCardType4, ticketMode3, aVar2, i) { // from class: b2z0
                public final /* synthetic */ long b;
                public final /* synthetic */ TicketCardType c;
                public final /* synthetic */ TicketMode w;
                public final /* synthetic */ a x;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(24961);
                    epb1.b(f530.this, this.b, this.c, this.w, this.x, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method c(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (!jl40.l(str, method.getName())) {
                if (!cvu0.x(method.getName(), str + LicenseUtility.SEPARATOR, z)) {
                    continue;
                    i++;
                    z = false;
                }
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
            if (parameterTypes.length == clsArr2.length) {
                ArrayList arrayList = new ArrayList(parameterTypes.length);
                int length2 = parameterTypes.length;
                boolean z2 = z;
                ?? r12 = z2;
                for (?? r11 = z2; r11 < length2; r11++) {
                    Class<?> cls = parameterTypes[r11];
                    int i2 = r12 + 1;
                    Class<?> cls2 = clsArr2[r12];
                    arrayList.add(Boolean.valueOf(qoi0.a(cls).equals(qoi0.a(cls2)) || cls.isAssignableFrom(cls2)));
                    r12 = i2;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            continue;
            i++;
            z = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(b64.j(str, " not found"));
    }

    public static void d(String str, String str2, fid fidVar, Object... objArr) {
        Method method;
        Method method2;
        Class<?> cls = Class.forName(str);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = copyOf.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = copyOf[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int ceil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                d6w n = y6i0.n(0, ceil);
                ArrayList arrayList2 = new ArrayList(tcc.n(n, 10));
                c6w it = n.iterator();
                while (it.c) {
                    it.nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                c2r0 c2r0Var = new c2r0(3, 1);
                ArrayList arrayList3 = c2r0Var.b;
                c2r0Var.b(clsArr);
                c2r0Var.a(fid.class);
                c2r0Var.b(clsArr2);
                method = c(declaredMethods, str2, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                method = null;
            }
        } catch (ReflectiveOperationException unused2) {
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            int length3 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length3) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods2[i2];
                if (jl40.l(method2.getName(), str2)) {
                    break;
                }
                if (cvu0.x(method2.getName(), str2 + LicenseUtility.SEPARATOR, false)) {
                    break;
                } else {
                    i2++;
                }
            }
            method = method2;
        }
        if (method != null) {
            method.setAccessible(true);
            if (Modifier.isStatic(method.getModifiers())) {
                e(method, null, fidVar, Arrays.copyOf(objArr, objArr.length));
                return;
            } else {
                e(method, cls.getConstructor(null).newInstance(null), fidVar, Arrays.copyOf(objArr, objArr.length));
                return;
            }
        }
        throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        if (r8.equals("int") == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Method method, Object obj, fid fidVar, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (jl40.l(parameterTypes[length], fid.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int ceil = (i != 0 ? (int) Math.ceil(((obj != null ? 1 : 0) + i) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != ceil ? (int) Math.ceil(i / 31.0d) : 0) + ceil != length2) {
            ny61.r("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    obj2 = fidVar;
                } else {
                    if (i3 > i4 || i4 >= ceil) {
                        if (ceil > i4 || i4 >= length2) {
                            ny61.r("Unexpected index");
                            return;
                        }
                        obj2 = 2097151;
                    }
                    obj2 = 0;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                String name = method.getParameterTypes()[i4].getName();
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            obj2 = Double.valueOf(0.0d);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 104431:
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            obj2 = (byte) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            obj2 = (char) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3327612:
                        if (name.equals(Constants.LONG)) {
                            obj2 = 0L;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            obj2 = Boolean.FALSE;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            obj2 = Float.valueOf(0.0f);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            obj2 = (short) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                obj2 = objArr[i4];
            }
            objArr2[i4] = obj2;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }
}
