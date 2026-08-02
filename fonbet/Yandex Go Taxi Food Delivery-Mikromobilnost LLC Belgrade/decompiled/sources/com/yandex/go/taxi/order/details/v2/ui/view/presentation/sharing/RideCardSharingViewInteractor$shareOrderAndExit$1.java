package com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing;

import android.net.Uri;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bvf0;
import defpackage.g050;
import defpackage.hhs0;
import defpackage.hnk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v2y0;
import defpackage.w2y0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing.RideCardSharingViewInteractor$shareOrderAndExit$1", f = "RideCardSharingViewInteractor.kt", l = {119}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardSharingViewInteractor$shareOrderAndExit$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $uri;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ hnk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardSharingViewInteractor$shareOrderAndExit$1(hnk0 hnk0Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hnk0Var;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardSharingViewInteractor$shareOrderAndExit$1(this.this$0, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardSharingViewInteractor$shareOrderAndExit$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hnk0 hnk0Var;
        g050 g050Var;
        Uri uri;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hnk0Var = this.this$0;
            kotlinx.coroutines.sync.a aVar = hnk0Var.i;
            Uri uri2 = this.$uri;
            this.L$0 = aVar;
            this.L$1 = hnk0Var;
            this.L$2 = uri2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            uri = uri2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = (Uri) this.L$2;
            hnk0Var = (hnk0) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            hhs0 hhs0Var = hnk0Var.c;
            ((com.yandex.go.taxi.order.infosharing.data.a) ((v2y0) hhs0Var.b).b.get()).a((TaxiOrder) hhs0Var.c, new w2y0(uri));
            bvf0.j(hnk0Var.h, null);
            hnk0Var.d.invoke();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
