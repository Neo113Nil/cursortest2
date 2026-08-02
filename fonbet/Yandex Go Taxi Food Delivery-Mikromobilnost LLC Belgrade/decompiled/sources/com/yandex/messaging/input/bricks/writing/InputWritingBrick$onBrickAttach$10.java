package com.yandex.messaging.input.bricks.writing;

import com.yandex.messaging.internal.entities.ChatBackendConfig;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatBackendConfig;", ConfigConstants.CONFIG, "Lzy11;", "<anonymous>", "(Lcom/yandex/messaging/internal/entities/ChatBackendConfig;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.bricks.writing.InputWritingBrick$onBrickAttach$10", f = "InputWritingBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InputWritingBrick$onBrickAttach$10 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputWritingBrick$onBrickAttach$10(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InputWritingBrick$onBrickAttach$10 inputWritingBrick$onBrickAttach$10 = new InputWritingBrick$onBrickAttach$10(this.this$0, continuation);
        inputWritingBrick$onBrickAttach$10.L$0 = obj;
        return inputWritingBrick$onBrickAttach$10;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InputWritingBrick$onBrickAttach$10 inputWritingBrick$onBrickAttach$10 = (InputWritingBrick$onBrickAttach$10) create((ChatBackendConfig) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        inputWritingBrick$onBrickAttach$10.invokeSuspend(zy11Var);
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
        this.this$0.l0 = (ChatBackendConfig) this.L$0;
        return zy11.a;
    }
}
