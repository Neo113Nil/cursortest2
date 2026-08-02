package xsna;

import java.util.List;

/* compiled from: StoryReactionsInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class gbm0 implements fbm0 {
    public final hbm0 a;

    public gbm0(hbm0 hbm0Var) {
        this.a = hbm0Var;
    }

    @Override // xsna.fbm0
    public final io.reactivex.rxjava3.core.x<List<zam0>> a() {
        return this.a.getAll();
    }
}
