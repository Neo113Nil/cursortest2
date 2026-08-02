package com.ybsdk.feature.webview.internal.utils;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.lifecycle.p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.utils.DownloadBlobFileJSInterface$saveBlobFile$1", f = "DownloadBlobFileJSInterface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DownloadBlobFileJSInterface$saveBlobFile$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $base64Data;
    final /* synthetic */ String $dateString;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $mimetype;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DownloadBlobFileJSInterface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadBlobFileJSInterface$saveBlobFile$1(DownloadBlobFileJSInterface downloadBlobFileJSInterface, String str, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloadBlobFileJSInterface;
        this.$dateString = str;
        this.$fileName = str2;
        this.$mimetype = str3;
        this.$base64Data = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DownloadBlobFileJSInterface$saveBlobFile$1 downloadBlobFileJSInterface$saveBlobFile$1 = new DownloadBlobFileJSInterface$saveBlobFile$1(this.this$0, this.$dateString, this.$fileName, this.$mimetype, this.$base64Data, continuation);
        downloadBlobFileJSInterface$saveBlobFile$1.L$0 = obj;
        return downloadBlobFileJSInterface$saveBlobFile$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DownloadBlobFileJSInterface$saveBlobFile$1 downloadBlobFileJSInterface$saveBlobFile$1 = (DownloadBlobFileJSInterface$saveBlobFile$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        downloadBlobFileJSInterface$saveBlobFile$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DownloadBlobFileJSInterface downloadBlobFileJSInterface = this.this$0;
        String str = this.$dateString;
        String str2 = this.$fileName;
        String str3 = this.$mimetype;
        String str4 = this.$base64Data;
        try {
            String str5 = str + "_" + str2;
            downloadBlobFileJSInterface.getClass();
            Context context = downloadBlobFileJSInterface.a;
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str5);
            contentValues.put("mime_type", str3);
            Uri insert = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (insert != 0) {
                byte[] decode = Base64.decode(new Regex("^data:" + str3 + ";base64,").k(str4, ""), 0);
                OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
                failure = insert;
                if (openOutputStream != null) {
                    try {
                        openOutputStream.write(decode);
                        openOutputStream.flush();
                        openOutputStream.close();
                        failure = insert;
                    } finally {
                    }
                }
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        DownloadBlobFileJSInterface downloadBlobFileJSInterface2 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            p pVar = downloadBlobFileJSInterface2.c;
            sjh sjhVar = uyj.a;
            tje.N(pVar, o400.a, null, new DownloadBlobFileJSInterface$saveBlobFile$1$2$1((Uri) failure, downloadBlobFileJSInterface2, null), 2);
        }
        DownloadBlobFileJSInterface downloadBlobFileJSInterface3 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            p pVar2 = downloadBlobFileJSInterface3.c;
            sjh sjhVar2 = uyj.a;
            tje.N(pVar2, o400.a, null, new DownloadBlobFileJSInterface$saveBlobFile$1$3$1(downloadBlobFileJSInterface3, a, null), 2);
        }
        return zy11.a;
    }
}
