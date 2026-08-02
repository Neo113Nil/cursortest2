package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public interface l8x extends dse {
    m1k D(tls tlsVar, boolean z, boolean z2);

    CancellationException I();

    void a(CancellationException cancellationException);

    hpb b0(c cVar);

    qrq0 getChildren();

    boolean isActive();

    boolean isCancelled();

    boolean k0();

    boolean start();

    Object u0(Continuation continuation);

    m1k w(tls tlsVar);
}
