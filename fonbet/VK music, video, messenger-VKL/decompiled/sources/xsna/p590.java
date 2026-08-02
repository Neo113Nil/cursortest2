package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;

/* compiled from: OwnerSnapshotObserver.kt */
/* loaded from: classes11.dex */
public final class p590 extends Lambda implements izs<LayoutNode, s3q0> {
    public static final p590 i = new p590(1);

    @Override // xsna.izs
    public final s3q0 invoke(LayoutNode layoutNode) {
        LayoutNode layoutNode2 = layoutNode;
        if (layoutNode2.e()) {
            layoutNode2.c0(false);
        }
        return s3q0.a;
    }
}
