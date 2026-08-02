package xsna;

import com.vk.whitelabelauth.di.WhiteLabelAuthComponent;
import com.vk.whitelabelauth.di.WhiteLabelAuthComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class gxg0 implements gzs<c8m<WhiteLabelAuthComponent, pwj0>> {
    public final /* synthetic */ com.vk.whitelabelauth.di.a b;

    public gxg0(i7m i7mVar, com.vk.whitelabelauth.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c8m<WhiteLabelAuthComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = (c8m) new WhiteLabelAuthComponentImpl.Factory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
