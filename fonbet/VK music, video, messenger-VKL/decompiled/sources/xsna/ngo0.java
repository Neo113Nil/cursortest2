package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dt1;
import xsna.fgo0;
import xsna.kgo0;
import xsna.tra0;

/* compiled from: TextField.kt */
/* loaded from: classes11.dex */
public final class ngo0 implements cp10 {
    public final boolean a;
    public final kgo0.b b;
    public final fgo0.b c;
    public final s890 d;
    public final float e;

    public ngo0(boolean z, kgo0.b bVar, fgo0.b bVar2, s890 s890Var, float f) {
        this.a = z;
        this.b = bVar;
        this.c = bVar2;
        this.d = s890Var;
        this.e = f;
    }

    public static int h(List list, int i, wzs wzsVar) {
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
            if (epx.f(x1o0.j((zox) obj7), "TextField")) {
                int intValue = ((Number) wzsVar.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (epx.f(x1o0.j((zox) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                zox zoxVar = (zox) obj2;
                int intValue2 = zoxVar != null ? ((Number) wzsVar.invoke(zoxVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (epx.f(x1o0.j((zox) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                zox zoxVar2 = (zox) obj3;
                int intValue3 = zoxVar2 != null ? ((Number) wzsVar.invoke(zoxVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (epx.f(x1o0.j((zox) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                zox zoxVar3 = (zox) obj4;
                int intValue4 = zoxVar3 != null ? ((Number) wzsVar.invoke(zoxVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (epx.f(x1o0.j((zox) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                zox zoxVar4 = (zox) obj5;
                int intValue5 = zoxVar4 != null ? ((Number) wzsVar.invoke(zoxVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (epx.f(x1o0.j((zox) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                zox zoxVar5 = (zox) obj6;
                int intValue6 = zoxVar5 != null ? ((Number) wzsVar.invoke(zoxVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (epx.f(x1o0.j((zox) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                zox zoxVar6 = (zox) obj;
                int i9 = intValue4 + intValue5;
                return s6j.g(Math.max(intValue + i9, Math.max((zoxVar6 != null ? ((Number) wzsVar.invoke(zoxVar6, Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, s6j.b(0, 0, 0, 0, 15));
            }
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public static final int i(ngo0 ngo0Var, int i, int i2, tra0 tra0Var) {
        if (!ngo0Var.a) {
            return i2;
        }
        dt1.a.getClass();
        return dt1.a.l.a(tra0Var.c, i);
    }

    public final int a(apx apxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        s890 s890Var = this.d;
        int r0 = apxVar.r0(s890Var.b() + s890Var.d()) + ((i2 <= 0 || z) ? 0 : Math.max(apxVar.r0(this.e * 2), q6x.A(0, i2, sb30.a.a(f)))) + jw5.u(i, i7, i5, i6, z ? 0 : q6x.A(i2, 0, f));
        if (!z) {
            i2 = 0;
        }
        return s6j.f(Math.max(i3, Math.max(i4, r0)) + i2 + i8, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cp10
    public final dp10 b(final ep10 ep10Var, List<? extends zo10> list, long j) {
        zo10 zo10Var;
        zo10 zo10Var2;
        zo10 zo10Var3;
        List<? extends zo10> list2;
        tra0 tra0Var;
        tra0 tra0Var2;
        zo10 zo10Var4;
        zo10 zo10Var5;
        int i;
        zo10 zo10Var6;
        int i2;
        zo10 zo10Var7;
        Ref$ObjectRef ref$ObjectRef;
        int i3;
        tra0 tra0Var3;
        int i4;
        tra0 tra0Var4;
        int i5;
        tra0 tra0Var5;
        int i6;
        ngo0 ngo0Var;
        Ref$ObjectRef ref$ObjectRef2;
        tra0 tra0Var6;
        int i7;
        String str;
        float f;
        tra0 tra0Var7;
        int i8;
        int i9;
        final tra0 tra0Var8;
        tra0 tra0Var9;
        tra0 tra0Var10;
        int i10;
        int i11;
        int i12;
        boolean z;
        float a = this.c.a();
        s890 s890Var = this.d;
        int r0 = ep10Var.r0(s890Var.d());
        int r02 = ep10Var.r0(s890Var.b());
        long b = o6j.b(0, j, 0, 0, 0, 10);
        List<? extends zo10> list3 = list;
        int size = list3.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                zo10Var = null;
                break;
            }
            zo10Var = list.get(i13);
            if (epx.f(vua0.o(zo10Var), "Leading")) {
                break;
            }
            i13++;
        }
        zo10 zo10Var8 = zo10Var;
        tra0 N = zo10Var8 != null ? zo10Var8.N(b) : null;
        int i14 = N != null ? N.b : 0;
        int max = Math.max(0, N != null ? N.c : 0);
        int size2 = list3.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                zo10Var2 = null;
                break;
            }
            zo10Var2 = list.get(i15);
            if (epx.f(vua0.o(zo10Var2), "Trailing")) {
                break;
            }
            i15++;
        }
        zo10 zo10Var9 = zo10Var2;
        tra0 N2 = zo10Var9 != null ? zo10Var9.N(s6j.j(-i14, 0, 2, b)) : null;
        int i16 = i14 + (N2 != null ? N2.b : 0);
        int max2 = Math.max(max, N2 != null ? N2.c : 0);
        int size3 = list3.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                zo10Var3 = null;
                break;
            }
            zo10Var3 = list.get(i17);
            if (epx.f(vua0.o(zo10Var3), "Prefix")) {
                break;
            }
            i17++;
        }
        zo10 zo10Var10 = zo10Var3;
        if (zo10Var10 != null) {
            list2 = list3;
            tra0Var = N;
            tra0Var2 = zo10Var10.N(s6j.j(-i16, 0, 2, b));
        } else {
            list2 = list3;
            tra0Var = N;
            tra0Var2 = null;
        }
        int i18 = i16 + (tra0Var2 != null ? tra0Var2.b : 0);
        int max3 = Math.max(max2, tra0Var2 != null ? tra0Var2.c : 0);
        int size4 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size4) {
                zo10Var4 = null;
                break;
            }
            zo10Var4 = list.get(i19);
            if (epx.f(vua0.o(zo10Var4), "Suffix")) {
                break;
            }
            i19++;
        }
        zo10 zo10Var11 = zo10Var4;
        tra0 N3 = zo10Var11 != null ? zo10Var11.N(s6j.j(-i18, 0, 2, b)) : null;
        int i20 = i18 + (N3 != null ? N3.b : 0);
        int max4 = Math.max(max3, N3 != null ? N3.c : 0);
        int size5 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                zo10Var5 = null;
                break;
            }
            zo10Var5 = list.get(i21);
            int i22 = size5;
            if (epx.f(vua0.o(zo10Var5), "Label")) {
                break;
            }
            i21++;
            size5 = i22;
        }
        zo10 zo10Var12 = zo10Var5;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        List<? extends zo10> list4 = list2;
        ref$ObjectRef3.element = zo10Var12 != null ? zo10Var12.N(s6j.i(-i20, -r02, b)) : 0;
        int size6 = list4.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                i = r02;
                zo10Var6 = null;
                break;
            }
            zo10Var6 = list.get(i23);
            i = r02;
            if (epx.f(vua0.o(zo10Var6), "Supporting")) {
                break;
            }
            i23++;
            r02 = i;
        }
        zo10 zo10Var13 = zo10Var6;
        int j0 = zo10Var13 != null ? zo10Var13.j0(o6j.k(j)) : 0;
        tra0 tra0Var11 = (tra0) ref$ObjectRef3.element;
        int i24 = (tra0Var11 != null ? tra0Var11.c : 0) + 0 + r0;
        float f2 = a;
        long i25 = s6j.i(-i20, ((-i24) - i) - j0, o6j.b(0, j, 0, 0, 0, 11));
        int size7 = list4.size();
        int i26 = 0;
        while (i26 < size7) {
            zo10 zo10Var14 = list.get(i26);
            int i27 = size7;
            int i28 = i26;
            if (epx.f(vua0.o(zo10Var14), "TextField")) {
                tra0 N4 = zo10Var14.N(i25);
                long b2 = o6j.b(0, i25, 0, 0, 0, 14);
                List<? extends zo10> list5 = list;
                int size8 = list5.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        i2 = i24;
                        zo10Var7 = null;
                        break;
                    }
                    zo10Var7 = list.get(i29);
                    int i30 = size8;
                    i2 = i24;
                    if (epx.f(vua0.o(zo10Var7), "Hint")) {
                        break;
                    }
                    i29++;
                    i24 = i2;
                    size8 = i30;
                }
                zo10 zo10Var15 = zo10Var7;
                tra0 N5 = zo10Var15 != null ? zo10Var15.N(b2) : null;
                int max5 = Math.max(max4, Math.max(N4.c, N5 != null ? N5.c : 0) + i2 + i);
                tra0 tra0Var12 = tra0Var;
                int i31 = tra0Var != null ? tra0Var12.b : 0;
                int i32 = N2 != null ? N2.b : 0;
                int i33 = tra0Var2 != null ? tra0Var2.b : 0;
                int i34 = i32;
                int i35 = N3 != null ? N3.b : 0;
                int i36 = N4.b;
                tra0 tra0Var13 = (tra0) ref$ObjectRef3.element;
                int i37 = i33 + i35;
                int g = s6j.g(Math.max(i36 + i37, Math.max((N5 != null ? N5.b : 0) + i37, tra0Var13 != null ? tra0Var13.b : 0)) + i31 + i34, j);
                tra0 N6 = zo10Var13 != null ? zo10Var13.N(o6j.b(0, s6j.j(0, -max5, 1, b), g, 0, 0, 9)) : null;
                int i38 = N6 != null ? N6.c : 0;
                int i39 = N4.c;
                tra0 tra0Var14 = (tra0) ref$ObjectRef3.element;
                int i40 = tra0Var14 != null ? tra0Var14.c : 0;
                int i41 = tra0Var12 != null ? tra0Var12.c : 0;
                if (N2 != null) {
                    ref$ObjectRef = ref$ObjectRef3;
                    i3 = N2.c;
                } else {
                    ref$ObjectRef = ref$ObjectRef3;
                    i3 = 0;
                }
                if (tra0Var2 != null) {
                    tra0Var3 = N4;
                    i4 = tra0Var2.c;
                } else {
                    tra0Var3 = N4;
                    i4 = 0;
                }
                int i42 = N3 != null ? N3.c : 0;
                final tra0 tra0Var15 = N2;
                if (N5 != null) {
                    tra0Var4 = N5;
                    i5 = N5.c;
                } else {
                    tra0Var4 = N5;
                    i5 = 0;
                }
                if (N6 != null) {
                    tra0Var5 = tra0Var12;
                    i6 = N6.c;
                    ref$ObjectRef2 = ref$ObjectRef;
                    tra0Var6 = tra0Var3;
                    i7 = r0;
                    str = "Collection contains no element matching the predicate.";
                    f = f2;
                    tra0Var7 = tra0Var4;
                    i8 = g;
                    i9 = 0;
                    tra0Var8 = N6;
                    tra0Var9 = tra0Var2;
                    tra0Var10 = N3;
                    i10 = i40;
                    i11 = i41;
                    i12 = i42;
                    z = false;
                    ngo0Var = this;
                } else {
                    tra0Var5 = tra0Var12;
                    i6 = 0;
                    ngo0Var = this;
                    ref$ObjectRef2 = ref$ObjectRef;
                    tra0Var6 = tra0Var3;
                    i7 = r0;
                    str = "Collection contains no element matching the predicate.";
                    f = f2;
                    tra0Var7 = tra0Var4;
                    i8 = g;
                    i9 = 0;
                    tra0Var8 = N6;
                    tra0Var9 = tra0Var2;
                    tra0Var10 = N3;
                    i10 = i40;
                    i11 = i41;
                    i12 = i42;
                    z = false;
                }
                final int a2 = ngo0Var.a(ep10Var, i39, i10, i11, i3, i4, i12, i5, i6, j, z, f);
                final int i43 = (a2 - i38) + 0;
                int size9 = list5.size();
                int i44 = i9;
                while (i44 < size9) {
                    zo10 zo10Var16 = list.get(i44);
                    if (epx.f(vua0.o(zo10Var16), "Container")) {
                        final tra0 N7 = zo10Var16.N(s6j.a(i8 != Integer.MAX_VALUE ? i8 : i9, i8, i43 != Integer.MAX_VALUE ? i43 : i9, i43));
                        final int i45 = i8;
                        final boolean z2 = z;
                        final tra0 tra0Var16 = tra0Var10;
                        final Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                        final tra0 tra0Var17 = tra0Var6;
                        final tra0 tra0Var18 = tra0Var5;
                        final tra0 tra0Var19 = tra0Var7;
                        final int i46 = i7;
                        final float f3 = f;
                        final tra0 tra0Var20 = tra0Var9;
                        return ep10Var.Q(i45, a2, jgp.b, new izs() { // from class: xsna.mgo0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
                            /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
                            /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
                            /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
                            /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
                            /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
                            @Override // xsna.izs
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj) {
                                int i47;
                                int i48;
                                tra0 tra0Var21;
                                int r03;
                                int i49;
                                int i50;
                                int i51;
                                tra0.a aVar = (tra0.a) obj;
                                Ref$ObjectRef ref$ObjectRef5 = Ref$ObjectRef.this;
                                T t = ref$ObjectRef5.element;
                                ngo0 ngo0Var2 = this;
                                ep10 ep10Var2 = ep10Var;
                                int i52 = i45;
                                int i53 = a2;
                                tra0 tra0Var22 = tra0Var17;
                                tra0 tra0Var23 = tra0Var19;
                                tra0 tra0Var24 = tra0Var18;
                                tra0 tra0Var25 = tra0Var15;
                                tra0 tra0Var26 = tra0Var20;
                                tra0 tra0Var27 = tra0Var16;
                                tra0 tra0Var28 = N7;
                                tra0 tra0Var29 = tra0Var8;
                                if (t != 0) {
                                    boolean z3 = z2;
                                    int i54 = i46;
                                    if (z3) {
                                        i47 = i54;
                                        i48 = i53;
                                        tra0Var21 = tra0Var27;
                                        r03 = 0;
                                    } else {
                                        i47 = i54;
                                        if (ngo0Var2.a) {
                                            dt1.a.getClass();
                                            i48 = i53;
                                            tra0Var21 = tra0Var27;
                                            r03 = dt1.a.l.a(((tra0) ref$ObjectRef5.element).c, i43);
                                        } else {
                                            i48 = i53;
                                            tra0Var21 = tra0Var27;
                                            r03 = ep10Var2.r0(ngo0Var2.e) + i47;
                                        }
                                    }
                                    int i55 = z3 ? 0 : i47;
                                    tra0 tra0Var30 = (tra0) ref$ObjectRef5.element;
                                    int i56 = i47 + (z3 ? 0 : tra0Var30.c);
                                    LayoutDirection layoutDirection = ep10Var2.getLayoutDirection();
                                    kgo0.b bVar = ngo0Var2.b;
                                    int i57 = z3 ? tra0Var30.c : 0;
                                    aVar.q(tra0Var28, 0, i57, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    int i58 = (i48 - (tra0Var29 != null ? tra0Var29.c : 0)) - (z3 ? tra0Var30.c : 0);
                                    if (tra0Var24 != null) {
                                        dt1.a.getClass();
                                        i49 = i57;
                                        tra0.a.x(aVar, tra0Var24, 0, dt1.a.l.a(tra0Var24.c, i58) + i49);
                                    } else {
                                        i49 = i57;
                                    }
                                    float f4 = f3;
                                    int A = q6x.A(r03, i55, f4);
                                    if (z3) {
                                        aVar.q(tra0Var30, fgo0.d(bVar).a(tra0Var30.b, i52, layoutDirection), A, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        i51 = i52;
                                    } else if (layoutDirection == LayoutDirection.Ltr) {
                                        if (tra0Var24 != null) {
                                            i50 = tra0Var24.b;
                                            i51 = i52;
                                            aVar.q(tra0Var30, q6x.A(fgo0.c(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, fgo0.d(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, f4), A, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        i50 = 0;
                                        i51 = i52;
                                        aVar.q(tra0Var30, q6x.A(fgo0.c(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, fgo0.d(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, f4), A, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    } else {
                                        if (tra0Var25 != null) {
                                            i50 = tra0Var25.b;
                                            i51 = i52;
                                            aVar.q(tra0Var30, q6x.A(fgo0.c(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, fgo0.d(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, f4), A, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        i50 = 0;
                                        i51 = i52;
                                        aVar.q(tra0Var30, q6x.A(fgo0.c(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, fgo0.d(bVar).a(tra0Var30.b, (i51 - (tra0Var24 == null ? tra0Var24.b : 0)) - (tra0Var25 == null ? tra0Var25.b : 0), layoutDirection) + i50, f4), A, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                    if (tra0Var26 != null) {
                                        tra0.a.x(aVar, tra0Var26, tra0Var24 != null ? tra0Var24.b : 0, i49 + i56);
                                    }
                                    int i59 = (tra0Var24 != null ? tra0Var24.b : 0) + (tra0Var26 != null ? tra0Var26.b : 0);
                                    int i60 = i49 + i56;
                                    tra0.a.x(aVar, tra0Var22, i59, i60);
                                    if (tra0Var23 != null) {
                                        tra0.a.x(aVar, tra0Var23, i59, i60);
                                    }
                                    if (tra0Var21 != null) {
                                        tra0 tra0Var31 = tra0Var21;
                                        tra0.a.x(aVar, tra0Var31, (i51 - (tra0Var25 != null ? tra0Var25.b : 0)) - tra0Var31.b, i60);
                                    }
                                    if (tra0Var25 != null) {
                                        int i61 = i51 - tra0Var25.b;
                                        dt1.a.getClass();
                                        tra0.a.x(aVar, tra0Var25, i61, dt1.a.l.a(tra0Var25.c, i58) + i49);
                                    }
                                    if (tra0Var29 != null) {
                                        tra0.a.x(aVar, tra0Var29, 0, i49 + i58);
                                    }
                                } else {
                                    float density = ep10Var2.getDensity();
                                    tra0.a.w(aVar, tra0Var28, 0L);
                                    int i62 = i53 - (tra0Var29 != null ? tra0Var29.c : 0);
                                    int b3 = an10.b(ngo0Var2.d.d() * density);
                                    if (tra0Var24 != null) {
                                        dt1.a.getClass();
                                        tra0.a.x(aVar, tra0Var24, 0, dt1.a.l.a(tra0Var24.c, i62));
                                    }
                                    if (tra0Var26 != null) {
                                        tra0.a.x(aVar, tra0Var26, tra0Var24 != null ? tra0Var24.b : 0, ngo0.i(ngo0Var2, i62, b3, tra0Var26));
                                    }
                                    int i63 = (tra0Var24 != null ? tra0Var24.b : 0) + (tra0Var26 != null ? tra0Var26.b : 0);
                                    tra0.a.x(aVar, tra0Var22, i63, ngo0.i(ngo0Var2, i62, b3, tra0Var22));
                                    if (tra0Var23 != null) {
                                        tra0.a.x(aVar, tra0Var23, i63, ngo0.i(ngo0Var2, i62, b3, tra0Var23));
                                    }
                                    if (tra0Var27 != null) {
                                        tra0.a.x(aVar, tra0Var27, (i52 - (tra0Var25 != null ? tra0Var25.b : 0)) - tra0Var27.b, ngo0.i(ngo0Var2, i62, b3, tra0Var27));
                                    }
                                    if (tra0Var25 != null) {
                                        int i64 = i52 - tra0Var25.b;
                                        dt1.a.getClass();
                                        tra0.a.x(aVar, tra0Var25, i64, dt1.a.l.a(tra0Var25.c, i62));
                                    }
                                    if (tra0Var29 != null) {
                                        tra0.a.x(aVar, tra0Var29, 0, i62);
                                    }
                                }
                                return s3q0.a;
                            }
                        });
                    }
                    i44++;
                    i43 = i43;
                    tra0Var9 = tra0Var9;
                }
                hgz.c(str);
                throw new KotlinNothingValueException();
            }
            i26 = i28 + 1;
            N3 = N3;
            size7 = i27;
            f2 = f2;
            i25 = i25;
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // xsna.cp10
    public final int c(apx apxVar, List<? extends zox> list, int i) {
        return d(apxVar, list, i, new nq2((byte) 0, 11));
    }

    public final int d(apx apxVar, List<? extends zox> list, int i, wzs<? super zox, ? super Integer, Integer> wzsVar) {
        zox zoxVar;
        int i2;
        int i3;
        int i4;
        zox zoxVar2;
        int i5;
        zox zoxVar3;
        zox zoxVar4;
        int i6;
        zox zoxVar5;
        int i7;
        zox zoxVar6;
        zox zoxVar7;
        List<? extends zox> list2 = list;
        int size = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                zoxVar = null;
                break;
            }
            zoxVar = list.get(i8);
            if (epx.f(x1o0.j(zoxVar), "Leading")) {
                break;
            }
            i8++;
        }
        zox zoxVar8 = zoxVar;
        if (zoxVar8 != null) {
            i2 = i;
            i3 = x1o0.s(i2, zoxVar8.l0(Integer.MAX_VALUE));
            i4 = wzsVar.invoke(zoxVar8, Integer.valueOf(i2)).intValue();
        } else {
            i2 = i;
            i3 = i2;
            i4 = 0;
        }
        int size2 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                zoxVar2 = null;
                break;
            }
            zoxVar2 = list.get(i9);
            if (epx.f(x1o0.j(zoxVar2), "Trailing")) {
                break;
            }
            i9++;
        }
        zox zoxVar9 = zoxVar2;
        if (zoxVar9 != null) {
            i3 = x1o0.s(i3, zoxVar9.l0(Integer.MAX_VALUE));
            i5 = wzsVar.invoke(zoxVar9, Integer.valueOf(i2)).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                zoxVar3 = null;
                break;
            }
            zoxVar3 = list.get(i10);
            if (epx.f(x1o0.j(zoxVar3), "Label")) {
                break;
            }
            i10++;
        }
        zox zoxVar10 = zoxVar3;
        int intValue = zoxVar10 != null ? wzsVar.invoke(zoxVar10, Integer.valueOf(i3)).intValue() : 0;
        int size4 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                zoxVar4 = null;
                break;
            }
            zoxVar4 = list.get(i11);
            if (epx.f(x1o0.j(zoxVar4), "Prefix")) {
                break;
            }
            i11++;
        }
        zox zoxVar11 = zoxVar4;
        if (zoxVar11 != null) {
            int intValue2 = wzsVar.invoke(zoxVar11, Integer.valueOf(i3)).intValue();
            i3 = x1o0.s(i3, zoxVar11.l0(Integer.MAX_VALUE));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                zoxVar5 = null;
                break;
            }
            zoxVar5 = list.get(i12);
            if (epx.f(x1o0.j(zoxVar5), "Suffix")) {
                break;
            }
            i12++;
        }
        zox zoxVar12 = zoxVar5;
        if (zoxVar12 != null) {
            int intValue3 = wzsVar.invoke(zoxVar12, Integer.valueOf(i3)).intValue();
            i3 = x1o0.s(i3, zoxVar12.l0(Integer.MAX_VALUE));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list2.size();
        for (int i13 = 0; i13 < size6; i13++) {
            zox zoxVar13 = list.get(i13);
            if (epx.f(x1o0.j(zoxVar13), "TextField")) {
                int intValue4 = wzsVar.invoke(zoxVar13, Integer.valueOf(i3)).intValue();
                int size7 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        zoxVar6 = null;
                        break;
                    }
                    zoxVar6 = list.get(i14);
                    if (epx.f(x1o0.j(zoxVar6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                zox zoxVar14 = zoxVar6;
                int intValue5 = zoxVar14 != null ? wzsVar.invoke(zoxVar14, Integer.valueOf(i3)).intValue() : 0;
                int size8 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        zoxVar7 = null;
                        break;
                    }
                    zox zoxVar15 = list.get(i15);
                    if (epx.f(x1o0.j(zoxVar15), "Supporting")) {
                        zoxVar7 = zoxVar15;
                        break;
                    }
                    i15++;
                }
                zox zoxVar16 = zoxVar7;
                return a(apxVar, intValue4, intValue, i4, i5, i6, i7, intValue5, zoxVar16 != null ? wzsVar.invoke(zoxVar16, Integer.valueOf(i2)).intValue() : 0, s6j.b(0, 0, 0, 0, 15), false, this.c.a());
            }
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
        return h(list, i, new bv4((byte) 0, 8));
    }

    @Override // xsna.cp10
    public final int f(apx apxVar, List<? extends zox> list, int i) {
        return d(apxVar, list, i, new mq2(11));
    }

    @Override // xsna.cp10
    public final int g(apx apxVar, List<? extends zox> list, int i) {
        return h(list, i, new f6g((byte) 0, 8));
    }
}
