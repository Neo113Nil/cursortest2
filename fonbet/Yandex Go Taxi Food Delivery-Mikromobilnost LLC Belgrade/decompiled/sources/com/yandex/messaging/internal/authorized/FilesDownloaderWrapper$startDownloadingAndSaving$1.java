package com.yandex.messaging.internal.authorized;

import defpackage.ijg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$startDownloadingAndSaving$1", f = "FilesDownloaderWrapper.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FilesDownloaderWrapper$startDownloadingAndSaving$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $fileId;
    final /* synthetic */ String $fileName;
    final /* synthetic */ boolean $ignoreCache;
    final /* synthetic */ List<ijg0> $queryParams;
    final /* synthetic */ boolean $shouldOpen;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesDownloaderWrapper$startDownloadingAndSaving$1(f fVar, String str, String str2, List list, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$fileId = str;
        this.$fileName = str2;
        this.$shouldOpen = z;
        this.$queryParams = list;
        this.$ignoreCache = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FilesDownloaderWrapper$startDownloadingAndSaving$1(this.this$0, this.$fileId, this.$fileName, this.$queryParams, continuation, this.$shouldOpen, this.$ignoreCache);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FilesDownloaderWrapper$startDownloadingAndSaving$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            String str = this.$fileId;
            String str2 = this.$fileName;
            boolean z = this.$shouldOpen;
            List<ijg0> list = this.$queryParams;
            boolean z2 = this.$ignoreCache;
            this.label = 1;
            if (fVar.d(str, str2, z, list, z2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
