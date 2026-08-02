package xsna;

import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.d0e0;

/* compiled from: ProfileTabOptionsReducer.kt */
/* loaded from: classes5.dex */
public final class f0e0 extends dm50<j0e0, d0e0, h0e0> {
    @Override // xsna.dm50
    public final h0e0 c(h0e0 h0e0Var, d0e0 d0e0Var) {
        h0e0 h0e0Var2 = h0e0Var;
        d0e0 d0e0Var2 = d0e0Var;
        if (!(d0e0Var2 instanceof d0e0.a)) {
            if (d0e0Var2 instanceof d0e0.b) {
                return new h0e0(((d0e0.b) d0e0Var2).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        d0e0.a aVar = (d0e0.a) d0e0Var2;
        List<ProfileTabOptions> list = h0e0Var2.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ProfileTabOptions profileTabOptions : list) {
            if (epx.f(profileTabOptions, aVar.b)) {
                profileTabOptions = profileTabOptions.f(true);
            } else if (profileTabOptions.e()) {
                profileTabOptions = profileTabOptions.f(false);
            }
            arrayList.add(profileTabOptions);
        }
        return new h0e0(arrayList);
    }

    @Override // xsna.dm50
    public final j0e0 d() {
        return new j0e0(e(new j0r(22)));
    }

    @Override // xsna.dm50
    public final void h(h0e0 h0e0Var, j0e0 j0e0Var) {
        f(j0e0Var.a, h0e0Var);
    }
}
