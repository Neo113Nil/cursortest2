package com.yandex.messaging.ui.folders;

import defpackage.m5f;
import defpackage.mvg;
import defpackage.n5f;
import defpackage.ny61;
import defpackage.o5f;
import defpackage.p5f;
import defpackage.q5f;
import defpackage.t4r;
import defpackage.tcc;
import defpackage.w3b;
import defpackage.w511;
import defpackage.x3b;
import defpackage.y3b;
import defpackage.z3b;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lz3b;", "chatItems", "Lt4r;", "filterItems", "Lq5f;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.folders.FolderListItemsProvider$getListItemsFlow$1", f = "FolderListItemsProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FolderListItemsProvider$getListItemsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListItemsProvider$getListItemsFlow$1(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FolderListItemsProvider$getListItemsFlow$1 folderListItemsProvider$getListItemsFlow$1 = new FolderListItemsProvider$getListItemsFlow$1(this.this$0, (Continuation) obj3);
        folderListItemsProvider$getListItemsFlow$1.L$0 = (List) obj;
        folderListItemsProvider$getListItemsFlow$1.L$1 = (List) obj2;
        return folderListItemsProvider$getListItemsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q5f n5fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = (List) this.L$0;
        List<t4r> list2 = (List) this.L$1;
        f fVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (t4r t4rVar : list2) {
            fVar.getClass();
            arrayList.add(new m5f(t4rVar.a, t4rVar.b, t4rVar.c));
        }
        List<z3b> list3 = list;
        f fVar2 = this.this$0;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        for (z3b z3bVar : list3) {
            fVar2.getClass();
            if (z3bVar instanceof x3b) {
                x3b x3bVar = (x3b) z3bVar;
                n5fVar = new o5f(x3bVar.a, x3bVar.b, x3bVar.c, x3bVar.d);
            } else if (z3bVar instanceof y3b) {
                n5fVar = new p5f(((y3b) z3bVar).a);
            } else {
                if (!(z3bVar instanceof w3b)) {
                    w511.b();
                    return null;
                }
                n5fVar = new n5f(((w3b) z3bVar).a);
            }
            arrayList2.add(n5fVar);
        }
        return kotlin.collections.a.m0(arrayList2, arrayList);
    }
}
