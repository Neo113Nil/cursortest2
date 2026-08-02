package xsna;

import android.app.Dialog;
import android.view.Window;
import com.vk.core.fragments.FragmentImpl;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: ChatClipsMsgSendVcProvider.kt */
/* loaded from: classes2.dex */
public final class uob {
    public static final bpn0 a = new bpn0(new i9(10));
    public static final bpn0 b = new bpn0(new d1(7));
    public static final bpn0 c = new bpn0(new pd4(2));

    public static oob a(FragmentImpl fragmentImpl, long j) {
        bpn0 bpn0Var = a;
        a1w a1wVar = (a1w) bpn0Var.getValue();
        mxv mxvVar = (mxv) b.getValue();
        bpn0 bpn0Var2 = c;
        zdw zdwVar = (zdw) bpn0Var2.getValue();
        bc6 L = xa4.L(fragmentImpl.requireContext());
        Dialog dialog = fragmentImpl.s;
        Window window = dialog != null ? dialog.getWindow() : null;
        alm almVar = new alm(((zdw) bpn0Var2.getValue()).f, (a1w) bpn0Var.getValue(), ((zdw) bpn0Var2.getValue()).u, new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null));
        almVar.c(fragmentImpl.getViewLifecycleOwner().getLifecycle());
        return new oob(a1wVar, mxvVar, L, window, j, zdwVar, almVar.g);
    }
}
