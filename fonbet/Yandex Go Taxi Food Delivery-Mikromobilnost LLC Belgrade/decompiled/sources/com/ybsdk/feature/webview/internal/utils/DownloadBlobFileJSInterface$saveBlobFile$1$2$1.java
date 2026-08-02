package com.ybsdk.feature.webview.internal.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.dzh0;
import defpackage.j0g;
import defpackage.mvg;
import defpackage.nl91;
import defpackage.ny61;
import defpackage.rje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.utils.DownloadBlobFileJSInterface$saveBlobFile$1$2$1", f = "DownloadBlobFileJSInterface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DownloadBlobFileJSInterface$saveBlobFile$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ DownloadBlobFileJSInterface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadBlobFileJSInterface$saveBlobFile$1$2$1(Uri uri, DownloadBlobFileJSInterface downloadBlobFileJSInterface, Continuation continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = downloadBlobFileJSInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadBlobFileJSInterface$saveBlobFile$1$2$1(this.$uri, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DownloadBlobFileJSInterface$saveBlobFile$1$2$1 downloadBlobFileJSInterface$saveBlobFile$1$2$1 = (DownloadBlobFileJSInterface$saveBlobFile$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        downloadBlobFileJSInterface$saveBlobFile$1$2$1.invokeSuspend(zy11Var);
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
        Uri uri = this.$uri;
        DownloadBlobFileJSInterface downloadBlobFileJSInterface = this.this$0;
        if (uri != null) {
            Context context = (Context) downloadBlobFileJSInterface.b.a;
            rje.l(dzh0.ybsdk_webview_documents_download_finished, context);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, context.getContentResolver().getType(uri));
            intent.setFlags(1);
            try {
                rje.k(context, intent);
            } catch (ActivityNotFoundException e) {
                rje.l(dzh0.ybsdk_webview_unable_to_open_downloaded_file, context);
                nl91.g(uri.toString(), null, "Cannot open type", null, e, String.valueOf(context.getContentResolver().getType(uri)), null, null, null, null, 1992);
            }
        } else {
            j0g.y(downloadBlobFileJSInterface.b, "Uri is null", null, 6);
        }
        return zy11.a;
    }
}
