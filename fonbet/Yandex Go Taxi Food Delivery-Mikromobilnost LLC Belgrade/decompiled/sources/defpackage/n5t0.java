package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;

/* loaded from: classes15.dex */
public interface n5t0 {
    x08 a(o5t0 o5t0Var, t1k0 t1k0Var);

    void c();

    void close();

    void d(ClientMessage clientMessage);

    void e();

    default x08 f(o5t0 o5t0Var) {
        return a(o5t0Var, new hfy());
    }

    String getProviderName();
}
