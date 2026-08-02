package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.u;
import defpackage.ivr;
import defpackage.wls;
import defpackage.y5y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends FunctionReferenceImpl implements wls {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean b;
        ivr ivrVar = (ivr) obj;
        ivr ivrVar2 = (ivr) obj2;
        FocusTargetInteropNode focusTargetInteropNode = (FocusTargetInteropNode) this.receiver;
        if (focusTargetInteropNode.isAttached() && (b = ((FocusStateImpl) ivrVar2).b()) != ((FocusStateImpl) ivrVar).b()) {
            y5y y5yVar = null;
            if (b) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                u.e(focusTargetInteropNode, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, focusTargetInteropNode));
                y5y y5yVar2 = (y5y) ref$ObjectRef.element;
                if (y5yVar2 != null) {
                    y5yVar2.a();
                    y5yVar = y5yVar2;
                }
                focusTargetInteropNode.w = y5yVar;
            } else {
                y5y y5yVar3 = focusTargetInteropNode.w;
                if (y5yVar3 != null) {
                    y5yVar3.b();
                }
                focusTargetInteropNode.w = null;
            }
        }
        return zy11.a;
    }
}
