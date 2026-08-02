package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BatteryOptimizationDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.storage.BatteryOptimizationDataSource", f = "BatteryOptimizationDataSource.kt", l = {30}, m = "ignoringBatteryOptimizationsOnLastValue")
/* loaded from: classes5.dex */
public final class qv6 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pv6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv6(pv6 pv6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pv6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
