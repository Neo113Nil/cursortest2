package androidx.compose.ui.node;

import defpackage.d530;
import defpackage.qje;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "Lzy11;", "invoke", "(Landroidx/compose/ui/node/b;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class BackwardsCompatNodeKt$updateModifierLocalConsumer$1 extends Lambda implements tls {
    public static final BackwardsCompatNodeKt$updateModifierLocalConsumer$1 w = new BackwardsCompatNodeKt$updateModifierLocalConsumer$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        final b bVar = (b) obj;
        if (bVar.isAttached()) {
            bVar.b.clear();
            w snapshotObserver = qje.Q(bVar).getSnapshotObserver();
            tls tlsVar = c.a;
            snapshotObserver.a.c(bVar, w, new sls() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    d530 d530Var = b.this.a;
                    throw new ClassCastException();
                }
            });
        }
        return zy11.a;
    }
}
