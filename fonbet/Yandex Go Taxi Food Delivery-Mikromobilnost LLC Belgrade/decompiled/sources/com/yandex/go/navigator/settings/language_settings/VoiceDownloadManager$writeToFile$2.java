package com.yandex.go.navigator.settings.language_settings;

import defpackage.g8e;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.language_settings.VoiceDownloadManager$writeToFile$2", f = "VoiceDownloadManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class VoiceDownloadManager$writeToFile$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $savingFilePath;
    final /* synthetic */ ZipInputStream $zipInputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDownloadManager$writeToFile$2(String str, ZipInputStream zipInputStream, Continuation continuation) {
        super(2, continuation);
        this.$savingFilePath = str;
        this.$zipInputStream = zipInputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VoiceDownloadManager$writeToFile$2(this.$savingFilePath, this.$zipInputStream, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceDownloadManager$writeToFile$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.$savingFilePath;
        ZipInputStream zipInputStream = this.$zipInputStream;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read <= -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                failure = zy11.a;
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        String str2 = this.$savingFilePath;
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.l(jst.e, "NAVIGATOR", null, a, g8e.o("failed to write to file ", str2), 2);
        }
        return new Result(failure);
    }
}
