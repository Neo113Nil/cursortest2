package com.yandex.passport.internal.config.template;

import com.yandex.passport.data.models.q;
import com.yandex.passport.data.models.r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/data/models/r;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/data/models/r;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.config.template.UrlTemplateRepository$get$2", f = "UrlTemplateRepository.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UrlTemplateRepository$get$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlTemplateRepository$get$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UrlTemplateRepository$get$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UrlTemplateRepository$get$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr data = this.this$0.a.getData();
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(data, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        c cVar = (c) obj;
        g gVar = this.this$0;
        EmptyList emptyList = EmptyList.a;
        if (cVar == null) {
            gVar.getClass();
            q qVar = new q(scc.g("auth", "profiles", "start"), emptyList);
            this.this$0.getClass();
            return new r(qVar, g.b());
        }
        gVar.getClass();
        f fVar = cVar.a;
        q qVar2 = fVar != null ? new q(fVar.a(), fVar.b()) : new q(scc.g("auth", "profiles", "start"), emptyList);
        f fVar2 = cVar.b;
        return new r(qVar2, fVar2 != null ? new q(fVar2.a(), fVar2.b()) : g.b());
    }
}
