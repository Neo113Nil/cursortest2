package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.newsfeed.Owner;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import java.util.ArrayList;

/* compiled from: PostPreviewPresenter.kt */
/* loaded from: classes4.dex */
public final class u6c0 {
    public final PostPreviewFragment a;
    public final r9x0 b;
    public Owner c;
    public String d;
    public String e;
    public gzs<s3q0> f;
    public final ArrayList g = new ArrayList();
    public final bpn0 h = new bpn0(new om60(6));
    public final com.vk.newsfeed.common.util.j i = new com.vk.newsfeed.common.util.j();

    public u6c0(PostPreviewFragment postPreviewFragment, r9x0 r9x0Var) {
        this.a = postPreviewFragment;
        this.b = r9x0Var;
    }

    public static void a(u6c0 u6c0Var, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        PostPreviewFragment postPreviewFragment = u6c0Var.a;
        ViewGroup viewGroup = postPreviewFragment.U;
        if (viewGroup != null) {
            bwt0.p0(viewGroup, z);
        }
        ViewGroup viewGroup2 = postPreviewFragment.V;
        if (viewGroup2 != null) {
            bwt0.p0(viewGroup2, z);
        }
        View view = postPreviewFragment.d0;
        if (view != null) {
            bwt0.p0(view, z2);
        }
        View view2 = postPreviewFragment.c0;
        if (view2 != null) {
            bwt0.p0(view2, z3);
        }
    }
}
