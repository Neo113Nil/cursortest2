package xsna;

import androidx.car.app.hardware.common.CarZone;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkStepsStore.kt */
@b6l(c = "com.vk.superapp.vksteps.data.store.VkStepsStore", f = "VkStepsStore.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER}, m = "isEmpty")
/* loaded from: classes6.dex */
public final class zmv0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xmv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmv0(xmv0 xmv0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xmv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
