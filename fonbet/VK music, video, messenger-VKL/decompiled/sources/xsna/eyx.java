package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Job.kt */
/* loaded from: classes11.dex */
public interface eyx extends d.b {

    /* compiled from: Job.kt */
    public static final class a implements d.c<eyx> {
        public static final /* synthetic */ a b = new a();
    }

    ogn E(izs<? super Throwable, s3q0> izsVar);

    CancellationException I();

    void b(CancellationException cancellationException);

    ogn c(boolean z, boolean z2, ic1 ic1Var);

    r9c i(pyx pyxVar);

    boolean isActive();

    boolean isCancelled();

    boolean m();

    uki0<eyx> n();

    boolean start();

    Object y(ContinuationImpl continuationImpl);
}
