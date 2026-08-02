package com.yandex.messaging.ui.yadisk;

import android.os.Handler;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import defpackage.b00;
import defpackage.mvg;
import defpackage.mz;
import defpackage.ny61;
import defpackage.t3z;
import defpackage.tls;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.yadisk.AskDiskSpaceDialog$1", f = "AskDiskSpaceDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AskDiskSpaceDialog$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskDiskSpaceDialog$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AskDiskSpaceDialog$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AskDiskSpaceDialog$1 askDiskSpaceDialog$1 = (AskDiskSpaceDialog$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        askDiskSpaceDialog$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        z83.d(this.this$0.e, null);
        a aVar = this.this$0;
        ChatRequest chatRequest = aVar.f;
        zy11 zy11Var = zy11.a;
        if (chatRequest == null) {
            return zy11Var;
        }
        String str = aVar.e;
        if (str != null) {
            b00 b00Var = aVar.d;
            LocalMessageRef.Companion.getClass();
            ((Handler) b00Var.a.get()).post(new mz(b00Var, chatRequest, t3z.b(str), 1));
        }
        a aVar2 = this.this$0;
        aVar2.q.dismiss();
        aVar2.e = null;
        kotlinx.coroutines.a.g(aVar2.s.a, null);
        return zy11Var;
    }
}
