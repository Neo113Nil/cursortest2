package com.yandex.go.eboks.objects.domain;

import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.shn;
import defpackage.tls;
import defpackage.uc4;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Pair;", "Lshn;", "Lcom/yandex/go/eboks/objects/data/model/EboksObjectsResponse;", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.domain.EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2", f = "EboksObjectsObjectsCollectionsInteractor.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2 extends SuspendLambda implements tls {
    final /* synthetic */ uc4 $bbox;
    final /* synthetic */ VisibleRegion $current;
    final /* synthetic */ shn $requestTrigger;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2(n nVar, uc4 uc4Var, shn shnVar, VisibleRegion visibleRegion, Continuation continuation) {
        super(1, continuation);
        this.this$0 = nVar;
        this.$bbox = uc4Var;
        this.$requestTrigger = shnVar;
        this.$current = visibleRegion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2(this.this$0, this.$bbox, this.$requestTrigger, this.$current, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            com.yandex.go.eboks.objects.data.c cVar = nVar.g;
            uc4 uc4Var = this.$bbox;
            float j = ((gh00) nVar.a).j();
            List list = this.$requestTrigger.c;
            this.label = 1;
            obj = cVar.a(uc4Var, j, list, this);
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
        this.this$0.j.a = this.$current;
        return new Pair(this.$requestTrigger, (EboksObjectsResponse) obj);
    }
}
