package com.yandex.go.lottie_loader.data.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lottie_loader.data.repositories.LottieAnimationCachedContentRepository$saveToFile$2", f = "LottieAnimationCachedContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LottieAnimationCachedContentRepository$saveToFile$2 extends SuspendLambda implements wls {
    final /* synthetic */ InputStream $inputStream;
    final /* synthetic */ File $outputFile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimationCachedContentRepository$saveToFile$2(File file, InputStream inputStream, Continuation continuation) {
        super(2, continuation);
        this.$outputFile = file;
        this.$inputStream = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LottieAnimationCachedContentRepository$saveToFile$2 lottieAnimationCachedContentRepository$saveToFile$2 = new LottieAnimationCachedContentRepository$saveToFile$2(this.$outputFile, this.$inputStream, continuation);
        lottieAnimationCachedContentRepository$saveToFile$2.L$0 = obj;
        return lottieAnimationCachedContentRepository$saveToFile$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LottieAnimationCachedContentRepository$saveToFile$2 lottieAnimationCachedContentRepository$saveToFile$2 = (LottieAnimationCachedContentRepository$saveToFile$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        lottieAnimationCachedContentRepository$saveToFile$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        FileOutputStream fileOutputStream = new FileOutputStream(this.$outputFile);
        InputStream inputStream = this.$inputStream;
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return zy11.a;
                }
                kotlinx.coroutines.a.k(tseVar.getCoroutineContext());
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
        }
    }
}
