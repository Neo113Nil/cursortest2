package xsna;

import com.vk.dto.actionlinks.ActionLinks;
import com.vkontakte.android.R;

/* compiled from: ShowCollectionPresenter.kt */
/* loaded from: classes7.dex */
public final class whj0 extends io.reactivex.rxjava3.observers.a<ActionLinks> {
    public final /* synthetic */ uhj0 c;

    public whj0(uhj0 uhj0Var) {
        this.c = uhj0Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.c.q.a(this);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        uhj0 uhj0Var = this.c;
        uhj0Var.q.a(this);
        xhj0 xhj0Var = uhj0Var.k;
        if (xhj0Var == null) {
            xhj0Var = null;
        }
        xhj0Var.d(R.string.action_link_general_error_description);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        ActionLinks actionLinks = (ActionLinks) obj;
        uhj0 uhj0Var = this.c;
        uhj0Var.l = actionLinks;
        uhj0Var.z(actionLinks);
    }
}
