package xsna;

import com.vk.auth.qr.OldQrAuthFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import xsna.avc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wz70 implements xa80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentImpl b;

    public /* synthetic */ wz70(int i, FragmentImpl fragmentImpl) {
        this.a = i;
        this.b = fragmentImpl;
    }

    @Override // xsna.xa80
    public final void b() {
        int i = this.a;
        FragmentImpl fragmentImpl = this.b;
        switch (i) {
            case 0:
                OldQrAuthFragment oldQrAuthFragment = (OldQrAuthFragment) fragmentImpl;
                int i2 = OldQrAuthFragment.U;
                dne0 dne0Var = oldQrAuthFragment.R;
                if (dne0Var != null) {
                    String str = oldQrAuthFragment.S;
                    yme0 yme0Var = dne0Var.d;
                    if (yme0Var != null) {
                        yme0Var.a();
                    }
                    dne0Var.c.c(str, true);
                    break;
                }
                break;
            default:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                vvc0 vvc0Var = (vvc0) ((luc0) ((PostsFromNotificationsFragment) fragmentImpl).U.getValue()).a.invoke();
                if (vvc0Var != null) {
                    vvc0Var.b(avc0.d.a.b);
                    break;
                }
                break;
        }
    }
}
