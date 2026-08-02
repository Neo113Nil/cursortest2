package com.yandex.go.places.impl.ui.search.viewholder;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dvp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ovp0;
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
@mvg(c = "com.yandex.go.places.impl.ui.search.viewholder.SearchNoItemsViewHolder$bind$4$1", f = "SearchNoItemsViewHolder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchNoItemsViewHolder$bind$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ dvp0 $button;
    final /* synthetic */ ovp0 $typedView;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchNoItemsViewHolder$bind$4$1(d dVar, ovp0 ovp0Var, dvp0 dvp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$typedView = ovp0Var;
        this.$button = dvp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchNoItemsViewHolder$bind$4$1(this.this$0, this.$typedView, this.$button, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchNoItemsViewHolder$bind$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.U.getClass();
            sjh sjhVar = uyj.a;
            SearchNoItemsViewHolder$bind$4$1$title$1 searchNoItemsViewHolder$bind$4$1$title$1 = new SearchNoItemsViewHolder$bind$4$1$title$1(this.this$0, this.$button, null);
            this.label = 1;
            obj = tje.k0(sjhVar, searchNoItemsViewHolder$bind$4$1$title$1, this);
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
