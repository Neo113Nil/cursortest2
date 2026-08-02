package androidx.compose.ui.node;

import defpackage.j390;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/s;", "coordinator", "Lzy11;", "invoke", "(Landroidx/compose/ui/node/s;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayer$1 extends Lambda implements tls {
    public static final NodeCoordinator$Companion$onCommitAffectingLayer$1 w = new NodeCoordinator$Companion$onCommitAffectingLayer$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        j390 j390Var = ((s) obj).h0;
        if (j390Var != null) {
            j390Var.invalidate();
        }
        return zy11.a;
    }
}
