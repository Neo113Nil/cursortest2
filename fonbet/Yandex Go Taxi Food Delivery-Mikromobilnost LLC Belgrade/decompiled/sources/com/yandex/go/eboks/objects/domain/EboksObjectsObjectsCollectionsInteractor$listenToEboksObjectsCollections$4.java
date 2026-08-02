package com.yandex.go.eboks.objects.domain;

import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import defpackage.jl40;
import defpackage.kin;
import defpackage.mhn;
import defpackage.mvg;
import defpackage.nhn;
import defpackage.ny61;
import defpackage.ohn;
import defpackage.phn;
import defpackage.pwy0;
import defpackage.rhn;
import defpackage.v4r0;
import defpackage.vj00;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksObjectsResponse;", "eboksResponse", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkin;", "<anonymous>", "(Lcom/yandex/go/eboks/objects/data/model/EboksObjectsResponse;Lru/yandex/taxi/theme/ThemeType;)Lkin;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.domain.EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4", f = "EboksObjectsObjectsCollectionsInteractor.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4(n nVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4 eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4 = new EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4(this.this$0, (Continuation) obj3);
        eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4.L$0 = (EboksObjectsResponse) obj;
        return eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        rhn phnVar;
        Object phnVar2;
        EboksObjectsResponse eboksObjectsResponse = (EboksObjectsResponse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.eboks.objects.data.mapper.a aVar = this.this$0.e;
            this.L$0 = null;
            this.label = 1;
            obj = aVar.d(eboksObjectsResponse, this);
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
        kin kinVar = (kin) obj;
        n nVar = this.this$0;
        List list = kinVar.a;
        vj00 vj00Var = nVar.i.a;
        if (vj00Var != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((rhn) obj2).a, vj00Var.a())) {
                    break;
                }
            }
            rhn rhnVar = (rhn) obj2;
            if (rhnVar == null) {
                List list2 = list;
                pwy0 pwy0Var = nVar.d;
                if (vj00Var instanceof mhn) {
                    phnVar2 = new nhn(((mhn) vj00Var).c, Collections.singleton(vj00Var), pwy0Var.getThemeType());
                } else {
                    if (!(vj00Var instanceof ohn)) {
                        w511.b();
                        return null;
                    }
                    phnVar2 = new phn(((ohn) vj00Var).c, Collections.singleton(vj00Var), pwy0Var.getThemeType());
                }
                list = kotlin.collections.a.o0(list2, phnVar2);
            } else if (!rhnVar.b.contains(vj00Var)) {
                List list3 = list;
                pwy0 pwy0Var2 = nVar.d;
                if ((rhnVar instanceof nhn) && (vj00Var instanceof mhn)) {
                    nhn nhnVar = (nhn) rhnVar;
                    phnVar = new nhn(nhnVar.a, v4r0.i(nhnVar.b, vj00Var), pwy0Var2.getThemeType());
                } else {
                    if ((rhnVar instanceof phn) && (vj00Var instanceof ohn)) {
                        phn phnVar3 = (phn) rhnVar;
                        phnVar = new phn(phnVar3.a, v4r0.i(phnVar3.b, vj00Var), pwy0Var2.getThemeType());
                    }
                    list = kotlin.collections.a.o0(list3, rhnVar);
                }
                rhnVar = phnVar;
                list = kotlin.collections.a.o0(list3, rhnVar);
            }
        }
        return new kin(list, kinVar.b);
    }
}
