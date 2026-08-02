package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.ad0;
import defpackage.dms;
import defpackage.ec0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.l5f;
import defpackage.m5f;
import defpackage.mvg;
import defpackage.n5f;
import defpackage.ny61;
import defpackage.o5f;
import defpackage.p5f;
import defpackage.q5f;
import defpackage.scc;
import defpackage.t4r;
import defpackage.tcc;
import defpackage.w3b;
import defpackage.w511;
import defpackage.x3b;
import defpackage.y3b;
import defpackage.yb0;
import defpackage.z3b;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lq5f;", "items", "Lt4r;", "allFilterTypes", "", "searchText", "Lz3b;", "queryChatItems", "Lyb0;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lyb0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.folder.addChat.AddChatsFolderViewModel$uiState$3", f = "AddChatsFolderViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AddChatsFolderViewModel$uiState$3 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddChatsFolderViewModel$uiState$3(i iVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AddChatsFolderViewModel$uiState$3 addChatsFolderViewModel$uiState$3 = new AddChatsFolderViewModel$uiState$3(this.this$0, (Continuation) obj5);
        addChatsFolderViewModel$uiState$3.L$0 = (List) obj;
        addChatsFolderViewModel$uiState$3.L$1 = (List) obj2;
        addChatsFolderViewModel$uiState$3.L$2 = (String) obj3;
        addChatsFolderViewModel$uiState$3.L$3 = (List) obj4;
        return addChatsFolderViewModel$uiState$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        q5f n5fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list2 = (List) this.L$0;
        List list3 = (List) this.L$1;
        String str = (String) this.L$2;
        List list4 = (List) this.L$3;
        List list5 = list2;
        int i = 0;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                if ((((q5f) it.next()) instanceof l5f) && (i = i + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        int i2 = i;
        int maxChatsPerFolder = this.this$0.z.a().getFolders().getMaxChatsPerFolder();
        if (evu0.J(str)) {
            List<t4r> list6 = list3;
            list = new ArrayList(tcc.n(list6, 10));
            for (t4r t4rVar : list6) {
                list.add(new m5f(t4rVar.a, t4rVar.b, t4rVar.c));
            }
        } else {
            list = EmptyList.a;
        }
        List<z3b> list7 = list4;
        ArrayList arrayList = new ArrayList(tcc.n(list7, 10));
        for (z3b z3bVar : list7) {
            if (z3bVar instanceof y3b) {
                n5fVar = new p5f(((y3b) z3bVar).a);
            } else if (z3bVar instanceof x3b) {
                x3b x3bVar = (x3b) z3bVar;
                n5fVar = new o5f(x3bVar.a, x3bVar.b, x3bVar.c, x3bVar.d);
            } else {
                if (!(z3bVar instanceof w3b)) {
                    w511.b();
                    return null;
                }
                n5fVar = new n5f(((w3b) z3bVar).a);
            }
            arrayList.add(n5fVar);
        }
        i iVar = this.this$0;
        ec0 ec0Var = iVar.w;
        r0 r0Var = iVar.B;
        return new yb0(i2, maxChatsPerFolder, str, list2, list, arrayList, jl40.l(ec0Var, new ec0(((ad0) r0Var.getValue()).b, ((ad0) r0Var.getValue()).a)));
    }
}
