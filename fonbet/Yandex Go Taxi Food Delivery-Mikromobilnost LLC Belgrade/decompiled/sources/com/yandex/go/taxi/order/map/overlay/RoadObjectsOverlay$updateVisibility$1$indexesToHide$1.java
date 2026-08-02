package com.yandex.go.taxi.order.map.overlay;

import defpackage.f4c0;
import defpackage.ktk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/Set;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.RoadObjectsOverlay$updateVisibility$1$indexesToHide$1", f = "RoadObjectsOverlay.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsOverlay$updateVisibility$1$indexesToHide$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<f4c0> $overlayPlacemarks;
    int label;
    final /* synthetic */ ktk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsOverlay$updateVisibility$1$indexesToHide$1(ktk0 ktk0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ktk0Var;
        this.$overlayPlacemarks = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoadObjectsOverlay$updateVisibility$1$indexesToHide$1(this.this$0, this.$overlayPlacemarks, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoadObjectsOverlay$updateVisibility$1$indexesToHide$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ktk0 ktk0Var = this.this$0;
        com.yandex.go.taxi.order.map.o oVar = ktk0Var.c;
        CopyOnWriteArrayList copyOnWriteArrayList = ktk0Var.h;
        List<f4c0> list = this.$overlayPlacemarks;
        float f = ktk0Var.j;
        this.label = 1;
        Serializable a = oVar.a(copyOnWriteArrayList, list, f, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
