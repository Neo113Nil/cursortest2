package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {IronSourceError.ERROR_NT_LOAD_NO_FILL}, m = "restartable")
/* loaded from: classes11.dex */
public final class vz1<I> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public vz1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return fto0.b(null, null, this);
    }
}
