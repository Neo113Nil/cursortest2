package xsna;

import com.vk.log.L;
import com.vk.voip.userid.CallsUserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;

/* compiled from: PastCallTitlesFactory.kt */
/* loaded from: classes7.dex */
public final class lp90 {
    public static String a(rp90 rp90Var, a59 a59Var) {
        String str;
        a59.d a = a59Var.a();
        if (!(a instanceof a59.d.b)) {
            if (a instanceof a59.d.a) {
                return ((a59.d.a) a).a.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        CallsUserId callsUserId = ((a59.d.b) a).a;
        z49 z49Var = rp90Var.b.get(callsUserId);
        if (z49Var != null && (str = z49Var.g) != null) {
            return str;
        }
        w49 w49Var = rp90Var.c.get(callsUserId);
        if (w49Var != null) {
            return w49Var.b;
        }
        t49 t49Var = rp90Var.e.get(callsUserId);
        String str2 = t49Var != null ? t49Var.c : null;
        if (str2 != null) {
            return str2;
        }
        L.i(new IllegalStateException("Invalid userId - doesn't exist in state: " + callsUserId));
        return "";
    }
}
