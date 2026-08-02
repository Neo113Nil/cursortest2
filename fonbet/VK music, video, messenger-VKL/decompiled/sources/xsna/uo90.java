package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.voip.userid.CallsUserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;

/* compiled from: PastCallAvatarsFactory.kt */
/* loaded from: classes7.dex */
public final class uo90 {
    /* JADX WARN: Multi-variable type inference failed */
    public static kr5 a(rp90 rp90Var, a59 a59Var) {
        a59.d a = a59Var.a();
        AvatarBorderType avatarBorderType = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (!(a instanceof a59.d.b)) {
            if (a instanceof a59.d.a) {
                return new kr5((AvatarBorderType) (objArr2 == true ? 1 : 0), (h2z) (objArr == true ? 1 : 0), (izs) new com.vk.movika.sdk.base.data.a(((a59.d.a) a).a.c, 8), 7);
            }
            throw new NoWhenBranchMatchedException();
        }
        CallsUserId callsUserId = ((a59.d.b) a).a;
        z49 z49Var = rp90Var.b.get(callsUserId);
        if (z49Var != null) {
            return z49Var.f;
        }
        w49 w49Var = rp90Var.c.get(callsUserId);
        if (w49Var != null) {
            return w49Var.d;
        }
        t49 t49Var = rp90Var.e.get(callsUserId);
        kr5 kr5Var = t49Var != null ? t49Var.e : null;
        if (kr5Var == null) {
            return new kr5(avatarBorderType, (h2z) (objArr4 == true ? 1 : 0), (izs) (objArr3 == true ? 1 : 0), 15);
        }
        return kr5Var;
    }
}
