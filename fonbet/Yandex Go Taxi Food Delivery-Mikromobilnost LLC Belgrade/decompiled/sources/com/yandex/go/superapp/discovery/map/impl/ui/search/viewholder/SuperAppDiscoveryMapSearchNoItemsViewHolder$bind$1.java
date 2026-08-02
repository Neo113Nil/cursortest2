package com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder;

import defpackage.jxv0;
import defpackage.mvg;
import defpackage.nxv0;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1", f = "SuperAppDiscoveryMapSearchNoItemsViewHolder.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ jxv0 $data;
    final /* synthetic */ nxv0 $typedView;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1(jxv0 jxv0Var, nxv0 nxv0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$data = jxv0Var;
        this.this$0 = dVar;
        this.$typedView = nxv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1(this.$data, this.$typedView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$data.a == null) {
                return zy11Var;
            }
            this.this$0.U.getClass();
            sjh sjhVar = uyj.a;
            SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1$title$1 superAppDiscoveryMapSearchNoItemsViewHolder$bind$1$title$1 = new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$1$title$1(this.this$0, this.$data, null);
            this.label = 1;
            obj = tje.k0(sjhVar, superAppDiscoveryMapSearchNoItemsViewHolder$bind$1$title$1, this);
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
        this.$typedView.e.setText((CharSequence) obj);
        return zy11Var;
    }
}
