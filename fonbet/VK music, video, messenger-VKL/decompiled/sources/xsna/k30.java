package xsna;

import com.vk.dto.actionlinks.ActionLink;

/* compiled from: ActionLinksSnippetPresenter.kt */
/* loaded from: classes3.dex */
public final class k30 extends io.reactivex.rxjava3.observers.a<Boolean> {
    public final /* synthetic */ h30 c;
    public final /* synthetic */ ActionLink d;

    public k30(h30 h30Var, ActionLink actionLink) {
        this.c = h30Var;
        this.d = actionLink;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        ActionLink actionLink = this.d;
        h30 h30Var = this.c;
        h30Var.b(actionLink);
        h30Var.m = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        ((Boolean) obj).booleanValue();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
    }
}
