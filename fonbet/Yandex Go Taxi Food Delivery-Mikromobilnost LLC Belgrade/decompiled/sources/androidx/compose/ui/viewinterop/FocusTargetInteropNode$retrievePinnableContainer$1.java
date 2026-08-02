package androidx.compose.ui.viewinterop;

import androidx.compose.ui.layout.n;
import defpackage.npb1;
import defpackage.sls;
import defpackage.y5y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class FocusTargetInteropNode$retrievePinnableContainer$1 extends Lambda implements sls {
    final /* synthetic */ Ref$ObjectRef<y5y> $container;
    final /* synthetic */ FocusTargetInteropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetInteropNode$retrievePinnableContainer$1(Ref$ObjectRef ref$ObjectRef, FocusTargetInteropNode focusTargetInteropNode) {
        super(0);
        this.$container = ref$ObjectRef;
        this.this$0 = focusTargetInteropNode;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // defpackage.sls
    public final Object invoke() {
        this.$container.element = npb1.c(this.this$0, n.a);
        return zy11.a;
    }
}
