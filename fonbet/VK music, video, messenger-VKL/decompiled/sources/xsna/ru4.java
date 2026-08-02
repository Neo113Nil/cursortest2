package xsna;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.core.view.AppBarExpandableControllerBehaviour;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vkontakte.android.R;
import xsna.qv4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ru4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ru4(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                vu4 vu4Var = (vu4) this.d;
                av4 av4Var = vu4Var.D;
                qv4 b = av4Var.b();
                if (!(b instanceof qv4.c)) {
                    b = null;
                }
                if (((qv4.c) b) == null) {
                    throw new IllegalStateException("expected=" + fpf0.a(qv4.c.class).l() + ", was=" + av4Var.b());
                }
                av4Var.a.onNext(new qv4.d(0));
                if (this.c) {
                    av4 av4Var2 = vu4Var.D;
                    qv4 b2 = av4Var2.b();
                    if (b2 instanceof qv4.d) {
                        av4Var2.a.onNext(qv4.d.b((qv4.d) b2, null, 0, 0L, false, false, 191));
                    }
                }
                return s3q0.a;
            case 1:
                AppBarLayout appBarLayout = ((HidingToolbarVh) this.d).f;
                ViewGroup.LayoutParams layoutParams = appBarLayout != null ? appBarLayout.getLayoutParams() : null;
                CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                Object obj2 = fVar != null ? fVar.a : null;
                AppBarExpandableControllerBehaviour appBarExpandableControllerBehaviour = obj2 instanceof AppBarExpandableControllerBehaviour ? (AppBarExpandableControllerBehaviour) obj2 : null;
                if (appBarExpandableControllerBehaviour != null) {
                    appBarExpandableControllerBehaviour.q = this.c;
                }
                return s3q0.a;
            default:
                WebSubscribeExtra.GroupClosedType groupClosedType = ((WebSubscribeExtra) this.d).f;
                if ((!this.c && groupClosedType == WebSubscribeExtra.GroupClosedType.CLOSED) || groupClosedType == WebSubscribeExtra.GroupClosedType.PRIVATE) {
                    cvk.u(R.string.community_send_request_toast, false);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ru4(boolean z, WebSubscribeExtra webSubscribeExtra) {
        this.b = 2;
        this.c = z;
        this.d = webSubscribeExtra;
    }
}
