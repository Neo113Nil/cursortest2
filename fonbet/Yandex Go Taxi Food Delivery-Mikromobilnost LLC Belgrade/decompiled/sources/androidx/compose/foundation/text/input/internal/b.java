package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.f;
import defpackage.bvf0;
import defpackage.tx40;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class b {
    public final boolean a;
    public final AtomicReference b = new AtomicReference(null);
    public final tx40 c = f.f(0.0f);

    public b(boolean z) {
        this.a = z;
    }

    public final Object a(Continuation continuation) {
        Object n = bvf0.n(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
