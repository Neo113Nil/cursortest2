package androidx.datastore.core;

import defpackage.es10;
import defpackage.f3u0;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.mi9;
import defpackage.mvg;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.pd60;
import defpackage.qng;
import defpackage.tje;
import defpackage.tse;
import defpackage.vcs0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {185}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$updateData$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$updateData$2(f fVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$transform = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.this$0, this.$transform, continuation);
        dataStoreImpl$updateData$2.L$0 = obj;
        return dataStoreImpl$updateData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$updateData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        fyc b = gwk0.b();
        f3u0 a = this.this$0.h.a();
        if (a instanceof qng) {
            a = new pd60(((qng) a).a);
        }
        es10 es10Var = new es10(this.$transform, b, a, tseVar.getCoroutineContext());
        vcs0 vcs0Var = this.this$0.l;
        Object d = vcs0Var.c.d(es10Var);
        if (d instanceof mi9) {
            Throwable a2 = oi9.a(d);
            if (a2 == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            throw a2;
        }
        ni9 ni9Var = oi9.b;
        if (d instanceof ni9) {
            ny61.r("Check failed.");
            return null;
        }
        if (((AtomicInteger) vcs0Var.d.b).getAndIncrement() == 0) {
            tje.N(vcs0Var.a, null, null, new SimpleActor$offer$2(vcs0Var, null), 3);
        }
        this.label = 1;
        Object s = b.s(this);
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
