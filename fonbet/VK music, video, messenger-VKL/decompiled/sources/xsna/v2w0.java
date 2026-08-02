package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkWorkoutWidgetManagerImpl.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.VkWorkoutWidgetManagerImpl", f = "VkWorkoutWidgetManagerImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "populateWidgetState")
/* loaded from: classes6.dex */
public final class v2w0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2w0(u2w0 u2w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = u2w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return u2w0.i(this.this$0, null, null, this);
    }
}
