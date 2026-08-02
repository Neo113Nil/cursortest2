package androidx.compose.ui.node;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class LayoutNode$_foldedChildren$1 extends Lambda implements sls {
    final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$_foldedChildren$1(LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNode;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        j jVar = this.this$0.b0;
        jVar.p.T = true;
        l lVar = jVar.q;
        if (lVar != null) {
            lVar.W0();
        }
        return zy11.a;
    }
}
