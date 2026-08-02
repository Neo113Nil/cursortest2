package com.yandex.messaging.extension;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import defpackage.g9v;
import defpackage.jse;
import defpackage.kav;
import defpackage.l8x;
import defpackage.mav;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.yn50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.ImagesExtensionsKt$loadIntoAnimated$5", f = "ImagesExtensions.kt", l = {99, 114}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ImagesExtensionsKt$loadIntoAnimated$5 extends SuspendLambda implements wls {
    final /* synthetic */ int $badGifRatio;
    final /* synthetic */ jse $ioDispatcher;
    final /* synthetic */ long $maxGifMemorySize;
    final /* synthetic */ sls $onBadGifAction;
    final /* synthetic */ tls $onErrorAction;
    final /* synthetic */ sls $onNoCacheAction;
    final /* synthetic */ tls $onSuccessAction;
    final /* synthetic */ l8x $stubImageJob;
    final /* synthetic */ ImageView $target;
    final /* synthetic */ g9v $this_loadIntoAnimated;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesExtensionsKt$loadIntoAnimated$5(jse jseVar, g9v g9vVar, tls tlsVar, ImageView imageView, tls tlsVar2, sls slsVar, sls slsVar2, l8x l8xVar, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.$ioDispatcher = jseVar;
        this.$this_loadIntoAnimated = g9vVar;
        this.$onErrorAction = tlsVar;
        this.$target = imageView;
        this.$onSuccessAction = tlsVar2;
        this.$onNoCacheAction = slsVar;
        this.$onBadGifAction = slsVar2;
        this.$stubImageJob = l8xVar;
        this.$maxGifMemorySize = j;
        this.$badGifRatio = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImagesExtensionsKt$loadIntoAnimated$5(this.$ioDispatcher, this.$this_loadIntoAnimated, this.$onErrorAction, this.$target, this.$onSuccessAction, this.$onNoCacheAction, this.$onBadGifAction, this.$stubImageJob, this.$maxGifMemorySize, this.$badGifRatio, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImagesExtensionsKt$loadIntoAnimated$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r15 == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        Drawable drawable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            jse jseVar = this.$ioDispatcher;
            ImagesExtensionsKt$loadIntoAnimated$5$result$1 imagesExtensionsKt$loadIntoAnimated$5$result$1 = new ImagesExtensionsKt$loadIntoAnimated$5$result$1(this.$this_loadIntoAnimated, this.$onNoCacheAction, null);
            this.label = 1;
            obj = tje.k0(jseVar, imagesExtensionsKt$loadIntoAnimated$5$result$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.L$0;
                b.b(obj);
                drawable = (Drawable) obj;
                if (drawable == null) {
                    this.$target.setImageDrawable(drawable);
                    this.$onSuccessAction.invoke(uri);
                } else {
                    this.$onErrorAction.invoke(kav.f);
                }
                return zy11Var;
            }
            b.b(obj);
        }
        oyj0 oyj0Var = (oyj0) obj;
        ((yn50) this.$this_loadIntoAnimated).a();
        Uri uri2 = (Uri) oyj0Var.b();
        mav mavVar = (mav) oyj0Var.a();
        if (mavVar != null) {
            this.$onErrorAction.invoke(mavVar);
            return zy11Var;
        }
        jse jseVar2 = this.$ioDispatcher;
        ImagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1 imagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1 = new ImagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1(uri2, this.$onBadGifAction, this.$stubImageJob, this.$target, this.$maxGifMemorySize, this.$badGifRatio, null);
        this.L$0 = uri2;
        this.label = 2;
        obj = tje.k0(jseVar2, imagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1, this);
        if (obj != coroutineSingletons) {
            uri = uri2;
            drawable = (Drawable) obj;
            if (drawable == null) {
            }
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
