package com.yandex.go.scooters.discovery;

import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryModalView$updateLogotypeShadow$1", f = "ScootersDiscoveryModalView.kt", l = {406}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersDiscoveryModalView$updateLogotypeShadow$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $logotypeShadow;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ ScootersDiscoveryModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryModalView$updateLogotypeShadow$1(ScootersDiscoveryModalView scootersDiscoveryModalView, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersDiscoveryModalView;
        this.$logotypeShadow = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDiscoveryModalView$updateLogotypeShadow$1(this.this$0, this.$logotypeShadow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDiscoveryModalView$updateLogotypeShadow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tt2 tt2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int c = ru.yandex.taxi.design.utils.c.c(xng0.effectShadowBottomClose, this.this$0);
            int c2 = ru.yandex.taxi.design.utils.c.c(xng0.bgMain, this.this$0);
            tt2Var = this.this$0.appDispatchers;
            tt2Var.getClass();
            sjh sjhVar = uyj.a;
            ScootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1 scootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1 = new ScootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1(this.this$0, c, c2, null);
            this.I$0 = c;
            this.I$1 = c2;
            this.label = 1;
            obj = tje.k0(sjhVar, scootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Drawable drawable = (Drawable) obj;
        this.$logotypeShadow.setBackground(drawable);
        ru.yandex.taxi.design.utils.c.D(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), this.$logotypeShadow);
        return zy11.a;
    }
}
