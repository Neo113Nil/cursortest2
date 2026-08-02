package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import defpackage.bmz;
import defpackage.bvf0;
import defpackage.cmz;
import defpackage.dmz;
import defpackage.emz;
import defpackage.hwd0;
import defpackage.jl40;
import defpackage.kx91;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.rnm;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tvd0;
import defpackage.uny0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zdz0;
import defpackage.zls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes10.dex */
public abstract class z {
    public static final zls a = new TapGestureDetectorKt$NoPressGesture$1(3, null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:10:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.f r6, boolean r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.f r8 = (androidx.compose.ui.input.pointer.f) r8
            kotlin.b.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4e
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r6)
            r6 = 0
            return r6
        L3c:
            kotlin.b.b(r9)
        L3f:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r9 = r6.a(r8, r0)
            if (r9 != r1) goto L4e
            return r1
        L4e:
            tvd0 r9 = (defpackage.tvd0) r9
            r2 = 0
            boolean r4 = g(r9, r7, r2)
            if (r4 == 0) goto L3f
            java.util.List r6 = r9.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z.a(androidx.compose.ui.input.pointer.f, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object b(androidx.compose.ui.input.pointer.f fVar, PointerEventPass pointerEventPass, Continuation continuation, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return a(fVar, z, pointerEventPass, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0052 -> B:10:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(androidx.compose.ui.input.pointer.f fVar, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$awaitPrimaryFirstDown$1 tapGestureDetectorKt$awaitPrimaryFirstDown$1;
        int i;
        PointerEventPass pointerEventPass2;
        boolean z;
        Object a2;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$awaitPrimaryFirstDown$1) {
            tapGestureDetectorKt$awaitPrimaryFirstDown$1 = (TapGestureDetectorKt$awaitPrimaryFirstDown$1) baseContinuationImpl;
            int i2 = tapGestureDetectorKt$awaitPrimaryFirstDown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$awaitPrimaryFirstDown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$awaitPrimaryFirstDown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapGestureDetectorKt$awaitPrimaryFirstDown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pointerEventPass2 = pointerEventPass;
                    z = false;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$0 = fVar;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$1 = pointerEventPass2;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.Z$0 = z;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.label = 1;
                    a2 = fVar.a(pointerEventPass2, tapGestureDetectorKt$awaitPrimaryFirstDown$1);
                    if (a2 != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z2 = tapGestureDetectorKt$awaitPrimaryFirstDown$1.Z$0;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$1;
                    androidx.compose.ui.input.pointer.f fVar2 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$0;
                    kotlin.b.b(obj);
                    z = z2;
                    fVar = fVar2;
                    TapGestureDetectorKt$awaitPrimaryFirstDown$1 tapGestureDetectorKt$awaitPrimaryFirstDown$12 = tapGestureDetectorKt$awaitPrimaryFirstDown$1;
                    PointerEventPass pointerEventPass4 = pointerEventPass3;
                    tvd0 tvd0Var = (tvd0) obj;
                    if (!g(tvd0Var, z, true)) {
                        return tvd0Var.a.get(0);
                    }
                    pointerEventPass2 = pointerEventPass4;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1 = tapGestureDetectorKt$awaitPrimaryFirstDown$12;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$0 = fVar;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.L$1 = pointerEventPass2;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.Z$0 = z;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$1.label = 1;
                    a2 = fVar.a(pointerEventPass2, tapGestureDetectorKt$awaitPrimaryFirstDown$1);
                    if (a2 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    TapGestureDetectorKt$awaitPrimaryFirstDown$1 tapGestureDetectorKt$awaitPrimaryFirstDown$13 = tapGestureDetectorKt$awaitPrimaryFirstDown$1;
                    pointerEventPass4 = pointerEventPass2;
                    obj = a2;
                    tapGestureDetectorKt$awaitPrimaryFirstDown$12 = tapGestureDetectorKt$awaitPrimaryFirstDown$13;
                    tvd0 tvd0Var2 = (tvd0) obj;
                    if (!g(tvd0Var2, z, true)) {
                    }
                }
            }
        }
        tapGestureDetectorKt$awaitPrimaryFirstDown$1 = new TapGestureDetectorKt$awaitPrimaryFirstDown$1(baseContinuationImpl);
        Object obj2 = tapGestureDetectorKt$awaitPrimaryFirstDown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$awaitPrimaryFirstDown$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[LOOP:0: B:11:0x004d->B:12:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(androidx.compose.ui.input.pointer.f fVar, ContinuationImpl continuationImpl) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuationImpl instanceof TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1) continuationImpl;
            int i4 = tapGestureDetectorKt$consumeUntilUp$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.label = i4 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$consumeUntilUp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapGestureDetectorKt$consumeUntilUp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tapGestureDetectorKt$consumeUntilUp$1.L$0 = fVar;
                    tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                    obj = fVar.a(PointerEventPass.Main, tapGestureDetectorKt$consumeUntilUp$1);
                    if (obj == coroutineSingletons) {
                    }
                    tvd0 tvd0Var = (tvd0) obj;
                    List list = tvd0Var.a;
                    size = list.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List list2 = tvd0Var.a;
                    size2 = list2.size();
                    while (i2 < size2) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$consumeUntilUp$1.L$0;
                kotlin.b.b(obj);
                tvd0 tvd0Var2 = (tvd0) obj;
                List list3 = tvd0Var2.a;
                size = list3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    ((zvd0) list3.get(i3)).a();
                }
                List list22 = tvd0Var2.a;
                size2 = list22.size();
                while (i2 < size2) {
                    if (((zvd0) list22.get(i2)).d) {
                        tapGestureDetectorKt$consumeUntilUp$1.L$0 = fVar;
                        tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                        obj = fVar.a(PointerEventPass.Main, tapGestureDetectorKt$consumeUntilUp$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        tvd0 tvd0Var22 = (tvd0) obj;
                        List list32 = tvd0Var22.a;
                        size = list32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List list222 = tvd0Var22.a;
                        size2 = list222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return zy11.a;
            }
        }
        tapGestureDetectorKt$consumeUntilUp$1 = new TapGestureDetectorKt$consumeUntilUp$1(continuationImpl);
        Object obj2 = tapGestureDetectorKt$consumeUntilUp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$consumeUntilUp$1.label;
        if (i != 0) {
        }
    }

    public static final Object e(hwd0 hwd0Var, zls zlsVar, uny0 uny0Var, Continuation continuation) {
        Object n = bvf0.n(new TapGestureDetectorKt$detectTapAndPress$2(hwd0Var, zlsVar, uny0Var, new s(hwd0Var), null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public static Object f(hwd0 hwd0Var, rnm rnmVar, zls zlsVar, tls tlsVar, Continuation continuation, int i) {
        rnm rnmVar2 = (i & 2) != 0 ? null : rnmVar;
        if ((i & 4) != 0) {
            zlsVar = a;
        }
        Object n = bvf0.n(new TapGestureDetectorKt$detectTapGestures$2(hwd0Var, null, rnmVar2, zlsVar, (i & 8) != 0 ? null : tlsVar, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public static final boolean g(tvd0 tvd0Var, boolean z, boolean z2) {
        if (z2) {
            List list = tvd0Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((zvd0) list.get(i)).i != 2) {
                        break;
                    }
                    i++;
                } else if ((tvd0Var.d & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = tvd0Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            zvd0 zvd0Var = (zvd0) list2.get(i2);
            if (!(z ? kx91.a(zvd0Var) : kx91.b(zvd0Var))) {
                return false;
            }
        }
        return true;
    }

    public static pzt0 h(tse tseVar, l8x l8xVar, wls wlsVar) {
        return tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$launchAwaitingReset$1(l8xVar, wlsVar, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(androidx.compose.ui.input.pointer.f fVar, tse tseVar, s sVar, tls tlsVar, tls tlsVar2, zls zlsVar, tls tlsVar3, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$processTapGesture$1 tapGestureDetectorKt$processTapGesture$1;
        int i;
        tls tlsVar4;
        tls tlsVar5;
        zdz0 zdz0Var;
        Object b;
        tse tseVar2;
        tls tlsVar6;
        s sVar2;
        zls zlsVar2;
        zy11 zy11Var;
        androidx.compose.ui.input.pointer.f fVar2;
        l8x l8xVar;
        tls tlsVar7;
        tls tlsVar8;
        zls zlsVar3;
        zvd0 zvd0Var;
        tls tlsVar9;
        tls tlsVar10;
        androidx.compose.ui.input.pointer.f fVar3;
        zls zlsVar4;
        tls tlsVar11;
        zvd0 zvd0Var2;
        l8x h;
        zvd0 zvd0Var3;
        tls tlsVar12;
        zls zlsVar5;
        tls tlsVar13;
        tls tlsVar14;
        emz emzVar;
        Continuation continuation;
        s sVar3;
        tse tseVar3;
        zvd0 zvd0Var4;
        dmz dmzVar;
        tls tlsVar15;
        tls tlsVar16;
        l8x l8xVar2;
        zvd0 zvd0Var5;
        l8x l8xVar3;
        zvd0 zvd0Var6;
        tls tlsVar17;
        tls tlsVar18;
        s sVar4;
        tse tseVar4;
        zvd0 zvd0Var7;
        emz emzVar2;
        Continuation continuation2;
        l8x l8xVar4;
        s sVar5;
        tse tseVar5;
        androidx.compose.ui.input.pointer.f fVar4 = fVar;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$processTapGesture$1) {
            tapGestureDetectorKt$processTapGesture$1 = (TapGestureDetectorKt$processTapGesture$1) baseContinuationImpl;
            int i2 = tapGestureDetectorKt$processTapGesture$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$processTapGesture$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$processTapGesture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapGestureDetectorKt$processTapGesture$1.label;
                dmz dmzVar2 = dmz.a;
                zls zlsVar6 = a;
                zy11 zy11Var2 = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        tapGestureDetectorKt$processTapGesture$1.L$0 = fVar4;
                        tapGestureDetectorKt$processTapGesture$1.L$1 = tseVar;
                        tapGestureDetectorKt$processTapGesture$1.L$2 = sVar;
                        tlsVar4 = tlsVar;
                        tapGestureDetectorKt$processTapGesture$1.L$3 = tlsVar4;
                        tlsVar5 = tlsVar2;
                        tapGestureDetectorKt$processTapGesture$1.L$4 = tlsVar5;
                        tapGestureDetectorKt$processTapGesture$1.L$5 = zlsVar;
                        tapGestureDetectorKt$processTapGesture$1.L$6 = tlsVar3;
                        tapGestureDetectorKt$processTapGesture$1.label = 1;
                        zdz0Var = null;
                        b = b(fVar4, null, tapGestureDetectorKt$processTapGesture$1, 3);
                        if (b != coroutineSingletons) {
                            tseVar2 = tseVar;
                            tlsVar6 = tlsVar3;
                            sVar2 = sVar;
                            zlsVar2 = zlsVar;
                            zvd0 zvd0Var8 = (zvd0) b;
                            zvd0Var8.a();
                            zy11Var = zy11Var2;
                            pzt0 N = tje.N(tseVar2, zdz0Var, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(sVar2, zdz0Var), 1);
                            if (zlsVar2 != zlsVar6) {
                                h(tseVar2, N, new TapGestureDetectorKt$processTapGesture$2(zlsVar2, sVar2, zvd0Var8, zdz0Var));
                            }
                            if (tlsVar5 != null) {
                                tapGestureDetectorKt$processTapGesture$1.L$0 = fVar4;
                                tapGestureDetectorKt$processTapGesture$1.L$1 = tseVar2;
                                tapGestureDetectorKt$processTapGesture$1.L$2 = sVar2;
                                tapGestureDetectorKt$processTapGesture$1.L$3 = tlsVar4;
                                tapGestureDetectorKt$processTapGesture$1.L$4 = tlsVar5;
                                tapGestureDetectorKt$processTapGesture$1.L$5 = zlsVar2;
                                tapGestureDetectorKt$processTapGesture$1.L$6 = tlsVar6;
                                tapGestureDetectorKt$processTapGesture$1.L$7 = N;
                                tapGestureDetectorKt$processTapGesture$1.label = 2;
                                Object k = k(fVar4, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                if (k != coroutineSingletons) {
                                    tls tlsVar19 = tlsVar5;
                                    tlsVar9 = tlsVar4;
                                    tlsVar10 = tlsVar19;
                                    fVar3 = fVar4;
                                    l8xVar = N;
                                    zlsVar4 = zlsVar2;
                                    tlsVar11 = tlsVar6;
                                    obj = k;
                                    zvd0Var2 = (zvd0) obj;
                                    if (zvd0Var2 == null) {
                                        h = h(tseVar2, l8xVar, new TapGestureDetectorKt$processTapGesture$4(sVar2, null));
                                    } else {
                                        zvd0Var2.a();
                                        h = h(tseVar2, l8xVar, new TapGestureDetectorKt$processTapGesture$5(sVar2, null));
                                    }
                                    if (zvd0Var2 != null) {
                                        if (tlsVar9 != null) {
                                            tapGestureDetectorKt$processTapGesture$1.L$0 = fVar3;
                                            tapGestureDetectorKt$processTapGesture$1.L$1 = tseVar2;
                                            tapGestureDetectorKt$processTapGesture$1.L$2 = sVar2;
                                            tapGestureDetectorKt$processTapGesture$1.L$3 = tlsVar9;
                                            tapGestureDetectorKt$processTapGesture$1.L$4 = tlsVar10;
                                            tapGestureDetectorKt$processTapGesture$1.L$5 = zlsVar4;
                                            tapGestureDetectorKt$processTapGesture$1.L$6 = tlsVar11;
                                            tapGestureDetectorKt$processTapGesture$1.L$7 = zvd0Var2;
                                            tapGestureDetectorKt$processTapGesture$1.L$8 = h;
                                            tapGestureDetectorKt$processTapGesture$1.label = 5;
                                            tls tlsVar20 = tlsVar10;
                                            Object u = fVar3.u(fVar3.g().e(), new TapGestureDetectorKt$awaitSecondDown$2(zvd0Var2, null), tapGestureDetectorKt$processTapGesture$1);
                                            if (u != coroutineSingletons) {
                                                tls tlsVar21 = tlsVar11;
                                                zvd0Var3 = zvd0Var2;
                                                obj = u;
                                                tlsVar12 = tlsVar9;
                                                zlsVar5 = zlsVar4;
                                                tlsVar13 = tlsVar21;
                                                tlsVar14 = tlsVar20;
                                                zvd0Var4 = (zvd0) obj;
                                                if (zvd0Var4 == null) {
                                                    dmzVar = dmzVar2;
                                                    pzt0 N2 = tje.N(tseVar2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$6(h, sVar2, null), 1);
                                                    if (zlsVar5 != zlsVar6) {
                                                        h(tseVar2, N2, new TapGestureDetectorKt$processTapGesture$7(zlsVar5, sVar2, zvd0Var4, null));
                                                    }
                                                    if (tlsVar14 == null) {
                                                        tapGestureDetectorKt$processTapGesture$1.L$0 = tseVar2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$1 = sVar2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$2 = tlsVar12;
                                                        tapGestureDetectorKt$processTapGesture$1.L$3 = tlsVar13;
                                                        tapGestureDetectorKt$processTapGesture$1.L$4 = N2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$5 = zvd0Var3;
                                                        tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.label = 6;
                                                        obj = k(fVar3, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                        if (obj != coroutineSingletons) {
                                                            l8xVar3 = N2;
                                                            zvd0Var6 = zvd0Var3;
                                                            tlsVar17 = tlsVar13;
                                                            tlsVar18 = tlsVar12;
                                                            sVar4 = sVar2;
                                                            tseVar4 = tseVar2;
                                                            zvd0Var7 = (zvd0) obj;
                                                            if (zvd0Var7 != null) {
                                                                zvd0Var7.a();
                                                                h(tseVar4, l8xVar3, new TapGestureDetectorKt$processTapGesture$8(sVar4, null));
                                                                tlsVar18.invoke(new wu60(zvd0Var7.c));
                                                                return zy11Var;
                                                            }
                                                            h(tseVar4, l8xVar3, new TapGestureDetectorKt$processTapGesture$9(sVar4, null));
                                                            if (tlsVar17 != null) {
                                                                tlsVar17.invoke(new wu60(zvd0Var6.c));
                                                                return zy11Var;
                                                            }
                                                        }
                                                    } else {
                                                        tapGestureDetectorKt$processTapGesture$1.L$0 = fVar3;
                                                        tapGestureDetectorKt$processTapGesture$1.L$1 = tseVar2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$2 = sVar2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$3 = tlsVar12;
                                                        tapGestureDetectorKt$processTapGesture$1.L$4 = tlsVar14;
                                                        tapGestureDetectorKt$processTapGesture$1.L$5 = tlsVar13;
                                                        tapGestureDetectorKt$processTapGesture$1.L$6 = N2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$7 = zvd0Var3;
                                                        tapGestureDetectorKt$processTapGesture$1.L$8 = zvd0Var4;
                                                        tapGestureDetectorKt$processTapGesture$1.label = 7;
                                                        Object j = j(fVar3, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                        if (j != coroutineSingletons) {
                                                            tlsVar15 = tlsVar13;
                                                            tlsVar16 = tlsVar12;
                                                            l8xVar2 = N2;
                                                            zvd0Var5 = zvd0Var4;
                                                            obj = j;
                                                            emzVar2 = (emz) obj;
                                                            if (jl40.l(emzVar2, dmzVar)) {
                                                                if (emzVar2 instanceof cmz) {
                                                                    zvd0Var7 = ((cmz) emzVar2).a;
                                                                    zvd0Var6 = zvd0Var3;
                                                                    l8xVar3 = l8xVar2;
                                                                    tlsVar17 = tlsVar15;
                                                                    tlsVar18 = tlsVar16;
                                                                    sVar4 = sVar2;
                                                                    tseVar4 = tseVar2;
                                                                } else {
                                                                    if (!(emzVar2 instanceof bmz)) {
                                                                        w511.b();
                                                                        return null;
                                                                    }
                                                                    zvd0Var6 = zvd0Var3;
                                                                    l8xVar3 = l8xVar2;
                                                                    tlsVar17 = tlsVar15;
                                                                    tlsVar18 = tlsVar16;
                                                                    sVar4 = sVar2;
                                                                    tseVar4 = tseVar2;
                                                                    zvd0Var7 = null;
                                                                }
                                                                if (zvd0Var7 != null) {
                                                                }
                                                            } else {
                                                                tlsVar14.invoke(new wu60(zvd0Var5.c));
                                                                tapGestureDetectorKt$processTapGesture$1.L$0 = tseVar2;
                                                                tapGestureDetectorKt$processTapGesture$1.L$1 = sVar2;
                                                                tapGestureDetectorKt$processTapGesture$1.L$2 = l8xVar2;
                                                                continuation2 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$3 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$4 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$5 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.label = 8;
                                                                if (d(fVar3, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                                    l8xVar4 = l8xVar2;
                                                                    sVar5 = sVar2;
                                                                    tseVar5 = tseVar2;
                                                                    h(tseVar5, l8xVar4, new TapGestureDetectorKt$processTapGesture$secondUp$1(sVar5, continuation2));
                                                                    return zy11Var;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (tlsVar13 != null) {
                                                    tlsVar13.invoke(new wu60(zvd0Var3.c));
                                                    return zy11Var;
                                                }
                                            }
                                        } else if (tlsVar11 != null) {
                                            tlsVar11.invoke(new wu60(zvd0Var2.c));
                                            return zy11Var;
                                        }
                                    }
                                    return zy11Var;
                                }
                            } else {
                                tapGestureDetectorKt$processTapGesture$1.L$0 = fVar4;
                                tapGestureDetectorKt$processTapGesture$1.L$1 = tseVar2;
                                tapGestureDetectorKt$processTapGesture$1.L$2 = sVar2;
                                tapGestureDetectorKt$processTapGesture$1.L$3 = tlsVar4;
                                tapGestureDetectorKt$processTapGesture$1.L$4 = tlsVar5;
                                tapGestureDetectorKt$processTapGesture$1.L$5 = zlsVar2;
                                tapGestureDetectorKt$processTapGesture$1.L$6 = tlsVar6;
                                tapGestureDetectorKt$processTapGesture$1.L$7 = zvd0Var8;
                                tapGestureDetectorKt$processTapGesture$1.L$8 = N;
                                tapGestureDetectorKt$processTapGesture$1.label = 3;
                                Object j2 = j(fVar4, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                if (j2 != coroutineSingletons) {
                                    fVar2 = fVar4;
                                    l8xVar = N;
                                    tlsVar7 = tlsVar6;
                                    obj = j2;
                                    tlsVar8 = tlsVar4;
                                    zlsVar3 = zlsVar2;
                                    zvd0Var = zvd0Var8;
                                    emzVar = (emz) obj;
                                    if (jl40.l(emzVar, dmzVar2)) {
                                        if (emzVar instanceof cmz) {
                                            zvd0Var2 = ((cmz) emzVar).a;
                                        } else {
                                            if (!(emzVar instanceof bmz)) {
                                                w511.b();
                                                return null;
                                            }
                                            zvd0Var2 = null;
                                        }
                                        tlsVar11 = tlsVar7;
                                        zlsVar4 = zlsVar3;
                                        tlsVar10 = tlsVar5;
                                        fVar3 = fVar2;
                                        tlsVar9 = tlsVar8;
                                        if (zvd0Var2 == null) {
                                        }
                                        if (zvd0Var2 != null) {
                                        }
                                        return zy11Var;
                                    }
                                    tlsVar5.invoke(new wu60(zvd0Var.c));
                                    tapGestureDetectorKt$processTapGesture$1.L$0 = tseVar2;
                                    tapGestureDetectorKt$processTapGesture$1.L$1 = sVar2;
                                    tapGestureDetectorKt$processTapGesture$1.L$2 = l8xVar;
                                    continuation = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$3 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$4 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$5 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                    tapGestureDetectorKt$processTapGesture$1.label = 4;
                                    if (d(fVar2, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                        sVar3 = sVar2;
                                        tseVar3 = tseVar2;
                                        h(tseVar3, l8xVar, new TapGestureDetectorKt$processTapGesture$3(sVar3, continuation));
                                        return zy11Var;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        tls tlsVar22 = (tls) tapGestureDetectorKt$processTapGesture$1.L$6;
                        zlsVar2 = (zls) tapGestureDetectorKt$processTapGesture$1.L$5;
                        tls tlsVar23 = (tls) tapGestureDetectorKt$processTapGesture$1.L$4;
                        tls tlsVar24 = (tls) tapGestureDetectorKt$processTapGesture$1.L$3;
                        sVar2 = (s) tapGestureDetectorKt$processTapGesture$1.L$2;
                        tseVar2 = (tse) tapGestureDetectorKt$processTapGesture$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar5 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        tlsVar5 = tlsVar23;
                        tlsVar4 = tlsVar24;
                        b = obj;
                        tlsVar6 = tlsVar22;
                        fVar4 = fVar5;
                        zdz0Var = null;
                        zvd0 zvd0Var82 = (zvd0) b;
                        zvd0Var82.a();
                        zy11Var = zy11Var2;
                        pzt0 N3 = tje.N(tseVar2, zdz0Var, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(sVar2, zdz0Var), 1);
                        if (zlsVar2 != zlsVar6) {
                        }
                        if (tlsVar5 != null) {
                        }
                        return coroutineSingletons;
                    case 2:
                        l8xVar = (l8x) tapGestureDetectorKt$processTapGesture$1.L$7;
                        tlsVar11 = (tls) tapGestureDetectorKt$processTapGesture$1.L$6;
                        zlsVar4 = (zls) tapGestureDetectorKt$processTapGesture$1.L$5;
                        tlsVar10 = (tls) tapGestureDetectorKt$processTapGesture$1.L$4;
                        tlsVar9 = (tls) tapGestureDetectorKt$processTapGesture$1.L$3;
                        sVar2 = (s) tapGestureDetectorKt$processTapGesture$1.L$2;
                        tseVar2 = (tse) tapGestureDetectorKt$processTapGesture$1.L$1;
                        fVar3 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        zy11Var = zy11Var2;
                        zvd0Var2 = (zvd0) obj;
                        if (zvd0Var2 == null) {
                        }
                        if (zvd0Var2 != null) {
                        }
                        return zy11Var;
                    case 3:
                        l8xVar = (l8x) tapGestureDetectorKt$processTapGesture$1.L$8;
                        zvd0Var = (zvd0) tapGestureDetectorKt$processTapGesture$1.L$7;
                        tlsVar7 = (tls) tapGestureDetectorKt$processTapGesture$1.L$6;
                        zlsVar3 = (zls) tapGestureDetectorKt$processTapGesture$1.L$5;
                        tlsVar5 = (tls) tapGestureDetectorKt$processTapGesture$1.L$4;
                        tls tlsVar25 = (tls) tapGestureDetectorKt$processTapGesture$1.L$3;
                        s sVar6 = (s) tapGestureDetectorKt$processTapGesture$1.L$2;
                        tse tseVar6 = (tse) tapGestureDetectorKt$processTapGesture$1.L$1;
                        fVar2 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        zy11Var = zy11Var2;
                        tlsVar8 = tlsVar25;
                        sVar2 = sVar6;
                        tseVar2 = tseVar6;
                        emzVar = (emz) obj;
                        if (jl40.l(emzVar, dmzVar2)) {
                        }
                        break;
                    case 4:
                        l8xVar = (l8x) tapGestureDetectorKt$processTapGesture$1.L$2;
                        sVar3 = (s) tapGestureDetectorKt$processTapGesture$1.L$1;
                        tseVar3 = (tse) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        zy11Var = zy11Var2;
                        continuation = null;
                        h(tseVar3, l8xVar, new TapGestureDetectorKt$processTapGesture$3(sVar3, continuation));
                        return zy11Var;
                    case 5:
                        h = (l8x) tapGestureDetectorKt$processTapGesture$1.L$8;
                        zvd0Var3 = (zvd0) tapGestureDetectorKt$processTapGesture$1.L$7;
                        tlsVar13 = (tls) tapGestureDetectorKt$processTapGesture$1.L$6;
                        zlsVar5 = (zls) tapGestureDetectorKt$processTapGesture$1.L$5;
                        tls tlsVar26 = (tls) tapGestureDetectorKt$processTapGesture$1.L$4;
                        tls tlsVar27 = (tls) tapGestureDetectorKt$processTapGesture$1.L$3;
                        s sVar7 = (s) tapGestureDetectorKt$processTapGesture$1.L$2;
                        tse tseVar7 = (tse) tapGestureDetectorKt$processTapGesture$1.L$1;
                        androidx.compose.ui.input.pointer.f fVar6 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        zy11Var = zy11Var2;
                        tlsVar14 = tlsVar26;
                        tlsVar12 = tlsVar27;
                        sVar2 = sVar7;
                        tseVar2 = tseVar7;
                        fVar3 = fVar6;
                        zvd0Var4 = (zvd0) obj;
                        if (zvd0Var4 == null) {
                        }
                        break;
                    case 6:
                        zvd0Var6 = (zvd0) tapGestureDetectorKt$processTapGesture$1.L$5;
                        l8xVar3 = (l8x) tapGestureDetectorKt$processTapGesture$1.L$4;
                        tlsVar17 = (tls) tapGestureDetectorKt$processTapGesture$1.L$3;
                        tlsVar18 = (tls) tapGestureDetectorKt$processTapGesture$1.L$2;
                        sVar4 = (s) tapGestureDetectorKt$processTapGesture$1.L$1;
                        tseVar4 = (tse) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        zy11Var = zy11Var2;
                        zvd0Var7 = (zvd0) obj;
                        if (zvd0Var7 != null) {
                        }
                        break;
                    case 7:
                        zvd0Var5 = (zvd0) tapGestureDetectorKt$processTapGesture$1.L$8;
                        zvd0Var3 = (zvd0) tapGestureDetectorKt$processTapGesture$1.L$7;
                        l8xVar2 = (l8x) tapGestureDetectorKt$processTapGesture$1.L$6;
                        tlsVar15 = (tls) tapGestureDetectorKt$processTapGesture$1.L$5;
                        tlsVar14 = (tls) tapGestureDetectorKt$processTapGesture$1.L$4;
                        tlsVar16 = (tls) tapGestureDetectorKt$processTapGesture$1.L$3;
                        sVar2 = (s) tapGestureDetectorKt$processTapGesture$1.L$2;
                        tseVar2 = (tse) tapGestureDetectorKt$processTapGesture$1.L$1;
                        fVar3 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        dmzVar = dmzVar2;
                        zy11Var = zy11Var2;
                        emzVar2 = (emz) obj;
                        if (jl40.l(emzVar2, dmzVar)) {
                        }
                        break;
                    case 8:
                        l8xVar4 = (l8x) tapGestureDetectorKt$processTapGesture$1.L$2;
                        sVar5 = (s) tapGestureDetectorKt$processTapGesture$1.L$1;
                        tseVar5 = (tse) tapGestureDetectorKt$processTapGesture$1.L$0;
                        kotlin.b.b(obj);
                        zy11Var = zy11Var2;
                        continuation2 = null;
                        h(tseVar5, l8xVar4, new TapGestureDetectorKt$processTapGesture$secondUp$1(sVar5, continuation2));
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tapGestureDetectorKt$processTapGesture$1 = new TapGestureDetectorKt$processTapGesture$1(baseContinuationImpl);
        Object obj2 = tapGestureDetectorKt$processTapGesture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$processTapGesture$1.label;
        dmz dmzVar22 = dmz.a;
        zls zlsVar62 = a;
        zy11 zy11Var22 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, bmz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(androidx.compose.ui.input.pointer.f fVar, PointerEventPass pointerEventPass, ContinuationImpl continuationImpl) {
        TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        try {
            if (continuationImpl instanceof TapGestureDetectorKt$waitForLongPress$1) {
                tapGestureDetectorKt$waitForLongPress$1 = (TapGestureDetectorKt$waitForLongPress$1) continuationImpl;
                int i2 = tapGestureDetectorKt$waitForLongPress$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tapGestureDetectorKt$waitForLongPress$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = tapGestureDetectorKt$waitForLongPress$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = tapGestureDetectorKt$waitForLongPress$1.label;
                    if (i != 0) {
                        Ref$ObjectRef z = qv10.z(obj);
                        z.element = bmz.a;
                        long f = fVar.g().f();
                        wls tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(pointerEventPass, z, null);
                        tapGestureDetectorKt$waitForLongPress$1.L$0 = z;
                        tapGestureDetectorKt$waitForLongPress$1.label = 1;
                        if (fVar.o(f, tapGestureDetectorKt$waitForLongPress$2, tapGestureDetectorKt$waitForLongPress$1) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = z;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef = (Ref$ObjectRef) tapGestureDetectorKt$waitForLongPress$1.L$0;
                        kotlin.b.b(obj);
                    }
                    return ref$ObjectRef.element;
                }
            }
            if (i != 0) {
            }
            return ref$ObjectRef.element;
        } catch (PointerEventTimeoutCancellationException unused) {
            return dmz.a;
        }
        tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(continuationImpl);
        Object obj3 = tapGestureDetectorKt$waitForLongPress$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$waitForLongPress$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (r0 == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bb -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(androidx.compose.ui.input.pointer.f fVar, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$2;
        int i;
        androidx.compose.ui.input.pointer.f fVar2;
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$22;
        PointerEventPass pointerEventPass2;
        androidx.compose.ui.input.pointer.f fVar3;
        PointerEventPass pointerEventPass3;
        int size;
        int i2;
        Object a2;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$waitForUpOrCancellation$2) {
            tapGestureDetectorKt$waitForUpOrCancellation$2 = (TapGestureDetectorKt$waitForUpOrCancellation$2) baseContinuationImpl;
            int i3 = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$2.label = i3 - Integer.MIN_VALUE;
                Object obj = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fVar2 = fVar;
                    tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                    pointerEventPass2 = pointerEventPass;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = fVar2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                    a2 = fVar2.a(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                    if (a2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                    fVar3 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                    kotlin.b.b(obj);
                    List list = ((tvd0) obj).a;
                    size = list.size();
                    while (i2 < size) {
                    }
                    return list.get(0);
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pointerEventPass3 = (PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                fVar3 = (androidx.compose.ui.input.pointer.f) tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                kotlin.b.b(obj);
                PointerEventPass pointerEventPass4 = pointerEventPass3;
                tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                pointerEventPass2 = pointerEventPass4;
                List list2 = ((tvd0) obj).a;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((zvd0) list2.get(i4)).j()) {
                        break;
                    }
                }
                fVar2 = fVar3;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = fVar2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                a2 = fVar2.a(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                if (a2 != coroutineSingletons) {
                    fVar3 = fVar2;
                    obj = a2;
                    TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$23 = tapGestureDetectorKt$waitForUpOrCancellation$22;
                    pointerEventPass3 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$2 = tapGestureDetectorKt$waitForUpOrCancellation$23;
                    List list3 = ((tvd0) obj).a;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!kx91.c((zvd0) list3.get(i2))) {
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                zvd0 zvd0Var = (zvd0) list3.get(i5);
                                if (zvd0Var.j() || kx91.f(zvd0Var, fVar3.y.C, fVar3.e())) {
                                    break;
                                }
                            }
                            PointerEventPass pointerEventPass5 = PointerEventPass.Final;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$0 = fVar3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$1 = pointerEventPass3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.label = 2;
                            obj = fVar3.a(pointerEventPass5, tapGestureDetectorKt$waitForUpOrCancellation$2);
                        }
                    }
                    return list3.get(0);
                }
                return coroutineSingletons;
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$2 = new TapGestureDetectorKt$waitForUpOrCancellation$2(baseContinuationImpl);
        Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
        if (i != 0) {
        }
    }
}
