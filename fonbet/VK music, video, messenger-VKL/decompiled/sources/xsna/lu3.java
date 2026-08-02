package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AskWorkoutPermissionHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.AskWorkoutPermissionHealthConnectDelegate", f = "AskWorkoutPermissionHealthConnectDelegate.kt", l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "requestActivityRecognitionPermission")
/* loaded from: classes6.dex */
public final class lu3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ju3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu3(ju3 ju3Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ju3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ju3.c(this.this$0, null, null, this);
    }
}
