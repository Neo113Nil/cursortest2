package com.yandex.messaging.ui.settings;

import defpackage.hta1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5b0;
import defpackage.wls;
import defpackage.x221;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx221;", "unreadInfo", "Lzy11;", "<anonymous>", "(Lx221;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.PersonalOrganizationsAdapter$ViewHolder$bind$1", f = "PersonalOrganizationsAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PersonalOrganizationsAdapter$ViewHolder$bind$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p5b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalOrganizationsAdapter$ViewHolder$bind$1(p5b0 p5b0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p5b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalOrganizationsAdapter$ViewHolder$bind$1 personalOrganizationsAdapter$ViewHolder$bind$1 = new PersonalOrganizationsAdapter$ViewHolder$bind$1(this.this$0, continuation);
        personalOrganizationsAdapter$ViewHolder$bind$1.L$0 = obj;
        return personalOrganizationsAdapter$ViewHolder$bind$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PersonalOrganizationsAdapter$ViewHolder$bind$1 personalOrganizationsAdapter$ViewHolder$bind$1 = (PersonalOrganizationsAdapter$ViewHolder$bind$1) create((x221) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        personalOrganizationsAdapter$ViewHolder$bind$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        x221 x221Var = (x221) this.L$0;
        this.this$0.R.setVisibility(x221Var.b > 0 ? 0 : 8);
        this.this$0.R.setText(hta1.a(x221Var.b));
        return zy11.a;
    }
}
