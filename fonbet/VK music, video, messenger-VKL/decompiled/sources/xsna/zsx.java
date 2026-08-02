package xsna;

import android.view.ViewGroup;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;

/* compiled from: DiscoverMediaTabFragment2.kt */
/* loaded from: classes4.dex */
public final class zsx implements wzs<s3q0, Boolean, s3q0> {
    public myh b;
    public dne c;

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, Boolean bool) {
        dne dneVar;
        x5n x5nVar;
        ViewGroup viewGroup;
        boolean booleanValue = bool.booleanValue();
        myh myhVar = this.b;
        if (myhVar != null && (viewGroup = ((DiscoverMediaTabFragment2) myhVar.c).p0) != null) {
            bwt0.p0(viewGroup, booleanValue);
        }
        if (!booleanValue && (dneVar = this.c) != null && (x5nVar = ((DiscoverMediaTabFragment2) dneVar.c).d0) != null && !x5nVar.e) {
            x5nVar.e = true;
            jse0 jse0Var = x5nVar.c;
            if (jse0Var != null) {
                jse0Var.h();
            }
        }
        return s3q0.a;
    }
}
