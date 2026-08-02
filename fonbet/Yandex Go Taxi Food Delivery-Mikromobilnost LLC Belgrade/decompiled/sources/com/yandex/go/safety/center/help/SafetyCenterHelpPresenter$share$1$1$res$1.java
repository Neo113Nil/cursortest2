package com.yandex.go.safety.center.help;

import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/safety/center/api/ShareResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/go/safety/center/api/ShareResponse;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.help.SafetyCenterHelpPresenter$share$1$1$res$1", f = "SafetyCenterHelpPresenter.kt", l = {242}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterHelpPresenter$share$1$1$res$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $needShareLocation;
    final /* synthetic */ List<String> $recipients;
    final /* synthetic */ ShareRequestParam.NotificationType $type;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterHelpPresenter$share$1$1$res$1(e eVar, ShareRequestParam.NotificationType notificationType, boolean z, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$type = notificationType;
        this.$needShareLocation = z;
        this.$recipients = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterHelpPresenter$share$1$1$res$1(this.this$0, this.$type, this.$needShareLocation, this.$recipients, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterHelpPresenter$share$1$1$res$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        e eVar = this.this$0;
        j jVar = eVar.z;
        ShareRequestParam n = jVar.n(eVar.K, this.$type, this.$needShareLocation ? this.$recipients : EmptyList.a);
        this.label = 1;
        Object l = jVar.l(n, this);
        return l == coroutineSingletons ? coroutineSingletons : l;
    }
}
