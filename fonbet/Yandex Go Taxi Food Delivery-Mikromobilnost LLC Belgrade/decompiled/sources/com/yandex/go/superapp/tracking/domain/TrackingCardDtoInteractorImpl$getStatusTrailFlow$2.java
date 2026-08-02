package com.yandex.go.superapp.tracking.domain;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailTimelineDto;
import defpackage.b501;
import defpackage.c501;
import defpackage.d501;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r401;
import defpackage.s401;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lt401;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.tracking.domain.TrackingCardDtoInteractorImpl$getStatusTrailFlow$2", f = "TrackingCardDtoInteractorImpl.kt", l = {197, 199, 193}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrackingCardDtoInteractorImpl$getStatusTrailFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ b501 $trail;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
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
    public TrackingCardDtoInteractorImpl$getStatusTrailFlow$2(String str, b501 b501Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.$trail = b501Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingCardDtoInteractorImpl$getStatusTrailFlow$2 trackingCardDtoInteractorImpl$getStatusTrailFlow$2 = new TrackingCardDtoInteractorImpl$getStatusTrailFlow$2(this.$url, this.$trail, this.this$0, continuation);
        trackingCardDtoInteractorImpl$getStatusTrailFlow$2.L$0 = obj;
        return trackingCardDtoInteractorImpl$getStatusTrailFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingCardDtoInteractorImpl$getStatusTrailFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0118, code lost:
    
        if (r5.emit(r13, r12) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e8 -> B:13:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ec -> B:14:0x00ee). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        c501 c501Var;
        String str2;
        e eVar;
        r401 r401Var;
        vpr vprVar;
        Collection arrayList;
        Iterator it;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str3 = this.$url;
            TrackingCardStatusTrailTimelineDto.CurrentStatus currentStatus = ((TrackingCardStatusTrailTimelineDto) this.$trail).a;
            if (currentStatus != null && (str2 = currentStatus.b) != null) {
                d501 d501Var = this.this$0.f;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar2;
                this.L$3 = str3;
                this.label = 1;
                Object b = ((f) d501Var).b(str2, this);
                if (b != coroutineSingletons) {
                    str = str3;
                    obj = b;
                }
                return coroutineSingletons;
            }
            str = str3;
            c501Var = null;
            r401 r401Var2 = new r401(str, c501Var);
            List list = ((TrackingCardStatusTrailTimelineDto) this.$trail).b;
            eVar = this.this$0;
            r401Var = r401Var2;
            vprVar = vprVar2;
            arrayList = new ArrayList(tcc.n(list, 10));
            it = list.iterator();
            if (it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (Collection) this.L$11;
            r401Var = (r401) this.L$10;
            vprVar = (vpr) this.L$9;
            it = (Iterator) this.L$5;
            Collection collection = (Collection) this.L$4;
            eVar = (e) this.L$2;
            kotlin.b.b(obj);
            c501 c501Var2 = (c501) obj;
            arrayList.add(c501Var2);
            arrayList = collection;
            if (it.hasNext()) {
                String str4 = ((TrackingCardStatusTrailTimelineDto.StatusOutline) it.next()).a;
                if (str4 != null) {
                    d501 d501Var2 = eVar.f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = eVar;
                    this.L$3 = null;
                    this.L$4 = arrayList;
                    this.L$5 = it;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = vprVar;
                    this.L$10 = r401Var;
                    this.L$11 = arrayList;
                    this.label = 2;
                    obj = ((f) d501Var2).b(str4, this);
                    if (obj != coroutineSingletons) {
                        collection = arrayList;
                        c501 c501Var22 = (c501) obj;
                        arrayList.add(c501Var22);
                        arrayList = collection;
                        if (it.hasNext()) {
                        }
                    }
                } else {
                    collection = arrayList;
                    c501Var22 = null;
                    arrayList.add(c501Var22);
                    arrayList = collection;
                    if (it.hasNext()) {
                    }
                }
            } else {
                s401 s401Var = new s401(r401Var, (List) arrayList);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        String str5 = (String) this.L$3;
        vpr vprVar3 = (vpr) this.L$2;
        kotlin.b.b(obj);
        str = str5;
        vprVar2 = vprVar3;
        c501Var = (c501) obj;
        r401 r401Var22 = new r401(str, c501Var);
        List list2 = ((TrackingCardStatusTrailTimelineDto) this.$trail).b;
        eVar = this.this$0;
        r401Var = r401Var22;
        vprVar = vprVar2;
        arrayList = new ArrayList(tcc.n(list2, 10));
        it = list2.iterator();
        if (it.hasNext()) {
        }
        return coroutineSingletons;
    }
}
