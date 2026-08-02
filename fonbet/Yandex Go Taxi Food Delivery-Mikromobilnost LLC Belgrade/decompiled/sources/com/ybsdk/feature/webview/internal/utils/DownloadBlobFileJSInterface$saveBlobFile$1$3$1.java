package com.ybsdk.feature.webview.internal.utils;

import defpackage.j0g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.utils.DownloadBlobFileJSInterface$saveBlobFile$1$3$1", f = "DownloadBlobFileJSInterface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DownloadBlobFileJSInterface$saveBlobFile$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ DownloadBlobFileJSInterface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadBlobFileJSInterface$saveBlobFile$1$3$1(DownloadBlobFileJSInterface downloadBlobFileJSInterface, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloadBlobFileJSInterface;
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadBlobFileJSInterface$saveBlobFile$1$3$1(this.this$0, this.$throwable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DownloadBlobFileJSInterface$saveBlobFile$1$3$1 downloadBlobFileJSInterface$saveBlobFile$1$3$1 = (DownloadBlobFileJSInterface$saveBlobFile$1$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        downloadBlobFileJSInterface$saveBlobFile$1$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j0g j0gVar = this.this$0.b;
        String message = this.$throwable.getMessage();
        if (message == null) {
            message = "Fail of saving blob file";
        }
        j0g.y(j0gVar, message, this.$throwable, 2);
        return zy11.a;
    }
}
