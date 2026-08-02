package com.yandex.messaging.attachments;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.attachments.SystemAttachmentsController$showTypeSelection$2$2", f = "SystemAttachmentsController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SystemAttachmentsController$showTypeSelection$2$2 extends SuspendLambda implements tls {
    final /* synthetic */ eyc $deferred;
    final /* synthetic */ BottomSheetDialog $dialog;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemAttachmentsController$showTypeSelection$2$2(BottomSheetDialog bottomSheetDialog, eyc eycVar, Continuation continuation) {
        super(1, continuation);
        this.$dialog = bottomSheetDialog;
        this.$deferred = eycVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SystemAttachmentsController$showTypeSelection$2$2(this.$dialog, this.$deferred, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        SystemAttachmentsController$showTypeSelection$2$2 systemAttachmentsController$showTypeSelection$2$2 = (SystemAttachmentsController$showTypeSelection$2$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        systemAttachmentsController$showTypeSelection$2$2.invokeSuspend(zy11Var);
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
        this.$dialog.dismiss();
        ((fyc) this.$deferred).T(SystemAttachmentsController$ChooserType.VIDEO);
        return zy11.a;
    }
}
