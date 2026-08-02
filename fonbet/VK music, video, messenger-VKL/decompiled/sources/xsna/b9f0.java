package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Channel.kt */
/* loaded from: classes11.dex */
public interface b9f0<E> {
    Object a(spj<? super E> spjVar);

    void b(CancellationException cancellationException);

    a7i0 e();

    a7i0 g();

    o0b<E> iterator();

    Object l();

    Object u(SuspendLambda suspendLambda);
}
