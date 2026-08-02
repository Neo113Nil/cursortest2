package com.yandex.messaging.ui.imageviewer;

import defpackage.jna1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ydz;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljava/io/File;", "<anonymous>", "(Ltse;)Ljava/io/File;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.imageviewer.ImageSaver$save$2$outFile$1", f = "ImageSaver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ImageSaver$save$2$outFile$1 extends SuspendLambda implements wls {
    final /* synthetic */ ImageViewerInfo $imageInfo;
    final /* synthetic */ File $loadedFile;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSaver$save$2$outFile$1(a aVar, ImageViewerInfo imageViewerInfo, File file, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageInfo = imageViewerInfo;
        this.$loadedFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImageSaver$save$2$outFile$1(this.this$0, this.$imageInfo, this.$loadedFile, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImageSaver$save$2$outFile$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            File b = jna1.b((File) this.this$0.d.getValue(), this.$imageInfo.getName());
            kotlin.io.b.k(this.$loadedFile, b, true, 4);
            return b;
        } catch (IOException e) {
            ImageViewerInfo imageViewerInfo = this.$imageInfo;
            if (ydz.a.a()) {
                ydz.c("ImageSaver", "Failed to save image: " + imageViewerInfo.getName() + ")}", e);
            }
            this.this$0.c.reportError("Failed to saved image", e);
            return null;
        }
    }
}
