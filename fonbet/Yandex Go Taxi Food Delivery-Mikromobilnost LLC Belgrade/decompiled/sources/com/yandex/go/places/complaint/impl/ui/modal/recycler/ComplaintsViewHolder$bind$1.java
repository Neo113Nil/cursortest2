package com.yandex.go.places.complaint.impl.ui.modal.recycler;

import com.yandex.go.design.view.GoImageView;
import defpackage.axc;
import defpackage.dxc;
import defpackage.mvg;
import defpackage.nac;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.complaint.impl.ui.modal.recycler.ComplaintsViewHolder$bind$1", f = "ComplaintsViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ComplaintsViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ axc $data;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplaintsViewHolder$bind$1(a aVar, axc axcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = axcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComplaintsViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ComplaintsViewHolder$bind$1 complaintsViewHolder$bind$1 = (ComplaintsViewHolder$bind$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        complaintsViewHolder$bind$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        int i = a.U;
        GoImageView goImageView = ((dxc) ((zo31) aVar.R)).c;
        axc axcVar = this.$data;
        goImageView.setImageBitmap(null);
        ((nac) aVar.S.a(goImageView)).c(axcVar.b);
        return zy11.a;
    }
}
