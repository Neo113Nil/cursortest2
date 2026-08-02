package com.yandex.quark.webchat;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rn3;
import defpackage.wls;
import defpackage.y0x0;
import defpackage.z0x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz0x0;", ClidProvider.STATE, "", "<anonymous>", "(Lz0x0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.PageProvider$page$1", f = "Page.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PageProvider$page$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageProvider$page$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageProvider$page$1 pageProvider$page$1 = new PageProvider$page$1(this.this$0, continuation);
        pageProvider$page$1.L$0 = obj;
        return pageProvider$page$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PageProvider$page$1) create((z0x0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        z0x0 z0x0Var = (z0x0) this.L$0;
        c cVar = this.this$0;
        if (!cVar.a || ((z0x0Var instanceof y0x0) && (((y0x0) z0x0Var).a instanceof rn3))) {
            z = false;
        } else {
            cVar.getClass();
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
