package com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cvp0;
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
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1", f = "SuperAppDiscoveryMapSearchNoItemsViewHolder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ cvp0 $button;
    final /* synthetic */ nxv0 $typedView;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1(d dVar, nxv0 nxv0Var, cvp0 cvp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$typedView = nxv0Var;
        this.$button = cvp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1(this.this$0, this.$typedView, this.$button, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.U.getClass();
            sjh sjhVar = uyj.a;
            SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1$title$1 superAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1$title$1 = new SuperAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1$title$1(this.this$0, this.$button, null);
            this.label = 1;
            obj = tje.k0(sjhVar, superAppDiscoveryMapSearchNoItemsViewHolder$bind$4$1$title$1, this);
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
        this.$typedView.b.setVisibility(0);
        this.$typedView.b.setText((CharSequence) obj);
        return zy11.a;
    }
}
