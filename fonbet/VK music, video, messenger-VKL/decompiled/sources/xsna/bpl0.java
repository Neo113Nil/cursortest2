package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.ecomm.storefront.impl.community.presentation.model.LoadingState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.jpl0;
import xsna.wll0;

/* compiled from: StorefrontStateMapper.kt */
/* loaded from: classes18.dex */
public final class bpl0 implements izs<apl0, jpl0> {
    public static jpl0 a(apl0 apl0Var) {
        jpl0.a dVar;
        String str;
        pju pjuVar = apl0Var.b;
        wll0 wll0Var = apl0Var.k;
        if (wll0Var != null) {
            if (!(wll0Var instanceof wll0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = jpl0.a.C3136a.a;
        } else if (apl0Var.l == LoadingState.Full) {
            dVar = jpl0.a.c.a;
        } else if (pjuVar == null || (str = pjuVar.n) == null) {
            dVar = new jpl0.a.d(apl0Var, new sll0(pjuVar != null && pjuVar.k, pjuVar != null ? pjuVar.l : null, pjuVar != null && pjuVar.t, pjuVar != null && pjuVar.p));
        } else {
            dVar = new jpl0.a.b(str, Integer.valueOf(pjuVar.o == GroupsGroupTypeDto.PAGE ? R.string.leave_group : R.string.profile_unsubscribe), pjuVar.t);
        }
        boolean z = pjuVar != null && pjuVar.u;
        z7p0 z7p0Var = apl0Var.e;
        return new jpl0(new jpl0.b(new ipl0(z7p0Var != null ? z7p0Var.b : 0, z7p0Var != null ? z7p0Var.c : 0, z, z7p0Var != null && z7p0Var.a)), dVar);
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ jpl0 invoke(apl0 apl0Var) {
        return a(apl0Var);
    }
}
