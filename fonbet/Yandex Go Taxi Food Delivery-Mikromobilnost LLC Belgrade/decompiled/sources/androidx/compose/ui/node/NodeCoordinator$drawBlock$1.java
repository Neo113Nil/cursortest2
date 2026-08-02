package androidx.compose.ui.node;

import defpackage.d1y;
import defpackage.i28;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li28;", "canvas", "Landroidx/compose/ui/graphics/layer/a;", "parentLayer", "Lzy11;", "invoke", "(Li28;Landroidx/compose/ui/graphics/layer/a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class NodeCoordinator$drawBlock$1 extends Lambda implements wls {
    final /* synthetic */ sls $drawBlockCallToDrawModifiers;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(sls slsVar, s sVar) {
        super(2);
        this.this$0 = sVar;
        this.$drawBlockCallToDrawModifiers = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        i28 i28Var = (i28) obj;
        androidx.compose.ui.graphics.layer.a aVar = (androidx.compose.ui.graphics.layer.a) obj2;
        boolean G = this.this$0.I.G();
        s sVar = this.this$0;
        if (G) {
            sVar.d0 = i28Var;
            sVar.c0 = aVar;
            w snapshotObserver = d1y.a(sVar.I).getSnapshotObserver();
            s sVar2 = this.this$0;
            tls tlsVar = s.j0;
            snapshotObserver.a.c(sVar2, NodeCoordinator$Companion$onCommitAffectingLayer$1.w, this.$drawBlockCallToDrawModifiers);
            this.this$0.g0 = false;
        } else {
            sVar.g0 = true;
        }
        return zy11.a;
    }
}
