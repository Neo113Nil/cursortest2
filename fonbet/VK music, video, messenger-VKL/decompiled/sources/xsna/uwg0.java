package xsna;

import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import com.vk.superapp.catalog.impl.di.AppsCatalogComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class uwg0 implements gzs<b7m<AppsCatalogComponent>> {
    public final /* synthetic */ com.vk.superapp.catalog.api.di.a b;

    public uwg0(i7m i7mVar, com.vk.superapp.catalog.api.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final b7m<AppsCatalogComponent> invoke() {
        Object failure;
        try {
            failure = new AppsCatalogComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
