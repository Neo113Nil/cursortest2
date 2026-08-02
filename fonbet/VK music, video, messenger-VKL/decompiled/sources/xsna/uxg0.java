package xsna;

import com.vk.auth.related.profile.di.RelatedProfileComponentImpl;
import com.vk.superapp.multiaccount.api.RelatedProfileComponent;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class uxg0 implements gzs<c8m<RelatedProfileComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.multiaccount.api.h b;
    public final /* synthetic */ xxg0 c;

    public uxg0(i7m i7mVar, com.vk.superapp.multiaccount.api.h hVar, xxg0 xxg0Var) {
        this.b = hVar;
        this.c = xxg0Var;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c8m<RelatedProfileComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = (c8m) new RelatedProfileComponentImpl.Factory(this.c.a);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
