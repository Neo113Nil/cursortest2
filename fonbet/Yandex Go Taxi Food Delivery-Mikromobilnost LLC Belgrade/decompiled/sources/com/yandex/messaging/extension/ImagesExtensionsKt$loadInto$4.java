package com.yandex.messaging.extension;

import android.widget.ImageView;
import defpackage.ad7;
import defpackage.dvw;
import defpackage.g9v;
import defpackage.j1;
import defpackage.j18;
import defpackage.mav;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.whv;
import defpackage.wls;
import defpackage.yn50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.ImagesExtensionsKt$loadInto$4", f = "ImagesExtensions.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ImagesExtensionsKt$loadInto$4 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onErrorAction;
    final /* synthetic */ sls $onNoCacheAction;
    final /* synthetic */ tls $onSuccessAction;
    final /* synthetic */ ImageView $target;
    final /* synthetic */ g9v $this_loadInto;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesExtensionsKt$loadInto$4(g9v g9vVar, ImageView imageView, sls slsVar, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$this_loadInto = g9vVar;
        this.$target = imageView;
        this.$onNoCacheAction = slsVar;
        this.$onSuccessAction = tlsVar;
        this.$onErrorAction = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImagesExtensionsKt$loadInto$4(this.$this_loadInto, this.$target, this.$onNoCacheAction, this.$onSuccessAction, this.$onErrorAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImagesExtensionsKt$loadInto$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g9v g9vVar = this.$this_loadInto;
            ImageView imageView = this.$target;
            sls slsVar = this.$onNoCacheAction;
            this.L$0 = g9vVar;
            this.L$1 = imageView;
            this.L$2 = slsVar;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            j18Var.w(new j1(13, g9vVar));
            if (((yn50) g9vVar).b(imageView, new whv(j18Var, 0)) == null) {
                slsVar.invoke();
            }
            obj = j18Var.s();
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
        oyj0 oyj0Var = (oyj0) obj;
        ad7 ad7Var = (ad7) oyj0Var.b();
        if (ad7Var != null) {
            this.$onSuccessAction.invoke(ad7Var.b);
        }
        mav mavVar = (mav) oyj0Var.a();
        if (mavVar != null) {
            this.$onErrorAction.invoke(mavVar);
        }
        return zy11.a;
    }
}
