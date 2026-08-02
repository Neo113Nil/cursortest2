package defpackage;

import androidx.compose.material.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class cy80 implements z910 {
    public final tls a;
    public final boolean b;
    public final float c;
    public final j690 d;

    public cy80(tls tlsVar, boolean z, float f, j690 j690Var) {
        this.a = tlsVar;
        this.b = z;
        this.c = f;
        this.d = j690Var;
    }

    public final int a(yuw yuwVar, List list, int i, wls wlsVar) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (jl40.l(a.d((x910) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        x910 x910Var = (x910) obj2;
        if (x910Var != null) {
            int k0 = x910Var.k0(Integer.MAX_VALUE);
            if (i == Integer.MAX_VALUE) {
                i2 = i;
            } else {
                i2 = i - k0;
                if (i2 < 0) {
                    i2 = 0;
                }
            }
            i3 = ((Number) wlsVar.invoke(x910Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (jl40.l(a.d((x910) obj3), "Trailing")) {
                break;
            }
            i6++;
        }
        x910 x910Var2 = (x910) obj3;
        if (x910Var2 != null) {
            int k02 = x910Var2.k0(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE && (i2 = i2 - k02) < 0) {
                i2 = 0;
            }
            i4 = ((Number) wlsVar.invoke(x910Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (jl40.l(a.d((x910) obj4), "Label")) {
                break;
            }
            i7++;
        }
        Object obj5 = (x910) obj4;
        int intValue = obj5 != null ? ((Number) wlsVar.invoke(obj5, Integer.valueOf(cjb1.e(i2, i, this.c)))).intValue() : 0;
        int size4 = list2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj6 = list.get(i8);
            if (jl40.l(a.d((x910) obj6), "TextField")) {
                int intValue2 = ((Number) wlsVar.invoke(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (jl40.l(a.d((x910) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i9++;
                }
                Object obj8 = (x910) obj;
                return yx80.b(i3, i4, intValue2, intValue, obj8 != null ? ((Number) wlsVar.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, this.c, p8e.b(0, 0, 0, 0, 15), yuwVar.getDensity(), this.d);
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    @Override // defpackage.z910
    public final aa10 b(final k kVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        j690 j690Var;
        int i;
        long j2;
        List list2;
        String str;
        Object obj4;
        final cy80 cy80Var = this;
        j690 j690Var2 = cy80Var.d;
        int f0 = kVar.f0(j690Var2.a());
        long b = n8e.b(0, j, 0, 0, 0, 10);
        List list3 = list;
        int size = list3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (jl40.l(pj91.g((x910) obj), "Leading")) {
                break;
            }
            i2++;
        }
        x910 x910Var = (x910) obj;
        o l0 = x910Var != null ? x910Var.l0(b) : null;
        int i3 = l0 != null ? l0.a : 0;
        int size2 = list3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (jl40.l(pj91.g((x910) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        x910 x910Var2 = (x910) obj2;
        char c = 2;
        o l02 = x910Var2 != null ? x910Var2.l0(p8e.j(-i3, 0, b, 2)) : null;
        int i5 = i3 + (l02 != null ? l02.a : 0);
        int f02 = kVar.f0(j690Var2.c(kVar.getLayoutDirection())) + kVar.f0(j690Var2.b(kVar.getLayoutDirection()));
        int i6 = -i5;
        int i7 = -f0;
        long i8 = p8e.i(cjb1.e(i6 - f02, -f02, cy80Var.c), i7, b);
        int size3 = list3.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            char c2 = c;
            if (jl40.l(pj91.g((x910) obj3), "Label")) {
                break;
            }
            i9++;
            c = c2;
        }
        x910 x910Var3 = (x910) obj3;
        o l03 = x910Var3 != null ? x910Var3.l0(i8) : null;
        if (l03 != null) {
            float f = l03.a;
            float f2 = l03.b;
            long floatToRawIntBits = Float.floatToRawIntBits(f);
            int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
            j690Var = j690Var2;
            i = i7;
            j2 = (floatToRawIntBits2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (floatToRawIntBits << 32);
        } else {
            j690Var = j690Var2;
            i = i7;
            j2 = 0;
        }
        cy80Var.a.invoke(new cjs0(j2));
        long b2 = n8e.b(0, p8e.i(i6, i - Math.max((l03 != null ? l03.b : 0) / 2, kVar.f0(j690Var.d())), j), 0, 0, 0, 11);
        int size4 = list3.size();
        int i10 = 0;
        while (true) {
            String str2 = "Collection contains no element matching the predicate.";
            if (i10 >= size4) {
                rty.b("Collection contains no element matching the predicate.");
                ny61.A();
                return null;
            }
            x910 x910Var4 = (x910) list.get(i10);
            if (jl40.l(pj91.g(x910Var4), "TextField")) {
                final o l04 = x910Var4.l0(b2);
                long b3 = n8e.b(0, b2, 0, 0, 0, 14);
                List list4 = list;
                int size5 = list4.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size5) {
                        list2 = list4;
                        str = str2;
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i11);
                    list2 = list4;
                    str = str2;
                    if (jl40.l(pj91.g((x910) obj4), "Hint")) {
                        break;
                    }
                    i11++;
                    list4 = list2;
                    str2 = str;
                }
                x910 x910Var5 = (x910) obj4;
                final o l05 = x910Var5 != null ? x910Var5.l0(b3) : null;
                final o oVar = l02;
                final int c3 = yx80.c(l0 != null ? l0.a : 0, l02 != null ? l02.a : 0, l04.a, l03 != null ? l03.a : 0, l05 != null ? l05.a : 0, cy80Var.c, j, kVar.getDensity(), cy80Var.d);
                final int b4 = yx80.b(l0 != null ? l0.b : 0, oVar != null ? oVar.b : 0, l04.b, l03 != null ? l03.b : 0, l05 != null ? l05.b : 0, cy80Var.c, j, kVar.getDensity(), cy80Var.d);
                int size6 = list2.size();
                int i12 = 0;
                while (i12 < size6) {
                    x910 x910Var6 = (x910) list.get(i12);
                    if (jl40.l(pj91.g(x910Var6), "border")) {
                        final o l06 = x910Var6.l0(p8e.a(c3 != Integer.MAX_VALUE ? c3 : 0, c3, b4 != Integer.MAX_VALUE ? b4 : 0, b4));
                        final o oVar2 = l0;
                        final o oVar3 = l03;
                        return kVar.w(c3, b4, b.f(), new tls() { // from class: ay80
                            @Override // defpackage.tls
                            public final Object invoke(Object obj5) {
                                o.a aVar = (o.a) obj5;
                                cy80 cy80Var2 = cy80Var;
                                float f3 = cy80Var2.c;
                                boolean z = cy80Var2.b;
                                k kVar2 = kVar;
                                float density = kVar2.getDensity();
                                LayoutDirection layoutDirection = kVar2.getLayoutDirection();
                                j690 j690Var3 = cy80Var2.d;
                                int i13 = yx80.a;
                                int b5 = m810.b(j690Var3.d() * density);
                                int b6 = m810.b(an91.f(j690Var3, layoutDirection) * density);
                                float f4 = 12.0f * density;
                                int i14 = b4;
                                o oVar4 = oVar2;
                                if (oVar4 != null) {
                                    o.a.o(aVar, oVar4, 0, xvz.a(i14 - oVar4.b, 2.0f, 1.0f));
                                }
                                o oVar5 = oVar;
                                if (oVar5 != null) {
                                    o.a.o(aVar, oVar5, c3 - oVar5.a, xvz.a(i14 - oVar5.b, 2.0f, 1.0f));
                                }
                                o oVar6 = oVar3;
                                if (oVar6 != null) {
                                    o.a.o(aVar, oVar6, m810.b(oVar4 == null ? 0.0f : (1.0f - f3) * (oVar4.a - f4)) + b6, cjb1.e(z ? xvz.a(i14 - oVar6.b, 2.0f, 1.0f) : b5, -(oVar6.b / 2), f3));
                                }
                                o.a.o(aVar, l04, oVar4 != null ? oVar4.a : 0, Math.max(z ? xvz.a(i14 - r0.b, 2.0f, 1.0f) : b5, (oVar6 != null ? oVar6.b : 0) / 2));
                                o oVar7 = l05;
                                if (oVar7 != null) {
                                    if (z) {
                                        b5 = xvz.a(i14 - oVar7.b, 2.0f, 1.0f);
                                    }
                                    o.a.o(aVar, oVar7, oVar4 != null ? oVar4.a : 0, Math.max(b5, (oVar6 != null ? oVar6.b : 0) / 2));
                                }
                                o.a.m(aVar, l06, 0L);
                                return zy11.a;
                            }
                        });
                    }
                    i12++;
                    l0 = l0;
                    l03 = l03;
                    cy80Var = this;
                    oVar = oVar;
                }
                rty.b(str);
                ny61.A();
                return null;
            }
            i10++;
            l0 = l0;
            l03 = l03;
            cy80Var = this;
            b2 = b2;
        }
    }

    public final int c(yuw yuwVar, List list, int i, wls wlsVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (jl40.l(a.d((x910) obj5), "TextField")) {
                int intValue = ((Number) wlsVar.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (jl40.l(a.d((x910) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                x910 x910Var = (x910) obj2;
                int intValue2 = x910Var != null ? ((Number) wlsVar.invoke(x910Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (jl40.l(a.d((x910) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                x910 x910Var2 = (x910) obj3;
                int intValue3 = x910Var2 != null ? ((Number) wlsVar.invoke(x910Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (jl40.l(a.d((x910) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                x910 x910Var3 = (x910) obj4;
                int intValue4 = x910Var3 != null ? ((Number) wlsVar.invoke(x910Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (jl40.l(a.d((x910) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                x910 x910Var4 = (x910) obj;
                return yx80.c(intValue4, intValue3, intValue, intValue2, x910Var4 != null ? ((Number) wlsVar.invoke(x910Var4, Integer.valueOf(i))).intValue() : 0, this.c, p8e.b(0, 0, 0, 0, 15), yuwVar.getDensity(), this.d);
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        return c(yuwVar, list, i, new vu30(24));
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        return c(yuwVar, list, i, new vu30(27));
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        return a(yuwVar, list, i, new vu30(28));
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        return a(yuwVar, list, i, new vu30(23));
    }
}
