package com.yandex.go.pickup_from_photo.domain;

import defpackage.chi0;
import defpackage.mvg;
import defpackage.nhb0;
import defpackage.ny61;
import defpackage.shi0;
import defpackage.umb0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshi0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lshi0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.domain.RecognitionSuccessUiStateInteractor$uiStateFlow$2", f = "RecognitionSuccessUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RecognitionSuccessUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognitionSuccessUiStateInteractor$uiStateFlow$2(s sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RecognitionSuccessUiStateInteractor$uiStateFlow$2 recognitionSuccessUiStateInteractor$uiStateFlow$2 = new RecognitionSuccessUiStateInteractor$uiStateFlow$2(this.this$0, continuation);
        recognitionSuccessUiStateInteractor$uiStateFlow$2.L$0 = obj;
        return recognitionSuccessUiStateInteractor$uiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RecognitionSuccessUiStateInteractor$uiStateFlow$2 recognitionSuccessUiStateInteractor$uiStateFlow$2 = (RecognitionSuccessUiStateInteractor$uiStateFlow$2) create((shi0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        recognitionSuccessUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        shi0 shi0Var = (shi0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!(shi0Var.j instanceof chi0)) {
            umb0 umb0Var = this.this$0.d;
            zzs zzsVar = shi0Var.i;
            double d = zzsVar.a;
            double d2 = zzsVar.b;
            nhb0 nhb0Var = umb0Var.a;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("lon", Double.valueOf(d2));
            mapBuilder.put("lat", Double.valueOf(d));
            MapBuilder j = mapBuilder.j();
            nhb0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("coordinate", j);
            nhb0Var.a.a("PhotoPickUp.FoundModal.Shown", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
