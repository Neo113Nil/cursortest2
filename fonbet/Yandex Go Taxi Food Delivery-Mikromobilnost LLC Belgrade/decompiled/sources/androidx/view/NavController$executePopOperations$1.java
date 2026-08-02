package androidx.view;

import defpackage.tls;
import defpackage.x43;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/b;", "entry", "Lzy11;", "invoke", "(Landroidx/navigation/b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class NavController$executePopOperations$1 extends Lambda implements tls {
    final /* synthetic */ Ref$BooleanRef $popped;
    final /* synthetic */ Ref$BooleanRef $receivedPop;
    final /* synthetic */ boolean $saveState;
    final /* synthetic */ x43 $savedState;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$1(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, d dVar, boolean z, x43 x43Var) {
        super(1);
        this.$receivedPop = ref$BooleanRef;
        this.$popped = ref$BooleanRef2;
        this.this$0 = dVar;
        this.$saveState = z;
        this.$savedState = x43Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.$receivedPop.element = true;
        this.$popped.element = true;
        this.this$0.n((b) obj, this.$saveState, this.$savedState);
        return zy11.a;
    }
}
