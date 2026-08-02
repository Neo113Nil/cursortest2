package xsna;

import android.view.View;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;

/* compiled from: NewsfeedFragment.kt */
/* loaded from: classes4.dex */
public final class atx implements wzs<s3q0, Boolean, s3q0> {
    public by20 b;
    public b410 c;

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, Boolean bool) {
        View view;
        b410 b410Var;
        f170 f170Var;
        boolean booleanValue = bool.booleanValue();
        if (!booleanValue && (b410Var = this.c) != null && (f170Var = (f170) b410Var.invoke()) != null && !f170Var.d) {
            f170Var.d = true;
            i0q0.f(new rkt(f170Var, 17));
        }
        by20 by20Var = this.b;
        if (by20Var != null && (view = ((NewsfeedFragment) by20Var.c).n0) != null) {
            bwt0.p0(view, booleanValue);
        }
        return s3q0.a;
    }
}
