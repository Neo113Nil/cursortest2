package androidx.compose.ui.input.pointer;

import defpackage.dvw;
import defpackage.fse;
import defpackage.fwi;
import defpackage.j18;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.tje;
import defpackage.wls;
import defpackage.xp31;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class f implements fwi, Continuation {
    public final /* synthetic */ g a;
    public final j18 b;
    public j18 c;
    public PointerEventPass w = PointerEventPass.Main;
    public final EmptyCoroutineContext x = EmptyCoroutineContext.a;
    public final /* synthetic */ g y;

    public f(g gVar, j18 j18Var) {
        this.y = gVar;
        this.a = gVar;
        this.b = j18Var;
    }

    @Override // defpackage.fwi
    public final float H(int i) {
        return this.a.H(i);
    }

    @Override // defpackage.fwi
    public final float I(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.fwi
    public final long R(long j) {
        return this.a.R(j);
    }

    @Override // defpackage.fwi
    public final long W(float f) {
        return this.a.W(f);
    }

    public final Object a(PointerEventPass pointerEventPass, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        this.w = pointerEventPass;
        this.c = j18Var;
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public final long e() {
        g gVar = this.y;
        long R = gVar.R(qje.P(gVar).T.h());
        long j = gVar.C;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (R >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (R & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.fwi
    public final long f(long j) {
        return this.a.f(j);
    }

    @Override // defpackage.fwi
    public final int f0(float f) {
        return this.a.f0(f);
    }

    public final xp31 g() {
        return qje.P(this.y).T;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return this.x;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.fwi
    public final float i(long j) {
        return this.a.i(j);
    }

    @Override // defpackage.fwi
    public final float i0(long j) {
        return this.a.i0(j);
    }

    @Override // defpackage.fwi
    public final long n(float f) {
        return this.a.n(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(long j, wls wlsVar, BaseContinuationImpl baseContinuationImpl) {
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
        int i;
        Throwable th;
        l8x l8xVar;
        j18 j18Var;
        if (baseContinuationImpl instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) baseContinuationImpl;
            int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (j <= 0 && (j18Var = this.c) != null) {
                        j18Var.resumeWith(new Result.Failure(new PointerEventTimeoutCancellationException(j)));
                    }
                    pzt0 N = tje.N(this.y.getCoroutineScope(), null, null, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3);
                    try {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0 = N;
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                        obj = wlsVar.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        l8xVar = N;
                    } catch (Throwable th2) {
                        th = th2;
                        l8xVar = N;
                        l8xVar.a(CancelTimeoutCancellationException.a);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l8xVar = (l8x) suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        l8xVar.a(CancelTimeoutCancellationException.a);
                        throw th;
                    }
                }
                l8xVar.a(CancelTimeoutCancellationException.a);
                return obj;
            }
        }
        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, baseContinuationImpl);
        Object obj3 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
        if (i != 0) {
        }
        l8xVar.a(CancelTimeoutCancellationException.a);
        return obj3;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        g gVar = this.y;
        synchronized (gVar.z) {
            gVar.y.j(this);
        }
        this.b.resumeWith(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(long j, wls wlsVar, ContinuationImpl continuationImpl) {
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
        int i;
        try {
            if (continuationImpl instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) continuationImpl;
                int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = 1;
                        Object o = o(j, wlsVar, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                        return o == obj2 ? obj2 : o;
                    }
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            if (i != 0) {
            }
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, continuationImpl);
        Object obj3 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.a.u0();
    }

    @Override // defpackage.fwi
    public final float w0(float f) {
        return this.a.getDensity() * f;
    }
}
