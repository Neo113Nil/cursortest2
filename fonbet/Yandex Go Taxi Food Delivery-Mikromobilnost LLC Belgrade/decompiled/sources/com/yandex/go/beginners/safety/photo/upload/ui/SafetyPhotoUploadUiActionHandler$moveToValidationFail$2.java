package com.yandex.go.beginners.safety.photo.upload.ui;

import com.yandex.go.beginners.safety.photo.upload.domain.model.SafetyPhotoUploadScreenState$Type;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxl0;
import defpackage.rxl0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.safety.photo.upload.ui.SafetyPhotoUploadUiActionHandler$moveToValidationFail$2", f = "SafetyPhotoUploadUiActionHandler.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SafetyPhotoUploadUiActionHandler$moveToValidationFail$2 extends SuspendLambda implements wls {
    final /* synthetic */ rxl0 $screenStateRepository;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPhotoUploadUiActionHandler$moveToValidationFail$2(a aVar, rxl0 rxl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenStateRepository = rxl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyPhotoUploadUiActionHandler$moveToValidationFail$2(this.this$0, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyPhotoUploadUiActionHandler$moveToValidationFail$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.this$0.f;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var = this.$screenStateRepository.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, qxl0.a((qxl0) value, SafetyPhotoUploadScreenState$Type.VALIDATION_FAIL)));
        return zy11.a;
    }
}
