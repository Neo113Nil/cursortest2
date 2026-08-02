package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AskHealthConnectWorkoutPermissionsCommand.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.AskHealthConnectWorkoutPermissionsCommand", f = "AskHealthConnectWorkoutPermissionsCommand.kt", l = {156, 160}, m = "checkIfActivityRecognitionAvailable")
/* loaded from: classes6.dex */
public final class zt3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yt3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt3(yt3 yt3Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yt3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return yt3.d(this.this$0, null, this);
    }
}
