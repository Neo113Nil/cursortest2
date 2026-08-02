package xsna;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.el3;
import xsna.p52;

/* compiled from: AndroidDragAndDropManager.android.kt */
/* loaded from: classes11.dex */
public final class b82 implements View.OnDragListener, kfo {
    public final DragAndDropNode a = new DragAndDropNode(null);
    public final el3<ufo> b = new el3<>(0);
    public final a82 c = new a82(this);

    public b82(p52.h hVar) {
    }

    @Override // xsna.kfo
    public final boolean a(DragAndDropNode dragAndDropNode) {
        return this.b.contains(dragAndDropNode);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        jfo jfoVar = new jfo(dragEvent);
        int action = dragEvent.getAction();
        el3<ufo> el3Var = this.b;
        DragAndDropNode dragAndDropNode = this.a;
        switch (action) {
            case 1:
                dragAndDropNode.getClass();
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                lfo lfoVar = new lfo(jfoVar, dragAndDropNode, ref$BooleanRef);
                if (lfoVar.invoke(dragAndDropNode) == TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
                    hr80.K(dragAndDropNode, lfoVar);
                }
                boolean z = ref$BooleanRef.element;
                el3Var.getClass();
                el3.a aVar = new el3.a();
                while (aVar.hasNext()) {
                    ((ufo) aVar.next()).v0(jfoVar);
                }
                break;
            case 2:
                dragAndDropNode.E0(jfoVar);
                break;
            case 4:
                dragAndDropNode.q0(jfoVar);
                el3Var.clear();
                break;
            case 5:
                dragAndDropNode.P1(jfoVar);
                break;
            case 6:
                dragAndDropNode.S1(jfoVar);
                break;
        }
        return false;
    }
}
