package com.yandex.go.address.search.common.presenter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import defpackage.bjd;
import defpackage.irg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.CompositeSuggestionsPresenter$setupShadow$1", f = "CompositeSuggestionsPresenter.kt", l = {480}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompositeSuggestionsPresenter$setupShadow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isMinorStyleBackground;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeSuggestionsPresenter$setupShadow$1(boolean z, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$isMinorStyleBackground = z;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositeSuggestionsPresenter$setupShadow$1(this.$isMinorStyleBackground, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompositeSuggestionsPresenter$setupShadow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.graphics.drawable.Drawable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaintDrawable paintDrawable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$isMinorStyleBackground;
            if (z) {
                PaintDrawable paintDrawable2 = new PaintDrawable(qje.t(xng0.bgMinor, this.this$0.D.a));
                paintDrawable2.setCornerRadius(r5.getResources().getDimensionPixelSize(irg0.block_v2_corner_radius));
                paintDrawable = paintDrawable2;
                ((bjd) this.this$0.Dg()).yc(paintDrawable);
                return zy11.a;
            }
            if (z) {
                w511.b();
                return null;
            }
            ru.yandex.taxi.search.a aVar = this.this$0.D;
            this.label = 1;
            obj = aVar.a(this);
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
        paintDrawable = (Drawable) obj;
        ((bjd) this.this$0.Dg()).yc(paintDrawable);
        return zy11.a;
    }
}
