package com.yandex.go.charity.repository;

import defpackage.cne0;
import defpackage.lza;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llza;", "<anonymous>", "(Ltse;)Llza;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.charity.repository.CharityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1", f = "CharityRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CharityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CharityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CharityRepository$getAndUpdateMenuItemInfoByRequest$2$savedMenuItemInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        cne0 cne0Var = this.this$0.h;
        String l = cne0Var.l("title", null);
        String l2 = cne0Var.l("subtitle", null);
        String str = l2 == null ? "" : l2;
        String l3 = cne0Var.l("url", null);
        String l4 = cne0Var.l("image_tag", null);
        if (l == null || l.length() == 0 || l3 == null || l3.length() == 0) {
            return lza.f;
        }
        return new lza(true, l4 == null ? "" : l4, l, str, l3);
    }
}
