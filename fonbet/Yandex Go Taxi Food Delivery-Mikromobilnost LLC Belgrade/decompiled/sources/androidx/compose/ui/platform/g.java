package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.cvw;
import defpackage.dse;
import defpackage.dvw;
import defpackage.ese;
import defpackage.ffx;
import defpackage.fse;
import defpackage.i18;
import defpackage.j18;
import defpackage.jl40;
import defpackage.r630;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class g implements r630 {
    public final Choreographer a;
    public final f b;

    public g(Choreographer choreographer, f fVar) {
        this.a = choreographer;
        this.b = fVar;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }

    @Override // defpackage.r630
    public final Object v(final tls tlsVar, Continuation continuation) {
        final f fVar = this.b;
        final j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object failure;
                i18 i18Var = i18.this;
                try {
                    failure = tlsVar.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                i18Var.resumeWith(failure);
            }
        };
        if (jl40.l(fVar.b, this.a)) {
            synchronized (fVar.w) {
                fVar.y.add(frameCallback);
                if (!fVar.B) {
                    fVar.B = true;
                    fVar.b.postFrameCallback(fVar.C);
                }
            }
            j18Var.w(new tls() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    f fVar2 = f.this;
                    Choreographer.FrameCallback frameCallback2 = frameCallback;
                    synchronized (fVar2.w) {
                        fVar2.y.remove(frameCallback2);
                    }
                    return zy11.a;
                }
            });
        } else {
            this.a.postFrameCallback(frameCallback);
            j18Var.w(new tls() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    g.this.a.removeFrameCallback(frameCallback);
                    return zy11.a;
                }
            });
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
