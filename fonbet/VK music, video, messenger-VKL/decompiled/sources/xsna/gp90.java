package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.log.L;
import com.vk.voip.userid.CallsUserId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;

/* compiled from: PastCallImagesFactory.kt */
/* loaded from: classes7.dex */
public final class gp90 {
    /* JADX WARN: Multi-variable type inference failed */
    public static ImageList a(rp90 rp90Var, a59 a59Var) {
        a59.d a = a59Var.a();
        if (!(a instanceof a59.d.b)) {
            if (a instanceof a59.d.a) {
                return ((a59.d.a) a).a.c;
            }
            throw new NoWhenBranchMatchedException();
        }
        CallsUserId callsUserId = ((a59.d.b) a).a;
        z49 z49Var = rp90Var.b.get(callsUserId);
        if (z49Var != null) {
            return z49Var.d;
        }
        w49 w49Var = rp90Var.c.get(callsUserId);
        if (w49Var != null) {
            return w49Var.c;
        }
        t49 t49Var = rp90Var.e.get(callsUserId);
        List list = null;
        Object[] objArr = 0;
        ImageList imageList = t49Var != null ? t49Var.d : null;
        if (imageList != null) {
            return imageList;
        }
        L.i(new IllegalStateException("Invalid userId - doesn't exist in state: " + callsUserId));
        return new ImageList(list, 1, objArr == true ? 1 : 0);
    }
}
