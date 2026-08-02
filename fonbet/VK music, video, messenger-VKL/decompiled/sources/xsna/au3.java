package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AskHealthConnectWorkoutPermissionsCommand.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.AskHealthConnectWorkoutPermissionsCommand", f = "AskHealthConnectWorkoutPermissionsCommand.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "getVkHealthStatus")
/* loaded from: classes6.dex */
public final class au3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yt3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(yt3 yt3Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yt3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
