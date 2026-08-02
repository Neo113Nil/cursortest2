package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.yandex.go.slot.dto.b2;
import defpackage.aog0;
import defpackage.dms;
import defpackage.ibk0;
import defpackage.kdc;
import defpackage.lck0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.qje;
import defpackage.s8o;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lw8i0;", "itemsDecoration", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "backgroundImage", "", "rating", "", "needOldStarsInRatingSelector", "Lzjk0;", "<anonymous>", "(Lw8i0;Lru/yandex/taxi/utils/UiStateDrawableWrapper;IZ)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.RideCardBaseRatingSelectorDataSource$baseStateFlow$2", f = "RideCardBaseRatingSelectorDataSource.kt", l = {72, HProv.ALG_SID_SHA3_224, 80}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardBaseRatingSelectorDataSource$baseStateFlow$2 extends SuspendLambda implements dms {
    final /* synthetic */ b2 $action;
    final /* synthetic */ lck0 $uiStateProvider;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBaseRatingSelectorDataSource$baseStateFlow$2(lck0 lck0Var, e eVar, b2 b2Var, Continuation continuation) {
        super(5, continuation);
        this.$uiStateProvider = lck0Var;
        this.this$0 = eVar;
        this.$action = b2Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj3).intValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        RideCardBaseRatingSelectorDataSource$baseStateFlow$2 rideCardBaseRatingSelectorDataSource$baseStateFlow$2 = new RideCardBaseRatingSelectorDataSource$baseStateFlow$2(this.$uiStateProvider, this.this$0, this.$action, (Continuation) obj5);
        rideCardBaseRatingSelectorDataSource$baseStateFlow$2.L$0 = (w8i0) obj;
        rideCardBaseRatingSelectorDataSource$baseStateFlow$2.L$1 = (UiStateDrawableWrapper) obj2;
        rideCardBaseRatingSelectorDataSource$baseStateFlow$2.I$0 = intValue;
        rideCardBaseRatingSelectorDataSource$baseStateFlow$2.Z$0 = booleanValue;
        return rideCardBaseRatingSelectorDataSource$baseStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v8i0 v8i0Var;
        w8i0 w8i0Var = (w8i0) this.L$0;
        UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) this.L$1;
        int i = this.I$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            if (i2 == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            if (i2 == 3) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            lck0 lck0Var = this.$uiStateProvider;
            ibk0 a = e.a(this.this$0, this.$action);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = i;
            this.Z$0 = z;
            this.label = 1;
            Object a2 = lck0Var.a(i, a, null, null, this);
            if (a2 != coroutineSingletons) {
                return a2;
            }
        } else if (uiStateDrawableWrapper == null || i != 5) {
            lck0 lck0Var2 = this.$uiStateProvider;
            ibk0 a3 = e.a(this.this$0, this.$action);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = i;
            this.Z$0 = z;
            this.label = 3;
            Object a4 = lck0Var2.a(i, a3, null, w8i0Var, this);
            if (a4 != coroutineSingletons) {
                return a4;
            }
        } else {
            e eVar = this.this$0;
            kdc kdcVar = (w8i0Var == null || (v8i0Var = w8i0Var.a) == null) ? null : v8i0Var.b;
            Context context = eVar.a;
            int m = kdcVar != null ? s8o.m(kdcVar, context) : qje.t(aog0.decoratedRatingBarStarColor, context);
            uiStateDrawableWrapper.setColorFilter(new PorterDuffColorFilter(m, PorterDuff.Mode.SRC_IN));
            UiStateDrawableWrapper g = pkf.g(uiStateDrawableWrapper, uiStateDrawableWrapper.getTag() + m, null);
            lck0 lck0Var3 = this.$uiStateProvider;
            ibk0 a5 = e.a(this.this$0, this.$action);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = i;
            this.Z$0 = z;
            this.label = 2;
            Object a6 = lck0Var3.a(i, a5, g, w8i0Var, this);
            if (a6 != coroutineSingletons) {
                return a6;
            }
        }
        return coroutineSingletons;
    }
}
