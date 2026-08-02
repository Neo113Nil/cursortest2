package com.yandex.messaging.ui.folders;

import defpackage.b5f;
import defpackage.jjf;
import defpackage.m7t;
import defpackage.mvg;
import defpackage.n7t;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.folders.CreateEditFolderViewModel$loadFolderData$1", f = "CreateEditFolderViewModel.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CreateEditFolderViewModel$loadFolderData$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $folderId;
    final /* synthetic */ long $organizationId;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditFolderViewModel$loadFolderData$1(e eVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$folderId = str;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateEditFolderViewModel$loadFolderData$1(this.this$0, this.$folderId, this.$organizationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateEditFolderViewModel$loadFolderData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n7t n7tVar = this.this$0.A;
            m7t m7tVar = new m7t(this.$folderId, this.$organizationId);
            this.label = 1;
            obj = n7tVar.a(m7tVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        jjf jjfVar = (jjf) obj;
        if (jjfVar != null) {
            e eVar = this.this$0;
            eVar.D = jjfVar;
            r0 r0Var = eVar.C;
            b5f b5fVar = new b5f(jjfVar.c, jjfVar.e, jjfVar.f, jjfVar.g, jjfVar.h);
            r0Var.getClass();
            r0Var.m(null, b5fVar);
        }
        return zy11.a;
    }
}
