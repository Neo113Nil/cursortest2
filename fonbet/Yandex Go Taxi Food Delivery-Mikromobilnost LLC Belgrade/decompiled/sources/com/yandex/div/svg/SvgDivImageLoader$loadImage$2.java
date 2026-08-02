package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.DivImageLoadError;
import defpackage.btk;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uhk;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yf7;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SvgDivImageLoader$loadImage$2 extends SuspendLambda implements wls {
    final /* synthetic */ yf7 $call;
    final /* synthetic */ btk $callback;
    final /* synthetic */ String $imageUrl;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SvgDivImageLoader$loadImage$2(yf7 yf7Var, a aVar, String str, btk btkVar, Continuation continuation) {
        super(2, continuation);
        this.$call = yf7Var;
        this.this$0 = aVar;
        this.$imageUrl = str;
        this.$callback = btkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SvgDivImageLoader$loadImage$2 svgDivImageLoader$loadImage$2 = new SvgDivImageLoader$loadImage$2(this.$call, this.this$0, this.$imageUrl, this.$callback, continuation);
        svgDivImageLoader$loadImage$2.L$0 = obj;
        return svgDivImageLoader$loadImage$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SvgDivImageLoader$loadImage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                yf7 yf7Var = this.$call;
                a aVar = this.this$0;
                String str = this.$imageUrl;
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                SvgDivImageLoader$loadImage$2$1$1 svgDivImageLoader$loadImage$2$1$1 = new SvgDivImageLoader$loadImage$2$1$1(yf7Var, aVar, str, null);
                this.label = 1;
                obj = tje.k0(mdhVar, svgDivImageLoader$loadImage$2$1$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            failure = (PictureDrawable) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        a aVar2 = this.this$0;
        String str2 = this.$imageUrl;
        btk btkVar = this.$callback;
        if (!(failure instanceof Result.Failure)) {
            PictureDrawable pictureDrawable = (PictureDrawable) failure;
            aVar2.d.a.put(str2, pictureDrawable);
            btkVar.f(new uhk(pictureDrawable, BitmapSource.NETWORK));
        }
        btk btkVar2 = this.$callback;
        String str3 = this.$imageUrl;
        Throwable a = Result.a(failure);
        if (a != null) {
            if (a instanceof CancellationException) {
                throw a;
            }
            btkVar2.d(new DivImageLoadError(unr0.l('\'', "Failed to load image with url='", str3), a));
        }
        return zy11.a;
    }
}
