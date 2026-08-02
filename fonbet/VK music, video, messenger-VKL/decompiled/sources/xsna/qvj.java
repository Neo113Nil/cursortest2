package xsna;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes8.dex */
public final class qvj {
    public static final Collection<pvj> a;

    static {
        try {
            a = rli0.A(dli0.c(Arrays.asList(new g82()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
