package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.bvf0;
import defpackage.nah;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public interface n {
    static Object a(nah nahVar, wls wlsVar, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.Default;
        nahVar.getClass();
        Object n = bvf0.n(new DefaultDraggableState$drag$2(nahVar, mutatePriority, wlsVar, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
