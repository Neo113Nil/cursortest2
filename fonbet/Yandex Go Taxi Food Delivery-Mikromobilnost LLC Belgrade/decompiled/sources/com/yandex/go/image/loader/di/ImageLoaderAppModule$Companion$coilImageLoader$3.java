package com.yandex.go.image.loader.di;

import com.yandex.go.image.loader.experiments.ImagesParametersExperiment;
import defpackage.civ;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.sav;
import defpackage.tls;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsav;", "<anonymous>", "()Lsav;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.loader.di.ImageLoaderAppModule$Companion$coilImageLoader$3", f = "ImageLoaderAppModule.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ImageLoaderAppModule$Companion$coilImageLoader$3 extends SuspendLambda implements tls {
    final /* synthetic */ yvf0 $imagesParametersRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderAppModule$Companion$coilImageLoader$3(yvf0 yvf0Var, Continuation continuation) {
        super(1, continuation);
        this.$imagesParametersRepository = yvf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ImageLoaderAppModule$Companion$coilImageLoader$3(this.$imagesParametersRepository, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ImageLoaderAppModule$Companion$coilImageLoader$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            civ civVar = (civ) this.$imagesParametersRepository.get();
            this.label = 1;
            obj = civVar.a.b(this);
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
        int i2 = ((ImagesParametersExperiment) obj).c.a.a;
        if (i2 > 0) {
            o430 o430Var = e3n.b;
            return new sav(kp50.U(i2, DurationUnit.SECONDS));
        }
        o430 o430Var2 = e3n.b;
        return new sav(kp50.U(30, DurationUnit.DAYS));
    }
}
