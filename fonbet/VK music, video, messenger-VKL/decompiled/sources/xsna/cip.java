package xsna;

import android.view.View;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;

/* compiled from: DiscoverMediaTabFragment2.kt */
/* loaded from: classes4.dex */
public final class cip implements wzs<s3q0, Boolean, s3q0> {
    public ldl b;

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, Boolean bool) {
        View view;
        boolean booleanValue = bool.booleanValue();
        ldl ldlVar = this.b;
        if (ldlVar != null && (view = ((DiscoverMediaTabFragment2) ldlVar.c).s0) != null) {
            bwt0.p0(view, booleanValue);
        }
        return s3q0.a;
    }
}
