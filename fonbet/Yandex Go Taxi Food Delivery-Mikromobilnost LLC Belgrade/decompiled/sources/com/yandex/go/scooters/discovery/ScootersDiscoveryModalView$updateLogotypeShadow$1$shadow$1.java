package com.yandex.go.scooters.discovery;

import android.graphics.drawable.GradientDrawable;
import defpackage.h3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1", f = "ScootersDiscoveryModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $backgroundColor;
    final /* synthetic */ int $shadowColor;
    int label;
    final /* synthetic */ ScootersDiscoveryModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1(ScootersDiscoveryModalView scootersDiscoveryModalView, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersDiscoveryModalView;
        this.$shadowColor = i;
        this.$backgroundColor = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1(this.this$0, this.$shadowColor, this.$backgroundColor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDiscoveryModalView$updateLogotypeShadow$1$shadow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h3y h3yVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        float x = tje.x(this.this$0.getContext(), 1.2f);
        float w = tje.w(3, this.this$0.getContext());
        int i = this.$shadowColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        ScootersDiscoveryModalView scootersDiscoveryModalView = this.this$0;
        int i2 = this.$backgroundColor;
        int h = ru.yandex.taxi.design.utils.c.h(28, scootersDiscoveryModalView);
        gradientDrawable.setSize(h, h);
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        h3yVar = this.this$0.overlayShadowUtilLazy;
        ru.yandex.taxi.design.utils.a aVar = (ru.yandex.taxi.design.utils.a) h3yVar.get();
        aVar.getClass();
        return aVar.e(gradientDrawable, 0.0f, x, w, i, false);
    }
}
