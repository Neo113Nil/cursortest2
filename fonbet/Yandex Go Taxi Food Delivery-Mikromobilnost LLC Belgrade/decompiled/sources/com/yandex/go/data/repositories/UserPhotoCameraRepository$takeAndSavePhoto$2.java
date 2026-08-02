package com.yandex.go.data.repositories;

import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.cjw0;
import defpackage.d9v;
import defpackage.dvw;
import defpackage.hst;
import defpackage.jst;
import defpackage.kol0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1s;
import defpackage.s8v;
import defpackage.tse;
import defpackage.unr0;
import defpackage.w8v;
import defpackage.wls;
import defpackage.xby;
import defpackage.xfo;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/net/Uri;", "<anonymous>", "(Ltse;)Landroid/net/Uri;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.data.repositories.UserPhotoCameraRepository$takeAndSavePhoto$2", f = "UserPhotoCameraRepository.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
final class UserPhotoCameraRepository$takeAndSavePhoto$2 extends SuspendLambda implements wls {
    final /* synthetic */ w8v $imageCapture;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoCameraRepository$takeAndSavePhoto$2(a aVar, w8v w8vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageCapture = w8vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserPhotoCameraRepository$takeAndSavePhoto$2(this.this$0, this.$imageCapture, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoCameraRepository$takeAndSavePhoto$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            w8v w8vVar = this.$imageCapture;
            this.L$0 = aVar;
            this.L$1 = w8vVar;
            this.label = 1;
            kol0 kol0Var = new kol0(dvw.b(this));
            Uri b = aVar.d.b();
            FileOutputStream fileOutputStream = new FileOutputStream(aVar.d.a());
            s8v s8vVar = new s8v();
            s8vVar.a = true;
            s8vVar.b = true;
            w8vVar.O(new r1s((File) null, fileOutputStream, s8vVar), aVar.c.a, new cjw0(fileOutputStream, kol0Var, b));
            obj = kol0Var.a();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Uri uri = (Uri) obj;
        d9v d9vVar = this.this$0.a;
        d9vVar.getClass();
        try {
            failure = d9v.c(d9vVar.a.getContentResolver(), uri);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            hst hstVar = jst.e;
            String message = a.getMessage();
            if (message == null) {
                message = "";
            }
            xby.l(hstVar, "USER_PHOTO_UPLOAD:USER_PHOTO_COMPRESSION_ERROR", null, a, message, 2);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Bitmap bitmap = (Bitmap) failure;
        if (bitmap == null) {
            xfo.g(unr0.n(uri, "Failed to rotate bitmap for uri="));
            return null;
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(this.this$0.d.a());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        try {
            fileOutputStream2.write(byteArrayOutputStream.toByteArray());
            fileOutputStream2.close();
            return this.this$0.d.b();
        } finally {
        }
    }
}
