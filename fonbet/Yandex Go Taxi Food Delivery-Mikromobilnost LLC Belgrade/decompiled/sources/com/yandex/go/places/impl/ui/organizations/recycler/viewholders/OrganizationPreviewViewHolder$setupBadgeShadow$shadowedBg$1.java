package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.so80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/LayerDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/LayerDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.recycler.viewholders.OrganizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1", f = "OrganizationPreviewViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1 extends SuspendLambda implements wls {
    final /* synthetic */ so80 $this_setupBadgeShadow;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1(b bVar, so80 so80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$this_setupBadgeShadow = so80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1(this.this$0, this.$this_setupBadgeShadow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        float intValue = ((Number) this.this$0.c0.getValue()).intValue();
        float intValue2 = ((Number) this.this$0.d0.getValue()).intValue();
        int a = c.a(mqg0.black_alpha10, ((so80) ((zo31) this.this$0.R)).a);
        ShapeDrawable shapeDrawable = (ShapeDrawable) this.this$0.e0.getValue();
        so80 so80Var = this.$this_setupBadgeShadow;
        shapeDrawable.setIntrinsicWidth(so80Var.b.getWidth());
        shapeDrawable.setIntrinsicHeight(so80Var.b.getHeight());
        b bVar = this.this$0;
        ru.yandex.taxi.design.utils.a aVar = bVar.W;
        ShapeDrawable shapeDrawable2 = (ShapeDrawable) bVar.e0.getValue();
        int d = aVar.d(shapeDrawable2);
        int b = aVar.b(shapeDrawable2);
        float f = ru.yandex.taxi.design.utils.a.f(intValue2, 0.0f);
        float f2 = ru.yandex.taxi.design.utils.a.f(intValue2, intValue);
        int g = ru.yandex.taxi.design.utils.a.g(intValue2, d, f);
        int g2 = ru.yandex.taxi.design.utils.a.g(intValue2, b, f2);
        int c = (int) ru.yandex.taxi.design.utils.a.c(intValue2, 0.0f);
        int c2 = (int) ru.yandex.taxi.design.utils.a.c(intValue2, intValue);
        Rect rect = new Rect(c, c2, g - (d + c), g2 - (b + c2));
        b bVar2 = this.this$0;
        ru.yandex.taxi.design.utils.a aVar2 = bVar2.W;
        ShapeDrawable shapeDrawable3 = (ShapeDrawable) bVar2.e0.getValue();
        aVar2.getClass();
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{aVar2.e(shapeDrawable3, 0.0f, intValue, intValue2, a, false)});
        layerDrawable.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        return layerDrawable;
    }
}
