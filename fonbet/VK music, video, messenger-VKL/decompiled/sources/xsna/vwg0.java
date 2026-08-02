package xsna;

import com.vk.odnoklassniki.heads.di.OkHeadsComponent;
import com.vk.odnoklassniki.heads.di.OkHeadsComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class vwg0 implements gzs<b7m<OkHeadsComponent>> {
    public final /* synthetic */ com.vk.odnoklassniki.heads.di.a b;

    public vwg0(i7m i7mVar, com.vk.odnoklassniki.heads.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b7m<OkHeadsComponent> invoke() {
        Object failure;
        try {
            failure = (b7m) new OkHeadsComponentImpl.Factory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
