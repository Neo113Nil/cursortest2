package defpackage;

import androidx.compose.material3.internal.h;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class by80 implements z910 {
    public final tls a;
    public final boolean b;
    public final nny0 c;
    public final bny0 d;
    public final j690 e;
    public final float f;

    public by80(tls tlsVar, boolean z, nny0 nny0Var, bny0 bny0Var, j690 j690Var, float f) {
        this.a = tlsVar;
        this.b = z;
        this.c = nny0Var;
        this.d = bny0Var;
        this.e = j690Var;
        this.f = f;
    }

    public static final int j(int i, by80 by80Var, int i2, int i3, o oVar, o oVar2) {
        if (by80Var.b) {
            i3 = xvz.a(i2 - oVar2.b, 2.0f, 1.0f);
        }
        int i4 = i + i3;
        nny0 nny0Var = by80Var.c;
        return Math.max(i4, (oVar != null ? oVar.b : 0) / 2);
    }

    public final int a(yuw yuwVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int[] iArr = {i7, i3, i4, z ? 0 : cjb1.e(i6, 0, f)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        j690 j690Var = this.e;
        float w0 = yuwVar.w0(j690Var.d());
        if (!z) {
            w0 = cjb1.d(w0, Math.max(w0, i6 / 2.0f), f);
        }
        float w02 = w0 + i5 + yuwVar.w0(j690Var.a());
        if (!z) {
            i6 = 0;
        }
        return p8e.f(Math.max(i, Math.max(i2, m810.b(w02))) + i6 + i8, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.ui.layout.o] */
    /* JADX WARN: Type inference failed for: r0v43 */
    @Override // defpackage.z910
    public final aa10 b(final k kVar, List list, long j) {
        Object obj;
        List list2;
        Object obj2;
        o oVar;
        int i;
        o oVar2;
        Object obj3;
        o oVar3;
        o oVar4;
        Object obj4;
        int i2;
        o oVar5;
        Object obj5;
        Object obj6;
        Object obj7;
        int i3;
        int i4;
        int i5;
        int i6;
        o oVar6;
        int i7;
        o oVar7;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        int i9;
        k kVar2;
        o oVar8;
        o oVar9;
        int i10;
        x910 x910Var;
        o oVar10;
        o oVar11;
        by80 by80Var;
        o oVar12;
        int i11;
        o oVar13;
        o oVar14;
        int i12;
        int i13;
        int i14;
        o oVar15;
        int i15;
        int i16;
        by80 by80Var2;
        o oVar16;
        o oVar17;
        Ref$ObjectRef ref$ObjectRef2;
        int i17;
        o oVar18;
        boolean z;
        k kVar3;
        float f;
        List list3 = list;
        float a = this.d.a();
        j690 j690Var = this.e;
        int f0 = kVar.f0(j690Var.a());
        long b = n8e.b(0, j, 0, 0, 0, 10);
        List list4 = list3;
        int size = list4.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i18);
            if (jl40.l(pj91.g((x910) obj), "Leading")) {
                break;
            }
            i18++;
        }
        x910 x910Var2 = (x910) obj;
        o l0 = x910Var2 != null ? x910Var2.l0(b) : null;
        int i19 = l0 != null ? l0.a : 0;
        int max = Math.max(0, l0 != null ? l0.b : 0);
        int size2 = list4.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size2) {
                list2 = list4;
                obj2 = null;
                break;
            }
            obj2 = list3.get(i20);
            list2 = list4;
            if (jl40.l(pj91.g((x910) obj2), "Trailing")) {
                break;
            }
            i20++;
            list4 = list2;
        }
        x910 x910Var3 = (x910) obj2;
        if (x910Var3 != null) {
            oVar = l0;
            i = i19;
            oVar2 = x910Var3.l0(p8e.j(-i19, 0, b, 2));
        } else {
            oVar = l0;
            i = i19;
            oVar2 = null;
        }
        int i21 = i + (oVar2 != null ? oVar2.a : 0);
        int max2 = Math.max(max, oVar2 != null ? oVar2.b : 0);
        int size3 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list3.get(i22);
            int i23 = size3;
            if (jl40.l(pj91.g((x910) obj3), "Prefix")) {
                break;
            }
            i22++;
            size3 = i23;
        }
        x910 x910Var4 = (x910) obj3;
        if (x910Var4 != null) {
            oVar3 = oVar2;
            oVar4 = x910Var4.l0(p8e.j(-i21, 0, b, 2));
        } else {
            oVar3 = oVar2;
            oVar4 = null;
        }
        int i24 = i21 + (oVar4 != null ? oVar4.a : 0);
        int max3 = Math.max(max2, oVar4 != null ? oVar4.b : 0);
        int size4 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list3.get(i25);
            int i26 = size4;
            if (jl40.l(pj91.g((x910) obj4), "Suffix")) {
                break;
            }
            i25++;
            size4 = i26;
        }
        x910 x910Var5 = (x910) obj4;
        if (x910Var5 != null) {
            i2 = i24;
            oVar5 = x910Var5.l0(p8e.j(-i24, 0, b, 2));
        } else {
            i2 = i24;
            oVar5 = null;
        }
        int i27 = i2 + (oVar5 != null ? oVar5.a : 0);
        int max4 = Math.max(max3, oVar5 != null ? oVar5.b : 0);
        int size5 = list2.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list3.get(i28);
            int i29 = size5;
            int i30 = i28;
            if (jl40.l(pj91.g((x910) obj5), "Label")) {
                break;
            }
            i28 = i30 + 1;
            size5 = i29;
        }
        x910 x910Var6 = (x910) obj5;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        tls tlsVar = this.a;
        long j2 = 0;
        int f02 = kVar.f0(j690Var.c(kVar.getLayoutDirection())) + kVar.f0(j690Var.b(kVar.getLayoutDirection()));
        o oVar19 = oVar4;
        ?? l02 = x910Var6 != null ? x910Var6.l0(p8e.i(-cjb1.e(i27 + f02, f02, a), -f0, b)) : 0;
        ref$ObjectRef3.element = l02;
        if (l02 != 0) {
            j2 = (Float.floatToRawIntBits(l02.a) << 32) | (Float.floatToRawIntBits(l02.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        tlsVar.invoke(new cjs0(j2));
        int size6 = list2.size();
        int i31 = 0;
        while (true) {
            if (i31 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list3.get(i31);
            if (jl40.l(pj91.g((x910) obj6), "Supporting")) {
                break;
            }
            i31++;
        }
        x910 x910Var7 = (x910) obj6;
        int V = x910Var7 != null ? x910Var7.V(n8e.k(j)) : 0;
        o oVar20 = (o) ref$ObjectRef3.element;
        int max5 = Math.max((oVar20 != null ? oVar20.b : 0) / 2, kVar.f0(j690Var.d()));
        long j3 = j;
        long i32 = p8e.i(-i27, (((-f0) - max5) + 0) - V, j3);
        x910 x910Var8 = x910Var7;
        long b2 = n8e.b(0, i32, 0, 0, 0, 11);
        int size7 = list2.size();
        int i33 = 0;
        while (i33 < size7) {
            x910 x910Var9 = x910Var8;
            x910 x910Var10 = (x910) list3.get(i33);
            int i34 = f0;
            int i35 = max5;
            if (jl40.l(pj91.g(x910Var10), "TextField")) {
                o l03 = x910Var10.l0(b2);
                long b3 = n8e.b(0, b2, 0, 0, 0, 14);
                List list5 = list3;
                int size8 = list5.size();
                int i36 = 0;
                while (true) {
                    if (i36 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list3.get(i36);
                    int i37 = size8;
                    if (jl40.l(pj91.g((x910) obj7), "Hint")) {
                        break;
                    }
                    i36++;
                    size8 = i37;
                }
                x910 x910Var11 = (x910) obj7;
                o l04 = x910Var11 != null ? x910Var11.l0(b3) : null;
                int max6 = Math.max(max4, Math.max(l03.b, l04 != null ? l04.b : 0) + i35 + i34);
                int i38 = oVar != null ? oVar.a : 0;
                o oVar21 = oVar3;
                if (oVar3 != null) {
                    i3 = i38;
                    i4 = oVar21.a;
                } else {
                    i3 = i38;
                    i4 = 0;
                }
                if (oVar19 != null) {
                    int i39 = i3;
                    i6 = oVar19.a;
                    i5 = i39;
                } else {
                    i5 = i3;
                    i6 = 0;
                }
                int i40 = i5;
                if (oVar5 != null) {
                    i7 = oVar5.a;
                    oVar6 = oVar21;
                } else {
                    oVar6 = oVar21;
                    i7 = 0;
                }
                o oVar22 = oVar5;
                int i41 = l03.a;
                o oVar23 = oVar6;
                o oVar24 = (o) ref$ObjectRef3.element;
                if (oVar24 != null) {
                    oVar7 = oVar19;
                    i8 = oVar24.a;
                } else {
                    oVar7 = oVar19;
                    i8 = 0;
                }
                if (l04 != null) {
                    ref$ObjectRef = ref$ObjectRef3;
                    i9 = l04.a;
                    oVar8 = l04;
                    oVar9 = l03;
                    i10 = i40;
                    x910Var = x910Var9;
                    oVar10 = oVar22;
                    oVar11 = oVar7;
                    by80Var = this;
                    oVar12 = oVar;
                    i11 = max6;
                    oVar13 = oVar23;
                    kVar2 = kVar;
                } else {
                    ref$ObjectRef = ref$ObjectRef3;
                    i9 = 0;
                    kVar2 = kVar;
                    oVar8 = l04;
                    oVar9 = l03;
                    i10 = i40;
                    x910Var = x910Var9;
                    oVar10 = oVar22;
                    oVar11 = oVar7;
                    by80Var = this;
                    oVar12 = oVar;
                    i11 = max6;
                    oVar13 = oVar23;
                }
                final int c = by80Var.c(kVar2, i10, i4, i6, i7, i41, i8, i9, j3, a);
                o l05 = x910Var != null ? x910Var.l0(n8e.b(0, p8e.j(0, -i11, b, 1), c, 0, 0, 9)) : null;
                int i42 = l05 != null ? l05.b : 0;
                final o oVar25 = oVar12;
                int i43 = oVar12 != null ? oVar25.b : 0;
                o oVar26 = oVar13;
                int i44 = oVar13 != null ? oVar26.b : 0;
                o oVar27 = oVar11;
                int i45 = oVar27 != null ? oVar27.b : 0;
                o oVar28 = oVar10;
                int i46 = oVar28 != null ? oVar28.b : 0;
                o oVar29 = oVar9;
                int i47 = oVar29.b;
                Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                o oVar30 = (o) ref$ObjectRef4.element;
                int i48 = oVar30 != null ? oVar30.b : 0;
                o oVar31 = oVar8;
                if (oVar31 != null) {
                    oVar14 = oVar28;
                    i12 = i46;
                    i13 = i47;
                    i14 = oVar31.b;
                } else {
                    oVar14 = oVar28;
                    i12 = i46;
                    i13 = i47;
                    i14 = 0;
                }
                if (l05 != null) {
                    oVar15 = oVar27;
                    i15 = i45;
                    i16 = l05.b;
                    oVar16 = oVar26;
                    oVar17 = oVar29;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    i17 = i48;
                    oVar18 = oVar31;
                    z = false;
                    kVar3 = kVar;
                    f = a;
                    by80Var2 = this;
                } else {
                    oVar15 = oVar27;
                    i15 = i45;
                    i16 = 0;
                    by80Var2 = this;
                    oVar16 = oVar26;
                    oVar17 = oVar29;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    i17 = i48;
                    oVar18 = oVar31;
                    z = false;
                    kVar3 = kVar;
                    f = a;
                }
                final int a2 = by80Var2.a(kVar3, i43, i44, i15, i12, i13, i17, i14, i16, j, z, f);
                final float f2 = f;
                int i49 = (a2 - i42) + 0;
                int size9 = list5.size();
                int i50 = 0;
                while (i50 < size9) {
                    x910 x910Var12 = (x910) list.get(i50);
                    if (jl40.l(pj91.g(x910Var12), "Container")) {
                        final o l06 = x910Var12.l0(p8e.a(c != Integer.MAX_VALUE ? c : 0, c, i49 != Integer.MAX_VALUE ? i49 : 0, i49));
                        final o oVar32 = l05;
                        final boolean z2 = z;
                        final o oVar33 = oVar16;
                        final o oVar34 = oVar15;
                        final o oVar35 = oVar14;
                        final Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                        final o oVar36 = oVar17;
                        final o oVar37 = oVar18;
                        return kVar.w(c, a2, b.f(), new tls() { // from class: zx80
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.tls
                            public final Object invoke(Object obj8) {
                                float f3;
                                float f4;
                                int i51;
                                by80 by80Var3;
                                int i52;
                                int i53;
                                int i54;
                                by80 by80Var4;
                                float f5;
                                nny0 nny0Var;
                                int i55;
                                float f6;
                                float f7;
                                float f8;
                                o.a aVar = (o.a) obj8;
                                o oVar38 = (o) ref$ObjectRef5.element;
                                k kVar4 = kVar;
                                float density = kVar4.getDensity();
                                LayoutDirection layoutDirection = kVar4.getLayoutDirection();
                                by80 by80Var5 = by80.this;
                                float w0 = kVar4.w0(by80Var5.f);
                                nny0 nny0Var2 = by80Var5.c;
                                j690 j690Var2 = by80Var5.e;
                                boolean z3 = z2;
                                int i56 = (!z3 || oVar38 == null) ? 0 : oVar38.b;
                                aVar.g(l06, 0, i56, 0.0f);
                                o oVar39 = oVar32;
                                int i57 = (a2 - (oVar39 != null ? oVar39.b : 0)) - ((!z3 || oVar38 == null) ? 0 : oVar38.b);
                                int b4 = m810.b(j690Var2.d() * density);
                                o oVar40 = oVar25;
                                if (oVar40 != null) {
                                    f4 = 2.0f;
                                    f3 = w0;
                                    o.a.o(aVar, oVar40, 0, Math.round(((i57 - oVar40.b) / 2.0f) * 1.0f) + i56);
                                } else {
                                    f3 = w0;
                                    f4 = 2.0f;
                                }
                                int i58 = c;
                                o oVar41 = oVar33;
                                if (oVar38 != null) {
                                    if (z3) {
                                        f5 = density;
                                        by80Var3 = by80Var5;
                                        nny0Var = nny0Var2;
                                        i55 = 0;
                                    } else {
                                        f5 = density;
                                        if (by80Var5.b) {
                                            by80Var3 = by80Var5;
                                            nny0Var = nny0Var2;
                                            i55 = xvz.a(i57 - oVar38.b, f4, 1.0f);
                                        } else {
                                            by80Var3 = by80Var5;
                                            nny0Var = nny0Var2;
                                            i55 = b4;
                                        }
                                    }
                                    int i59 = z3 ? 0 : -(oVar38.b / 2);
                                    float f9 = f2;
                                    int e = cjb1.e(i55, i59, f9);
                                    if (z3) {
                                        aVar.g(oVar38, h.e(nny0Var).a(oVar38.a, i58, layoutDirection), e, 0.0f);
                                        i51 = i58;
                                    } else {
                                        float f10 = an91.f(j690Var2, layoutDirection) * f5;
                                        float e2 = an91.e(j690Var2, layoutDirection) * f5;
                                        if (oVar40 == null) {
                                            f6 = 0.0f;
                                            f7 = f10;
                                        } else {
                                            f6 = 0.0f;
                                            float f11 = oVar40.a;
                                            float f12 = f10 - f3;
                                            if (f12 < 0.0f) {
                                                f12 = 0.0f;
                                            }
                                            f7 = f11 + f12;
                                        }
                                        if (oVar41 == null) {
                                            i51 = i58;
                                            f8 = e2;
                                        } else {
                                            i51 = i58;
                                            float f13 = oVar41.a;
                                            float f14 = e2 - f3;
                                            if (f14 < f6) {
                                                f14 = f6;
                                            }
                                            f8 = f13 + f14;
                                        }
                                        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                                        aVar.g(oVar38, m810.b(cjb1.d(h.d(nny0Var).a(oVar38.a, i51 - m810.b(f7 + f8), layoutDirection) + (layoutDirection == layoutDirection2 ? f7 : f8), h.e(nny0Var).a(oVar38.a, i51 - m810.b(f10 + e2), layoutDirection) + (layoutDirection == layoutDirection2 ? f10 : e2), f9)), e, f6);
                                    }
                                } else {
                                    i51 = i58;
                                    by80Var3 = by80Var5;
                                }
                                o oVar42 = oVar34;
                                if (oVar42 != null) {
                                    i52 = i56;
                                    i53 = b4;
                                    i54 = i57;
                                    by80Var4 = by80Var3;
                                    o.a.o(aVar, oVar42, oVar40 != null ? oVar40.a : 0, by80.j(i52, by80Var4, i54, i53, oVar38, oVar42));
                                } else {
                                    i52 = i56;
                                    i53 = b4;
                                    i54 = i57;
                                    by80Var4 = by80Var3;
                                }
                                int i60 = (oVar40 != null ? oVar40.a : 0) + (oVar42 != null ? oVar42.a : 0);
                                o oVar43 = oVar36;
                                o.a.o(aVar, oVar43, i60, by80.j(i52, by80Var4, i54, i53, oVar38, oVar43));
                                o oVar44 = oVar37;
                                if (oVar44 != null) {
                                    o.a.o(aVar, oVar44, i60, by80.j(i52, by80Var4, i54, i53, oVar38, oVar44));
                                }
                                o oVar45 = oVar35;
                                if (oVar45 != null) {
                                    o.a.o(aVar, oVar45, (i51 - (oVar41 != null ? oVar41.a : 0)) - oVar45.a, by80.j(i52, by80Var4, i54, i53, oVar38, oVar45));
                                }
                                if (oVar41 != null) {
                                    o.a.o(aVar, oVar41, i51 - oVar41.a, Math.round(((i54 - oVar41.b) / 2.0f) * 1.0f) + i52);
                                }
                                if (oVar39 != null) {
                                    o.a.o(aVar, oVar39, 0, i52 + i54);
                                }
                                return zy11.a;
                            }
                        });
                    }
                    i50++;
                    a2 = a2;
                    z = z;
                }
                rty.b("Collection contains no element matching the predicate.");
                ny61.A();
                return null;
            }
            i33++;
            j3 = j;
            x910Var8 = x910Var9;
            f0 = i34;
            oVar5 = oVar5;
            ref$ObjectRef3 = ref$ObjectRef3;
            list3 = list3;
            max5 = i35;
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return null;
    }

    public final int c(yuw yuwVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, cjb1.e(i6, 0, f))) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        j690 j690Var = this.e;
        return p8e.g(Math.max(max, m810.b((i6 + yuwVar.w0(j690Var.c(layoutDirection) + j690Var.b(layoutDirection))) * f)), j);
    }

    public final int d(yuw yuwVar, List list, int i, wls wlsVar) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        int i7;
        Object obj6;
        Object obj7;
        by80 by80Var = this;
        float a = by80Var.d.a();
        List list2 = list;
        int size = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (jl40.l(ycb1.c((x910) obj), "Leading")) {
                break;
            }
            i8++;
        }
        x910 x910Var = (x910) obj;
        if (x910Var != null) {
            i2 = ycb1.d(i, x910Var.k0(Integer.MAX_VALUE));
            i3 = ((Number) wlsVar.invoke(x910Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (jl40.l(ycb1.c((x910) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        x910 x910Var2 = (x910) obj2;
        if (x910Var2 != null) {
            i2 = ycb1.d(i2, x910Var2.k0(Integer.MAX_VALUE));
            i4 = ((Number) wlsVar.invoke(x910Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (jl40.l(ycb1.c((x910) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (x910) obj3;
        int intValue = obj8 != null ? ((Number) wlsVar.invoke(obj8, Integer.valueOf(cjb1.e(i2, i, a)))).intValue() : 0;
        int size4 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (jl40.l(ycb1.c((x910) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        x910 x910Var3 = (x910) obj4;
        if (x910Var3 != null) {
            i5 = ((Number) wlsVar.invoke(x910Var3, Integer.valueOf(i2))).intValue();
            i2 = ycb1.d(i2, x910Var3.k0(Integer.MAX_VALUE));
        } else {
            i5 = 0;
        }
        int size5 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (jl40.l(ycb1.c((x910) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        x910 x910Var4 = (x910) obj5;
        if (x910Var4 != null) {
            i6 = ((Number) wlsVar.invoke(x910Var4, Integer.valueOf(i2))).intValue();
            i2 = ycb1.d(i2, x910Var4.k0(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size6 = list2.size();
        int i13 = 0;
        while (i13 < size6) {
            Object obj9 = list.get(i13);
            if (jl40.l(ycb1.c((x910) obj9), "TextField")) {
                int intValue2 = ((Number) wlsVar.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        i7 = intValue2;
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    i7 = intValue2;
                    if (jl40.l(ycb1.c((x910) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                    intValue2 = i7;
                }
                Object obj10 = (x910) obj6;
                int intValue3 = obj10 != null ? ((Number) wlsVar.invoke(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (jl40.l(ycb1.c((x910) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                Object obj11 = (x910) obj7;
                return by80Var.a(yuwVar, i3, i4, i5, i6, i7, intValue, intValue3, obj11 != null ? ((Number) wlsVar.invoke(obj11, Integer.valueOf(i))).intValue() : 0, p8e.b(0, 0, 0, 0, 15), false, a);
            }
            i13++;
            i5 = i5;
            by80Var = this;
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        return h(yuwVar, list, i, new vu30(22));
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        return h(yuwVar, list, i, new vu30(26));
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        return d(yuwVar, list, i, new vu30(25));
    }

    public final int h(yuw yuwVar, List list, int i, wls wlsVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (jl40.l(ycb1.c((x910) obj7), "TextField")) {
                int intValue = ((Number) wlsVar.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (jl40.l(ycb1.c((x910) obj2), "Label")) {
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
                    if (jl40.l(ycb1.c((x910) obj3), "Trailing")) {
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
                    if (jl40.l(ycb1.c((x910) obj4), "Leading")) {
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
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (jl40.l(ycb1.c((x910) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                x910 x910Var4 = (x910) obj5;
                int intValue5 = x910Var4 != null ? ((Number) wlsVar.invoke(x910Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (jl40.l(ycb1.c((x910) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                x910 x910Var5 = (x910) obj6;
                int intValue6 = x910Var5 != null ? ((Number) wlsVar.invoke(x910Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (jl40.l(ycb1.c((x910) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                x910 x910Var6 = (x910) obj;
                return c(yuwVar, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, x910Var6 != null ? ((Number) wlsVar.invoke(x910Var6, Integer.valueOf(i))).intValue() : 0, p8e.b(0, 0, 0, 0, 15), this.d.a());
            }
        }
        rty.b("Collection contains no element matching the predicate.");
        ny61.A();
        return 0;
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        return d(yuwVar, list, i, new vu30(21));
    }
}
