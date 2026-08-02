package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.ChatRequest;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.e3n;
import defpackage.fse;
import defpackage.kp50;
import defpackage.kse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pw50;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xdf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.t0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.SyncManager$requestSyncWhenSubscribed$1", f = "SyncManager.kt", l = {67, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SyncManager$requestSyncWhenSubscribed$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ tpr $flow;
    final /* synthetic */ boolean $goOnline;
    final /* synthetic */ SyncSource $source;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncManager$requestSyncWhenSubscribed$1(i iVar, tpr tprVar, ChatRequest chatRequest, boolean z, SyncSource syncSource, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$flow = tprVar;
        this.$chatRequest = chatRequest;
        this.$goOnline = z;
        this.$source = syncSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SyncManager$requestSyncWhenSubscribed$1 syncManager$requestSyncWhenSubscribed$1 = new SyncManager$requestSyncWhenSubscribed$1(this.this$0, this.$flow, this.$chatRequest, this.$goOnline, this.$source, continuation);
        syncManager$requestSyncWhenSubscribed$1.L$0 = obj;
        return syncManager$requestSyncWhenSubscribed$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncManager$requestSyncWhenSubscribed$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r13, r1, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r13 == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.yandex.messaging.internal.authorized.sync.h] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            i iVar = this.this$0;
            fse fseVar = iVar.b.b;
            SyncManager$requestSyncWhenSubscribed$1$userComponent$1 syncManager$requestSyncWhenSubscribed$1$userComponent$1 = new SyncManager$requestSyncWhenSubscribed$1$userComponent$1(iVar, null);
            this.L$0 = vprVar;
            this.label = 1;
            obj = tje.k0(fseVar, syncManager$requestSyncWhenSubscribed$1$userComponent$1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        final cl21 cl21Var = (cl21) obj;
        tpr tprVar = this.$flow;
        xdf0 xdf0Var = this.this$0.b;
        o430 o430Var = e3n.b;
        e3n e3nVar = new e3n(kp50.U(5, DurationUnit.SECONDS));
        final i iVar2 = this.this$0;
        final ChatRequest chatRequest = this.$chatRequest;
        final boolean z = this.$goOnline;
        final SyncSource syncSource = this.$source;
        t0 e = com.yandex.messaging.extension.flow.c.e(tprVar, xdf0Var, e3nVar, new sls() { // from class: com.yandex.messaging.internal.authorized.sync.h
            @Override // defpackage.sls
            public final Object invoke() {
                i iVar3 = i.this;
                kse.a(iVar3.c);
                g f = ((d9g) cl21Var).f();
                ChatRequest chatRequest2 = chatRequest;
                return new pw50(1, f.c(z, chatRequest2 == null, syncSource), chatRequest2 != null ? tje.N(iVar3.b, null, null, new SyncManager$syncSubscription$chatSyncJob$1$1(iVar3, chatRequest2, null), 3) : null);
            }
        });
        this.L$0 = null;
        this.label = 2;
    }
}
