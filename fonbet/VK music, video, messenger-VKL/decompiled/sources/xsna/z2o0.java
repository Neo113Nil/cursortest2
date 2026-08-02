package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import xsna.k500;

/* compiled from: TapGestureDetector.kt */
/* loaded from: classes11.dex */
public final class z2o0 {
    public static final a a = new a(3, null);

    /* compiled from: TapGestureDetector.kt */
    @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements yzs<j2d0, ov70, spj<? super s3q0>, Object> {
        int label;

        @Override // xsna.yzs
        public final Object invoke(j2d0 j2d0Var, ov70 ov70Var, spj<? super s3q0> spjVar) {
            long j = ov70Var.a;
            return new a(3, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE}, m = "awaitFirstDown", v = 1)
    public static final class b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return z2o0.a(null, false, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(xsna.eu5 r6, boolean r7, androidx.compose.ui.input.pointer.PointerEventPass r8, xsna.spj<? super xsna.xlb0> r9) {
        /*
            boolean r0 = r9 instanceof xsna.z2o0.b
            if (r0 == 0) goto L13
            r0 = r9
            xsna.z2o0$b r0 = (xsna.z2o0.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            xsna.z2o0$b r0 = new xsna.z2o0$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            xsna.eu5 r8 = (xsna.eu5) r8
            kotlin.a.a(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4f
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.a.a(r9)
        L40:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r9 = r6.I1(r8, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            xsna.plb0 r9 = (xsna.plb0) r9
            r2 = 0
            boolean r4 = f(r9, r7, r2)
            if (r4 == 0) goto L40
            java.util.List<xsna.xlb0> r6 = r9.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.z2o0.a(xsna.eu5, boolean, androidx.compose.ui.input.pointer.PointerEventPass, xsna.spj):java.lang.Object");
    }

    public static /* synthetic */ Object b(eu5 eu5Var, PointerEventPass pointerEventPass, spj spjVar, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return a(eu5Var, z, pointerEventPass, spjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0053 -> B:10:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(eu5 eu5Var, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        a3o0 a3o0Var;
        int i;
        PointerEventPass pointerEventPass2;
        boolean z;
        Object I1;
        if (baseContinuationImpl instanceof a3o0) {
            a3o0Var = (a3o0) baseContinuationImpl;
            int i2 = a3o0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a3o0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = a3o0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a3o0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    pointerEventPass2 = pointerEventPass;
                    z = false;
                    a3o0Var.L$0 = eu5Var;
                    a3o0Var.L$1 = pointerEventPass2;
                    a3o0Var.Z$0 = z;
                    a3o0Var.label = 1;
                    I1 = eu5Var.I1(pointerEventPass2, a3o0Var);
                    if (I1 != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = a3o0Var.Z$0;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) a3o0Var.L$1;
                    eu5 eu5Var2 = (eu5) a3o0Var.L$0;
                    kotlin.a.a(obj);
                    z = z2;
                    eu5Var = eu5Var2;
                    a3o0 a3o0Var2 = a3o0Var;
                    PointerEventPass pointerEventPass4 = pointerEventPass3;
                    plb0 plb0Var = (plb0) obj;
                    if (!f(plb0Var, z, true)) {
                        return plb0Var.a.get(0);
                    }
                    pointerEventPass2 = pointerEventPass4;
                    a3o0Var = a3o0Var2;
                    a3o0Var.L$0 = eu5Var;
                    a3o0Var.L$1 = pointerEventPass2;
                    a3o0Var.Z$0 = z;
                    a3o0Var.label = 1;
                    I1 = eu5Var.I1(pointerEventPass2, a3o0Var);
                    if (I1 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    a3o0 a3o0Var3 = a3o0Var;
                    pointerEventPass4 = pointerEventPass2;
                    obj = I1;
                    a3o0Var2 = a3o0Var3;
                    plb0 plb0Var2 = (plb0) obj;
                    if (!f(plb0Var2, z, true)) {
                    }
                }
            }
        }
        a3o0Var = new a3o0(baseContinuationImpl);
        Object obj2 = a3o0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a3o0Var.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[LOOP:0: B:11:0x0050->B:12:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0040 -> B:10:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(eu5 eu5Var, ContinuationImpl continuationImpl) {
        c3o0 c3o0Var;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuationImpl instanceof c3o0) {
            c3o0Var = (c3o0) continuationImpl;
            int i4 = c3o0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c3o0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = c3o0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c3o0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    c3o0Var.L$0 = eu5Var;
                    c3o0Var.label = 1;
                    obj = eu5Var.I1(PointerEventPass.Main, c3o0Var);
                    if (obj == coroutineSingletons) {
                    }
                    plb0 plb0Var = (plb0) obj;
                    List<xlb0> list = plb0Var.a;
                    size = list.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List<xlb0> list2 = plb0Var.a;
                    size2 = list2.size();
                    while (i2 < size2) {
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eu5Var = (eu5) c3o0Var.L$0;
                kotlin.a.a(obj);
                plb0 plb0Var2 = (plb0) obj;
                List<xlb0> list3 = plb0Var2.a;
                size = list3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    list3.get(i3).a();
                }
                List<xlb0> list22 = plb0Var2.a;
                size2 = list22.size();
                while (i2 < size2) {
                    if (list22.get(i2).d) {
                        c3o0Var.L$0 = eu5Var;
                        c3o0Var.label = 1;
                        obj = eu5Var.I1(PointerEventPass.Main, c3o0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plb0 plb0Var22 = (plb0) obj;
                        List<xlb0> list32 = plb0Var22.a;
                        size = list32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List<xlb0> list222 = plb0Var22.a;
                        size2 = list222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return s3q0.a;
            }
        }
        c3o0Var = new c3o0(continuationImpl);
        Object obj2 = c3o0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c3o0Var.label;
        if (i != 0) {
        }
    }

    public static Object e(dmb0 dmb0Var, m4t0 m4t0Var, yzs yzsVar, izs izsVar, spj spjVar, int i) {
        if ((i & 2) != 0) {
            m4t0Var = null;
        }
        m4t0 m4t0Var2 = m4t0Var;
        if ((i & 4) != 0) {
            yzsVar = a;
        }
        Object d = zvj.d(new e3o0(dmb0Var, null, m4t0Var2, yzsVar, izsVar, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }

    public static final boolean f(plb0 plb0Var, boolean z, boolean z2) {
        if (z2) {
            List<xlb0> list = plb0Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (list.get(i).i != 2) {
                        break;
                    }
                    i++;
                } else if ((plb0Var.d & 33) == 0) {
                    return false;
                }
            }
        }
        List<xlb0> list2 = plb0Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            xlb0 xlb0Var = list2.get(i2);
            if (!(z ? fdi.l(xlb0Var) : fdi.m(xlb0Var))) {
                return false;
            }
        }
        return true;
    }

    public static yok0 g(yvj yvjVar, eyx eyxVar, wzs wzsVar) {
        return myc0.h(yvjVar, null, CoroutineStart.UNDISPATCHED, new f3o0(eyxVar, wzsVar, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(eu5 eu5Var, yvj yvjVar, n2d0 n2d0Var, izs izsVar, izs izsVar2, yzs yzsVar, izs izsVar3, BaseContinuationImpl baseContinuationImpl) {
        g3o0 g3o0Var;
        int i;
        izs izsVar4;
        izs izsVar5;
        eu5 eu5Var2;
        izs izsVar6;
        yvj yvjVar2;
        n2d0 n2d0Var2;
        yzs yzsVar2;
        izs izsVar7;
        eyx eyxVar;
        eu5 eu5Var3;
        izs izsVar8;
        yzs yzsVar3;
        xlb0 xlb0Var;
        izs izsVar9;
        izs izsVar10;
        yzs yzsVar4;
        izs izsVar11;
        xlb0 xlb0Var2;
        eyx g;
        xlb0 xlb0Var3;
        izs izsVar12;
        yzs yzsVar5;
        izs izsVar13;
        k500 k500Var;
        n2d0 n2d0Var3;
        yvj yvjVar3;
        xlb0 xlb0Var4;
        eyx eyxVar2;
        xlb0 xlb0Var5;
        izs izsVar14;
        izs izsVar15;
        n2d0 n2d0Var4;
        yvj yvjVar4;
        eu5 eu5Var4;
        eyx eyxVar3;
        xlb0 xlb0Var6;
        izs izsVar16;
        izs izsVar17;
        n2d0 n2d0Var5;
        yvj yvjVar5;
        xlb0 xlb0Var7;
        k500 k500Var2;
        eyx eyxVar4;
        n2d0 n2d0Var6;
        yvj yvjVar6;
        if (baseContinuationImpl instanceof g3o0) {
            g3o0Var = (g3o0) baseContinuationImpl;
            int i2 = g3o0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g3o0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = g3o0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = g3o0Var.label;
                a aVar = a;
                switch (i) {
                    case 0:
                        kotlin.a.a(obj);
                        g3o0Var.L$0 = eu5Var;
                        g3o0Var.L$1 = yvjVar;
                        g3o0Var.L$2 = n2d0Var;
                        izsVar4 = izsVar;
                        g3o0Var.L$3 = izsVar4;
                        izsVar5 = izsVar2;
                        g3o0Var.L$4 = izsVar5;
                        g3o0Var.L$5 = yzsVar;
                        g3o0Var.L$6 = izsVar3;
                        g3o0Var.label = 1;
                        Object b2 = b(eu5Var, null, g3o0Var, 3);
                        if (b2 != coroutineSingletons) {
                            eu5Var2 = eu5Var;
                            izsVar6 = izsVar3;
                            yvjVar2 = yvjVar;
                            obj = b2;
                            n2d0Var2 = n2d0Var;
                            yzsVar2 = yzsVar;
                            xlb0 xlb0Var8 = (xlb0) obj;
                            xlb0Var8.a();
                            yok0 h = myc0.h(yvjVar2, null, CoroutineStart.UNDISPATCHED, new p3o0(n2d0Var2, null), 1);
                            if (yzsVar2 != aVar) {
                                g(yvjVar2, h, new h3o0(yzsVar2, n2d0Var2, xlb0Var8, null));
                            }
                            if (izsVar5 != null) {
                                g3o0Var.L$0 = eu5Var2;
                                g3o0Var.L$1 = yvjVar2;
                                g3o0Var.L$2 = n2d0Var2;
                                g3o0Var.L$3 = izsVar4;
                                g3o0Var.L$4 = izsVar5;
                                g3o0Var.L$5 = yzsVar2;
                                g3o0Var.L$6 = izsVar6;
                                g3o0Var.L$7 = h;
                                g3o0Var.label = 2;
                                obj = j(eu5Var2, PointerEventPass.Main, g3o0Var);
                                if (obj != coroutineSingletons) {
                                    izs izsVar18 = izsVar5;
                                    izsVar9 = izsVar4;
                                    izsVar10 = izsVar18;
                                    yzsVar4 = yzsVar2;
                                    izsVar11 = izsVar6;
                                    eyxVar = h;
                                    xlb0Var2 = (xlb0) obj;
                                    if (xlb0Var2 == null) {
                                        g = g(yvjVar2, eyxVar, new j3o0(n2d0Var2, null));
                                    } else {
                                        xlb0Var2.a();
                                        g = g(yvjVar2, eyxVar, new k3o0(n2d0Var2, null));
                                    }
                                    if (xlb0Var2 != null) {
                                        if (izsVar9 != null) {
                                            g3o0Var.L$0 = eu5Var2;
                                            g3o0Var.L$1 = yvjVar2;
                                            g3o0Var.L$2 = n2d0Var2;
                                            g3o0Var.L$3 = izsVar9;
                                            g3o0Var.L$4 = izsVar10;
                                            g3o0Var.L$5 = yzsVar4;
                                            g3o0Var.L$6 = izsVar11;
                                            g3o0Var.L$7 = xlb0Var2;
                                            g3o0Var.L$8 = g;
                                            g3o0Var.label = 5;
                                            Object L0 = eu5Var2.L0(eu5Var2.getViewConfiguration().b(), new b3o0(xlb0Var2, null), g3o0Var);
                                            if (L0 != coroutineSingletons) {
                                                izs izsVar19 = izsVar11;
                                                xlb0Var3 = xlb0Var2;
                                                obj = L0;
                                                izsVar12 = izsVar10;
                                                yzsVar5 = yzsVar4;
                                                izsVar13 = izsVar19;
                                                xlb0Var4 = (xlb0) obj;
                                                if (xlb0Var4 == null) {
                                                    yok0 h2 = myc0.h(yvjVar2, null, CoroutineStart.UNDISPATCHED, new l3o0(g, n2d0Var2, null), 1);
                                                    if (yzsVar5 != aVar) {
                                                        g(yvjVar2, h2, new m3o0(yzsVar5, n2d0Var2, xlb0Var4, null));
                                                    }
                                                    if (izsVar12 == null) {
                                                        g3o0Var.L$0 = yvjVar2;
                                                        g3o0Var.L$1 = n2d0Var2;
                                                        g3o0Var.L$2 = izsVar9;
                                                        g3o0Var.L$3 = izsVar13;
                                                        g3o0Var.L$4 = h2;
                                                        g3o0Var.L$5 = xlb0Var3;
                                                        g3o0Var.L$6 = null;
                                                        g3o0Var.L$7 = null;
                                                        g3o0Var.L$8 = null;
                                                        g3o0Var.label = 6;
                                                        obj = j(eu5Var2, PointerEventPass.Main, g3o0Var);
                                                        if (obj != coroutineSingletons) {
                                                            eyxVar3 = h2;
                                                            xlb0Var6 = xlb0Var3;
                                                            izsVar16 = izsVar13;
                                                            izsVar17 = izsVar9;
                                                            n2d0Var5 = n2d0Var2;
                                                            yvjVar5 = yvjVar2;
                                                            xlb0Var7 = (xlb0) obj;
                                                            if (xlb0Var7 != null) {
                                                                xlb0Var7.a();
                                                                g(yvjVar5, eyxVar3, new n3o0(n2d0Var5, null));
                                                                izsVar17.invoke(new ov70(xlb0Var7.c));
                                                            } else {
                                                                g(yvjVar5, eyxVar3, new o3o0(n2d0Var5, null));
                                                                if (izsVar16 != null) {
                                                                    izsVar16.invoke(new ov70(xlb0Var6.c));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        g3o0Var.L$0 = eu5Var2;
                                                        g3o0Var.L$1 = yvjVar2;
                                                        g3o0Var.L$2 = n2d0Var2;
                                                        g3o0Var.L$3 = izsVar9;
                                                        g3o0Var.L$4 = izsVar12;
                                                        g3o0Var.L$5 = izsVar13;
                                                        g3o0Var.L$6 = h2;
                                                        g3o0Var.L$7 = xlb0Var3;
                                                        g3o0Var.L$8 = xlb0Var4;
                                                        g3o0Var.label = 7;
                                                        Object i3 = i(eu5Var2, PointerEventPass.Main, g3o0Var);
                                                        if (i3 != coroutineSingletons) {
                                                            izs izsVar20 = izsVar13;
                                                            eyxVar2 = h2;
                                                            xlb0Var5 = xlb0Var4;
                                                            obj = i3;
                                                            izsVar14 = izsVar20;
                                                            izsVar15 = izsVar9;
                                                            n2d0Var4 = n2d0Var2;
                                                            yvjVar4 = yvjVar2;
                                                            eu5Var4 = eu5Var2;
                                                            k500Var2 = (k500) obj;
                                                            if (epx.f(k500Var2, k500.c.a)) {
                                                                if (k500Var2 instanceof k500.b) {
                                                                    xlb0Var7 = ((k500.b) k500Var2).a;
                                                                    xlb0Var6 = xlb0Var3;
                                                                    eyxVar3 = eyxVar2;
                                                                    izsVar16 = izsVar14;
                                                                } else {
                                                                    if (!(k500Var2 instanceof k500.a)) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    xlb0Var6 = xlb0Var3;
                                                                    eyxVar3 = eyxVar2;
                                                                    izsVar16 = izsVar14;
                                                                    xlb0Var7 = null;
                                                                }
                                                                izsVar17 = izsVar15;
                                                                n2d0Var5 = n2d0Var4;
                                                                yvjVar5 = yvjVar4;
                                                                if (xlb0Var7 != null) {
                                                                }
                                                            } else {
                                                                izsVar12.invoke(new ov70(xlb0Var5.c));
                                                                g3o0Var.L$0 = yvjVar4;
                                                                g3o0Var.L$1 = n2d0Var4;
                                                                g3o0Var.L$2 = eyxVar2;
                                                                g3o0Var.L$3 = null;
                                                                g3o0Var.L$4 = null;
                                                                g3o0Var.L$5 = null;
                                                                g3o0Var.L$6 = null;
                                                                g3o0Var.L$7 = null;
                                                                g3o0Var.L$8 = null;
                                                                g3o0Var.label = 8;
                                                                if (d(eu5Var4, g3o0Var) != coroutineSingletons) {
                                                                    eyxVar4 = eyxVar2;
                                                                    n2d0Var6 = n2d0Var4;
                                                                    yvjVar6 = yvjVar4;
                                                                    g(yvjVar6, eyxVar4, new q3o0(n2d0Var6, null));
                                                                    return s3q0.a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (izsVar13 != null) {
                                                    izsVar13.invoke(new ov70(xlb0Var3.c));
                                                }
                                            }
                                        } else if (izsVar11 != null) {
                                            izsVar11.invoke(new ov70(xlb0Var2.c));
                                        }
                                    }
                                    return s3q0.a;
                                }
                            } else {
                                g3o0Var.L$0 = eu5Var2;
                                g3o0Var.L$1 = yvjVar2;
                                g3o0Var.L$2 = n2d0Var2;
                                g3o0Var.L$3 = izsVar4;
                                g3o0Var.L$4 = izsVar5;
                                g3o0Var.L$5 = yzsVar2;
                                g3o0Var.L$6 = izsVar6;
                                g3o0Var.L$7 = xlb0Var8;
                                g3o0Var.L$8 = h;
                                g3o0Var.label = 3;
                                Object i4 = i(eu5Var2, PointerEventPass.Main, g3o0Var);
                                if (i4 != coroutineSingletons) {
                                    izsVar7 = izsVar6;
                                    eyxVar = h;
                                    eu5Var3 = eu5Var2;
                                    izsVar8 = izsVar4;
                                    yzsVar3 = yzsVar2;
                                    xlb0Var = xlb0Var8;
                                    obj = i4;
                                    k500Var = (k500) obj;
                                    if (epx.f(k500Var, k500.c.a)) {
                                        if (k500Var instanceof k500.b) {
                                            xlb0Var2 = ((k500.b) k500Var).a;
                                        } else {
                                            if (!(k500Var instanceof k500.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            xlb0Var2 = null;
                                        }
                                        izsVar11 = izsVar7;
                                        yzsVar4 = yzsVar3;
                                        izsVar10 = izsVar5;
                                        izsVar9 = izsVar8;
                                        eu5Var2 = eu5Var3;
                                        if (xlb0Var2 == null) {
                                        }
                                        if (xlb0Var2 != null) {
                                        }
                                        return s3q0.a;
                                    }
                                    izsVar5.invoke(new ov70(xlb0Var.c));
                                    g3o0Var.L$0 = yvjVar2;
                                    g3o0Var.L$1 = n2d0Var2;
                                    g3o0Var.L$2 = eyxVar;
                                    g3o0Var.L$3 = null;
                                    g3o0Var.L$4 = null;
                                    g3o0Var.L$5 = null;
                                    g3o0Var.L$6 = null;
                                    g3o0Var.L$7 = null;
                                    g3o0Var.L$8 = null;
                                    g3o0Var.label = 4;
                                    if (d(eu5Var3, g3o0Var) != coroutineSingletons) {
                                        n2d0Var3 = n2d0Var2;
                                        yvjVar3 = yvjVar2;
                                        g(yvjVar3, eyxVar, new i3o0(n2d0Var3, null));
                                        return s3q0.a;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        izsVar6 = (izs) g3o0Var.L$6;
                        yzsVar2 = (yzs) g3o0Var.L$5;
                        izs izsVar21 = (izs) g3o0Var.L$4;
                        izs izsVar22 = (izs) g3o0Var.L$3;
                        n2d0Var2 = (n2d0) g3o0Var.L$2;
                        yvjVar2 = (yvj) g3o0Var.L$1;
                        eu5Var2 = (eu5) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        izsVar5 = izsVar21;
                        izsVar4 = izsVar22;
                        xlb0 xlb0Var82 = (xlb0) obj;
                        xlb0Var82.a();
                        yok0 h3 = myc0.h(yvjVar2, null, CoroutineStart.UNDISPATCHED, new p3o0(n2d0Var2, null), 1);
                        if (yzsVar2 != aVar) {
                        }
                        if (izsVar5 != null) {
                        }
                        return coroutineSingletons;
                    case 2:
                        eyxVar = (eyx) g3o0Var.L$7;
                        izsVar11 = (izs) g3o0Var.L$6;
                        yzsVar4 = (yzs) g3o0Var.L$5;
                        izsVar10 = (izs) g3o0Var.L$4;
                        izsVar9 = (izs) g3o0Var.L$3;
                        n2d0Var2 = (n2d0) g3o0Var.L$2;
                        yvjVar2 = (yvj) g3o0Var.L$1;
                        eu5Var2 = (eu5) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        xlb0Var2 = (xlb0) obj;
                        if (xlb0Var2 == null) {
                        }
                        if (xlb0Var2 != null) {
                        }
                        return s3q0.a;
                    case 3:
                        eyxVar = (eyx) g3o0Var.L$8;
                        xlb0Var = (xlb0) g3o0Var.L$7;
                        izsVar7 = (izs) g3o0Var.L$6;
                        yzsVar3 = (yzs) g3o0Var.L$5;
                        izsVar5 = (izs) g3o0Var.L$4;
                        izs izsVar23 = (izs) g3o0Var.L$3;
                        n2d0 n2d0Var7 = (n2d0) g3o0Var.L$2;
                        yvj yvjVar7 = (yvj) g3o0Var.L$1;
                        eu5Var3 = (eu5) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        izsVar8 = izsVar23;
                        n2d0Var2 = n2d0Var7;
                        yvjVar2 = yvjVar7;
                        k500Var = (k500) obj;
                        if (epx.f(k500Var, k500.c.a)) {
                        }
                        break;
                    case 4:
                        eyxVar = (eyx) g3o0Var.L$2;
                        n2d0Var3 = (n2d0) g3o0Var.L$1;
                        yvjVar3 = (yvj) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        g(yvjVar3, eyxVar, new i3o0(n2d0Var3, null));
                        return s3q0.a;
                    case 5:
                        g = (eyx) g3o0Var.L$8;
                        xlb0Var3 = (xlb0) g3o0Var.L$7;
                        izsVar13 = (izs) g3o0Var.L$6;
                        yzsVar5 = (yzs) g3o0Var.L$5;
                        izs izsVar24 = (izs) g3o0Var.L$4;
                        izs izsVar25 = (izs) g3o0Var.L$3;
                        n2d0 n2d0Var8 = (n2d0) g3o0Var.L$2;
                        yvj yvjVar8 = (yvj) g3o0Var.L$1;
                        eu5 eu5Var5 = (eu5) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        izsVar12 = izsVar24;
                        izsVar9 = izsVar25;
                        n2d0Var2 = n2d0Var8;
                        yvjVar2 = yvjVar8;
                        eu5Var2 = eu5Var5;
                        xlb0Var4 = (xlb0) obj;
                        if (xlb0Var4 == null) {
                        }
                        break;
                    case 6:
                        xlb0Var6 = (xlb0) g3o0Var.L$5;
                        eyxVar3 = (eyx) g3o0Var.L$4;
                        izsVar16 = (izs) g3o0Var.L$3;
                        izsVar17 = (izs) g3o0Var.L$2;
                        n2d0Var5 = (n2d0) g3o0Var.L$1;
                        yvjVar5 = (yvj) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        xlb0Var7 = (xlb0) obj;
                        if (xlb0Var7 != null) {
                        }
                        return s3q0.a;
                    case 7:
                        xlb0Var5 = (xlb0) g3o0Var.L$8;
                        xlb0Var3 = (xlb0) g3o0Var.L$7;
                        eyxVar2 = (eyx) g3o0Var.L$6;
                        izsVar14 = (izs) g3o0Var.L$5;
                        izsVar12 = (izs) g3o0Var.L$4;
                        izsVar15 = (izs) g3o0Var.L$3;
                        n2d0Var4 = (n2d0) g3o0Var.L$2;
                        yvjVar4 = (yvj) g3o0Var.L$1;
                        eu5Var4 = (eu5) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        k500Var2 = (k500) obj;
                        if (epx.f(k500Var2, k500.c.a)) {
                        }
                        break;
                    case 8:
                        eyxVar4 = (eyx) g3o0Var.L$2;
                        n2d0Var6 = (n2d0) g3o0Var.L$1;
                        yvjVar6 = (yvj) g3o0Var.L$0;
                        kotlin.a.a(obj);
                        g(yvjVar6, eyxVar4, new q3o0(n2d0Var6, null));
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        g3o0Var = new g3o0(baseContinuationImpl);
        Object obj2 = g3o0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = g3o0Var.label;
        a aVar2 = a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, xsna.k500$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(eu5 eu5Var, PointerEventPass pointerEventPass, ContinuationImpl continuationImpl) {
        r3o0 r3o0Var;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        try {
            if (continuationImpl instanceof r3o0) {
                r3o0Var = (r3o0) continuationImpl;
                int i2 = r3o0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    r3o0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = r3o0Var.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = r3o0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        ref$ObjectRef2.element = k500.a.a;
                        long c = eu5Var.getViewConfiguration().c();
                        wzs s3o0Var = new s3o0(pointerEventPass, ref$ObjectRef2, null);
                        r3o0Var.L$0 = ref$ObjectRef2;
                        r3o0Var.label = 1;
                        if (eu5Var.f0(c, s3o0Var, r3o0Var) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ref$ObjectRef = (Ref$ObjectRef) r3o0Var.L$0;
                        kotlin.a.a(obj);
                    }
                    return ref$ObjectRef.element;
                }
            }
            if (i != 0) {
            }
            return ref$ObjectRef.element;
        } catch (PointerEventTimeoutCancellationException unused) {
            return k500.c.a;
        }
        r3o0Var = new r3o0(continuationImpl);
        Object obj3 = r3o0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r3o0Var.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ac -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(eu5 eu5Var, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        t3o0 t3o0Var;
        int i;
        eu5 eu5Var2;
        PointerEventPass pointerEventPass2;
        int size;
        int i2;
        if (baseContinuationImpl instanceof t3o0) {
            t3o0Var = (t3o0) baseContinuationImpl;
            int i3 = t3o0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t3o0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = t3o0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = t3o0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    t3o0Var.L$0 = eu5Var;
                    t3o0Var.L$1 = pointerEventPass;
                    t3o0Var.label = 1;
                    obj = eu5Var.I1(pointerEventPass, t3o0Var);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    pointerEventPass2 = (PointerEventPass) t3o0Var.L$1;
                    eu5Var2 = (eu5) t3o0Var.L$0;
                    kotlin.a.a(obj);
                    List<xlb0> list = ((plb0) obj).a;
                    size = list.size();
                    while (i2 < size) {
                    }
                    return list.get(0);
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pointerEventPass2 = (PointerEventPass) t3o0Var.L$1;
                eu5Var2 = (eu5) t3o0Var.L$0;
                kotlin.a.a(obj);
                eu5 eu5Var3 = eu5Var2;
                pointerEventPass = pointerEventPass2;
                eu5Var = eu5Var3;
                List<xlb0> list2 = ((plb0) obj).a;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (list2.get(i4).c()) {
                        return null;
                    }
                }
                t3o0Var.L$0 = eu5Var;
                t3o0Var.L$1 = pointerEventPass;
                t3o0Var.label = 1;
                obj = eu5Var.I1(pointerEventPass, t3o0Var);
                if (obj != coroutineSingletons) {
                    PointerEventPass pointerEventPass3 = pointerEventPass;
                    eu5Var2 = eu5Var;
                    pointerEventPass2 = pointerEventPass3;
                    List<xlb0> list3 = ((plb0) obj).a;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!fdi.n(list3.get(i2))) {
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                xlb0 xlb0Var = list3.get(i5);
                                if (xlb0Var.c() || fdi.z(xlb0Var, eu5Var2.a(), eu5Var2.A1())) {
                                    return null;
                                }
                            }
                            PointerEventPass pointerEventPass4 = PointerEventPass.Final;
                            t3o0Var.L$0 = eu5Var2;
                            t3o0Var.L$1 = pointerEventPass2;
                            t3o0Var.label = 2;
                            obj = eu5Var2.I1(pointerEventPass4, t3o0Var);
                        }
                    }
                    return list3.get(0);
                }
                return coroutineSingletons;
            }
        }
        t3o0Var = new t3o0(baseContinuationImpl);
        Object obj2 = t3o0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = t3o0Var.label;
        if (i != 0) {
        }
    }
}
