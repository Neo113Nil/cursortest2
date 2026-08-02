package androidx.compose.ui.node;

import defpackage.ixv;
import defpackage.ohd;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lohd;", "Lzy11;", "invoke", "(Lohd;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 extends Lambda implements tls {
    public static final ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 w = new ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ohd ohdVar = (ohd) obj;
        LayoutNode layoutNode = ohdVar instanceof LayoutNode ? (LayoutNode) ohdVar : null;
        if (layoutNode != null && layoutNode.l0) {
            ixv.b("Apply is called on deactivated node " + ohdVar);
        }
        return zy11.a;
    }
}
