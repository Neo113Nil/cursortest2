package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import defpackage.aog0;
import defpackage.bdc;
import defpackage.dzg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.qje;
import defpackage.tje;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.xng0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv8i0;", "selectedDecoration", "unselectedDecoration", "Lw8i0;", "<anonymous>", "(Lv8i0;Lv8i0;)Lw8i0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.RideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1", f = "RideCardBaseRatingSelectorDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1 rideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1 = new RideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1(this.this$0, (Continuation) obj3);
        rideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1.L$0 = (v8i0) obj;
        rideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1.L$1 = (v8i0) obj2;
        return rideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v8i0 v8i0Var = (v8i0) this.L$0;
        v8i0 v8i0Var2 = (v8i0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v8i0 v8i0Var3 = v8i0.c;
        if (v8i0Var != v8i0Var3 && v8i0Var2 != v8i0Var3) {
            return new w8i0(v8i0Var, v8i0Var2);
        }
        e eVar = this.this$0;
        eVar.getClass();
        Context context = eVar.a;
        int t = qje.t(aog0.decoratedRatingBarStarColor, context);
        Drawable y = tje.y(dzg0.ic_rating_star_rounded_corners, context);
        y.mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        y.setColorFilter(new PorterDuffColorFilter(t, mode));
        v8i0 v8i0Var4 = new v8i0(pkf.g(y, "rating_selector_default_selected_star" + t, null), new bdc(aog0.decoratedRatingBarStarColor));
        int u = qje.u(context.getTheme(), xng0.controlMinor);
        Drawable y2 = tje.y(dzg0.ic_rating_star_rounded_corners, context);
        y2.mutate();
        y2.setColorFilter(new PorterDuffColorFilter(u, mode));
        return new w8i0(v8i0Var4, new v8i0(pkf.g(y2, "rating_selector_default_unselected_star" + u, null), null));
    }
}
