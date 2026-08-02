package xsna;

import com.vk.dto.common.id.UserId;
import xsna.b25;

/* compiled from: AuthBridge.kt */
/* loaded from: classes.dex */
public final class c25 implements b25.a {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<UserId> b;

    public c25(io.reactivex.rxjava3.core.r<UserId> rVar) {
        this.b = rVar;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        this.b.onNext(tbu0Var.a.a());
    }
}
