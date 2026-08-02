package com.yandex.messaging.ui.folders;

import androidx.compose.material3.w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.folders.CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$4$3$1$1", f = "CreateEditFolderDialogFragment.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$4$3$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ w $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$4$3$1$1(w wVar, Continuation continuation) {
        super(2, continuation);
        this.$sheetState = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$4$3$1$1(this.$sheetState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$4$3$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w wVar = this.$sheetState;
            this.label = 1;
            if (wVar.c(this) == coroutineSingletons) {
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
