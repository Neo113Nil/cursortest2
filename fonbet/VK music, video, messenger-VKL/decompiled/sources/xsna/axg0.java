package xsna;

import com.vk.auth.smartflow.api.SmartflowComponent;
import com.vk.auth.smartflow.impl.SmartflowComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class axg0 implements gzs<b7m<SmartflowComponent>> {
    public final /* synthetic */ com.vk.auth.smartflow.api.a b;

    public axg0(i7m i7mVar, com.vk.auth.smartflow.api.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final b7m<SmartflowComponent> invoke() {
        Object failure;
        try {
            failure = new SmartflowComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
