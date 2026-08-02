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

/* compiled from: OutlinedTextField.kt */
/* loaded from: classes11.dex */
public final class j190 implements cp10 {
    public final izs<mxj0, s3q0> a;
    public final boolean b;
    public final kgo0.b c;
    public final fgo0.b d;
    public final s890 e;
    public final float f;

    public j190() {
        throw null;
    }

    public j190(izs izsVar, boolean z, kgo0.b bVar, fgo0.b bVar2, s890 s890Var, float f) {
        this.a = izsVar;
        this.b = z;
        this.c = bVar;
        this.d = bVar2;
        this.e = s890Var;
        this.f = f;
    }

    public static final int j(int i, j190 j190Var, int i2, int i3, tra0 tra0Var, tra0 tra0Var2) {
        if (j190Var.b) {
            dt1.a.getClass();
            i3 = dt1.a.l.a(tra0Var2.c, i2);
        }
        int i4 = i + i3;
        kgo0.b bVar = j190Var.c;
        return Math.max(i4, (tra0Var != null ? tra0Var.c : 0) / 2);
    }

    public final int a(apx apxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int u = jw5.u(i5, i7, i3, i4, z ? 0 : q6x.A(i6, 0, f));
        s890 s890Var = this.e;
        float I0 = apxVar.I0(s890Var.d());
        if (!z) {
            I0 = q6x.z(I0, Math.max(I0, i6 / 2.0f), f);
        }
        float I02 = I0 + u + apxVar.I0(s890Var.b());
        if (!z) {
            i6 = 0;
        }
        return s6j.f(Math.max(i, Math.max(i2, an10.b(I02))) + i6 + i8, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, xsna.tra0] */
    /* JADX WARN: Type inference failed for: r0v44 */
    @Override // xsna.cp10
    public final dp10 b(final ep10 ep10Var, List<? extends zo10> list, long j) {
        zo10 zo10Var;
        List<? extends zo10> list2;
        zo10 zo10Var2;
        tra0 tra0Var;
        int i;
        tra0 tra0Var2;
        zo10 zo10Var3;
        tra0 tra0Var3;
        tra0 tra0Var4;
        zo10 zo10Var4;
        int i2;
        tra0 tra0Var5;
        zo10 zo10Var5;
        zo10 zo10Var6;
        zo10 zo10Var7;
        int i3;
        int i4;
        int i5;
        int i6;
        tra0 tra0Var6;
        int i7;
        tra0 tra0Var7;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        int i9;
        ep10 ep10Var2;
        tra0 tra0Var8;
        tra0 tra0Var9;
        int i10;
        zo10 zo10Var8;
        tra0 tra0Var10;
        tra0 tra0Var11;
        j190 j190Var;
        tra0 tra0Var12;
        int i11;
        tra0 tra0Var13;
        tra0 tra0Var14;
        int i12;
        int i13;
        int i14;
        tra0 tra0Var15;
        int i15;
        int i16;
        j190 j190Var2;
        tra0 tra0Var16;
        tra0 tra0Var17;
        Ref$ObjectRef ref$ObjectRef2;
        int i17;
        tra0 tra0Var18;
        boolean z;
        ep10 ep10Var3;
        float f;
        List<? extends zo10> list3 = list;
        float a = this.d.a();
        s890 s890Var = this.e;
        int r0 = ep10Var.r0(s890Var.b());
        long b = o6j.b(0, j, 0, 0, 0, 10);
        List<? extends zo10> list4 = list3;
        int size = list4.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                zo10Var = null;
                break;
            }
            zo10Var = list3.get(i18);
            if (epx.f(vua0.o(zo10Var), "Leading")) {
                break;
            }
            i18++;
        }
        zo10 zo10Var9 = zo10Var;
        tra0 N = zo10Var9 != null ? zo10Var9.N(b) : null;
        int i19 = N != null ? N.b : 0;
        int max = Math.max(0, N != null ? N.c : 0);
        int size2 = list4.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size2) {
                list2 = list4;
                zo10Var2 = null;
                break;
            }
            zo10Var2 = list3.get(i20);
            list2 = list4;
            if (epx.f(vua0.o(zo10Var2), "Trailing")) {
                break;
            }
            i20++;
            list4 = list2;
        }
        zo10 zo10Var10 = zo10Var2;
        if (zo10Var10 != null) {
            tra0Var = N;
            i = i19;
            tra0Var2 = zo10Var10.N(s6j.j(-i19, 0, 2, b));
        } else {
            tra0Var = N;
            i = i19;
            tra0Var2 = null;
        }
        int i21 = i + (tra0Var2 != null ? tra0Var2.b : 0);
        int max2 = Math.max(max, tra0Var2 != null ? tra0Var2.c : 0);
        int size3 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size3) {
                zo10Var3 = null;
                break;
            }
            zo10Var3 = list3.get(i22);
            int i23 = size3;
            if (epx.f(vua0.o(zo10Var3), "Prefix")) {
                break;
            }
            i22++;
            size3 = i23;
        }
        zo10 zo10Var11 = zo10Var3;
        if (zo10Var11 != null) {
            tra0Var3 = tra0Var2;
            tra0Var4 = zo10Var11.N(s6j.j(-i21, 0, 2, b));
        } else {
            tra0Var3 = tra0Var2;
            tra0Var4 = null;
        }
        int i24 = i21 + (tra0Var4 != null ? tra0Var4.b : 0);
        int max3 = Math.max(max2, tra0Var4 != null ? tra0Var4.c : 0);
        int size4 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size4) {
                zo10Var4 = null;
                break;
            }
            zo10Var4 = list3.get(i25);
            int i26 = size4;
            if (epx.f(vua0.o(zo10Var4), "Suffix")) {
                break;
            }
            i25++;
            size4 = i26;
        }
        zo10 zo10Var12 = zo10Var4;
        if (zo10Var12 != null) {
            i2 = i24;
            tra0Var5 = zo10Var12.N(s6j.j(-i24, 0, 2, b));
        } else {
            i2 = i24;
            tra0Var5 = null;
        }
        int i27 = i2 + (tra0Var5 != null ? tra0Var5.b : 0);
        int max4 = Math.max(max3, tra0Var5 != null ? tra0Var5.c : 0);
        int size5 = list2.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size5) {
                zo10Var5 = null;
                break;
            }
            zo10Var5 = list3.get(i28);
            int i29 = size5;
            int i30 = i28;
            if (epx.f(vua0.o(zo10Var5), "Label")) {
                break;
            }
            i28 = i30 + 1;
            size5 = i29;
        }
        zo10 zo10Var13 = zo10Var5;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        izs<mxj0, s3q0> izsVar = this.a;
        int r02 = ep10Var.r0(s890Var.a(ep10Var.getLayoutDirection())) + ep10Var.r0(s890Var.c(ep10Var.getLayoutDirection()));
        tra0 tra0Var19 = tra0Var4;
        ?? N2 = zo10Var13 != null ? zo10Var13.N(s6j.i(-q6x.A(i27 + r02, r02, a), -r0, b)) : 0;
        ref$ObjectRef3.element = N2;
        izsVar.invoke(new mxj0(N2 != 0 ? (Float.floatToRawIntBits(N2.b) << 32) | (Float.floatToRawIntBits(N2.c) & 4294967295L) : 0L));
        int size6 = list2.size();
        int i31 = 0;
        while (true) {
            if (i31 >= size6) {
                zo10Var6 = null;
                break;
            }
            zo10Var6 = list3.get(i31);
            if (epx.f(vua0.o(zo10Var6), "Supporting")) {
                break;
            }
            i31++;
        }
        zo10 zo10Var14 = zo10Var6;
        int j0 = zo10Var14 != null ? zo10Var14.j0(o6j.k(j)) : 0;
        tra0 tra0Var20 = (tra0) ref$ObjectRef3.element;
        int max5 = Math.max((tra0Var20 != null ? tra0Var20.c : 0) / 2, ep10Var.r0(s890Var.d()));
        long j2 = j;
        long i32 = s6j.i(-i27, (((-r0) - max5) + 0) - j0, j2);
        zo10 zo10Var15 = zo10Var14;
        long b2 = o6j.b(0, i32, 0, 0, 0, 11);
        int size7 = list2.size();
        int i33 = 0;
        while (i33 < size7) {
            zo10 zo10Var16 = zo10Var15;
            zo10 zo10Var17 = list3.get(i33);
            int i34 = r0;
            int i35 = max5;
            if (epx.f(vua0.o(zo10Var17), "TextField")) {
                tra0 N3 = zo10Var17.N(b2);
                long b3 = o6j.b(0, b2, 0, 0, 0, 14);
                List<? extends zo10> list5 = list3;
                int size8 = list5.size();
                int i36 = 0;
                while (true) {
                    if (i36 >= size8) {
                        zo10Var7 = null;
                        break;
                    }
                    zo10Var7 = list3.get(i36);
                    int i37 = size8;
                    if (epx.f(vua0.o(zo10Var7), "Hint")) {
                        break;
                    }
                    i36++;
                    size8 = i37;
                }
                zo10 zo10Var18 = zo10Var7;
                tra0 N4 = zo10Var18 != null ? zo10Var18.N(b3) : null;
                int max6 = Math.max(max4, Math.max(N3.c, N4 != null ? N4.c : 0) + i35 + i34);
                int i38 = tra0Var != null ? tra0Var.b : 0;
                tra0 tra0Var21 = tra0Var3;
                if (tra0Var3 != null) {
                    i3 = i38;
                    i4 = tra0Var21.b;
                } else {
                    i3 = i38;
                    i4 = 0;
                }
                if (tra0Var19 != null) {
                    int i39 = i3;
                    i6 = tra0Var19.b;
                    i5 = i39;
                } else {
                    i5 = i3;
                    i6 = 0;
                }
                int i40 = i5;
                if (tra0Var5 != null) {
                    i7 = tra0Var5.b;
                    tra0Var6 = tra0Var21;
                } else {
                    tra0Var6 = tra0Var21;
                    i7 = 0;
                }
                tra0 tra0Var22 = tra0Var5;
                int i41 = N3.b;
                tra0 tra0Var23 = tra0Var6;
                tra0 tra0Var24 = (tra0) ref$ObjectRef3.element;
                if (tra0Var24 != null) {
                    tra0Var7 = tra0Var19;
                    i8 = tra0Var24.b;
                } else {
                    tra0Var7 = tra0Var19;
                    i8 = 0;
                }
                if (N4 != null) {
                    ref$ObjectRef = ref$ObjectRef3;
                    i9 = N4.b;
                    tra0Var8 = N4;
                    tra0Var9 = N3;
                    i10 = i40;
                    zo10Var8 = zo10Var16;
                    tra0Var10 = tra0Var22;
                    tra0Var11 = tra0Var7;
                    j190Var = this;
                    tra0Var12 = tra0Var;
                    i11 = max6;
                    tra0Var13 = tra0Var23;
                    ep10Var2 = ep10Var;
                } else {
                    ref$ObjectRef = ref$ObjectRef3;
                    i9 = 0;
                    ep10Var2 = ep10Var;
                    tra0Var8 = N4;
                    tra0Var9 = N3;
                    i10 = i40;
                    zo10Var8 = zo10Var16;
                    tra0Var10 = tra0Var22;
                    tra0Var11 = tra0Var7;
                    j190Var = this;
                    tra0Var12 = tra0Var;
                    i11 = max6;
                    tra0Var13 = tra0Var23;
                }
                final int d = j190Var.d(ep10Var2, i10, i4, i6, i7, i41, i8, i9, j2, a);
                final tra0 N5 = zo10Var8 != null ? zo10Var8.N(o6j.b(0, s6j.j(0, -i11, 1, b), d, 0, 0, 9)) : null;
                int i42 = N5 != null ? N5.c : 0;
                final tra0 tra0Var25 = tra0Var12;
                int i43 = tra0Var12 != null ? tra0Var25.c : 0;
                tra0 tra0Var26 = tra0Var13;
                int i44 = tra0Var13 != null ? tra0Var26.c : 0;
                tra0 tra0Var27 = tra0Var11;
                int i45 = tra0Var27 != null ? tra0Var27.c : 0;
                tra0 tra0Var28 = tra0Var10;
                int i46 = tra0Var28 != null ? tra0Var28.c : 0;
                tra0 tra0Var29 = tra0Var9;
                int i47 = tra0Var29.c;
                Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                tra0 tra0Var30 = (tra0) ref$ObjectRef4.element;
                int i48 = tra0Var30 != null ? tra0Var30.c : 0;
                tra0 tra0Var31 = tra0Var8;
                if (tra0Var31 != null) {
                    tra0Var14 = tra0Var28;
                    i12 = i46;
                    i13 = i47;
                    i14 = tra0Var31.c;
                } else {
                    tra0Var14 = tra0Var28;
                    i12 = i46;
                    i13 = i47;
                    i14 = 0;
                }
                if (N5 != null) {
                    tra0Var15 = tra0Var27;
                    i15 = i45;
                    i16 = N5.c;
                    tra0Var16 = tra0Var26;
                    tra0Var17 = tra0Var29;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    i17 = i48;
                    tra0Var18 = tra0Var31;
                    z = false;
                    ep10Var3 = ep10Var;
                    f = a;
                    j190Var2 = this;
                } else {
                    tra0Var15 = tra0Var27;
                    i15 = i45;
                    i16 = 0;
                    j190Var2 = this;
                    tra0Var16 = tra0Var26;
                    tra0Var17 = tra0Var29;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    i17 = i48;
                    tra0Var18 = tra0Var31;
                    z = false;
                    ep10Var3 = ep10Var;
                    f = a;
                }
                final int a2 = j190Var2.a(ep10Var3, i43, i44, i15, i12, i13, i17, i14, i16, j, z, f);
                final float f2 = f;
                int i49 = (a2 - i42) + 0;
                int size9 = list5.size();
                int i50 = 0;
                while (i50 < size9) {
                    zo10 zo10Var19 = list.get(i50);
                    if (epx.f(vua0.o(zo10Var19), "Container")) {
                        final tra0 N6 = zo10Var19.N(s6j.a(d != Integer.MAX_VALUE ? d : 0, d, i49 != Integer.MAX_VALUE ? i49 : 0, i49));
                        final boolean z2 = z;
                        final tra0 tra0Var32 = tra0Var16;
                        final tra0 tra0Var33 = tra0Var15;
                        final tra0 tra0Var34 = tra0Var14;
                        final Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                        final tra0 tra0Var35 = tra0Var17;
                        final tra0 tra0Var36 = tra0Var18;
                        return ep10Var.Q(d, a2, jgp.b, new izs() { // from class: xsna.i190
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                float f3;
                                int i51;
                                j190 j190Var3;
                                int i52;
                                int i53;
                                int i54;
                                j190 j190Var4;
                                float f4;
                                int i55;
                                float f5;
                                float f6;
                                float f7;
                                tra0.a aVar = (tra0.a) obj;
                                tra0 tra0Var37 = (tra0) ref$ObjectRef5.element;
                                ep10 ep10Var4 = ep10Var;
                                float density = ep10Var4.getDensity();
                                LayoutDirection layoutDirection = ep10Var4.getLayoutDirection();
                                j190 j190Var5 = j190.this;
                                float I0 = ep10Var4.I0(j190Var5.f);
                                kgo0.b bVar = j190Var5.c;
                                s890 s890Var2 = j190Var5.e;
                                boolean z3 = z2;
                                int i56 = (!z3 || tra0Var37 == null) ? 0 : tra0Var37.c;
                                aVar.q(N6, 0, i56, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                tra0 tra0Var38 = N5;
                                int i57 = (a2 - (tra0Var38 != null ? tra0Var38.c : 0)) - ((!z3 || tra0Var37 == null) ? 0 : tra0Var37.c);
                                int b4 = an10.b(s890Var2.d() * density);
                                tra0 tra0Var39 = tra0Var25;
                                if (tra0Var39 != null) {
                                    dt1.a.getClass();
                                    f3 = I0;
                                    tra0.a.x(aVar, tra0Var39, 0, dt1.a.l.a(tra0Var39.c, i57) + i56);
                                } else {
                                    f3 = I0;
                                }
                                int i58 = d;
                                tra0 tra0Var40 = tra0Var32;
                                if (tra0Var37 != null) {
                                    if (z3) {
                                        f4 = density;
                                        j190Var3 = j190Var5;
                                        i55 = 0;
                                    } else {
                                        f4 = density;
                                        if (j190Var5.b) {
                                            dt1.a.getClass();
                                            j190Var3 = j190Var5;
                                            i55 = dt1.a.l.a(tra0Var37.c, i57);
                                        } else {
                                            j190Var3 = j190Var5;
                                            i55 = b4;
                                        }
                                    }
                                    int i59 = z3 ? 0 : -(tra0Var37.c / 2);
                                    float f8 = f2;
                                    int A = q6x.A(i55, i59, f8);
                                    if (z3) {
                                        aVar.q(tra0Var37, fgo0.d(bVar).a(tra0Var37.b, i58, layoutDirection), A, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        i51 = i58;
                                    } else {
                                        float s = s200.s(s890Var2, layoutDirection) * f4;
                                        float r = s200.r(s890Var2, layoutDirection) * f4;
                                        if (tra0Var39 == null) {
                                            f5 = 0.0f;
                                            f6 = s;
                                        } else {
                                            f5 = 0.0f;
                                            float f9 = tra0Var39.b;
                                            float f10 = s - f3;
                                            if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                f10 = 0.0f;
                                            }
                                            f6 = f9 + f10;
                                        }
                                        if (tra0Var40 == null) {
                                            i51 = i58;
                                            f7 = r;
                                        } else {
                                            i51 = i58;
                                            float f11 = tra0Var40.b;
                                            float f12 = r - f3;
                                            if (f12 < f5) {
                                                f12 = f5;
                                            }
                                            f7 = f11 + f12;
                                        }
                                        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                                        aVar.q(tra0Var37, an10.b(q6x.z(fgo0.c(bVar).a(tra0Var37.b, i51 - an10.b(f6 + f7), layoutDirection) + (layoutDirection == layoutDirection2 ? f6 : f7), fgo0.d(bVar).a(tra0Var37.b, i51 - an10.b(s + r), layoutDirection) + (layoutDirection == layoutDirection2 ? s : r), f8)), A, f5);
                                    }
                                } else {
                                    i51 = i58;
                                    j190Var3 = j190Var5;
                                }
                                tra0 tra0Var41 = tra0Var33;
                                if (tra0Var41 != null) {
                                    i52 = i56;
                                    i53 = b4;
                                    i54 = i57;
                                    j190Var4 = j190Var3;
                                    tra0.a.x(aVar, tra0Var41, tra0Var39 != null ? tra0Var39.b : 0, j190.j(i52, j190Var4, i54, i53, tra0Var37, tra0Var41));
                                } else {
                                    i52 = i56;
                                    i53 = b4;
                                    i54 = i57;
                                    j190Var4 = j190Var3;
                                }
                                int i60 = (tra0Var39 != null ? tra0Var39.b : 0) + (tra0Var41 != null ? tra0Var41.b : 0);
                                tra0 tra0Var42 = tra0Var35;
                                tra0.a.x(aVar, tra0Var42, i60, j190.j(i52, j190Var4, i54, i53, tra0Var37, tra0Var42));
                                tra0 tra0Var43 = tra0Var36;
                                if (tra0Var43 != null) {
                                    tra0.a.x(aVar, tra0Var43, i60, j190.j(i52, j190Var4, i54, i53, tra0Var37, tra0Var43));
                                }
                                tra0 tra0Var44 = tra0Var34;
                                if (tra0Var44 != null) {
                                    tra0.a.x(aVar, tra0Var44, (i51 - (tra0Var40 != null ? tra0Var40.b : 0)) - tra0Var44.b, j190.j(i52, j190Var4, i54, i53, tra0Var37, tra0Var44));
                                }
                                if (tra0Var40 != null) {
                                    int i61 = i51 - tra0Var40.b;
                                    dt1.a.getClass();
                                    tra0.a.x(aVar, tra0Var40, i61, dt1.a.l.a(tra0Var40.c, i54) + i52);
                                }
                                if (tra0Var38 != null) {
                                    tra0.a.x(aVar, tra0Var38, 0, i52 + i54);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                    i50++;
                    a2 = a2;
                    z = z;
                }
                hgz.c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i33++;
            j2 = j;
            zo10Var15 = zo10Var16;
            r0 = i34;
            tra0Var5 = tra0Var5;
            ref$ObjectRef3 = ref$ObjectRef3;
            list3 = list3;
            max5 = i35;
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // xsna.cp10
    public final int c(apx apxVar, List<? extends zox> list, int i) {
        return h(apxVar, list, i, new g6g(1));
    }

    public final int d(apx apxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, q6x.A(i6, 0, f))) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        s890 s890Var = this.e;
        return s6j.g(Math.max(max, an10.b((i6 + apxVar.I0(s890Var.a(layoutDirection) + s890Var.c(layoutDirection))) * f)), j);
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
        return i(apxVar, list, i, new oq2((byte) 0, 6));
    }

    @Override // xsna.cp10
    public final int f(apx apxVar, List<? extends zox> list, int i) {
        return h(apxVar, list, i, new nq2((byte) 0, 9));
    }

    @Override // xsna.cp10
    public final int g(apx apxVar, List<? extends zox> list, int i) {
        return i(apxVar, list, i, new yh3(8));
    }

    public final int h(apx apxVar, List<? extends zox> list, int i, wzs<? super zox, ? super Integer, Integer> wzsVar) {
        zox zoxVar;
        int i2;
        int i3;
        zox zoxVar2;
        int i4;
        zox zoxVar3;
        zox zoxVar4;
        int i5;
        zox zoxVar5;
        int i6;
        int i7;
        zox zoxVar6;
        zox zoxVar7;
        j190 j190Var = this;
        float a = j190Var.d.a();
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
            i2 = x1o0.s(i, zoxVar8.l0(Integer.MAX_VALUE));
            i3 = wzsVar.invoke(zoxVar8, Integer.valueOf(i)).intValue();
        } else {
            i2 = i;
            i3 = 0;
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
            i2 = x1o0.s(i2, zoxVar9.l0(Integer.MAX_VALUE));
            i4 = wzsVar.invoke(zoxVar9, Integer.valueOf(i)).intValue();
        } else {
            i4 = 0;
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
        int intValue = zoxVar10 != null ? wzsVar.invoke(zoxVar10, Integer.valueOf(q6x.A(i2, i, a))).intValue() : 0;
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
            i5 = wzsVar.invoke(zoxVar11, Integer.valueOf(i2)).intValue();
            i2 = x1o0.s(i2, zoxVar11.l0(Integer.MAX_VALUE));
        } else {
            i5 = 0;
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
            i6 = wzsVar.invoke(zoxVar12, Integer.valueOf(i2)).intValue();
            i2 = x1o0.s(i2, zoxVar12.l0(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size6 = list2.size();
        int i13 = 0;
        while (i13 < size6) {
            zox zoxVar13 = list.get(i13);
            if (epx.f(x1o0.j(zoxVar13), "TextField")) {
                int intValue2 = wzsVar.invoke(zoxVar13, Integer.valueOf(i2)).intValue();
                int size7 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        i7 = intValue2;
                        zoxVar6 = null;
                        break;
                    }
                    zoxVar6 = list.get(i14);
                    i7 = intValue2;
                    if (epx.f(x1o0.j(zoxVar6), "Hint")) {
                        break;
                    }
                    i14++;
                    intValue2 = i7;
                }
                zox zoxVar14 = zoxVar6;
                int intValue3 = zoxVar14 != null ? wzsVar.invoke(zoxVar14, Integer.valueOf(i2)).intValue() : 0;
                int size8 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        zoxVar7 = null;
                        break;
                    }
                    zoxVar7 = list.get(i15);
                    if (epx.f(x1o0.j(zoxVar7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                zox zoxVar15 = zoxVar7;
                return j190Var.a(apxVar, i3, i4, i5, i6, i7, intValue, intValue3, zoxVar15 != null ? wzsVar.invoke(zoxVar15, Integer.valueOf(i)).intValue() : 0, s6j.b(0, 0, 0, 0, 15), false, a);
            }
            i13++;
            i5 = i5;
            j190Var = this;
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int i(apx apxVar, List<? extends zox> list, int i, wzs<? super zox, ? super Integer, Integer> wzsVar) {
        zox zoxVar;
        zox zoxVar2;
        zox zoxVar3;
        zox zoxVar4;
        zox zoxVar5;
        zox zoxVar6;
        List<? extends zox> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            zox zoxVar7 = list.get(i2);
            if (epx.f(x1o0.j(zoxVar7), "TextField")) {
                int intValue = wzsVar.invoke(zoxVar7, Integer.valueOf(i)).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    zoxVar = null;
                    if (i3 >= size2) {
                        zoxVar2 = null;
                        break;
                    }
                    zoxVar2 = list.get(i3);
                    if (epx.f(x1o0.j(zoxVar2), "Label")) {
                        break;
                    }
                    i3++;
                }
                zox zoxVar8 = zoxVar2;
                int intValue2 = zoxVar8 != null ? wzsVar.invoke(zoxVar8, Integer.valueOf(i)).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        zoxVar3 = null;
                        break;
                    }
                    zoxVar3 = list.get(i4);
                    if (epx.f(x1o0.j(zoxVar3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                zox zoxVar9 = zoxVar3;
                int intValue3 = zoxVar9 != null ? wzsVar.invoke(zoxVar9, Integer.valueOf(i)).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        zoxVar4 = null;
                        break;
                    }
                    zoxVar4 = list.get(i5);
                    if (epx.f(x1o0.j(zoxVar4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                zox zoxVar10 = zoxVar4;
                int intValue4 = zoxVar10 != null ? wzsVar.invoke(zoxVar10, Integer.valueOf(i)).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        zoxVar5 = null;
                        break;
                    }
                    zoxVar5 = list.get(i6);
                    if (epx.f(x1o0.j(zoxVar5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                zox zoxVar11 = zoxVar5;
                int intValue5 = zoxVar11 != null ? wzsVar.invoke(zoxVar11, Integer.valueOf(i)).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        zoxVar6 = null;
                        break;
                    }
                    zoxVar6 = list.get(i7);
                    if (epx.f(x1o0.j(zoxVar6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                zox zoxVar12 = zoxVar6;
                int intValue6 = zoxVar12 != null ? wzsVar.invoke(zoxVar12, Integer.valueOf(i)).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    zox zoxVar13 = list.get(i8);
                    if (epx.f(x1o0.j(zoxVar13), "Hint")) {
                        zoxVar = zoxVar13;
                        break;
                    }
                    i8++;
                }
                zox zoxVar14 = zoxVar;
                return d(apxVar, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, zoxVar14 != null ? wzsVar.invoke(zoxVar14, Integer.valueOf(i)).intValue() : 0, s6j.b(0, 0, 0, 0, 15), this.d.a());
            }
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
