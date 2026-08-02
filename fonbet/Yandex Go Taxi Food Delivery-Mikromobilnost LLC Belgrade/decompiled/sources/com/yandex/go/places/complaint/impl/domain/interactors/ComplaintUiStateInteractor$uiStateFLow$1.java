package com.yandex.go.places.complaint.impl.domain.interactors;

import com.yandex.go.places.complaint.experiment.ComplaintExperiment;
import defpackage.axc;
import defpackage.d6z;
import defpackage.g8e;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/places/complaint/experiment/ComplaintExperiment;", "exp", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "", "Laxc;", "<anonymous>", "(Lcom/yandex/go/places/complaint/experiment/ComplaintExperiment;Lru/yandex/taxi/theme/ThemeType;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.complaint.impl.domain.interactors.ComplaintUiStateInteractor$uiStateFLow$1", f = "ComplaintUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ComplaintUiStateInteractor$uiStateFLow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplaintUiStateInteractor$uiStateFLow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComplaintUiStateInteractor$uiStateFLow$1 complaintUiStateInteractor$uiStateFLow$1 = new ComplaintUiStateInteractor$uiStateFLow$1(this.this$0, (Continuation) obj3);
        complaintUiStateInteractor$uiStateFLow$1.L$0 = (ComplaintExperiment) obj;
        return complaintUiStateInteractor$uiStateFLow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ComplaintExperiment complaintExperiment = (ComplaintExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList t = g8e.t(obj);
        List<ComplaintExperiment.ComplaintButton> list = complaintExperiment.d;
        a aVar = this.this$0;
        for (ComplaintExperiment.ComplaintButton complaintButton : list) {
            String str = complaintButton.a;
            ComplaintExperiment.ComplaintSuccessNotification complaintSuccessNotification = complaintButton.d;
            t.add(new axc(d6z.Y(complaintExperiment, str), ((m7x0) aVar.b).a(complaintButton.c), complaintButton.b, d6z.Y(complaintExperiment, complaintSuccessNotification.a), ((m7x0) aVar.b).a(complaintSuccessNotification.b)));
        }
        return t;
    }
}
