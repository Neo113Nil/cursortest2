package com.yandex.go.business.impl.web.handler;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.yandex.go.business.impl.web.model.JsFile;
import defpackage.g0c;
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
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.web.handler.JsSavingHandler$save$2", f = "JsSavingHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class JsSavingHandler$save$2 extends SuspendLambda implements wls {
    final /* synthetic */ JsFile $jsFile;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsSavingHandler$save$2(a aVar, JsFile jsFile, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
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
        Object obj2 = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        JsFile jsFile = this.$jsFile;
        lfx[] lfxVarArr = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IllegalArgumentException.class)}, 1);
        try {
            failure = obj2;
        } catch (Exception e) {
            for (lfx lfxVar : lfxVarArr) {
                if (((g0c) lfxVar).e(e)) {
                    hst hstVar = jst.e;
                    String X = kotlin.collections.a.X(j73.A(new String[]{"YangoBusiness", "JsSavingHandler", qoi0.a(e.getClass()).d()}), Extension.DOT_CHAR, null, null, null, 62);
                    String message = e.getMessage();
                    xby.l(hstVar, X, null, e, message == null ? "" : message, 2);
                    failure = new Result.Failure(e);
                }
            }
            throw e;
        }
        a aVar = this.this$0;
        JsFile jsFile2 = this.$jsFile;
        Throwable a = Result.a(failure);
        if (a == null) {
            aVar.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", jsFile2.b);
            contentValues.put("mime_type", jsFile2.c);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + File.separator + "YangoBusiness");
            ContentResolver contentResolver = aVar.a.getContentResolver();
            lfx[] lfxVarArr2 = (lfx[]) Arrays.copyOf(new lfx[]{qoi0.a(IllegalStateException.class), qoi0.a(IOException.class)}, 2);
            lfx[] lfxVarArr3 = (lfx[]) Arrays.copyOf(lfxVarArr2, lfxVarArr2.length);
            try {
                Uri insert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                if (insert == null) {
                    obj2 = a.a(new NullPointerException() { // from class: com.yandex.go.business.impl.web.handler.JsSavingHandler$JsSavingHandlerExceptions$ContentResolverInsertException
                    });
                } else {
                    OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                    if (openOutputStream == null) {
                        obj2 = a.a(new NullPointerException() { // from class: com.yandex.go.business.impl.web.handler.JsSavingHandler$JsSavingHandlerExceptions$ContentResolverOutputStreamException
                        });
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
                        hst hstVar2 = jst.e;
                        String X2 = kotlin.collections.a.X(j73.A(new String[]{"YangoBusiness", "JsSavingHandler", qoi0.a(e2.getClass()).d()}), Extension.DOT_CHAR, null, null, null, 62);
                        String message2 = e2.getMessage();
                        xby.l(hstVar2, X2, null, e2, message2 == null ? "" : message2, 2);
                        obj2 = new Result.Failure(e2);
                    }
                }
                throw e2;
            }
        } else {
            obj2 = new Result.Failure(a);
        }
        return new Result(obj2);
    }
}
