package com.yandex.go.places.analytics.organization.card;

import defpackage.dwj;
import defpackage.lg80;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.analytics.organization.card.DiscoveryOrganizationsCardAnalytics$reportStateEventOnce$1", f = "DiscoveryOrganizationsCardAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscoveryOrganizationsCardAnalytics$reportStateEventOnce$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $event;
    final /* synthetic */ lg80 $mode;
    final /* synthetic */ String $oid;
    final /* synthetic */ String $uri;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryOrganizationsCardAnalytics$reportStateEventOnce$1(a aVar, String str, String str2, String str3, lg80 lg80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$event = str;
        this.$uri = str2;
        this.$oid = str3;
        this.$mode = lg80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryOrganizationsCardAnalytics$reportStateEventOnce$1(this.this$0, this.$event, this.$uri, this.$oid, this.$mode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DiscoveryOrganizationsCardAnalytics$reportStateEventOnce$1 discoveryOrganizationsCardAnalytics$reportStateEventOnce$1 = (DiscoveryOrganizationsCardAnalytics$reportStateEventOnce$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        discoveryOrganizationsCardAnalytics$reportStateEventOnce$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.k(new dwj(this.$uri, this.$oid, this.$mode, 1), this.$event);
        return zy11.a;
    }
}
