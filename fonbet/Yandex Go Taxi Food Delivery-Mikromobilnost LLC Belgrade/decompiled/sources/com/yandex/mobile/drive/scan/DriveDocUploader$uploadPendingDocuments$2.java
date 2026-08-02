package com.yandex.mobile.drive.scan;

import android.os.SystemClock;
import com.yandex.mobile.drive.core.network.ResponseError;
import defpackage.fvj0;
import defpackage.gvj0;
import defpackage.h2b1;
import defpackage.io31;
import defpackage.jvj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.zls;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "key", "", "file", "Ljava/io/File;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mobile.drive.scan.DriveDocUploader$uploadPendingDocuments$2", f = "ScanParams.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DriveDocUploader$uploadPendingDocuments$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DriveDocUploader$uploadPendingDocuments$2 driveDocUploader$uploadPendingDocuments$2 = new DriveDocUploader$uploadPendingDocuments$2(3, (Continuation) obj3);
        driveDocUploader$uploadPendingDocuments$2.L$0 = (String) obj;
        driveDocUploader$uploadPendingDocuments$2.L$1 = (File) obj2;
        return driveDocUploader$uploadPendingDocuments$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IOException e;
        io31 io31Var;
        ResponseError.Details details;
        String str = (String) this.L$0;
        File file = (File) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        String str2 = null;
        if (i == 0) {
            b.b(obj);
            io31 io31Var2 = new io31(str);
            Double d = new Double(file.length());
            io31Var2.b = SystemClock.uptimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            hashMap.put("size", d);
            qgn0 qgn0Var = h2b1.c;
            if (qgn0Var != null) {
                qgn0Var.n("video_uploading", hashMap);
            }
            try {
                com.yandex.mobile.drive.scan.dao.a aVar = new com.yandex.mobile.drive.scan.dao.a();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = io31Var2;
                this.label = 1;
                Object a = aVar.a(file, str, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                io31Var = io31Var2;
            } catch (IOException e2) {
                e = e2;
                io31Var = io31Var2;
                io31Var.a(e.getMessage());
                return Boolean.valueOf(z);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            io31Var = (io31) this.L$2;
            try {
                b.b(obj);
            } catch (IOException e3) {
                e = e3;
                io31Var.a(e.getMessage());
                return Boolean.valueOf(z);
            }
        }
        jvj0 jvj0Var = (jvj0) obj;
        if (jvj0Var instanceof gvj0) {
            io31Var.b();
            z = true;
        } else {
            if (!(jvj0Var instanceof fvj0)) {
                throw new NoWhenBranchMatchedException();
            }
            ResponseError responseError = ((fvj0) jvj0Var).a;
            if (responseError != null && (details = responseError.getDetails()) != null) {
                str2 = details.getUiMessage();
            }
            io31Var.a(str2);
        }
        return Boolean.valueOf(z);
    }
}
