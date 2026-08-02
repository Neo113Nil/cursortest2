package com.yandex.go.chargers.order.active;

import defpackage.lba;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zk9;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.AnimatedBannerViewHolder$bindAnimation$1", f = "ChargersActiveOrderAdapter.kt", l = {536}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AnimatedBannerViewHolder$bindAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ zk9 $data;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedBannerViewHolder$bindAnimation$1(a aVar, zk9 zk9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = zk9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnimatedBannerViewHolder$bindAnimation$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimatedBannerViewHolder$bindAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            int i2 = a.V;
            ((lba) ((zo31) aVar.R)).b.cancelAnimation();
            ytz ytzVar = this.this$0.S;
            String str = this.$data.d;
            this.label = 1;
            obj = ((com.yandex.go.lottie_loader.a) ytzVar).a(str, this);
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
        nsz nszVar = (nsz) obj;
        zy11 zy11Var = zy11.a;
        if (nszVar == null) {
            return zy11Var;
        }
        a aVar2 = this.this$0;
        int i3 = a.V;
        ((lba) ((zo31) aVar2.R)).b.setComposition(nszVar);
        ((lba) ((zo31) this.this$0.R)).b.playAnimation();
        return zy11Var;
    }
}
