package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.actionlinks.ActionLinks;
import com.vkontakte.android.R;

/* compiled from: ShowCollectionPresenter.kt */
/* loaded from: classes7.dex */
public final class vhj0 extends io.reactivex.rxjava3.observers.a<ActionLinks> {
    public final /* synthetic */ uhj0 c;

    public vhj0(uhj0 uhj0Var) {
        this.c = uhj0Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        uhj0 uhj0Var = this.c;
        uhj0Var.q.a(this);
        if (uhj0Var.h) {
            xhj0 xhj0Var = uhj0Var.k;
            if (xhj0Var == null) {
                xhj0Var = null;
            }
            xhj0Var.dismiss();
        }
        uhj0Var.s = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        boolean z = th instanceof VKApiExecutionException;
        uhj0 uhj0Var = this.c;
        if (z) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.s() == 106) {
                if (vKApiExecutionException.u() == null || !drm0.D(vKApiExecutionException.u(), "maximum number", false)) {
                    xhj0 xhj0Var = uhj0Var.k;
                    if (xhj0Var == null) {
                        xhj0Var = null;
                    }
                    xhj0Var.d(R.string.collection_add_object_already_added);
                } else {
                    xhj0 xhj0Var2 = uhj0Var.k;
                    if (xhj0Var2 == null) {
                        xhj0Var2 = null;
                    }
                    xhj0Var2.d(R.string.collection_link_limit);
                }
                uhj0Var.s = null;
            }
        }
        xhj0 xhj0Var3 = uhj0Var.k;
        if (xhj0Var3 == null) {
            xhj0Var3 = null;
        }
        xhj0Var3.d(R.string.action_link_general_error_description);
        uhj0Var.s = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        ActionLinks actionLinks = (ActionLinks) obj;
        uhj0 uhj0Var = this.c;
        uhj0Var.l = actionLinks;
        uhj0Var.z(actionLinks);
    }
}
