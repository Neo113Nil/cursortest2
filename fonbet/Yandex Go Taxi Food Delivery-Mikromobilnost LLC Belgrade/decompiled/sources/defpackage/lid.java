package defpackage;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public abstract class lid {
    public static final s370 a = new s370("provider");
    public static final s370 b = new s370("provider");
    public static final s370 c = new s370("compositionLocalMap");
    public static final s370 d = new s370("providers");
    public static final s370 e = new s370("reference");

    public static final void a(String str) {
        throw new ComposeRuntimeError(oyr.p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ComposeRuntimeError(oyr.p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    public static final jb30 c(bud budVar, kb30 kb30Var, ows0 ows0Var, o13 o13Var) {
        kb30 kb30Var2;
        o430 o430Var;
        sus0 sus0Var;
        ?? r6;
        yss yssVar;
        long[] jArr;
        yss yssVar2;
        o430 o430Var2;
        sus0 sus0Var2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        long[] jArr3;
        int i4;
        long j2;
        long[] jArr4;
        int i5;
        int i6;
        o430 o430Var3 = did.a;
        sus0 sus0Var3 = new sus0();
        if (ows0Var.e != null) {
            sus0Var3.h();
        }
        if (ows0Var.f != null) {
            sus0Var3.D = new wx40((Object) null);
        }
        int i7 = ows0Var.t;
        if (o13Var != null && ows0Var.F(i7) > 0) {
            int i8 = ows0Var.v;
            while (i8 > 0 && !ows0Var.y(i8)) {
                i8 = ows0Var.G(i8, ows0Var.b);
            }
            if (i8 >= 0 && ows0Var.y(i8)) {
                Object E = ows0Var.E(i8);
                int i9 = i8 + 1;
                int u = ows0Var.u(i8) + i8;
                int i10 = 0;
                while (i9 < u) {
                    int u2 = ows0Var.u(i9) + i9;
                    if (u2 > i7) {
                        break;
                    }
                    i10 += ows0Var.y(i9) ? 1 : ows0Var.F(i9);
                    i9 = u2;
                }
                int F = ows0Var.y(i7) ? 1 : ows0Var.F(i7);
                o13Var.n(E);
                o13Var.a(i10, F);
                o13Var.p();
            }
        }
        yss a2 = kb30Var.a();
        if (a2.a()) {
            if (budVar.G.e > 0) {
                r6 = new ArrayList();
                hz40 hz40Var = budVar.G;
                long[] jArr5 = hz40Var.a;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr5[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j3 & 255) < 128) {
                                    int i15 = i12;
                                    int i16 = (i11 << 3) + i14;
                                    yssVar2 = a2;
                                    Object obj = hz40Var.b[i16];
                                    Object obj2 = hz40Var.c[i16];
                                    jArr2 = jArr5;
                                    if (obj2 instanceof iz40) {
                                        iz40 iz40Var = (iz40) obj2;
                                        Object[] objArr = iz40Var.b;
                                        long[] jArr6 = iz40Var.a;
                                        j = j3;
                                        int length2 = jArr6.length - 2;
                                        o430Var2 = o430Var3;
                                        sus0Var2 = sus0Var3;
                                        if (length2 >= 0) {
                                            int i17 = 0;
                                            while (true) {
                                                long j4 = jArr6[i17];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                    int i19 = 0;
                                                    while (i19 < i18) {
                                                        if ((j4 & 255) < 128) {
                                                            i4 = i19;
                                                            int i20 = (i17 << 3) + i4;
                                                            j2 = j4;
                                                            Object obj3 = objArr[i20];
                                                            aii0 aii0Var = (aii0) obj;
                                                            jArr4 = jArr6;
                                                            yss yssVar3 = aii0Var.c;
                                                            if (yssVar3 != null) {
                                                                yss e2 = uh6.e(yssVar2);
                                                                i6 = i14;
                                                                yss e3 = uh6.e(yssVar3);
                                                                int c2 = ows0Var.c(e2);
                                                                i5 = length;
                                                                int a3 = uus0.a(c2, ows0Var.b) + c2;
                                                                int i21 = e3.a;
                                                                if (c2 <= i21 && i21 < a3) {
                                                                    r6.add(new Pair(aii0Var, obj3));
                                                                    iz40Var.m(i20);
                                                                }
                                                                j4 = j2 >> i15;
                                                                i19 = i4 + 1;
                                                                jArr6 = jArr4;
                                                                length = i5;
                                                                i14 = i6;
                                                            }
                                                        } else {
                                                            i4 = i19;
                                                            j2 = j4;
                                                            jArr4 = jArr6;
                                                        }
                                                        i5 = length;
                                                        i6 = i14;
                                                        j4 = j2 >> i15;
                                                        i19 = i4 + 1;
                                                        jArr6 = jArr4;
                                                        length = i5;
                                                        i14 = i6;
                                                    }
                                                    jArr3 = jArr6;
                                                    i = length;
                                                    i2 = i14;
                                                    if (i18 != i15) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    i = length;
                                                    i2 = i14;
                                                }
                                                if (i17 == length2) {
                                                    break;
                                                }
                                                i17++;
                                                i15 = 8;
                                                jArr6 = jArr3;
                                                length = i;
                                                i14 = i2;
                                            }
                                        } else {
                                            i = length;
                                            i2 = i14;
                                        }
                                        z2 = iz40Var.g();
                                    } else {
                                        o430Var2 = o430Var3;
                                        sus0Var2 = sus0Var3;
                                        i = length;
                                        j = j3;
                                        i2 = i14;
                                        aii0 aii0Var2 = (aii0) obj;
                                        yss yssVar4 = aii0Var2.c;
                                        if (yssVar4 != null) {
                                            yss e4 = uh6.e(yssVar2);
                                            yss e5 = uh6.e(yssVar4);
                                            int c3 = ows0Var.c(e4);
                                            int a4 = uus0.a(c3, ows0Var.b) + c3;
                                            int i22 = e5.a;
                                            if (c3 <= i22 && i22 < a4) {
                                                r6.add(new Pair(aii0Var2, obj2));
                                                z = true;
                                                z2 = z;
                                            }
                                        }
                                        z = false;
                                        z2 = z;
                                    }
                                    if (z2) {
                                        hz40Var.n(i16);
                                    }
                                    i3 = 8;
                                } else {
                                    yssVar2 = a2;
                                    o430Var2 = o430Var3;
                                    sus0Var2 = sus0Var3;
                                    jArr2 = jArr5;
                                    i = length;
                                    j = j3;
                                    i2 = i14;
                                    i3 = i12;
                                }
                                j3 = j >> i3;
                                i14 = i2 + 1;
                                i12 = i3;
                                a2 = yssVar2;
                                jArr5 = jArr2;
                                o430Var3 = o430Var2;
                                sus0Var3 = sus0Var2;
                                length = i;
                            }
                            yssVar = a2;
                            o430Var = o430Var3;
                            sus0Var = sus0Var3;
                            jArr = jArr5;
                            int i23 = length;
                            if (i13 != i12) {
                                break;
                            }
                            length = i23;
                        } else {
                            yssVar = a2;
                            o430Var = o430Var3;
                            sus0Var = sus0Var3;
                            jArr = jArr5;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        a2 = yssVar;
                        jArr5 = jArr;
                        o430Var3 = o430Var;
                        sus0Var3 = sus0Var;
                    }
                } else {
                    o430Var = o430Var3;
                    sus0Var = sus0Var3;
                }
            } else {
                o430Var = o430Var3;
                sus0Var = sus0Var3;
                r6 = EmptyList.a;
            }
            kb30Var2 = kb30Var;
            kb30Var2.h(a.m0((Iterable) r6, kb30Var.d()));
        } else {
            kb30Var2 = kb30Var;
            o430Var = o430Var3;
            sus0Var = sus0Var3;
        }
        ows0 k = sus0Var.k();
        try {
            k.d();
            o430 o430Var4 = o430Var;
            k.S(kb30Var2.c(), o430Var4, false, 126665345);
            ows0.z(k);
            k.U(kb30Var2.f());
            List D = ows0Var.D(uh6.e(kb30Var2.a()), k);
            k.N();
            k.j();
            k.k();
            k.e(true);
            sus0 sus0Var4 = sus0Var;
            jb30 jb30Var = new jb30(sus0Var4);
            List list = D;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i24 = 0; i24 < size; i24++) {
                    yss yssVar5 = (yss) D.get(i24);
                    if (sus0Var4.l(yssVar5)) {
                        int g = sus0Var4.g(yssVar5);
                        int d2 = uus0.d(g, sus0Var4.a);
                        int i25 = g + 1;
                        if (((i25 < sus0Var4.b ? sus0Var4.a[(i25 * 5) + 4] : sus0Var4.c.length) - d2 > 0 ? sus0Var4.c[d2] : o430Var4) instanceof aii0) {
                            kid kidVar = new kid(budVar, kb30Var2);
                            k = sus0Var4.k();
                            try {
                                qke.c(k, D, kidVar);
                                k.e(true);
                                return jb30Var;
                            } finally {
                            }
                        }
                    }
                }
            }
            return jb30Var;
        } finally {
        }
    }
}
