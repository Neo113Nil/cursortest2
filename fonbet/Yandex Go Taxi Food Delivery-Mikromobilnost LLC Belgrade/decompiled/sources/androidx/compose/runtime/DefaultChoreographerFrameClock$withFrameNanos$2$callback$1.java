package androidx.compose.runtime;

import android.view.Choreographer;
import defpackage.i18;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DefaultChoreographerFrameClock$withFrameNanos$2$callback$1 implements Choreographer.FrameCallback {
    final /* synthetic */ i18 $co;
    final /* synthetic */ tls $onFrame;

    public DefaultChoreographerFrameClock$withFrameNanos$2$callback$1(i18 i18Var, tls tlsVar) {
        this.$co = i18Var;
        this.$onFrame = tlsVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object failure;
        i18 i18Var = this.$co;
        int i = b.a;
        try {
            failure = this.$onFrame.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        i18Var.resumeWith(failure);
    }
}
