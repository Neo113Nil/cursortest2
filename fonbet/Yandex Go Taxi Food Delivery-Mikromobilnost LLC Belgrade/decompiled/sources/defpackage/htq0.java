package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public interface htq0 {
    void b(lfx lfxVar, tls tlsVar);

    void c(lfx lfxVar, tls tlsVar);

    void e(lfx lfxVar, lfx lfxVar2, KSerializer kSerializer);

    void f(lfx lfxVar, tls tlsVar);

    default void g(lfx lfxVar, KSerializer kSerializer) {
        f(lfxVar, new m4o(kSerializer, 1));
    }
}
