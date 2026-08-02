package com.yandex.go.beginners.safety.photo.upload.ui;

import android.net.Uri;
import com.yandex.go.beginners.safety.photo.upload.domain.model.SafetyPhotoUploadScreenState$Type;
import defpackage.jjb0;
import defpackage.jl40;
import defpackage.kjb0;
import defpackage.ljb0;
import defpackage.lxl0;
import defpackage.mjb0;
import defpackage.mvg;
import defpackage.njb0;
import defpackage.ny61;
import defpackage.ohb0;
import defpackage.qxl0;
import defpackage.rxl0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.safety.photo.upload.ui.SafetyPhotoUploadUiActionHandler$startUpload$1", f = "SafetyPhotoUploadUiActionHandler.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SafetyPhotoUploadUiActionHandler$startUpload$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $cacheBustingUri;
    final /* synthetic */ lxl0 $navigator;
    final /* synthetic */ ohb0 $photo;
    final /* synthetic */ tse $scope;
    final /* synthetic */ rxl0 $screenStateRepository;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPhotoUploadUiActionHandler$startUpload$1(a aVar, Uri uri, ohb0 ohb0Var, tse tseVar, lxl0 lxl0Var, rxl0 rxl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cacheBustingUri = uri;
        this.$photo = ohb0Var;
        this.$scope = tseVar;
        this.$navigator = lxl0Var;
        this.$screenStateRepository = rxl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyPhotoUploadUiActionHandler$startUpload$1(this.this$0, this.$cacheBustingUri, this.$photo, this.$scope, this.$navigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyPhotoUploadUiActionHandler$startUpload$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.beginners.safety.photo.domain.b bVar = this.this$0.a;
            Uri uri = this.$cacheBustingUri;
            boolean z = this.$photo.b;
            this.label = 1;
            obj = bVar.b(uri, z, this);
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
        njb0 njb0Var = (njb0) obj;
        if (njb0Var instanceof ljb0) {
            a aVar = this.this$0;
            tse tseVar = this.$scope;
            lxl0 lxl0Var = this.$navigator;
            rxl0 rxl0Var = this.$screenStateRepository;
            aVar.getClass();
            r0 r0Var = rxl0Var.a;
            do {
                value3 = r0Var.getValue();
            } while (!r0Var.k(value3, qxl0.a((qxl0) value3, SafetyPhotoUploadScreenState$Type.SUCCESS)));
            aVar.d = tje.N(tseVar, null, null, new SafetyPhotoUploadUiActionHandler$moveToSuccess$2(aVar, lxl0Var, null), 3);
        } else if ((njb0Var instanceof kjb0) || jl40.l(njb0Var, jjb0.a)) {
            r0 r0Var2 = this.$screenStateRepository.a;
            do {
                value = r0Var2.getValue();
            } while (!r0Var2.k(value, qxl0.a((qxl0) value, SafetyPhotoUploadScreenState$Type.NETWORK_ERROR)));
        } else {
            if (!(njb0Var instanceof mjb0)) {
                w511.b();
                return null;
            }
            a aVar2 = this.this$0;
            tse tseVar2 = this.$scope;
            Uri uri2 = this.$cacheBustingUri;
            mjb0 mjb0Var = (mjb0) njb0Var;
            rxl0 rxl0Var2 = this.$screenStateRepository;
            aVar2.getClass();
            r0 r0Var3 = rxl0Var2.a;
            do {
                value2 = r0Var3.getValue();
            } while (!r0Var3.k(value2, new qxl0(SafetyPhotoUploadScreenState$Type.VALIDATION_FAIL_INTERMEDIATE, uri2, mjb0Var.b)));
            aVar2.d = tje.N(tseVar2, null, null, new SafetyPhotoUploadUiActionHandler$moveToValidationFail$2(aVar2, rxl0Var2, null), 3);
        }
        return zy11.a;
    }
}
