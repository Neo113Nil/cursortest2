package xsna;

import android.net.Uri;
import android.webkit.URLUtil;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.c;
import com.vk.toggle.features.ImFeatures;

/* compiled from: DialogBackgroundRestoreCustomCmd.kt */
/* loaded from: classes2.dex */
public final class pam extends le6<s3q0> {
    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Uri parse;
        Uri parse2;
        DialogBackground j;
        ram m = w2wVar.I0().m();
        rey a = w2wVar.V0().a();
        String str = c.h.c.a;
        String string = a.getString(fto0.w("sidepack_background_uri"));
        if (string != null) {
            lam e = m.e(str);
            String str2 = (e == null || (j = hpo0.j(e)) == null) ? null : j.c;
            bpn0 bpn0Var = hpo0.a;
            boolean z = false;
            boolean f = (str2 == null || !URLUtil.isFileUrl(str2) || (parse2 = Uri.parse(str2)) == null) ? false : hpo0.f(sv1.E(parse2));
            if (URLUtil.isFileUrl(string) && (parse = Uri.parse(string)) != null) {
                z = hpo0.f(sv1.E(parse));
            }
            if ((str2 == null || !f) && z) {
                m.g(str, Uri.parse(string), iah0.f().widthPixels, iah0.f().heightPixels);
            } else if (str2 != null && f && !string.equals(str2)) {
                a.k(str2, fto0.w("sidepack_background_uri"));
            } else if (!f && !z) {
                ImFeatures imFeatures = ImFeatures.BACKGROUND_LOSS_FIX;
                imFeatures.getClass();
                if (!com.vk.toggle.b.A.a(imFeatures)) {
                    m.c(str);
                    a.delete(fto0.w("sidepack_background_uri"));
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof pam;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogBackgroundRestoreCustomCmd";
    }
}
