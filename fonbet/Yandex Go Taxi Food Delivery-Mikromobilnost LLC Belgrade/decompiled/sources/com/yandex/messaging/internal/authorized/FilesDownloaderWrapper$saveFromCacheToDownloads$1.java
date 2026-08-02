package com.yandex.messaging.internal.authorized;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ydz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$saveFromCacheToDownloads$1", f = "FilesDownloaderWrapper.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FilesDownloaderWrapper$saveFromCacheToDownloads$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $fileId;
    final /* synthetic */ String $filename;
    final /* synthetic */ boolean $shouldOpen;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesDownloaderWrapper$saveFromCacheToDownloads$1(f fVar, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$fileId = str;
        this.$filename = str2;
        this.$shouldOpen = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FilesDownloaderWrapper$saveFromCacheToDownloads$1(this.this$0, this.$fileId, this.$filename, this.$shouldOpen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FilesDownloaderWrapper$saveFromCacheToDownloads$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (ydz.a.a()) {
                ydz.d();
            }
            f fVar = this.this$0;
            String str = this.$fileId;
            String str2 = this.$filename;
            boolean z = this.$shouldOpen;
            this.label = 1;
            if (f.a(fVar, str, str2, z, this) == coroutineSingletons) {
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
