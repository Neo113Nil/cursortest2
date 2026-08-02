package xsna;

import com.vk.im.ui.views.avatars.a;
import com.vk.voip.userid.CallsUserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;

/* compiled from: PastCallPlaceholdersFactory.kt */
/* loaded from: classes7.dex */
public final class jp90 {
    public final a.b a(rp90 rp90Var, a59 a59Var) {
        String str;
        a59.d a = a59Var.a();
        if (!(a instanceof a59.d.b)) {
            if (!(a instanceof a59.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            s49 s49Var = ((a59.d.a) a).a;
            return new a.b.C1178a(s49Var.a, s49Var.b);
        }
        CallsUserId callsUserId = ((a59.d.b) a).a;
        z49 z49Var = rp90Var.b.get(callsUserId);
        if (z49Var == null || (str = z49Var.g) == null) {
            w49 w49Var = rp90Var.c.get(callsUserId);
            if (w49Var != null) {
                str = w49Var.b;
            } else {
                t49 t49Var = rp90Var.e.get(callsUserId);
                str = t49Var != null ? t49Var.c : null;
            }
        }
        if (str != null) {
            return new a.b.C1179b(str);
        }
        return null;
    }
}
