package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: DragGestureDetector.kt */
/* loaded from: classes11.dex */
public final class lgo {
    public static final float a = ((float) 0.125d) / 18;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0093 -> B:10:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(eu5 eu5Var, xlb0 xlb0Var, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        zfo zfoVar;
        int i;
        Ref$LongRef ref$LongRef;
        idp0 idp0Var;
        int i2;
        PointerEventPass pointerEventPass2;
        zfo zfoVar2;
        float f;
        eu5 eu5Var2;
        Object I1;
        zfo zfoVar3;
        xlb0 xlb0Var2;
        int i3;
        int size;
        int i4;
        xlb0 xlb0Var3;
        xlb0 xlb0Var4;
        int size2;
        int i5;
        if (baseContinuationImpl instanceof zfo) {
            zfoVar = (zfo) baseContinuationImpl;
            int i6 = zfoVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                zfoVar.label = i6 - Integer.MIN_VALUE;
                Object obj = zfoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zfoVar.label;
                int i7 = 1;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f2 = zfoVar.F$0;
                    int i8 = zfoVar.I$0;
                    idp0 idp0Var2 = (idp0) zfoVar.L$3;
                    Ref$LongRef ref$LongRef2 = (Ref$LongRef) zfoVar.L$2;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) zfoVar.L$1;
                    eu5 eu5Var3 = (eu5) zfoVar.L$0;
                    kotlin.a.a(obj);
                    zfo zfoVar4 = zfoVar;
                    f = f2;
                    eu5Var2 = eu5Var3;
                    Ref$LongRef ref$LongRef3 = ref$LongRef2;
                    idp0Var = idp0Var2;
                    zfo zfoVar5 = zfoVar4;
                    List<xlb0> list = ((plb0) obj).a;
                    int size3 = list.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size3) {
                            zfoVar3 = zfoVar5;
                            xlb0Var2 = null;
                            break;
                        }
                        xlb0Var2 = list.get(i9);
                        zfoVar3 = zfoVar5;
                        if (wlb0.g(xlb0Var2.a, ref$LongRef3.element)) {
                            break;
                        }
                        i9++;
                        zfoVar5 = zfoVar3;
                    }
                    xlb0 xlb0Var5 = xlb0Var2;
                    if (xlb0Var5 != null || fdi.o(xlb0Var5)) {
                        i3 = 1;
                        size = list.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                xlb0Var3 = null;
                                break;
                            }
                            xlb0Var3 = list.get(i4);
                            if (xlb0Var3.d) {
                                break;
                            }
                            i4++;
                        }
                        xlb0Var4 = xlb0Var3;
                        if (xlb0Var4 != null) {
                            return Boolean.valueOf(i8 != 0);
                        }
                        ref$LongRef3.element = xlb0Var4.a;
                    } else {
                        i3 = 1;
                        if ((idp0Var.a(fdi.E(xlb0Var5, true), f, true) & 9223372034707292159L) != 9205357640488583168L) {
                            i2 = 1;
                            size2 = list.size();
                            for (i5 = 0; i5 < size2; i5++) {
                                if (list.get(i5).d) {
                                    zfoVar2 = zfoVar3;
                                    pointerEventPass2 = pointerEventPass3;
                                    ref$LongRef = ref$LongRef3;
                                    i7 = i3;
                                    zfoVar2.L$0 = eu5Var2;
                                    zfoVar2.L$1 = pointerEventPass2;
                                    zfoVar2.L$2 = ref$LongRef;
                                    zfoVar2.L$3 = idp0Var;
                                    zfoVar2.I$0 = i2;
                                    zfoVar2.F$0 = f;
                                    zfoVar2.label = i7;
                                    I1 = eu5Var2.I1(pointerEventPass2, zfoVar2);
                                    if (I1 != coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    Ref$LongRef ref$LongRef4 = ref$LongRef;
                                    pointerEventPass3 = pointerEventPass2;
                                    obj = I1;
                                    ref$LongRef3 = ref$LongRef4;
                                    int i10 = i2;
                                    zfoVar5 = zfoVar2;
                                    i8 = i10;
                                    List<xlb0> list2 = ((plb0) obj).a;
                                    int size32 = list2.size();
                                    int i92 = 0;
                                    while (true) {
                                        if (i92 < size32) {
                                        }
                                        i92++;
                                        zfoVar5 = zfoVar3;
                                    }
                                    xlb0 xlb0Var52 = xlb0Var2;
                                    if (xlb0Var52 != null) {
                                    }
                                    i3 = 1;
                                    size = list2.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size) {
                                        }
                                        i4++;
                                    }
                                    xlb0Var4 = xlb0Var3;
                                    if (xlb0Var4 != null) {
                                    }
                                }
                            }
                            return Boolean.valueOf(i2 == 0 ? i3 : 0);
                        }
                    }
                    i2 = i8;
                    size2 = list2.size();
                    while (i5 < size2) {
                    }
                    return Boolean.valueOf(i2 == 0 ? i3 : 0);
                }
                kotlin.a.a(obj);
                if (d7s.a(eu5Var)) {
                    return Boolean.FALSE;
                }
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = xlb0Var.a;
                float k = k(eu5Var.getViewConfiguration(), xlb0Var.i);
                ref$LongRef = ref$LongRef5;
                idp0Var = new idp0((Orientation) null, 3);
                i2 = 0;
                pointerEventPass2 = pointerEventPass;
                zfoVar2 = zfoVar;
                f = k;
                eu5Var2 = eu5Var;
                zfoVar2.L$0 = eu5Var2;
                zfoVar2.L$1 = pointerEventPass2;
                zfoVar2.L$2 = ref$LongRef;
                zfoVar2.L$3 = idp0Var;
                zfoVar2.I$0 = i2;
                zfoVar2.F$0 = f;
                zfoVar2.label = i7;
                I1 = eu5Var2.I1(pointerEventPass2, zfoVar2);
                if (I1 != coroutineSingletons) {
                }
            }
        }
        zfoVar = new zfo(baseContinuationImpl);
        Object obj2 = zfoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zfoVar.label;
        int i72 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        if (xsna.ov70.c(xsna.fdi.E(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(eu5 eu5Var, long j, ContinuationImpl continuationImpl) {
        ago agoVar;
        int i;
        Ref$LongRef ref$LongRef;
        eu5 eu5Var2;
        Object I1;
        xlb0 xlb0Var;
        xlb0 xlb0Var2;
        if (continuationImpl instanceof ago) {
            agoVar = (ago) continuationImpl;
            int i2 = agoVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agoVar.label = i2 - Integer.MIN_VALUE;
                Object obj = agoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agoVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!j(eu5Var.z0(), j)) {
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = j;
                        eu5Var2 = eu5Var;
                        agoVar.L$0 = eu5Var2;
                        agoVar.L$1 = ref$LongRef;
                        agoVar.label = 1;
                        I1 = eu5Var2.I1(PointerEventPass.Main, agoVar);
                        if (I1 != coroutineSingletons) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) agoVar.L$1;
                eu5 eu5Var3 = (eu5) agoVar.L$0;
                kotlin.a.a(obj);
                Ref$LongRef ref$LongRef3 = ref$LongRef2;
                eu5Var2 = eu5Var3;
                plb0 plb0Var = (plb0) obj;
                List<xlb0> list = plb0Var.a;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        xlb0Var = null;
                        break;
                    }
                    xlb0Var = list.get(i4);
                    if (wlb0.g(xlb0Var.a, ref$LongRef3.element)) {
                        break;
                    }
                    i4++;
                }
                xlb0 xlb0Var3 = xlb0Var;
                if (xlb0Var3 == null) {
                    if (fdi.o(xlb0Var3)) {
                        List<xlb0> list2 = plb0Var.a;
                        int size2 = list2.size();
                        while (true) {
                            if (i3 >= size2) {
                                xlb0Var2 = null;
                                break;
                            }
                            xlb0Var2 = list2.get(i3);
                            if (xlb0Var2.d) {
                                break;
                            }
                            i3++;
                        }
                        xlb0 xlb0Var4 = xlb0Var2;
                        if (xlb0Var4 != null) {
                            ref$LongRef3.element = xlb0Var4.a;
                            ref$LongRef = ref$LongRef3;
                            agoVar.L$0 = eu5Var2;
                            agoVar.L$1 = ref$LongRef;
                            agoVar.label = 1;
                            I1 = eu5Var2.I1(PointerEventPass.Main, agoVar);
                            if (I1 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Ref$LongRef ref$LongRef4 = ref$LongRef;
                            obj = I1;
                            ref$LongRef3 = ref$LongRef4;
                        }
                    }
                    plb0 plb0Var2 = (plb0) obj;
                    List<xlb0> list3 = plb0Var2.a;
                    int size3 = list3.size();
                    int i32 = 0;
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    xlb0 xlb0Var32 = xlb0Var;
                    if (xlb0Var32 == null) {
                        xlb0Var32 = null;
                    }
                }
                if (xlb0Var32 == null || xlb0Var32.c()) {
                    return null;
                }
                return xlb0Var32;
            }
        }
        agoVar = new ago(continuationImpl);
        Object obj2 = agoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agoVar.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v6, types: [xsna.wzs] */
    /* JADX WARN: Type inference failed for: r13v5, types: [xsna.wzs] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0194 -> B:11:0x0196). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(eu5 eu5Var, long j, int i, u05 u05Var, BaseContinuationImpl baseContinuationImpl) {
        bgo bgoVar;
        int i2;
        float k;
        Ref$LongRef ref$LongRef;
        u05 u05Var2;
        idp0 idp0Var;
        eu5 eu5Var2;
        bgo bgoVar2;
        Ref$LongRef ref$LongRef2;
        float f;
        idp0 idp0Var2;
        bgo bgoVar3;
        int size;
        xlb0 xlb0Var;
        int i3;
        xlb0 xlb0Var2;
        xlb0 xlb0Var3;
        xlb0 xlb0Var4;
        Object I1;
        if (baseContinuationImpl instanceof bgo) {
            bgoVar = (bgo) baseContinuationImpl;
            int i4 = bgoVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bgoVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bgoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bgoVar.label;
                int i5 = 1;
                xlb0 xlb0Var5 = null;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    Orientation orientation = Orientation.Horizontal;
                    if (j(eu5Var.z0(), j)) {
                        return null;
                    }
                    k = k(eu5Var.getViewConfiguration(), i);
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    u05Var2 = u05Var;
                    idp0Var = new idp0(0L, orientation);
                    eu5Var2 = eu5Var;
                    bgoVar.L$0 = u05Var2;
                    bgoVar.L$1 = eu5Var2;
                    bgoVar.L$2 = ref$LongRef;
                    bgoVar.L$3 = idp0Var;
                    bgoVar.L$4 = xlb0Var5;
                    bgoVar.F$0 = k;
                    bgoVar.label = i5;
                    I1 = eu5Var2.I1(PointerEventPass.Main, bgoVar);
                    if (I1 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 == 1) {
                    float f2 = bgoVar.F$0;
                    idp0 idp0Var3 = (idp0) bgoVar.L$3;
                    Ref$LongRef ref$LongRef3 = (Ref$LongRef) bgoVar.L$2;
                    eu5 eu5Var3 = (eu5) bgoVar.L$1;
                    ?? r12 = (wzs) bgoVar.L$0;
                    kotlin.a.a(obj);
                    f = f2;
                    eu5Var2 = eu5Var3;
                    bgoVar2 = bgoVar;
                    idp0Var2 = idp0Var3;
                    u05Var2 = r12;
                    ref$LongRef2 = ref$LongRef3;
                    bgoVar3 = bgoVar2;
                    plb0 plb0Var = (plb0) obj;
                    List<xlb0> list = plb0Var.a;
                    size = list.size();
                    xlb0Var = xlb0Var5;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3++;
                    }
                    xlb0Var3 = xlb0Var2;
                    if (xlb0Var3 != null) {
                        return xlb0Var;
                    }
                    if (fdi.o(xlb0Var3)) {
                    }
                    bgoVar.L$0 = u05Var2;
                    bgoVar.L$1 = eu5Var2;
                    bgoVar.L$2 = ref$LongRef;
                    bgoVar.L$3 = idp0Var;
                    bgoVar.L$4 = xlb0Var5;
                    bgoVar.F$0 = k;
                    bgoVar.label = i5;
                    I1 = eu5Var2.I1(PointerEventPass.Main, bgoVar);
                    if (I1 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f3 = bgoVar.F$0;
                xlb0 xlb0Var6 = (xlb0) bgoVar.L$4;
                idp0 idp0Var4 = (idp0) bgoVar.L$3;
                Ref$LongRef ref$LongRef4 = (Ref$LongRef) bgoVar.L$2;
                eu5 eu5Var4 = (eu5) bgoVar.L$1;
                ?? r13 = (wzs) bgoVar.L$0;
                kotlin.a.a(obj);
                f = f3;
                eu5Var2 = eu5Var4;
                ref$LongRef2 = ref$LongRef4;
                bgoVar3 = bgoVar;
                idp0Var2 = idp0Var4;
                char c = 2;
                int i6 = 1;
                xlb0Var = null;
                long j2 = 0;
                u05 u05Var3 = r13;
                if (!xlb0Var6.c()) {
                    return xlb0Var;
                }
                xlb0Var5 = xlb0Var;
                i5 = i6;
                idp0Var = idp0Var2;
                bgoVar = bgoVar3;
                k = f;
                ref$LongRef = ref$LongRef2;
                u05Var2 = u05Var3;
                bgoVar.L$0 = u05Var2;
                bgoVar.L$1 = eu5Var2;
                bgoVar.L$2 = ref$LongRef;
                bgoVar.L$3 = idp0Var;
                bgoVar.L$4 = xlb0Var5;
                bgoVar.F$0 = k;
                bgoVar.label = i5;
                I1 = eu5Var2.I1(PointerEventPass.Main, bgoVar);
                if (I1 != coroutineSingletons) {
                    bgoVar2 = bgoVar;
                    idp0Var2 = idp0Var;
                    obj = I1;
                    ref$LongRef2 = ref$LongRef;
                    f = k;
                    bgoVar3 = bgoVar2;
                    plb0 plb0Var2 = (plb0) obj;
                    List<xlb0> list2 = plb0Var2.a;
                    size = list2.size();
                    xlb0Var = xlb0Var5;
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            xlb0Var2 = xlb0Var;
                            break;
                        }
                        xlb0Var2 = list2.get(i3);
                        if (wlb0.g(xlb0Var2.a, ref$LongRef2.element)) {
                            break;
                        }
                        i3++;
                    }
                    xlb0Var3 = xlb0Var2;
                    if (xlb0Var3 != null || xlb0Var3.c()) {
                        return xlb0Var;
                    }
                    if (fdi.o(xlb0Var3)) {
                        i6 = 1;
                        long a2 = idp0Var2.a(fdi.E(xlb0Var3, true), f, true);
                        if ((9223372034707292159L & a2) != 9205357640488583168L) {
                            u05Var2.invoke(xlb0Var3, new Float(Float.intBitsToFloat((int) (a2 >> 32))));
                            if (xlb0Var3.c()) {
                                return xlb0Var3;
                            }
                            idp0Var2.b = 0L;
                            xlb0Var5 = xlb0Var;
                            i5 = 1;
                            idp0Var = idp0Var2;
                            bgoVar = bgoVar3;
                            k = f;
                            ref$LongRef = ref$LongRef2;
                        } else {
                            j2 = 0;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            bgoVar3.L$0 = u05Var2;
                            bgoVar3.L$1 = eu5Var2;
                            bgoVar3.L$2 = ref$LongRef2;
                            bgoVar3.L$3 = idp0Var2;
                            bgoVar3.L$4 = xlb0Var3;
                            bgoVar3.F$0 = f;
                            c = 2;
                            bgoVar3.label = 2;
                            if (eu5Var2.I1(pointerEventPass, bgoVar3) != coroutineSingletons) {
                                u05Var3 = u05Var2;
                                xlb0Var6 = xlb0Var3;
                                if (!xlb0Var6.c()) {
                                }
                            }
                        }
                    } else {
                        List<xlb0> list3 = plb0Var2.a;
                        int size2 = list3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                xlb0Var4 = xlb0Var;
                                break;
                            }
                            xlb0Var4 = list3.get(i7);
                            if (xlb0Var4.d) {
                                break;
                            }
                            i7++;
                        }
                        xlb0 xlb0Var7 = xlb0Var4;
                        if (xlb0Var7 == null) {
                            return xlb0Var;
                        }
                        ref$LongRef2.element = xlb0Var7.a;
                        xlb0Var5 = xlb0Var;
                        i5 = 1;
                        idp0Var = idp0Var2;
                        bgoVar = bgoVar3;
                        k = f;
                        ref$LongRef = ref$LongRef2;
                    }
                    bgoVar.L$0 = u05Var2;
                    bgoVar.L$1 = eu5Var2;
                    bgoVar.L$2 = ref$LongRef;
                    bgoVar.L$3 = idp0Var;
                    bgoVar.L$4 = xlb0Var5;
                    bgoVar.F$0 = k;
                    bgoVar.label = i5;
                    I1 = eu5Var2.I1(PointerEventPass.Main, bgoVar);
                    if (I1 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        bgoVar = new bgo(baseContinuationImpl);
        Object obj2 = bgoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = bgoVar.label;
        int i52 = 1;
        xlb0 xlb0Var52 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[Catch: PointerEventTimeoutCancellationException -> 0x00b0, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00b0, blocks: (B:11:0x0030, B:12:0x00a3, B:14:0x00a7, B:34:0x0089), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Object, xsna.xlb0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(eu5 eu5Var, long j, BaseContinuationImpl baseContinuationImpl) {
        cgo cgoVar;
        int i;
        xlb0 xlb0Var;
        Ref$BooleanRef ref$BooleanRef;
        xlb0 xlb0Var2;
        try {
            if (baseContinuationImpl instanceof cgo) {
                cgoVar = (cgo) baseContinuationImpl;
                int i2 = cgoVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cgoVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = cgoVar.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cgoVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (!j(eu5Var.z0(), j)) {
                            List<xlb0> list = eu5Var.z0().a;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    xlb0Var = null;
                                    break;
                                }
                                xlb0Var = list.get(i3);
                                if (wlb0.g(xlb0Var.a, j)) {
                                    break;
                                }
                                i3++;
                            }
                            xlb0 xlb0Var3 = xlb0Var;
                            if (xlb0Var3 != 0) {
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                                ref$ObjectRef2.element = xlb0Var3;
                                long c = eu5Var.getViewConfiguration().c();
                                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                                wzs dgoVar = new dgo(ref$BooleanRef2, ref$ObjectRef2, ref$ObjectRef, null);
                                cgoVar.L$0 = xlb0Var3;
                                cgoVar.L$1 = ref$ObjectRef;
                                cgoVar.L$2 = ref$BooleanRef2;
                                cgoVar.label = 1;
                                if (eu5Var.f0(c, dgoVar, cgoVar) == obj2) {
                                    return obj2;
                                }
                                ref$BooleanRef = ref$BooleanRef2;
                                j = ref$ObjectRef;
                                xlb0Var2 = xlb0Var3;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = (Ref$BooleanRef) cgoVar.L$2;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) cgoVar.L$1;
                    xlb0 xlb0Var4 = (xlb0) cgoVar.L$0;
                    kotlin.a.a(obj);
                    j = ref$ObjectRef3;
                    xlb0Var2 = xlb0Var4;
                    if (ref$BooleanRef.element) {
                        xlb0 xlb0Var5 = (xlb0) j.element;
                        return xlb0Var5 == null ? xlb0Var2 : xlb0Var5;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            if (ref$BooleanRef.element) {
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            xlb0 xlb0Var6 = (xlb0) j.element;
            return xlb0Var6 == null ? xlb0Var2 : xlb0Var6;
        }
        cgoVar = new cgo(baseContinuationImpl);
        Object obj3 = cgoVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cgoVar.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v6, types: [xsna.wzs] */
    /* JADX WARN: Type inference failed for: r13v5, types: [xsna.wzs] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0185 -> B:11:0x0187). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(eu5 eu5Var, long j, oa5 oa5Var, BaseContinuationImpl baseContinuationImpl) {
        ego egoVar;
        int i;
        oa5 oa5Var2;
        Ref$LongRef ref$LongRef;
        ego egoVar2;
        float f;
        idp0 idp0Var;
        eu5 eu5Var2;
        Ref$LongRef ref$LongRef2;
        ego egoVar3;
        float f2;
        idp0 idp0Var2;
        int size;
        xlb0 xlb0Var;
        int i2;
        xlb0 xlb0Var2;
        xlb0 xlb0Var3;
        xlb0 xlb0Var4;
        Object I1;
        if (baseContinuationImpl instanceof ego) {
            egoVar = (ego) baseContinuationImpl;
            int i3 = egoVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                egoVar.label = i3 - Integer.MIN_VALUE;
                Object obj = egoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = egoVar.label;
                int i4 = 1;
                xlb0 xlb0Var5 = null;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (j(eu5Var.z0(), j)) {
                        return null;
                    }
                    float e = eu5Var.getViewConfiguration().e();
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.element = j;
                    oa5Var2 = oa5Var;
                    ref$LongRef = ref$LongRef3;
                    egoVar2 = egoVar;
                    f = e;
                    idp0Var = new idp0(0L, (Orientation) null);
                    eu5Var2 = eu5Var;
                    egoVar2.L$0 = oa5Var2;
                    egoVar2.L$1 = eu5Var2;
                    egoVar2.L$2 = ref$LongRef;
                    egoVar2.L$3 = idp0Var;
                    egoVar2.L$4 = xlb0Var5;
                    egoVar2.F$0 = f;
                    egoVar2.label = i4;
                    I1 = eu5Var2.I1(PointerEventPass.Main, egoVar2);
                    if (I1 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    float f3 = egoVar.F$0;
                    idp0 idp0Var3 = (idp0) egoVar.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) egoVar.L$2;
                    eu5 eu5Var3 = (eu5) egoVar.L$1;
                    ?? r12 = (wzs) egoVar.L$0;
                    kotlin.a.a(obj);
                    f2 = f3;
                    eu5Var2 = eu5Var3;
                    egoVar3 = egoVar;
                    idp0Var2 = idp0Var3;
                    oa5Var2 = r12;
                    ref$LongRef2 = ref$LongRef4;
                    plb0 plb0Var = (plb0) obj;
                    List<xlb0> list = plb0Var.a;
                    size = list.size();
                    xlb0Var = xlb0Var5;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    xlb0Var3 = xlb0Var2;
                    if (xlb0Var3 != null) {
                        return xlb0Var;
                    }
                    if (fdi.o(xlb0Var3)) {
                    }
                    egoVar2.L$0 = oa5Var2;
                    egoVar2.L$1 = eu5Var2;
                    egoVar2.L$2 = ref$LongRef;
                    egoVar2.L$3 = idp0Var;
                    egoVar2.L$4 = xlb0Var5;
                    egoVar2.F$0 = f;
                    egoVar2.label = i4;
                    I1 = eu5Var2.I1(PointerEventPass.Main, egoVar2);
                    if (I1 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = egoVar.F$0;
                xlb0 xlb0Var6 = (xlb0) egoVar.L$4;
                idp0 idp0Var4 = (idp0) egoVar.L$3;
                Ref$LongRef ref$LongRef5 = (Ref$LongRef) egoVar.L$2;
                eu5 eu5Var4 = (eu5) egoVar.L$1;
                ?? r13 = (wzs) egoVar.L$0;
                kotlin.a.a(obj);
                f2 = f4;
                eu5Var2 = eu5Var4;
                ref$LongRef2 = ref$LongRef5;
                egoVar3 = egoVar;
                idp0Var2 = idp0Var4;
                char c = 2;
                int i5 = 1;
                xlb0Var = null;
                long j2 = 0;
                oa5 oa5Var3 = r13;
                if (!xlb0Var6.c()) {
                    return xlb0Var;
                }
                xlb0Var5 = xlb0Var;
                i4 = i5;
                idp0Var = idp0Var2;
                f = f2;
                egoVar2 = egoVar3;
                ref$LongRef = ref$LongRef2;
                oa5Var2 = oa5Var3;
                egoVar2.L$0 = oa5Var2;
                egoVar2.L$1 = eu5Var2;
                egoVar2.L$2 = ref$LongRef;
                egoVar2.L$3 = idp0Var;
                egoVar2.L$4 = xlb0Var5;
                egoVar2.F$0 = f;
                egoVar2.label = i4;
                I1 = eu5Var2.I1(PointerEventPass.Main, egoVar2);
                if (I1 != coroutineSingletons) {
                    float f5 = f;
                    idp0Var2 = idp0Var;
                    obj = I1;
                    ref$LongRef2 = ref$LongRef;
                    egoVar3 = egoVar2;
                    f2 = f5;
                    plb0 plb0Var2 = (plb0) obj;
                    List<xlb0> list2 = plb0Var2.a;
                    size = list2.size();
                    xlb0Var = xlb0Var5;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            xlb0Var2 = xlb0Var;
                            break;
                        }
                        xlb0Var2 = list2.get(i2);
                        if (wlb0.g(xlb0Var2.a, ref$LongRef2.element)) {
                            break;
                        }
                        i2++;
                    }
                    xlb0Var3 = xlb0Var2;
                    if (xlb0Var3 != null || xlb0Var3.c()) {
                        return xlb0Var;
                    }
                    if (fdi.o(xlb0Var3)) {
                        i5 = 1;
                        long a2 = idp0Var2.a(fdi.E(xlb0Var3, true), f2, true);
                        if ((9223372034707292159L & a2) != 9205357640488583168L) {
                            oa5Var2.invoke(xlb0Var3, new ov70(a2));
                            if (xlb0Var3.c()) {
                                return xlb0Var3;
                            }
                            idp0Var2.b = 0L;
                            xlb0Var5 = xlb0Var;
                            i4 = 1;
                            idp0Var = idp0Var2;
                            f = f2;
                            egoVar2 = egoVar3;
                            ref$LongRef = ref$LongRef2;
                        } else {
                            j2 = 0;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            egoVar3.L$0 = oa5Var2;
                            egoVar3.L$1 = eu5Var2;
                            egoVar3.L$2 = ref$LongRef2;
                            egoVar3.L$3 = idp0Var2;
                            egoVar3.L$4 = xlb0Var3;
                            egoVar3.F$0 = f2;
                            c = 2;
                            egoVar3.label = 2;
                            if (eu5Var2.I1(pointerEventPass, egoVar3) != coroutineSingletons) {
                                oa5Var3 = oa5Var2;
                                xlb0Var6 = xlb0Var3;
                                if (!xlb0Var6.c()) {
                                }
                            }
                        }
                    } else {
                        List<xlb0> list3 = plb0Var2.a;
                        int size2 = list3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                xlb0Var4 = xlb0Var;
                                break;
                            }
                            xlb0Var4 = list3.get(i6);
                            if (xlb0Var4.d) {
                                break;
                            }
                            i6++;
                        }
                        xlb0 xlb0Var7 = xlb0Var4;
                        if (xlb0Var7 == null) {
                            return xlb0Var;
                        }
                        ref$LongRef2.element = xlb0Var7.a;
                        xlb0Var5 = xlb0Var;
                        i4 = 1;
                        idp0Var = idp0Var2;
                        f = f2;
                        egoVar2 = egoVar3;
                        ref$LongRef = ref$LongRef2;
                    }
                    egoVar2.L$0 = oa5Var2;
                    egoVar2.L$1 = eu5Var2;
                    egoVar2.L$2 = ref$LongRef;
                    egoVar2.L$3 = idp0Var;
                    egoVar2.L$4 = xlb0Var5;
                    egoVar2.F$0 = f;
                    egoVar2.label = i4;
                    I1 = eu5Var2.I1(PointerEventPass.Main, egoVar2);
                    if (I1 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        egoVar = new ego(baseContinuationImpl);
        Object obj2 = egoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = egoVar.label;
        int i42 = 1;
        xlb0 xlb0Var52 = null;
        if (i != 0) {
        }
    }

    public static final Object f(dmb0 dmb0Var, izs<? super ov70, s3q0> izsVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, wzs<? super xlb0, ? super ov70, s3q0> wzsVar, spj<? super s3q0> spjVar) {
        Object c = d7s.c(dmb0Var, new fgo(new e20(11), null, new l87(izsVar, 1), wzsVar, gzsVar2, new yfo(0, gzsVar), null), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c != coroutineSingletons) {
            c = s3q0.a;
        }
        return c == coroutineSingletons ? c : s3q0.a;
    }

    public static /* synthetic */ Object g(dmb0 dmb0Var, eb50 eb50Var, gzs gzsVar, wzs wzsVar, spj spjVar, int i) {
        izs izsVar = eb50Var;
        if ((i & 1) != 0) {
            izsVar = new com.vk.movika.sdk.base.utils.b(23);
        }
        izs izsVar2 = izsVar;
        if ((i & 2) != 0) {
            gzsVar = new wb1(11);
        }
        return f(dmb0Var, izsVar2, gzsVar, new dv2(14), wzsVar, spjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0046 -> B:10:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(eu5 eu5Var, long j, izs izsVar, BaseContinuationImpl baseContinuationImpl) {
        igo igoVar;
        int i;
        xlb0 xlb0Var;
        if (baseContinuationImpl instanceof igo) {
            igoVar = (igo) baseContinuationImpl;
            int i2 = igoVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                igoVar.label = i2 - Integer.MIN_VALUE;
                Object obj = igoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = igoVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    igoVar.L$0 = eu5Var;
                    igoVar.L$1 = izsVar;
                    igoVar.label = 1;
                    obj = b(eu5Var, j, igoVar);
                    if (obj == coroutineSingletons) {
                    }
                    xlb0Var = (xlb0) obj;
                    if (xlb0Var == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    izs izsVar2 = (izs) igoVar.L$1;
                    eu5 eu5Var2 = (eu5) igoVar.L$0;
                    kotlin.a.a(obj);
                    izsVar = izsVar2;
                    eu5Var = eu5Var2;
                    xlb0Var = (xlb0) obj;
                    if (xlb0Var == null) {
                        if (fdi.o(xlb0Var)) {
                            return Boolean.TRUE;
                        }
                        izsVar.invoke(xlb0Var);
                        j = xlb0Var.a;
                        igoVar.L$0 = eu5Var;
                        igoVar.L$1 = izsVar;
                        igoVar.label = 1;
                        obj = b(eu5Var, j, igoVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        xlb0Var = (xlb0) obj;
                        if (xlb0Var == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        igoVar = new igo(baseContinuationImpl);
        Object obj2 = igoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = igoVar.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
    
        if (r0 == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(eu5 eu5Var, long j, izs izsVar, BaseContinuationImpl baseContinuationImpl) {
        jgo jgoVar;
        int i;
        long j2;
        Orientation orientation;
        jgo jgoVar2;
        eu5 eu5Var2;
        izs izsVar2;
        int i2;
        xlb0 xlb0Var;
        Orientation orientation2;
        eu5 eu5Var3;
        Ref$LongRef ref$LongRef;
        Object I1;
        eu5 eu5Var4;
        xlb0 xlb0Var2;
        float intBitsToFloat;
        xlb0 xlb0Var3;
        if (baseContinuationImpl instanceof jgo) {
            jgoVar = (jgo) baseContinuationImpl;
            int i3 = jgoVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jgoVar.label = i3 - Integer.MIN_VALUE;
                Object obj = jgoVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jgoVar.label;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$LongRef = (Ref$LongRef) jgoVar.L$4;
                    eu5Var3 = (eu5) jgoVar.L$3;
                    orientation2 = (Orientation) jgoVar.L$2;
                    eu5 eu5Var5 = (eu5) jgoVar.L$1;
                    izs izsVar3 = (izs) jgoVar.L$0;
                    kotlin.a.a(obj);
                    jgo jgoVar3 = jgoVar;
                    izsVar2 = izsVar3;
                    plb0 plb0Var = (plb0) obj;
                    List<xlb0> list = plb0Var.a;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            eu5Var4 = eu5Var3;
                            xlb0Var2 = null;
                            break;
                        }
                        xlb0Var2 = list.get(i5);
                        eu5Var4 = eu5Var3;
                        if (wlb0.g(xlb0Var2.a, ref$LongRef.element)) {
                            break;
                        }
                        i5++;
                        eu5Var3 = eu5Var4;
                    }
                    xlb0 xlb0Var4 = xlb0Var2;
                    if (xlb0Var4 == null) {
                        if (fdi.o(xlb0Var4)) {
                            List<xlb0> list2 = plb0Var.a;
                            int size2 = list2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    xlb0Var3 = null;
                                    break;
                                }
                                xlb0Var3 = list2.get(i6);
                                if (xlb0Var3.d) {
                                    break;
                                }
                                i6++;
                            }
                            xlb0 xlb0Var5 = xlb0Var3;
                            if (xlb0Var5 != null) {
                                ref$LongRef.element = xlb0Var5.a;
                                i2 = 1;
                            }
                        } else {
                            i2 = 1;
                            long E = fdi.E(xlb0Var4, true);
                            if (orientation2 != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? E & 4294967295L : E >> 32));
                            } else {
                                intBitsToFloat = ov70.d(E);
                            }
                        }
                        eu5Var3 = eu5Var4;
                        eu5Var2 = eu5Var5;
                        jgoVar2 = jgoVar3;
                        i4 = i2;
                        jgoVar2.L$0 = izsVar2;
                        jgoVar2.L$1 = eu5Var2;
                        jgoVar2.L$2 = orientation2;
                        jgoVar2.L$3 = eu5Var3;
                        jgoVar2.L$4 = ref$LongRef;
                        jgoVar2.label = i4;
                        I1 = eu5Var3.I1(PointerEventPass.Main, jgoVar2);
                        if (I1 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        jgo jgoVar4 = jgoVar2;
                        eu5Var5 = eu5Var2;
                        obj = I1;
                        jgoVar3 = jgoVar4;
                        plb0 plb0Var2 = (plb0) obj;
                        List<xlb0> list3 = plb0Var2.a;
                        int size3 = list3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52++;
                            eu5Var3 = eu5Var4;
                        }
                        xlb0 xlb0Var42 = xlb0Var2;
                        if (xlb0Var42 == null) {
                            xlb0Var42 = null;
                        }
                    }
                    i2 = 1;
                    if (xlb0Var42 != null && !xlb0Var42.c()) {
                        if (fdi.o(xlb0Var42)) {
                            xlb0Var = xlb0Var42;
                            return Boolean.valueOf(xlb0Var != null ? i2 : 0);
                        }
                        izsVar2.invoke(xlb0Var42);
                        orientation = orientation2;
                        j2 = xlb0Var42.a;
                        eu5Var2 = eu5Var5;
                        jgoVar2 = jgoVar3;
                        i4 = i2;
                        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                        ref$LongRef2.element = j2;
                        eu5Var3 = eu5Var2;
                        orientation2 = orientation;
                        ref$LongRef = ref$LongRef2;
                        jgoVar2.L$0 = izsVar2;
                        jgoVar2.L$1 = eu5Var2;
                        jgoVar2.L$2 = orientation2;
                        jgoVar2.L$3 = eu5Var3;
                        jgoVar2.L$4 = ref$LongRef;
                        jgoVar2.label = i4;
                        I1 = eu5Var3.I1(PointerEventPass.Main, jgoVar2);
                        if (I1 == coroutineSingletons) {
                        }
                    }
                    xlb0Var = null;
                    return Boolean.valueOf(xlb0Var != null ? i2 : 0);
                }
                kotlin.a.a(obj);
                Orientation orientation3 = Orientation.Horizontal;
                j2 = j;
                if (j(eu5Var.z0(), j2)) {
                    i2 = 1;
                    xlb0Var = null;
                    return Boolean.valueOf(xlb0Var != null ? i2 : 0);
                }
                orientation = orientation3;
                jgoVar2 = jgoVar;
                eu5Var2 = eu5Var;
                izsVar2 = izsVar;
                Ref$LongRef ref$LongRef22 = new Ref$LongRef();
                ref$LongRef22.element = j2;
                eu5Var3 = eu5Var2;
                orientation2 = orientation;
                ref$LongRef = ref$LongRef22;
                jgoVar2.L$0 = izsVar2;
                jgoVar2.L$1 = eu5Var2;
                jgoVar2.L$2 = orientation2;
                jgoVar2.L$3 = eu5Var3;
                jgoVar2.L$4 = ref$LongRef;
                jgoVar2.label = i4;
                I1 = eu5Var3.I1(PointerEventPass.Main, jgoVar2);
                if (I1 == coroutineSingletons) {
                }
            }
        }
        jgoVar = new jgo(baseContinuationImpl);
        Object obj2 = jgoVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jgoVar.label;
        int i42 = 1;
        if (i == 0) {
        }
    }

    public static final boolean j(plb0 plb0Var, long j) {
        xlb0 xlb0Var;
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                xlb0Var = null;
                break;
            }
            xlb0Var = list.get(i);
            if (wlb0.g(xlb0Var.a, j)) {
                break;
            }
            i++;
        }
        xlb0 xlb0Var2 = xlb0Var;
        if (xlb0Var2 != null && xlb0Var2.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float k(rut0 rut0Var, int i) {
        return i == 2 ? rut0Var.e() * a : rut0Var.e();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x05a6 -> B:56:0x05ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0248 -> B:138:0x0249). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x02da -> B:138:0x0249). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x0335 -> B:139:0x039c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0387 -> B:135:0x0391). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0624 -> B:12:0x0627). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0427 -> B:76:0x03d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x046f -> B:58:0x0484). Please report as a decompilation issue!!! */
    public static final java.lang.Object l(xsna.eu5 r26, xsna.xlb0 r27, xsna.gzs r28, androidx.compose.foundation.gestures.Orientation r29, xsna.yzs r30, xsna.wzs r31, xsna.gzs r32, xsna.izs r33, kotlin.coroutines.jvm.internal.BaseContinuationImpl r34) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.lgo.l(xsna.eu5, xsna.xlb0, xsna.gzs, androidx.compose.foundation.gestures.Orientation, xsna.yzs, xsna.wzs, xsna.gzs, xsna.izs, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
