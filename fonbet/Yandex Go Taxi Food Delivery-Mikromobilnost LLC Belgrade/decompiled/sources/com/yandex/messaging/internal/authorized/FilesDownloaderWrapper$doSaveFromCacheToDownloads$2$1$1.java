package com.yandex.messaging.internal.authorized;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import com.yandex.messaging.MessagingFileProvider;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sz10;
import defpackage.tse;
import defpackage.u8b1;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1", f = "FilesDownloaderWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FilesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ File $target;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1(f fVar, File file, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$target = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FilesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1(this.this$0, this.$target, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FilesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1 filesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1 = (FilesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        filesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1.invokeSuspend(zy11Var);
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
        f fVar = this.this$0;
        File file = this.$target;
        fVar.getClass();
        sz10 sz10Var = MessagingFileProvider.Companion;
        Context context = fVar.a;
        sz10Var.getClass();
        Intent d = u8b1.d(context, FileProvider.getUriForFile(context, context.getPackageName() + ".messaging.fileprovider", file));
        if (d != null) {
            context.startActivity(d);
        }
        return zy11.a;
    }
}
