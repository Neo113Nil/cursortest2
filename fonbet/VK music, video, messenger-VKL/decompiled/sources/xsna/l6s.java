package xsna;

import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import xsna.trc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l6s implements xa80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.xa80
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((m6s) obj).b.invoke();
                break;
            default:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                osc0 osc0Var = (osc0) ((crc0) ((PostponedPostsFragment) obj).U.getValue()).a.invoke();
                if (osc0Var != null) {
                    osc0Var.b(trc0.d.a.b);
                    break;
                }
                break;
        }
    }
}
