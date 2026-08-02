package xsna;

import com.vk.dto.group.Group;
import java.util.List;

/* compiled from: CallFromAdminGroupsCache.kt */
/* loaded from: classes7.dex */
public final class q39 extends c320<List<? extends Group>> {
    public static final q39 e = new q39(r39.a);

    @Override // xsna.c320
    public final io.reactivex.rxjava3.core.q<List<? extends Group>> d() {
        return rsg0.T(new xrt("messages.getGroupsForCall")).U(new uq(new ob(6), 3));
    }
}
