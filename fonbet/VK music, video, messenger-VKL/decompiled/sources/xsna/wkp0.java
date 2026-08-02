package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import xsna.ckp0;

/* compiled from: Transformable.kt */
/* loaded from: classes11.dex */
public final class wkp0 {
    public static final ov70 a(eu5 eu5Var, plb0 plb0Var, afh0 afh0Var) {
        long j;
        long j2;
        int i = plb0Var.e;
        List<xlb0> list = plb0Var.a;
        if ((i & 4096) == 0) {
            return null;
        }
        int i2 = plb0Var.f;
        if (i2 != 6 && i2 != 10 && i2 != 11 && i2 != 12) {
            return null;
        }
        eu5Var.a();
        long a = afh0Var.a(plb0Var);
        xlb0 xlb0Var = (xlb0) j5g.a0(list);
        if (xlb0Var != null) {
            long j3 = xlb0Var.l ^ (-9223372034707292160L);
            List<w7v> b = xlb0Var.b();
            ov70 ov70Var = new ov70(0L);
            int size = b.size();
            int i3 = 0;
            while (true) {
                j2 = ov70Var.a;
                if (i3 >= size) {
                    break;
                }
                ov70Var = new ov70(ov70.e(j2, b.get(i3).d));
                i3++;
            }
            j = ov70.f(j3, j2);
        } else {
            j = 0;
        }
        long f = ov70.f(a, j);
        if (ov70.c(f, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            list.get(i4).a();
        }
        return new ov70(f);
    }

    public static final ov70 b(plb0 plb0Var) {
        long j;
        long j2;
        int i = plb0Var.f;
        List<xlb0> list = plb0Var.a;
        if (i != 10 && i != 11 && i != 12) {
            return null;
        }
        xlb0 xlb0Var = (xlb0) j5g.a0(list);
        if (xlb0Var != null) {
            long j3 = xlb0Var.l ^ (-9223372034707292160L);
            List<w7v> b = xlb0Var.b();
            ov70 ov70Var = new ov70(0L);
            int size = b.size();
            int i2 = 0;
            while (true) {
                j2 = ov70Var.a;
                if (i2 >= size) {
                    break;
                }
                ov70Var = new ov70(ov70.e(j2, b.get(i2).d));
                i2++;
            }
            j = ov70.f(j3, j2);
        } else {
            j = 0;
        }
        if (ov70.c(j, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            list.get(i3).a();
        }
        return new ov70(j);
    }

    public static final Float c(plb0 plb0Var) {
        int i = plb0Var.f;
        List<xlb0> list = plb0Var.a;
        if (i != 7 && i != 8 && i != 9) {
            return null;
        }
        List<xlb0> list2 = list;
        int size = list2.size();
        float f = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            xlb0 xlb0Var = list.get(i2);
            f *= xlb0Var.k;
            List<w7v> b = xlb0Var.b();
            int size2 = b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                f *= b.get(i3).c;
            }
        }
        if (f == 1.0f) {
            return null;
        }
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            list.get(i4).a();
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0154, code lost:
    
        r0 = r1.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0158, code lost:
    
        if (r0 != 10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015d, code lost:
    
        if (r0 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0162, code lost:
    
        if (r0 != 12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0166, code lost:
    
        if (r0 != 7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x016b, code lost:
    
        if (r0 != 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0170, code lost:
    
        if (r0 != 9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0174, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0345, code lost:
    
        if (r6 != 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0347, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x026f, code lost:
    
        if (((java.lang.Boolean) r11.invoke(new xsna.ov70(r3))).booleanValue() == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154 A[EDGE_INSN: B:104:0x0154->B:105:0x0154 BREAK  A[LOOP:2: B:34:0x0142->B:37:0x0151], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x034c A[EDGE_INSN: B:124:0x034c->B:123:0x034c BREAK  A[LOOP:0: B:13:0x0337->B:16:0x0349], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0310 -> B:12:0x0325). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(eu5 eu5Var, nm8 nm8Var, gj80 gj80Var, BaseContinuationImpl baseContinuationImpl) {
        vkp0 vkp0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        float e;
        izs izsVar;
        Object obj;
        eu5 eu5Var2;
        qta qtaVar;
        long j;
        int i2;
        float f;
        float f2;
        boolean z;
        int i3;
        long j2;
        float f3;
        int i4;
        boolean z2;
        float f4;
        boolean z3;
        float f5;
        izs izsVar2;
        long j3;
        int i5;
        float f6;
        int size;
        int i6;
        int i7;
        CoroutineSingletons coroutineSingletons2;
        float f7;
        long j4;
        int i8;
        float f8;
        int i9;
        Object I1;
        CoroutineSingletons coroutineSingletons3;
        boolean z4;
        long e2;
        float f9;
        int i10;
        float f10;
        float f11;
        long j5;
        int i11;
        int i12;
        int size2;
        int i13;
        Object I12;
        if (baseContinuationImpl instanceof vkp0) {
            vkp0Var = (vkp0) baseContinuationImpl;
            int i14 = vkp0Var.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vkp0Var.label = i14 - Integer.MIN_VALUE;
                Object obj2 = vkp0Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vkp0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    e = eu5Var.getViewConfiguration().e();
                    vkp0Var.L$0 = eu5Var;
                    vkp0Var.L$1 = nm8Var;
                    izsVar = gj80Var;
                    vkp0Var.L$2 = izsVar;
                    vkp0Var.Z$0 = false;
                    vkp0Var.F$0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    vkp0Var.F$1 = 1.0f;
                    vkp0Var.J$0 = 0L;
                    vkp0Var.I$0 = 0;
                    vkp0Var.F$2 = e;
                    vkp0Var.I$1 = 0;
                    vkp0Var.label = 1;
                    obj = null;
                    if (z2o0.b(eu5Var, null, vkp0Var, 2) != coroutineSingletons) {
                        eu5Var2 = eu5Var;
                        qtaVar = nm8Var;
                        j = 0;
                        i2 = 0;
                        f = 1.0f;
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        z = false;
                        i3 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    int i15 = vkp0Var.I$1;
                    e = vkp0Var.F$2;
                    int i16 = vkp0Var.I$0;
                    long j6 = vkp0Var.J$0;
                    f = vkp0Var.F$1;
                    f2 = vkp0Var.F$0;
                    z = vkp0Var.Z$0;
                    izs izsVar3 = (izs) vkp0Var.L$2;
                    qtaVar = (qta) vkp0Var.L$1;
                    eu5Var2 = (eu5) vkp0Var.L$0;
                    kotlin.a.a(obj2);
                    i3 = i15;
                    j = j6;
                    i2 = i16;
                    izsVar = izsVar3;
                    obj = null;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i7 = vkp0Var.I$2;
                        i9 = vkp0Var.I$1;
                        float f12 = vkp0Var.F$2;
                        int i17 = vkp0Var.I$0;
                        long j7 = vkp0Var.J$0;
                        float f13 = vkp0Var.F$1;
                        float f14 = vkp0Var.F$0;
                        boolean z5 = vkp0Var.Z$0;
                        plb0 plb0Var = (plb0) vkp0Var.L$3;
                        izs izsVar4 = (izs) vkp0Var.L$2;
                        qtaVar = (qta) vkp0Var.L$1;
                        eu5 eu5Var3 = (eu5) vkp0Var.L$0;
                        kotlin.a.a(obj2);
                        coroutineSingletons3 = coroutineSingletons;
                        f8 = f13;
                        long j8 = j7;
                        eu5 eu5Var4 = eu5Var3;
                        izsVar = izsVar4;
                        boolean z6 = z5;
                        i2 = i17;
                        int i18 = 0;
                        List<xlb0> list = ((plb0) obj2).a;
                        int i19 = i7;
                        int size3 = list.size();
                        vkp0 vkp0Var2 = vkp0Var;
                        int i20 = i18;
                        while (true) {
                            if (i20 < size3) {
                                if (list.get(i20).c()) {
                                    break;
                                }
                                i20++;
                            } else {
                                break;
                            }
                        }
                        int i21 = i18;
                        if (i19 == 0 && i21 == 0) {
                            List<xlb0> list2 = plb0Var.a;
                            int size4 = list2.size();
                            int i22 = i18;
                            while (i22 < size4) {
                                if (list2.get(i22).d) {
                                    vkp0Var = vkp0Var2;
                                    f3 = f8;
                                    i4 = i9;
                                    coroutineSingletons = coroutineSingletons3;
                                    e = f12;
                                    obj = null;
                                    j2 = j8;
                                    z2 = z6;
                                    f4 = f14;
                                    eu5Var2 = eu5Var4;
                                    j3 = j2;
                                    vkp0Var.L$0 = eu5Var2;
                                    vkp0Var.L$1 = qtaVar;
                                    vkp0Var.L$2 = izsVar;
                                    vkp0Var.L$3 = obj;
                                    vkp0Var.Z$0 = z2;
                                    vkp0Var.F$0 = f4;
                                    vkp0Var.F$1 = f3;
                                    vkp0Var.J$0 = j3;
                                    vkp0Var.I$0 = i2;
                                    vkp0Var.F$2 = e;
                                    vkp0Var.I$1 = i4;
                                    vkp0Var.label = 2;
                                    I12 = eu5Var2.I1(PointerEventPass.Main, vkp0Var);
                                    if (I12 != coroutineSingletons) {
                                        float f15 = e;
                                        f6 = f3;
                                        obj2 = I12;
                                        f5 = f15;
                                        z3 = z2;
                                        izsVar2 = izsVar;
                                        i5 = i2;
                                        boolean z7 = z3;
                                        plb0 plb0Var2 = (plb0) obj2;
                                        List<xlb0> list3 = plb0Var2.a;
                                        size = list3.size();
                                        int i23 = i4;
                                        i6 = 0;
                                        while (true) {
                                            if (i6 >= size) {
                                                break;
                                            }
                                            if (list3.get(i6).c()) {
                                                break;
                                            }
                                            i6++;
                                        }
                                        i7 = 1;
                                        if (i7 != 0) {
                                            float g = n34.g(plb0Var2, true);
                                            float g2 = n34.g(plb0Var2, false);
                                            float f16 = (g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || g2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 1.0f : g / g2;
                                            float h = n34.h(plb0Var2);
                                            float f17 = f6;
                                            f7 = f5;
                                            long f18 = n34.f(plb0Var2, true, new wyn0(2));
                                            int i24 = i5;
                                            if (ov70.c(f18, 9205357640488583168L)) {
                                                coroutineSingletons2 = coroutineSingletons;
                                                e2 = 0;
                                                z4 = false;
                                            } else {
                                                coroutineSingletons2 = coroutineSingletons;
                                                z4 = false;
                                                e2 = ov70.e(f18, n34.f(plb0Var2, false, new wyn0(2)));
                                            }
                                            if (i24 == 0) {
                                                f10 = f17 * f16;
                                                f4 += h;
                                                j3 = ov70.f(j3, e2);
                                                float g3 = n34.g(plb0Var2, z4);
                                                f9 = h;
                                                float abs = Math.abs(1 - f10) * g3;
                                                float abs2 = Math.abs(((3.1415927f * f4) * g3) / 180.0f);
                                                float d = ov70.d(j3);
                                                if (abs > f7 || abs2 > f7 || (d > f7 && ((Boolean) izsVar2.invoke(new ov70(e2))).booleanValue())) {
                                                    i10 = (!z7 || abs2 >= f7) ? 0 : 1;
                                                    qtaVar.f(ckp0.b.a);
                                                    f11 = f4;
                                                    j5 = j3;
                                                    i11 = 1;
                                                    if (i11 == 0) {
                                                        i23 = i10;
                                                        long f19 = n34.f(plb0Var2, false, new wyn0(2));
                                                        float f20 = i23 != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f9;
                                                        if (f20 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                            i12 = i11;
                                                            if (f16 == 1.0f) {
                                                                if (!ov70.c(e2, 0L)) {
                                                                }
                                                                List<xlb0> list4 = plb0Var2.a;
                                                                size2 = list4.size();
                                                                i13 = 0;
                                                                while (i13 < size2) {
                                                                    xlb0 xlb0Var = list4.get(i13);
                                                                    List<xlb0> list5 = list4;
                                                                    int i25 = size2;
                                                                    long j9 = j5;
                                                                    if (!ov70.c(fdi.E(xlb0Var, false), 0L)) {
                                                                        xlb0Var.a();
                                                                    }
                                                                    i13++;
                                                                    list4 = list5;
                                                                    size2 = i25;
                                                                    j5 = j9;
                                                                }
                                                            }
                                                        } else {
                                                            i12 = i11;
                                                        }
                                                        qtaVar.f(new ckp0.a(f19, e2, f16, f20));
                                                        List<xlb0> list42 = plb0Var2.a;
                                                        size2 = list42.size();
                                                        i13 = 0;
                                                        while (i13 < size2) {
                                                        }
                                                    } else {
                                                        i23 = i10;
                                                        i12 = i11;
                                                    }
                                                    i8 = i12;
                                                    f8 = f10;
                                                    f4 = f11;
                                                    j4 = j5;
                                                    i18 = 0;
                                                } else {
                                                    i10 = i23;
                                                }
                                            } else {
                                                f9 = h;
                                                i10 = i23;
                                                f10 = f17;
                                            }
                                            f11 = f4;
                                            j5 = j3;
                                            i11 = i24;
                                            if (i11 == 0) {
                                            }
                                            i8 = i12;
                                            f8 = f10;
                                            f4 = f11;
                                            j4 = j5;
                                            i18 = 0;
                                        } else {
                                            coroutineSingletons2 = coroutineSingletons;
                                            f7 = f5;
                                            i18 = 0;
                                            qtaVar.f(ckp0.c.a);
                                            j4 = j3;
                                            i8 = i5;
                                            f8 = f6;
                                        }
                                        i9 = i23;
                                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                                        vkp0Var.L$0 = eu5Var2;
                                        vkp0Var.L$1 = qtaVar;
                                        vkp0Var.L$2 = izsVar2;
                                        vkp0Var.L$3 = plb0Var2;
                                        vkp0Var.Z$0 = z7;
                                        vkp0Var.F$0 = f4;
                                        vkp0Var.F$1 = f8;
                                        vkp0Var.J$0 = j4;
                                        vkp0Var.I$0 = i8;
                                        float f21 = f7;
                                        vkp0Var.F$2 = f21;
                                        vkp0Var.I$1 = i9;
                                        vkp0Var.I$2 = i7;
                                        vkp0Var.label = 3;
                                        I1 = eu5Var2.I1(pointerEventPass, vkp0Var);
                                        coroutineSingletons3 = coroutineSingletons2;
                                        if (I1 != coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        plb0Var = plb0Var2;
                                        obj2 = I1;
                                        i2 = i8;
                                        izsVar = izsVar2;
                                        z6 = z7;
                                        long j10 = j4;
                                        f12 = f21;
                                        eu5Var4 = eu5Var2;
                                        f14 = f4;
                                        j8 = j10;
                                        List<xlb0> list6 = ((plb0) obj2).a;
                                        int i192 = i7;
                                        int size32 = list6.size();
                                        vkp0 vkp0Var22 = vkp0Var;
                                        int i202 = i18;
                                        while (true) {
                                            if (i202 < size32) {
                                            }
                                            i202++;
                                        }
                                        int i212 = i18;
                                        if (i192 == 0) {
                                            List<xlb0> list22 = plb0Var.a;
                                            int size42 = list22.size();
                                            int i222 = i18;
                                            while (i222 < size42) {
                                            }
                                        }
                                    }
                                    return coroutineSingletons;
                                }
                                i222++;
                            }
                        }
                        return s3q0.a;
                    }
                    i4 = vkp0Var.I$1;
                    float f22 = vkp0Var.F$2;
                    i5 = vkp0Var.I$0;
                    long j11 = vkp0Var.J$0;
                    float f23 = vkp0Var.F$1;
                    float f24 = vkp0Var.F$0;
                    boolean z8 = vkp0Var.Z$0;
                    izsVar2 = (izs) vkp0Var.L$2;
                    qtaVar = (qta) vkp0Var.L$1;
                    eu5Var2 = (eu5) vkp0Var.L$0;
                    kotlin.a.a(obj2);
                    f5 = f22;
                    f6 = f23;
                    z3 = z8;
                    f4 = f24;
                    j3 = j11;
                    boolean z72 = z3;
                    plb0 plb0Var22 = (plb0) obj2;
                    List<xlb0> list32 = plb0Var22.a;
                    size = list32.size();
                    int i232 = i4;
                    i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                        }
                        i6++;
                    }
                    i7 = 1;
                    if (i7 != 0) {
                    }
                    i9 = i232;
                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                    vkp0Var.L$0 = eu5Var2;
                    vkp0Var.L$1 = qtaVar;
                    vkp0Var.L$2 = izsVar2;
                    vkp0Var.L$3 = plb0Var22;
                    vkp0Var.Z$0 = z72;
                    vkp0Var.F$0 = f4;
                    vkp0Var.F$1 = f8;
                    vkp0Var.J$0 = j4;
                    vkp0Var.I$0 = i8;
                    float f212 = f7;
                    vkp0Var.F$2 = f212;
                    vkp0Var.I$1 = i9;
                    vkp0Var.I$2 = i7;
                    vkp0Var.label = 3;
                    I1 = eu5Var2.I1(pointerEventPass2, vkp0Var);
                    coroutineSingletons3 = coroutineSingletons2;
                    if (I1 != coroutineSingletons3) {
                    }
                }
                j2 = j;
                f3 = f;
                i4 = i3;
                z2 = z;
                f4 = f2;
                j3 = j2;
                vkp0Var.L$0 = eu5Var2;
                vkp0Var.L$1 = qtaVar;
                vkp0Var.L$2 = izsVar;
                vkp0Var.L$3 = obj;
                vkp0Var.Z$0 = z2;
                vkp0Var.F$0 = f4;
                vkp0Var.F$1 = f3;
                vkp0Var.J$0 = j3;
                vkp0Var.I$0 = i2;
                vkp0Var.F$2 = e;
                vkp0Var.I$1 = i4;
                vkp0Var.label = 2;
                I12 = eu5Var2.I1(PointerEventPass.Main, vkp0Var);
                if (I12 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        vkp0Var = new vkp0(baseContinuationImpl);
        Object obj22 = vkp0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vkp0Var.label;
        if (i != 0) {
        }
        j2 = j;
        f3 = f;
        i4 = i3;
        z2 = z;
        f4 = f2;
        j3 = j2;
        vkp0Var.L$0 = eu5Var2;
        vkp0Var.L$1 = qtaVar;
        vkp0Var.L$2 = izsVar;
        vkp0Var.L$3 = obj;
        vkp0Var.Z$0 = z2;
        vkp0Var.F$0 = f4;
        vkp0Var.F$1 = f3;
        vkp0Var.J$0 = j3;
        vkp0Var.I$0 = i2;
        vkp0Var.F$2 = e;
        vkp0Var.I$1 = i4;
        vkp0Var.label = 2;
        I12 = eu5Var2.I1(PointerEventPass.Main, vkp0Var);
        if (I12 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
