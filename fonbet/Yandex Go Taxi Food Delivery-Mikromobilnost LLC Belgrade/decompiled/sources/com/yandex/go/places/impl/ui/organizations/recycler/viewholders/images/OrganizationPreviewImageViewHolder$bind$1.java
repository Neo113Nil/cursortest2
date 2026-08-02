package com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images;

import com.yandex.go.design.view.GoImageView;
import defpackage.ap80;
import defpackage.dj80;
import defpackage.f65;
import defpackage.k7v;
import defpackage.lbm;
import defpackage.mvg;
import defpackage.nac;
import defpackage.nfv;
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
@mvg(c = "com.yandex.go.places.impl.ui.organizations.recycler.viewholders.images.OrganizationPreviewImageViewHolder$bind$1", f = "OrganizationPreviewImageViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationPreviewImageViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ f65 $data;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationPreviewImageViewHolder$bind$1(f65 f65Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$data = f65Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationPreviewImageViewHolder$bind$1(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrganizationPreviewImageViewHolder$bind$1 organizationPreviewImageViewHolder$bind$1 = (OrganizationPreviewImageViewHolder$bind$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        organizationPreviewImageViewHolder$bind$1.invokeSuspend(zy11Var);
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
        k7v k7vVar = this.$data.a;
        if (k7vVar != null) {
            a aVar = this.this$0;
            String str = k7vVar.a;
            int i = a.V;
            ap80 ap80Var = (ap80) ((zo31) aVar.R);
            lbm a = aVar.S.a(ap80Var.b);
            GoImageView goImageView = ap80Var.b;
            nac nacVar = (nac) a;
            nacVar.f(goImageView.getMeasuredWidth(), goImageView.getMeasuredHeight());
            nacVar.g(nfv.a);
            nacVar.c(str);
        }
        a aVar2 = this.this$0;
        f65 f65Var = this.$data;
        int i2 = a.V;
        aVar2.c0(f65Var, dj80.a);
        return zy11.a;
    }
}
