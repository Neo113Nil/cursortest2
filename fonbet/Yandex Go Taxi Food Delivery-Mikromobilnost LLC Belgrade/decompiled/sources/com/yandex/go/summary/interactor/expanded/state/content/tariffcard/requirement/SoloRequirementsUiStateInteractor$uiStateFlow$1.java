package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.amj0;
import defpackage.f6v;
import defpackage.h6v;
import defpackage.kij0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isRequirementsRedesignEnabled", "Lf6v;", "Lufx0;", "", "Lkij0;", "soloRequirementItemsIdentifier", "Lamj0;", "<anonymous>", "(ZLf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.SoloRequirementsUiStateInteractor$uiStateFlow$1", f = "SoloRequirementsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SoloRequirementsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ h0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoloRequirementsUiStateInteractor$uiStateFlow$1(h0 h0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = h0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SoloRequirementsUiStateInteractor$uiStateFlow$1 soloRequirementsUiStateInteractor$uiStateFlow$1 = new SoloRequirementsUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        soloRequirementsUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        soloRequirementsUiStateInteractor$uiStateFlow$1.L$0 = (f6v) obj2;
        return soloRequirementsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        f6v f6vVar = (f6v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h0 h0Var = this.this$0;
        h6v h6vVar = f6vVar.a;
        List list = (List) f6vVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amj0 e = h0Var.b.e((kij0) it.next(), z);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return new f6v(h6vVar, arrayList);
    }
}
