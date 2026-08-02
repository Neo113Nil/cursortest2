package xsna;

import android.util.Size;
import com.vk.core.preference.Preference;
import com.vk.network.proxy.verifier.VkProxyPoll;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import xsna.eyx;
import xsna.hcj0;
import xsna.m0t;

/* loaded from: classes11.dex */
public final class rsr implements vyp, qev0 {
    public static final rsr b = new rsr();
    public static bpn0 c;

    public static final z7f0 e(caj0 caj0Var) {
        return new z7f0(caj0Var, null);
    }

    public static final b8f0 f(xh50 xh50Var) {
        return new b8f0(xh50Var, null);
    }

    public static Size g(aar0 aar0Var) {
        return aar0Var.a() < 40.0f ? new Size(12, 12) : aar0Var.a() < 56.0f ? new Size(16, 16) : aar0Var.a() < 72.0f ? new Size(20, 20) : new Size(24, 24);
    }

    public static ksr h(ksr ksrVar, int i) {
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(lhg.a(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return ksrVar instanceof m0t ? m0t.a.a((m0t) ksrVar, null, i2, bufferOverflow2, 1) : new wya(ksrVar, null, i2, bufferOverflow2, 2);
    }

    public static final nb9 i(wzs wzsVar) {
        return new nb9(wzsVar, EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable j(ksr ksrVar, lsr lsrVar, ContinuationImpl continuationImpl) {
        ctr ctrVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        eyx eyxVar;
        CancellationException I;
        if (continuationImpl instanceof ctr) {
            ctrVar = (ctr) continuationImpl;
            int i2 = ctrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ctrVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ctrVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ctrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        dtr dtrVar = new dtr(ref$ObjectRef2, lsrVar);
                        ctrVar.L$0 = ref$ObjectRef2;
                        ctrVar.label = 1;
                        if (ksrVar.collect(dtrVar, ctrVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) ctrVar.L$0;
                    try {
                        kotlin.a.a(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) ref$ObjectRef.element;
                if ((th == null && th.equals(th)) || ((eyxVar = (eyx) ctrVar.getContext().get(eyx.a.b)) != null && eyxVar.isCancelled() && (I = eyxVar.I()) != null && I.equals(th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    mnh0.d(th, th);
                    throw th;
                }
                mnh0.d(th, th);
                throw th;
            }
        }
        ctrVar = new ctr(continuationImpl);
        Object obj2 = ctrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ctrVar.label;
        if (i != 0) {
        }
        th = (Throwable) ref$ObjectRef.element;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    public static final Object k(ksr ksrVar, wzs wzsVar, spj spjVar) {
        int i = mtr.a;
        Object collect = h(y(ksrVar, new ltr(wzsVar, null)), 0).collect(x670.b, spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (collect != coroutineSingletons) {
            collect = s3q0.a;
        }
        return collect == coroutineSingletons ? collect : s3q0.a;
    }

    public static final ksr l(ksr ksrVar) {
        return ksrVar instanceof ttk0 ? ksrVar : atr.a(ksrVar, atr.b, atr.c);
    }

    public static final Object m(lsr lsrVar, ksr ksrVar, SuspendLambda suspendLambda) {
        if (lsrVar instanceof cso0) {
            throw ((cso0) lsrVar).b;
        }
        Object collect = ksrVar.collect(lsrVar, suspendLambda);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, xsna.con0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(ksr ksrVar, spj spjVar) {
        otr otrVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        ntr ntrVar;
        T t;
        ?? r0 = tyx.h;
        if (spjVar instanceof otr) {
            otrVar = (otr) spjVar;
            int i2 = otrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                otrVar.label = i2 - Integer.MIN_VALUE;
                Object obj = otrVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = otrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = r0;
                    ntr ntrVar2 = new ntr(ref$ObjectRef2);
                    try {
                        otrVar.L$0 = ref$ObjectRef2;
                        otrVar.L$1 = ntrVar2;
                        otrVar.label = 1;
                        if (ksrVar.collect(ntrVar2, otrVar) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        ntrVar = ntrVar2;
                        if (e.b == ntrVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ntrVar = (ntr) otrVar.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) otrVar.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.b == ntrVar) {
                            throw e;
                        }
                        iyx.e(otrVar.getContext());
                        t = ref$ObjectRef.element;
                        if (t != r0) {
                        }
                    }
                }
                t = ref$ObjectRef.element;
                if (t != r0) {
                    return t;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        otrVar = new otr(spjVar);
        Object obj3 = otrVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = otrVar.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t != r0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, xsna.con0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(ksr ksrVar, wzs wzsVar, ContinuationImpl continuationImpl) {
        ptr ptrVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        T t;
        ?? r0 = tyx.h;
        if (continuationImpl instanceof ptr) {
            ptrVar = (ptr) continuationImpl;
            int i2 = ptrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ptrVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ptrVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ptrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = r0;
                    FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$22 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(wzsVar, ref$ObjectRef2);
                    try {
                        ptrVar.L$0 = ref$ObjectRef2;
                        ptrVar.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$22;
                        ptrVar.label = 1;
                        if (ksrVar.collect(flowKt__ReduceKt$first$$inlined$collectWhile$22, ptrVar) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$$inlined$collectWhile$22;
                        if (e.b == flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) ptrVar.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) ptrVar.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.b == flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                            throw e;
                        }
                        iyx.e(ptrVar.getContext());
                        t = ref$ObjectRef.element;
                        if (t != r0) {
                        }
                    }
                }
                t = ref$ObjectRef.element;
                if (t != r0) {
                    return t;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        ptrVar = new ptr(continuationImpl);
        Object obj3 = ptrVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ptrVar.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t != r0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(ksr ksrVar, spj spjVar) {
        rtr rtrVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        qtr qtrVar;
        if (spjVar instanceof rtr) {
            rtrVar = (rtr) spjVar;
            int i2 = rtrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rtrVar.label = i2 - Integer.MIN_VALUE;
                Object obj = rtrVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rtrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    qtr qtrVar2 = new qtr(ref$ObjectRef2);
                    try {
                        rtrVar.L$0 = ref$ObjectRef2;
                        rtrVar.L$1 = qtrVar2;
                        rtrVar.label = 1;
                        if (ksrVar.collect(qtrVar2, rtrVar) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        qtrVar = qtrVar2;
                        if (e.b == qtrVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qtrVar = (qtr) rtrVar.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) rtrVar.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.b == qtrVar) {
                            throw e;
                        }
                        iyx.e(rtrVar.getContext());
                        return ref$ObjectRef.element;
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        rtrVar = new rtr(spjVar);
        Object obj3 = rtrVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rtrVar.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }

    public static final ksr q(ksr ksrVar, kotlin.coroutines.d dVar) {
        if (dVar.get(eyx.a.b) == null) {
            return dVar.equals(EmptyCoroutineContext.b) ? ksrVar : ksrVar instanceof m0t ? m0t.a.a((m0t) ksrVar, dVar, 0, null, 6) : new wya(ksrVar, dVar, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
    }

    public static final fxq r() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (fxq) bpn0Var.getValue();
    }

    public static final yok0 s(ksr ksrVar, yvj yvjVar) {
        return myc0.h(yvjVar, null, null, new usr(ksrVar, null), 3);
    }

    public static final z7f0 t(ksr ksrVar, yvj yvjVar, int i) {
        lbj0 a = xtr.a(ksrVar, i);
        caj0 a2 = lyd.a(i, a.b, a.c);
        kotlin.coroutines.d dVar = a.d;
        ksr<T> ksrVar2 = a.a;
        con0 con0Var = lyd.c;
        edi ediVar = hcj0.a.a;
        return new z7f0(a2, myc0.g(yvjVar, dVar, ediVar.equals(ediVar) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new utr(ediVar, ksrVar2, a2, con0Var, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, xsna.con0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(ksr ksrVar, ContinuationImpl continuationImpl) {
        str strVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        T t;
        ?? r0 = tyx.h;
        if (continuationImpl instanceof str) {
            strVar = (str) continuationImpl;
            int i2 = strVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                strVar.label = i2 - Integer.MIN_VALUE;
                Object obj = strVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = strVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = r0;
                    ttr ttrVar = new ttr(ref$ObjectRef2);
                    strVar.L$0 = ref$ObjectRef2;
                    strVar.label = 1;
                    if (ksrVar.collect(ttrVar, strVar) == obj2) {
                        return obj2;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) strVar.L$0;
                    kotlin.a.a(obj);
                }
                t = ref$ObjectRef.element;
                if (t == r0) {
                    return t;
                }
                throw new NoSuchElementException("Flow is empty");
            }
        }
        strVar = new str(continuationImpl);
        Object obj3 = strVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = strVar.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == r0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(ksr ksrVar, yvj yvjVar, ContinuationImpl continuationImpl) {
        wtr wtrVar;
        int i;
        if (continuationImpl instanceof wtr) {
            wtrVar = (wtr) continuationImpl;
            int i2 = wtrVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtrVar.label = i2 - Integer.MIN_VALUE;
                Object obj = wtrVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wtrVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    lbj0 a = xtr.a(ksrVar, 1);
                    o7i o7iVar = new o7i((eyx) yvjVar.getCoroutineContext().get(eyx.a.b));
                    myc0.h(yvjVar, a.d, null, new vtr(a.a, o7iVar, null), 2);
                    wtrVar.label = 1;
                    obj = o7iVar.J(wtrVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                Object d = ((Result) obj).d();
                kotlin.a.a(d);
                return d;
            }
        }
        wtrVar = new wtr(continuationImpl);
        Object obj2 = wtrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wtrVar.label;
        if (i != 0) {
        }
        Object d2 = ((Result) obj2).d();
        kotlin.a.a(d2);
        return d2;
    }

    public static final b8f0 w(ksr ksrVar, yvj yvjVar, hcj0 hcj0Var, Object obj) {
        lbj0 a = xtr.a(ksrVar, 1);
        utk0 a2 = vtk0.a(obj);
        return new b8f0(a2, myc0.g(yvjVar, a.d, hcj0Var.equals(hcj0.a.a) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new utr(hcj0Var, a.a, a2, obj, null)));
    }

    public static final bso0 x(Object obj, Throwable th) {
        String str;
        bpn0 bpn0Var = new bpn0(new ty0(th, new Throwable(String.valueOf(obj)), obj, 2));
        String name = Thread.currentThread().getName();
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        if (threadGroup == null || (str = threadGroup.getName()) == null) {
            str = "";
        }
        return new bso0(new mla(bpn0Var, 0, name, str, obj));
    }

    public static final xya y(ksr ksrVar, yzs yzsVar) {
        int i = mtr.a;
        return new xya(yzsVar, ksrVar, EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND);
    }

    @Override // xsna.vyp
    public boolean a(rrk0 rrk0Var, boolean z) {
        if (rrk0Var instanceof e0h0) {
            return true;
        }
        rrk0Var.toString();
        return false;
    }

    @Override // xsna.vyp
    public boolean b() {
        return true;
    }

    @Override // xsna.vyp
    public boolean c() {
        return false;
    }

    @Override // xsna.qev0
    public VkProxyPoll d() {
        return Preference.d("NetworkProxy", "proxy_user_state_changed", false) ? VkProxyPoll.ERROR : VkProxyPoll.NEXT;
    }

    @Override // xsna.vyp
    public void clear() {
    }
}
