package com.yandex.messaging.domain.folders;

import com.yandex.messaging.ExistingChatRequest;
import defpackage.gvg0;
import defpackage.i4t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w3b;
import defpackage.y3b;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lz3b;", "", "isSavedMessages", "Lzy11;", "<anonymous>", "(Lvpr;Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.folders.GetFolderChatDisplayDataUseCase$run$1", f = "GetFolderChatDisplayDataUseCase.kt", l = {37, 38, 39}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetFolderChatDisplayDataUseCase$run$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $chatId;
    final /* synthetic */ ExistingChatRequest $chatRequest;
    private /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFolderChatDisplayDataUseCase$run$1(String str, i iVar, ExistingChatRequest existingChatRequest, Continuation continuation) {
        super(3, continuation);
        this.$chatId = str;
        this.this$0 = iVar;
        this.$chatRequest = existingChatRequest;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        GetFolderChatDisplayDataUseCase$run$1 getFolderChatDisplayDataUseCase$run$1 = new GetFolderChatDisplayDataUseCase$run$1(this.$chatId, this.this$0, this.$chatRequest, (Continuation) obj3);
        getFolderChatDisplayDataUseCase$run$1.L$0 = (vpr) obj;
        getFolderChatDisplayDataUseCase$run$1.Z$0 = booleanValue;
        return getFolderChatDisplayDataUseCase$run$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        if (this.Z$0) {
            y3b y3bVar = new y3b(this.$chatId);
            this.label = 1;
            return vprVar.emit(y3bVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (this.this$0.d.i(this.$chatId)) {
            i iVar = this.this$0;
            String str = this.$chatId;
            tpr a = iVar.c.a(new i4t(this.$chatRequest, gvg0.avatar_size_32));
            this.label = 3;
            kotlinx.coroutines.flow.e.w(vprVar);
            Object collect = a.collect(new h(vprVar, str), this);
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
            }
        } else {
            w3b w3bVar = new w3b(this.$chatId);
            this.label = 2;
            if (vprVar.emit(w3bVar, this) == coroutineSingletons) {
            }
        }
    }
}
