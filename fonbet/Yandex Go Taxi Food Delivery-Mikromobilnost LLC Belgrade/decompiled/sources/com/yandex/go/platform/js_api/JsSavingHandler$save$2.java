package com.yandex.go.platform.js_api;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.yandex.go.platform.js_api.models.JsFile;
import defpackage.g0c;
import defpackage.lb20;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qca1;
import defpackage.qoi0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsSavingHandler$save$2", f = "JsSavingHandler.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsSavingHandler$save$2 extends SuspendLambda implements wls {
    final /* synthetic */ JsFile $jsFile;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsSavingHandler$save$2(h hVar, JsFile jsFile, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$jsFile = jsFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsSavingHandler$save$2(this.this$0, this.$jsFile, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsSavingHandler$save$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object failure2;
        Object obj2 = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            JsFile jsFile = this.$jsFile;
            lb20 lb20Var = hVar.b;
            lfx[] lfxVarArr = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IllegalArgumentException.class)}, 1);
            try {
                failure = obj2;
            } catch (Exception e) {
                for (lfx lfxVar : lfxVarArr) {
                    if (((g0c) lfxVar).e(e)) {
                        qca1.d(e, "JsSavingHandler");
                        failure = new Result.Failure(e);
                    }
                }
                throw e;
            }
            h hVar2 = this.this$0;
            JsFile jsFile2 = this.$jsFile;
            Throwable a = Result.a(failure);
            if (a == null) {
                hVar2.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", jsFile2.b);
                contentValues.put("mime_type", jsFile2.c);
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + File.separator + hVar2.c);
                ContentResolver contentResolver = hVar2.a.getContentResolver();
                lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IllegalStateException.class), qoi0.a(IOException.class)}, 2);
                lfx[] lfxVarArr3 = (lfx[]) Arrays.copyOf(lfxVarArr2, lfxVarArr2.length);
                try {
                    Uri insert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                    if (insert == null) {
                        NullPointerException nullPointerException = new NullPointerException() { // from class: com.yandex.go.platform.js_api.JsSavingHandler$JsSavingHandlerExceptions$ContentResolverInsertException
                        };
                        qca1.d(nullPointerException, "JsSavingHandler");
                        obj2 = new Result.Failure(nullPointerException);
                    } else {
                        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                        if (openOutputStream == null) {
                            NullPointerException nullPointerException2 = new NullPointerException() { // from class: com.yandex.go.platform.js_api.JsSavingHandler$JsSavingHandlerExceptions$ContentResolverOutputStreamException
                            };
                            qca1.d(nullPointerException2, "JsSavingHandler");
                            obj2 = new Result.Failure(nullPointerException2);
                        } else {
                            try {
                                openOutputStream.write((byte[]) jsFile2.d.getValue());
                                openOutputStream.close();
                            } finally {
                            }
                        }
                    }
                } catch (Exception e2) {
                    for (lfx lfxVar2 : lfxVarArr3) {
                        if (((g0c) lfxVar2).e(e2)) {
                            qca1.d(e2, "JsSavingHandler");
                            obj2 = new Result.Failure(e2);
                        }
                    }
                    throw e2;
                }
                failure2 = obj2;
            } else {
                failure2 = new Result.Failure(a);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            failure2 = ((Result) obj).getValue();
        }
        return new Result(failure2);
    }
}
