package androidx.compose.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.j0r0;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements wls {
    final /* synthetic */ AtomicReference<j0r0> $arg0;
    final /* synthetic */ wls $session;
    final /* synthetic */ tls $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(tls tlsVar, AtomicReference atomicReference, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$sessionInitializer = tlsVar;
        this.$arg0 = atomicReference;
        this.$session = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, continuation);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
    
        if (kotlinx.coroutines.a.f(r8, r7) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0r0 j0r0Var;
        j0r0 j0r0Var2;
        AtomicReference<j0r0> atomicReference;
        AtomicReference<j0r0> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tse tseVar = (tse) this.L$0;
                j0r0Var = new j0r0(kotlinx.coroutines.a.n(tseVar.getCoroutineContext()), this.$sessionInitializer.invoke(tseVar));
                j0r0 andSet = this.$arg0.getAndSet(j0r0Var);
                if (andSet != null) {
                    l8x l8xVar = andSet.a;
                    this.L$0 = j0r0Var;
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j0r0Var2 = (j0r0) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        atomicReference2 = this.$arg0;
                        while (!atomicReference2.compareAndSet(j0r0Var2, null) && atomicReference2.get() == j0r0Var2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = this.$arg0;
                        while (!atomicReference.compareAndSet(j0r0Var2, null) && atomicReference.get() == j0r0Var2) {
                        }
                        throw th;
                    }
                }
                j0r0Var = (j0r0) this.L$0;
                kotlin.b.b(obj);
            }
            wls wlsVar = this.$session;
            Object obj2 = j0r0Var.b;
            this.L$0 = j0r0Var;
            this.label = 2;
            obj = wlsVar.invoke(obj2, this);
            if (obj != coroutineSingletons) {
                j0r0Var2 = j0r0Var;
                atomicReference2 = this.$arg0;
                while (!atomicReference2.compareAndSet(j0r0Var2, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            j0r0Var2 = j0r0Var;
            atomicReference = this.$arg0;
            while (!atomicReference.compareAndSet(j0r0Var2, null)) {
            }
            throw th;
        }
    }
}
