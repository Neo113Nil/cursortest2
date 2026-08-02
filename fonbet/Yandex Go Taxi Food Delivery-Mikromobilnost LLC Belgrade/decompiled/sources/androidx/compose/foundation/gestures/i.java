package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import defpackage.acj;
import defpackage.c0m;
import defpackage.e3o0;
import defpackage.ey91;
import defpackage.gzz0;
import defpackage.hwd0;
import defpackage.ic0;
import defpackage.kx91;
import defpackage.loj;
import defpackage.mj1;
import defpackage.ny61;
import defpackage.o9m;
import defpackage.pa6;
import defpackage.sls;
import defpackage.tls;
import defpackage.tvd0;
import defpackage.wg0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.xp31;
import defpackage.zls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class i {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(androidx.compose.ui.input.pointer.f fVar, zvd0 zvd0Var, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        int i;
        Ref$LongRef ref$LongRef;
        gzz0 gzz0Var;
        int i2;
        PointerEventPass pointerEventPass2;
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
        float f;
        androidx.compose.ui.input.pointer.f fVar2;
        Object a2;
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
        Object obj;
        int i3;
        int size;
        int i4;
        Object obj2;
        zvd0 zvd0Var2;
        int size2;
        int i5;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) {
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = (DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) baseContinuationImpl;
            int i6 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label = i6 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
                int i7 = 1;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.F$0;
                    int i8 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.I$0;
                    gzz0 gzz0Var2 = (gzz0) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$3;
                    Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$2;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$1;
                    androidx.compose.ui.input.pointer.f fVar3 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$0;
                    kotlin.b.b(obj3);
                    DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$14 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                    f = f2;
                    fVar2 = fVar3;
                    Ref$LongRef ref$LongRef3 = ref$LongRef2;
                    gzz0Var = gzz0Var2;
                    DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$14;
                    List list = ((tvd0) obj3).a;
                    int size3 = list.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size3) {
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15;
                            obj = null;
                            break;
                        }
                        obj = list.get(i9);
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15;
                        if (ey91.e(((zvd0) obj).a, ref$LongRef3.element)) {
                            break;
                        }
                        i9++;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
                    }
                    zvd0 zvd0Var3 = (zvd0) obj;
                    if (zvd0Var3 != null || kx91.d(zvd0Var3)) {
                        i3 = 1;
                        size = list.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i4);
                            if (((zvd0) obj2).d) {
                                break;
                            }
                            i4++;
                        }
                        zvd0Var2 = (zvd0) obj2;
                        if (zvd0Var2 != null) {
                            return Boolean.valueOf(i8 != 0);
                        }
                        ref$LongRef3.element = zvd0Var2.a;
                    } else {
                        i3 = 1;
                        if ((gzz0Var.a(f, kx91.g(zvd0Var3, true), true) & 9223372034707292159L) != 9205357640488583168L) {
                            i2 = 1;
                            size2 = list.size();
                            for (i5 = 0; i5 < size2; i5++) {
                                if (((zvd0) list.get(i5)).d) {
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
                                    pointerEventPass2 = pointerEventPass3;
                                    ref$LongRef = ref$LongRef3;
                                    i7 = i3;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = fVar2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = ref$LongRef;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = gzz0Var;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = i7;
                                    a2 = fVar2.a(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                                    if (a2 != coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    Ref$LongRef ref$LongRef4 = ref$LongRef;
                                    pointerEventPass3 = pointerEventPass2;
                                    obj3 = a2;
                                    ref$LongRef3 = ref$LongRef4;
                                    int i10 = i2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
                                    i8 = i10;
                                    List list2 = ((tvd0) obj3).a;
                                    int size32 = list2.size();
                                    int i92 = 0;
                                    while (true) {
                                        if (i92 < size32) {
                                        }
                                        i92++;
                                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
                                    }
                                    zvd0 zvd0Var32 = (zvd0) obj;
                                    if (zvd0Var32 != null) {
                                    }
                                    i3 = 1;
                                    size = list2.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size) {
                                        }
                                        i4++;
                                    }
                                    zvd0Var2 = (zvd0) obj2;
                                    if (zvd0Var2 != null) {
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
                kotlin.b.b(obj3);
                if (c.d(fVar)) {
                    return Boolean.FALSE;
                }
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = zvd0Var.a;
                float n = n(fVar.g(), zvd0Var.i);
                ref$LongRef = ref$LongRef5;
                gzz0Var = new gzz0((Orientation) null, 3);
                i2 = 0;
                pointerEventPass2 = pointerEventPass;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                f = n;
                fVar2 = fVar;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = fVar2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = gzz0Var;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = i7;
                a2 = fVar2.a(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                if (a2 != coroutineSingletons) {
                }
            }
        }
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = new DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(baseContinuationImpl);
        Object obj32 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
        int i72 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        if (defpackage.kx91.h(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0060 -> B:10:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(androidx.compose.ui.input.pointer.f fVar, long j, ContinuationImpl continuationImpl) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        androidx.compose.ui.input.pointer.f fVar2;
        Ref$LongRef ref$LongRef;
        Object a2;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuationImpl;
            int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    fVar2 = fVar;
                    if (!m(fVar2.y.x, j)) {
                        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                        ref$LongRef2.element = j;
                        ref$LongRef = ref$LongRef2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = fVar2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                        a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                        if (a2 != coroutineSingletons) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$LongRef = (Ref$LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                androidx.compose.ui.input.pointer.f fVar3 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                kotlin.b.b(obj3);
                tvd0 tvd0Var = (tvd0) obj3;
                List list = tvd0Var.a;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (ey91.e(((zvd0) obj).a, ref$LongRef.element)) {
                        break;
                    }
                    i4++;
                }
                zvd0 zvd0Var = (zvd0) obj;
                if (zvd0Var == null) {
                    if (kx91.d(zvd0Var)) {
                        List list2 = tvd0Var.a;
                        int size2 = list2.size();
                        while (true) {
                            if (i3 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i3);
                            if (((zvd0) obj2).d) {
                                break;
                            }
                            i3++;
                        }
                        zvd0 zvd0Var2 = (zvd0) obj2;
                        if (zvd0Var2 != null) {
                            ref$LongRef.element = zvd0Var2.a;
                            fVar2 = fVar3;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = fVar2;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                            a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                            if (a2 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            androidx.compose.ui.input.pointer.f fVar4 = fVar2;
                            obj3 = a2;
                            fVar3 = fVar4;
                        }
                    }
                    tvd0 tvd0Var2 = (tvd0) obj3;
                    List list3 = tvd0Var2.a;
                    int size3 = list3.size();
                    int i32 = 0;
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    zvd0 zvd0Var3 = (zvd0) obj;
                    if (zvd0Var3 == null) {
                        zvd0Var3 = null;
                    }
                }
                if (zvd0Var3 == null || zvd0Var3.j()) {
                    return null;
                }
                return zvd0Var3;
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuationImpl);
        Object obj32 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b3, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0178 -> B:11:0x017f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(androidx.compose.ui.input.pointer.f fVar, long j, int i, o9m o9mVar, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        androidx.compose.ui.input.pointer.f fVar2;
        float n;
        Ref$LongRef ref$LongRef;
        gzz0 gzz0Var;
        wls wlsVar;
        Object obj;
        Object obj2;
        int i3;
        long j2;
        char c;
        gzz0 gzz0Var2;
        zvd0 zvd0Var;
        Ref$LongRef ref$LongRef2;
        androidx.compose.ui.input.pointer.f fVar3;
        Object obj3;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) baseContinuationImpl;
            int i4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
                Object obj4 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                Object obj5 = null;
                if (i2 != 0) {
                    kotlin.b.b(obj4);
                    Orientation orientation = Orientation.Horizontal;
                    fVar2 = fVar;
                    if (m(fVar2.y.x, j)) {
                        return null;
                    }
                    n = n(fVar2.g(), i);
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    gzz0Var = new gzz0(0L, orientation);
                    wlsVar = o9mVar;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = n;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    obj4 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
                } else if (i2 == 1) {
                    float f = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    gzz0Var = (gzz0) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    androidx.compose.ui.input.pointer.f fVar4 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    wls wlsVar2 = (wls) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    kotlin.b.b(obj4);
                    n = f;
                    wlsVar = wlsVar2;
                    ref$LongRef = ref$LongRef3;
                    fVar2 = fVar4;
                    tvd0 tvd0Var = (tvd0) obj4;
                    List list = tvd0Var.a;
                    int size = list.size();
                    obj = obj5;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            obj2 = obj;
                            break;
                        }
                        obj2 = list.get(i6);
                        if (ey91.e(((zvd0) obj2).a, ref$LongRef.element)) {
                            break;
                        }
                        i6++;
                    }
                    zvd0 zvd0Var2 = (zvd0) obj2;
                    if (zvd0Var2 == null || zvd0Var2.j()) {
                        return obj;
                    }
                    if (kx91.d(zvd0Var2)) {
                        List list2 = tvd0Var.a;
                        int size2 = list2.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                obj3 = obj;
                                break;
                            }
                            obj3 = list2.get(i7);
                            if (((zvd0) obj3).d) {
                                break;
                            }
                            i7++;
                        }
                        zvd0 zvd0Var3 = (zvd0) obj3;
                        if (zvd0Var3 == null) {
                            return obj;
                        }
                        ref$LongRef.element = zvd0Var3.a;
                        obj5 = obj;
                        i5 = 1;
                    } else {
                        i3 = 1;
                        long a2 = gzz0Var.a(n, kx91.g(zvd0Var2, true), true);
                        if ((9223372034707292159L & a2) == 9205357640488583168L) {
                            j2 = 0;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = wlsVar;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = fVar2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = zvd0Var2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = n;
                            c = 2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = 2;
                            if (fVar2.a(pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) != coroutineSingletons) {
                                androidx.compose.ui.input.pointer.f fVar5 = fVar2;
                                gzz0Var2 = gzz0Var;
                                zvd0Var = zvd0Var2;
                                ref$LongRef2 = ref$LongRef;
                                fVar3 = fVar5;
                                if (!zvd0Var.j()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        wlsVar.invoke(zvd0Var2, new Float(Float.intBitsToFloat((int) (a2 >> 32))));
                        if (zvd0Var2.j()) {
                            return zvd0Var2;
                        }
                        gzz0Var.b = 0L;
                        obj5 = obj;
                        i5 = 1;
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = n;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    obj4 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
                } else {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    zvd0Var = (zvd0) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
                    gzz0Var2 = (gzz0) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    fVar3 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    wls wlsVar3 = (wls) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    kotlin.b.b(obj4);
                    c = 2;
                    i3 = 1;
                    obj = null;
                    j2 = 0;
                    ref$LongRef2 = ref$LongRef4;
                    n = f2;
                    wlsVar = wlsVar3;
                    if (!zvd0Var.j()) {
                        return obj;
                    }
                    obj5 = obj;
                    i5 = i3;
                    gzz0Var = gzz0Var2;
                    fVar2 = fVar3;
                    ref$LongRef = ref$LongRef2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = n;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    obj4 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(baseContinuationImpl);
        Object obj42 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        Object obj52 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5 A[Catch: PointerEventTimeoutCancellationException -> 0x00ae, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00ae, blocks: (B:11:0x0030, B:12:0x00a1, B:14:0x00a5, B:34:0x0087), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Object, zvd0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(androidx.compose.ui.input.pointer.f fVar, long j, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        Object obj;
        Ref$BooleanRef ref$BooleanRef;
        zvd0 zvd0Var;
        try {
            if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) baseContinuationImpl;
                int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        if (!m(fVar.y.x, j)) {
                            List list = fVar.y.x.a;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i3);
                                if (ey91.e(((zvd0) obj).a, j)) {
                                    break;
                                }
                                i3++;
                            }
                            ?? r11 = (zvd0) obj;
                            if (r11 != 0) {
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                                ref$ObjectRef2.element = r11;
                                long f = fVar.g().f();
                                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                                wls dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(ref$BooleanRef2, ref$ObjectRef2, ref$ObjectRef, null);
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = r11;
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = ref$ObjectRef;
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = ref$BooleanRef2;
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                                if (fVar.o(f, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == obj3) {
                                    return obj3;
                                }
                                ref$BooleanRef = ref$BooleanRef2;
                                j = ref$ObjectRef;
                                zvd0Var = r11;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$BooleanRef = (Ref$BooleanRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    zvd0 zvd0Var2 = (zvd0) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    kotlin.b.b(obj2);
                    j = ref$ObjectRef3;
                    zvd0Var = zvd0Var2;
                    if (ref$BooleanRef.element) {
                        zvd0 zvd0Var3 = (zvd0) j.element;
                        return zvd0Var3 == null ? zvd0Var : zvd0Var3;
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
            zvd0 zvd0Var4 = (zvd0) j.element;
            return zvd0Var4 == null ? zvd0Var : zvd0Var4;
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(baseContinuationImpl);
        Object obj22 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0175 -> B:11:0x017b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(androidx.compose.ui.input.pointer.f fVar, long j, e3o0 e3o0Var, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        androidx.compose.ui.input.pointer.f fVar2;
        float c;
        Ref$LongRef ref$LongRef;
        gzz0 gzz0Var;
        wls wlsVar;
        Ref$LongRef ref$LongRef2;
        androidx.compose.ui.input.pointer.f fVar3;
        Ref$LongRef ref$LongRef3;
        int size;
        Object obj;
        int i2;
        Object obj2;
        zvd0 zvd0Var;
        Object obj3;
        Object a2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) baseContinuationImpl;
            int i3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i3 - Integer.MIN_VALUE;
                Object obj4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
                int i4 = 1;
                Object obj5 = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    fVar2 = fVar;
                    if (m(fVar2.y.x, j)) {
                        return null;
                    }
                    c = fVar2.g().c();
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    gzz0Var = new gzz0(0L, (Orientation) null);
                    wlsVar = e3o0Var;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = c;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                    a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                    if (a2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    float f = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                    gzz0Var = (gzz0) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                    fVar3 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                    wls wlsVar2 = (wls) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                    kotlin.b.b(obj4);
                    ref$LongRef2 = ref$LongRef4;
                    c = f;
                    wlsVar = wlsVar2;
                    ref$LongRef3 = ref$LongRef2;
                    tvd0 tvd0Var = (tvd0) obj4;
                    List list = tvd0Var.a;
                    size = list.size();
                    obj = obj5;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    zvd0Var = (zvd0) obj2;
                    if (zvd0Var != null) {
                        return obj;
                    }
                    if (kx91.d(zvd0Var)) {
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = c;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                    a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                    if (a2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                zvd0 zvd0Var2 = (zvd0) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                gzz0 gzz0Var2 = (gzz0) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                Ref$LongRef ref$LongRef5 = (Ref$LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                androidx.compose.ui.input.pointer.f fVar4 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                wls wlsVar3 = (wls) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                kotlin.b.b(obj4);
                ref$LongRef3 = ref$LongRef5;
                fVar3 = fVar4;
                char c2 = 2;
                int i5 = 1;
                obj = null;
                long j2 = 0;
                float f3 = f2;
                wlsVar = wlsVar3;
                if (!zvd0Var2.j()) {
                    return obj;
                }
                obj5 = obj;
                i4 = i5;
                gzz0Var = gzz0Var2;
                c = f3;
                fVar2 = fVar3;
                ref$LongRef = ref$LongRef3;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = wlsVar;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = fVar2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = gzz0Var;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = obj5;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = c;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                if (a2 != coroutineSingletons) {
                    ref$LongRef2 = ref$LongRef;
                    fVar3 = fVar2;
                    obj4 = a2;
                    ref$LongRef3 = ref$LongRef2;
                    tvd0 tvd0Var2 = (tvd0) obj4;
                    List list2 = tvd0Var2.a;
                    size = list2.size();
                    obj = obj5;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj2 = obj;
                            break;
                        }
                        obj2 = list2.get(i2);
                        if (ey91.e(((zvd0) obj2).a, ref$LongRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    zvd0Var = (zvd0) obj2;
                    if (zvd0Var != null || zvd0Var.j()) {
                        return obj;
                    }
                    if (kx91.d(zvd0Var)) {
                        i5 = 1;
                        long a3 = gzz0Var.a(c, kx91.g(zvd0Var, true), true);
                        if ((9223372034707292159L & a3) != 9205357640488583168L) {
                            wlsVar.invoke(zvd0Var, new wu60(a3));
                            if (zvd0Var.j()) {
                                return zvd0Var;
                            }
                            gzz0Var.b = 0L;
                            obj5 = obj;
                            i4 = 1;
                            fVar2 = fVar3;
                            ref$LongRef = ref$LongRef3;
                        } else {
                            j2 = 0;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = wlsVar;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = fVar3;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef3;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = gzz0Var;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = zvd0Var;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = c;
                            c2 = 2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = 2;
                            if (fVar3.a(pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1) != coroutineSingletons) {
                                float f4 = c;
                                gzz0Var2 = gzz0Var;
                                zvd0Var2 = zvd0Var;
                                f3 = f4;
                                if (!zvd0Var2.j()) {
                                }
                            }
                        }
                    } else {
                        List list3 = tvd0Var2.a;
                        int size2 = list3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj3 = obj;
                                break;
                            }
                            obj3 = list3.get(i6);
                            if (((zvd0) obj3).d) {
                                break;
                            }
                            i6++;
                        }
                        zvd0 zvd0Var3 = (zvd0) obj3;
                        if (zvd0Var3 == null) {
                            return obj;
                        }
                        ref$LongRef3.element = zvd0Var3.a;
                        obj5 = obj;
                        i4 = 1;
                        fVar2 = fVar3;
                        ref$LongRef = ref$LongRef3;
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = c;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                    a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                    if (a2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(baseContinuationImpl);
        Object obj42 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i42 = 1;
        Object obj52 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b3, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017b -> B:11:0x0182). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(androidx.compose.ui.input.pointer.f fVar, long j, int i, o9m o9mVar, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        androidx.compose.ui.input.pointer.f fVar2;
        float n;
        Ref$LongRef ref$LongRef;
        gzz0 gzz0Var;
        wls wlsVar;
        Object obj;
        Object obj2;
        int i3;
        long j2;
        char c;
        gzz0 gzz0Var2;
        zvd0 zvd0Var;
        Ref$LongRef ref$LongRef2;
        androidx.compose.ui.input.pointer.f fVar3;
        Object obj3;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) baseContinuationImpl;
            int i4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i4 - Integer.MIN_VALUE;
                Object obj4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                Object obj5 = null;
                if (i2 != 0) {
                    kotlin.b.b(obj4);
                    Orientation orientation = Orientation.Vertical;
                    fVar2 = fVar;
                    if (m(fVar2.y.x, j)) {
                        return null;
                    }
                    n = n(fVar2.g(), i);
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    gzz0Var = new gzz0(0L, orientation);
                    wlsVar = o9mVar;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = n;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    obj4 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
                } else if (i2 == 1) {
                    float f = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    gzz0Var = (gzz0) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef3 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    androidx.compose.ui.input.pointer.f fVar4 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    wls wlsVar2 = (wls) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    kotlin.b.b(obj4);
                    n = f;
                    wlsVar = wlsVar2;
                    ref$LongRef = ref$LongRef3;
                    fVar2 = fVar4;
                    tvd0 tvd0Var = (tvd0) obj4;
                    List list = tvd0Var.a;
                    int size = list.size();
                    obj = obj5;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            obj2 = obj;
                            break;
                        }
                        obj2 = list.get(i6);
                        if (ey91.e(((zvd0) obj2).a, ref$LongRef.element)) {
                            break;
                        }
                        i6++;
                    }
                    zvd0 zvd0Var2 = (zvd0) obj2;
                    if (zvd0Var2 == null || zvd0Var2.j()) {
                        return obj;
                    }
                    if (kx91.d(zvd0Var2)) {
                        List list2 = tvd0Var.a;
                        int size2 = list2.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                obj3 = obj;
                                break;
                            }
                            obj3 = list2.get(i7);
                            if (((zvd0) obj3).d) {
                                break;
                            }
                            i7++;
                        }
                        zvd0 zvd0Var3 = (zvd0) obj3;
                        if (zvd0Var3 == null) {
                            return obj;
                        }
                        ref$LongRef.element = zvd0Var3.a;
                        obj5 = obj;
                        i5 = 1;
                    } else {
                        i3 = 1;
                        long a2 = gzz0Var.a(n, kx91.g(zvd0Var2, true), true);
                        if ((9223372034707292159L & a2) == 9205357640488583168L) {
                            j2 = 0;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = wlsVar;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = fVar2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = zvd0Var2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = n;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 2;
                            if (fVar2.a(pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) != coroutineSingletons) {
                                androidx.compose.ui.input.pointer.f fVar5 = fVar2;
                                gzz0Var2 = gzz0Var;
                                zvd0Var = zvd0Var2;
                                ref$LongRef2 = ref$LongRef;
                                fVar3 = fVar5;
                                if (!zvd0Var.j()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        wlsVar.invoke(zvd0Var2, new Float(Float.intBitsToFloat((int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                        if (zvd0Var2.j()) {
                            return zvd0Var2;
                        }
                        gzz0Var.b = 0L;
                        obj5 = obj;
                        i5 = 1;
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = n;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    obj4 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
                } else {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    zvd0Var = (zvd0) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                    gzz0Var2 = (gzz0) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    fVar3 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    wls wlsVar3 = (wls) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    kotlin.b.b(obj4);
                    c = 2;
                    i3 = 1;
                    obj = null;
                    j2 = 0;
                    ref$LongRef2 = ref$LongRef4;
                    n = f2;
                    wlsVar = wlsVar3;
                    if (!zvd0Var.j()) {
                        return obj;
                    }
                    obj5 = obj;
                    i5 = i3;
                    gzz0Var = gzz0Var2;
                    fVar2 = fVar3;
                    ref$LongRef = ref$LongRef2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = wlsVar;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = fVar2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = gzz0Var;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = obj5;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = n;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    obj4 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(baseContinuationImpl);
        Object obj42 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        Object obj52 = null;
        if (i2 != 0) {
        }
    }

    public static final Object g(hwd0 hwd0Var, tls tlsVar, sls slsVar, sls slsVar2, wls wlsVar, Continuation continuation) {
        Object l = c.l(hwd0Var, new DragGestureDetectorKt$detectDragGestures$13(new acj(28), null, new wg0(16, tlsVar), wlsVar, slsVar2, new ic0(18, slsVar), null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (l != coroutineSingletons) {
            l = zy11Var;
        }
        return l == coroutineSingletons ? l : zy11Var;
    }

    public static /* synthetic */ Object h(hwd0 hwd0Var, pa6 pa6Var, com.yandex.go.ai_widget.ui.component.c cVar, wls wlsVar, Continuation continuation, int i) {
        int i2 = 2;
        tls tlsVar = pa6Var;
        if ((i & 1) != 0) {
            tlsVar = new c0m(i2);
        }
        tls tlsVar2 = tlsVar;
        sls slsVar = cVar;
        if ((i & 2) != 0) {
            slsVar = new acj(29);
        }
        return g(hwd0Var, tlsVar2, slsVar, new acj(29), wlsVar, continuation);
    }

    public static final Object i(hwd0 hwd0Var, tls tlsVar, sls slsVar, sls slsVar2, wls wlsVar, Continuation continuation) {
        Object l = c.l(hwd0Var, new DragGestureDetectorKt$detectHorizontalDragGestures$5(tlsVar, wlsVar, slsVar, slsVar2, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }

    public static Object j(hwd0 hwd0Var, loj lojVar, Continuation continuation) {
        Object l = c.l(hwd0Var, new DragGestureDetectorKt$detectVerticalDragGestures$5(new c0m(2), lojVar, new acj(29), new acj(29), null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0045 -> B:10:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(androidx.compose.ui.input.pointer.f fVar, long j, tls tlsVar, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        zvd0 zvd0Var;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) baseContinuationImpl;
            int i2 = dragGestureDetectorKt$drag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dragGestureDetectorKt$drag$1.L$0 = fVar;
                    dragGestureDetectorKt$drag$1.L$1 = tlsVar;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = b(fVar, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutineSingletons) {
                    }
                    zvd0Var = (zvd0) obj;
                    if (zvd0Var == null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tls tlsVar2 = (tls) dragGestureDetectorKt$drag$1.L$1;
                    androidx.compose.ui.input.pointer.f fVar2 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$drag$1.L$0;
                    kotlin.b.b(obj);
                    tlsVar = tlsVar2;
                    fVar = fVar2;
                    zvd0Var = (zvd0) obj;
                    if (zvd0Var == null) {
                        if (kx91.d(zvd0Var)) {
                            return Boolean.TRUE;
                        }
                        tlsVar.invoke(zvd0Var);
                        j = zvd0Var.a;
                        dragGestureDetectorKt$drag$1.L$0 = fVar;
                        dragGestureDetectorKt$drag$1.L$1 = tlsVar;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = b(fVar, j, dragGestureDetectorKt$drag$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        zvd0Var = (zvd0) obj;
                        if (zvd0Var == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(baseContinuationImpl);
        Object obj2 = dragGestureDetectorKt$drag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$drag$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        if (r0 == 0.0f) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [tls] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0080 -> B:10:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(androidx.compose.ui.input.pointer.f fVar, long j, mj1 mj1Var, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        androidx.compose.ui.input.pointer.f fVar2;
        long j2;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        Orientation orientation;
        mj1 mj1Var2;
        int i2;
        Ref$LongRef ref$LongRef;
        Orientation orientation2;
        androidx.compose.ui.input.pointer.f fVar3;
        Object a2;
        androidx.compose.ui.input.pointer.f fVar4;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) baseContinuationImpl;
            int i3 = dragGestureDetectorKt$horizontalDrag$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$horizontalDrag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                zvd0 zvd0Var = null;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$horizontalDrag$1.L$4;
                    fVar3 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$horizontalDrag$1.L$3;
                    orientation2 = (Orientation) dragGestureDetectorKt$horizontalDrag$1.L$2;
                    androidx.compose.ui.input.pointer.f fVar5 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$horizontalDrag$1.L$1;
                    tls tlsVar = (tls) dragGestureDetectorKt$horizontalDrag$1.L$0;
                    kotlin.b.b(obj3);
                    Ref$LongRef ref$LongRef3 = ref$LongRef2;
                    fVar2 = fVar5;
                    ?? r10 = tlsVar;
                    tvd0 tvd0Var = (tvd0) obj3;
                    List list = tvd0Var.a;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            fVar4 = fVar3;
                            obj = null;
                            break;
                        }
                        obj = list.get(i5);
                        fVar4 = fVar3;
                        if (ey91.e(((zvd0) obj).a, ref$LongRef3.element)) {
                            break;
                        }
                        i5++;
                        fVar3 = fVar4;
                    }
                    zvd0 zvd0Var2 = (zvd0) obj;
                    if (zvd0Var2 == null) {
                        if (kx91.d(zvd0Var2)) {
                            List list2 = tvd0Var.a;
                            int size2 = list2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list2.get(i6);
                                if (((zvd0) obj2).d) {
                                    break;
                                }
                                i6++;
                            }
                            zvd0 zvd0Var3 = (zvd0) obj2;
                            if (zvd0Var3 != null) {
                                ref$LongRef3.element = zvd0Var3.a;
                                i2 = 1;
                            }
                        } else {
                            i2 = 1;
                            long g = kx91.g(zvd0Var2, true);
                            if (orientation2 != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : g >> 32));
                            } else {
                                intBitsToFloat = wu60.d(g);
                            }
                        }
                        fVar3 = fVar4;
                        mj1Var2 = r10;
                        i4 = i2;
                        ref$LongRef = ref$LongRef3;
                        dragGestureDetectorKt$horizontalDrag$1.L$0 = mj1Var2;
                        dragGestureDetectorKt$horizontalDrag$1.L$1 = fVar2;
                        dragGestureDetectorKt$horizontalDrag$1.L$2 = orientation2;
                        dragGestureDetectorKt$horizontalDrag$1.L$3 = fVar3;
                        dragGestureDetectorKt$horizontalDrag$1.L$4 = ref$LongRef;
                        dragGestureDetectorKt$horizontalDrag$1.label = i4;
                        a2 = fVar3.a(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$1);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Ref$LongRef ref$LongRef4 = ref$LongRef;
                        r10 = mj1Var2;
                        obj3 = a2;
                        ref$LongRef3 = ref$LongRef4;
                        tvd0 tvd0Var2 = (tvd0) obj3;
                        List list3 = tvd0Var2.a;
                        int size3 = list3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52++;
                            fVar3 = fVar4;
                        }
                        zvd0 zvd0Var22 = (zvd0) obj;
                        if (zvd0Var22 == null) {
                            zvd0Var22 = null;
                        }
                    }
                    i2 = 1;
                    if (zvd0Var22 == null || zvd0Var22.j()) {
                        zvd0Var = null;
                    } else if (kx91.d(zvd0Var22)) {
                        zvd0Var = zvd0Var22;
                    } else {
                        r10.invoke(zvd0Var22);
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        orientation = orientation2;
                        mj1Var2 = r10;
                        i4 = i2;
                        j2 = zvd0Var22.a;
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = j2;
                        orientation2 = orientation;
                        dragGestureDetectorKt$horizontalDrag$1 = dragGestureDetectorKt$horizontalDrag$12;
                        fVar3 = fVar2;
                        dragGestureDetectorKt$horizontalDrag$1.L$0 = mj1Var2;
                        dragGestureDetectorKt$horizontalDrag$1.L$1 = fVar2;
                        dragGestureDetectorKt$horizontalDrag$1.L$2 = orientation2;
                        dragGestureDetectorKt$horizontalDrag$1.L$3 = fVar3;
                        dragGestureDetectorKt$horizontalDrag$1.L$4 = ref$LongRef;
                        dragGestureDetectorKt$horizontalDrag$1.label = i4;
                        a2 = fVar3.a(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$1);
                        if (a2 == coroutineSingletons) {
                        }
                    }
                    return Boolean.valueOf((boolean) (zvd0Var == null ? i2 : 0));
                }
                kotlin.b.b(obj3);
                Orientation orientation3 = Orientation.Horizontal;
                fVar2 = fVar;
                j2 = j;
                if (m(fVar2.y.x, j2)) {
                    i2 = 1;
                    return Boolean.valueOf((boolean) (zvd0Var == null ? i2 : 0));
                }
                dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                orientation = orientation3;
                mj1Var2 = mj1Var;
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = j2;
                orientation2 = orientation;
                dragGestureDetectorKt$horizontalDrag$1 = dragGestureDetectorKt$horizontalDrag$12;
                fVar3 = fVar2;
                dragGestureDetectorKt$horizontalDrag$1.L$0 = mj1Var2;
                dragGestureDetectorKt$horizontalDrag$1.L$1 = fVar2;
                dragGestureDetectorKt$horizontalDrag$1.L$2 = orientation2;
                dragGestureDetectorKt$horizontalDrag$1.L$3 = fVar3;
                dragGestureDetectorKt$horizontalDrag$1.L$4 = ref$LongRef;
                dragGestureDetectorKt$horizontalDrag$1.label = i4;
                a2 = fVar3.a(PointerEventPass.Main, dragGestureDetectorKt$horizontalDrag$1);
                if (a2 == coroutineSingletons) {
                }
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(baseContinuationImpl);
        Object obj32 = dragGestureDetectorKt$horizontalDrag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        zvd0 zvd0Var4 = null;
        int i42 = 1;
        if (i == 0) {
        }
    }

    public static final boolean m(tvd0 tvd0Var, long j) {
        Object obj;
        List list = tvd0Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ey91.e(((zvd0) obj).a, j)) {
                break;
            }
            i++;
        }
        zvd0 zvd0Var = (zvd0) obj;
        if (zvd0Var != null && zvd0Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float n(xp31 xp31Var, int i) {
        return i == 2 ? xp31Var.c() * a : xp31Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x05eb, code lost:
    
        if (m(r10.y.x, r0) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0692, code lost:
    
        if (defpackage.wu60.d(defpackage.kx91.g(r11, true)) == 0.0f) goto L199;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:55:0x0686, B:42:0x065e], limit reached: 225 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x042d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x064e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x05a1 -> B:56:0x05a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0247 -> B:138:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x02d7 -> B:138:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x0332 -> B:139:0x0399). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0384 -> B:135:0x038e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x061d -> B:12:0x0620). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0424 -> B:76:0x03d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x046c -> B:58:0x0481). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(androidx.compose.ui.input.pointer.f fVar, zvd0 zvd0Var, sls slsVar, Orientation orientation, zls zlsVar, wls wlsVar, sls slsVar2, tls tlsVar, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$1;
        long j;
        long j2;
        zvd0 zvd0Var2;
        tls tlsVar2;
        Orientation orientation2;
        sls slsVar3;
        zls zlsVar2;
        wls wlsVar2;
        androidx.compose.ui.input.pointer.f fVar2;
        boolean z;
        zvd0 zvd0Var3;
        Ref$LongRef ref$LongRef;
        CoroutineSingletons coroutineSingletons;
        float f;
        zvd0 zvd0Var4;
        Orientation orientation3;
        Ref$LongRef ref$LongRef2;
        gzz0 gzz0Var;
        Ref$LongRef ref$LongRef3;
        androidx.compose.ui.input.pointer.f fVar3;
        int size;
        int i;
        tls tlsVar3;
        sls slsVar4;
        wls wlsVar3;
        zvd0 zvd0Var5;
        zvd0 zvd0Var6;
        zvd0 zvd0Var7;
        androidx.compose.ui.input.pointer.f fVar4;
        tls tlsVar4;
        gzz0 gzz0Var2;
        Object obj;
        int i2;
        Object a2;
        long j3;
        Ref$LongRef ref$LongRef4;
        zvd0 zvd0Var8;
        zvd0 zvd0Var9;
        tls tlsVar5;
        sls slsVar5;
        wls wlsVar4;
        zls zlsVar3;
        Orientation orientation4;
        androidx.compose.ui.input.pointer.f fVar5;
        Ref$LongRef ref$LongRef5;
        gzz0 gzz0Var3;
        int size2;
        int i3;
        int size3;
        int i4;
        float n;
        androidx.compose.ui.input.pointer.f fVar6;
        long j4;
        zvd0 zvd0Var10;
        tls tlsVar6;
        zvd0 zvd0Var11;
        zvd0 zvd0Var12;
        Object obj2;
        int i5;
        List list;
        int i6;
        Object a3;
        zvd0 zvd0Var13;
        DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$12;
        zvd0 zvd0Var14;
        Object obj3;
        List list2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$processDragGesture$1) {
            dragGestureDetectorKt$processDragGesture$1 = (DragGestureDetectorKt$processDragGesture$1) baseContinuationImpl;
            int i7 = dragGestureDetectorKt$processDragGesture$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$processDragGesture$1.label = i7 - Integer.MIN_VALUE;
                Object obj4 = dragGestureDetectorKt$processDragGesture$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (dragGestureDetectorKt$processDragGesture$1.label) {
                    case 0:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        kotlin.b.b(obj4);
                        boolean booleanValue = ((Boolean) slsVar.invoke()).booleanValue();
                        if (!booleanValue) {
                            zvd0Var.a();
                        }
                        dragGestureDetectorKt$processDragGesture$1.L$0 = fVar;
                        dragGestureDetectorKt$processDragGesture$1.L$1 = zvd0Var;
                        dragGestureDetectorKt$processDragGesture$1.L$2 = orientation;
                        dragGestureDetectorKt$processDragGesture$1.L$3 = zlsVar;
                        dragGestureDetectorKt$processDragGesture$1.L$4 = wlsVar;
                        dragGestureDetectorKt$processDragGesture$1.L$5 = slsVar2;
                        dragGestureDetectorKt$processDragGesture$1.L$6 = tlsVar;
                        dragGestureDetectorKt$processDragGesture$1.Z$0 = booleanValue;
                        dragGestureDetectorKt$processDragGesture$1.label = 1;
                        Object b = z.b(fVar, null, dragGestureDetectorKt$processDragGesture$1, 2);
                        if (b != coroutineSingletons2) {
                            zvd0Var2 = zvd0Var;
                            tlsVar2 = tlsVar;
                            orientation2 = orientation;
                            slsVar3 = slsVar2;
                            zlsVar2 = zlsVar;
                            wlsVar2 = wlsVar;
                            fVar2 = fVar;
                            z = booleanValue;
                            obj4 = b;
                            zvd0Var3 = (zvd0) obj4;
                            ref$LongRef = new Ref$LongRef();
                            ref$LongRef.element = 0L;
                            if (!z) {
                                coroutineSingletons = coroutineSingletons2;
                                if (zvd0Var2 == null) {
                                    List list3 = fVar2.y.x.a;
                                    int size4 = list3.size();
                                    for (int i8 = 0; i8 < size4; i8++) {
                                        if (((zvd0) list3.get(i8)).d) {
                                            ref$LongRef4 = ref$LongRef;
                                            fVar5 = fVar2;
                                            orientation4 = orientation2;
                                            wlsVar4 = wlsVar2;
                                            tlsVar5 = tlsVar2;
                                            zvd0Var8 = zvd0Var2;
                                            zlsVar3 = zlsVar2;
                                            slsVar5 = slsVar3;
                                            zvd0Var9 = zvd0Var3;
                                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                                            dragGestureDetectorKt$processDragGesture$1.L$0 = fVar5;
                                            dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                                            dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar3;
                                            dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar4;
                                            dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar5;
                                            dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar5;
                                            dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var9;
                                            dragGestureDetectorKt$processDragGesture$1.L$7 = zvd0Var8;
                                            dragGestureDetectorKt$processDragGesture$1.L$8 = ref$LongRef4;
                                            dragGestureDetectorKt$processDragGesture$1.L$9 = null;
                                            dragGestureDetectorKt$processDragGesture$1.L$10 = null;
                                            dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                            dragGestureDetectorKt$processDragGesture$1.label = 4;
                                            obj4 = fVar5.a(pointerEventPass, dragGestureDetectorKt$processDragGesture$1);
                                            if (obj4 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            List list4 = ((tvd0) obj4).a;
                                            size2 = list4.size();
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < size2) {
                                                    if (((zvd0) list4.get(i3)).j()) {
                                                        int size5 = list4.size();
                                                        for (int i9 = 0; i9 < size5; i9++) {
                                                            if (!((zvd0) list4.get(i9)).d) {
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            }
                                            size3 = list4.size();
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= size3) {
                                                    zvd0Var3 = zvd0Var9;
                                                    slsVar3 = slsVar5;
                                                    zlsVar2 = zlsVar3;
                                                    zvd0Var2 = zvd0Var8;
                                                    tlsVar2 = tlsVar5;
                                                    wlsVar2 = wlsVar4;
                                                    orientation2 = orientation4;
                                                    fVar2 = fVar5;
                                                    ref$LongRef = ref$LongRef4;
                                                } else if (((zvd0) list4.get(i4)).d) {
                                                    zvd0 zvd0Var15 = (zvd0) kotlin.collections.a.R(list4);
                                                    long e = wu60.e(zvd0Var15 != null ? zvd0Var15.c : 0L, zvd0Var9.c);
                                                    long j5 = zvd0Var9.a;
                                                    int i10 = zvd0Var9.i;
                                                    if (!m(fVar5.y.x, j5)) {
                                                        n = n(fVar5.g(), i10);
                                                        ref$LongRef5 = new Ref$LongRef();
                                                        ref$LongRef5.element = j5;
                                                        gzz0Var3 = new gzz0(e, orientation4);
                                                        fVar6 = fVar5;
                                                        break;
                                                    } else {
                                                        zvd0Var3 = zvd0Var9;
                                                        tlsVar2 = tlsVar5;
                                                        slsVar3 = slsVar5;
                                                        wlsVar2 = wlsVar4;
                                                        zlsVar2 = zlsVar3;
                                                        orientation2 = orientation4;
                                                        fVar2 = fVar5;
                                                        zvd0Var2 = null;
                                                        ref$LongRef = ref$LongRef4;
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                            if (zvd0Var2 == null) {
                                            }
                                        }
                                    }
                                }
                                if (zvd0Var2 != null) {
                                    zlsVar2.invoke(zvd0Var3, zvd0Var2, new wu60(ref$LongRef.element));
                                    wlsVar2.invoke(zvd0Var2, new wu60(ref$LongRef.element));
                                    j4 = zvd0Var2.a;
                                    break;
                                }
                                return zy11.a;
                            }
                            j3 = zvd0Var3.a;
                            int i11 = zvd0Var3.i;
                            if (m(fVar2.y.x, j3)) {
                                coroutineSingletons = coroutineSingletons2;
                                zvd0Var6 = null;
                                if (zvd0Var6 != null || zvd0Var6.j()) {
                                    zvd0Var2 = zvd0Var6;
                                    if (zvd0Var2 == null) {
                                    }
                                    if (zvd0Var2 != null) {
                                    }
                                    return zy11.a;
                                }
                                coroutineSingletons2 = coroutineSingletons;
                                j3 = zvd0Var3.a;
                                int i112 = zvd0Var3.i;
                                if (m(fVar2.y.x, j3)) {
                                    f = n(fVar2.g(), i112);
                                    ref$LongRef3 = new Ref$LongRef();
                                    ref$LongRef3.element = j3;
                                    gzz0Var2 = new gzz0(0L, orientation2);
                                    ref$LongRef2 = ref$LongRef;
                                    fVar3 = fVar2;
                                    dragGestureDetectorKt$processDragGesture$1.L$0 = fVar3;
                                    dragGestureDetectorKt$processDragGesture$1.L$1 = orientation2;
                                    dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar2;
                                    dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar2;
                                    dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar3;
                                    dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar2;
                                    dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var3;
                                    dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef2;
                                    dragGestureDetectorKt$processDragGesture$1.L$8 = fVar2;
                                    dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef3;
                                    dragGestureDetectorKt$processDragGesture$1.L$10 = gzz0Var2;
                                    dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                    dragGestureDetectorKt$processDragGesture$1.F$0 = f;
                                    dragGestureDetectorKt$processDragGesture$1.label = 2;
                                    a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                                    if (a2 != coroutineSingletons2) {
                                        Orientation orientation5 = orientation2;
                                        zvd0Var4 = zvd0Var3;
                                        obj4 = a2;
                                        gzz0Var = gzz0Var2;
                                        orientation3 = orientation5;
                                        tvd0 tvd0Var = (tvd0) obj4;
                                        List list5 = tvd0Var.a;
                                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                        size = list5.size();
                                        androidx.compose.ui.input.pointer.f fVar7 = fVar2;
                                        i = 0;
                                        while (true) {
                                            if (i >= size) {
                                                zvd0Var5 = list5.get(i);
                                                i2 = size;
                                                tlsVar3 = tlsVar2;
                                                slsVar4 = slsVar3;
                                                wlsVar3 = wlsVar2;
                                                if (!ey91.e(((zvd0) zvd0Var5).a, ref$LongRef3.element)) {
                                                    i++;
                                                    size = i2;
                                                    tlsVar2 = tlsVar3;
                                                    slsVar3 = slsVar4;
                                                    wlsVar2 = wlsVar3;
                                                }
                                            } else {
                                                tlsVar3 = tlsVar2;
                                                slsVar4 = slsVar3;
                                                wlsVar3 = wlsVar2;
                                                zvd0Var5 = 0;
                                            }
                                        }
                                        zvd0Var6 = zvd0Var5;
                                        if (zvd0Var6 != null && !zvd0Var6.j()) {
                                            if (kx91.d(zvd0Var6)) {
                                                long a4 = gzz0Var.a(f, kx91.g(zvd0Var6, true), true);
                                                if ((a4 & j2) != j) {
                                                    zvd0Var6.a();
                                                    ref$LongRef2.element = a4;
                                                    if (zvd0Var6.j()) {
                                                        tlsVar2 = tlsVar3;
                                                        slsVar3 = slsVar4;
                                                        wlsVar2 = wlsVar3;
                                                        zvd0Var3 = zvd0Var4;
                                                        fVar2 = fVar3;
                                                        ref$LongRef = ref$LongRef2;
                                                        orientation2 = orientation3;
                                                        coroutineSingletons = coroutineSingletons3;
                                                        if (zvd0Var6 != null) {
                                                        }
                                                        zvd0Var2 = zvd0Var6;
                                                        if (zvd0Var2 == null) {
                                                        }
                                                        if (zvd0Var2 != null) {
                                                        }
                                                        return zy11.a;
                                                    }
                                                    gzz0Var.b = 0L;
                                                    tlsVar2 = tlsVar3;
                                                    slsVar3 = slsVar4;
                                                    wlsVar2 = wlsVar3;
                                                    zvd0Var3 = zvd0Var4;
                                                    orientation2 = orientation3;
                                                    gzz0Var2 = gzz0Var;
                                                    fVar2 = fVar7;
                                                    coroutineSingletons2 = coroutineSingletons3;
                                                } else {
                                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                                    dragGestureDetectorKt$processDragGesture$1.L$0 = fVar3;
                                                    dragGestureDetectorKt$processDragGesture$1.L$1 = orientation3;
                                                    dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar2;
                                                    wlsVar2 = wlsVar3;
                                                    dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar2;
                                                    sls slsVar6 = slsVar4;
                                                    dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar6;
                                                    tls tlsVar7 = tlsVar3;
                                                    dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar7;
                                                    dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var4;
                                                    dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef2;
                                                    dragGestureDetectorKt$processDragGesture$1.L$8 = fVar7;
                                                    dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef3;
                                                    dragGestureDetectorKt$processDragGesture$1.L$10 = gzz0Var;
                                                    dragGestureDetectorKt$processDragGesture$1.L$11 = zvd0Var6;
                                                    dragGestureDetectorKt$processDragGesture$1.F$0 = f;
                                                    dragGestureDetectorKt$processDragGesture$1.label = 3;
                                                    coroutineSingletons = coroutineSingletons3;
                                                    if (fVar7.a(pointerEventPass2, dragGestureDetectorKt$processDragGesture$1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    zvd0Var7 = zvd0Var6;
                                                    fVar4 = fVar3;
                                                    tlsVar4 = tlsVar7;
                                                    fVar2 = fVar7;
                                                    slsVar3 = slsVar6;
                                                    zvd0Var3 = zvd0Var4;
                                                    orientation2 = orientation3;
                                                    gzz0Var2 = gzz0Var;
                                                    if (!zvd0Var7.j()) {
                                                        fVar2 = fVar4;
                                                        tlsVar2 = tlsVar4;
                                                        ref$LongRef = ref$LongRef2;
                                                        zvd0Var6 = null;
                                                        if (zvd0Var6 != null) {
                                                        }
                                                        zvd0Var2 = zvd0Var6;
                                                        if (zvd0Var2 == null) {
                                                        }
                                                        if (zvd0Var2 != null) {
                                                        }
                                                        return zy11.a;
                                                    }
                                                    tlsVar2 = tlsVar4;
                                                    fVar3 = fVar4;
                                                    coroutineSingletons2 = coroutineSingletons;
                                                }
                                            } else {
                                                List list6 = tvd0Var.a;
                                                int size6 = list6.size();
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 < size6) {
                                                        obj = list6.get(i12);
                                                        if (!((zvd0) obj).d) {
                                                            i12++;
                                                        }
                                                    } else {
                                                        obj = null;
                                                    }
                                                }
                                                zvd0 zvd0Var16 = (zvd0) obj;
                                                if (zvd0Var16 != null) {
                                                    ref$LongRef3.element = zvd0Var16.a;
                                                    tlsVar2 = tlsVar3;
                                                    slsVar3 = slsVar4;
                                                    wlsVar2 = wlsVar3;
                                                    zvd0Var3 = zvd0Var4;
                                                    orientation2 = orientation3;
                                                    gzz0Var2 = gzz0Var;
                                                    fVar2 = fVar7;
                                                    coroutineSingletons2 = coroutineSingletons3;
                                                }
                                            }
                                            dragGestureDetectorKt$processDragGesture$1.L$0 = fVar3;
                                            dragGestureDetectorKt$processDragGesture$1.L$1 = orientation2;
                                            dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar2;
                                            dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar2;
                                            dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar3;
                                            dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar2;
                                            dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var3;
                                            dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef2;
                                            dragGestureDetectorKt$processDragGesture$1.L$8 = fVar2;
                                            dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef3;
                                            dragGestureDetectorKt$processDragGesture$1.L$10 = gzz0Var2;
                                            dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                            dragGestureDetectorKt$processDragGesture$1.F$0 = f;
                                            dragGestureDetectorKt$processDragGesture$1.label = 2;
                                            a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                                            if (a2 != coroutineSingletons2) {
                                            }
                                        }
                                        tlsVar2 = tlsVar3;
                                        slsVar3 = slsVar4;
                                        wlsVar2 = wlsVar3;
                                        zvd0Var3 = zvd0Var4;
                                        fVar2 = fVar3;
                                        ref$LongRef = ref$LongRef2;
                                        orientation2 = orientation3;
                                        coroutineSingletons = coroutineSingletons3;
                                        zvd0Var6 = null;
                                        if (zvd0Var6 != null) {
                                        }
                                        zvd0Var2 = zvd0Var6;
                                        if (zvd0Var2 == null) {
                                        }
                                        if (zvd0Var2 != null) {
                                        }
                                        return zy11.a;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons2;
                    case 1:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        z = dragGestureDetectorKt$processDragGesture$1.Z$0;
                        tlsVar2 = (tls) dragGestureDetectorKt$processDragGesture$1.L$6;
                        slsVar3 = (sls) dragGestureDetectorKt$processDragGesture$1.L$5;
                        wlsVar2 = (wls) dragGestureDetectorKt$processDragGesture$1.L$4;
                        zlsVar2 = (zls) dragGestureDetectorKt$processDragGesture$1.L$3;
                        orientation2 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$2;
                        zvd0Var2 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$1;
                        fVar2 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$0;
                        kotlin.b.b(obj4);
                        zvd0Var3 = (zvd0) obj4;
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = 0L;
                        if (!z) {
                        }
                        j3 = zvd0Var3.a;
                        int i1122 = zvd0Var3.i;
                        if (m(fVar2.y.x, j3)) {
                        }
                        break;
                    case 2:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        f = dragGestureDetectorKt$processDragGesture$1.F$0;
                        gzz0 gzz0Var4 = (gzz0) dragGestureDetectorKt$processDragGesture$1.L$10;
                        Ref$LongRef ref$LongRef6 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                        androidx.compose.ui.input.pointer.f fVar8 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$8;
                        Ref$LongRef ref$LongRef7 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                        zvd0Var4 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$6;
                        tls tlsVar8 = (tls) dragGestureDetectorKt$processDragGesture$1.L$5;
                        sls slsVar7 = (sls) dragGestureDetectorKt$processDragGesture$1.L$4;
                        wls wlsVar5 = (wls) dragGestureDetectorKt$processDragGesture$1.L$3;
                        zls zlsVar4 = (zls) dragGestureDetectorKt$processDragGesture$1.L$2;
                        orientation3 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar9 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$0;
                        kotlin.b.b(obj4);
                        ref$LongRef2 = ref$LongRef7;
                        zlsVar2 = zlsVar4;
                        gzz0Var = gzz0Var4;
                        tlsVar2 = tlsVar8;
                        ref$LongRef3 = ref$LongRef6;
                        slsVar3 = slsVar7;
                        fVar2 = fVar8;
                        wlsVar2 = wlsVar5;
                        fVar3 = fVar9;
                        tvd0 tvd0Var2 = (tvd0) obj4;
                        List list52 = tvd0Var2.a;
                        CoroutineSingletons coroutineSingletons32 = coroutineSingletons2;
                        size = list52.size();
                        androidx.compose.ui.input.pointer.f fVar72 = fVar2;
                        i = 0;
                        while (true) {
                            if (i >= size) {
                            }
                            i++;
                            size = i2;
                            tlsVar2 = tlsVar3;
                            slsVar3 = slsVar4;
                            wlsVar2 = wlsVar3;
                        }
                        zvd0Var6 = zvd0Var5;
                        if (zvd0Var6 != null) {
                            if (kx91.d(zvd0Var6)) {
                            }
                            dragGestureDetectorKt$processDragGesture$1.L$0 = fVar3;
                            dragGestureDetectorKt$processDragGesture$1.L$1 = orientation2;
                            dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar2;
                            dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar2;
                            dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar3;
                            dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar2;
                            dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var3;
                            dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef2;
                            dragGestureDetectorKt$processDragGesture$1.L$8 = fVar2;
                            dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef3;
                            dragGestureDetectorKt$processDragGesture$1.L$10 = gzz0Var2;
                            dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                            dragGestureDetectorKt$processDragGesture$1.F$0 = f;
                            dragGestureDetectorKt$processDragGesture$1.label = 2;
                            a2 = fVar2.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                            if (a2 != coroutineSingletons2) {
                            }
                            return coroutineSingletons2;
                        }
                        tlsVar2 = tlsVar3;
                        slsVar3 = slsVar4;
                        wlsVar2 = wlsVar3;
                        zvd0Var3 = zvd0Var4;
                        fVar2 = fVar3;
                        ref$LongRef = ref$LongRef2;
                        orientation2 = orientation3;
                        coroutineSingletons = coroutineSingletons32;
                        zvd0Var6 = null;
                        if (zvd0Var6 != null) {
                        }
                        zvd0Var2 = zvd0Var6;
                        if (zvd0Var2 == null) {
                        }
                        if (zvd0Var2 != null) {
                        }
                        return zy11.a;
                    case 3:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        f = dragGestureDetectorKt$processDragGesture$1.F$0;
                        zvd0Var7 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$11;
                        gzz0 gzz0Var5 = (gzz0) dragGestureDetectorKt$processDragGesture$1.L$10;
                        Ref$LongRef ref$LongRef8 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                        androidx.compose.ui.input.pointer.f fVar10 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$8;
                        Ref$LongRef ref$LongRef9 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                        zvd0 zvd0Var17 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$6;
                        tlsVar4 = (tls) dragGestureDetectorKt$processDragGesture$1.L$5;
                        sls slsVar8 = (sls) dragGestureDetectorKt$processDragGesture$1.L$4;
                        wls wlsVar6 = (wls) dragGestureDetectorKt$processDragGesture$1.L$3;
                        zls zlsVar5 = (zls) dragGestureDetectorKt$processDragGesture$1.L$2;
                        Orientation orientation6 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar11 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$0;
                        kotlin.b.b(obj4);
                        coroutineSingletons = coroutineSingletons2;
                        fVar4 = fVar11;
                        slsVar3 = slsVar8;
                        ref$LongRef2 = ref$LongRef9;
                        ref$LongRef3 = ref$LongRef8;
                        zlsVar2 = zlsVar5;
                        gzz0Var2 = gzz0Var5;
                        wlsVar2 = wlsVar6;
                        zvd0Var3 = zvd0Var17;
                        fVar2 = fVar10;
                        orientation2 = orientation6;
                        if (!zvd0Var7.j()) {
                        }
                        break;
                    case 4:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        ref$LongRef4 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$8;
                        zvd0Var8 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$7;
                        zvd0Var9 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$6;
                        tlsVar5 = (tls) dragGestureDetectorKt$processDragGesture$1.L$5;
                        slsVar5 = (sls) dragGestureDetectorKt$processDragGesture$1.L$4;
                        wlsVar4 = (wls) dragGestureDetectorKt$processDragGesture$1.L$3;
                        zlsVar3 = (zls) dragGestureDetectorKt$processDragGesture$1.L$2;
                        orientation4 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                        fVar5 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$0;
                        kotlin.b.b(obj4);
                        coroutineSingletons = coroutineSingletons2;
                        List list42 = ((tvd0) obj4).a;
                        size2 = list42.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                            }
                            i3++;
                        }
                        size3 = list42.size();
                        i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                            }
                            i4++;
                        }
                        if (zvd0Var2 == null) {
                        }
                        if (zvd0Var2 != null) {
                        }
                        return zy11.a;
                    case 5:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        float f2 = dragGestureDetectorKt$processDragGesture$1.F$0;
                        gzz0 gzz0Var6 = (gzz0) dragGestureDetectorKt$processDragGesture$1.L$10;
                        Ref$LongRef ref$LongRef10 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                        androidx.compose.ui.input.pointer.f fVar12 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$8;
                        Ref$LongRef ref$LongRef11 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                        zvd0 zvd0Var18 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$6;
                        tls tlsVar9 = (tls) dragGestureDetectorKt$processDragGesture$1.L$5;
                        sls slsVar9 = (sls) dragGestureDetectorKt$processDragGesture$1.L$4;
                        wls wlsVar7 = (wls) dragGestureDetectorKt$processDragGesture$1.L$3;
                        zls zlsVar6 = (zls) dragGestureDetectorKt$processDragGesture$1.L$2;
                        Orientation orientation7 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar13 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$0;
                        kotlin.b.b(obj4);
                        ref$LongRef5 = ref$LongRef10;
                        zvd0Var9 = zvd0Var18;
                        wlsVar4 = wlsVar7;
                        fVar5 = fVar12;
                        tlsVar5 = tlsVar9;
                        zlsVar3 = zlsVar6;
                        gzz0Var3 = gzz0Var6;
                        androidx.compose.ui.input.pointer.f fVar14 = fVar13;
                        coroutineSingletons = coroutineSingletons2;
                        DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$13 = dragGestureDetectorKt$processDragGesture$1;
                        float f3 = f2;
                        ref$LongRef4 = ref$LongRef11;
                        slsVar5 = slsVar9;
                        orientation4 = orientation7;
                        tvd0 tvd0Var3 = (tvd0) obj4;
                        List list7 = tvd0Var3.a;
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                        int size7 = list7.size();
                        androidx.compose.ui.input.pointer.f fVar15 = fVar5;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size7) {
                                zvd0Var11 = list7.get(i13);
                                i5 = i13;
                                list = list7;
                                i6 = size7;
                                zvd0Var10 = zvd0Var9;
                                tlsVar6 = tlsVar5;
                                if (!ey91.e(((zvd0) zvd0Var11).a, ref$LongRef5.element)) {
                                    i13 = i5 + 1;
                                    zvd0Var9 = zvd0Var10;
                                    size7 = i6;
                                    tlsVar5 = tlsVar6;
                                    list7 = list;
                                }
                            } else {
                                zvd0Var10 = zvd0Var9;
                                tlsVar6 = tlsVar5;
                                zvd0Var11 = 0;
                            }
                        }
                        zvd0 zvd0Var19 = zvd0Var11;
                        if (zvd0Var19 != null && !zvd0Var19.j()) {
                            if (kx91.d(zvd0Var19)) {
                                List list8 = tvd0Var3.a;
                                int size8 = list8.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size8) {
                                        obj2 = list8.get(i14);
                                        if (!((zvd0) obj2).d) {
                                            i14++;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                zvd0 zvd0Var20 = (zvd0) obj2;
                                if (zvd0Var20 != null) {
                                    ref$LongRef5.element = zvd0Var20.a;
                                    tlsVar5 = tlsVar6;
                                    n = f3;
                                    dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                                    fVar6 = fVar14;
                                    zvd0Var9 = zvd0Var10;
                                    fVar5 = fVar15;
                                    coroutineSingletons = coroutineSingletons4;
                                }
                            } else if ((gzz0Var3.a(f3, kx91.g(zvd0Var19, true), true) & j2) != j) {
                                zvd0Var19.a();
                                ref$LongRef4.element = kx91.g(zvd0Var19, false);
                                if (zvd0Var19.j()) {
                                    zls zlsVar7 = zlsVar3;
                                    zvd0Var2 = zvd0Var19;
                                    slsVar3 = slsVar5;
                                    zlsVar2 = zlsVar7;
                                    dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                                    wlsVar2 = wlsVar4;
                                    orientation2 = orientation4;
                                    zvd0Var3 = zvd0Var10;
                                    coroutineSingletons = coroutineSingletons4;
                                    ref$LongRef = ref$LongRef4;
                                    fVar2 = fVar14;
                                    tlsVar2 = tlsVar6;
                                    if (zvd0Var2 == null) {
                                    }
                                    if (zvd0Var2 != null) {
                                    }
                                    return zy11.a;
                                }
                                gzz0Var3.b = 0L;
                                tlsVar5 = tlsVar6;
                                n = f3;
                                dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                                fVar6 = fVar14;
                                zvd0Var9 = zvd0Var10;
                                fVar5 = fVar15;
                                coroutineSingletons = coroutineSingletons4;
                            } else {
                                PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                                dragGestureDetectorKt$processDragGesture$13.L$0 = fVar14;
                                dragGestureDetectorKt$processDragGesture$13.L$1 = orientation4;
                                dragGestureDetectorKt$processDragGesture$13.L$2 = zlsVar3;
                                dragGestureDetectorKt$processDragGesture$13.L$3 = wlsVar4;
                                dragGestureDetectorKt$processDragGesture$13.L$4 = slsVar5;
                                tlsVar5 = tlsVar6;
                                dragGestureDetectorKt$processDragGesture$13.L$5 = tlsVar5;
                                dragGestureDetectorKt$processDragGesture$13.L$6 = zvd0Var10;
                                dragGestureDetectorKt$processDragGesture$13.L$7 = ref$LongRef4;
                                dragGestureDetectorKt$processDragGesture$13.L$8 = fVar15;
                                dragGestureDetectorKt$processDragGesture$13.L$9 = ref$LongRef5;
                                dragGestureDetectorKt$processDragGesture$13.L$10 = gzz0Var3;
                                dragGestureDetectorKt$processDragGesture$13.L$11 = zvd0Var19;
                                dragGestureDetectorKt$processDragGesture$13.F$0 = f3;
                                dragGestureDetectorKt$processDragGesture$13.label = 6;
                                coroutineSingletons = coroutineSingletons4;
                                if (fVar15.a(pointerEventPass3, dragGestureDetectorKt$processDragGesture$13) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                n = f3;
                                dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                                fVar6 = fVar14;
                                zvd0Var12 = zvd0Var19;
                                zvd0Var9 = zvd0Var10;
                                fVar5 = fVar15;
                                if (zvd0Var12.j()) {
                                    ref$LongRef = ref$LongRef4;
                                    zvd0Var3 = zvd0Var9;
                                    tlsVar2 = tlsVar5;
                                    slsVar3 = slsVar5;
                                    wlsVar2 = wlsVar4;
                                    zlsVar2 = zlsVar3;
                                    orientation2 = orientation4;
                                    zvd0Var2 = null;
                                    fVar2 = fVar6;
                                    if (zvd0Var2 == null) {
                                    }
                                    if (zvd0Var2 != null) {
                                    }
                                    return zy11.a;
                                }
                            }
                            dragGestureDetectorKt$processDragGesture$1.L$0 = fVar6;
                            dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                            dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar3;
                            dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar4;
                            dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar5;
                            dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar5;
                            dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var9;
                            dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef4;
                            dragGestureDetectorKt$processDragGesture$1.L$8 = fVar5;
                            dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef5;
                            dragGestureDetectorKt$processDragGesture$1.L$10 = gzz0Var3;
                            dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                            dragGestureDetectorKt$processDragGesture$1.F$0 = n;
                            dragGestureDetectorKt$processDragGesture$1.label = 5;
                            a3 = fVar5.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                            if (a3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            DragGestureDetectorKt$processDragGesture$1 dragGestureDetectorKt$processDragGesture$14 = dragGestureDetectorKt$processDragGesture$1;
                            f3 = n;
                            obj4 = a3;
                            fVar14 = fVar6;
                            dragGestureDetectorKt$processDragGesture$13 = dragGestureDetectorKt$processDragGesture$14;
                            tvd0 tvd0Var32 = (tvd0) obj4;
                            List list72 = tvd0Var32.a;
                            CoroutineSingletons coroutineSingletons42 = coroutineSingletons;
                            int size72 = list72.size();
                            androidx.compose.ui.input.pointer.f fVar152 = fVar5;
                            int i132 = 0;
                            while (true) {
                                if (i132 >= size72) {
                                }
                                i132 = i5 + 1;
                                zvd0Var9 = zvd0Var10;
                                size72 = i6;
                                tlsVar5 = tlsVar6;
                                list72 = list;
                            }
                            zvd0 zvd0Var192 = zvd0Var11;
                            if (zvd0Var192 != null) {
                                if (kx91.d(zvd0Var192)) {
                                }
                                dragGestureDetectorKt$processDragGesture$1.L$0 = fVar6;
                                dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                                dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar3;
                                dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar4;
                                dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar5;
                                dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar5;
                                dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var9;
                                dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef4;
                                dragGestureDetectorKt$processDragGesture$1.L$8 = fVar5;
                                dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef5;
                                dragGestureDetectorKt$processDragGesture$1.L$10 = gzz0Var3;
                                dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                dragGestureDetectorKt$processDragGesture$1.F$0 = n;
                                dragGestureDetectorKt$processDragGesture$1.label = 5;
                                a3 = fVar5.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                                if (a3 == coroutineSingletons) {
                                }
                            }
                        }
                        dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$13;
                        slsVar3 = slsVar5;
                        wlsVar2 = wlsVar4;
                        zlsVar2 = zlsVar3;
                        orientation2 = orientation4;
                        zvd0Var3 = zvd0Var10;
                        coroutineSingletons = coroutineSingletons42;
                        zvd0Var2 = null;
                        ref$LongRef = ref$LongRef4;
                        fVar2 = fVar14;
                        tlsVar2 = tlsVar6;
                        if (zvd0Var2 == null) {
                        }
                        if (zvd0Var2 != null) {
                        }
                        return zy11.a;
                    case 6:
                        float f4 = dragGestureDetectorKt$processDragGesture$1.F$0;
                        zvd0Var12 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$11;
                        gzz0 gzz0Var7 = (gzz0) dragGestureDetectorKt$processDragGesture$1.L$10;
                        ref$LongRef5 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$9;
                        j = 9205357640488583168L;
                        androidx.compose.ui.input.pointer.f fVar16 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$8;
                        Ref$LongRef ref$LongRef12 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$7;
                        j2 = 9223372034707292159L;
                        zvd0 zvd0Var21 = (zvd0) dragGestureDetectorKt$processDragGesture$1.L$6;
                        tls tlsVar10 = (tls) dragGestureDetectorKt$processDragGesture$1.L$5;
                        sls slsVar10 = (sls) dragGestureDetectorKt$processDragGesture$1.L$4;
                        wls wlsVar8 = (wls) dragGestureDetectorKt$processDragGesture$1.L$3;
                        zls zlsVar8 = (zls) dragGestureDetectorKt$processDragGesture$1.L$2;
                        Orientation orientation8 = (Orientation) dragGestureDetectorKt$processDragGesture$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar17 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$0;
                        kotlin.b.b(obj4);
                        fVar5 = fVar16;
                        tlsVar5 = tlsVar10;
                        zlsVar3 = zlsVar8;
                        n = f4;
                        ref$LongRef4 = ref$LongRef12;
                        slsVar5 = slsVar10;
                        gzz0Var3 = gzz0Var7;
                        zvd0Var9 = zvd0Var21;
                        wlsVar4 = wlsVar8;
                        orientation4 = orientation8;
                        coroutineSingletons = coroutineSingletons2;
                        fVar6 = fVar17;
                        if (zvd0Var12.j()) {
                        }
                        dragGestureDetectorKt$processDragGesture$1.L$0 = fVar6;
                        dragGestureDetectorKt$processDragGesture$1.L$1 = orientation4;
                        dragGestureDetectorKt$processDragGesture$1.L$2 = zlsVar3;
                        dragGestureDetectorKt$processDragGesture$1.L$3 = wlsVar4;
                        dragGestureDetectorKt$processDragGesture$1.L$4 = slsVar5;
                        dragGestureDetectorKt$processDragGesture$1.L$5 = tlsVar5;
                        dragGestureDetectorKt$processDragGesture$1.L$6 = zvd0Var9;
                        dragGestureDetectorKt$processDragGesture$1.L$7 = ref$LongRef4;
                        dragGestureDetectorKt$processDragGesture$1.L$8 = fVar5;
                        dragGestureDetectorKt$processDragGesture$1.L$9 = ref$LongRef5;
                        dragGestureDetectorKt$processDragGesture$1.L$10 = gzz0Var3;
                        dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                        dragGestureDetectorKt$processDragGesture$1.F$0 = n;
                        dragGestureDetectorKt$processDragGesture$1.label = 5;
                        a3 = fVar5.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                        if (a3 == coroutineSingletons) {
                        }
                        break;
                    case 7:
                        Ref$LongRef ref$LongRef13 = (Ref$LongRef) dragGestureDetectorKt$processDragGesture$1.L$5;
                        androidx.compose.ui.input.pointer.f fVar18 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$4;
                        androidx.compose.ui.input.pointer.f fVar19 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$processDragGesture$1.L$3;
                        tls tlsVar11 = (tls) dragGestureDetectorKt$processDragGesture$1.L$2;
                        sls slsVar11 = (sls) dragGestureDetectorKt$processDragGesture$1.L$1;
                        wls wlsVar9 = (wls) dragGestureDetectorKt$processDragGesture$1.L$0;
                        kotlin.b.b(obj4);
                        coroutineSingletons = coroutineSingletons2;
                        tvd0 tvd0Var4 = (tvd0) obj4;
                        List list9 = tvd0Var4.a;
                        int size9 = list9.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size9) {
                                ?? r12 = list9.get(i15);
                                dragGestureDetectorKt$processDragGesture$12 = dragGestureDetectorKt$processDragGesture$1;
                                list2 = list9;
                                if (ey91.e(((zvd0) r12).a, ref$LongRef13.element)) {
                                    zvd0Var14 = r12;
                                } else {
                                    i15++;
                                    dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                    list9 = list2;
                                }
                            } else {
                                dragGestureDetectorKt$processDragGesture$12 = dragGestureDetectorKt$processDragGesture$1;
                                zvd0Var14 = null;
                            }
                        }
                        zvd0 zvd0Var22 = zvd0Var14;
                        if (zvd0Var22 == null) {
                            if (!kx91.d(zvd0Var22)) {
                                break;
                            } else {
                                List list10 = tvd0Var4.a;
                                int size10 = list10.size();
                                int i16 = 0;
                                while (true) {
                                    if (i16 < size10) {
                                        obj3 = list10.get(i16);
                                        if (!((zvd0) obj3).d) {
                                            i16++;
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                zvd0 zvd0Var23 = (zvd0) obj3;
                                if (zvd0Var23 != null) {
                                    ref$LongRef13.element = zvd0Var23.a;
                                    dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                    dragGestureDetectorKt$processDragGesture$1.L$0 = wlsVar9;
                                    dragGestureDetectorKt$processDragGesture$1.L$1 = slsVar11;
                                    dragGestureDetectorKt$processDragGesture$1.L$2 = tlsVar11;
                                    dragGestureDetectorKt$processDragGesture$1.L$3 = fVar19;
                                    dragGestureDetectorKt$processDragGesture$1.L$4 = fVar18;
                                    dragGestureDetectorKt$processDragGesture$1.L$5 = ref$LongRef13;
                                    dragGestureDetectorKt$processDragGesture$1.L$6 = null;
                                    dragGestureDetectorKt$processDragGesture$1.L$7 = null;
                                    dragGestureDetectorKt$processDragGesture$1.L$8 = null;
                                    dragGestureDetectorKt$processDragGesture$1.L$9 = null;
                                    dragGestureDetectorKt$processDragGesture$1.L$10 = null;
                                    dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                                    dragGestureDetectorKt$processDragGesture$1.label = 7;
                                    obj4 = fVar18.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                                    if (obj4 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    tvd0 tvd0Var42 = (tvd0) obj4;
                                    List list92 = tvd0Var42.a;
                                    int size92 = list92.size();
                                    int i152 = 0;
                                    while (true) {
                                        if (i152 < size92) {
                                        }
                                        i152++;
                                        dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                                        list92 = list2;
                                    }
                                    zvd0 zvd0Var222 = zvd0Var14;
                                    if (zvd0Var222 == null) {
                                        zvd0Var222 = null;
                                    }
                                }
                            }
                        }
                        if (zvd0Var222 == null || zvd0Var222.j()) {
                            tlsVar2 = tlsVar11;
                            slsVar3 = slsVar11;
                            zvd0Var13 = null;
                            if (zvd0Var13 == null) {
                            }
                            return zy11.a;
                        }
                        if (!kx91.d(zvd0Var222)) {
                            tlsVar2 = tlsVar11;
                            slsVar3 = slsVar11;
                            zvd0Var13 = zvd0Var222;
                            if (zvd0Var13 == null) {
                                slsVar3.invoke();
                            } else {
                                tlsVar2.invoke(zvd0Var13);
                            }
                            return zy11.a;
                        }
                        wlsVar9.invoke(zvd0Var222, new wu60(kx91.g(zvd0Var222, false)));
                        zvd0Var222.a();
                        j4 = zvd0Var222.a;
                        fVar2 = fVar19;
                        tlsVar2 = tlsVar11;
                        slsVar3 = slsVar11;
                        wlsVar2 = wlsVar9;
                        dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                        Ref$LongRef ref$LongRef14 = new Ref$LongRef();
                        ref$LongRef14.element = j4;
                        ref$LongRef13 = ref$LongRef14;
                        slsVar11 = slsVar3;
                        wlsVar9 = wlsVar2;
                        fVar19 = fVar2;
                        tlsVar11 = tlsVar2;
                        fVar18 = fVar19;
                        dragGestureDetectorKt$processDragGesture$1.L$0 = wlsVar9;
                        dragGestureDetectorKt$processDragGesture$1.L$1 = slsVar11;
                        dragGestureDetectorKt$processDragGesture$1.L$2 = tlsVar11;
                        dragGestureDetectorKt$processDragGesture$1.L$3 = fVar19;
                        dragGestureDetectorKt$processDragGesture$1.L$4 = fVar18;
                        dragGestureDetectorKt$processDragGesture$1.L$5 = ref$LongRef13;
                        dragGestureDetectorKt$processDragGesture$1.L$6 = null;
                        dragGestureDetectorKt$processDragGesture$1.L$7 = null;
                        dragGestureDetectorKt$processDragGesture$1.L$8 = null;
                        dragGestureDetectorKt$processDragGesture$1.L$9 = null;
                        dragGestureDetectorKt$processDragGesture$1.L$10 = null;
                        dragGestureDetectorKt$processDragGesture$1.L$11 = null;
                        dragGestureDetectorKt$processDragGesture$1.label = 7;
                        obj4 = fVar18.a(PointerEventPass.Main, dragGestureDetectorKt$processDragGesture$1);
                        if (obj4 == coroutineSingletons) {
                        }
                        tvd0 tvd0Var422 = (tvd0) obj4;
                        List list922 = tvd0Var422.a;
                        int size922 = list922.size();
                        int i1522 = 0;
                        while (true) {
                            if (i1522 < size922) {
                            }
                            i1522++;
                            dragGestureDetectorKt$processDragGesture$1 = dragGestureDetectorKt$processDragGesture$12;
                            list922 = list2;
                        }
                        zvd0 zvd0Var2222 = zvd0Var14;
                        if (zvd0Var2222 == null) {
                        }
                        if (zvd0Var2222 == null) {
                            if (!kx91.d(zvd0Var2222)) {
                            }
                        }
                        tlsVar2 = tlsVar11;
                        slsVar3 = slsVar11;
                        zvd0Var13 = null;
                        if (zvd0Var13 == null) {
                        }
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dragGestureDetectorKt$processDragGesture$1 = new DragGestureDetectorKt$processDragGesture$1(baseContinuationImpl);
        Object obj42 = dragGestureDetectorKt$processDragGesture$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (dragGestureDetectorKt$processDragGesture$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        if (r0 == 0.0f) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [tls] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0080 -> B:10:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(androidx.compose.ui.input.pointer.f fVar, long j, mj1 mj1Var, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        androidx.compose.ui.input.pointer.f fVar2;
        long j2;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        Orientation orientation;
        mj1 mj1Var2;
        int i2;
        Ref$LongRef ref$LongRef;
        Orientation orientation2;
        androidx.compose.ui.input.pointer.f fVar3;
        Object a2;
        androidx.compose.ui.input.pointer.f fVar4;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) baseContinuationImpl;
            int i3 = dragGestureDetectorKt$verticalDrag$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$verticalDrag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$verticalDrag$1.label;
                zvd0 zvd0Var = null;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$LongRef ref$LongRef2 = (Ref$LongRef) dragGestureDetectorKt$verticalDrag$1.L$4;
                    fVar3 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$verticalDrag$1.L$3;
                    orientation2 = (Orientation) dragGestureDetectorKt$verticalDrag$1.L$2;
                    androidx.compose.ui.input.pointer.f fVar5 = (androidx.compose.ui.input.pointer.f) dragGestureDetectorKt$verticalDrag$1.L$1;
                    tls tlsVar = (tls) dragGestureDetectorKt$verticalDrag$1.L$0;
                    kotlin.b.b(obj3);
                    Ref$LongRef ref$LongRef3 = ref$LongRef2;
                    fVar2 = fVar5;
                    ?? r10 = tlsVar;
                    tvd0 tvd0Var = (tvd0) obj3;
                    List list = tvd0Var.a;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            fVar4 = fVar3;
                            obj = null;
                            break;
                        }
                        obj = list.get(i5);
                        fVar4 = fVar3;
                        if (ey91.e(((zvd0) obj).a, ref$LongRef3.element)) {
                            break;
                        }
                        i5++;
                        fVar3 = fVar4;
                    }
                    zvd0 zvd0Var2 = (zvd0) obj;
                    if (zvd0Var2 == null) {
                        if (kx91.d(zvd0Var2)) {
                            List list2 = tvd0Var.a;
                            int size2 = list2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list2.get(i6);
                                if (((zvd0) obj2).d) {
                                    break;
                                }
                                i6++;
                            }
                            zvd0 zvd0Var3 = (zvd0) obj2;
                            if (zvd0Var3 != null) {
                                ref$LongRef3.element = zvd0Var3.a;
                                i2 = 1;
                            }
                        } else {
                            i2 = 1;
                            long g = kx91.g(zvd0Var2, true);
                            if (orientation2 != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : g >> 32));
                            } else {
                                intBitsToFloat = wu60.d(g);
                            }
                        }
                        fVar3 = fVar4;
                        mj1Var2 = r10;
                        i4 = i2;
                        ref$LongRef = ref$LongRef3;
                        dragGestureDetectorKt$verticalDrag$1.L$0 = mj1Var2;
                        dragGestureDetectorKt$verticalDrag$1.L$1 = fVar2;
                        dragGestureDetectorKt$verticalDrag$1.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$1.L$3 = fVar3;
                        dragGestureDetectorKt$verticalDrag$1.L$4 = ref$LongRef;
                        dragGestureDetectorKt$verticalDrag$1.label = i4;
                        a2 = fVar3.a(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$1);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Ref$LongRef ref$LongRef4 = ref$LongRef;
                        r10 = mj1Var2;
                        obj3 = a2;
                        ref$LongRef3 = ref$LongRef4;
                        tvd0 tvd0Var2 = (tvd0) obj3;
                        List list3 = tvd0Var2.a;
                        int size3 = list3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52++;
                            fVar3 = fVar4;
                        }
                        zvd0 zvd0Var22 = (zvd0) obj;
                        if (zvd0Var22 == null) {
                            zvd0Var22 = null;
                        }
                    }
                    i2 = 1;
                    if (zvd0Var22 == null || zvd0Var22.j()) {
                        zvd0Var = null;
                    } else if (kx91.d(zvd0Var22)) {
                        zvd0Var = zvd0Var22;
                    } else {
                        r10.invoke(zvd0Var22);
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        orientation = orientation2;
                        mj1Var2 = r10;
                        i4 = i2;
                        j2 = zvd0Var22.a;
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = j2;
                        orientation2 = orientation;
                        dragGestureDetectorKt$verticalDrag$1 = dragGestureDetectorKt$verticalDrag$12;
                        fVar3 = fVar2;
                        dragGestureDetectorKt$verticalDrag$1.L$0 = mj1Var2;
                        dragGestureDetectorKt$verticalDrag$1.L$1 = fVar2;
                        dragGestureDetectorKt$verticalDrag$1.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$1.L$3 = fVar3;
                        dragGestureDetectorKt$verticalDrag$1.L$4 = ref$LongRef;
                        dragGestureDetectorKt$verticalDrag$1.label = i4;
                        a2 = fVar3.a(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$1);
                        if (a2 == coroutineSingletons) {
                        }
                    }
                    return Boolean.valueOf((boolean) (zvd0Var == null ? i2 : 0));
                }
                kotlin.b.b(obj3);
                Orientation orientation3 = Orientation.Vertical;
                fVar2 = fVar;
                j2 = j;
                if (m(fVar2.y.x, j2)) {
                    i2 = 1;
                    return Boolean.valueOf((boolean) (zvd0Var == null ? i2 : 0));
                }
                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                orientation = orientation3;
                mj1Var2 = mj1Var;
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = j2;
                orientation2 = orientation;
                dragGestureDetectorKt$verticalDrag$1 = dragGestureDetectorKt$verticalDrag$12;
                fVar3 = fVar2;
                dragGestureDetectorKt$verticalDrag$1.L$0 = mj1Var2;
                dragGestureDetectorKt$verticalDrag$1.L$1 = fVar2;
                dragGestureDetectorKt$verticalDrag$1.L$2 = orientation2;
                dragGestureDetectorKt$verticalDrag$1.L$3 = fVar3;
                dragGestureDetectorKt$verticalDrag$1.L$4 = ref$LongRef;
                dragGestureDetectorKt$verticalDrag$1.label = i4;
                a2 = fVar3.a(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$1);
                if (a2 == coroutineSingletons) {
                }
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(baseContinuationImpl);
        Object obj32 = dragGestureDetectorKt$verticalDrag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$verticalDrag$1.label;
        zvd0 zvd0Var4 = null;
        int i42 = 1;
        if (i == 0) {
        }
    }
}
