package com.yandex.plus.pay.internal.feature.offers.smart;

import com.yandex.plus.pay.api.analytics.PlusPayTestId;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lcom/yandex/plus/home/common/network/NetworkResponse;", "Lx9d0;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/home/common/network/NetworkResponse;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.offers.smart.SmartOffersRepositoryImpl$getSmartOffers$response$1", f = "SmartOffersRepositoryImpl.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SmartOffersRepositoryImpl$getSmartOffers$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $experimentsFlags;
    final /* synthetic */ Set<PlusPayTestId> $experimentsTestIds;
    final /* synthetic */ boolean $isOneClickSupported;
    final /* synthetic */ String $page;
    final /* synthetic */ Set<String> $places;
    final /* synthetic */ Map<String, String> $restrictions;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ Set<PlusPaySmartOffer.TargetAndFeatures> $targetsAndFeatures;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartOffersRepositoryImpl$getSmartOffers$response$1(b bVar, String str, boolean z, String str2, Set set, Set set2, Set set3, Set set4, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$sessionId = str;
        this.$isOneClickSupported = z;
        this.$page = str2;
        this.$places = set;
        this.$targetsAndFeatures = set2;
        this.$experimentsTestIds = set3;
        this.$experimentsFlags = set4;
        this.$restrictions = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SmartOffersRepositoryImpl$getSmartOffers$response$1(this.this$0, this.$sessionId, this.$isOneClickSupported, this.$page, this.$places, this.$targetsAndFeatures, this.$experimentsTestIds, this.$experimentsFlags, this.$restrictions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SmartOffersRepositoryImpl$getSmartOffers$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Set set = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        String str = this.$sessionId;
        boolean z = this.$isOneClickSupported;
        String str2 = this.$page;
        Set<String> set2 = this.$places;
        Set<PlusPaySmartOffer.TargetAndFeatures> set3 = this.$targetsAndFeatures;
        Set<PlusPayTestId> set4 = this.$experimentsTestIds;
        if (set4 != null) {
            Set<PlusPayTestId> set5 = set4;
            ArrayList arrayList = new ArrayList(tcc.n(set5, 10));
            Iterator<T> it = set5.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((PlusPayTestId) it.next()).getValue()));
            }
            set = kotlin.collections.a.N0(arrayList);
        }
        Set<String> set6 = this.$experimentsFlags;
        Map<String, String> map = this.$restrictions;
        this.label = 1;
        Object a = b.a(bVar, str, z, str2, set2, set3, set, set6, map, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
