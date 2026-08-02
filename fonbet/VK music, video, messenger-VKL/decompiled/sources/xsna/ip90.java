package xsna;

import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;

/* compiled from: PastCallOnlineInfoFactory.kt */
/* loaded from: classes7.dex */
public final class ip90 {
    public static UsersOnlineInfoDto a(rp90 rp90Var, a59 a59Var) {
        a59.d a = a59Var.a();
        if (!(a instanceof a59.d.b)) {
            if (!(a instanceof a59.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return new UsersOnlineInfoDto(false, null, null, null, null, null, 62, null);
        }
        z49 z49Var = rp90Var.b.get(((a59.d.b) a).a);
        if (z49Var != null) {
            return z49Var.e;
        }
        return new UsersOnlineInfoDto(false, null, null, null, null, null, 62, null);
    }
}
