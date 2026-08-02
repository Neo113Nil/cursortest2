package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.dkq0;
import defpackage.f2c;
import defpackage.fb30;
import defpackage.fmz;
import defpackage.hwd0;
import defpackage.kx91;
import defpackage.lxo0;
import defpackage.ny61;
import defpackage.okq0;
import defpackage.qje;
import defpackage.tvd0;
import defpackage.uyo0;
import defpackage.wfz;
import defpackage.wu60;
import defpackage.yly0;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes10.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(androidx.compose.ui.input.pointer.f fVar, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int i;
        int size;
        int i2;
        if (baseContinuationImpl instanceof SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (SelectionGesturesKt$awaitDown$1) baseContinuationImpl;
            int i3 = selectionGesturesKt$awaitDown$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$awaitDown$1.label = i3 - Integer.MIN_VALUE;
                Object obj = selectionGesturesKt$awaitDown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectionGesturesKt$awaitDown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    selectionGesturesKt$awaitDown$1.L$0 = fVar;
                    selectionGesturesKt$awaitDown$1.label = 1;
                    obj = fVar.a(pointerEventPass, selectionGesturesKt$awaitDown$1);
                    if (obj == coroutineSingletons) {
                    }
                    tvd0 tvd0Var = (tvd0) obj;
                    List list = tvd0Var.a;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return tvd0Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = (androidx.compose.ui.input.pointer.f) selectionGesturesKt$awaitDown$1.L$0;
                kotlin.b.b(obj);
                tvd0 tvd0Var2 = (tvd0) obj;
                List list2 = tvd0Var2.a;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    if (kx91.a((zvd0) list2.get(i2))) {
                        i2++;
                    } else {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                        selectionGesturesKt$awaitDown$1.L$0 = fVar;
                        selectionGesturesKt$awaitDown$1.label = 1;
                        obj = fVar.a(pointerEventPass2, selectionGesturesKt$awaitDown$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        tvd0 tvd0Var22 = (tvd0) obj;
                        List list22 = tvd0Var22.a;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return tvd0Var22;
            }
        }
        selectionGesturesKt$awaitDown$1 = new SelectionGesturesKt$awaitDown$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$awaitDown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectionGesturesKt$awaitDown$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0 A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00cf, B:15:0x00d7, B:17:0x00e7, B:19:0x00f3, B:21:0x00f6, B:24:0x00f9, B:27:0x00fd, B:35:0x009c, B:37:0x00a0, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:48:0x00b6, B:49:0x00bb, B:58:0x005c, B:60:0x006a, B:61:0x006f, B:64:0x006d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00cf, B:15:0x00d7, B:17:0x00e7, B:19:0x00f3, B:21:0x00f6, B:24:0x00f9, B:27:0x00fd, B:35:0x009c, B:37:0x00a0, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:48:0x00b6, B:49:0x00bb, B:58:0x005c, B:60:0x006a, B:61:0x006f, B:64:0x006d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00cf, B:15:0x00d7, B:17:0x00e7, B:19:0x00f3, B:21:0x00f6, B:24:0x00f9, B:27:0x00fd, B:35:0x009c, B:37:0x00a0, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:44:0x00ae, B:46:0x00b2, B:48:0x00b6, B:49:0x00bb, B:58:0x005c, B:60:0x006a, B:61:0x006f, B:64:0x006d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(androidx.compose.ui.input.pointer.f fVar, yly0 yly0Var, tvd0 tvd0Var, int i, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        int i2;
        long j;
        Ref$LongRef ref$LongRef;
        DownResolution downResolution;
        try {
            if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionSubsequentPress$1) {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = (SelectionGesturesKt$touchSelectionSubsequentPress$1) baseContinuationImpl;
                int i3 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
                    zy11 zy11Var = zy11.a;
                    int i4 = 2;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        zvd0 zvd0Var = (zvd0) kotlin.collections.a.P(tvd0Var.a);
                        j = zvd0Var.a;
                        yly0Var.c(zvd0Var.c, i > 2 ? wfz.S : wfz.R);
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = 9205357640488583168L;
                        long f = fVar.g().f();
                        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(j, ref$LongRef, null);
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = fVar;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = yly0Var;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = ref$LongRef;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.J$0 = j;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.label = 1;
                        obj = fVar.u(f, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1, selectionGesturesKt$touchSelectionSubsequentPress$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            yly0Var = (yly0) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                            fVar = (androidx.compose.ui.input.pointer.f) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                            kotlin.b.b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                yly0Var.onCancel();
                                return zy11Var;
                            }
                            List list = fVar.y.x.a;
                            int size = list.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                zvd0 zvd0Var2 = (zvd0) list.get(i5);
                                if (kx91.c(zvd0Var2)) {
                                    zvd0Var2.a();
                                }
                            }
                            yly0Var.onStop();
                            return zy11Var;
                        }
                        long j2 = selectionGesturesKt$touchSelectionSubsequentPress$1.J$0;
                        ref$LongRef = (Ref$LongRef) selectionGesturesKt$touchSelectionSubsequentPress$1.L$2;
                        yly0 yly0Var2 = (yly0) selectionGesturesKt$touchSelectionSubsequentPress$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar2 = (androidx.compose.ui.input.pointer.f) selectionGesturesKt$touchSelectionSubsequentPress$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            j = j2;
                            yly0Var = yly0Var2;
                            fVar = fVar2;
                        } catch (CancellationException e) {
                            e = e;
                            yly0Var = yly0Var2;
                            yly0Var.onCancel();
                            throw e;
                        }
                    }
                    downResolution = (DownResolution) obj;
                    if (downResolution == null) {
                        downResolution = DownResolution.Timeout;
                    }
                    if (downResolution != DownResolution.Cancel) {
                        yly0Var.onCancel();
                        return zy11Var;
                    }
                    if (downResolution == DownResolution.Up) {
                        yly0Var.onStop();
                        return zy11Var;
                    }
                    if (downResolution == DownResolution.Drag) {
                        yly0Var.b(ref$LongRef.element);
                    }
                    fmz fmzVar = new fmz(yly0Var, i4);
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$0 = fVar;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$1 = yly0Var;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.L$2 = null;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.label = 2;
                    obj = androidx.compose.foundation.gestures.i.k(fVar, j, fmzVar, selectionGesturesKt$touchSelectionSubsequentPress$1);
                }
            }
            if (i2 != 0) {
            }
            downResolution = (DownResolution) obj;
            if (downResolution == null) {
            }
            if (downResolution != DownResolution.Cancel) {
            }
        } catch (CancellationException e2) {
            e = e2;
        }
        selectionGesturesKt$touchSelectionSubsequentPress$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$touchSelectionSubsequentPress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.label;
        zy11 zy11Var2 = zy11.a;
        int i42 = 2;
    }

    public static final Object c(hwd0 hwd0Var, fb30 fb30Var, yly0 yly0Var, Continuation continuation) {
        androidx.compose.ui.input.pointer.g gVar = (androidx.compose.ui.input.pointer.g) hwd0Var;
        gVar.getClass();
        Object l = androidx.compose.foundation.gestures.c.l(hwd0Var, new SelectionGesturesKt$awaitSelectionGestures$2(new f2c(qje.P(gVar).T), fb30Var, yly0Var, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010c A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0035, B:13:0x00f1, B:15:0x00f9, B:17:0x00fd, B:19:0x010c, B:21:0x0118, B:62:0x00cb), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:34:0x004d, B:35:0x0084, B:37:0x008c, B:39:0x009b, B:41:0x00a7, B:52:0x006b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(androidx.compose.ui.input.pointer.f fVar, fb30 fb30Var, f2c f2cVar, tvd0 tvd0Var, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        int i;
        androidx.compose.ui.input.pointer.f fVar2;
        Ref$BooleanRef ref$BooleanRef;
        int size;
        dkq0 dkq0Var = wfz.Q;
        try {
            try {
                if (baseContinuationImpl instanceof SelectionGesturesKt$mouseSelection$1) {
                    selectionGesturesKt$mouseSelection$1 = (SelectionGesturesKt$mouseSelection$1) baseContinuationImpl;
                    int i2 = selectionGesturesKt$mouseSelection$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        selectionGesturesKt$mouseSelection$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = selectionGesturesKt$mouseSelection$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = selectionGesturesKt$mouseSelection$1.label;
                        int i3 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                fb30Var = (fb30) selectionGesturesKt$mouseSelection$1.L$1;
                                fVar = (androidx.compose.ui.input.pointer.f) selectionGesturesKt$mouseSelection$1.L$0;
                                kotlin.b.b(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List list = fVar.y.x.a;
                                    int size2 = list.size();
                                    while (i3 < size2) {
                                        zvd0 zvd0Var = (zvd0) list.get(i3);
                                        if (kx91.c(zvd0Var)) {
                                            zvd0Var.a();
                                        }
                                        i3++;
                                    }
                                }
                                return zy11.a;
                            }
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ref$BooleanRef = (Ref$BooleanRef) selectionGesturesKt$mouseSelection$1.L$2;
                            fb30Var = (fb30) selectionGesturesKt$mouseSelection$1.L$1;
                            fVar2 = (androidx.compose.ui.input.pointer.f) selectionGesturesKt$mouseSelection$1.L$0;
                            kotlin.b.b(obj);
                            if (((Boolean) obj).booleanValue() && ref$BooleanRef.element) {
                                List list2 = fVar2.y.x.a;
                                size = list2.size();
                                while (i3 < size) {
                                    zvd0 zvd0Var2 = (zvd0) list2.get(i3);
                                    if (kx91.c(zvd0Var2)) {
                                        zvd0Var2.a();
                                    }
                                    i3++;
                                }
                            }
                            fb30Var.a();
                            return zy11.a;
                        }
                        kotlin.b.b(obj);
                        zvd0 zvd0Var3 = (zvd0) tvd0Var.a.get(0);
                        if ((tvd0Var.e & 1) != 0) {
                            if (fb30Var.e(zvd0Var3.c)) {
                                zvd0Var3.a();
                                long j = zvd0Var3.a;
                                uyo0 uyo0Var = new uyo0(22, fb30Var);
                                selectionGesturesKt$mouseSelection$1.L$0 = fVar;
                                selectionGesturesKt$mouseSelection$1.L$1 = fb30Var;
                                selectionGesturesKt$mouseSelection$1.label = 1;
                                obj = androidx.compose.foundation.gestures.i.k(fVar, j, uyo0Var, selectionGesturesKt$mouseSelection$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return zy11.a;
                        }
                        int i4 = f2cVar.b;
                        dkq0 dkq0Var2 = i4 != 1 ? i4 != 2 ? wfz.S : wfz.R : dkq0Var;
                        if (fb30Var.b(zvd0Var3.c, dkq0Var2, i4)) {
                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                            ref$BooleanRef2.element = !dkq0Var2.equals(dkq0Var);
                            long j2 = zvd0Var3.a;
                            lxo0 lxo0Var = new lxo0(7, fb30Var, dkq0Var2, ref$BooleanRef2);
                            selectionGesturesKt$mouseSelection$1.L$0 = fVar;
                            selectionGesturesKt$mouseSelection$1.L$1 = fb30Var;
                            selectionGesturesKt$mouseSelection$1.L$2 = ref$BooleanRef2;
                            selectionGesturesKt$mouseSelection$1.label = 2;
                            obj = androidx.compose.foundation.gestures.i.k(fVar, j2, lxo0Var, selectionGesturesKt$mouseSelection$1);
                            if (obj != coroutineSingletons) {
                                fVar2 = fVar;
                                ref$BooleanRef = ref$BooleanRef2;
                                if (((Boolean) obj).booleanValue()) {
                                    List list22 = fVar2.y.x.a;
                                    size = list22.size();
                                    while (i3 < size) {
                                    }
                                }
                                fb30Var.a();
                            }
                            return coroutineSingletons;
                        }
                        return zy11.a;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        selectionGesturesKt$mouseSelection$1 = new SelectionGesturesKt$mouseSelection$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$mouseSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectionGesturesKt$mouseSelection$1.label;
        int i32 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[Catch: CancellationException -> 0x0036, TryCatch #0 {CancellationException -> 0x0036, blocks: (B:12:0x0031, B:13:0x00ac, B:15:0x00b4, B:17:0x00c3, B:19:0x00cf, B:21:0x00d2, B:24:0x00d5, B:28:0x00d9, B:32:0x004b, B:34:0x006e, B:36:0x0072, B:40:0x0091, B:45:0x0055), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(androidx.compose.ui.input.pointer.f fVar, yly0 yly0Var, tvd0 tvd0Var, BaseContinuationImpl baseContinuationImpl) {
        SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        int i;
        zvd0 zvd0Var;
        zvd0 zvd0Var2;
        try {
            if (baseContinuationImpl instanceof SelectionGesturesKt$touchSelectionFirstPress$1) {
                selectionGesturesKt$touchSelectionFirstPress$1 = (SelectionGesturesKt$touchSelectionFirstPress$1) baseContinuationImpl;
                int i2 = selectionGesturesKt$touchSelectionFirstPress$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionFirstPress$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = selectionGesturesKt$touchSelectionFirstPress$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = selectionGesturesKt$touchSelectionFirstPress$1.label;
                    int i3 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        zvd0Var = (zvd0) kotlin.collections.a.P(tvd0Var.a);
                        long j = zvd0Var.a;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$0 = fVar;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$1 = yly0Var;
                        selectionGesturesKt$touchSelectionFirstPress$1.L$2 = zvd0Var;
                        selectionGesturesKt$touchSelectionFirstPress$1.label = 1;
                        obj = androidx.compose.foundation.gestures.i.d(fVar, j, selectionGesturesKt$touchSelectionFirstPress$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            yly0Var = (yly0) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                            fVar = (androidx.compose.ui.input.pointer.f) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                            kotlin.b.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = fVar.y.x.a;
                                int size = list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    zvd0 zvd0Var3 = (zvd0) list.get(i4);
                                    if (kx91.c(zvd0Var3)) {
                                        zvd0Var3.a();
                                    }
                                }
                                yly0Var.onStop();
                            } else {
                                yly0Var.onCancel();
                            }
                            return zy11.a;
                        }
                        zvd0 zvd0Var4 = (zvd0) selectionGesturesKt$touchSelectionFirstPress$1.L$2;
                        yly0Var = (yly0) selectionGesturesKt$touchSelectionFirstPress$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar2 = (androidx.compose.ui.input.pointer.f) selectionGesturesKt$touchSelectionFirstPress$1.L$0;
                        kotlin.b.b(obj);
                        zvd0Var = zvd0Var4;
                        fVar = fVar2;
                    }
                    zvd0Var2 = (zvd0) obj;
                    if (zvd0Var2 != null) {
                        long j2 = zvd0Var2.c;
                        if (wu60.d(wu60.e(zvd0Var.c, j2)) < androidx.compose.foundation.gestures.i.n(fVar.g(), zvd0Var.i)) {
                            yly0Var.c(j2, okq0.a);
                            long j3 = zvd0Var2.a;
                            fmz fmzVar = new fmz(yly0Var, i3);
                            selectionGesturesKt$touchSelectionFirstPress$1.L$0 = fVar;
                            selectionGesturesKt$touchSelectionFirstPress$1.L$1 = yly0Var;
                            selectionGesturesKt$touchSelectionFirstPress$1.L$2 = null;
                            selectionGesturesKt$touchSelectionFirstPress$1.label = 2;
                            obj = androidx.compose.foundation.gestures.i.k(fVar, j3, fmzVar, selectionGesturesKt$touchSelectionFirstPress$1);
                        }
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            zvd0Var2 = (zvd0) obj;
            if (zvd0Var2 != null) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            yly0Var.onCancel();
            throw e;
        }
        selectionGesturesKt$touchSelectionFirstPress$1 = new SelectionGesturesKt$touchSelectionFirstPress$1(baseContinuationImpl);
        Object obj2 = selectionGesturesKt$touchSelectionFirstPress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectionGesturesKt$touchSelectionFirstPress$1.label;
        int i32 = 1;
    }
}
