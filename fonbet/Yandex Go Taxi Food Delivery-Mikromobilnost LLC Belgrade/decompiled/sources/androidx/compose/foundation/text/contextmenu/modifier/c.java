package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.atz0;
import defpackage.ily0;
import defpackage.jly0;
import defpackage.lxv;
import defpackage.npb1;
import defpackage.oly0;
import defpackage.pzt0;
import defpackage.tje;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes10.dex */
public final class c extends atz0 {
    public final void a() {
        ily0 ily0Var;
        if (this.b == ToolbarHandlerState.Uninitialized) {
            lxv.c("ToolbarRequester is not initialized.");
        }
        oly0 oly0Var = this.a;
        if (oly0Var == null || !oly0Var.isAttached()) {
            return;
        }
        pzt0 pzt0Var = oly0Var.z;
        if ((pzt0Var == null || !pzt0Var.isActive()) && (ily0Var = (ily0) npb1.c(oly0Var, jly0.b)) != null) {
            oly0Var.z = tje.N(oly0Var.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new TextContextMenuToolbarHandlerNode$show$1(oly0Var, ily0Var, null), 1);
        }
    }
}
