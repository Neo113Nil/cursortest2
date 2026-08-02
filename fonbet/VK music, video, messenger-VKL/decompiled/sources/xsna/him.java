package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: DialogPermissionHelper.kt */
/* loaded from: classes2.dex */
public final class him {
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(a1w a1wVar, Dialog dialog, ProfilesInfo profilesInfo) {
        if (dialog != null && profilesInfo != null) {
            if (dialog.uc()) {
                ChatSettings Hb = dialog.Hb();
                if (Hb != null) {
                    boolean z = Hb.u;
                    boolean z2 = Hb.f > 1;
                    if (z && z2) {
                        return true;
                    }
                }
            } else if (dialog.t1()) {
                qtd0 Bb = profilesInfo.Bb(dialog.Zb());
                if (!o25.b(o25.a()) || dialog.Gb()) {
                    boolean z3 = dialog.bc() == Peer.Type.USER;
                    boolean f = epx.f(dialog.Zb(), a1wVar.q());
                    boolean z4 = ((Bb != null ? Bb.K6() : false) || (Bb != null && (Bb.ka() || Bb.H7() || Bb.C6()))) ? false : true;
                    boolean k = dialog.Xb().k();
                    Peer q = a1wVar.q();
                    q.getClass();
                    boolean Ab = q.Ab(Peer.Type.GROUP);
                    if (!z3 || !k || f || !z4 || Ab) {
                    }
                }
            }
        }
        return false;
    }
}
