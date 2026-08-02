package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oc0;
import defpackage.oz40;
import defpackage.q5f;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.folder.addChat.AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1", f = "AddChatsFolderContent.kt", l = {358}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.foundation.lazy.b $itemScrollState;
    final /* synthetic */ List<q5f> $items;
    final /* synthetic */ oz40 $prevIdsState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1(List list, androidx.compose.foundation.lazy.b bVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$items = list;
        this.$itemScrollState = bVar;
        this.$prevIdsState$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1(this.$items, this.$itemScrollState, this.$prevIdsState$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = androidx.compose.runtime.f.o(new oc0(this.$items, 0));
            e eVar = new e(this.$itemScrollState, this.$prevIdsState$delegate);
            this.label = 1;
            if (o.collect(eVar, this) == coroutineSingletons) {
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
