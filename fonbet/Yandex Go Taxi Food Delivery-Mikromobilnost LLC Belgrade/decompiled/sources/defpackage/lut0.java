package defpackage;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;
import com.ybsdk.feature.split.deposit.internal.ui.a;
import com.ybsdk.feature.split.deposit.internal.ui.b;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.l;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class lut0 implements ev31 {
    public final wor0 a;

    public lut0(wor0 wor0Var) {
        this.a = wor0Var;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        b a;
        Uri parse;
        Uri h;
        vx90 vx90Var;
        dka0 dka0Var;
        cut0 cut0Var = (cut0) obj;
        s2e0 s2e0Var = cut0Var.a;
        Throwable th = cut0Var.b;
        if (th != null) {
            return new hut0(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        String str = null;
        boolean z = ((s2e0Var == null || (dka0Var = (dka0) s2e0Var.a()) == null) ? null : dka0Var.a) == PaymentStatus.CHALLENGE;
        a9u0 a9u0Var = cut0Var.c;
        boolean z2 = cut0Var.e;
        boolean z3 = s2e0Var instanceof p2e0;
        pc70 pc70Var = pc70.a;
        if (z3 || jl40.l(s2e0Var, o2e0.a) || s2e0Var == null) {
            a = a.a(a9u0Var, pc70Var, z2);
        } else if (s2e0Var instanceof q2e0) {
            dka0 dka0Var2 = (dka0) ((q2e0) s2e0Var).a;
            int i = kut0.a[dka0Var2.a.ordinal()];
            if (i == 1 || i == 2) {
                a = a.a(a9u0Var, pc70Var, z2);
            } else if (i == 3) {
                a = a.a(dka0Var2.c, new l(OperationProgressView.StatusIcon.SUCCESS), z2);
            } else {
                if (i != 4) {
                    w511.b();
                    return null;
                }
                a = a.a(dka0Var2.d, new l(OperationProgressView.StatusIcon.ERROR), z2);
            }
        } else {
            if (!(s2e0Var instanceof n2e0) && !s2e0Var.equals(r2e0.a)) {
                w511.b();
                return null;
            }
            a = a.a(cut0Var.d, new l(OperationProgressView.StatusIcon.TIMEOUT), z2);
        }
        if (z) {
            dka0 dka0Var3 = (dka0) s2e0Var.a();
            String str2 = (dka0Var3 == null || (vx90Var = dka0Var3.b) == null) ? null : vx90Var.a;
            if (str2 != null && (parse = Uri.parse(str2)) != null && (h = sd90.h(parse, DivkitThemeChangeListener.THEME_VARIABLE_NAME, ((xop0) this.a.a).a().name().toLowerCase(Locale.ROOT))) != null) {
                str = h.toString();
            }
        }
        return new iut0(a, str, cut0Var.f);
    }
}
