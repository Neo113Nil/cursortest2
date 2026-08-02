package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import defpackage.g8m;
import defpackage.l8m;
import defpackage.nl91;
import defpackage.tls;
import defpackage.u8m;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll8m;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Ll8m;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class DragAndDropNode$onEnded$1 extends Lambda implements tls {
    final /* synthetic */ g8m $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(g8m g8mVar) {
        super(1);
        this.$event = g8mVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        l8m l8mVar = (l8m) obj;
        if (!l8mVar.getNode().isAttached()) {
            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        u8m u8mVar = l8mVar.c;
        if (u8mVar != null) {
            nl91.e((l8m) u8mVar, new DragAndDropNode$onEnded$1(this.$event));
        }
        l8mVar.c = null;
        l8mVar.b = null;
        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
    }
}
