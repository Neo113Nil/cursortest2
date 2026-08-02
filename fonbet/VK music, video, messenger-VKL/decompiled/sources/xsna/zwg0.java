package xsna;

import com.vk.method.selector.api.MethodSelectorComponent;
import com.vk.method.selector.impl.MethodSelectorComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class zwg0 implements gzs<b7m<MethodSelectorComponent>> {
    public final /* synthetic */ com.vk.method.selector.api.a b;

    public zwg0(i7m i7mVar, com.vk.method.selector.api.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final b7m<MethodSelectorComponent> invoke() {
        Object failure;
        try {
            failure = new MethodSelectorComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
