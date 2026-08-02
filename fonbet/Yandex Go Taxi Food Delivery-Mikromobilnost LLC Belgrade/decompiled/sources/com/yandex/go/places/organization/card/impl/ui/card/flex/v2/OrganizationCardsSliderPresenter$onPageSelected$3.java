package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import com.yandex.go.places.map.domain.entities.PinLayer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderPresenter$onPageSelected$3", f = "OrganizationCardsSliderPresenter.kt", l = {317, 319}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardsSliderPresenter$onPageSelected$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardsSliderPresenter$onPageSelected$3(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardsSliderPresenter$onPageSelected$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardsSliderPresenter$onPageSelected$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r7.c.a(r6) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            if (gVar.j0) {
                com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar = gVar.K;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar2 = this.this$0.K;
        this.label = 2;
        com.yandex.go.places.map.domain.layer.c cVar = bVar2.c.d;
        PinLayer a = cVar.a();
        com.yandex.go.places.map.data.repositories.g e = a != null ? cVar.e(a) : null;
        return (e != null ? e.g(this) : zy11Var) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
