package com.yandex.go.quark.dynamic;

import defpackage.e3n;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ndb;
import defpackage.ny61;
import defpackage.o430;
import defpackage.odb;
import defpackage.pdb;
import defpackage.ue41;
import defpackage.ve41;
import defpackage.vpr;
import defpackage.w511;
import defpackage.we41;
import defpackage.xe41;
import defpackage.ye41;
import defpackage.ze41;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lqdb;", "Lze41;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lvpr;Lze41;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.dynamic.QuarkServiceImpl$createChatViewController$3$viewStateFlow$1", f = "QuarkServiceImpl.kt", l = {226, 229, 230}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class QuarkServiceImpl$createChatViewController$3$viewStateFlow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkServiceImpl$createChatViewController$3$viewStateFlow$1(h hVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        QuarkServiceImpl$createChatViewController$3$viewStateFlow$1 quarkServiceImpl$createChatViewController$3$viewStateFlow$1 = new QuarkServiceImpl$createChatViewController$3$viewStateFlow$1(this.this$0, (Continuation) obj3);
        quarkServiceImpl$createChatViewController$3$viewStateFlow$1.L$0 = (vpr) obj;
        quarkServiceImpl$createChatViewController$3$viewStateFlow$1.L$1 = (ze41) obj2;
        return quarkServiceImpl$createChatViewController$3$viewStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009b, code lost:
    
        if (r0.emit(r4, r12) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (kotlinx.coroutines.a.j(r10, r12) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r0.emit(r13, r12) == r2) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        vpr vprVar = (vpr) this.L$0;
        ze41 ze41Var = (ze41) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ndb ndbVar = ndb.a;
        xe41 xe41Var = xe41.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.getClass();
            if (jl40.l(ze41Var, ve41.a) || jl40.l(ze41Var, xe41Var)) {
                obj2 = pdb.a;
            } else if (jl40.l(ze41Var, we41.a)) {
                obj2 = odb.a;
            } else {
                if (!(ze41Var instanceof ue41) && !jl40.l(ze41Var, ye41.a)) {
                    w511.b();
                    return null;
                }
                obj2 = ndbVar;
            }
            this.L$0 = vprVar;
            this.L$1 = ze41Var;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        if (jl40.l(ze41Var, xe41Var)) {
            o430 o430Var = e3n.b;
            long U = kp50.U(20, DurationUnit.SECONDS);
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
