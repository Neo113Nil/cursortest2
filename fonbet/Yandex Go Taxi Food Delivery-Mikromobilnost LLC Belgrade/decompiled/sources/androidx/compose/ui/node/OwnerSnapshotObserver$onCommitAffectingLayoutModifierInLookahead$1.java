package androidx.compose.ui.node;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lzy11;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1 extends Lambda implements tls {
    public static final OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1 w = new OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        LayoutNode layoutNode = (LayoutNode) obj;
        if (layoutNode.F()) {
            layoutNode.Q(false);
        }
        return zy11.a;
    }
}
