package com.yandex.go.sharing_personal_goals.data.mapper;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed;
import defpackage.bvf0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrqr0;", "<anonymous>", "(Ltse;)Lrqr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.data.mapper.SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$contentAsync$1$1", f = "SharingPersonalGoalsMapper.kt", l = {182}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$contentAsync$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Content $content;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$contentAsync$1$1(a aVar, SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Content content, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$content = content;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$contentAsync$1$1(this.this$0, this.$content, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$contentAsync$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Content content = this.$content;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2(aVar, content, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
