package com.yandex.messaging.domain.organizations;

import defpackage.lat;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x221;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasMentions", "Lx221;", "unreadCount", "Llat;", "<anonymous>", "(ZLx221;)Llat;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.organizations.GetOrganizationsWithMentionsUseCase$run$1$1$1", f = "GetOrganizationsWithMentionsUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetOrganizationsWithMentionsUseCase$run$1$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ lat $organization;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrganizationsWithMentionsUseCase$run$1$1$1(lat latVar, Continuation continuation) {
        super(3, continuation);
        this.$organization = latVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        GetOrganizationsWithMentionsUseCase$run$1$1$1 getOrganizationsWithMentionsUseCase$run$1$1$1 = new GetOrganizationsWithMentionsUseCase$run$1$1$1(this.$organization, (Continuation) obj3);
        getOrganizationsWithMentionsUseCase$run$1$1$1.Z$0 = booleanValue;
        getOrganizationsWithMentionsUseCase$run$1$1$1.L$0 = (x221) obj2;
        return getOrganizationsWithMentionsUseCase$run$1$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = this.Z$0;
        int i = ((x221) this.L$0).b;
        lat latVar = this.$organization;
        long j = latVar.a;
        String str = latVar.b;
        boolean z2 = latVar.c;
        latVar.getClass();
        return new lat(j, str, z2, i, z);
    }
}
