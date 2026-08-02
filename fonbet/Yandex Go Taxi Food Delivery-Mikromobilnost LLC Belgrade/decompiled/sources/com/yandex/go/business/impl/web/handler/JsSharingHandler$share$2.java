package com.yandex.go.business.impl.web.handler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.d1;
import androidx.core.content.FileProvider;
import com.yandex.go.business.impl.web.model.JsFile;
import com.yandex.go.business.impl.web.model.JsFilesContent;
import com.yandex.go.business.impl.web.model.JsTextContent;
import defpackage.g0c;
import defpackage.g3r;
import defpackage.hst;
import defpackage.j73;
import defpackage.jst;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
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
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.web.handler.JsSharingHandler$share$2", f = "JsSharingHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class JsSharingHandler$share$2 extends SuspendLambda implements wls {
    final /* synthetic */ JsFilesContent $files;
    final /* synthetic */ JsTextContent $text;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsSharingHandler$share$2(b bVar, JsTextContent jsTextContent, JsFilesContent jsFilesContent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
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
        Object obj2;
        Object failure;
        int i;
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
        b bVar = this.this$0;
        intent.putExtra("android.intent.extra.TEXT", (CharSequence) jsTextContent.a);
        if (jsFilesContent == null || (list2 = jsFilesContent.a) == null || (jsFile = (JsFile) kotlin.collections.a.R(list2)) == null || (str = jsFile.c) == null) {
            str = "text/plain";
        }
        intent.setType(str);
        zy11 zy11Var = zy11.a;
        if (jsFilesContent != null && (list = jsFilesContent.a) != null) {
            for (JsFile jsFile2 : list) {
                lfx[] lfxVarArr = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IllegalArgumentException.class)}, 1);
                try {
                    failure = (byte[]) jsFile2.d.getValue();
                    obj2 = null;
                } catch (Exception e) {
                    for (lfx lfxVar : lfxVarArr) {
                        obj2 = null;
                        if (((g0c) lfxVar).e(e)) {
                            hst hstVar = jst.e;
                            String X = kotlin.collections.a.X(j73.A(new String[]{"YangoBusiness", "JsSharingHandler", qoi0.a(e.getClass()).d()}), Extension.DOT_CHAR, null, null, null, 62);
                            String message = e.getMessage();
                            xby.l(hstVar, X, null, e, message == null ? "" : message, 2);
                            failure = new Result.Failure(e);
                        }
                    }
                    throw e;
                }
                if (failure instanceof Result.Failure) {
                    failure = obj2;
                }
                byte[] bArr = (byte[]) failure;
                if (bArr != null) {
                    Context context = bVar.a;
                    File externalCacheDir = context.getExternalCacheDir();
                    if (externalCacheDir == null) {
                        externalCacheDir = context.getCacheDir();
                    }
                    File file = new File(externalCacheDir, "yango_business_share.data");
                    lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IOException.class)}, 1);
                    try {
                        g3r.f(file, bArr);
                        failure2 = zy11Var;
                        i = 0;
                    } catch (Exception e2) {
                        i = 0;
                        for (lfx lfxVar2 : lfxVarArr2) {
                            if (((g0c) lfxVar2).e(e2)) {
                                hst hstVar2 = jst.e;
                                String X2 = kotlin.collections.a.X(j73.A(new String[]{"YangoBusiness", "JsSharingHandler", qoi0.a(e2.getClass()).d()}), Extension.DOT_CHAR, null, null, null, 62);
                                String message2 = e2.getMessage();
                                xby.l(hstVar2, X2, null, e2, message2 == null ? "" : message2, 2);
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
                        lfx[] lfxVarArr3 = new lfx[1];
                        lfxVarArr3[i] = qoi0.a(IllegalArgumentException.class);
                        lfx[] lfxVarArr4 = (lfx[]) Arrays.copyOf(lfxVarArr3, 1);
                        try {
                            failure3 = FileProvider.getUriForFile(context, "ru.yandex.taxi.utils.fileprovider." + context.getPackageName(), file, jsFile2.b);
                        } catch (Exception e3) {
                            int length = lfxVarArr4.length;
                            for (int i2 = i; i2 < length; i2++) {
                                if (((g0c) lfxVarArr4[i2]).e(e3)) {
                                    hst hstVar3 = jst.e;
                                    String X3 = kotlin.collections.a.X(j73.A(new String[]{"YangoBusiness", "JsSharingHandler", qoi0.a(e3.getClass()).d()}), Extension.DOT_CHAR, null, null, null, 62);
                                    String message3 = e3.getMessage();
                                    xby.l(hstVar3, X3, null, e3, message3 == null ? "" : message3, 2);
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
        return zy11Var;
    }
}
