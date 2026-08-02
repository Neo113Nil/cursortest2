package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w53;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.DropTokenPerformer$performMethod$1", f = "DropTokenPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DropTokenPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.l0 $method;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropTokenPerformer$performMethod$1(l lVar, com.yandex.passport.internal.methods.l0 l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$method = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DropTokenPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DropTokenPerformer$performMethod$1 dropTokenPerformer$performMethod$1 = (DropTokenPerformer$performMethod$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dropTokenPerformer$performMethod$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.core.tokens.b bVar = this.this$0.a;
        String value = ((ClientToken) this.$method.b.c).getValue();
        Iterator it = bVar.b.a().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(bVar.a.getClientTokenValue(((ModernAccount) obj2).getUid()), value)) {
                break;
            }
        }
        ModernAccount modernAccount = (ModernAccount) obj2;
        com.yandex.passport.internal.core.tokens.a aVar = bVar.c;
        aVar.a.dropClientToken(value);
        com.yandex.passport.internal.analytics.c0 c0Var = aVar.b;
        Uid uid = modernAccount != null ? modernAccount.getUid() : null;
        c0Var.getClass();
        w53 w53Var = new w53();
        if (uid != null) {
            w53Var.put("uid", String.valueOf(uid.getValue()));
        }
        c0Var.a.a(com.yandex.passport.internal.analytics.i.b, w53Var);
        return zy11.a;
    }
}
