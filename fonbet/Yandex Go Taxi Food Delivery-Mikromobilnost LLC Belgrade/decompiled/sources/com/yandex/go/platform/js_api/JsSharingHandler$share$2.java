package com.yandex.go.platform.js_api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.d1;
import androidx.core.content.FileProvider;
import com.yandex.go.platform.js_api.models.JsFile;
import com.yandex.go.platform.js_api.models.JsFilesContent;
import com.yandex.go.platform.js_api.models.JsTextContent;
import defpackage.g0c;
import defpackage.g3r;
import defpackage.lb20;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obx;
import defpackage.qca1;
import defpackage.qoi0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsSharingHandler$share$2", f = "JsSharingHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsSharingHandler$share$2 extends SuspendLambda implements wls {
    final /* synthetic */ JsFilesContent $files;
    final /* synthetic */ JsTextContent $text;
    int label;
    final /* synthetic */ obx this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsSharingHandler$share$2(obx obxVar, JsTextContent jsTextContent, JsFilesContent jsFilesContent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = obxVar;
        this.$text = jsTextContent;
        this.$files = jsFilesContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsSharingHandler$share$2(this.this$0, this.$text, this.$files, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        JsSharingHandler$share$2 jsSharingHandler$share$2 = (JsSharingHandler$share$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        jsSharingHandler$share$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List<JsFile> list;
        Object failure;
        Object obj2;
        Object failure2;
        Object failure3;
        List list2;
        JsFile jsFile;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d1 d1Var = new d1(this.this$0.a);
        Intent intent = (Intent) d1Var.c;
        JsTextContent jsTextContent = this.$text;
        JsFilesContent jsFilesContent = this.$files;
        obx obxVar = this.this$0;
        intent.putExtra("android.intent.extra.TEXT", (CharSequence) jsTextContent.a);
        if (jsFilesContent == null || (list2 = jsFilesContent.a) == null || (jsFile = (JsFile) kotlin.collections.a.R(list2)) == null || (str = jsFile.c) == null) {
            str = "text/plain";
        }
        intent.setType(str);
        Object obj3 = zy11.a;
        if (jsFilesContent != null && (list = jsFilesContent.a) != null) {
            for (JsFile jsFile2 : list) {
                lb20 lb20Var = obxVar.b;
                Activity activity = obxVar.a;
                lfx[] lfxVarArr = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IllegalArgumentException.class)}, 1);
                try {
                    failure = (byte[]) jsFile2.d.getValue();
                } catch (Exception e) {
                    for (lfx lfxVar : lfxVarArr) {
                        if (((g0c) lfxVar).e(e)) {
                            qca1.d(e, "JsSharingHandler");
                            failure = new Result.Failure(e);
                        }
                    }
                    throw e;
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                byte[] bArr = (byte[]) failure;
                if (bArr != null) {
                    File externalCacheDir = activity.getExternalCacheDir();
                    if (externalCacheDir == null) {
                        externalCacheDir = activity.getCacheDir();
                    }
                    File file = new File(externalCacheDir, "share.data");
                    lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IOException.class)}, 1);
                    try {
                        g3r.f(file, bArr);
                        failure2 = obj3;
                        obj2 = null;
                    } catch (Exception e2) {
                        for (lfx lfxVar2 : lfxVarArr2) {
                            obj2 = null;
                            if (((g0c) lfxVar2).e(e2)) {
                                qca1.d(e2, "JsSharingHandler");
                                failure2 = new Result.Failure(e2);
                            }
                        }
                        throw e2;
                    }
                    if (failure2 instanceof Result.Failure) {
                        failure2 = obj2;
                    }
                    if (((zy11) failure2) == null) {
                        continue;
                    } else {
                        lfx[] lfxVarArr3 = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IllegalArgumentException.class)}, 1);
                        try {
                            failure3 = FileProvider.getUriForFile(activity, activity.getPackageName() + ".goplatform.fileprovider", file, jsFile2.b);
                        } catch (Exception e3) {
                            for (lfx lfxVar3 : lfxVarArr3) {
                                if (((g0c) lfxVar3).e(e3)) {
                                    qca1.d(e3, "JsSharingHandler");
                                    failure3 = new Result.Failure(e3);
                                }
                            }
                            throw e3;
                        }
                        if (failure3 instanceof Result.Failure) {
                            failure3 = obj2;
                        }
                        Uri uri = (Uri) failure3;
                        if (uri != null) {
                            d1Var.a(uri);
                        }
                    }
                }
            }
        }
        ((Context) d1Var.b).startActivity(d1Var.b());
        return obj3;
    }
}
