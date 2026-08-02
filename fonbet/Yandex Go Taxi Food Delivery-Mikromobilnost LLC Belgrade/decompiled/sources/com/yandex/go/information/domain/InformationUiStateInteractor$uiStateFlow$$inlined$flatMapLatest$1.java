package com.yandex.go.information.domain;

import defpackage.g92;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n03;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wvq0;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.information.domain.InformationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1", f = "InformationUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class InformationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ j receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(Continuation continuation, j jVar) {
        super(3, continuation);
        this.receiver$inlined = jVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InformationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 informationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 = new InformationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.receiver$inlined);
        informationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        informationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return informationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr iVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.receiver$inlined;
            jVar.getClass();
            rol0 rol0Var = new rol0(new ServiceInfoRepository$services$serviceInfoResultFlow$1(jVar, (zzs) obj2, null));
            jVar.b.getClass();
            sjh sjhVar = uyj.a;
            o oVar = new o(kotlinx.coroutines.flow.e.F(rol0Var, mdh.b), new ServiceInfoRepository$services$serviceInfoResultFlow$2(3, null));
            Set set = (Set) jVar.c.get();
            if (set.isEmpty()) {
                iVar = new g92(2, EmptyList.a);
            } else {
                Set<n03> set2 = set;
                ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
                for (n03 n03Var : set2) {
                    b bVar = new b(n03Var.b.a(), n03Var);
                    n03Var.a.getClass();
                    sjh sjhVar2 = uyj.a;
                    arrayList.add(kotlinx.coroutines.flow.e.F(bVar, mdh.b));
                }
                iVar = new i((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]));
            }
            tpr d = com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.F(new m0(oVar, iVar, new ServiceInfoRepository$services$1(3, jVar, j.class, "createResult", "createResult(Lcom/yandex/go/information/data/dto/ServicesResponse;Ljava/util/List;)Lcom/yandex/go/information/domain/ServiceInfoRepository$Status$Result;", 4)), uyj.a), new ServiceInfoRepository$services$$inlined$start$1(wvq0.a, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(d, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
