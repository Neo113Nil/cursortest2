package xsna;

import android.content.Context;
import android.net.Uri;
import java.text.SimpleDateFormat;

/* compiled from: VKPayCallback.kt */
/* loaded from: classes6.dex */
public final class ier0 extends agu0 {
    @Override // xsna.agu0, xsna.xc80
    public final boolean j(String str) {
        String host = Uri.parse(str).getHost();
        if (host != null && drm0.D(host, "vkpay", false)) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = bgu0.a;
        Context requireContext = this.b.requireContext();
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        bgu0.b(requireContext, rex0Var, str);
        return true;
    }
}
