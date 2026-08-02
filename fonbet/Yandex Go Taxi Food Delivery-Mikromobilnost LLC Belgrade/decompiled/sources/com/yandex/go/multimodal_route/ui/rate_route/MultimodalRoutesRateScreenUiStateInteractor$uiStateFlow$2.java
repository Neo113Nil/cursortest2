package com.yandex.go.multimodal_route.ui.rate_route;

import defpackage.dms;
import defpackage.emc;
import defpackage.fmc;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.or40;
import defpackage.ssq;
import defpackage.sv40;
import defpackage.tcc;
import defpackage.tsq;
import defpackage.tv40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lor40;", ClidProvider.STATE, "", "selectedRating", "", "commentValue", "", "ratingTags", "Lvv40;", "<anonymous>", "(Lor40;ILjava/lang/String;Ljava/util/Set;)Lvv40;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.rate_route.MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2", f = "MultimodalRoutesRateScreenUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements dms {
    final /* synthetic */ String $mmOfferId;
    final /* synthetic */ String $routeType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2(g gVar, String str, String str2, Continuation continuation) {
        super(5, continuation);
        this.this$0 = gVar;
        this.$mmOfferId = str;
        this.$routeType = str2;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2 multimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2 = new MultimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2(this.this$0, this.$mmOfferId, this.$routeType, (Continuation) obj5);
        multimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2.L$0 = (or40) obj;
        multimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2.L$1 = (Integer) obj2;
        multimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2.L$2 = (String) obj3;
        multimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2.L$3 = (Set) obj4;
        return multimodalRoutesRateScreenUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        or40 or40Var = (or40) this.L$0;
        Integer num = (Integer) this.L$1;
        String str2 = (String) this.L$2;
        Set set = (Set) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (or40Var == null) {
            return tv40.a;
        }
        emc emcVar = or40Var.e;
        this.this$0.h.a.a("MultimodalRoute.ScoreOffer.Shown", g8e.u("multimodal_id", this.$mmOfferId, "mm_name", this.$routeType), 1, new HashMap());
        List list = or40Var.d.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (kotlin.collections.a.G(((ssq) obj3).c, num)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            ssq ssqVar = (ssq) it.next();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (jl40.l((String) obj2, ssqVar.a)) {
                        break;
                    }
                }
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str != null) {
                z = true;
            }
            arrayList2.add(new tsq(ssqVar.a, ssqVar.b, z));
        }
        return new sv40(this.$mmOfferId, mja1.a(or40Var.h, null, 6), or40Var.b, or40Var.c, or40Var.f.c, num, arrayList2, emcVar.e.contains(new Integer(num != null ? num.intValue() : 0)) ? new fmc(emcVar.c, str2, emcVar.d) : null);
    }
}
