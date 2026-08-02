package com.yandex.go.scooters.zones.info.ui;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoImageView;
import defpackage.m9p0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q9p0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.info.ui.HeaderItemViewHolder$bind$1$1", f = "ScootersZonesInfoContentAdapter.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class HeaderItemViewHolder$bind$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ m9p0 $data;
    final /* synthetic */ q9p0 $this_with;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderItemViewHolder$bind$1$1(q9p0 q9p0Var, b bVar, m9p0 m9p0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_with = q9p0Var;
        this.this$0 = bVar;
        this.$data = m9p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HeaderItemViewHolder$bind$1$1(this.$this_with, this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HeaderItemViewHolder$bind$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GoImageView goImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            GoImageView goImageView2 = this.$this_with.c;
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.S;
            String str = this.$data.a;
            this.L$0 = goImageView2;
            this.label = 1;
            Object k = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, this, 14);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = k;
            goImageView = goImageView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            goImageView = (GoImageView) this.L$0;
            kotlin.b.b(obj);
        }
        goImageView.setImageDrawable((Drawable) obj);
        return zy11.a;
    }
}
