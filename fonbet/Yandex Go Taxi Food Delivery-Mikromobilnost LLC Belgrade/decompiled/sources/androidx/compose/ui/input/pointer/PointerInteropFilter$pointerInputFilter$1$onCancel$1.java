package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lzy11;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends Lambda implements tls {
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        tls tlsVar = this.this$0.a;
        if (tlsVar == null) {
            tlsVar = null;
        }
        tlsVar.invoke(motionEvent);
        return zy11.a;
    }
}
