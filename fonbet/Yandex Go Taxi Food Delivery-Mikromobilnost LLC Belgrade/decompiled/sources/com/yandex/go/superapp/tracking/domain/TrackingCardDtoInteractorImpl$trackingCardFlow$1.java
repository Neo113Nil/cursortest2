package com.yandex.go.superapp.tracking.domain;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardButtonDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardRatingSelectorDto;
import defpackage.bms;
import defpackage.c501;
import defpackage.d501;
import defpackage.f401;
import defpackage.g301;
import defpackage.k301;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p401;
import defpackage.q401;
import defpackage.t401;
import defpackage.tcc;
import defpackage.v401;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lq401;", "title", "subtitle", "Lt401;", "trail", "Lg301;", "<anonymous>", "(Lq401;Lq401;Lt401;)Lg301;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.tracking.domain.TrackingCardDtoInteractorImpl$trackingCardFlow$1", f = "TrackingCardDtoInteractorImpl.kt", l = {71, 74}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrackingCardDtoInteractorImpl$trackingCardFlow$1 extends SuspendLambda implements bms {
    final /* synthetic */ TrackingCardDto $dto;
    final /* synthetic */ p401 $lead;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingCardDtoInteractorImpl$trackingCardFlow$1(p401 p401Var, TrackingCardDto trackingCardDto, e eVar, Continuation continuation) {
        super(4, continuation);
        this.$lead = p401Var;
        this.$dto = trackingCardDto;
        this.this$0 = eVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        TrackingCardDtoInteractorImpl$trackingCardFlow$1 trackingCardDtoInteractorImpl$trackingCardFlow$1 = new TrackingCardDtoInteractorImpl$trackingCardFlow$1(this.$lead, this.$dto, this.this$0, (Continuation) obj4);
        trackingCardDtoInteractorImpl$trackingCardFlow$1.L$0 = (q401) obj;
        trackingCardDtoInteractorImpl$trackingCardFlow$1.L$1 = (q401) obj2;
        trackingCardDtoInteractorImpl$trackingCardFlow$1.L$2 = (t401) obj3;
        return trackingCardDtoInteractorImpl$trackingCardFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00af -> B:14:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Collection collection;
        e eVar;
        v401 v401Var;
        List list;
        TrackingCardRatingSelectorDto trackingCardRatingSelectorDto;
        e eVar2;
        e eVar3;
        q401 q401Var = (q401) this.L$0;
        q401 q401Var2 = (q401) this.L$1;
        t401 t401Var = (t401) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        f401 f401Var = null;
        c501 c501Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            v401 v401Var2 = new v401(this.$lead, q401Var, q401Var2, t401Var);
            List list2 = this.$dto.b;
            e eVar4 = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            it = list2.iterator();
            collection = arrayList;
            eVar = eVar4;
            v401Var = v401Var2;
            if (it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$7;
            v401Var = (v401) this.L$6;
            trackingCardRatingSelectorDto = (TrackingCardRatingSelectorDto) this.L$4;
            eVar3 = (e) this.L$3;
            kotlin.b.b(obj);
            c501Var = (c501) obj;
            eVar2 = eVar3;
            f401Var = new f401(c501Var, eVar2.c(trackingCardRatingSelectorDto.b), eVar2.c(trackingCardRatingSelectorDto.c), eVar2.c(trackingCardRatingSelectorDto.d));
            return new g301(v401Var, list, f401Var);
        }
        collection = (Collection) this.L$11;
        v401Var = (v401) this.L$10;
        it = (Iterator) this.L$7;
        Collection collection2 = (Collection) this.L$6;
        eVar = (e) this.L$4;
        kotlin.b.b(obj);
        collection.add((k301) obj);
        collection = collection2;
        if (it.hasNext()) {
            TrackingCardButtonDto trackingCardButtonDto = (TrackingCardButtonDto) it.next();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = eVar;
            this.L$5 = null;
            this.L$6 = collection;
            this.L$7 = it;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = v401Var;
            this.L$11 = collection;
            this.label = 1;
            obj = e.a(eVar, trackingCardButtonDto, this);
            if (obj != coroutineSingletons) {
                collection2 = collection;
                collection.add((k301) obj);
                collection = collection2;
                if (it.hasNext()) {
                    list = (List) collection;
                    trackingCardRatingSelectorDto = this.$dto.c;
                    if (trackingCardRatingSelectorDto != null) {
                        eVar2 = this.this$0;
                        String str = trackingCardRatingSelectorDto.a;
                        if (str != null) {
                            d501 d501Var = eVar2.f;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = eVar2;
                            this.L$4 = trackingCardRatingSelectorDto;
                            this.L$5 = null;
                            this.L$6 = v401Var;
                            this.L$7 = list;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.L$10 = null;
                            this.L$11 = null;
                            this.label = 2;
                            Object b = ((f) d501Var).b(str, this);
                            if (b != coroutineSingletons) {
                                obj = b;
                                eVar3 = eVar2;
                                c501Var = (c501) obj;
                                eVar2 = eVar3;
                            }
                        }
                        f401Var = new f401(c501Var, eVar2.c(trackingCardRatingSelectorDto.b), eVar2.c(trackingCardRatingSelectorDto.c), eVar2.c(trackingCardRatingSelectorDto.d));
                    }
                    return new g301(v401Var, list, f401Var);
                }
            }
        }
        return coroutineSingletons;
    }
}
