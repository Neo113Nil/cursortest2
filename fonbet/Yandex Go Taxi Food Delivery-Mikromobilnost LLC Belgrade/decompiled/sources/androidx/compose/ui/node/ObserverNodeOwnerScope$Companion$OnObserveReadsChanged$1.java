package androidx.compose.ui.node;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/v;", "it", "Lzy11;", "invoke", "(Landroidx/compose/ui/node/v;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 extends Lambda implements tls {
    public static final ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 w = new ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        v vVar = (v) obj;
        if (vVar.isValidOwnerScope()) {
            vVar.a.e0();
        }
        return zy11.a;
    }
}
