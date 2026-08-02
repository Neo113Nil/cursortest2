package xsna;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.dto.common.id.UserId;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.nwp0;

/* compiled from: UIBlockProfileTimeCache.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class pwp0 extends FunctionReferenceImpl implements wzs<Map<UserId, ? extends UIBlockProfile>, Pair<? extends UIBlockProfile, ? extends nwp0.a>, Map<UserId, ? extends UIBlockProfile>> {
    @Override // xsna.wzs
    public final Map<UserId, ? extends UIBlockProfile> invoke(Map<UserId, ? extends UIBlockProfile> map, Pair<? extends UIBlockProfile, ? extends nwp0.a> pair) {
        Map<UserId, ? extends UIBlockProfile> map2 = map;
        Pair<? extends UIBlockProfile, ? extends nwp0.a> pair2 = pair;
        ((nwp0) this.receiver).getClass();
        UIBlockProfile d = pair2.d();
        int i = nwp0.b.$EnumSwitchMapping$0[pair2.g().ordinal()];
        if (i == 1) {
            return pn00.o(map2, new Pair(d.A.c, d));
        }
        if (i == 2) {
            return pn00.l(d.A.c, map2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
