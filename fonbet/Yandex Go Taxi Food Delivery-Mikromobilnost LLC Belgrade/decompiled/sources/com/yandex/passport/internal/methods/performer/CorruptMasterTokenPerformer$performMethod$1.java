package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.DropPlace;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.CorruptMasterTokenPerformer$performMethod$1", f = "CorruptMasterTokenPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CorruptMasterTokenPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.h0 $method;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptMasterTokenPerformer$performMethod$1(com.yandex.passport.internal.methods.h0 h0Var, j jVar, Continuation continuation) {
        super(2, continuation);
        this.$method = h0Var;
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorruptMasterTokenPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CorruptMasterTokenPerformer$performMethod$1 corruptMasterTokenPerformer$performMethod$1 = (CorruptMasterTokenPerformer$performMethod$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        corruptMasterTokenPerformer$performMethod$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ModernAccount e = this.this$0.a.a().e(com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c));
        if (e != null) {
            com.yandex.passport.internal.core.accounts.g gVar = this.this$0.b;
            gVar.e.j(DropPlace.CORRUPT, e.getUid(), null);
            if (gVar.a.p(gVar.l.a(e), MasterToken.MASTER_TOKEN_INVALID_VALUE)) {
                com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.n.b);
            }
        }
        return zy11.a;
    }
}
