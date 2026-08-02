package com.yandex.messaging.ui.folders.selectDialog;

import defpackage.fzw;
import defpackage.g92;
import defpackage.k4t;
import defpackage.l7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q7t;
import defpackage.r7t;
import defpackage.sbq0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.folders.selectDialog.SelectFolderViewModel$special$$inlined$flatMapLatest$1", f = "SelectFolderViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SelectFolderViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFolderViewModel$special$$inlined$flatMapLatest$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SelectFolderViewModel$special$$inlined$flatMapLatest$1 selectFolderViewModel$special$$inlined$flatMapLatest$1 = new SelectFolderViewModel$special$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        selectFolderViewModel$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        selectFolderViewModel$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return selectFolderViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr fzwVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            r7t r7tVar = (r7t) this.L$1;
            e eVar = this.this$0;
            ArrayList<q7t> arrayList = r7tVar.b;
            eVar.getClass();
            if (arrayList.isEmpty()) {
                fzwVar = new g92(2, new sbq0(EmptyList.a, eVar.A.a().getFolders().getMaxFoldersPerOrg() > 0));
            } else {
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (q7t q7tVar : arrayList) {
                    arrayList2.add(new l7(20, eVar.x.a(new k4t(q7tVar.b, Long.valueOf(q7tVar.a))), eVar, q7tVar));
                }
                fzwVar = new fzw(24, (tpr[]) kotlin.collections.a.J0(arrayList2).toArray(new tpr[0]), eVar);
            }
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(fzwVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
