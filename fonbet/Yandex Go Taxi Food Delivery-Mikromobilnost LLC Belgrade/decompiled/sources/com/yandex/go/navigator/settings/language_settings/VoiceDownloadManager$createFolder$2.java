package com.yandex.go.navigator.settings.language_settings;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljava/io/File;", "<anonymous>", "(Ltse;)Ljava/io/File;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.language_settings.VoiceDownloadManager$createFolder$2", f = "VoiceDownloadManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class VoiceDownloadManager$createFolder$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $path;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDownloadManager$createFolder$2(String str, Continuation continuation) {
        super(2, continuation);
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VoiceDownloadManager$createFolder$2(this.$path, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceDownloadManager$createFolder$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        File file = new File(this.$path);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
