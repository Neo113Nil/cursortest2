package com.yandex.go.places.organization.card.impl.domain.interactors.flex;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationCardStateRequestParam;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.flex.OrganizationCardFlexRequestParams;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.lg80;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qi80;
import defpackage.ri80;
import defpackage.si80;
import defpackage.svj;
import defpackage.ti80;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xnt;
import defpackage.ynb1;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.domain.interactors.flex.OrganizationCardFlexInteractor$createRequestParams$2", f = "OrganizationCardFlexInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardFlexInteractor$createRequestParams$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $bannerId;
    final /* synthetic */ boolean $canShowV2Card;
    final /* synthetic */ lg80 $cardMode;
    final /* synthetic */ ti80 $id;
    final /* synthetic */ Boolean $isPaid;
    final /* synthetic */ String $permalinkSource;
    final /* synthetic */ svj $source;
    final /* synthetic */ String $yclid;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardFlexInteractor$createRequestParams$2(a aVar, ti80 ti80Var, lg80 lg80Var, svj svjVar, String str, Boolean bool, String str2, String str3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = ti80Var;
        this.$cardMode = lg80Var;
        this.$source = svjVar;
        this.$permalinkSource = str;
        this.$isPaid = bool;
        this.$yclid = str2;
        this.$bannerId = str3;
        this.$canShowV2Card = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardFlexInteractor$createRequestParams$2(this.this$0, this.$id, this.$cardMode, this.$source, this.$permalinkSource, this.$isPaid, this.$yclid, this.$bannerId, this.$canShowV2Card, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardFlexInteractor$createRequestParams$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = ((f2t) this.this$0.a).h;
            this.label = 1;
            obj = e.y(mthVar, this);
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
        zzs zzsVar = ((g2t) obj).b.a;
        ti80 ti80Var = this.$id;
        if (ti80Var instanceof qi80) {
            pair = new Pair(null, ((qi80) ti80Var).a);
        } else if (ti80Var instanceof ri80) {
            pair = new Pair(((ri80) ti80Var).a, null);
        } else {
            if (!(ti80Var instanceof si80)) {
                w511.b();
                return null;
            }
            si80 si80Var = (si80) ti80Var;
            pair = new Pair(si80Var.a, si80Var.b);
        }
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        return ((xnt) this.this$0.d).f(new OrganizationCardFlexRequestParams(str2, str, this.$id.a(), new OrganizationCardStateRequestParam(zzsVar, this.$cardMode.b(), ynb1.e(this.$cardMode.a()), this.$source.a(), new OrganizationCardStateRequestParam.PermalinkStateParam(this.$permalinkSource, this.$isPaid)), this.$yclid, this.$bannerId, this.$canShowV2Card), OrganizationCardFlexRequestParams.Companion.serializer());
    }
}
