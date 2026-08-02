package com.yandex.go.platform.web_view_client.upload_image;

import android.content.Context;
import androidx.core.content.FileProvider;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Landroid/net/Uri;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.web_view_client.upload_image.CameraCaptureDelegate$createTempImageFileUri$2", f = "CameraCaptureDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CameraCaptureDelegate$createTempImageFileUri$2 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraCaptureDelegate$createTempImageFileUri$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraCaptureDelegate$createTempImageFileUri$2(this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraCaptureDelegate$createTempImageFileUri$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        File externalCacheDir = this.$context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = this.$context.getCacheDir();
        }
        File[] listFiles = externalCacheDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        return FileProvider.getUriForFile(this.$context, this.$context.getPackageName() + ".goplatform.fileprovider", File.createTempFile(UUID.randomUUID().toString(), ".jpg", externalCacheDir));
    }
}
