package com.yandex.plus.pay.ui.core.debug.internal.domain.form;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.debug.internal.domain.form.GetReportFormInfoInteractorImpl$getReportFormInfo$2$screenshotDataUrl$1", f = "GetReportFormInfoInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetReportFormInfoInteractorImpl$getReportFormInfo$2$screenshotDataUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReportFormInfoInteractorImpl$getReportFormInfo$2$screenshotDataUrl$1(a aVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetReportFormInfoInteractorImpl$getReportFormInfo$2$screenshotDataUrl$1(this.this$0, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetReportFormInfoInteractorImpl$getReportFormInfo$2$screenshotDataUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        Context context = this.$context;
        aVar.getClass();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            rootView.draw(new Canvas(createBitmap));
            if (createBitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                return "data:image/png;base64,".concat(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
            }
        }
        return null;
    }
}
