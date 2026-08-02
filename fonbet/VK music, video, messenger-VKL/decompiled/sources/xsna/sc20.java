package xsna;

import android.app.Dialog;
import com.facebook.soloader.MinElf;
import kotlin.NoWhenBranchMatchedException;
import xsna.o0r0;
import xsna.oc20;

/* compiled from: MessageViewsRouter.kt */
/* loaded from: classes2.dex */
public final class sc20 implements hm50<oc20> {
    public final mc20 a;
    public final o0r0 b;

    public sc20(mc20 mc20Var, o0r0 o0r0Var) {
        this.a = mc20Var;
        this.b = o0r0Var;
    }

    @Override // xsna.hm50
    public final void a(oc20 oc20Var) {
        oc20 oc20Var2 = oc20Var;
        boolean z = oc20Var2 instanceof oc20.a;
        mc20 mc20Var = this.a;
        if (z) {
            Dialog dialog = mc20Var.s;
            if (dialog != null) {
                dialog.dismiss();
                return;
            }
            return;
        }
        if (!(oc20Var2 instanceof oc20.b)) {
            throw new NoWhenBranchMatchedException();
        }
        Dialog dialog2 = mc20Var.s;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        qtd0 qtd0Var = ((oc20.b) oc20Var2).a;
        this.b.m(mc20Var.requireContext(), com.vk.dto.common.a.b(qtd0Var.B7()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
