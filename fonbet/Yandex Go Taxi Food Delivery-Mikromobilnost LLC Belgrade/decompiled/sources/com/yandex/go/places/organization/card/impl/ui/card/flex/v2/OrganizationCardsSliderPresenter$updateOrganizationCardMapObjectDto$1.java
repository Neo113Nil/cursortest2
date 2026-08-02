package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ti80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderPresenter$updateOrganizationCardMapObjectDto$1", f = "OrganizationCardsSliderPresenter.kt", l = {280, 282}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardsSliderPresenter$updateOrganizationCardMapObjectDto$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.places.models.data.entities.network.map.e $mapObject;
    final /* synthetic */ ti80 $orgId;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardsSliderPresenter$updateOrganizationCardMapObjectDto$1(g gVar, com.yandex.go.places.models.data.entities.network.map.e eVar, ti80 ti80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$mapObject = eVar;
        this.$orgId = ti80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardsSliderPresenter$updateOrganizationCardMapObjectDto$1(this.this$0, this.$mapObject, this.$orgId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardsSliderPresenter$updateOrganizationCardMapObjectDto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r5.b.a.emit(new kotlin.Pair(r1, r3), r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r5.c.c(r1, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            if (gVar.j0) {
                com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar = gVar.K;
                com.yandex.go.places.models.data.entities.network.map.e eVar = this.$mapObject;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar2 = this.this$0.K;
        ti80 ti80Var = this.$orgId;
        com.yandex.go.places.models.data.entities.network.map.e eVar2 = this.$mapObject;
        this.label = 2;
    }
}
