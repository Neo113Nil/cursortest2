package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.models.data.entities.network.s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfr;", "<anonymous>", "(Ltse;)Lfr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.mappers.organizations.OrganizationsImagesPreviewMapper$mapModel$5$action$1$1", f = "OrganizationsImagesPreviewMapper.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsImagesPreviewMapper$mapModel$5$action$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ s $it;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsImagesPreviewMapper$mapModel$5$action$1$1(b bVar, s sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsImagesPreviewMapper$mapModel$5$action$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsImagesPreviewMapper$mapModel$5$action$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.places.models.data.mappers.a aVar = this.this$0.c;
        s sVar = this.$it;
        this.label = 1;
        Object a = aVar.a(sVar, null, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
