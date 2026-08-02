package com.yandex.messaging.ui.yadisk;

import defpackage.b0x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.yadisk.AskDiskSpaceDialog$show$1$1", f = "AskDiskSpaceDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AskDiskSpaceDialog$show$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $buttonUrl;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskDiskSpaceDialog$show$1$1(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$buttonUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AskDiskSpaceDialog$show$1$1(this.this$0, this.$buttonUrl, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AskDiskSpaceDialog$show$1$1 askDiskSpaceDialog$show$1$1 = (AskDiskSpaceDialog$show$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        askDiskSpaceDialog$show$1$1.invokeSuspend(zy11Var);
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
        ((b0x) this.this$0.b).b(this.$buttonUrl);
        return zy11.a;
    }
}
