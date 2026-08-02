package com.yandex.go.chargers.multiorder.ui;

import android.graphics.Bitmap;
import com.yandex.go.design.view.GoImageView;
import defpackage.g16;
import defpackage.h4a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r5a;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.LeasingViewHolder$bindImageLoading$1", f = "ChargersMultiOrderAdapter.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LeasingViewHolder$bindImageLoading$1 extends SuspendLambda implements wls {
    final /* synthetic */ r5a $data;
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeasingViewHolder$bindImageLoading$1(h hVar, r5a r5aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$data = r5aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LeasingViewHolder$bindImageLoading$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LeasingViewHolder$bindImageLoading$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GoImageView goImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            int i2 = h.T;
            GoImageView goImageView2 = ((h4a) ((zo31) hVar.R)).c;
            g16 b = hVar.S.b().b(this.$data.d);
            this.L$0 = goImageView2;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            goImageView = goImageView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            goImageView = (GoImageView) this.L$0;
            kotlin.b.b(obj);
        }
        goImageView.setImageBitmap((Bitmap) obj);
        return zy11.a;
    }
}
