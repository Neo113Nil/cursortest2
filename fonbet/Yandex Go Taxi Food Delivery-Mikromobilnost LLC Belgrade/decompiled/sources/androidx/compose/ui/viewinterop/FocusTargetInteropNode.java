package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.u;
import defpackage.dr60;
import defpackage.fud;
import defpackage.lqh;
import defpackage.y5y;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class FocusTargetInteropNode extends lqh implements dr60, fud {
    public final androidx.compose.ui.focus.d c;
    public y5y w;

    public FocusTargetInteropNode() {
        androidx.compose.ui.focus.d dVar = new androidx.compose.ui.focus.d(0, 9, new FocusTargetInteropNode$focusTargetNode$1(2, this, FocusTargetInteropNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0));
        E0(dVar);
        this.c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dr60
    public final void e0() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        u.e(this, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, this));
        y5y y5yVar = (y5y) ref$ObjectRef.element;
        if (this.c.J0().b()) {
            y5y y5yVar2 = this.w;
            if (y5yVar2 != null) {
                y5yVar2.b();
            }
            if (y5yVar != null) {
                y5yVar.a();
            } else {
                y5yVar = null;
            }
            this.w = y5yVar;
        }
    }
}
