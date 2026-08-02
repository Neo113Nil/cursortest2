package com.ybsdk.feature.kyc.internal.screens.photov3;

import android.net.Uri;
import defpackage.ajb0;
import defpackage.if8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.yib0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photov3.PhotoViewModel$uploadPhoto$statusUpdateJob$1", f = "PhotoViewModel.kt", l = {326}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PhotoViewModel$uploadPhoto$statusUpdateJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoViewModel$uploadPhoto$statusUpdateJob$1(b bVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotoViewModel$uploadPhoto$statusUpdateJob$1(this.this$0, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotoViewModel$uploadPhoto$statusUpdateJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long uploadTakesTooLongThresholdMs = ((if8) this.this$0.F).a.e().getUploadTakesTooLongThresholdMs();
            this.label = 1;
            if (kotlinx.coroutines.a.i(uploadTakesTooLongThresholdMs, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        Uri uri = this.$uri;
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, new yib0(PhotoState$Stage$Upload$Status.ACTIVE_TOO_LONG, uri), null, null, false, null, 247)));
        return zy11.a;
    }
}
