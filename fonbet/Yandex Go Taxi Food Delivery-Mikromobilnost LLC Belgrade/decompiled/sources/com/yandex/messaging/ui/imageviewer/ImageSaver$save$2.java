package com.yandex.messaging.ui.imageviewer;

import com.yandex.images.utils.ScaleMode;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g9v;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xn50;
import defpackage.yn50;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.imageviewer.ImageSaver$save$2", f = "ImageSaver.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 60}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ImageSaver$save$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $height;
    final /* synthetic */ ImageViewerInfo $imageInfo;
    final /* synthetic */ sls $onErrorAction;
    final /* synthetic */ tls $onSuccessAction;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSaver$save$2(a aVar, ImageViewerInfo imageViewerInfo, int i, int i2, tls tlsVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageInfo = imageViewerInfo;
        this.$width = i;
        this.$height = i2;
        this.$onSuccessAction = tlsVar;
        this.$onErrorAction = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImageSaver$save$2(this.this$0, this.$imageInfo, this.$width, this.$height, this.$onSuccessAction, this.$onErrorAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImageSaver$save$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            g9v load = this.this$0.b.load(this.$imageInfo.getUrl());
            int i2 = this.$width;
            yn50 yn50Var = (yn50) load;
            xn50 xn50Var = yn50Var.b;
            xn50Var.i = i2;
            xn50Var.j = this.$height;
            xn50Var.f = true;
            xn50Var.k = ScaleMode.FIT_CENTER;
            this.label = 1;
            obj = com.yandex.messaging.extension.a.c(yn50Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                File file = (File) obj;
                if (file != null) {
                    this.$onSuccessAction.invoke(file);
                    return zy11Var;
                }
                this.$onErrorAction.invoke();
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        File file2 = (File) obj;
        if (file2 == null) {
            return zy11Var;
        }
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        ImageSaver$save$2$outFile$1 imageSaver$save$2$outFile$1 = new ImageSaver$save$2$outFile$1(this.this$0, this.$imageInfo, file2, null);
        this.label = 2;
        obj = tje.k0(mdhVar, imageSaver$save$2$outFile$1, this);
    }
}
