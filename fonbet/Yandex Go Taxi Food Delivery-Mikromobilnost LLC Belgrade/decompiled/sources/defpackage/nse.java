package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import kotlin.sequences.a;
import kotlin.sequences.b;

/* loaded from: classes11.dex */
public abstract class nse {
    public static final Collection a;

    static {
        try {
            a = b.s(a.b(Arrays.asList(new j92()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
