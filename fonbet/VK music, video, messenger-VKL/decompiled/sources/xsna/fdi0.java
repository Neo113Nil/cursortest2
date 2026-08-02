package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.zbi0;

/* compiled from: SelectionGestures.kt */
/* loaded from: classes11.dex */
public final class fdi0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:10:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(eu5 eu5Var, BaseContinuationImpl baseContinuationImpl) {
        yci0 yci0Var;
        int i;
        int size;
        int i2;
        if (baseContinuationImpl instanceof yci0) {
            yci0Var = (yci0) baseContinuationImpl;
            int i3 = yci0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yci0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = yci0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yci0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    yci0Var.L$0 = eu5Var;
                    yci0Var.label = 1;
                    obj = eu5Var.I1(pointerEventPass, yci0Var);
                    if (obj == coroutineSingletons) {
                    }
                    plb0 plb0Var = (plb0) obj;
                    List<xlb0> list = plb0Var.a;
                    size = list.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return plb0Var;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eu5Var = (eu5) yci0Var.L$0;
                kotlin.a.a(obj);
                plb0 plb0Var2 = (plb0) obj;
                List<xlb0> list2 = plb0Var2.a;
                size = list2.size();
                i2 = 0;
                while (i2 < size) {
                    if (fdi.l(list2.get(i2))) {
                        i2++;
                    } else {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                        yci0Var.L$0 = eu5Var;
                        yci0Var.label = 1;
                        obj = eu5Var.I1(pointerEventPass2, yci0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plb0 plb0Var22 = (plb0) obj;
                        List<xlb0> list22 = plb0Var22.a;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return plb0Var22;
            }
        }
        yci0Var = new yci0(baseContinuationImpl);
        Object obj2 = yci0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yci0Var.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r14 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0 A[Catch: CancellationException -> 0x0035, TryCatch #1 {CancellationException -> 0x0035, blocks: (B:12:0x0030, B:13:0x00d5, B:15:0x00dd, B:17:0x00ed, B:19:0x00f9, B:21:0x00fc, B:24:0x00ff, B:28:0x0103, B:35:0x009c, B:37:0x00a0, B:38:0x00a2, B:40:0x00a6, B:42:0x00ac, B:44:0x00b0, B:46:0x00b6, B:48:0x00ba, B:49:0x00bf, B:58:0x005c, B:60:0x006a, B:61:0x006f, B:64:0x006d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[Catch: CancellationException -> 0x0035, TryCatch #1 {CancellationException -> 0x0035, blocks: (B:12:0x0030, B:13:0x00d5, B:15:0x00dd, B:17:0x00ed, B:19:0x00f9, B:21:0x00fc, B:24:0x00ff, B:28:0x0103, B:35:0x009c, B:37:0x00a0, B:38:0x00a2, B:40:0x00a6, B:42:0x00ac, B:44:0x00b0, B:46:0x00b6, B:48:0x00ba, B:49:0x00bf, B:58:0x005c, B:60:0x006a, B:61:0x006f, B:64:0x006d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[Catch: CancellationException -> 0x0035, TryCatch #1 {CancellationException -> 0x0035, blocks: (B:12:0x0030, B:13:0x00d5, B:15:0x00dd, B:17:0x00ed, B:19:0x00f9, B:21:0x00fc, B:24:0x00ff, B:28:0x0103, B:35:0x009c, B:37:0x00a0, B:38:0x00a2, B:40:0x00a6, B:42:0x00ac, B:44:0x00b0, B:46:0x00b6, B:48:0x00ba, B:49:0x00bf, B:58:0x005c, B:60:0x006a, B:61:0x006f, B:64:0x006d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(eu5 eu5Var, zdo0 zdo0Var, plb0 plb0Var, int i, BaseContinuationImpl baseContinuationImpl) {
        cdi0 cdi0Var;
        int i2;
        long j;
        Ref$LongRef ref$LongRef;
        m7o m7oVar;
        try {
            if (baseContinuationImpl instanceof cdi0) {
                cdi0Var = (cdi0) baseContinuationImpl;
                int i3 = cdi0Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    cdi0Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = cdi0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = cdi0Var.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        xlb0 xlb0Var = (xlb0) j5g.Y(plb0Var.a);
                        j = xlb0Var.a;
                        zdo0Var.c(xlb0Var.c, i > 2 ? zbi0.a.c : zbi0.a.b);
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = 9205357640488583168L;
                        long c = eu5Var.getViewConfiguration().c();
                        ddi0 ddi0Var = new ddi0(j, ref$LongRef, null);
                        cdi0Var.L$0 = eu5Var;
                        cdi0Var.L$1 = zdo0Var;
                        cdi0Var.L$2 = ref$LongRef;
                        cdi0Var.J$0 = j;
                        cdi0Var.label = 1;
                        obj = eu5Var.L0(c, ddi0Var, cdi0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zdo0Var = (zdo0) cdi0Var.L$1;
                            eu5Var = (eu5) cdi0Var.L$0;
                            kotlin.a.a(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<xlb0> list = eu5Var.z0().a;
                                int size = list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    xlb0 xlb0Var2 = list.get(i4);
                                    if (fdi.n(xlb0Var2)) {
                                        xlb0Var2.a();
                                    }
                                }
                                zdo0Var.onStop();
                            } else {
                                zdo0Var.onCancel();
                            }
                            return s3q0.a;
                        }
                        long j2 = cdi0Var.J$0;
                        ref$LongRef = (Ref$LongRef) cdi0Var.L$2;
                        zdo0 zdo0Var2 = (zdo0) cdi0Var.L$1;
                        eu5 eu5Var2 = (eu5) cdi0Var.L$0;
                        try {
                            kotlin.a.a(obj);
                            j = j2;
                            zdo0Var = zdo0Var2;
                            eu5Var = eu5Var2;
                        } catch (CancellationException e) {
                            e = e;
                            zdo0Var = zdo0Var2;
                            zdo0Var.onCancel();
                            throw e;
                        }
                    }
                    m7oVar = (m7o) obj;
                    if (m7oVar == null) {
                        m7oVar = m7o.Timeout;
                    }
                    if (m7oVar != m7o.Cancel) {
                        zdo0Var.onCancel();
                        return s3q0.a;
                    }
                    if (m7oVar == m7o.Up) {
                        zdo0Var.onStop();
                        return s3q0.a;
                    }
                    if (m7oVar == m7o.Drag) {
                        zdo0Var.d(ref$LongRef.element);
                    }
                    m360 m360Var = new m360(zdo0Var, 16);
                    cdi0Var.L$0 = eu5Var;
                    cdi0Var.L$1 = zdo0Var;
                    cdi0Var.L$2 = null;
                    cdi0Var.label = 2;
                    obj = lgo.h(eu5Var, j, m360Var, cdi0Var);
                }
            }
            if (i2 != 0) {
            }
            m7oVar = (m7o) obj;
            if (m7oVar == null) {
            }
            if (m7oVar != m7o.Cancel) {
            }
        } catch (CancellationException e2) {
            e = e2;
        }
        cdi0Var = new cdi0(baseContinuationImpl);
        Object obj2 = cdi0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cdi0Var.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010e A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0033, B:13:0x00f3, B:15:0x00fb, B:17:0x00ff, B:19:0x010e, B:21:0x011a, B:62:0x00cc), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:34:0x004c, B:35:0x0083, B:37:0x008b, B:39:0x009a, B:41:0x00a6, B:52:0x006a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(eu5 eu5Var, ub30 ub30Var, ykc ykcVar, plb0 plb0Var, BaseContinuationImpl baseContinuationImpl) {
        adi0 adi0Var;
        int i;
        eu5 eu5Var2;
        Ref$BooleanRef ref$BooleanRef;
        int size;
        try {
            try {
                if (baseContinuationImpl instanceof adi0) {
                    adi0Var = (adi0) baseContinuationImpl;
                    int i2 = adi0Var.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        adi0Var.label = i2 - Integer.MIN_VALUE;
                        Object obj = adi0Var.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = adi0Var.label;
                        int i3 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                ub30Var = (ub30) adi0Var.L$1;
                                eu5Var = (eu5) adi0Var.L$0;
                                kotlin.a.a(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List<xlb0> list = eu5Var.z0().a;
                                    int size2 = list.size();
                                    while (i3 < size2) {
                                        xlb0 xlb0Var = list.get(i3);
                                        if (fdi.n(xlb0Var)) {
                                            xlb0Var.a();
                                        }
                                        i3++;
                                    }
                                }
                                return s3q0.a;
                            }
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ref$BooleanRef = (Ref$BooleanRef) adi0Var.L$2;
                            ub30Var = (ub30) adi0Var.L$1;
                            eu5Var2 = (eu5) adi0Var.L$0;
                            kotlin.a.a(obj);
                            if (((Boolean) obj).booleanValue() && ref$BooleanRef.element) {
                                List<xlb0> list2 = eu5Var2.z0().a;
                                size = list2.size();
                                while (i3 < size) {
                                    xlb0 xlb0Var2 = list2.get(i3);
                                    if (fdi.n(xlb0Var2)) {
                                        xlb0Var2.a();
                                    }
                                    i3++;
                                }
                            }
                            ub30Var.a();
                            return s3q0.a;
                        }
                        kotlin.a.a(obj);
                        xlb0 xlb0Var3 = plb0Var.a.get(0);
                        if ((plb0Var.e & 1) != 0) {
                            if (ub30Var.c(xlb0Var3.c)) {
                                xlb0Var3.a();
                                long j = xlb0Var3.a;
                                ba40 ba40Var = new ba40(ub30Var, 23);
                                adi0Var.L$0 = eu5Var;
                                adi0Var.L$1 = ub30Var;
                                adi0Var.label = 1;
                                obj = lgo.h(eu5Var, j, ba40Var, adi0Var);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return s3q0.a;
                        }
                        int i4 = ykcVar.b;
                        zbi0 zbi0Var = i4 != 1 ? i4 != 2 ? zbi0.a.c : zbi0.a.b : zbi0.a.a;
                        if (ub30Var.b(xlb0Var3.c, zbi0Var, i4)) {
                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                            ref$BooleanRef2.element = !zbi0Var.equals(r12);
                            long j2 = xlb0Var3.a;
                            com.vk.video.ui.discovery.minimizable.related_videos.j jVar = new com.vk.video.ui.discovery.minimizable.related_videos.j(ub30Var, zbi0Var, ref$BooleanRef2, 11);
                            adi0Var.L$0 = eu5Var;
                            adi0Var.L$1 = ub30Var;
                            adi0Var.L$2 = ref$BooleanRef2;
                            adi0Var.label = 2;
                            obj = lgo.h(eu5Var, j2, jVar, adi0Var);
                            if (obj != coroutineSingletons) {
                                eu5Var2 = eu5Var;
                                ref$BooleanRef = ref$BooleanRef2;
                                if (((Boolean) obj).booleanValue()) {
                                    List<xlb0> list22 = eu5Var2.z0().a;
                                    size = list22.size();
                                    while (i3 < size) {
                                    }
                                }
                                ub30Var.a();
                            }
                            return coroutineSingletons;
                        }
                        return s3q0.a;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        adi0Var = new adi0(baseContinuationImpl);
        Object obj2 = adi0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = adi0Var.label;
        int i32 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:12:0x0030, B:13:0x00af, B:15:0x00b7, B:17:0x00c6, B:19:0x00d2, B:21:0x00d5, B:24:0x00d8, B:28:0x00dc, B:32:0x004c, B:34:0x006f, B:36:0x0073, B:40:0x0091, B:45:0x0056), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(eu5 eu5Var, zdo0 zdo0Var, plb0 plb0Var, BaseContinuationImpl baseContinuationImpl) {
        bdi0 bdi0Var;
        int i;
        xlb0 xlb0Var;
        xlb0 xlb0Var2;
        try {
            if (baseContinuationImpl instanceof bdi0) {
                bdi0Var = (bdi0) baseContinuationImpl;
                int i2 = bdi0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bdi0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = bdi0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bdi0Var.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        xlb0Var = (xlb0) j5g.Y(plb0Var.a);
                        long j = xlb0Var.a;
                        bdi0Var.L$0 = eu5Var;
                        bdi0Var.L$1 = zdo0Var;
                        bdi0Var.L$2 = xlb0Var;
                        bdi0Var.label = 1;
                        obj = lgo.d(eu5Var, j, bdi0Var);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zdo0Var = (zdo0) bdi0Var.L$1;
                            eu5Var = (eu5) bdi0Var.L$0;
                            kotlin.a.a(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List<xlb0> list = eu5Var.z0().a;
                                int size = list.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    xlb0 xlb0Var3 = list.get(i3);
                                    if (fdi.n(xlb0Var3)) {
                                        xlb0Var3.a();
                                    }
                                }
                                zdo0Var.onStop();
                            } else {
                                zdo0Var.onCancel();
                            }
                            return s3q0.a;
                        }
                        xlb0 xlb0Var4 = (xlb0) bdi0Var.L$2;
                        zdo0Var = (zdo0) bdi0Var.L$1;
                        eu5 eu5Var2 = (eu5) bdi0Var.L$0;
                        kotlin.a.a(obj);
                        xlb0Var = xlb0Var4;
                        eu5Var = eu5Var2;
                    }
                    xlb0Var2 = (xlb0) obj;
                    if (xlb0Var2 != null) {
                        long j2 = xlb0Var2.c;
                        if (ov70.d(ov70.e(xlb0Var.c, j2)) >= lgo.k(eu5Var.getViewConfiguration(), xlb0Var.i)) {
                            z = false;
                        }
                        if (z) {
                            zdo0Var.c(j2, gdi0.a);
                            long j3 = xlb0Var2.a;
                            el30 el30Var = new el30(zdo0Var, 26);
                            bdi0Var.L$0 = eu5Var;
                            bdi0Var.L$1 = zdo0Var;
                            bdi0Var.L$2 = null;
                            bdi0Var.label = 2;
                            obj = lgo.h(eu5Var, j3, el30Var, bdi0Var);
                        }
                    }
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            xlb0Var2 = (xlb0) obj;
            if (xlb0Var2 != null) {
            }
            return s3q0.a;
        } catch (CancellationException e) {
            zdo0Var.onCancel();
            throw e;
        }
        bdi0Var = new bdi0(baseContinuationImpl);
        Object obj2 = bdi0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bdi0Var.label;
        boolean z2 = true;
    }
}
