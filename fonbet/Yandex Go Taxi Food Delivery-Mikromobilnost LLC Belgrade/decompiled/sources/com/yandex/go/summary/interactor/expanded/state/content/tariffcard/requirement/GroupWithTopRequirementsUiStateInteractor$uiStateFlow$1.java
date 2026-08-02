package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.amj0;
import defpackage.d3u;
import defpackage.f6v;
import defpackage.kij0;
import defpackage.mvg;
import defpackage.ncx0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isRequirementsRedesignEnabled", "Lf6v;", "Lhmx0;", "Ld3u;", "group", "Lncx0;", "<anonymous>", "(ZLf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.GroupWithTopRequirementsUiStateInteractor$uiStateFlow$1", f = "GroupWithTopRequirementsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class GroupWithTopRequirementsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWithTopRequirementsUiStateInteractor$uiStateFlow$1(a0 a0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = a0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        GroupWithTopRequirementsUiStateInteractor$uiStateFlow$1 groupWithTopRequirementsUiStateInteractor$uiStateFlow$1 = new GroupWithTopRequirementsUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        groupWithTopRequirementsUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        groupWithTopRequirementsUiStateInteractor$uiStateFlow$1.L$0 = (f6v) obj2;
        return groupWithTopRequirementsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
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
        Object obj2 = f6vVar.b;
        ArrayList<List> arrayList = ((d3u) obj2).b;
        a0 a0Var = this.this$0;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (List list : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                amj0 e = a0Var.b.e((kij0) it.next(), z);
                if (e != null) {
                    arrayList3.add(e);
                }
            }
            arrayList2.add(arrayList3);
        }
        ArrayList arrayList4 = ((d3u) obj2).c;
        a0 a0Var2 = this.this$0;
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            amj0 e2 = a0Var2.b.e((kij0) it2.next(), z);
            if (e2 != null) {
                arrayList5.add(e2);
            }
        }
        return new f6v(f6vVar.a, new ncx0(arrayList2, arrayList5));
    }
}
