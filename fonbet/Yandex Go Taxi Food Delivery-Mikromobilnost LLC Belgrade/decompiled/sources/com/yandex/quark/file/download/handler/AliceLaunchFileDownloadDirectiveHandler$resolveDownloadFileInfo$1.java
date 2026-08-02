package com.yandex.quark.file.download.handler;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.quark.file.download.handler.AliceLaunchFileDownloadDirectiveHandler", f = "AliceLaunchFileDownloadDirectiveHandler.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "resolveDownloadFileInfo")
/* loaded from: classes12.dex */
final class AliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, null, false, this);
    }
}
