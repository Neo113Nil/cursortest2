package xsna;

import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: DragAndDropNode.kt */
/* loaded from: classes11.dex */
public final class lfo extends Lambda implements izs<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction> {
    final /* synthetic */ Ref$BooleanRef $handled;
    final /* synthetic */ jfo $startEvent;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfo(jfo jfoVar, DragAndDropNode dragAndDropNode, Ref$BooleanRef ref$BooleanRef) {
        super(1);
        this.$startEvent = jfoVar;
        this.this$0 = dragAndDropNode;
        this.$handled = ref$BooleanRef;
    }

    @Override // xsna.izs
    public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        DragAndDropNode dragAndDropNode2 = dragAndDropNode;
        if (!dragAndDropNode2.o) {
            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        if (dragAndDropNode2.r != null) {
            uzw.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        dragAndDropNode2.r = null;
        Ref$BooleanRef ref$BooleanRef = this.$handled;
        ref$BooleanRef.element = ref$BooleanRef.element;
        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
    }
}
